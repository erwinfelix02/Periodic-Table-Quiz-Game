/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Lenovo
 */
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class frame_1 extends javax.swing.JFrame {

    /**
     * Creates new form frame_1
     */
    public frame_1() {
        setLocationRelativeTo(null);//frame in the centerz
        initComponents();
       setBackgroundImage("C:\\Users\\Erwin\\Downloads\\3434f58a-de8f-45c6-80a2-15c2d345d493.jpg");
       setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Erwin\\Downloads\\logo.png"));
       
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
        

        // Set the background of buttons to opaque
        Backbutton.setOpaque(false);
        Combination.setOpaque(false);
        Multiple.setOpaque(false);
        PTABLE.setOpaque(false);
        Textinput.setOpaque(false);
         jButton1.setOpaque(false);
         
         
         
         //Back button turns red
         Backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackbuttonMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackbuttonMouseExited(evt);
            }
        });
         
         //Select button turns green
        
        //Combination turns green
        Combination.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            CombinationMouseEntered(evt);
        }
        
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            CombinationMouseExited(evt);
        }
    });
        //Multiple
        Multiple.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            MultipleMouseEntered(evt);
        }
        
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
           MultipleMouseExited(evt);
        }
    });
        //PTABLE
        PTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
           PTABLEMouseEntered(evt);
        }
        
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
           PTABLEMouseExited(evt);
        }
    });
      //Textinput  
      Textinput.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
           TextinputMouseEntered(evt);
        }
        
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
           TextinputMouseExited(evt);
        }
    });
      //jButton1
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
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Multiple = new javax.swing.JButton();
        Combination = new javax.swing.JButton();
        Textinput = new javax.swing.JButton();
        Backbutton = new javax.swing.JButton();
        PTABLE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Multiple.setText("MULTIPLE CHOICE");
        Multiple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Multiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultipleActionPerformed(evt);
            }
        });

        Combination.setText("COMBINATION ELEMENT");
        Combination.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Combination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombinationActionPerformed(evt);
            }
        });

        Textinput.setText("TEXT INPUT");
        Textinput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Textinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextinputActionPerformed(evt);
            }
        });

        Backbutton.setText("Go Back");
        Backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });

        PTABLE.setText("VIEW PERIODIC TABLE");
        PTABLE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PTABLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTABLEActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("How To Play?");

        jButton1.setText("Fun Fact");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Backbutton)
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Textinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(Combination, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(Multiple, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(PTABLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Backbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Textinput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Multiple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Combination)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PTABLE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultipleActionPerformed
        // TODO add your handling code here:
        howmultiple howmultiple = new howmultiple();
        howmultiple.setLocationRelativeTo(null); // Center the frame
        howmultiple.setVisible(true);
         this.dispose();  // close the certain frame
    }//GEN-LAST:event_MultipleActionPerformed

    private void CombinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombinationActionPerformed
        // TODO add your handling code here:
         howcombination howcombination = new howcombination();
        howcombination.setLocationRelativeTo(null); // Center the frame
        howcombination.setVisible(true);
         this.dispose(); // close the certain frame
    }//GEN-LAST:event_CombinationActionPerformed

    private void TextinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextinputActionPerformed
        // TODO add your handling code here:
        howtext howtext = new howtext();
        howtext.setLocationRelativeTo(null); // Center the frame
        howtext.setVisible(true);
         this.dispose(); // close the certain frame
    }//GEN-LAST:event_TextinputActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        // TODO add your handling code here:
        this.dispose(); // close the certain frame
        frame_2 frame2 = new frame_2();
        frame2.setLocationRelativeTo(null); // Center the frame
        frame2.setVisible(true);
    }//GEN-LAST:event_BackbuttonActionPerformed

    private void PTABLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTABLEActionPerformed
        // TODO add your handling code here:
        table table = new table();
        table.setLocationRelativeTo(null);//frame in the center
        table.setVisible(true);
        this.dispose();// close the certain frame
    }//GEN-LAST:event_PTABLEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        funfact  funfact = new  funfact();
        funfact.setLocationRelativeTo(null);//frame in the center
        funfact.setVisible(true);
        this.dispose();// close the certain frame
    }//GEN-LAST:event_jButton1ActionPerformed

    
   
    
     //back button 
    private void BackbuttonMouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        Backbutton.setBackground(Color.red);
    }                                 

    private void BackbuttonMouseExited(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        Backbutton.setBackground(Color.LIGHT_GRAY);
        
    }
    
    //Combination button
    private void CombinationMouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        Combination.setBackground(Color.green);
    } 
     
    private void CombinationMouseExited(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        Combination.setBackground(Color.LIGHT_GRAY);
        
    }
    
    //Multiple
     private void MultipleMouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        Multiple.setBackground(Color.green);
    } 
     
    private void MultipleMouseExited(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        Multiple.setBackground(Color.LIGHT_GRAY);
        
    }
    //PTABLE
     private void PTABLEMouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        PTABLE.setBackground(Color.green);
    } 
     
    private void PTABLEMouseExited(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        PTABLE.setBackground(Color.LIGHT_GRAY);
    }
    //Textinput
    private void TextinputMouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
       Textinput.setBackground(Color.green);
    } 
     
    private void TextinputMouseExited(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
       Textinput.setBackground(Color.LIGHT_GRAY);
    }
    //jButton1
     private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
       jButton1.setBackground(Color.green);
    } 
     
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
       jButton1.setBackground(Color.LIGHT_GRAY);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 frame_1 frame1 = new frame_1();
                 frame1.setLocationRelativeTo(null); // Center the frame
                 frame1.setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbutton;
    private javax.swing.JButton Combination;
    private javax.swing.JButton Multiple;
    private javax.swing.JButton PTABLE;
    private javax.swing.JButton Textinput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void disposed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
