/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hortidroid;

import hortidroid.module_arduino;


/**
 *
 * @author dooha
 */
public class main extends javax.swing.JFrame {
    
    private module_arduino moduloArduino;
    private int fila;
    private int estado;
    
  
    public main() {
        initComponents();

        moduloArduino = new module_arduino(
            /* tempFila1 */ 23,
            /* tempFila2 */ 23,
            /* tempFila3 */ 23,
            /* tempFila4 */ 23,
            /* phSueloFila1 */ 6,
            /* phSueloFila2 */ 7,
            /* phSueloFila3 */ 6,
            /* phSueloFila4 */ 7,
            /* humedadFila1 */ 55,
            /* humedadFila2 */ 75,
            /* humedadFila3 */ 75,
            /* humedadFila4 */ 75,
            /* promedioHumedad */ 66,
            /* promedioTemperatura */ 23,
            /* promedioPH */ 7
        );
       
        //Fila General
        int GenNumTemp = moduloArduino.getPromedioTemperatura();
        String GenTempVarNumber = String.valueOf(GenNumTemp);
        GenTempVar.setText(GenTempVarNumber + "°");
        int genTempVarF = 0;
        
        if(GenNumTemp < 18 || GenNumTemp > 24){
            GenTempVar.setBackground(new java.awt.Color(102, 0, 0));
            genTempVarF = 1;
        }else {
            GenTempVar.setBackground(new java.awt.Color(0, 102, 0));
            genTempVarF = 0;
        }
        
        int GenNumHum = moduloArduino.getPromedioHumedad();
        String GenHumVarNumber = String.valueOf(GenNumHum);
        GenHumVar.setText(GenHumVarNumber + "%");
        int genHumVarF = 0;
        
        if(GenNumHum < 70 || GenNumHum > 80){
            GenHumVar.setBackground(new java.awt.Color(102, 0, 0));
            genHumVarF = 1;
        }else {
            GenHumVar.setBackground(new java.awt.Color(0, 102, 0));
            genHumVarF = 0;
        }
        
        int GenPhNum = moduloArduino.getPromedioPH();
        String GenPhNumVar = String.valueOf(GenPhNum);
        GenPHVar.setText(GenPhNumVar + "pH");
        int genPHVarF = 0;
        
        if(GenPhNum < 6 || GenPhNum > 7){
            GenPHVar.setBackground(new java.awt.Color(102, 0, 0));
            genPHVarF = 1;
        }else {
            GenPHVar.setBackground(new java.awt.Color(0, 102, 0));
            genPHVarF = 0;
        }
        
        if (genPHVarF == 1 || genHumVarF == 1 || genTempVarF == 1){
            generalPanel.setBackground(new java.awt.Color(102, 0, 0));
        }else{
            generalPanel.setBackground(new java.awt.Color(0,153,51));
        }
        
        //Fila 1
        int F1TempVarNum = moduloArduino.getTempFila1();
        String F1TempVarNumber = String.valueOf(F1TempVarNum);
        F1TempVar.setText(F1TempVarNumber + "°");
        int F1TempVarF = 0;
        
        if(F1TempVarNum < 18 || F1TempVarNum > 24){
            F1TempVar.setBackground(new java.awt.Color(102, 0, 0));
            F1TempVarF = 1;
        }else {
            F1TempVar.setBackground(new java.awt.Color(0, 102, 0));
            F1TempVarF = 0;
        }
        
        int f1HumVarNum = moduloArduino.getHumedadFila1();
        String f1HumVarNumber = String.valueOf(f1HumVarNum);
        f1HumVar.setText(f1HumVarNumber + "%");
        int f1HumVarF = 0;
        
        if(f1HumVarNum < 70 || f1HumVarNum > 80){
            f1HumVar.setBackground(new java.awt.Color(102, 0, 0));
            f1HumVarF = 1;
        }else {
            f1HumVar.setBackground(new java.awt.Color(0, 102, 0));
            f1HumVarF = 0;
        }
        
        int F1PhVarNum = moduloArduino.getPhSueloFila1();
        String F1PhVarNumber = String.valueOf(F1PhVarNum);
        F1PhVar.setText(F1PhVarNumber + "pH");
        int F1PhVarF = 0;
        
        if(F1PhVarNum < 6 || F1PhVarNum > 7){
            F1PhVar.setBackground(new java.awt.Color(102, 0, 0));
            F1PhVarF = 1;
        }else {
            F1PhVar.setBackground(new java.awt.Color(0, 102, 0));
            F1PhVarF = 0;
        }
        
        if (F1PhVarF == 1 || f1HumVarF == 1 || F1TempVarF == 1){
            F1Panel.setBackground(new java.awt.Color(102, 0, 0));
            F1Estado1.setBackground(new java.awt.Color(102, 0, 0));
        }else{
            F1Panel.setBackground(new java.awt.Color(0,153,51));
            F1Estado1.setBackground(new java.awt.Color(0,153,51));
        }
        
        //Fila 2
        int F2TempVarNum = moduloArduino.getTempFila2();
        String F2TempVarNumber = String.valueOf(F2TempVarNum);
        f2TempVar.setText(F2TempVarNumber + "°");
        int F2TempVarF = 0;
        
        if(F2TempVarNum < 18 || F2TempVarNum > 24){
            f2TempVar.setBackground(new java.awt.Color(102, 0, 0));
            F2TempVarF = 1;
        }else {
            f2TempVar.setBackground(new java.awt.Color(0, 102, 0));
            F2TempVarF = 0;
        }
        
        int f2HumVarNum = moduloArduino.getHumedadFila2();
        String f2HumVarNumber = String.valueOf(f2HumVarNum);
        f2HumVar.setText(f2HumVarNumber + "%");
        int f2HumVarF = 0;
        
        if(f2HumVarNum < 70 || f2HumVarNum > 80){
            f2HumVar.setBackground(new java.awt.Color(102, 0, 0));
            f2HumVarF = 1;
        }else {
            f2HumVar.setBackground(new java.awt.Color(0, 102, 0));
            f2HumVarF = 0;
        }
        
        int F2PhVarNum = moduloArduino.getPhSueloFila2();
        String F2PhVarNumber = String.valueOf(F2PhVarNum);
        f2PhVar.setText(F2PhVarNumber + "pH");
        int F2PhVarF = 0;
        
        if(F2PhVarNum < 6 || F2PhVarNum > 7){
            f2PhVar.setBackground(new java.awt.Color(102, 0, 0));
            F2PhVarF = 1;
        }else {
            f2PhVar.setBackground(new java.awt.Color(0, 102, 0));
            F2PhVarF = 0;
        }
        
        if (F2PhVarF == 1 || f2HumVarF == 1 || F2TempVarF == 1){
            F2Panel.setBackground(new java.awt.Color(102, 0, 0));
            F1Estado2.setBackground(new java.awt.Color(102, 0, 0));
        }else{
            F2Panel.setBackground(new java.awt.Color(0,153,51));
            F1Estado2.setBackground(new java.awt.Color(0,153,51));
        }
        
        //Fila 3
        int F3TempVarNum = moduloArduino.getTempFila3();
        String F3TempVarNumber = String.valueOf(F3TempVarNum);
        F3TempVar1.setText(F2TempVarNumber + "°");
        int F3TempVarF = 0;
        
        if(F3TempVarNum < 18 || F3TempVarNum > 24){
            F3TempVar1.setBackground(new java.awt.Color(102, 0, 0));
            F3TempVarF = 1;
        }else {
            F3TempVar1.setBackground(new java.awt.Color(0, 102, 0));
            F3TempVarF = 0;
        }
        
        int f3HumVarNum = moduloArduino.getHumedadFila3();
        String f3HumVarNumber = String.valueOf(f3HumVarNum);
        F3HumVar1.setText(f3HumVarNumber + "%");
        int f3HumVarF = 0;
        
        if(f3HumVarNum < 70 || f3HumVarNum > 80){
            F3HumVar1.setBackground(new java.awt.Color(102, 0, 0));
            f3HumVarF = 1;
        }else {
            F3HumVar1.setBackground(new java.awt.Color(0, 102, 0));
            f3HumVarF = 0;
        }
        
        int F3PhVarNum = moduloArduino.getPhSueloFila3();
        String F3PhVarNumber = String.valueOf(F3PhVarNum);
        F3PhVar1.setText(F3PhVarNumber + "pH");
        int F3PhVarF = 0;
        
        if(F3PhVarNum < 6 || F3PhVarNum > 7){
            F3PhVar1.setBackground(new java.awt.Color(102, 0, 0));
            F3PhVarF = 1;
        }else {
            F3PhVar1.setBackground(new java.awt.Color(0, 102, 0));
            F3PhVarF = 0;
        }
        
        if (F2PhVarF == 1 || f3HumVarF == 1 || F3TempVarF == 1){
            F3Panel1.setBackground(new java.awt.Color(102, 0, 0));
            F1Estado3.setBackground(new java.awt.Color(102, 0, 0));
        }else{
            F3Panel1.setBackground(new java.awt.Color(0,153,51));
            F1Estado3.setBackground(new java.awt.Color(0,153,51));
        }
        
        //Fila 4
        int F4TempVarNum = moduloArduino.getTempFila4();
        String F4TempVarNumber = String.valueOf(F4TempVarNum);
        F4TEMPVAR.setText(F4TempVarNumber + "°");
        int F4TempVarF = 0;
        
        if(F4TempVarNum < 18 || F4TempVarNum > 24){
            F4TEMPVAR.setBackground(new java.awt.Color(102, 0, 0));
            F4TempVarF = 1;
        }else {
            F4TEMPVAR.setBackground(new java.awt.Color(0, 102, 0));
            F4TempVarF = 0;
        }
        
        int f4HumVarNum = moduloArduino.getHumedadFila4();
        String f4HumVarNumber = String.valueOf(f4HumVarNum);
        F4HUMVAR.setText(f4HumVarNumber + "%");
        int f4HumVarF = 0;
        
        if(f4HumVarNum < 70 || f4HumVarNum > 80){
            F4HUMVAR.setBackground(new java.awt.Color(102, 0, 0));
            f4HumVarF = 1;
        }else {
            F4HUMVAR.setBackground(new java.awt.Color(0, 102, 0));
            f4HumVarF = 0;
        }
        
        int F4PhVarNum = moduloArduino.getPhSueloFila4();
        String F4PhVarNumber = String.valueOf(F4PhVarNum);
        F4PHVAR.setText(F4PhVarNumber + "pH");
        int F4PhVarF = 0;
        
        if(F4PhVarNum < 6 || F4PhVarNum > 7){
            F4PHVAR.setBackground(new java.awt.Color(102, 0, 0));
            F4PhVarF = 1;
        }else {
            F4PHVAR.setBackground(new java.awt.Color(0, 102, 0));
            F4PhVarF = 0;
        }
        
        if (F4PhVarF == 1 || f4HumVarF == 1 || F4TempVarF == 1){
            F3Panel.setBackground(new java.awt.Color(102, 0, 0));
            F1Estado.setBackground(new java.awt.Color(102, 0, 0));
        }else{
            F3Panel.setBackground(new java.awt.Color(0,153,51));
            F1Estado.setBackground(new java.awt.Color(0,153,51));
        } 
        
        String portName = "COM3"; //Seleccionamos el puerto COM
        int baudRate = 9600;
        
        String f1_e0 = "f1_e0"; // Declarar el comando que se enviara al arduino
        String f1_e1 = "f1_e1";
        String f1_e2 = "f1_e2";
        String f1_e3 = "f1_e3";
        
        String f2_e0 = "f1_e0";
        String f2_e1 = "f1_e1";
        String f2_e2 = "f1_e2";
        String f2_e3 = "f1_e3";
        
        String f3_e0 = "f1_e0";
        String f3_e1 = "f1_e1";
        String f3_e2 = "f1_e2";
        String f3_e3 = "f1_e3";
        
        String f4_e0 = "f1_e0";
        String f4_e1 = "f1_e1";
        String f4_e2 = "f1_e2";
        String f4_e3 = "f1_e3";
        

        try {

            SerialPort serialPort = (SerialPort) CommPortIdentifier.getPortIdentifier(portName);
            serialPort.setSerialPortParams(baudRate);

            OutputStream out = serialPort.getOutputStream();

            
            
            switch(fila){
                case 0:
                    switch(estado){
                        case 0:
                            out.write(f1_e0.getBytes()); //Se envia el comando
                            out.flush();
                        case 1:
                            out.write(f1_e1.getBytes());
                            out.flush();
                        case 2:
                            out.write(f1_e2.getBytes());
                            out.flush();
                        case 3:
                            out.write(f1_e3.getBytes());
                            out.flush();
                    }
                case 1:
                    switch(estado){
                        case 0:
                            out.write(f2_e0.getBytes());
                            out.flush();
                        case 1:
                            out.write(f2_e1.getBytes());
                            out.flush();
                        case 2:
                            out.write(f2_e2.getBytes());
                            out.flush();
                        case 3:
                            out.write(f2_e3.getBytes());
                            out.flush();
                    }    
                case 2:
                    switch(estado){
                            case 0:
                                out.write(f3_e0.getBytes());
                                out.flush();
                            case 1:
                                out.write(f3_e1.getBytes());
                                out.flush();
                            case 2:
                                out.write(f3_e2.getBytes());
                                out.flush();
                            case 3:
                                out.write(f3_e3.getBytes());
                                out.flush();
                        }        
                case 3:
                    switch(estado){
                            case 0:
                                out.write(f4_e0.getBytes());
                                out.flush();
                            case 1:
                                out.write(f4_e1.getBytes());
                                out.flush();
                            case 2:
                                out.write(f4_e2.getBytes());
                                out.flush();
                            case 3:
                                out.write(f4_e3.getBytes());
                                out.flush();
                        }        
            }
            
            serialPort.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title_HortiDroid = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        generalPanel = new javax.swing.JPanel();
        generalLabel = new javax.swing.JLabel();
        pHPanel = new javax.swing.JPanel();
        GenPHVar = new javax.swing.JTextField();
        GenPHLabel = new javax.swing.JLabel();
        tempPanel = new javax.swing.JPanel();
        GenTempVar = new javax.swing.JTextField();
        GenTempLabel = new javax.swing.JLabel();
        humPanel = new javax.swing.JPanel();
        GenHumVar = new javax.swing.JTextField();
        GenHumLabel = new javax.swing.JLabel();
        F2Panel = new javax.swing.JPanel();
        fila1Label = new javax.swing.JLabel();
        pHPanel1 = new javax.swing.JPanel();
        f2PhVar = new javax.swing.JTextField();
        f1PhLabel = new javax.swing.JLabel();
        tempPanel1 = new javax.swing.JPanel();
        f2TempVar = new javax.swing.JTextField();
        F1TempLabel = new javax.swing.JLabel();
        humPanel1 = new javax.swing.JPanel();
        f2HumVar = new javax.swing.JTextField();
        GenHumLabel1 = new javax.swing.JLabel();
        F1Estado2 = new javax.swing.JTextField();
        F3Panel = new javax.swing.JPanel();
        f2Label = new javax.swing.JLabel();
        pHPanel2 = new javax.swing.JPanel();
        F4PHVAR = new javax.swing.JTextField();
        f2PhLabel = new javax.swing.JLabel();
        tempPanel2 = new javax.swing.JPanel();
        F4TEMPVAR = new javax.swing.JTextField();
        F2TempLabel = new javax.swing.JLabel();
        humPanel2 = new javax.swing.JPanel();
        F4HUMVAR = new javax.swing.JTextField();
        GenHumLabel2 = new javax.swing.JLabel();
        F1Estado = new javax.swing.JTextField();
        F1Panel = new javax.swing.JPanel();
        f2Label1 = new javax.swing.JLabel();
        pHPanel3 = new javax.swing.JPanel();
        F1PhVar = new javax.swing.JTextField();
        f2PhLabel1 = new javax.swing.JLabel();
        tempPanel3 = new javax.swing.JPanel();
        F1TempVar = new javax.swing.JTextField();
        F2TempLabel1 = new javax.swing.JLabel();
        humPanel3 = new javax.swing.JPanel();
        f1HumVar = new javax.swing.JTextField();
        GenHumLabel3 = new javax.swing.JLabel();
        F1Estado1 = new javax.swing.JTextField();
        F3Panel1 = new javax.swing.JPanel();
        f2Label2 = new javax.swing.JLabel();
        pHPanel4 = new javax.swing.JPanel();
        F3PhVar1 = new javax.swing.JTextField();
        f2PhLabel2 = new javax.swing.JLabel();
        tempPanel4 = new javax.swing.JPanel();
        F3TempVar1 = new javax.swing.JTextField();
        F2TempLabel2 = new javax.swing.JLabel();
        humPanel4 = new javax.swing.JPanel();
        F3HumVar1 = new javax.swing.JTextField();
        GenHumLabel4 = new javax.swing.JLabel();
        F1Estado3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        selectorEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        changeFilaBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        selectorFila = new javax.swing.JComboBox<>();
        changeFilaBtn1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 0, 0));

