package Classe;

import Tela.Dialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edsoc
 */
public class DialogGenerator {
    
    public void Dialog(String imagem,String texto){
        Dialog dialog =  new Dialog();
        dialog.recebe(imagem,texto);
    }
    
}
