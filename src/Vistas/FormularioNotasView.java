/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author busto
 */
public class FormularioNotasView extends javax.swing.JInternalFrame {

    private List<Alumno> listaA;
    private List<Materia> listaM;

    private List<Inscripcion> listaI;
    private InscripcionData inscData;
    private AlumnoData aData;
    private MateriaData mData;

    private DefaultTableModel modelo;

    public FormularioNotasView() {
        initComponents();
        aData = new AlumnoData();
        inscData = new InscripcionData();
        listaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        cargaAlumnos();
        armarCabeceraTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlAlumno = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jlCargaDeNotas = new javax.swing.JLabel();

        setTitle("Carga de Notas");

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabla.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jtTabla);
        jtTabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });

        jlAlumno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAlumno.setText("Alumno");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jlCargaDeNotas.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        jlCargaDeNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCargaDeNotas.setText("CARGA DE NOTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCargaDeNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jlAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jlCargaDeNotas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlumno)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirMouseClicked

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        // TODO add your handling code here:     
        borrarFilaTabla();
        cargaDatosInscriptas();

    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
        int cantF = jtTabla.getRowCount();

        for (int i = 0; i < cantF; i++) {
            int idMateria = Integer.parseInt(jtTabla.getValueAt(i, 0).toString());
            String nombreMateria = (jtTabla.getValueAt(i, 1)).toString();
            Double nota = null;
            try {
                nota = Double.parseDouble(jtTabla.getValueAt(i, 2).toString());
                System.out.println("Actualizando nota: Alumno ID: " + selec.getIdAlumno() + ", Materia ID: " + idMateria + ", Nota: " + nota);
                boolean actualizado = inscData.actualizarNota(selec.getIdAlumno(), idMateria, nota);
                if (!actualizado) {
                    JOptionPane.showMessageDialog(this, "Error al actualizar la nota de la materia " + nombreMateria);
                } else {
                    System.out.println("Nota actualizada exitosamente.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Nota inválida para la materia " + nombreMateria);
                continue;
            } 
        }
      
        JOptionPane.showMessageDialog(this, "Notas actualizadas exitosamente.");

    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlCargaDeNotas;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables

    private void cargaAlumnos() {
        for (Alumno item : listaA) {
            jcbAlumno.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtTabla.setModel(modelo);
    }

    private void cargaDatosInscriptas() {

        try {
            Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
            listaI = inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
            for (Inscripcion insc : listaI) {
                modelo.addRow(new Object[]{insc.getMateria().getIdMateria(), insc.getMateria().getNombre(), insc.getNota()});
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