        title_HortiDroid.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        title_HortiDroid.setForeground(new java.awt.Color(153, 153, 153));
        title_HortiDroid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_HortiDroid.setText("HortiDroid");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_HortiDroid, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_HortiDroid, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        footer.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HortiDroid - Universidad Fidélitas");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainPanel.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 900, 40));

        generalPanel.setBackground(new java.awt.Color(0, 153, 51));
        generalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generalLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        generalLabel.setForeground(new java.awt.Color(255, 255, 255));
        generalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalLabel.setText("GENERAL");
        generalPanel.add(generalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 98, 34));

        pHPanel.setBackground(new java.awt.Color(51, 51, 51));
        pHPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GenPHVar.setEditable(false);
        GenPHVar.setBackground(new java.awt.Color(0, 102, 0));
        GenPHVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        GenPHVar.setForeground(new java.awt.Color(255, 255, 255));
        GenPHVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GenPHVar.setText("5 pH");
        GenPHVar.setBorder(null);
        GenPHVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenPHVarActionPerformed(evt);
            }
        });
        pHPanel.add(GenPHVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        GenPHLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        GenPHLabel.setForeground(new java.awt.Color(255, 255, 255));
        GenPHLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenPHLabel.setText("pH");
        pHPanel.add(GenPHLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        generalPanel.add(pHPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 70));

        tempPanel.setBackground(new java.awt.Color(51, 51, 51));
        tempPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GenTempVar.setEditable(false);
        GenTempVar.setBackground(new java.awt.Color(0, 102, 0));
        GenTempVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        GenTempVar.setForeground(new java.awt.Color(255, 255, 255));
        GenTempVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GenTempVar.setText("26°");
        GenTempVar.setBorder(null);
        GenTempVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenTempVarActionPerformed(evt);
            }
        });
        tempPanel.add(GenTempVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        GenTempLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        GenTempLabel.setForeground(new java.awt.Color(255, 255, 255));
        GenTempLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenTempLabel.setText("TEMP C°");
        tempPanel.add(GenTempLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        generalPanel.add(tempPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 70));

        humPanel.setBackground(new java.awt.Color(51, 51, 51));
        humPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GenHumVar.setEditable(false);
        GenHumVar.setBackground(new java.awt.Color(0, 102, 0));
        GenHumVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        GenHumVar.setForeground(new java.awt.Color(255, 255, 255));
        GenHumVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GenHumVar.setText("65%");
        GenHumVar.setBorder(null);
        GenHumVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenHumVarActionPerformed(evt);
            }
        });
        humPanel.add(GenHumVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        GenHumLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        GenHumLabel.setForeground(new java.awt.Color(255, 255, 255));
        GenHumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenHumLabel.setText("HUMEDAD");
        humPanel.add(GenHumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        generalPanel.add(humPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 70));

        mainPanel.add(generalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 420));

        F2Panel.setBackground(new java.awt.Color(102, 0, 0));
        F2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fila1Label.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        fila1Label.setForeground(new java.awt.Color(255, 255, 255));
        fila1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fila1Label.setText("FILA 2");
        F2Panel.add(fila1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 98, 34));

        pHPanel1.setBackground(new java.awt.Color(51, 51, 51));
        pHPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f2PhVar.setEditable(false);
        f2PhVar.setBackground(new java.awt.Color(0, 102, 0));
        f2PhVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        f2PhVar.setForeground(new java.awt.Color(255, 255, 255));
        f2PhVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f2PhVar.setText("5 pH");
        f2PhVar.setBorder(null);
        f2PhVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2PhVarActionPerformed(evt);
            }
        });
        pHPanel1.add(f2PhVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        f1PhLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        f1PhLabel.setForeground(new java.awt.Color(255, 255, 255));
        f1PhLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f1PhLabel.setText("pH");
        pHPanel1.add(f1PhLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        F2Panel.add(pHPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 70));

        tempPanel1.setBackground(new java.awt.Color(51, 51, 51));
        tempPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f2TempVar.setEditable(false);
        f2TempVar.setBackground(new java.awt.Color(0, 102, 0));
        f2TempVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        f2TempVar.setForeground(new java.awt.Color(255, 255, 255));
        f2TempVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f2TempVar.setText("26°");
        f2TempVar.setBorder(null);
        f2TempVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2TempVarActionPerformed(evt);
            }
        });
        tempPanel1.add(f2TempVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        F1TempLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        F1TempLabel.setForeground(new java.awt.Color(255, 255, 255));
        F1TempLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F1TempLabel.setText("TEMP C°");
        tempPanel1.add(F1TempLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        F2Panel.add(tempPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 70));

        humPanel1.setBackground(new java.awt.Color(51, 51, 51));
        humPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f2HumVar.setEditable(false);
        f2HumVar.setBackground(new java.awt.Color(102, 0, 0));
        f2HumVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        f2HumVar.setForeground(new java.awt.Color(255, 255, 255));
        f2HumVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f2HumVar.setText("80%");
        f2HumVar.setBorder(null);
        f2HumVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2HumVarActionPerformed(evt);
            }
        });
        humPanel1.add(f2HumVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        GenHumLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        GenHumLabel1.setForeground(new java.awt.Color(255, 255, 255));
        GenHumLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenHumLabel1.setText("HUMEDAD");
        humPanel1.add(GenHumLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        F2Panel.add(humPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 70));

        F1Estado2.setBackground(new java.awt.Color(102, 0, 0));
        F1Estado2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        F1Estado2.setForeground(new java.awt.Color(255, 255, 255));
        F1Estado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F1Estado2.setText("Estado");
        F1Estado2.setBorder(null);
        F2Panel.add(F1Estado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 110, -1));

        mainPanel.add(F2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 110, 420));

        F3Panel.setBackground(new java.awt.Color(0, 153, 51));
        F3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f2Label.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        f2Label.setForeground(new java.awt.Color(255, 255, 255));
        f2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f2Label.setText("FILA 4");
        F3Panel.add(f2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 98, 34));

        pHPanel2.setBackground(new java.awt.Color(51, 51, 51));
        pHPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F4PHVAR.setEditable(false);
        F4PHVAR.setBackground(new java.awt.Color(0, 102, 0));
        F4PHVAR.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        F4PHVAR.setForeground(new java.awt.Color(255, 255, 255));
        F4PHVAR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F4PHVAR.setText("5 pH");
        F4PHVAR.setBorder(null);
        F4PHVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4PHVARActionPerformed(evt);
            }
        });
        pHPanel2.add(F4PHVAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        f2PhLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        f2PhLabel.setForeground(new java.awt.Color(255, 255, 255));
        f2PhLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f2PhLabel.setText("pH");
        pHPanel2.add(f2PhLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        F3Panel.add(pHPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 70));

        tempPanel2.setBackground(new java.awt.Color(51, 51, 51));
        tempPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F4TEMPVAR.setEditable(false);
        F4TEMPVAR.setBackground(new java.awt.Color(0, 102, 0));
        F4TEMPVAR.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        F4TEMPVAR.setForeground(new java.awt.Color(255, 255, 255));
        F4TEMPVAR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F4TEMPVAR.setText("26°");
        F4TEMPVAR.setBorder(null);
        F4TEMPVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4TEMPVARActionPerformed(evt);
            }
        });
        tempPanel2.add(F4TEMPVAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        F2TempLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        F2TempLabel.setForeground(new java.awt.Color(255, 255, 255));
        F2TempLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F2TempLabel.setText("TEMP C°");
        tempPanel2.add(F2TempLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        F3Panel.add(tempPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 70));

        humPanel2.setBackground(new java.awt.Color(51, 51, 51));
        humPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F4HUMVAR.setEditable(false);
        F4HUMVAR.setBackground(new java.awt.Color(0, 102, 0));
        F4HUMVAR.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        F4HUMVAR.setForeground(new java.awt.Color(255, 255, 255));
        F4HUMVAR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F4HUMVAR.setText("65%");
        F4HUMVAR.setBorder(null);
        F4HUMVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4HUMVARActionPerformed(evt);
            }
        });
        humPanel2.add(F4HUMVAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        GenHumLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        GenHumLabel2.setForeground(new java.awt.Color(255, 255, 255));
        GenHumLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenHumLabel2.setText("HUMEDAD");
        humPanel2.add(GenHumLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        F3Panel.add(humPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 70));

        F1Estado.setBackground(new java.awt.Color(0, 153, 51));
        F1Estado.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        F1Estado.setForeground(new java.awt.Color(255, 255, 255));
        F1Estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F1Estado.setText("Estado");
        F1Estado.setBorder(null);
        F3Panel.add(F1Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 110, -1));

        mainPanel.add(F3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 110, 420));

        F1Panel.setBackground(new java.awt.Color(0, 153, 51));
        F1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f2Label1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        f2Label1.setForeground(new java.awt.Color(255, 255, 255));
        f2Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f2Label1.setText("FILA 1");
        F1Panel.add(f2Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 98, 34));

        pHPanel3.setBackground(new java.awt.Color(51, 51, 51));
        pHPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F1PhVar.setEditable(false);
        F1PhVar.setBackground(new java.awt.Color(0, 102, 0));
        F1PhVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        F1PhVar.setForeground(new java.awt.Color(255, 255, 255));
        F1PhVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F1PhVar.setText("5 pH");
        F1PhVar.setBorder(null);
        F1PhVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1PhVarActionPerformed(evt);
            }
        });
        pHPanel3.add(F1PhVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        f2PhLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        f2PhLabel1.setForeground(new java.awt.Color(255, 255, 255));
        f2PhLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f2PhLabel1.setText("pH");
        pHPanel3.add(f2PhLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        F1Panel.add(pHPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 70));

        tempPanel3.setBackground(new java.awt.Color(51, 51, 51));
        tempPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F1TempVar.setEditable(false);
        F1TempVar.setBackground(new java.awt.Color(0, 102, 0));
        F1TempVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        F1TempVar.setForeground(new java.awt.Color(255, 255, 255));
        F1TempVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F1TempVar.setText("26°");
        F1TempVar.setBorder(null);
        F1TempVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1TempVarActionPerformed(evt);
            }
        });
        tempPanel3.add(F1TempVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        F2TempLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        F2TempLabel1.setForeground(new java.awt.Color(255, 255, 255));
        F2TempLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F2TempLabel1.setText("TEMP C°");
        tempPanel3.add(F2TempLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        F1Panel.add(tempPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 70));

        humPanel3.setBackground(new java.awt.Color(51, 51, 51));
        humPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f1HumVar.setEditable(false);
        f1HumVar.setBackground(new java.awt.Color(0, 102, 0));
        f1HumVar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        f1HumVar.setForeground(new java.awt.Color(255, 255, 255));
        f1HumVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f1HumVar.setText("65%");
        f1HumVar.setBorder(null);
        f1HumVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1HumVarActionPerformed(evt);
            }
        });
        humPanel3.add(f1HumVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        GenHumLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        GenHumLabel3.setForeground(new java.awt.Color(255, 255, 255));
        GenHumLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenHumLabel3.setText("HUMEDAD");
        humPanel3.add(GenHumLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        F1Panel.add(humPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 70));

        F1Estado1.setBackground(new java.awt.Color(0, 153, 51));
        F1Estado1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        F1Estado1.setForeground(new java.awt.Color(255, 255, 255));
        F1Estado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F1Estado1.setText("Estado");
        F1Estado1.setBorder(null);
        F1Panel.add(F1Estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 110, -1));

        mainPanel.add(F1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 110, 420));

        F3Panel1.setBackground(new java.awt.Color(0, 153, 51));
        F3Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f2Label2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        f2Label2.setForeground(new java.awt.Color(255, 255, 255));
        f2Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f2Label2.setText("FILA 3");
        F3Panel1.add(f2Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 98, 34));

        pHPanel4.setBackground(new java.awt.Color(51, 51, 51));
        pHPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F3PhVar1.setEditable(false);
        F3PhVar1.setBackground(new java.awt.Color(0, 102, 0));
        F3PhVar1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        F3PhVar1.setForeground(new java.awt.Color(255, 255, 255));
        F3PhVar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F3PhVar1.setText("5 pH");
        F3PhVar1.setBorder(null);
        F3PhVar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3PhVar1ActionPerformed(evt);
            }
        });
        pHPanel4.add(F3PhVar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        f2PhLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        f2PhLabel2.setForeground(new java.awt.Color(255, 255, 255));
        f2PhLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f2PhLabel2.setText("pH");
        pHPanel4.add(f2PhLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        F3Panel1.add(pHPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 70));

        tempPanel4.setBackground(new java.awt.Color(51, 51, 51));
        tempPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F3TempVar1.setEditable(false);
        F3TempVar1.setBackground(new java.awt.Color(0, 102, 0));
        F3TempVar1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        F3TempVar1.setForeground(new java.awt.Color(255, 255, 255));
        F3TempVar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F3TempVar1.setText("26°");
        F3TempVar1.setBorder(null);
        F3TempVar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3TempVar1ActionPerformed(evt);
            }
        });
        tempPanel4.add(F3TempVar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        F2TempLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        F2TempLabel2.setForeground(new java.awt.Color(255, 255, 255));
        F2TempLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F2TempLabel2.setText("TEMP C°");
        tempPanel4.add(F2TempLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        F3Panel1.add(tempPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 70));

        humPanel4.setBackground(new java.awt.Color(51, 51, 51));
        humPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F3HumVar1.setEditable(false);
        F3HumVar1.setBackground(new java.awt.Color(0, 102, 0));
        F3HumVar1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        F3HumVar1.setForeground(new java.awt.Color(255, 255, 255));
        F3HumVar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F3HumVar1.setText("65%");
        F3HumVar1.setBorder(null);
        F3HumVar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3HumVar1ActionPerformed(evt);
            }
        });
        humPanel4.add(F3HumVar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        GenHumLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        GenHumLabel4.setForeground(new java.awt.Color(255, 255, 255));
        GenHumLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenHumLabel4.setText("HUMEDAD");
        humPanel4.add(GenHumLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 80, 40));

        F3Panel1.add(humPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 70));

        F1Estado3.setEditable(false);
        F1Estado3.setBackground(new java.awt.Color(0, 153, 51));
        F1Estado3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        F1Estado3.setForeground(new java.awt.Color(255, 255, 255));
        F1Estado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F1Estado3.setText("Estado");
        F1Estado3.setBorder(null);
        F3Panel1.add(F1Estado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 110, -1));

        mainPanel.add(F3Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 110, 420));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectorEstado.setBackground(new java.awt.Color(102, 102, 102));
        selectorEstado.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        selectorEstado.setForeground(new java.awt.Color(255, 255, 255));
        selectorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Germinacion", "Plantula", "EstadoVegetativo", "Maduracion", "Floracion" }));
        selectorEstado.setBorder(null);
        selectorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(selectorEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 270, 30));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cambiar Estado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 310, 30));

        changeFilaBtn.setBackground(new java.awt.Color(102, 102, 102));
        changeFilaBtn.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        changeFilaBtn.setForeground(new java.awt.Color(255, 255, 255));
        changeFilaBtn.setText("CAMBIAR");
        changeFilaBtn.setBorder(null);
        changeFilaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFilaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(changeFilaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 130, 50));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccionar Fila");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 30));

        selectorFila.setBackground(new java.awt.Color(102, 102, 102));
        selectorFila.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        selectorFila.setForeground(new java.awt.Color(255, 255, 255));
        selectorFila.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fila 1", "Fila 2", "Fila 3", "Fila 4", " " }));
        selectorFila.setBorder(null);
        selectorFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorFilaActionPerformed(evt);
            }
        });
        jPanel1.add(selectorFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        changeFilaBtn1.setBackground(new java.awt.Color(102, 102, 102));
        changeFilaBtn1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        changeFilaBtn1.setForeground(new java.awt.Color(255, 255, 255));
        changeFilaBtn1.setText("CAMBIAR");
        changeFilaBtn1.setBorder(null);
        changeFilaBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFilaBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(changeFilaBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 130, 50));

        jTextField1.setEditable(false);
        jTextField1.setText("Fila 1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fila:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 80, 30));

        jTextField2.setEditable(false);
        jTextField2.setText("Germinacion");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 130, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 80, 30));

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 290, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorEstadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_selectorEstadoActionPerformed

    private void f2HumVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2HumVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2HumVarActionPerformed

    private void selectorFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorFilaActionPerformed

    private void GenTempVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenTempVarActionPerformed
        //int numTemp = moduloArduino.getPromedioTemperatura();
        //String number = String.valueOf(numTemp);
        GenTempVar.setText("highiv");
    }//GEN-LAST:event_GenTempVarActionPerformed

    private void GenHumVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenHumVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenHumVarActionPerformed

    private void GenPHVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenPHVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenPHVarActionPerformed

    private void F1TempVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1TempVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1TempVarActionPerformed

    private void f1HumVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1HumVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1HumVarActionPerformed

    private void F1PhVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1PhVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1PhVarActionPerformed

    private void f2TempVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2TempVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2TempVarActionPerformed

    private void f2PhVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2PhVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2PhVarActionPerformed

    private void F3TempVar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3TempVar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F3TempVar1ActionPerformed

    private void F3HumVar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3HumVar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F3HumVar1ActionPerformed

    private void F3PhVar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3PhVar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F3PhVar1ActionPerformed

    private void F4TEMPVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4TEMPVARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F4TEMPVARActionPerformed

    private void F4HUMVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4HUMVARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F4HUMVARActionPerformed

    private void F4PHVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4PHVARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F4PHVARActionPerformed

    private void changeFilaBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFilaBtn1ActionPerformed
        int x = selectorFila.getSelectedIndex();

        if (x == 0){
            jTextField1.setText("Fila 1");
            fila = 0;
        }else if (x == 1){
            jTextField1.setText("Fila 2");
            fila = 1;
        }else if (x == 2){
            jTextField1.setText("Fila 3");
            fila = 2;
        }else if (x == 3){
            jTextField1.setText("Fila 4");
            fila = 3;
        }
    }//GEN-LAST:event_changeFilaBtn1ActionPerformed

    private void changeFilaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFilaBtnActionPerformed
        //jTextField2
        int estado = 0;
        int Y = selectorEstado.getSelectedIndex();
        if (Y == 0){
            jTextField2.setText("Germinacion");
            
            estado = 0;
        }else if (Y == 1){
            jTextField2.setText("Plantula");
            estado = 1;
        }else if (Y == 2){
            jTextField2.setText("Estado Vegetativo");
            estado = 2;
        }else if (Y == 3){
            jTextField2.setText("Maduracion");
            estado = 3;
        }else if (Y == 4){
            jTextField2.setText("Floracion");
            estado = 4;
        }
        
        if (fila == 0 && estado == 0){
            F1Estado1.setText("Germinacion");
        }else if(fila == 0 && estado == 1){
            F1Estado1.setText("Plantula");
        }else if(fila == 0 && estado == 2){
            F1Estado1.setText("Estado Vegetativo");
        }else if(fila == 0 && estado == 3){
            F1Estado1.setText("Maduracion");
        }else if(fila == 0 && estado == 4){
            F1Estado1.setText("Floracion");
        }
        
        if (fila == 1 && estado == 0){
            F1Estado2.setText("Germinacion");
        }else if(fila == 1 && estado == 1){
            F1Estado2.setText("Plantula");
        }else if(fila == 1 && estado == 2){
            F1Estado2.setText("Estado Vegetativo");
        }else if(fila == 1 && estado == 3){
            F1Estado2.setText("Maduracion");
        }else if(fila == 1 && estado == 4){
            F1Estado2.setText("Floracion");
        }
        
        if (fila == 2 && estado == 0){
            F1Estado3.setText("Germinacion");
        }else if(fila == 2 && estado == 1){
            F1Estado3.setText("Plantula");
        }else if(fila == 2 && estado == 2){
            F1Estado3.setText("Estado Vegetativo");
        }else if(fila == 2 && estado == 3){
            F1Estado3.setText("Maduracion");
        }else if(fila == 2 && estado == 4){
            F1Estado3.setText("Floracion");
        }
        
        if (fila == 3 && estado == 0){
            F1Estado.setText("Germinacion");
        }else if(fila == 3 && estado == 1){
            F1Estado.setText("Plantula");
        }else if(fila == 3 && estado == 2){
            F1Estado.setText("Estado Vegetativo");
        }else if(fila == 3 && estado == 3){
            F1Estado.setText("Maduracion");
        }else if(fila == 3 && estado == 4){
            F1Estado.setText("Floracion");
        }
        
    }//GEN-LAST:event_changeFilaBtnActionPerformed


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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField F1Estado;
    private javax.swing.JTextField F1Estado1;
    private javax.swing.JTextField F1Estado2;
    private javax.swing.JTextField F1Estado3;
    private javax.swing.JPanel F1Panel;
    private javax.swing.JTextField F1PhVar;
    private javax.swing.JLabel F1TempLabel;
    private javax.swing.JTextField F1TempVar;
    private javax.swing.JPanel F2Panel;
    private javax.swing.JLabel F2TempLabel;
    private javax.swing.JLabel F2TempLabel1;
    private javax.swing.JLabel F2TempLabel2;
    private javax.swing.JTextField F3HumVar1;
    private javax.swing.JPanel F3Panel;
    private javax.swing.JPanel F3Panel1;
    private javax.swing.JTextField F3PhVar1;
    private javax.swing.JTextField F3TempVar1;
    private javax.swing.JTextField F4HUMVAR;
    private javax.swing.JTextField F4PHVAR;
    private javax.swing.JTextField F4TEMPVAR;
    private javax.swing.JLabel GenHumLabel;
    private javax.swing.JLabel GenHumLabel1;
    private javax.swing.JLabel GenHumLabel2;
    private javax.swing.JLabel GenHumLabel3;
    private javax.swing.JLabel GenHumLabel4;
    private javax.swing.JTextField GenHumVar;
    private javax.swing.JLabel GenPHLabel;
    private javax.swing.JTextField GenPHVar;
    private javax.swing.JLabel GenTempLabel;
    private javax.swing.JTextField GenTempVar;
    private javax.swing.JButton changeFilaBtn;
    private javax.swing.JButton changeFilaBtn1;
    private javax.swing.JTextField f1HumVar;
    private javax.swing.JLabel f1PhLabel;
    private javax.swing.JTextField f2HumVar;
    private javax.swing.JLabel f2Label;
    private javax.swing.JLabel f2Label1;
    private javax.swing.JLabel f2Label2;
    private javax.swing.JLabel f2PhLabel;
    private javax.swing.JLabel f2PhLabel1;
    private javax.swing.JLabel f2PhLabel2;
    private javax.swing.JTextField f2PhVar;
    private javax.swing.JTextField f2TempVar;
    private javax.swing.JLabel fila1Label;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel generalLabel;
    private javax.swing.JPanel generalPanel;
    private javax.swing.JPanel header;
    private javax.swing.JPanel humPanel;
    private javax.swing.JPanel humPanel1;
    private javax.swing.JPanel humPanel2;
    private javax.swing.JPanel humPanel3;
    private javax.swing.JPanel humPanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pHPanel;
    private javax.swing.JPanel pHPanel1;
    private javax.swing.JPanel pHPanel2;
    private javax.swing.JPanel pHPanel3;
    private javax.swing.JPanel pHPanel4;
    private javax.swing.JComboBox<String> selectorEstado;
    private javax.swing.JComboBox<String> selectorFila;
    private javax.swing.JPanel tempPanel;
    private javax.swing.JPanel tempPanel1;
    private javax.swing.JPanel tempPanel2;
    private javax.swing.JPanel tempPanel3;
    private javax.swing.JPanel tempPanel4;
    private javax.swing.JLabel title_HortiDroid;
    // End of variables declaration//GEN-END:variables
}
