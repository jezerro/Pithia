package com.mycompany.pithia;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Main extends javax.swing.JFrame {

    Functions func = new Functions();
    Random rd = new Random(); //tyxaio id
    
    public Main() {        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //allazei tin emfanisi tou programmatos (den peirazoume)
        initComponents();                   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fullName = new javax.swing.JTextField();
        loginSpecialty = new javax.swing.JComboBox<>();
        registerPassword = new javax.swing.JTextField();
        registerUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginUsername = new javax.swing.JTextField();
        loginPassword = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        registerSpecialty = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pithia");

        register.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        register.setText("Εγγραφή");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabel1.setText("Εγγραφή");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        fullName.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        fullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullName.setText("Πλήρες Όνομα");
        fullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullNameMouseClicked(evt);
            }
        });

        loginSpecialty.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        loginSpecialty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students", "Professors", "Management" }));

        registerPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        registerPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        registerPassword.setText("Password");
        registerPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerPasswordMouseClicked(evt);
            }
        });

        registerUsername.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        registerUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        registerUsername.setText("Username");
        registerUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerUsernameMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabel2.setText("Σύνδεση");

        loginUsername.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        loginUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginUsername.setText("Username");
        loginUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginUsernameMouseClicked(evt);
            }
        });

        loginPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        loginPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginPassword.setText("Password");
        loginPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPasswordMouseClicked(evt);
            }
        });

        login.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        login.setText("Σύνδεση");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        jLabel3.setText("Πυθία - ΔΙ.ΠΑ.Ε.");

        email.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setText("Email");
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });

        registerSpecialty.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        registerSpecialty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students", "Professors", "Management" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fullName)
                        .addComponent(registerPassword)
                        .addComponent(registerUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registerSpecialty, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)))
                .addGap(196, 196, 196)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginSpecialty, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2)))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(462, 462, 462))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerSpecialty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(loginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginSpecialty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        if(email.getText().equals("Email")){
            email.setText("");
        }
    }//GEN-LAST:event_emailMouseClicked

    private void loginPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPasswordMouseClicked
        if(loginPassword.getText().equals("Password")){
            loginPassword.setText("");
        }
    }//GEN-LAST:event_loginPasswordMouseClicked

    private void loginUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUsernameMouseClicked
        if(loginUsername.getText().equals("Username")){
            loginUsername.setText("");
        }
    }//GEN-LAST:event_loginUsernameMouseClicked

    private void registerUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerUsernameMouseClicked
        if(registerUsername.getText().equals("Username")){
            registerUsername.setText("");
        }
    }//GEN-LAST:event_registerUsernameMouseClicked

    private void registerPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerPasswordMouseClicked
        if(registerPassword.getText().equals("Password")){
            registerPassword.setText("");
        }
    }//GEN-LAST:event_registerPasswordMouseClicked

    private void fullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullNameMouseClicked
        if(fullName.getText().equals("Πλήρες Όνομα")){
            fullName.setText("");
        }
    }//GEN-LAST:event_fullNameMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        
        //an den exeis simplirwsei ola ta pedia se kanei spam
        if(fullName.getText().isEmpty() || email.getText().isEmpty() || registerUsername.getText().isEmpty() || registerPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Παρακαλούμε συμπληρώστε όλα τα πεδία", "Προσοχή", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            register.setEnabled(false);            
            
            if(func.checkIfExists(registerSpecialty.getSelectedItem().toString(), "email", email.getText())){
                JOptionPane.showMessageDialog(null, "Το email χρησιμοποιείται ήδη", "Προσοχή", JOptionPane.INFORMATION_MESSAGE);
                register.setEnabled(true);
                return;
            }
            
            //Username check -------------------------------------------------------------------------------------------------
            
            if(func.checkIfExists(registerSpecialty.getSelectedItem().toString(), "username", email.getText())){
                JOptionPane.showMessageDialog(null, "Το username χρησιμοποιείται ήδη", "Προσοχή", JOptionPane.INFORMATION_MESSAGE);
                register.setEnabled(true);
                return;
            }
                        
            //Proceed to registration -------------------------------------------------------------------------------------------------
            
            BasicDBObject person = new BasicDBObject("id", rd.nextInt()).append("fullName", fullName.getText()).append("email", email.getText()).append("username", registerUsername.getText()).append("password", registerPassword.getText());
            
            //otan dialegeis ti eisai sthn egrafi kollaei tis 2 katw times an eisai fititis
            if(registerSpecialty.getSelectedItem().toString().equals("Students")){

                person.append("currentSemester", "Εξάμηνο Α");
                person.append("registrationYear", Calendar.getInstance().get(Calendar.YEAR));

                func.cursor = func.getValues("Courses", "semester", "Εξάμηνο Α");
                List<DBObject> courses = func.cursor.toArray();
                
                BasicDBObject statement = new BasicDBObject("student", email).append("date", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

                for(int i = 0; i < courses.size(); i++){
                    statement.append("course" + i, courses.get(i).get("name").toString());
                    statement.append("course" + i + "ID", courses.get(i).get("id").toString());
                }

                func.collection.insert(statement);
                
            }
            
            //to onoma sto combo box einai kai to onoma tou pinaka
            func.collection = func.db.getCollection(registerSpecialty.getSelectedItem().toString());
            func.collection.insert(person);
            
            //analogos ti eisai sou anoigei parathiro
            if(registerSpecialty.getSelectedItem().toString().equals("Students")){
                new Students(email.getText(), fullName.getText(), registerUsername.getText(), registerPassword.getText()).setVisible(true); //anoigei parathiro
            }else if(registerSpecialty.getSelectedItem().toString().equals("Professors")){
                new Professors(email.getText(), fullName.getText(), registerUsername.getText(), registerPassword.getText()).setVisible(true);
            }else if(registerSpecialty.getSelectedItem().toString().equals("Management")){
                new Management(email.getText(), fullName.getText(), registerUsername.getText(), registerPassword.getText()).setVisible(true);
            }
            
            this.dispose(); //kleinei parathiro
            
        }
        
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        if(loginUsername.getText().isEmpty() || loginPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Παρακαλούμε συμπληρώστε όλα τα πεδία", "Προσοχή", JOptionPane.INFORMATION_MESSAGE);
        }else{

            if(func.checkIfExists(loginSpecialty.getSelectedItem().toString(), "username", loginUsername.getText())){
                
                if(loginPassword.getText().equals(func.getValue(loginSpecialty.getSelectedItem().toString(), "password", loginUsername.getText()))){
                    
                    if(loginSpecialty.getSelectedItem().toString().equals("Students")){
                        new Students(func.cursor.next().get("email").toString(), func.cursor.next().get("fullName").toString(), func.cursor.next().get("username").toString(), func.cursor.next().get("password").toString()).setVisible(true);
                    }else if(loginSpecialty.getSelectedItem().toString().equals("Professors")){
                        new Professors(func.cursor.next().get("email").toString(), func.cursor.next().get("fullName").toString(), func.cursor.next().get("username").toString(), func.cursor.next().get("password").toString()).setVisible(true);
                    }else if(loginSpecialty.getSelectedItem().toString().equals("Management")){
                        new Management(func.cursor.next().get("email").toString(), func.cursor.next().get("fullName").toString(), func.cursor.next().get("username").toString(), func.cursor.next().get("password").toString()).setVisible(true);
                    }
                    
                    this.dispose();                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Λάθος κωδικός", "Προσοχή", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Το username δε βρέθηκε", "Προσοχή", JOptionPane.INFORMATION_MESSAGE);
            }
        
        }
        
    }//GEN-LAST:event_loginActionPerformed
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login;
    private javax.swing.JTextField loginPassword;
    private javax.swing.JComboBox<String> loginSpecialty;
    private javax.swing.JTextField loginUsername;
    private javax.swing.JButton register;
    private javax.swing.JTextField registerPassword;
    private javax.swing.JComboBox<String> registerSpecialty;
    private javax.swing.JTextField registerUsername;
    // End of variables declaration//GEN-END:variables
}
