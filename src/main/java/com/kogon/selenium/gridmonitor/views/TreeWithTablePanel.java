/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kogon.selenium.gridmonitor.views;

/**
 *
 * @author developer
 */
public class TreeWithTablePanel extends javax.swing.JPanel {

    /**
     * Creates new form TreeWithTablePanel
     */
    public TreeWithTablePanel() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        theTree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        theTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jScrollPane1.setViewportView(theTree);

        jSplitPane1.setTopComponent(jScrollPane1);

        theTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(theTable);

        jSplitPane1.setRightComponent(jScrollPane2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable theTable;
    private javax.swing.JTree theTree;
    // End of variables declaration//GEN-END:variables
	public javax.swing.JTable getTable() {
		return theTable;
	}

	public void setTable(javax.swing.JTable aTable) {
		theTable = aTable;
	}

	public javax.swing.JTree getTree() {
		return theTree;
	}

	public void setTree(javax.swing.JTree aTree) {
		theTree = aTree;
	}
}
