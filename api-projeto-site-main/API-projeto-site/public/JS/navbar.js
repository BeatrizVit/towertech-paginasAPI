var fechado = true;

function abrirMenu(){
    if (fechado == true) {  
        iconMenu.src = "../imagens/icone_menu_fechado.png";        
        document.querySelector('.menu_aberto').style.display = "block";
        fechado = false;
    } else {
        iconMenu.src = "../imagens/icone_menu.png"; 
        document.querySelector('.menu_aberto').style.display = "none";
        fechado = true;
    }
}

