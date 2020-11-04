package com.mycompany.pithia;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.List;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Students extends javax.swing.JFrame {

    String email, fullName, username, password;    
    Functions func = new Functions();
    
    DefaultListModel coursesModel, cRequestsModel, pRequestsModel, pastStatementsModel, pastStatementsCoursesModel, currentStatementModel = new DefaultListModel();
    List<DBObject> courses, grades, statements, requests, availableCourses;
            
    
    public Students(String emailx, String fullNamex, String usernamex, String passwordx) {
        
        email = emailx;
        fullName = fullNamex;
        username = usernamex;
        password = passwordx;
                
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
        
        studentName.setText(fullName);
                
        //Load A-Sem Courses       
        loadCourses();        
        loadRequests();        
        loadStatements();        
        loadAvailableCourses();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentName = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesList = new javax.swing.JList<>();
        semesterCourses = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        statementCoursesList = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        statementsList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        declerativeCourses = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        selectedCourses = new javax.swing.JList<>();
        addCourse = new javax.swing.JButton();
        saveStatement = new javax.swing.JButton();
        removeCourse1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cRequestsList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pRequestsList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        topicsList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        studentName.setText("Όνομα Φοιτητή");

        coursesList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(coursesList);

        semesterCourses.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        semesterCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Εξάμηνο Α", "Εξάμηνο Β", "Εξάμηνο Γ", "Εξάμηνο Δ", "Εξάμηνο Ε", "Εξάμηνο ΣΤ", "Εξάμηνο Ζ", "Εξάμηνο Χ/Ε" }));
        semesterCourses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semesterCoursesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(semesterCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Βαθμολογίες", jPanel1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Νεα δήλωση:");

        statementCoursesList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane5.setViewportView(statementCoursesList);

        statementsList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statementsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                statementsListValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(statementsList);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Παλιές δηλώσεις:");

        declerativeCourses.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        selectedCourses.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane7.setViewportView(selectedCourses);

        addCourse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addCourse.setText("Προσθήκη");
        addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseActionPerformed(evt);
            }
        });

        saveStatement.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveStatement.setText("Αποθήκευση");
        saveStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStatementActionPerformed(evt);
            }
        });

        removeCourse1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removeCourse1.setText("Αφαίρεση");
        removeCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCourse1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(declerativeCourses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                            .addGap(29, 29, 29))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(saveStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removeCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(179, 179, 179))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(declerativeCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Δηλώσεις", jPanel2);

        cRequestsList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(cRequestsList);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Ολοκληρωμένες:");

        pRequestsList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(pRequestsList);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Σε εκκρεμότητα:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Θέμα:");

        notes.setColumns(20);
        notes.setRows(5);
        jScrollPane2.setViewportView(notes);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Σημειώσεις:");

        send.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        send.setText("Αποστολή Αίτησης");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        topicsList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        topicsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Αναλυτική Βαθμολογία", "Πιστοποιητικό Σπουδών", "Αποδεικτικό Εγγραφής" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(topicsList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Αιτήσεις", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(studentName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(studentName)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //emfanizei t mathimata 6minou pou thes
    private void semesterCoursesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semesterCoursesItemStateChanged
        loadCourses();
    }//GEN-LAST:event_semesterCoursesItemStateChanged

    //epilegesi dilwsh emfanizei mathima ta tis
    private void statementsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_statementsListValueChanged
        loadStatementCourses(statementsList.getSelectedIndex());
    }//GEN-LAST:event_statementsListValueChanged

    //upologizei ta parakatw otan prostheteis kainourgio amthima stin dilwsei
    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseActionPerformed
        
        if(!currentStatementModel.contains(declerativeCourses.getSelectedItem()) && (getPassed() * 6 < 160 && currentStatementModel.size() < 7) || (getPassed() * 6 >= 160 && currentStatementModel.size() < 9)){
            currentStatementModel.addElement(declerativeCourses.getSelectedItem());
            selectedCourses = new JList(currentStatementModel);
        }else{
            JOptionPane.showMessageDialog(null, "Δεν έχετε αρκετές ΔΜ", "Προσοχή", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_addCourseActionPerformed

    //kanei ayta pou exeis epilexei sthn kai ta kanei dilwsh
    private void saveStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStatementActionPerformed
        
        BasicDBObject statement = new BasicDBObject("student", email).append("date", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        String[] split;

        for(int i = 2; i < currentStatementModel.size(); i++){
            split = currentStatementModel.get(i).toString().split(" - ");
            statement.append("course" + String.valueOf(i-2), split[1]);
            statement.append("course" + String.valueOf(i-2) + "ID", split[0]);
        }
        
        func.collection.insert(statement);
        
    }//GEN-LAST:event_saveStatementActionPerformed

    //afereis mathima apo tin dilwsh
    private void removeCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCourse1ActionPerformed
        currentStatementModel.remove(declerativeCourses.getSelectedIndex());
        selectedCourses = new JList(currentStatementModel);
    }//GEN-LAST:event_removeCourse1ActionPerformed

    //stelneis ethma
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        
        BasicDBObject request = new BasicDBObject("topic", topicsList.getSelectedValue().toString()).append("notes", notes.getText()).append("student", email).append("studentFullname", fullName).append("date", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")).append("completed", "pending");
        func.collection.insert(request);

    }//GEN-LAST:event_sendActionPerformed
    
    //fortwnei ta mathimata kai tis vathmologies se mia lista
    void loadCourses(){
        
        func.cursor = func.getValues("Courses", "semester", semesterCourses.getSelectedItem().toString());
        courses = func.cursor.toArray();
        
        for(int i = 0; i < courses.size(); i++){       
            coursesModel.addElement(courses.get(i).get("name").toString());
        }
        
        func.cursor = func.getValues("Grades", "student", email);
        grades = func.cursor.toArray();

        for(int i = 0; i < grades.size(); i++){
            coursesModel.setElementAt(coursesModel.getElementAt(i).toString() + " - Theory: " + grades.get(i).get("final").toString() + " / Lab: " + grades.get(i).get("lab").toString() + " / Tasks: " + grades.get(i).get("tasks").toString() + " / Final: " + grades.get(i).get("final").toString(), i);
        }
        
        coursesList = new JList(coursesModel);

    }
    
    //katevazei ta etimata tou fititi kai ean exoun ikanopioithei apo thn gramatia ta vazei stis listes
    void loadRequests(){
        
        func.cursor = func.getValues("Requests", "student", email);
        requests = func.cursor.toArray();
        
        for(int i = 0; i < requests.size(); i++){
            
            if(requests.get(i).get("completed").toString().equals("yes")){
                cRequestsModel.addElement(requests.get(i).get("name").toString() + " - " + requests.get(i).get("dateRequested").toString());
            }else{
                pRequestsModel.addElement(requests.get(i).get("name").toString() + " - " + requests.get(i).get("dateRequested").toString());
            }
            
        }
        
        cRequestsList = new JList(cRequestsModel); //lista me etimata pou exei kanei i gramatia
        pRequestsList = new JList(pRequestsModel); //lista me etimata pou den exei dei i gramatia

    }
    
    //fortonei dilwseis mathimatwn
    void loadStatements(){
        
        func.cursor = func.getValues("Statements", "student", email);
        statements = func.cursor.toArray();
        
        for(int i = 0; i < statements.size(); i++){            
            pastStatementsModel.addElement(statements.get(i).get("date").toString());            
        }
        
        statementsList = new JList(pastStatementsModel);
        loadStatementCourses(0);
        
    }
    
    
    void loadStatementCourses(int index){ //i dieythinsi ths dilwshs ston pinaka dilwsewn
        
        pastStatementsCoursesModel.clear();
        
        int x = 0;
        
        while(statements.get(index).get("course" + x + "ID") != null){                
            pastStatementsCoursesModel.addElement(statements.get(index).get("course" + index + "ID") + " - " + statements.get(index).get("course" + index)); 
            x++;
        }
        
        statementsList = new JList(pastStatementsModel);
        
    }
    
    //epistrefei amthimata pou mporoun na dilothoun kai ta vazei sto combo box    
    void loadAvailableCourses(){
        
        func.cursor = func.getValues("Courses", "statable", "yes");
        availableCourses = func.cursor.toArray();
                
        for(int i = 0; i < grades.size(); i++){
                
            for(int x = 0; x < availableCourses.size(); x++){

                if(grades.get(i).get("courseID").toString().equals(availableCourses.get(x).get("id").toString())){
                    continue;
                }
                
                declerativeCourses.addItem(courses.get(i).get("id").toString() + " " + func.cursor.next().get("name").toString());            
                
            }            
            
        }
        
    }
    
    //epistrefei perasmena mathimata
    int getPassed(){
        
        int passed = 0;
        
        for(int i = 0; i < grades.size(); i++){
            
            if(Integer.parseInt(grades.get(i).get("finalGrade").toString()) >= 5){
                passed++;
            }
            
        }
        
        return passed;
        
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
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourse;
    private javax.swing.JList<String> cRequestsList;
    private javax.swing.JList<String> coursesList;
    private javax.swing.JComboBox<String> declerativeCourses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea notes;
    private javax.swing.JList<String> pRequestsList;
    private javax.swing.JButton removeCourse1;
    private javax.swing.JButton saveStatement;
    private javax.swing.JList<String> selectedCourses;
    private javax.swing.JComboBox<String> semesterCourses;
    private javax.swing.JButton send;
    private javax.swing.JList<String> statementCoursesList;
    private javax.swing.JList<String> statementsList;
    private javax.swing.JLabel studentName;
    private javax.swing.JList<String> topicsList;
    // End of variables declaration//GEN-END:variables
}
