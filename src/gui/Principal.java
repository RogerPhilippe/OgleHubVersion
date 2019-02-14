/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import auxiliar.Auxiliar;
import auxiliar.Propriedades;
import auxiliar.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roger Philippe - OBSERVE: Este código está sob a liçenca GPLv3.
 * Seu uso e distribuição e gratuido, respeirando as regras da Licença Pública Geral GNU (GPL).
 */
public class Principal extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private File arquivoVersionar, arquivoVersionamento, caminhoAbisoluto;
    private int versao, progresso;
    private Auxiliar auxiliar;
    private String alteracoes = "null";
    private final String icoPath;

    private Principal() {
        initComponents();
        icoPath = Utils.getInstance().getAppPath("asset") +  "\\ogleV.png";
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
        pnlVersionamento = new javax.swing.JPanel();
        btnAlterarVersionamento = new javax.swing.JButton();
        txtVersionamento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnIniciarVers = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        prgsVersionamento = new javax.swing.JProgressBar();
        jPanel5 = new javax.swing.JPanel();
        btnAlterarVersionar = new javax.swing.JButton();
        txtVersionar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPnlTerminal = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        txtAlteracoes = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnVersionar = new javax.swing.JMenuItem();
        mnNovo = new javax.swing.JMenuItem();
        mnCarregar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setTitle("ogLehub Versions beta!");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlVersionamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Versionamento em:"));
        pnlVersionamento.setPreferredSize(new java.awt.Dimension(98, 104));

        btnAlterarVersionamento.setText("Alterar");
        btnAlterarVersionamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarVersionamentoMouseEntered(evt);
            }
        });
        btnAlterarVersionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVersionamentoActionPerformed(evt);
            }
        });

        txtVersionamento.setEditable(false);
        txtVersionamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtVersionamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtVersionamentoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlVersionamentoLayout = new javax.swing.GroupLayout(pnlVersionamento);
        pnlVersionamento.setLayout(pnlVersionamentoLayout);
        pnlVersionamentoLayout.setHorizontalGroup(
            pnlVersionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVersionamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVersionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVersionamentoLayout.createSequentialGroup()
                        .addGap(0, 595, Short.MAX_VALUE)
                        .addComponent(btnAlterarVersionamento))
                    .addComponent(txtVersionamento))
                .addContainerGap())
        );
        pnlVersionamentoLayout.setVerticalGroup(
            pnlVersionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVersionamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVersionamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarVersionamento)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Versionar:"));
        jPanel2.setPreferredSize(new java.awt.Dimension(98, 104));

        btnIniciarVers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIniciarVers.setText("Versionar");
        btnIniciarVers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarVersMouseEntered(evt);
            }
        });
        btnIniciarVers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarVersActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Progresso..."));

        prgsVersionamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prgsVersionamentoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prgsVersionamento, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prgsVersionamento, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIniciarVers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIniciarVers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Versionar:"));
        jPanel5.setPreferredSize(new java.awt.Dimension(98, 104));

        btnAlterarVersionar.setText("Alterar");
        btnAlterarVersionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarVersionarMouseEntered(evt);
            }
        });
        btnAlterarVersionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVersionarActionPerformed(evt);
            }
        });

        txtVersionar.setEditable(false);
        txtVersionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtVersionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtVersionarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 595, Short.MAX_VALUE)
                        .addComponent(btnAlterarVersionar))
                    .addComponent(txtVersionar))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtVersionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarVersionar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Terminal:"));

        tPnlTerminal.setEditable(false);
        tPnlTerminal.setBackground(new java.awt.Color(0, 0, 0));
        tPnlTerminal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tPnlTerminal.setForeground(new java.awt.Color(204, 204, 204));
        tPnlTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tPnlTerminalMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tPnlTerminal);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Últimas Alterações"));

        txtAlteracoes.setEditable(false);
        txtAlteracoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAlteracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAlteracoesMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAlteracoes)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAlteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlVersionamento, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlVersionamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mnArquivo.setText("Arquivo");

        mnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnArquivo.add(mnSair);

        jMenuBar1.add(mnArquivo);

        jMenu2.setText("Editar");

        mnVersionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnVersionar.setText("Versionar");
        mnVersionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnVersionarMouseEntered(evt);
            }
        });
        mnVersionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVersionarActionPerformed(evt);
            }
        });
        jMenu2.add(mnVersionar);

        mnNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnNovo.setText("Novo");
        mnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnNovoMouseEntered(evt);
            }
        });
        mnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoActionPerformed(evt);
            }
        });
        jMenu2.add(mnNovo);

        mnCarregar.setText("Carregar");
        jMenu2.add(mnCarregar);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Sobre");

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarVersionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVersionamentoActionPerformed
        //Local para versionamento
        //Exibir mensagem no terminal
        mensagemTerminal("Alterando pasta para local do versionamento...");
        //FileChoose
        JFileChooser fCHPrincipal = new JFileChooser("");
        fCHPrincipal.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fCHPrincipal.showOpenDialog(this);
        //Coleta texto em lbVersionar
        String pastaAtual = txtVersionamento.getText();
        //Cria, exibe o fCHPrincipal e coleta pasta de retorno.
        try {
            File file = fCHPrincipal.getSelectedFile();
            String caminho = file.getPath() + "\\" + nomePasta();
            txtVersionamento.setText(caminho);
            File f = new File(caminho);
            arquivoVersionamento = f;
            caminhoAbisoluto = f;
            File pasta = new File(caminho);
            if (!pasta.exists()) {
                pasta.mkdir();
            }
        } catch (Exception e) {
            //Caso cancelar ou fechar fCHPrincipal
        }

        //Verifica se caminho foi alterado
        if (pastaAtual.equals(txtVersionamento.getText())) {
            //Exibir mensagem no terminal
            mensagemTerminal("Caminho para realizar versionamento não alterado!");
        } else //Exibir mensagem no terminal
        {
            mensagemTerminal("Caminho para realizar versionamento alterado!");
        }
    }//GEN-LAST:event_btnAlterarVersionamentoActionPerformed

    private void btnIniciarVersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarVersActionPerformed
        // TODO add your handling code here:
        alteracoes = JOptionPane.showInputDialog("Alterações");
        versionar();
        txtAlteracoes.setText(alteracoes);
    }//GEN-LAST:event_btnIniciarVersActionPerformed

    private void btnAlterarVersionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVersionarActionPerformed
        //Pasta que será versionada
        //Exibir mensagem no terminal
        mensagemTerminal("Alterando pasta para versionamento...");
        //FileChoose
        JFileChooser fCHPrincipal = new JFileChooser("");
        fCHPrincipal.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fCHPrincipal.showOpenDialog(this);
        //Coleta texto em lbVersionar
        String pastaAtual = txtVersionar.getText();
        //Cria, exibe o fCHPrincipal e coleta pasta de retorno.
        try {
            File file = fCHPrincipal.getSelectedFile();
            //Variael recebe arquivo (pasta)
            arquivoVersionar = file;
            txtVersionar.setText(file.getPath());
        } catch (Exception e) {
            //Caso cancelar ou fechar fCHPrincipal
        }

        //Verifica se caminho foi alterado
        if (pastaAtual.equals(txtVersionar.getText())) {
            //Exibir mensagem no terminal
            mensagemTerminal("Caminho para versionamento não alterado!");
        } else //Exibir mensagem no terminal
        {
            //Exibir mensagem no terminal
            mensagemTerminal("Caminho para versionamento alterado!");
        }
    }//GEN-LAST:event_btnAlterarVersionarActionPerformed

    private void txtVersionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVersionarMouseEntered
        txtVersionar.setToolTipText("Pasta para ser versionada.");
    }//GEN-LAST:event_txtVersionarMouseEntered

    private void btnAlterarVersionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarVersionarMouseEntered
        btnAlterarVersionar.setToolTipText("Alterar pasta versionada.");
    }//GEN-LAST:event_btnAlterarVersionarMouseEntered

    private void txtVersionamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVersionamentoMouseEntered
        txtVersionamento.setToolTipText("Local do versionamento.");
    }//GEN-LAST:event_txtVersionamentoMouseEntered

    private void btnAlterarVersionamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarVersionamentoMouseEntered
        btnAlterarVersionamento.setToolTipText("Alterar local para versionamento.");
    }//GEN-LAST:event_btnAlterarVersionamentoMouseEntered

    private void tPnlTerminalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPnlTerminalMouseEntered
        tPnlTerminal.setToolTipText("Terminal de exibição de eventos.");
    }//GEN-LAST:event_tPnlTerminalMouseEntered

    private void btnIniciarVersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarVersMouseEntered
        btnIniciarVers.setToolTipText("Iniciar versionamento.");
    }//GEN-LAST:event_btnIniciarVersMouseEntered

    private void prgsVersionamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prgsVersionamentoMouseEntered
        prgsVersionamento.setToolTipText("Barra de progresso do versionamento.");
    }//GEN-LAST:event_prgsVersionamentoMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        auxiliar = new Auxiliar();
        try {
            //Escrever dados vindos do arquivo propriedades
            Propriedades propriedades = new Propriedades();
            propriedades = auxiliar.lerProp();
            versao = propriedades.getVersao();
            alteracoes = propriedades.getAlteracoes();
            mensagemTerminal("Versão atual: " + versao);
            txtVersionar.setText(propriedades.getVersionar());
            txtVersionamento.setText(propriedades.getVersionamento());
            txtAlteracoes.setText(propriedades.getAlteracoes());
            //Transformando Strings vindas de propriedades em files
            arquivoVersionar = new File(propriedades.getVersionar());
            arquivoVersionamento = new File(propriedades.getVersionamento());
            caminhoAbisoluto = new File(propriedades.getVersionamento());
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Atualiza arquivo dado.properties
        auxiliar.escreverProp(versao, txtVersionar.getText(), txtVersionamento.getText(), txtAlteracoes.getText());
    }//GEN-LAST:event_formWindowClosing

    private void mnVersionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVersionarActionPerformed
        // TODO add your handling code here:
        versionar();
    }//GEN-LAST:event_mnVersionarActionPerformed

    private void mnVersionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnVersionarMouseEntered
        // TODO add your handling code here:
        mnVersionar.setToolTipText("Iniciar versionamento.");
    }//GEN-LAST:event_mnVersionarMouseEntered

    private void mnNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNovoMouseEntered
        // TODO add your handling code here:
        mnNovo.setToolTipText("Novo versionamento.");
    }//GEN-LAST:event_mnNovoMouseEntered

    private void mnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoActionPerformed
        // TODO add your handling code here:
        int escolha = JOptionPane.showConfirmDialog(mnNovo, "Deseja iniciar um novo versionamento?", "Novo versionamento", JOptionPane.YES_NO_OPTION);
        if (escolha == JOptionPane.YES_OPTION) {
            int altVersao = JOptionPane.showConfirmDialog(mnNovo, "Deseja definir a versão?", "Definir versão", JOptionPane.YES_NO_OPTION);
            if (altVersao == JOptionPane.YES_OPTION) {
                versao = Integer.parseInt(JOptionPane.showInputDialog(null, "Versão"));
            } else {
                versao = 1;
            }
            txtVersionar.setText("");
            txtVersionamento.setText("");
            arquivoVersionar = null;
            arquivoVersionamento = null;
            caminhoAbisoluto = null;
            progresso = 0;
            prgsVersionamento.setValue(progresso);
            tPnlTerminal.setText("");
            mensagemTerminal("Iniciado novo ciclo de versionamento!!");
            mensagemTerminal("Versão atual: " + versao);
        }
    }//GEN-LAST:event_mnNovoActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtAlteracoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlteracoesMouseEntered
        // TODO add your handling code here:
        txtAlteracoes.setToolTipText("Informações das alterações da versão anterior.");
    }//GEN-LAST:event_txtAlteracoesMouseEntered

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
        tray();
    }//GEN-LAST:event_formComponentHidden

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
        //this.setVisible(false);
    }//GEN-LAST:event_formWindowIconified

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarVersionamento;
    private javax.swing.JButton btnAlterarVersionar;
    private javax.swing.JButton btnIniciarVers;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnArquivo;
    private javax.swing.JMenuItem mnCarregar;
    private javax.swing.JMenuItem mnNovo;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenuItem mnVersionar;
    private javax.swing.JPanel pnlVersionamento;
    private javax.swing.JProgressBar prgsVersionamento;
    private javax.swing.JTextPane tPnlTerminal;
    private javax.swing.JTextField txtAlteracoes;
    private javax.swing.JTextField txtVersionamento;
    private javax.swing.JTextField txtVersionar;
    // End of variables declaration//GEN-END:variables

    //Versionar
    public void versionar() {
        //Exibe no terminal
        mensagemTerminal("Iniciado versionamento...");

        //Operação
        progresso = 0;
        prgsVersionamento.setValue(progresso);
        File diretorio = new File(arquivoVersionamento + "\\versao" + versao);
        if (diretorio.mkdir()) {
            arquivoVersionamento = diretorio;
            mensagemTerminal("Pasta versao" + versao + " criada com sucesso.");
        }
        try {
            if (copyDirectory(arquivoVersionar, arquivoVersionamento)) {
                prgsVersionamento.setValue(100);
                mensagemTerminal("Versionamento realizado com sucesso!");
                versao += 1;
                mensagemTerminal("Versão atual: " + versao);
            } else {
                mensagemTerminal("Erro ao tentar versionar!");
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            mensagemTerminal("Erro ao tentar versionar!");
        }
        arquivoVersionamento = caminhoAbisoluto;
    }

    //Metodo para copiar arquivos
    public static void copyFile(File source, File destination) throws IOException {
        if (destination.exists()) {
            destination.delete();
        }
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);
        } finally {
            if (sourceChannel != null && sourceChannel.isOpen()) {
                sourceChannel.close();
            }
            if (destinationChannel != null && destinationChannel.isOpen()) {
                destinationChannel.close();
            }
        }
    }

    public void mensagemTerminal(String msg) {
        //Exibir mensagem no terminal
        if (tPnlTerminal.getText().equals("")) {
            tPnlTerminal.setText(msg);
        } else {
            tPnlTerminal.setText(tPnlTerminal.getText() + "\n" + msg);
        }
    }

    //Metodo para copiar diretório
    public boolean copyDirectory(File srcDir, File dstDir) throws IOException {
        try {
            if (srcDir.isDirectory()) {
                if (!dstDir.exists()) {
                    dstDir.mkdir();
                }
                String[] children = srcDir.list();
                for (int i = 0; i < children.length; i++) {
                    copyDirectory(new File(srcDir, children[i]),
                            new File(dstDir, children[i]));
                    if (progresso < 90) {
                        prgsVersionamento.setValue(progresso);
                        progresso += 5;
                        System.out.println(prgsVersionamento.getValue());
                    }
                }
            } else {
                // Este método está implementado acima – Metodo para copiar arquivos
                copyFile(srcDir, dstDir);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String nomePasta() {
        String nomePasta = JOptionPane.showInputDialog(txtVersionamento, "Entre com o nome da pasta.");
        return nomePasta;
    }

    public void tray() {
        if (SystemTray.isSupported()) {
            final SystemTray systemTray = SystemTray.getSystemTray();
            final TrayIcon trayIcon = new TrayIcon(new ImageIcon(icoPath, "omt").getImage(), "ogLehub Versions");
            trayIcon.setImageAutoSize(true);// Autosize icon base on space

            MouseAdapter mouseAdapter = new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    systemTray.remove(trayIcon);
                    setVisible(true);
                    setState(Principal.NORMAL);
                }
            };
            trayIcon.addMouseListener(mouseAdapter);
            try {
                systemTray.add(trayIcon);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
