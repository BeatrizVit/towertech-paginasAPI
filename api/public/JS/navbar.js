/* Menu do site */
var fechado_site = true;

function abrirMenu(){
    if (fechado_site == true) {  
        iconMenu.src = "../imagens/icone_menu_fechado.png";        
        document.querySelector('.menu_aberto').style.display = "block";
        fechado_site = false;
    } else {
        iconMenu.src = "../imagens/icone_menu.png"; 
        document.querySelector('.menu_aberto').style.display = "none";
        fechado_site = true;
    }
}

/* Menu do sistema */
var fechado_sistema = true;

function abrirMenuSistema(){
    if (fechado_sistema == true) {  
        iconMenu.src = "../imagens/icone_menu_fechado.png";        
        document.querySelector('.menu_aberto').style.display = "block";
        fechado_sistema = false;
    } else {
        iconMenu.src = "../imagens/icone_menu.png"; 
        document.querySelector('.menu_aberto').style.display = "none";
        fechado_sistema = true;
    }
}
