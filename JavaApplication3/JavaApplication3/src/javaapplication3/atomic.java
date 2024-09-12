/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Erwin
 */
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class atomic extends javax.swing.JFrame {
  String[] elements = {"Beryllium", "Rubidium", "Vanadium", "Phosphorus", "Chlorine",
                        "Argon", "Sulfur", "Aluminum", "Manganese", "Niobium"};
    String[] atomicNumbers = {"4", "37", "23", "15", "17", "18", "16", "13",
                              "25", "41"};
    List<String> usedNumber = new ArrayList<>();
    Random random = new Random();
    int totalGuesses = 10;
    int correctGuesses = 0;
    int wrongGuesses = 0;
    int currentGuess = 0;
    String currentElement = "";
    
    
    public atomic() {
         initComponents();
        nextGuess();
        setLocationRelativeTo(null); // Frame in the center
         setBackgroundImage("C:\\Users\\Erwin\\Downloads\\50.png");
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Erwin\\Downloads\\logo.png"));
     Restart.setVisible(false);//para dina makita ang restart pagtapos ng pindotin  
    }
 private void setBackgroundImage(String imagePath) {
        ImageIcon backgroundImg = new ImageIcon(imagePath);
        JLabel background = new JLabel(backgroundImg);
        background.setBounds(0, 0, getWidth(), getHeight()); // Set size to match JFrame

        // Set layout to null to allow absolute positioning of components
        getContentPane().setLayout(null);

        // Add background label to the content pane
        getContentPane().add(background);

        // Set the transparency of components
        jLabel1.setOpaque(false);
        jLabel2.setOpaque(false);
        jLabel3.setOpaque(false);
        jLabel4.setOpaque(false);

        // Set the background of buttons to opaque
        jButton1.setOpaque(false);
        jButton2.setOpaque(false);
        jTextField1.setOpaque(false);
        
        //back button
         jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        
         jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
         
    }
    
   private void nextGuess() {
        if (currentGuess < totalGuesses) {
            int index;
            do {
                index = random.nextInt(elements.length);
            } while (usedNumber.contains(elements[index]));

            usedNumber.add(elements[index]);
            currentElement = elements[index];

            char[] shuffledWord = new char[currentElement.length()];
            for (int i = 0; i < shuffledWord.length; i++) {
                shuffledWord[i] = '_';
            }

            List<Integer> hintPositions = new ArrayList<>();
            while (hintPositions.size() < 2) {
                int position = random.nextInt(currentElement.length());
                if (!hintPositions.contains(position)) {
                    hintPositions.add(position);
                }
            }

            for (int hintPosition : hintPositions) {
                shuffledWord[hintPosition] = currentElement.charAt(hintPosition);
            }

            StringBuilder wordWithSpaces = new StringBuilder();
            for (char c : shuffledWord) {
                wordWithSpaces.append(c).append(" ");
            }

            jLabel1.setText( atomicNumbers[index]);
            jLabel2.setText( wordWithSpaces.toString());
            jLabel3.setText("Score: " + correctGuesses + "/" + totalGuesses);
            jTextField1.setText("");
            currentGuess++;
        }  else {
        // All guesses have been made
        totalGuesses = 10; // Reset total guesses for the next game
        JOptionPane.showMessageDialog(this, "Total Score: " + correctGuesses + "/" + totalGuesses);
        jLabel3.setText("Score: " + correctGuesses + "/" + totalGuesses);
        Restart.setVisible(true); // Make the Restart button visible
    }
    }


    private void checkGuess(String userGuess) {
        userGuess = userGuess.trim(); // Trim whitespace
        if (userGuess.equalsIgnoreCase(currentElement)) {
            JOptionPane.showMessageDialog(this, "Correct");
            correctGuesses++;
        } else {
            JOptionPane.showMessageDialog(this, "The word was: " + currentElement);
            wrongGuesses++;
        }
        nextGuess();
    }

    
    //back button
     private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        jButton1.setBackground(Color.red);
    }                                 

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        jButton1.setBackground(Color.LIGHT_GRAY);
        
    }
    
    //jButton2
     private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        jButton2.setBackground(Color.green);
    }                                 

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        jButton2.setBackground(Color.LIGHT_GRAY);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Restart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Guess the Atomic Number");

        Restart.setText("Restart");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Restart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(243, 243, 243))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Restart)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        textatomic textatomic = new textatomic();
        textatomic.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String userGuess = jTextField1.getText().trim();
        if (!userGuess.isEmpty()) {
            checkGuess(userGuess);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter your guess.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        // TODO add your handling code here:

        jButton2.setEnabled(true);
        currentGuess = 0;
        usedNumber.clear();
        correctGuesses = 0;
        wrongGuesses = 0;
        nextGuess();
        Restart.setVisible(false);
    }//GEN-LAST:event_RestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(atomic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atomic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atomic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atomic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atomic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Restart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
