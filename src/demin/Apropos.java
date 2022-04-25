package demin;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;


public class Apropos extends JDialog implements ActionListener {
  private JPanel panel = new JPanel();
  private GridBagLayout gridBagLayout = new GridBagLayout();
  private JLabel titre = new JLabel();
  private JLabel moi = new JLabel();
  private JLabel regleJeu = new JLabel();
  private JButton fermer = new JButton();
  private JLabel vide2 = new JLabel();
  private Border border1;
  private JLabel vide1 = new JLabel();

  public Apropos(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    try {
      jbInit();
      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public Apropos() {
    this(null, "", false);
  }
  private void jbInit() throws Exception {
    border1 = BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,SystemColor.info,SystemColor.info,new Color(109, 109, 109),new Color(156, 156, 156)),BorderFactory.createEmptyBorder(0,10,0,10));
    panel.setLayout(gridBagLayout);
    titre.setFont(new java.awt.Font("Serif", 1, 20));
    titre.setForeground(SystemColor.info);
    titre.setBorder(border1);
    titre.setPreferredSize(new Dimension(131, 50));
    titre.setText("DEMINEUR");
    moi.setForeground(Color.white);
    moi.setPreferredSize(new Dimension(190, 17));
    moi.setText("Regles du jeu");
    regleJeu.setFont(new java.awt.Font("Dialog", 0, 12));
    regleJeu.setForeground(Color.white);
    regleJeu.setPreferredSize(new Dimension(380, 17));
    regleJeu.setText("Le jeu commence avec une grille remplie de cases couvertes. Certaines des cases cachent des mines. Le joueur doit découvrir les cases qui ne recouvrent pas de mines, et placer un drapeau sur celles qui en recouvrent.\r\n" + 
    		"Si le joueur découvre une case cachant une mine, la partie est perdue.\r\n" + 
    		"Si le joueur edécouvre une case vide, un chiffre correspondant au nombre de mines présentes sous les huit cases adjacentes apparait.\r\n" + 
    		"Le rôle du joueur est de déduire à partir de ses chiffres où se trouvent les mines.\r\n" + 
    		"Le but du jeu est de trouver toutes les  mines en decouvrant toutes les cases vides.");
    panel.setBackground(SystemColor.activeCaption);
    fermer.setFont(new java.awt.Font("Dialog", 0, 10));
    fermer.setFocusPainted(false);
    fermer.setMnemonic('F');
    fermer.setText("Fermer");
    fermer.addActionListener(this);
    vide2.setPreferredSize(new Dimension(400, 50));
    vide1.setPreferredSize(new Dimension(400, 50));
    getContentPane().add(panel);
    panel.add(titre,     new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 0, 0, 0), 0, 0));
    panel.add(moi,      new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    panel.add(regleJeu,    new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    panel.add(fermer,       new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0
            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 5, 5), 0, 0));
    panel.add(vide2,   new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    panel.add(vide1,  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
  }
  public void actionPerformed(ActionEvent e) {
    this.setVisible(false);
  }
}