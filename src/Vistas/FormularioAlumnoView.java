/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author busto
 */
public class FormularioAlumnoView extends javax.swing.JInternalFrame {

    private TreeSet<Alumno> alumnos;

    public FormularioAlumnoView(TreeSet<Alumno> alumnos) {
        initComponents();
        this.alumnos = alumnos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlAlumno = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlFechaNac = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jrbEstado = new javax.swing.JRadioButton();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        jrbEstado2 = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Alumno");

        jlAlumno.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        jlAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAlumno.setText("ALUMNO");

        jlDNI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlDNI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDNI.setText("DNI");

        jlApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlApellido.setText("Apellido");

        jlNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombre.setText("Nombre");

        jlEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEstado.setText("Estado");

        jlFechaNac.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlFechaNac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFechaNac.setText("Fecha de Nacimiento");

        jtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNIActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbGuardar.setText("Guardar");

        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbEliminar.setText("Eliminar");

        jbSalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbSalir.setText("Salir");

        jbBuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrbEstado.setText("Activo");

        jrbEstado2.setText("NO Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbEliminar)
                                                .addGap(48, 48, 48)
                                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(52, 52, 52)
                                                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jrbEstado)
                                                .addGap(53, 53, 53)
                                                .addComponent(jrbEstado2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbGuardar)
                                            .addComponent(jlFechaNac))
                                        .addGap(26, 26, 26)
                                        .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jbNuevo)
                                .addGap(91, 91, 91)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDNI)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jrbEstado)
                    .addComponent(jrbEstado2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFechaNac))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        if (jtDNI.getText().isEmpty()) {
            return;
        }
        if (alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "no hay alumnos para mostrar");
            return;
        }
        int dniBuscado = Integer.parseInt(jtDNI.getText());
        Alumno alumno = new Alumno();
        alumno = buscarPorDni(dniBuscado);

        if (alumno != null) {
            jtDNI.setText(String.valueOf(alumno.getDni()));
            jtApellido.setText(String.valueOf(alumno.getApellido()));
            jtNombre.setText(String.valueOf(alumno.getNombre()));
            jrbEstado.setSelected(alumno.isActivo());
            LocalDate localDate = alumno.getFechaNac();
            Date fecha = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdcFechaNac.setDate(fecha);
        }
        else{
            JOptionPane.showMessageDialog(this,"No se encuentra alumno con el DNI "+dniBuscado);
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNIActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevoActionPerformed

    private Alumno buscarPorDni(int dni) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni() == dni) {
                return alumno;
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFechaNac;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JRadioButton jrbEstado2;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
