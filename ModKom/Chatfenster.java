import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.03.2020
 * @author 
 */

public class Chatfenster extends JFrame {
  // Anfang Attribute
  
  private JPanel jPanel = new JPanel(null, true);
    private JTextField jTextField1 = new JTextField();
    private JButton bNachrichtabsenden = new JButton();
    private JButton bChatschliessen = new JButton();
  // Ende Attribute
  
  public Chatfenster(int xPos, int yPos, int xSize, int ySize) { 
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
    setTitle("Chatfenster");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    
   
    jPanel.setBounds(xPos, yPos, xSize, ySize);
    jPanel.setOpaque(false);
    jPanel.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 4));
    jPanel.setVisible(true);
    cp.add(jPanel);
    jTextField1.setBounds(24, 510, 534, 40);
    jPanel.add(jTextField1);
    bNachrichtabsenden.setBounds(574, 509, 163, 40);
    bNachrichtabsenden.setText("Nachricht absenden");
    bNachrichtabsenden.setMargin(new Insets(2, 2, 2, 2));
    bNachrichtabsenden.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNachrichtabsenden_ActionPerformed(evt);
      }
    });
    jPanel.add(bNachrichtabsenden);
    bChatschliessen.setBounds(644, 12, 115, 25);
    bChatschliessen.setText("Chat schlie�en");
    bChatschliessen.setMargin(new Insets(2, 2, 2, 2));
    bChatschliessen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bChatschliessen_ActionPerformed(evt);
        jPanel.setVisible(false);
      }
    });
    jPanel.add(bChatschliessen);
    jPanel.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 4));
    jPanel1.setBounds(271, 86, 772, 556);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public BankOverlay
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Chatfenster(271, 78, 772, 556);
  } // end of main
  
  public void bNachrichtabsenden_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bNachrichtabsenden_ActionPerformed

  public void bChatschliessen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bChatschliessen_ActionPerformed

  // Ende Methoden
} // end of class BankOverlay

