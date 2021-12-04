/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author usuario
 */
public class Ejercicio15 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio_15
     */
    public Ejercicio15() {
        initComponents();
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
        codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        servi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jLabel1.setText("Codigo del libro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 40, 120, 14);
        getContentPane().add(codigo);
        codigo.setBounds(60, 80, 150, 30);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 140, 69, 24);

        jLabel2.setText("Tipo de servicio:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 30, 120, 20);
        getContentPane().add(servi);
        servi.setBounds(300, 80, 130, 30);

        datos.setColumns(20);
        datos.setRows(5);
        jScrollPane1.setViewportView(datos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 180, 390, 90);

        jLabel3.setText("1. Prestamo 2. Entrega");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 50, 170, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cod= Integer.parseInt(codigo.getText());
        int n= Integer.parseInt(servi.getText());
        int[] vector = new int[3];
        vector= descomponer(codigo.getText());
        
        if (n==1){
            if(( validar_codigo(cod)==1) && (prestamo(vector)==1)){
                datos.setText("Usted debe pagar: " + recoleccion(vector));
            }
            else{
                datos.setText("No se puede prestar el libro ");
            }
        }
        else{
            if(n==2){
                 datos.setText("Libro entregado ");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
       public static int validar_codigo(int cod){
       int z=Integer.toString(cod).length();
       if(z==8){
           return 1;
       }
       return 0;
       }
       
       public static int[] descomponer(String codigo){
         int area = 0, cantl = 0, codl = 0;
        area = Integer.parseInt(codigo.substring(0, 3));

        cantl =  Integer.parseInt(codigo.substring(3, 5));

        codl =  Integer.parseInt(codigo.substring(5, 8));
        int[] newArray = {area, cantl, codl};
        return newArray;
       }
       
       public static int prestamo (int [] vector){
           if (vector[0]==101 || vector[0]==102 || vector[0]==104){
               return 1;
           }
           return 0;
       }
       
       public static int  recoleccion (int[] vector){
           if (vector[1]>=1 && vector[1]<=2){
            int valor=2000;
            return valor;
           }
           else{
            if (vector[1]>=3 && vector[1]<=6){
                int valor=1000;
                return valor;
            }
            else{
                if (vector[1]>6){
                int valor=500;
                return valor;
                }
            }
           }
           return 0;
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
            java.util.logging.Logger.getLogger(Ejercicio15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JTextArea datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField servi;
    // End of variables declaration//GEN-END:variables
}