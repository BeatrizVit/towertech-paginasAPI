import psutil
import time
from functools import reduce
from connectdb import *

print('='*10,'INÍCIO DAS MEDIÇÕES','='*10)
print('-'*10,'Ctrl+C para parar','-'*10,'\n')

def flush(sent,count, sentCpu, sentDisco):
    print('\nReadings:',count)
    b = round((reduce((lambda x,y:x+y),sent)/len(sent)),2)
    c = round((reduce((lambda x,y:x+y),sentCpu)/len(sentCpu)),2)
    d = round((reduce((lambda x,y:x+y),sentDisco)/len(sentDisco)),2)
    print('Avg bytes sent:',b,'MB')
    insert_db(b, c, d)

try:
    count = 1
    sent = []
    sentCpu= []
    sentDisco = []
    while True:
        cpu = psutil.cpu_percent(interval=1)
        mem_used = (psutil.virtual_memory().used)/1000000
        disco = psutil.disk_usage('C:/').percent
        data_hora = time.strftime("%Y-%m-%d %H:%M:%S",time.localtime())
        sent.append(float('{0:.2f}'.format(mem_used)))     
        sentCpu.append(float(cpu))
        sentDisco.append(float(disco)) 
        print("mem_used:",float('{0:.2f}'.format(mem_used)),"| date:",data_hora)
        print(cpu, disco)
        time.sleep(2)
        if(count == 5):
            flush(sent,count, sentCpu, sentDisco)
            count = 1
        count = count + 1
except KeyboardInterrupt:
    pass

flush(sent,count, sentCpu, sentDisco)


