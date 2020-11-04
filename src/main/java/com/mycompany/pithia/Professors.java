package com.mycompany.pithia;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.UIManager;

public class Professors extends javax.swing.JFrame {

    String email, fullName, username, password;
    Functions func = new Functions();

    DefaultListModel coursesModel, studentsModel = new DefaultListModel();    
    List<DBObject> courses, students, grades;
            
    
    public Professors(String emailx, String fullNamex, String usernamex, String passwordx) {
        
        email = emailx;
        fullName = fullNamex;
        username = usernamex;
        password = passwordx;
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
        
        professorName.setText(fullName);
        
        loadCourses();        
        loadStudents(courses.get(0).get("name").toString());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        professorName = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        coursesList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        finalGrade = new javax.swing.JTextField();
        theoryGrade = new javax.swing.JTextField();
        labGrade = new javax.swing.JTextField();
        tasksGrade = new javax.swing.JTextField();
        updateGrades = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        professorName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        professorName.setText("Όνομα Καθηγητή");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Μαθήματα:");

        studentsList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                studentsListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(studentsList);

        coursesList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coursesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                coursesListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(coursesList);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Εγγεγραμένοι φοιτητές:");

        finalGrade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        finalGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finalGrade.setText("Τελικός Βαθμός");
        finalGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalGradeMouseClicked(evt);
            }
        });

        theoryGrade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        theoryGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        theoryGrade.setText("Βαθμός Θεωρίας");
        theoryGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theoryGradeMouseClicked(evt);
            }
        });

        labGrade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labGrade.setText("Βαθμός Εργαστηρίου");
        labGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labGradeMouseClicked(evt);
            }
        });

        tasksGrade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tasksGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tasksGrade.setText("Βαθμός Εργασιών");
        tasksGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksGradeMouseClicked(evt);
            }
        });

        updateGrades.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateGrades.setText("Ενημέρωση");
        updateGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGradesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel3)
                .addGap(262, 262, 262)
                .addComponent(jLabel4)
                .addContainerGap(583, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(theoryGrade)
                    .addComponent(labGrade)
                    .addComponent(tasksGrade)
                    .addComponent(finalGrade)
                    .addComponent(updateGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(471, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(126, 126, 126)
                .addComponent(theoryGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tasksGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(finalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(updateGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Μαθήματα", jPanel1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Αιτήσεις:");

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(588, 588, 588)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Αλλαγές Βαθμών", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(professorName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(professorName)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void theoryGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theoryGradeMouseClicked
        if(theoryGrade.getText().equals("Βαθμός Θεωρίας")){
            theoryGrade.setText("");
        }
    }//GEN-LAST:event_theoryGradeMouseClicked

    //pernei tous palious vathmoys kai tous kainourgious kai tous stelnei se pianak sthn gramateia na tous elenxei
    private void updateGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGradesActionPerformed
        BasicDBObject gradeUpdate = new BasicDBObject("professor", email).append("student", students.get(studentsList.getSelectedIndex()).get("email")).append("course", courses.get(coursesList.getSelectedIndex()).get("id")).append("theoryOld", grades.get(studentsList.getSelectedIndex()).get("theory").toString()).append("theoryNew", theoryGrade.getText()).append("labOld", grades.get(studentsList.getSelectedIndex()).get("lab").toString()).append("labNew", labGrade.getText()).append("tasksNew", grades.get(studentsList.getSelectedIndex()).get("tasks").toString()).append("finalOld", finalGrade.getText()).append("finalNew", grades.get(studentsList.getSelectedIndex()).get("final").toString()).append("date", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")).append("completed", "pending");
        func.collection = func.db.getCollection("GradeChanges");
        func.collection.insert(gradeUpdate);
    }//GEN-LAST:event_updateGradesActionPerformed

    private void tasksGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksGradeMouseClicked
        if(tasksGrade.getText().equals("Βαθμός Εργασιών")){
            tasksGrade.setText("");
        }
    }//GEN-LAST:event_tasksGradeMouseClicked

    private void studentsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_studentsListValueChanged
        loadGrades(students.get(studentsList.getSelectedIndex()).get("email").toString());
    }//GEN-LAST:event_studentsListValueChanged

    private void coursesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_coursesListValueChanged
        loadStudents(coursesList.getSelectedValue().toString());
    }//GEN-LAST:event_coursesListValueChanged

    private void finalGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalGradeMouseClicked
        if(finalGrade.getText().equals("Τελικός Βαθμός")){
            finalGrade.setText("");
        }
    }//GEN-LAST:event_finalGradeMouseClicked

    private void labGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labGradeMouseClicked
        if(labGrade.getText().equals("Βαθμός Εργαστηρίου")){
            labGrade.setText("");
        }
    }//GEN-LAST:event_labGradeMouseClicked

    //fortwnei ta mathimata pou kanei o kathigitis
    void loadCourses(){
        
        func.cursor = func.getValues("Courses", "professor", email);        
        courses = func.cursor.toArray();
        
        for(int i = 0; i < func.cursor.length(); i++){            
            coursesModel.addElement(courses.get(i).get("id").toString() + " - " + courses.get(i).get("name").toString());            
        }
        
        coursesList = new JList(coursesModel);
        loadStudents(courses.get(0).get("name").toString());
        
    }
    
    //pioi fitities piran to kathe mathima
    void loadStudents(String course){
        
        studentsModel.clear();
        func.cursor = func.getArrayValues("Statements", "Courses", course);
        students = func.cursor.toArray();

        for(int i = 0; i < func.cursor.length(); i++){            
            studentsModel.addElement(students.get(i).get("id").toString() + " - " + students.get(i).get("name").toString());            
        }
        
        studentsList = new JList(studentsModel);
        loadGrades(students.get(0).get("email").toString());
                
    }
    
    void loadGrades(String student){
        
        func.cursor = func.getArrayValues("Grades", "student", student);
        grades = func.cursor.toArray();

        //fortwnei vathmou --> an den exei vathmo na paei parakatw
        for(int i = 0; i < func.cursor.length(); i++){   
            
            if(grades.get(i).get("name").toString().equals(courses.get(coursesList.getSelectedIndex()).get("name").toString())){
                
                theoryGrade.setText(grades.get(i).get("theoryGrade").toString());
                labGrade.setText(grades.get(i).get("labGrade").toString());
                tasksGrade.setText(grades.get(i).get("tasksGrade").toString());
                finalGrade.setText(grades.get(i).get("finalGrade").toString());
                break;
                
            }
            
        }
                
    }
    
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
            java.util.logging.Logger.getLogger(Professors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Professors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> coursesList;
    private javax.swing.JTextField finalGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField labGrade;
    private javax.swing.JLabel professorName;
    private javax.swing.JList<String> studentsList;
    private javax.swing.JTextField tasksGrade;
    private javax.swing.JTextField theoryGrade;
    private javax.swing.JButton updateGrades;
    // End of variables declaration//GEN-END:variables
}
