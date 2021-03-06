import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.event.*;

public class Chats extends JFrame {
  // Anfang Attribute
  
  private JButton bOeffnen = new JButton();
  private JPanel jPanel1 = new JPanel(null, true);
    private JButton bSchliessen = new JButton();
    private JLabel lEinstellungen = new JLabel();
  private JButton bEinstellungen = new JButton();
  
  private JButton bNeuerChat = new JButton();
  
  private JLabel lHerzlichWillkommen = new JLabel();
  // Ende Attribute
  
  public Chats() {
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1280; 
    int frameHeight = 720;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Chats");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
   
    // Anfang Komponenten
    
   
    
    
    jPanel1.setBounds(321, 180, 564, 276);
    jPanel1.setOpaque(false);
    jPanel1.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 4));
    jPanel1.setVisible(false);
    cp.add(jPanel1);
    bSchliessen.setBounds(471, 240, 75, 25);
    bSchliessen.setText("Schlie�en");
    bSchliessen.setMargin(new Insets(2, 2, 2, 2));
    bSchliessen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSchliessen_ActionPerformed(evt);
        jPanel1.setVisible(false);
      }
    });
    jPanel1.add(bSchliessen);
    lEinstellungen.setBounds(13, 10, 124, 25);
    lEinstellungen.setText("Einstellungen");
    lEinstellungen.setFont(new Font("Dialog", Font.BOLD, 18));
    jPanel1.add(lEinstellungen);
    bEinstellungen.setBounds(22, 15, 107, 25);
    bEinstellungen.setText("Einstellungen");
    bEinstellungen.setMargin(new Insets(2, 2, 2, 2));
    bEinstellungen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bEinstellungen_ActionPerformed(evt);
        jPanel1.setVisible(true);
      }
    });
    cp.add(bEinstellungen);
    bNeuerChat.setBounds(20, 60, 107, 25);
    bNeuerChat.setText("Neuer Chat");
    bNeuerChat.setMargin(new Insets(2, 2, 2, 2));
    bNeuerChat.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNeuerChat_ActionPerformed(evt);
        System.out.println("test");
        chat�ffnen();
        
      }
    });
    cp.add(bNeuerChat);
    
    lHerzlichWillkommen.setBounds(50, 60, 207, 28);
    lHerzlichWillkommen.setText("Herzlich Willkommen!");
    lHerzlichWillkommen.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(lHerzlichWillkommen);
    // Ende Komponenten
    setVisible(true);
  }

  // Anfang Methoden
  
  public static void main(String[] args) {
    new Chats();
  } // end of main
      
  public void chat�ffnen() {
    JPanel jPanel = new JPanel(null, true);
    JLabel jTextField1 = new JLabel();
    JButton bNachrichtabsenden = new JButton();
    JButton bChatschliessen = new JButton();
    System.out.println("test2");    
    jPanel.setBounds(271, 78, 772, 556);
    jPanel.setOpaque(false);
    jPanel.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 4));
    jPanel.setVisible(true);
    jTextField1.setBounds(24, 510, 534, 40);
    jPanel.add(jTextField1);
    bNachrichtabsenden.setBounds(574, 509, 163, 40);
    bNachrichtabsenden.setText("Nachricht absenden");
    bNachrichtabsenden.setMargin(new Insets(2, 2, 2, 2));
    bNachrichtabsenden.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        //bNachrichtabsenden_ActionPerformed(evt);
      }
    });
    jPanel.add(bNachrichtabsenden);
    bChatschliessen.setBounds(644, 12, 115, 25);
    bChatschliessen.setText("Chat schlie�en");
    bChatschliessen.setMargin(new Insets(2, 2, 2, 2));
    bChatschliessen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        //bChatschliessen_ActionPerformed(evt);
        //jPanel.setVisible(false);
      }
    });
    jPanel.add(bChatschliessen);
    jPanel.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 4));
         System.out.println("test3");
    
    this.add(jPanel);
  }
  public void bOeffnen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bOeffnen_ActionPerformed

  public void bSchliessen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bSchliessen_ActionPerformed

  public void bEinstellungen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen


  } // end of bEinstellungen_ActionPerformed

  public void bNeuerChat_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bNeuerChat_ActionPerformed

  // Ende Methoden
} // end of class BankOverlay

