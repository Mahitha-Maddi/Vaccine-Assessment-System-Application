/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchScientistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ResearchDepartmentEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Little Giants
 */
public class ManageVaccineJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization researchScientistOrganization;
    private EcoSystem business;
    
    /**
     * Creates new form ManageVolunteersJPanel
     * @param userProcessContainer
     * @param userAccount
     * @param enterprise
     * @param business
     * @param researchScientistOrganization
     */
 
    public ManageVaccineJPanel(JPanel userProcessContainer, Enterprise enterprise,UserAccount userAccount,Organization researchScientistOrganization, EcoSystem business) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=userAccount;
        this.enterprise = enterprise;
        this.researchScientistOrganization=researchScientistOrganization;
        this.business=business;
        valueLabel.setText(enterprise.getName());
        populateTextBoxes();
    
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateTextBoxes(){
            ResearchDepartmentEnterprise  researchDepartmentEnterprise=(ResearchDepartmentEnterprise)enterprise;
            try{
     if(!researchDepartmentEnterprise.getVaccineName().equals("")||researchDepartmentEnterprise.getVaccineName()!=null){
         
     vaccineNameTextField.setEnabled(false);
     volunteerNumTextField.setEnabled(false);
     vaccineType.setEnabled(false);
     minAgeTextField.setEnabled(false);
     maxAgeTextField.setEnabled(false);
       vaccineNameTextField.setText(researchDepartmentEnterprise.getVaccineName());
     volunteerNumTextField.setText(String.valueOf(researchDepartmentEnterprise.getVolunteerNumber()));
     vaccineType.setSelectedItem(researchDepartmentEnterprise.getVaccineType());
     minAgeTextField.setText(String.valueOf(researchDepartmentEnterprise.getMinimumAge()));
     maxAgeTextField.setText(String.valueOf(researchDepartmentEnterprise.getMaximumAge()));
     populateDosesComboBox();
     
     }}
        catch(Exception e){ 
        }
    }
    
    public void removeAll(){
    int itemCount = dose1.getItemCount();

    for(int i=0;i<itemCount;i++){
        dose1.removeItemAt(0);
     }
}
      public void populateDosesComboBox(){
          removeAll();
   ResearchDepartmentEnterprise researchDepartmentEnterprise= (ResearchDepartmentEnterprise)enterprise;
   for(String dose:researchDepartmentEnterprise.getDosesList()){
       dose1.addItem(dose);}}
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bpTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rrTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tempTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pulseTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bpTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rrTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tempTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        weightTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pulseTextField1 = new javax.swing.JTextField();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        volunteerNumTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        dosesTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        minAgeTextField = new javax.swing.JTextField();
        vaccineNameTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        DoseBtn = new javax.swing.JButton();
        maxAgeTextField = new javax.swing.JTextField();
        vaccineType = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dose1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();

        jLabel5.setText("Blood pressure :");

        jLabel6.setText("Respiratory rate:");

        jLabel7.setText("Body temperature");

        jLabel8.setText("Weight");

        jLabel9.setText("Pulse rate:");

        jLabel10.setText("Blood pressure :");

        jLabel11.setText("Respiratory rate:");

        jLabel12.setText("Body temperature");

        jLabel13.setText("Weight");

        jLabel14.setText("Pulse rate:");

        yesBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        yesBtn.setText("Yes");
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });

        noBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        noBtn.setText("No");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel4.setText("Interested in Organ Donation?");

        setBackground(new java.awt.Color(255, 255, 255));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 0, 51));
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 0, 0));
        enterpriseLabel.setText("Enterprise :");

        backJButton.setBackground(new java.awt.Color(88, 177, 159));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Vaccine Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Required Number of volunteers");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Vaccine Type ");

        volunteerNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volunteerNumTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Doses");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Age");

        saveBtn.setBackground(new java.awt.Color(88, 177, 159));
        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        DoseBtn.setBackground(new java.awt.Color(88, 177, 159));
        DoseBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DoseBtn.setText("Add dose");
        DoseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoseBtnActionPerformed(evt);
            }
        });

        maxAgeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxAgeTextFieldActionPerformed(evt);
            }
        });

        vaccineType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inactivated", "Attenuated" }));

        jLabel18.setText("from");

        jLabel19.setText("to");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        dose1.setBackground(new java.awt.Color(88, 177, 159));
        dose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose1ActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/Volunteers-Needed.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(504, 504, 504)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel17))
                                    .addGap(102, 102, 102)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(minAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(maxAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dosesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(vaccineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(DoseBtn)
                                                    .addGap(19, 19, 19)
                                                    .addComponent(dose1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(23, 23, 23)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(volunteerNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(saveBtn))))
                        .addGap(87, 87, 87)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vaccineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(volunteerNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DoseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dosesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dose1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(maxAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(minAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(29, 29, 29)
                        .addComponent(saveBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1090, 1090, 1090))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        ResearchDepartmentEnterprise  researchDepartmentEnterprise=(ResearchDepartmentEnterprise)enterprise;
        int doselistSize= researchDepartmentEnterprise.getDosesList().size();
    
    if(doselistSize<4){
        int remaining=4-doselistSize;
          JOptionPane.showMessageDialog(null, "Please add atleast 4 doses. Remaining :"+ remaining);
          return;
    }
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof ResearchScientistWorkAreaJPanel){
               ResearchScientistWorkAreaJPanel researchScientistWorkAreaJPanel= (ResearchScientistWorkAreaJPanel) comp;
               researchScientistWorkAreaJPanel.populate(minAgeTextField.getText(),maxAgeTextField.getText(),volunteerNumTextField.getText()); 
            }
        }

    }//GEN-LAST:event_backJButtonActionPerformed

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBtnActionPerformed

    private void volunteerNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volunteerNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volunteerNumTextFieldActionPerformed

    private void maxAgeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxAgeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxAgeTextFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

           ResearchDepartmentEnterprise  researchDepartmentEnterprise=(ResearchDepartmentEnterprise)enterprise;
        try{
     if(!researchDepartmentEnterprise.getVaccineName().equals("")||researchDepartmentEnterprise.getVaccineName()!=null){
         
        JOptionPane.showMessageDialog(null, "Vaccine attributes have already been defined for this enterprise");
        return;
     }}
        catch(Exception e){ 
        
        }
        
        
        if(maxAgeTextField.getText().equals("")||minAgeTextField.getText().equals("")||vaccineNameTextField.getText().equals("")||
                vaccineType.getSelectedItem().equals("")||volunteerNumTextField.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Fields cannot be empty.");
          return;
        }
        int minAge;
        int maxAge;
        int volNum;
           try
           {
        
        minAge = Integer.parseInt(minAgeTextField.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid min age"); 
            minAgeTextField.setText("");
               return;
           } 
        
              try
           {
        
        maxAge = Integer.parseInt(maxAgeTextField.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid max age"); 
            maxAgeTextField.setText("");
               return;
           } 
                 try
           {
        
        volNum = Integer.parseInt(volunteerNumTextField.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid volunteer number"); 
            volunteerNumTextField.setText("");
               return;
           } 
        
        if(volNum==0)    {
               JOptionPane.showMessageDialog(null , "Invalid volunteer number. Required number of volunteers should be greater than zero."); 
            volunteerNumTextField.setText("");
               return; 
        }     
                 
                 
        if(minAge>=maxAge){
             JOptionPane.showMessageDialog(null , "Minimum age can't be greater than maximum age"); 
            maxAgeTextField.setText("");
            minAgeTextField.setText("");
               return;
        }
      //  ResearchDepartmentEnterprise  researchDepartmentEnterprise=(ResearchDepartmentEnterprise)enterprise;
    /*int doselistSize= researchDepartmentEnterprise.getDosesList().size();
    
    if(doselistSize<4){
        int remaining=4-doselistSize;
          JOptionPane.showMessageDialog(null, "Please add atleast 4 doses. Remaining :"+ remaining);
          return;
    }
    */
    
     int dialogButton=0;
        int dialogResult=JOptionPane.showConfirmDialog (null, "Vaccine attributes once saved cannot be changed."
                + "Are you sure you want to save your decision","Warning",dialogButton);

    if (dialogResult == JOptionPane.YES_OPTION) { 
               
     researchDepartmentEnterprise.setMaximumAge(Integer.parseInt(maxAgeTextField.getText()));
     researchDepartmentEnterprise.setMinimumAge(Integer.parseInt(minAgeTextField.getText()));
     researchDepartmentEnterprise.setVaccineName(vaccineNameTextField.getText());
     researchDepartmentEnterprise.setVaccineType((String) vaccineType.getSelectedItem());
     researchDepartmentEnterprise.setVolunteerNumber(Integer.parseInt(volunteerNumTextField.getText()) );
     JOptionPane.showMessageDialog(null, "Saved successfully."); 
      return;
          }  
     
    }//GEN-LAST:event_saveBtnActionPerformed

    private void DoseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoseBtnActionPerformed
        // TODO add your handling code here:
           ResearchDepartmentEnterprise  researchDepartmentEnterprise=(ResearchDepartmentEnterprise)enterprise;
        try{
     if(researchDepartmentEnterprise.getVaccineName().equals("")||researchDepartmentEnterprise.getVaccineName()==null){
         
        JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine before defining doses");
        return;
     }}
        catch(Exception e){ JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine before defining doses");
        return;}
        
        
        if(dosesTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter valid dose.");
            return;
        }
        
          for(String dose:researchDepartmentEnterprise.getDosesList()){
          if(dose.equals(dosesTextField.getText())){
              JOptionPane.showMessageDialog(null, "This dose is already added.");
            return;
          }
          }
        
         try{
        researchDepartmentEnterprise.createDose(dosesTextField.getText());}
         catch(Exception e)
         {
             
         }
        JOptionPane.showMessageDialog(null, "Dose added successfully.");
        dosesTextField.setText("");
        populateDosesComboBox();
        
    }//GEN-LAST:event_DoseBtnActionPerformed

    private void dose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dose1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoseBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bpTextField;
    private javax.swing.JTextField bpTextField1;
    private javax.swing.JComboBox<String> dose1;
    private javax.swing.JTextField dosesTextField;
    private javax.swing.JLabel enterpriseLabel;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField maxAgeTextField;
    private javax.swing.JTextField minAgeTextField;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JTextField pulseTextField1;
    private javax.swing.JTextField rrTextField;
    private javax.swing.JTextField rrTextField1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JTextField tempTextField1;
    private javax.swing.JTextField vaccineNameTextField;
    private javax.swing.JComboBox<String> vaccineType;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTextField volunteerNumTextField;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField weightTextField1;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
