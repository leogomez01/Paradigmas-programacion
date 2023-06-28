package proyectofinal;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


public class preguntas extends javax.swing.JFrame {

    String[] questions = {"¿Cuál es el país con la superficie terrestre más grande del mundo?",
        "¿Quién escribió la obra de teatro \"Romeo y Julieta\"?",
        "¿Cuál es el país que tiene la forma de bota en el mapa?",
        "¿Cuál es el desierto más grande del mundo?",
        "¿Cuál es el elemento químico con el número atómico 79?",
        "¿En qué país se encuentra la Torre Eiffel?",
        "¿Cuál es el río más largo de Europa?",
        "¿Qué artista pintó la famosa obra \"La noche estrellada\"?",
        "¿Cuál es el país donde se originó el tango?",
        "¿En qué año se llevó a cabo la Revolución Rusa?",
        "¿Cuál es el océano más grande del mundo?",
        "¿Quién escribió la novela \"Cien años de soledad\"?",
        "¿Cuál es la montaña más alta del mundo?",
        "¿Cuál es la montaña más alta del mundo?",};
    String[][] options = {{"a) Estados Unidos","b) Rusia","c) China","d) Canadá","b) Rusia"},
        {"a) William Shakespeare","b) Miguel de Cervantes","c) Federico García Lorca","d) Johann Wolfgang von Goethe","a) William Shakespeare"},
        {"a) España","b) Italia","c) Francia","d) Grecia","b) Italia"},
        {"a) Desierto del Sahara","b) Desierto de Gobi","c) Desierto de Atacama","d) Desierto de Kalahari","a) Desierto del Sahara"},
        {"a) Plata","b) Oro","c) Hierro","d) Cobre","b), b) Oro"},
        {"a) Francia","b) Italia","c) Reino Unido","d) Estados Unidos","a) Francia"},
        {"a) Danubio","b) Volga","c) Rin","d) Sena","b) Volga"},
        {"a) Claude Monet","b) Pablo Picasso","c) Vincent van Gogh","d) Salvador Dalí","c) Vincent van Gogh"},
        {"a) Argentina","b) Brasil","c) Uruguay","d) España","c) Uruguay"},
        {"a) 1905","a) 1905","c) 1921","d) 1933","b) 1917"},
        {"a) Océano Atlántico","b) Océano Índico","c) Océano Pacífico","d) Océano Ártico","c) Océano Pacífico"},
        {"a) Gabriel García Márquez","b) Mario Vargas Llosa","c) Julio Cortázar","d) Pablo Neruda","a) Gabriel García Márquez"},
        {"a) Montaña Everest","b) Montaña K2","c) Montaña Kangchenjunga","d) Montaña Makalu","a) Montaña Everest"},
        {"a) China","b) India","c) Japón","d) Corea del Sur","a) China"}};
    int index = 0, correct = 0;
    
    ButtonGroup bg = new ButtonGroup();
    
    
    
   
    public preguntas() {
        initComponents();
        
        bg.add(jRadioButton1_);
        bg.add(jRadioButton2_);
        bg.add(jRadioButton3_);
        bg.add(jRadioButton4_);
        
        jButton_Next_QActionPerformed(null);
    }
    
    public void getSelectedOption(JRadioButton rbtn)
    {
        System.out.println(rbtn.getText());
        System.out.println(options[index][4]);
        if(rbtn.getText().equals(options[index][4]))
        {
            correct++;
        }
        index++;
        enableRbuttons(false);
    }       
    
    public void enableRbuttons(boolean yes_or_no)
    {
        jRadioButton1_.setEnabled(yes_or_no);
        jRadioButton2_.setEnabled(yes_or_no);
        jRadioButton3_.setEnabled(yes_or_no);
        jRadioButton4_.setEnabled(yes_or_no);
    }
      
    
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel_Q_container = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();
        jRadioButton1_ = new javax.swing.JRadioButton();
        jRadioButton2_ = new javax.swing.JRadioButton();
        jRadioButton3_ = new javax.swing.JRadioButton();
        jRadioButton4_ = new javax.swing.JRadioButton();
        jButton_Next_Q = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Q_container.setBackground(new java.awt.Color(204, 204, 204));

        Lbl_Question.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("pregunta");
        Lbl_Question.setToolTipText("");

        javax.swing.GroupLayout jPanel_Q_containerLayout = new javax.swing.GroupLayout(jPanel_Q_container);
        jPanel_Q_container.setLayout(jPanel_Q_containerLayout);
        jPanel_Q_containerLayout.setHorizontalGroup(
            jPanel_Q_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_containerLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(Lbl_Question)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Q_containerLayout.setVerticalGroup(
            jPanel_Q_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_containerLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(Lbl_Question)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jRadioButton1_.setText("jRadioButton1");
        jRadioButton1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_ActionPerformed(evt);
            }
        });

        jRadioButton2_.setText("jRadioButton2");
        jRadioButton2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_ActionPerformed(evt);
            }
        });

        jRadioButton3_.setText("jRadioButton3");
        jRadioButton3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_ActionPerformed(evt);
            }
        });

        jRadioButton4_.setText("jRadioButton4");
        jRadioButton4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_ActionPerformed(evt);
            }
        });

        jButton_Next_Q.setBackground(new java.awt.Color(0, 0, 255));
        jButton_Next_Q.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next_Q.setText("Next");
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Q_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Q_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed
        
        
                if(jButton_Next_Q.getText() .equals("restart The Quiz"))
                {
                    jButton_Next_Q.setText("Next");
                    jPanel_Q_container.setBackground(new java.awt.Color(204,204,204));
                    index = 0;
                    correct  = 0;        
                }
                
                if(index == questions.length)
                {
                    
                    Lbl_Question.setText("your score is: "+correct+"/"+questions.length);
                    if(correct >= (float) questions.length/2)
                    {
                        jPanel_Q_container.setBackground(Color.green);
                    }
                    else{
                        jPanel_Q_container.setBackground(Color.red);
                    }
                    
                    jButton_Next_Q.setText("restart The Quiz");
                }
        
                else{
                    enableRbuttons(true);

                Lbl_Question.setText(questions[index]);
                jRadioButton1_.setText(options[index][0]);
                jRadioButton2_.setText(options[index][1]);
                jRadioButton3_.setText(options[index][2]);
                jRadioButton4_.setText(options[index][3]);

                if(index == questions.length-1){
                    jButton_Next_Q.setText("Finish and the see Result ");
                }
                
                }
                bg.clearSelection();
        
    }//GEN-LAST:event_jButton_Next_QActionPerformed

    private void jRadioButton1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_ActionPerformed

        getSelectedOption(jRadioButton1_);
    }//GEN-LAST:event_jRadioButton1_ActionPerformed

    private void jRadioButton2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_ActionPerformed
        
        getSelectedOption(jRadioButton2_);
    }//GEN-LAST:event_jRadioButton2_ActionPerformed

    private void jRadioButton3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_ActionPerformed
        
        getSelectedOption(jRadioButton3_);
    }//GEN-LAST:event_jRadioButton3_ActionPerformed

    private void jRadioButton4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_ActionPerformed
        
        getSelectedOption(jRadioButton4_);
    }//GEN-LAST:event_jRadioButton4_ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_Q_container;
    private javax.swing.JRadioButton jRadioButton1_;
    private javax.swing.JRadioButton jRadioButton2_;
    private javax.swing.JRadioButton jRadioButton3_;
    private javax.swing.JRadioButton jRadioButton4_;
    // End of variables declaration//GEN-END:variables
}
