package com.mycompany.pithia;

import com.mongodb.DBObject;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.UIManager;

public class Management extends javax.swing.JFrame {

    String email, fullName, username, password;
    Functions func = new Functions();

    DefaultListModel gradeChangesModel, coursesModel, studentsModel, professorsModel, statementsModel, statementCoursesModel, requestsModel, searchModel = new DefaultListModel();
    List<DBObject> gradeChanges, courses, students, professors, statements, statementCourses, requests;
    
    
    public Management(String emailx, String fullNamex, String usernamex, String passwordx) {
        
        email = emailx;
        fullName = fullNamex;
        username = usernamex;
        password = passwordx;
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();
        
        managementName.setText(fullName);
        
        //fortonei ta pada
        loadGradeChanges();
        loadCourses();
        loadStudents();
        loadProfessors();
        loadStatements();
        loadRequests();
        
    }
    
    void loadGradeChanges(){
        
        func.collection = func.db.getCollection("GradeChanges");  
        func.cursor = func.collection.find();   
        gradeChanges = func.cursor.toArray();
        
        for(int i = 0; i < func.cursor.length(); i++){            
            gradeChangesModel.addElement(gradeChanges.get(i).get("id").toString() + " - " + gradeChanges.get(i).get("name").toString() + " (" + gradeChanges.get(i).get("theoryOld").toString() + "/" + gradeChanges.get(i).get("labOld").toString() + "/" + gradeChanges.get(i).get("tasksOld").toString() + "/" + gradeChanges.get(i).get("finalOld").toString() + " -> " + gradeChanges.get(i).get("theoryNew").toString() + "/" + gradeChanges.get(i).get("labNew").toString() + "/" + gradeChanges.get(i).get("tasksNew").toString() + "/" + gradeChanges.get(i).get("finalNew").toString());                                        
        }
        
        gradeChangeList = new JList(gradeChangesModel);
        
    }
    
    void loadCourses(){
        
        func.collection = func.db.getCollection("Courses");  
        func.cursor = func.collection.find();   
        courses = func.cursor.toArray();
        
        for(int i = 0; i < func.cursor.length(); i++){             
            coursesModel.addElement(courses.get(i).get("id").toString() + " - " + courses.get(i).get("name").toString());                          
        }
        
        coursesList = new JList(coursesModel);
        coursesCombobox = new JComboBox((ComboBoxModel) coursesModel);
        
    }
    
    void loadStudents(){
        
        func.collection = func.db.getCollection("Students");  
        func.cursor = func.collection.find();   
        students = func.cursor.toArray();
        
        for(int i = 0; i < func.cursor.length(); i++){ 
            studentsModel.addElement(students.get(i).get("fullname").toString());   
        }
        
        studentsList = new JList(studentsModel);
        
    }
    
    void loadProfessors(){
        
        func.collection = func.db.getCollection("Professors");  
        func.cursor = func.collection.find();   
        professors = func.cursor.toArray();
        
        for(int i = 0; i < func.cursor.length(); i++){ 
            professorsModel.addElement(professors.get(i).get("fullname").toString());   
        }
        
        professorsList = new JList(professorsModel);
        
    }
    
    void loadStatements(){
        
        func.collection = func.db.getCollection("Statements");  
        func.cursor = func.collection.find();   
        statements = func.cursor.toArray();
        
        for(int i = 0; i < func.cursor.length(); i++){             
            statementsModel.addElement(statements.get(i).get("student").toString() + " - " + statements.get(i).get("date").toString());                          
        }
        
        statementsList = new JList(statementsModel);
        
    }
    
