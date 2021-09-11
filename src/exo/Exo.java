/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author ThinkPad
 */
public class Exo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame Mafenetre = new JFrame("Exo2");//Declaration de de fenetre portant le nom sous "Exo2"
        Mafenetre.setSize(500, 350);//Parametre de dimmension de x:1200px et y:7500px
        JPanel panel = new JPanel();///Création de nouveau panel 
        Mafenetre.setContentPane(panel);//Parametre q'il n'etat null
        panel.setLayout(null);
        JMenuBar MyMenuBar = new JMenuBar();//création de bar de menu
        panel.add(MyMenuBar);//addition de panel dans le bar de menu
        MyMenuBar.setBounds(0, 0, 1200, 30);//
        JMenu MenuFichier = new JMenu("Fichier");//Déclaration de Mainmenu "Fichier" 
        MyMenuBar.add(MenuFichier);//insertion de Fichier dans le barre de menu
        JMenuItem MonExo2 = new JMenuItem("Ajout de chaffeur");//Déclaration de pop-menu "Ajout chaffeur"
        MenuFichier.add(MonExo2);//insertion de ajout chaffeur
        JMenu MonConsultation = new JMenu("Consultation");//Déclaration de pop-menu "Consultation"
        MyMenuBar.add(MonConsultation);//insertion de Consultation"
        
        //JLabel label new= JLabel("Nom");
        
        Mafenetre.setVisible(true);
        
        //Insertion de pop-menu dans le menu Consultation
       // JMenuItem MenumaFilm = new JMenuItem("Ajout");
        //MenuConsultation.add(MenumaFilm);
        //JMenuItem MenumaClien = new JMenuItem("Client");
        //MenuConsultation.add(MenumaClien);
        //Insertion de pop-menu dans le menu Statistique
        //JMenuItem MenuChiffre = new JMenuItem("Genre");
        //MenuStatistique.add(MenuChiffre);
        //Insertion de pop-menu dans le menu ?
        //JMenuItem MenuAid = new JMenuItem("Aide");
        //MenuAide.add(MenuAid);
        //JMenuItem Menupropos = new JMenuItem("A Propos");
        //MenuAide.add(Menupropos);
        //Ouvrir fenêtre Ajout nouveau 
        
        //Ouvrir fenêtre Editer Film
        //Ouvrir fenêtre Editer Client
        //Ouvrir fenêtre Editer Sécurité
        //Ouvrir fenêtre Consultation Film
        //Ouvrir fenêtre Consultation 
        //Ouvrir Aide
        //Ouvrir A propos
        //tester la connexion aux bases des donnees
       // Connection conn =  Connexion.getConn();
        //if (conn != null) {
          //  System.out.println("CONNEXION AVEC SUCCES");
       // } else {
         //   System.err.println("ERREUR DU CONNEXION");

        //}

        //Quitter la fenêtre principal
        //MenuQuitter.addActionListener(new ActionListener() {
         //   public void actionPerformed(ActionEvent e) {
                //public class BoiteConf{
                //    public staticc void main(String args[]){
                //      JFrame fen=new MaFenetre();
                //      fen.set
                //}
                //}

             //   fen.dispose();
            }
        //});
        // class MaFenetre extends JFrame{
        //     public MaFenetre(){
        //       super("Une Fenetre");setSize(300,200);}
        // }
        // public class BoiteConf{
        //   public static void main(String args[]){
        //     JFrame fen =new MaFenetre();
        //   fen.setVisible(true);
        // JOptionPane.showConfirmDialog(fen,"Voulez-vous continuer ?");
        //}
        //}

    }

}