/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import Business.Organization.Organization;
import Business.RegularExpressionCheck;
import Business.Visitor.Visitor;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Little Giants
 */
public class ManageVisitorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonarRegistrationForm
     */
    JPanel rightPanel;
    Organization organization;
    //String email;
    //String emailAdd;
 
    
    public ManageVisitorsJPanel(JPanel rightPanel, Organization organization) {
        initComponents();
        this.rightPanel=rightPanel;
        this.organization=organization;
        groupButton1();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contactNumTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emergencyContactNameTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emergencyContactNumTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        signatureTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        emailTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Visitor Registration Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        nameTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Age:");

        ageTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sex:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Blood Group:");

        maleRadioBtn.setBackground(new java.awt.Color(88, 177, 159));
        maleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maleRadioBtn.setText("Male");

        femaleRadioBtn.setBackground(new java.awt.Color(88, 177, 159));
        femaleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        femaleRadioBtn.setText("Female");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Contact Number:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Email Id:");

        contactNumTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Address:");

        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Times New Roman", 0, 23)); // NOI18N
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("In Emergency, Person of Contact");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Name:");

        emergencyContactNameTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Contact Number:");

        emergencyContactNumTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Digital Signature:");

        signatureTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        registerButton.setBackground(new java.awt.Color(88, 177, 159));
        registerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(88, 177, 159));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O-positive", "O-negative ", "A-positive", "A-negative", "B-positive", "B-negative", "AB-positive", "AB-negative" }));

        backBtn.setBackground(new java.awt.Color(88, 177, 159));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/visitor.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emergencyContactNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(emergencyContactNumTextField)))
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(67, 67, 67)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contactNumTextField)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(27, 27, 27)
                                    .addComponent(maleRadioBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(femaleRadioBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerButton)
                                    .addComponent(signatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1)))
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(maleRadioBtn)
                            .addComponent(femaleRadioBtn))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(contactNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emergencyContactNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(signatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(registerButton))
                    .addComponent(emergencyContactNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(702, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String name = nameTextField.getText();
        //int age = Integer.parseInt(ageTextField.getText());
        String sex;
        if(maleRadioBtn.isSelected())
            sex = maleRadioBtn.getText();
        else 
            sex = femaleRadioBtn.getText();
        Object bloodGroup = jComboBox1.getSelectedItem();

        String contactNum = contactNumTextField.getText(); 
        String address = addressTextArea.getText();
        String emergencyPOC = emergencyContactNameTextField.getText();
        String emergencyPOC_Num = emergencyContactNumTextField.getText();
        String sign = signatureTextField.getText();
        String emailId=emailTextField.getText();

        
        //all fields should be filled
        if(name.equals("") || sex.equals("") || sign.equals("") || emailId.equals("") || emergencyPOC.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the details.");
            return;
        }
      
        int age;
        
        try
           {
        
            age =  Integer.parseInt(ageTextField.getText());
            
            if(age > 120 || age < 0){
                JOptionPane.showMessageDialog(null , "Please enter correct age.");
                ageTextField.setText("");
                 return;
            }
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Age should be numeric."); 
            ageTextField.setText("");
               return;
           }
        
        //check valid name
        if(!RegularExpressionCheck.findRE(name) || !RegularExpressionCheck.findRE(emergencyPOC) || !RegularExpressionCheck.findRE(sign)){
            JOptionPane.showMessageDialog(null, "Please enter valid name.");
            return;
        }
        //check for valid emailId
        if(!RegularExpressionCheck.isValidEmailAddress(emailId)){
            JOptionPane.showMessageDialog(null, " Invalid Username." + 
                "Username should be an email-ID with '_' and '@' as the only allowed special characters but should not start with '_'");
            return;
        }
        //check valid phone number
        if(!RegularExpressionCheck.isValidPhoneNum(contactNum) || !RegularExpressionCheck.isValidPhoneNum(emergencyPOC_Num)){
            JOptionPane.showMessageDialog(null, " Invalid phonenumber." + 
                "Phone number should be 10 digit number between 0-9.");
            return;
        }

          if(organization.getEmployeeDirectory().searchEmployee(name)==true){
                  
            JOptionPane.showMessageDialog(null, "This visitor name already exists.Please enter a full name.");
            
        nameTextField.setText("");
            return;}
          
        
             for (Visitor v: organization.getVisitorDirectory().getVisitorList()) {
                 if(v.getEmailAdd().equals(emailId)){
                     JOptionPane.showMessageDialog(null, "This email address already exists.");
            
        emailTextField.setText("");
            return;
                 }
             }
        
        if(organization != null && organization.getVisitorDirectory() != null){
            
           if(organization.getEmployeeDirectory().searchEmployee(name)==true){
           JOptionPane.showMessageDialog(null, "This employee name already exists.Please enter a different name.");
            nameTextField.setText("");
            return;
              }
            
            organization.getEmployeeDirectory().createEmployee(name);
            organization.getVisitorDirectory().createVisitor(name, age, sex, (String) bloodGroup, contactNum, 
                address, sign, emailId, emergencyPOC, emergencyPOC_Num);
            JOptionPane.showMessageDialog(null, "You have registered successfully.");
       
            rightPanel.remove(this);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.previous(rightPanel);
            Component[] comps = this.rightPanel.getComponents();
           for(Component comp : comps){
            if(comp instanceof ManageEmployeeJPanel){
               ManageEmployeeJPanel manageEmployeeJPanel= (ManageEmployeeJPanel) comp;
               manageEmployeeJPanel.populateTable(this.organization); 
            }
        }

 
        }
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
         rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
        Component[] comps = this.rightPanel.getComponents();
           for(Component comp : comps){
            if(comp instanceof ManageEmployeeJPanel){
               ManageEmployeeJPanel manageEmployeeJPanel= (ManageEmployeeJPanel) comp;
               manageEmployeeJPanel.populateTable(this.organization); 
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField contactNumTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField emergencyContactNameTextField;
    private javax.swing.JTextField emergencyContactNumTextField;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField signatureTextField;
    // End of variables declaration//GEN-END:variables

    private void groupButton1() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioBtn);
        buttonGroup.add(femaleRadioBtn);
    }
   

    
}