    void loadRequests(){
        
        func.collection = func.db.getCollection("Requests");  
        func.cursor = func.collection.find();   
        requests = func.cursor.toArray();
        
        for(int i = 0; i < func.cursor.length(); i++){     
            if(requests.get(i).get("completed").toString().equals("no")){
                requestsModel.addElement(requests.get(i).get("studentFullName").toString() + " - " + requests.get(i).get("studentID").toString() + " - " + requests.get(i).get("topic").toString() + " - " + requests.get(i).get("date").toString());                          
            }
        }
        
        statementsList = new JList(statementsModel);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managementName = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gradeChangeList = new javax.swing.JList<>();
        acceptGradeChange = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        gradeRejectReason = new javax.swing.JTextArea();
        saveCourses = new javax.swing.JButton();
        courseSemester = new javax.swing.JComboBox<>();
        courseType = new javax.swing.JComboBox<>();
        courseStatable = new javax.swing.JCheckBox();
        courseProfessor = new javax.swing.JTextField();
        courseName = new javax.swing.JTextField();
        courseID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        rejectAcceptGradeChanges = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        studentSearchFullname = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        studentsList = new javax.swing.JList<>();
        studentFullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        studentEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        studentUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        studentPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        searchStudent = new javax.swing.JButton();
        updateStudent = new javax.swing.JButton();
        studentSemester = new javax.swing.JComboBox<>();
        resetStudentSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        professorsList = new javax.swing.JList<>();
        professorFullname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        professorEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        professorUsername = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        professorPassword = new javax.swing.JTextField();
        searchProfessor = new javax.swing.JButton();
        updateProfessor = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        professorSearchFullname = new javax.swing.JTextField();
        resetProfessorsSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        statementsList = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        statementStudentSearch = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        statementDate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        statementCoursesList = new javax.swing.JList<>();
        coursesCombobox = new javax.swing.JComboBox<>();
        removeCourse = new javax.swing.JButton();
        addCourse = new javax.swing.JButton();
        searchStatement = new javax.swing.JButton();
        resetStatementsSearch = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        requestsList = new javax.swing.JList<>();
        applyRequest = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        requestRejectionReason = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        requestNotes = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        rejectAcceptRequests = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        managementName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        managementName.setText("Όνομα Γραμματείας");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Αλλαγές Βαθμών:");

        gradeChangeList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(gradeChangeList);

        acceptGradeChange.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        acceptGradeChange.setText("Εφαρμογή");
        acceptGradeChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptGradeChangeActionPerformed(evt);
            }
        });

        gradeRejectReason.setColumns(20);
        gradeRejectReason.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradeRejectReason.setRows(5);
        gradeRejectReason.setText("Αίτιο Απόρριψης");
        gradeRejectReason.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gradeRejectReasonFocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(gradeRejectReason);

        saveCourses.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveCourses.setText("Αποθήκευση");
        saveCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCoursesActionPerformed(evt);
            }
        });

        courseSemester.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Εξάμηνο Α", "Εξάμηνο Β", "Εξάμηνο Γ", "Εξάμηνο Δ", "Εξάμηνο Ε", "Εξάμηνο ΣΤ", "Εξάμηνο Ζ", "Εξάμηνο X/E" }));

        courseType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Υποχρεωτικό", "Επιλογής", "Υποχρεωτικό Κατ' Επιλογή" }));
        courseType.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        courseStatable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseStatable.setText("Δηλώσημο");

        courseProfessor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseProfessor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseProfessor.setText("Καθηγητής");

        courseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName.setText("Όνομα");

        courseID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseID.setText("ID");

        coursesList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coursesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                coursesListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(coursesList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Επεξεργασία Μαθημάτων:");

        rejectAcceptGradeChanges.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rejectAcceptGradeChanges.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Αποδοχή", "Απόρριψη" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rejectAcceptGradeChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acceptGradeChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(233, 233, 233))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseProfessor)
                            .addComponent(courseID)
                            .addComponent(jScrollPane1)
                            .addComponent(courseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(courseStatable)
                                .addGap(140, 140, 140)
                                .addComponent(saveCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(courseID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acceptGradeChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rejectAcceptGradeChanges))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(courseStatable)
                    .addComponent(saveCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Μαθήματα", jPanel2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Φοιτητές:");

        studentSearchFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentSearchFullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studentSearchFullname.setText("Αναζήτηση");
        studentSearchFullname.setToolTipText("");
        studentSearchFullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentSearchFullnameFocusGained(evt);
            }
        });

        studentsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                studentsListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(studentsList);

        studentFullname.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Πλήρες Όνομα:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("AM:");

        studentID.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Email:");

        studentEmail.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Username:");

        studentUsername.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Password:");

        studentPassword.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Current Semester:");

        searchStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchStudent.setText("Αναζήτηση");
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });

        updateStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateStudent.setText("Ενημέρωση");
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });

        studentSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Εξάμηνο Α", "Εξάμηνο Β", "Εξάμηνο Γ", "Εξάμηνο Δ", "Εξάμηνο Ε", "Εξάμηνο ΣΤ", "Εξάμηνο Ζ", "Εξάμηνο Χ/Ε" }));

        resetStudentSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resetStudentSearch.setText("R");
        resetStudentSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetStudentSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(studentSearchFullname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(searchStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(233, 233, 233)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentFullname)
                            .addComponent(jLabel4)
                            .addComponent(studentID)
                            .addComponent(jLabel5)
                            .addComponent(studentEmail)
                            .addComponent(jLabel6)
                            .addComponent(studentUsername)
                            .addComponent(jLabel7)
                            .addComponent(studentPassword)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(updateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(studentSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(306, 306, 306))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(studentSearchFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetStudentSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Φοιτητές", jPanel3);

        professorsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                professorsListValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(professorsList);

        professorFullname.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Πλήρες Όνομα:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Email:");

        professorEmail.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Username:");

        professorUsername.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Password:");

        professorPassword.setToolTipText("");

        searchProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchProfessor.setText("Αναζήτηση");
        searchProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProfessorActionPerformed(evt);
            }
        });

        updateProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateProfessor.setText("Ενημέρωση");
        updateProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfessorActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Kαθηγητές:");

        professorSearchFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        professorSearchFullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        professorSearchFullname.setText("Αναζήτηση");

        resetProfessorsSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resetProfessorsSearch.setText("R");
        resetProfessorsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetProfessorsSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchProfessor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(professorSearchFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetProfessorsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(250, 250, 250)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(professorFullname)
                            .addComponent(jLabel10)
                            .addComponent(professorEmail)
                            .addComponent(jLabel12)
                            .addComponent(professorUsername)
                            .addComponent(jLabel13)
                            .addComponent(professorPassword)
                            .addComponent(jLabel14)
                            .addComponent(updateProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel16)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(professorFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(professorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(professorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(professorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(updateProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(professorSearchFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(resetProfessorsSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        jTabbedPane1.addTab("Καθηγητές", jPanel1);

        statementsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                statementsListValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(statementsList);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Δηλώσεις:");

        statementStudentSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statementStudentSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        statementStudentSearch.setText("Αναζήτηση");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Μαθήματα:");

        statementDate.setEditable(false);
        statementDate.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Ημερομηνία:");

        statementCoursesList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane7.setViewportView(statementCoursesList);

        coursesCombobox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        removeCourse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removeCourse.setText("Αφαίρεση");
        removeCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCourseActionPerformed(evt);
            }
        });

        addCourse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addCourse.setText("Προσθήκη");
        addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseActionPerformed(evt);
            }
        });

        searchStatement.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchStatement.setText("Αναζήτηση");
        searchStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStatementActionPerformed(evt);
            }
        });

        resetStatementsSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resetStatementsSearch.setText("R");
        resetStatementsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetStatementsSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(statementStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resetStatementsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel17)))
                .addGap(187, 187, 187)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11)
                        .addComponent(jScrollPane7)
                        .addComponent(statementDate)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(coursesCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(addCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(removeCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(1, 1, 1))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(statementDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursesCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetStatementsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statementStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Δηλώσεις", jPanel4);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Σημειώσεις:");

        requestsList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                requestsListValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(requestsList);

        applyRequest.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        applyRequest.setText("Εφαρμογή");
        applyRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyRequestActionPerformed(evt);
            }
        });

        requestRejectionReason.setColumns(20);
        requestRejectionReason.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestRejectionReason.setRows(5);
        requestRejectionReason.setText("Αίτιο απόρριψης");
        jScrollPane9.setViewportView(requestRejectionReason);

        requestNotes.setColumns(20);
        requestNotes.setRows(5);
        jScrollPane10.setViewportView(requestNotes);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Αιτήσεις:");

        rejectAcceptRequests.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rejectAcceptRequests.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Αποδοχή", "Απόρριψη" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(201, 201, 201))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(applyRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rejectAcceptRequests, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rejectAcceptRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(applyRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Αιτήσεις", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(managementName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(managementName)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentSearchFullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentSearchFullnameFocusGained
        if(studentSearchFullname.getText().equals("Αναζήτηση")){
            studentSearchFullname.setText("");
        }
    }//GEN-LAST:event_studentSearchFullnameFocusGained

    private void gradeRejectReasonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gradeRejectReasonFocusGained
        if(gradeRejectReason.getText().equals("Αίτιο Απόρριψης")){
            gradeRejectReason.setText("");
        }
    }//GEN-LAST:event_gradeRejectReasonFocusGained

    private void coursesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_coursesListValueChanged
        
        courseID.setText(courses.get(coursesList.getSelectedIndex()).get("id").toString());
        courseName.setText(courses.get(coursesList.getSelectedIndex()).get("name").toString());
        courseProfessor.setText(courses.get(coursesList.getSelectedIndex()).get("professor").toString());
        courseSemester.setSelectedItem(courses.get(coursesList.getSelectedIndex()).get("id").toString());
        courseType.setSelectedItem(courses.get(coursesList.getSelectedIndex()).get("type").toString());
            
        if(courses.get(coursesList.getSelectedIndex()).get("statable").toString().equals("yes")){
            courseStatable.setSelected(true);
        }else{
            courseStatable.setSelected(false);
        }
        
    }//GEN-LAST:event_coursesListValueChanged

    private void studentsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_studentsListValueChanged
        
        studentFullname.setText(students.get(studentsList.getSelectedIndex()).get("fullname").toString());
        studentID.setText(students.get(studentsList.getSelectedIndex()).get("id").toString());
        studentEmail.setText(students.get(studentsList.getSelectedIndex()).get("email").toString());
        studentUsername.setText(students.get(studentsList.getSelectedIndex()).get("username").toString());
        studentPassword.setText(students.get(studentsList.getSelectedIndex()).get("password").toString());
        studentSemester.setSelectedItem(students.get(studentsList.getSelectedIndex()).get("semester").toString());   
        
    }//GEN-LAST:event_studentsListValueChanged

    private void professorsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_professorsListValueChanged
        
        professorFullname.setText(professors.get(professorsList.getSelectedIndex()).get("fullname").toString());
        professorEmail.setText(professors.get(professorsList.getSelectedIndex()).get("email").toString());
        professorUsername.setText(professors.get(professorsList.getSelectedIndex()).get("username").toString());
        professorPassword.setText(professors.get(professorsList.getSelectedIndex()).get("password").toString());
        
    }//GEN-LAST:event_professorsListValueChanged

    //emfanizei dilwsei fitoitwn
    private void statementsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_statementsListValueChanged
        
        statementDate.setText(students.get(statementsList.getSelectedIndex()).get("date").toString());

        statementCoursesModel.clear();
        
        for(int i = 0; i < courses.size(); i++){  
            
            if(statements.get(statementsList.getSelectedIndex()).containsField(courses.get(i).get("name").toString())){
                statementCoursesModel.addElement(courses.get(i).get("Course" + i + "ID") + " - " + statements.get(i).get("Course" + i)); 
            }
            
        }
        
        statementsList = new JList(statementCoursesModel);
        
    }//GEN-LAST:event_statementsListValueChanged

    private void requestsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_requestsListValueChanged
        requestNotes.setText(requests.get(requestsList.getSelectedIndex()).get("notes").toString());        
    }//GEN-LAST:event_requestsListValueChanged

    //epilegei i gramateia an tha apodexthei to etima h to aporipsei
    private void applyRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyRequestActionPerformed
        
        if(rejectAcceptRequests.getSelectedItem().toString().equals("Αποδοχή")){
            
            if(requests.get(requestsList.getSelectedIndex()).get("topic").toString().equals("Αναλυτική Βαθμολογία")){
                //send mail
            } else if(requests.get(requestsList.getSelectedIndex()).get("topic").toString().equals("Βεβαίωση Σπουδών")){
                //send mail
            } else if(requests.get(requestsList.getSelectedIndex()).get("topic").toString().equals("Αποδεικτικό Εγγραφής")){
                //send mail
            }
            
            func.updateValue("Requests", "student", requests.get(requestsList.getSelectedIndex()).get("student").toString(), "completed", "ÿes");

        }else{
         
            func.updateValue("Requests", "student", requests.get(requestsList.getSelectedIndex()).get("student").toString(), "notes", gradeRejectReason.getText());
            func.updateValue("Requests", "student", requests.get(requestsList.getSelectedIndex()).get("student").toString(), "completed", "no");
                        
        }
        
    }//GEN-LAST:event_applyRequestActionPerformed

    //enimerwnei oles tis times sthn vasi dedomenwn otan epexergazete
    private void saveCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCoursesActionPerformed
        
        func.updateValue("Courses", "id", courseID.getText(), "id", courseID.getText());
        func.updateValue("Courses", "id", courseID.getText(), "name", courseName.getText());
        func.updateValue("Courses", "id", courseID.getText(), "professor", courseProfessor.getText());
        func.updateValue("Courses", "id", courseID.getText(), "semester", courseSemester.getSelectedItem().toString());
        func.updateValue("Courses", "id", courseID.getText(), "type", courseType.getSelectedItem().toString());
        func.updateValue("Courses", "id", courseID.getText(), "statable", courseStatable.getText());
        
    }//GEN-LAST:event_saveCoursesActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
        
        func.updateValue("Students", "email", students.get(studentsList.getSelectedIndex()).get("email").toString(), "email", studentEmail.getText());
        func.updateValue("Students", "email", students.get(studentsList.getSelectedIndex()).get("fullName").toString(), "fullName", studentFullname.getText());
        func.updateValue("Students", "email", students.get(studentsList.getSelectedIndex()).get("username").toString(), "username", studentUsername.getText());
        func.updateValue("Students", "email", students.get(studentsList.getSelectedIndex()).get("password").toString(), "password", studentPassword.getText());
            
        
    }//GEN-LAST:event_updateStudentActionPerformed

    private void updateProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfessorActionPerformed
        
        func.updateValue("Professors", "email", professors.get(professorsList.getSelectedIndex()).get("email").toString(), "email", professorEmail.getText());
        func.updateValue("Professors", "email", professors.get(professorsList.getSelectedIndex()).get("fullName").toString(), "fullName", professorFullname.getText());
        func.updateValue("Professors", "email", professors.get(professorsList.getSelectedIndex()).get("username").toString(), "username", professorUsername.getText());
        func.updateValue("Professors", "email", professors.get(professorsList.getSelectedIndex()).get("password").toString(), "password", professorPassword.getText());    
        
    }//GEN-LAST:event_updateProfessorActionPerformed

    //text box anazitisis fitih h kathigith
    private void searchProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProfessorActionPerformed
        
        searchModel.clear();
        
        for(int i = 0; i < professorsModel.size(); i++){
            
            if(professorsModel.get(i).toString().contains(professorSearchFullname.getText())){
                searchModel.addElement(professorsModel.get(i).toString());
            }
            
        }
        
    }//GEN-LAST:event_searchProfessorActionPerformed

    private void searchStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStatementActionPerformed
        
        searchModel.clear();
        
        for(int i = 0; i < statementsModel.size(); i++){
            
            if(statementsModel.get(i).toString().contains(statementStudentSearch.getText())){
                searchModel.addElement(statementsModel.get(i).toString());
            }
            
        }
        
        professorsList = new JList(searchModel);
        
    }//GEN-LAST:event_searchStatementActionPerformed

    //otan vazeis ena mathima mesa se dilwsh fitoith
    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseActionPerformed
                       
        if(!statementCoursesModel.contains(coursesCombobox.getSelectedItem())){            
            
            statementCoursesModel.addElement(coursesCombobox.getSelectedItem().toString());
            statementCoursesList = new JList(statementCoursesModel);

            int i = 0;
            
            while(statements.get(statementsList.getSelectedIndex()).get("course" + Integer.toString(i)) != null){
                i++;
            }
            
            String course[]= coursesCombobox.getSelectedItem().toString().split(" - ");
            
            func.addField("Statements", statements.get(statementsList.getSelectedIndex()).get("_id").toString(), "course" + Integer.toString(i), course[0]);
            func.addField("Statements", statements.get(statementsList.getSelectedIndex()).get("_id").toString(), "course" + Integer.toString(i) + "ID", course[1]);
            
        }
        
        loadStatements();
        
    }//GEN-LAST:event_addCourseActionPerformed

    //aferei mathima
    private void removeCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCourseActionPerformed
        
        String course[] = coursesCombobox.getSelectedItem().toString().split(" - ");
        int i = -2;
        
        while(statements.get(statementsList.getSelectedIndex()).get("course" + Integer.toString(i)).toString() != null){
        
            if(statements.get(statementsList.getSelectedIndex()).get("course" + Integer.toString(i)).toString() == course[1]){
                break;                
            }
            
            i++;
        
        }
        
        func.removeField("Statements", statements.get(statementsList.getSelectedIndex()).get("_id").toString(), course[0] + i);
        func.removeField("Statements", statements.get(statementsList.getSelectedIndex()).get("_id").toString(), course[1] + i + "ID");
        
        statementsModel.removeElement(coursesCombobox.getSelectedItem());
        statementCoursesList = new JList(statementCoursesModel);

        loadStatements();
        
    }//GEN-LAST:event_removeCourseActionPerformed

    //aporiptei i dexete allagei vathmologias apo kathigiti
    private void acceptGradeChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptGradeChangeActionPerformed
        
        if(rejectAcceptGradeChanges.getSelectedItem().toString().equals("Αποδοχή")){
                        
            func.updateValue("Grades", "email", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("student").toString(), "theory", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("theoryNew").toString());
            func.updateValue("Grades", "email", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("student").toString(), "lab", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("labNew").toString());
            func.updateValue("Grades", "email", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("student").toString(), "tasks", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("tasksNew").toString());
            func.updateValue("Grades", "email", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("student").toString(), "final", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("finalNew").toString());
            
            func.updateValue("GradeChanges", "student", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("student").toString(), "completed", "ÿes");

        }else{
         
            func.updateValue("GradeChanges", "student", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("student").toString(), "notes", gradeRejectReason.getText());
            func.updateValue("GradeChanges", "student", gradeChanges.get(gradeChangeList.getSelectedIndex()).get("student").toString(), "completed", "no");
                        
        }
        
    }//GEN-LAST:event_acceptGradeChangeActionPerformed

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed

        searchModel.clear();
        
        for(int i = 0; i < studentsModel.size(); i++){
            
            if(studentsModel.get(i).toString().contains(studentSearchFullname.getText())){
                searchModel.addElement(studentsModel.get(i).toString());
            }
            
        }
        
        studentsList = new JList(searchModel);
        
    }//GEN-LAST:event_searchStudentActionPerformed

    private void resetStudentSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetStudentSearchActionPerformed
        loadStudents();
    }//GEN-LAST:event_resetStudentSearchActionPerformed

    private void resetStatementsSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetStatementsSearchActionPerformed
        loadStatements();
    }//GEN-LAST:event_resetStatementsSearchActionPerformed

    private void resetProfessorsSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetProfessorsSearchActionPerformed
        loadProfessors();
    }//GEN-LAST:event_resetProfessorsSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptGradeChange;
    private javax.swing.JButton addCourse;
    private javax.swing.JButton applyRequest;
    private javax.swing.JTextField courseID;
    private javax.swing.JTextField courseName;
    private javax.swing.JTextField courseProfessor;
    private javax.swing.JComboBox<String> courseSemester;
    private javax.swing.JCheckBox courseStatable;
    private javax.swing.JComboBox<String> courseType;
    private javax.swing.JComboBox<String> coursesCombobox;
    private javax.swing.JList<String> coursesList;
    private javax.swing.JList<String> gradeChangeList;
    private javax.swing.JTextArea gradeRejectReason;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel managementName;
    private javax.swing.JTextField professorEmail;
    private javax.swing.JTextField professorFullname;
    private javax.swing.JTextField professorPassword;
    private javax.swing.JTextField professorSearchFullname;
    private javax.swing.JTextField professorUsername;
    private javax.swing.JList<String> professorsList;
    private javax.swing.JComboBox<String> rejectAcceptGradeChanges;
    private javax.swing.JComboBox<String> rejectAcceptRequests;
    private javax.swing.JButton removeCourse;
    private javax.swing.JTextArea requestNotes;
    private javax.swing.JTextArea requestRejectionReason;
    private javax.swing.JList<String> requestsList;
    private javax.swing.JButton resetProfessorsSearch;
    private javax.swing.JButton resetStatementsSearch;
    private javax.swing.JButton resetStudentSearch;
    private javax.swing.JButton saveCourses;
    private javax.swing.JButton searchProfessor;
    private javax.swing.JButton searchStatement;
    private javax.swing.JButton searchStudent;
    private javax.swing.JList<String> statementCoursesList;
    private javax.swing.JTextField statementDate;
    private javax.swing.JTextField statementStudentSearch;
    private javax.swing.JList<String> statementsList;
    private javax.swing.JTextField studentEmail;
    private javax.swing.JTextField studentFullname;
    private javax.swing.JTextField studentID;
    private javax.swing.JTextField studentPassword;
    private javax.swing.JTextField studentSearchFullname;
    private javax.swing.JComboBox<String> studentSemester;
    private javax.swing.JTextField studentUsername;
    private javax.swing.JList<String> studentsList;
    private javax.swing.JButton updateProfessor;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
