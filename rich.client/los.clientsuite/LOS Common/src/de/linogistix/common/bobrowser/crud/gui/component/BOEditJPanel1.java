/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.common.bobrowser.crud.gui.component;

import de.linogistix.common.bobrowser.crud.gui.object.BOEditNode;
import de.linogistix.common.bobrowser.bo.editor.BOEditorHeader;
import de.linogistix.common.res.CommonBundleResolver;
import javax.swing.SwingUtilities;
import org.openide.explorer.propertysheet.PropertySheet;
import org.openide.nodes.Node;
import org.openide.util.NbBundle;

/**
 *
 * @author  trautm
 */
public class BOEditJPanel1 extends javax.swing.JPanel {
  
  BOEditNode node;
  
  /**
   * Edits new form BOEditJPanel1
   */
  public BOEditJPanel1(BOEditNode node) {
    
    this.node= node;
    
    initComponents();
    initPropertySheet();
    BOEditorHeader h = new BOEditorHeader(node);
    headerPanel.add(h);
    
    setName(NbBundle.getMessage(CommonBundleResolver.class,"BOEditWizard.Title"));
    
  }
  
  private void initPropertySheet(){
    
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        PropertySheet ps;
        ps = new PropertySheet();
        ps.setNodes(new Node[]{node});
        editorPanel.add(ps);
      }
    });
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    headerPanel = new javax.swing.JPanel();
    editorPanel = new javax.swing.JPanel();

    setLayout(new java.awt.BorderLayout());

    headerPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
    add(headerPanel, java.awt.BorderLayout.NORTH);

    editorPanel.setPreferredSize(new java.awt.Dimension(300, 400));
    editorPanel.setLayout(new java.awt.BorderLayout());
    add(editorPanel, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel editorPanel;
  private javax.swing.JPanel headerPanel;
  // End of variables declaration//GEN-END:variables
  
  boolean implIsValid() {
    return true;
  }
  
  void implReadSettings(Object settings) {
    
    
  }
  
  void implStoreSettings(Object settings) {
    BOEditWizard w = (BOEditWizard)settings;
  }
}