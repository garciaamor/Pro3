/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto3eva;

import java.util.ArrayList;
import metodos.MetodosMySQL;
/**
 *
 * @author mmoureperez
 */
public class Preguntas extends javax.swing.JFrame {
MetodosMySQL lib = new MetodosMySQL();
ArrayList respuestas= new ArrayList();
ArrayList actoresFalsos= new ArrayList();
    /**
     * Creates new form JFrame
     */
    protected static int RES;
    protected static int CONTADORA;
    protected static int CONTADORB;
    protected  String USUARIO;
    private String a="1";
    private String b="2";
    private String c="3";
    
    public Preguntas() {
        initComponents();
        pregPel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lPregunta = new javax.swing.JLabel();
        lRespuestaA = new javax.swing.JLabel();
        lRespuestaB = new javax.swing.JLabel();
        lRespuestaC = new javax.swing.JLabel();
        bA = new javax.swing.JButton();
        bB = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        bsiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPregunta.setText("jLabel");

        lRespuestaA.setText("jLabel2");

        lRespuestaB.setText("jLabel1");

        lRespuestaC.setText("jLabel1");

        bA.setText("A");
        bA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAActionPerformed(evt);
            }
        });

        bB.setText("B");
        bB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBActionPerformed(evt);
            }
        });

        bC.setText("C");
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        bsiguiente.setText("Siguiente");
        bsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bsiguiente)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lRespuestaA, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(lRespuestaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lRespuestaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bA)
                                .addComponent(bB)
                                .addComponent(bC))
                            .addGap(93, 93, 93)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRespuestaA)
                    .addComponent(bA))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRespuestaB)
                    .addComponent(bB))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lRespuestaC)
                    .addComponent(bC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(bsiguiente)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAActionPerformed
        RES=1;
        desarrollo();
        bA.setEnabled(false);
    }//GEN-LAST:event_bAActionPerformed

    private void bBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBActionPerformed
        RES=2;
        desarrollo();
        bB.setEnabled(false);
    }//GEN-LAST:event_bBActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        RES=3;
        desarrollo();
        bC.setEnabled(false);
    }//GEN-LAST:event_bCActionPerformed

    private void bsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsiguienteActionPerformed
        recuento();
    }//GEN-LAST:event_bsiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bA;
    private javax.swing.JButton bB;
    private javax.swing.JButton bC;
    private javax.swing.JButton bsiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lPregunta;
    private javax.swing.JLabel lRespuestaA;
    private javax.swing.JLabel lRespuestaB;
    private javax.swing.JLabel lRespuestaC;
    // End of variables declaration//GEN-END:variables

public void pregPel(){
    
    
    lib.Conectar("jdbc:mysql://10.0.0.254/jgarciaamor","jgarciaamor","jgarciaamor");
    String preg=lib.consultaDatos("Peliculas WHERE id=10",2,"Titulo");
    String codAc=lib.consultaDatos("Peliculas WHERE id=10",2,"CODAC1");
    lib.desconectar();
   respuestasAleatorias(codAc); 
               
    lPregunta.setText("Que actor protagoniza "+preg);
    lRespuestaA.setText("a)"+a);
    lRespuestaB.setText("b)"+b);
    lRespuestaC.setText("c)"+c);
    lib.desconectar();
    respuestas.clear();
    actoresFalsos.clear();
}
public void desarrollo(){
    switch(RES){
        case 1: CONTADORA++;
            break;
        case 2: CONTADORB++;
            break;
        case 3: CONTADORB++;
            break;
    }
}

public  void respuestasAleatorias(String cod){
    
        int i ;
        int valores;
        String sValor="";
     lib.Conectar("jdbc:mysql://10.0.0.254/jgarciaamor","jgarciaamor","jgarciaamor");
     String correcta=lib.consultaDatos("Actores WHERE CODAC='"+cod+"'",2,"Nombre");
     
     String falsa1=lib.consultaDatos("ActoresB WHERE CODAC='B1'",2,"Nombre");
     
     String falsa2=lib.consultaDatos("ActoresB WHERE CODAC='B3'",2,"Nombre");
       lib.desconectar();
    do{    
    for ( i = 0; i < 1; i++) {
        
        valores=(int)Math.floor(Math.random() * 3)+1;
        
    while(respuestas.contains(valores)){
        
      valores=(int)Math.floor(Math.random() * 3)+1;
        
    }    
    respuestas.add(valores);
     sValor=Integer.toString(valores);}
    
    if( a.equals(sValor)){
         a=correcta;
    }else if(b.equals(sValor)){
        b=falsa1;
        
    }else{
        c=falsa2;
       
    }
    
         
    }while(i<3);
    
   
}
public  int aleatorios(){
    int valor=0;
        
    for (int i = 0; i < 2; i++) {
        
        valor=(int)Math.floor(Math.random() * 13)+1;
        
    while(actoresFalsos.contains(valor)){
        
      valor=(int)Math.floor(Math.random() * 13)+1;
        
    }    
    actoresFalsos.add(valor);
        
    }return valor;
   }
public void recuento(){
    Resultado r=new Resultado();
    Usuario u= new Usuario();
    r.setVisible(true);
      
    r.aciertos.setText("Aciertos: "+Integer.toString(CONTADORA));
    r.fallos.setText("Fallos: "+Integer.toString(CONTADORB));
    lib.Conectar("jdbc:mysql://10.0.0.254/jgarciaamor","jgarciaamor","jgarciaamor");
    String id=lib.consultaDatos("Usuarios WHERE Nombre='"+USUARIO+"'",2,"Id");
    System.out.println("***"+id);
    System.out.println(USUARIO);
    lib.actualizar("Usuarios",id, "Puntuacion", Integer.toString(CONTADORA));
    lib.desconectar();
    
}

}
