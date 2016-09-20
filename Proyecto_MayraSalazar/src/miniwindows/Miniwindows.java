/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniwindows;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mayra Salazar
 */
public class Miniwindows extends javax.swing.JFrame {

    /**
     * Creates new form Miniwindows
     */
    public Miniwindows() {
        initComponents();
        this.pn_login.setVisibleLogo(false);
        this.pn_login.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("./sky.jpg").getScaledInstance(this.getWidth(), this.getHeight(), 0)));
        this.pn_login.setVisible(true);
        this.setTitle("Log to MiniWindows System");
        this.consola.setCaretColor(Color.white);
        this.Consola.setTitle("MiniWindows Console");
        this.deskpanel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("./flor.jpg").getScaledInstance(this.getWidth(), this.getHeight(), 0)));
        this.Desktop.setTitle("Welcome to MiniWindows!");
        this.MP3Player.setTitle("MiniWindowsPlayer");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDialog();
        deskpanel = new com.bolivia.panel.JCPanel();
        opencmd = new javax.swing.JButton();
        openplayer = new javax.swing.JButton();
        Consola = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        consola = new javax.swing.JTextPane();
        Calendar = new javax.swing.JDialog();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        MP3Player = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        delsong = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        backsong = new javax.swing.JButton();
        playpause = new javax.swing.JButton();
        forwardsong = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lb_playing = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        playinit = new javax.swing.JLabel();
        playend = new javax.swing.JLabel();
        shufflesong = new javax.swing.JButton();
        pn_login = new com.bolivia.panel.JCPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        opencmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniwindows/cmd.jpg"))); // NOI18N
        opencmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opencmdActionPerformed(evt);
            }
        });

        openplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniwindows/player.png"))); // NOI18N
        openplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openplayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deskpanelLayout = new javax.swing.GroupLayout(deskpanel);
        deskpanel.setLayout(deskpanelLayout);
        deskpanelLayout.setHorizontalGroup(
            deskpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskpanelLayout.createSequentialGroup()
                .addGroup(deskpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opencmd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 637, Short.MAX_VALUE))
        );
        deskpanelLayout.setVerticalGroup(
            deskpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opencmd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(openplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop.getContentPane());
        Desktop.getContentPane().setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        Consola.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        consola.setBackground(new java.awt.Color(0, 0, 0));
        consola.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        consola.setForeground(new java.awt.Color(255, 255, 255));
        consola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consolaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(consola);

        javax.swing.GroupLayout ConsolaLayout = new javax.swing.GroupLayout(Consola.getContentPane());
        Consola.getContentPane().setLayout(ConsolaLayout);
        ConsolaLayout.setHorizontalGroup(
            ConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ConsolaLayout.setVerticalGroup(
            ConsolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CalendarLayout = new javax.swing.GroupLayout(Calendar.getContentPane());
        Calendar.getContentPane().setLayout(CalendarLayout);
        CalendarLayout.setHorizontalGroup(
            CalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarLayout.createSequentialGroup()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 228, Short.MAX_VALUE))
        );
        CalendarLayout.setVerticalGroup(
            CalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jList1);

        delsong.setText("X");

        backsong.setText("<<");

        playpause.setText("►");

        forwardsong.setText(">>");

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lb_playing.setText("Playing: ");

        shufflesong.setText("Shuffle");

        javax.swing.GroupLayout MP3PlayerLayout = new javax.swing.GroupLayout(MP3Player.getContentPane());
        MP3Player.getContentPane().setLayout(MP3PlayerLayout);
        MP3PlayerLayout.setHorizontalGroup(
            MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MP3PlayerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MP3PlayerLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MP3PlayerLayout.createSequentialGroup()
                        .addGroup(MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MP3PlayerLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MP3PlayerLayout.createSequentialGroup()
                                        .addComponent(shufflesong)
                                        .addGap(145, 145, 145)
                                        .addComponent(delsong, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))))
                        .addGap(40, 40, 40))
                    .addGroup(MP3PlayerLayout.createSequentialGroup()
                        .addGroup(MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MP3PlayerLayout.createSequentialGroup()
                                .addComponent(playinit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addGroup(MP3PlayerLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(backsong, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playpause)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(forwardsong))
                            .addComponent(lb_playing, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        MP3PlayerLayout.setVerticalGroup(
            MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MP3PlayerLayout.createSequentialGroup()
                .addGroup(MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playinit, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(playend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_playing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forwardsong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(backsong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playpause))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MP3PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delsong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shufflesong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User");

        tf_user.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Shut Down");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_loginLayout = new javax.swing.GroupLayout(pn_login);
        pn_login.setLayout(pn_loginLayout);
        pn_loginLayout.setHorizontalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_loginLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_loginLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_loginLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        pn_loginLayout.setVerticalGroup(
            pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_loginLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(pn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tf_user.getText().equals(admin) && pf_password.getText().equals(password)) {
            logAs = tf_user.getText();
            this.deskpanel.setVisibleLogo(false);
            this.Desktop.pack();
            this.Desktop.setLocationRelativeTo(this);
            this.Desktop.setVisible(true);
            path += "\\" + logAs;
            System.out.println(path);
        } else {
            boolean isUser = false;
            for (int i = 0; i < users.size(); i++) {
                if (tf_user.getText().equals(users.get(i).getUser()) && pf_password.getText().equals(users.get(i).getPassword())) {
                }
            }
            if (isUser) {
                logAs = tf_user.getText();
                this.deskpanel.setVisibleLogo(false);
                this.Desktop.pack();
                this.Desktop.setLocationRelativeTo(this);
                this.Desktop.setVisible(true);
                path += "\\" + logAs;
            } else {
                JOptionPane.showMessageDialog(this, "No existe el usuario.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void opencmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opencmdActionPerformed
        this.Consola.pack();
        this.Consola.setLocationRelativeTo(this);
        this.Consola.setVisible(true);
        this.consola.setText(path + ">\n");
    }//GEN-LAST:event_opencmdActionPerformed

    private void consolaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consolaKeyPressed
        this.consola.setCaretColor(Color.white);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = this.consola.getText();
            String textoPane = this.consola.getText();
            String[] lines = text.split("\n");
            String lastline = lines[lines.length - 1];
            Scanner read = new Scanner(lastline);
            read.useDelimiter(">");
            String[] containers = new String[1];
            int index = 0;
            while (read.hasNext()) {
                containers[index] = read.next();
                index++;
            }
            if (containers[0] != null) {
                String dir = containers[0];
                if (dir.contains("mkdir ")) {
                    dir = dir.replace("mkdir ", "").replace(" ", "");
                    if (createDirectory(path + "\\" + dir)) {
                        textoPane += "\n El directorio ya existe\n";
                    }
                } else if (dir.contains("rm ")) {
                    dir = dir.replace("rm ", "");
                    borrar(path + "\\" + dir);
                } else if (dir.contains("cd ") && !dir.contains("..")) {
                    dir = dir.replace("cd ", "");
                    if ((new File(path += "\\" + dir).exists())) {
                        System.out.println("exists");
                    } else {
                        textoPane += "\n El directorio no existe";
                        path = path.replace((path.substring(path.lastIndexOf("\\"), path.length())), "");
                    }
                } else if (dir.contains("cd ..")) {
                    if (logAs.equals("Admin") && !path.equals("./Z")) {
                        path = path.replace((path.substring(path.lastIndexOf("\\"), path.length())), "");
                    } else {
                        if (!path.equals("./Z\\Users\\" + logAs)) {
                            
                        }
                    }
                } else if (dir.contains("time")) {
                    DateFormat f = new SimpleDateFormat("HH:mm:ss");
                    Date date = new Date();
                    textoPane += "\n La hora actual es: " + f.format(date);
                } else if (dir.contains("date")) {
                    Date date = new Date();
                    DateFormat f = new SimpleDateFormat("dd/MMMM/YYYY");
                    textoPane += "\n La fecha actual es: " + f.format(date);
                } else if (dir.contains("help")) {
                    textoPane += "\n-----Help------"
                            + "\n mkdir ------- Crea un directorio"
                            + "\n rm ---------- Elimina un archivo o directorio"
                            + "\n cd ---------- Commando para moverse entre carpetas"
                            + "\n time -------- Da la hora actual"
                            + "\n date -------- Da la fecha actual"
                            + "\n dir --------- Lista todo en la carpeta actual";
                } else if (dir.contains("dir") && !dir.contains("mkdir")) {
                    System.out.println(path);
                    File direc = new File(path);
                    File[] files = direc.listFiles();
                    for (File file : files) {
                        if (file.isDirectory()) {
                            textoPane += "\n Directorio: " + file.getName();
                        }
                        if (file.isFile()) {
                            textoPane += "\nArchivo: " + file.getName();
                        }
                    }
                } else {
                    textoPane += "\nIngrese un comando válido, escriba help para ver comandos\n";
                }
                index = 0;
            }
            textoPane += "\n" + path + ">";
            consola.setText(textoPane);
        }
    }//GEN-LAST:event_consolaKeyPressed

    private void openplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openplayerActionPerformed
        this.MP3Player.pack();
        this.MP3Player.setLocationRelativeTo(this);
        this.MP3Player.setVisible(true);
    }//GEN-LAST:event_openplayerActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser chooser = new JFileChooser(path + "\\Music");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Música", "mp3");
        chooser.setFileFilter(filtro);
        int op = chooser.showOpenDialog(MP3Player);
    }//GEN-LAST:event_jButton4ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Miniwindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Miniwindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Miniwindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Miniwindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Miniwindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Calendar;
    private javax.swing.JDialog Consola;
    private javax.swing.JDialog Desktop;
    private javax.swing.JDialog MP3Player;
    private javax.swing.JButton backsong;
    private javax.swing.JTextPane consola;
    private javax.swing.JButton delsong;
    private com.bolivia.panel.JCPanel deskpanel;
    private javax.swing.JButton forwardsong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_playing;
    private javax.swing.JButton opencmd;
    private javax.swing.JButton openplayer;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JLabel playend;
    private javax.swing.JLabel playinit;
    private javax.swing.JButton playpause;
    private com.bolivia.panel.JCPanel pn_login;
    private javax.swing.JButton shufflesong;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
    String logAs;
    String admin = "Admin";
    String password = "password";
    ArrayList<User> users = new ArrayList();
    String path = "./Z\\Users";

    public boolean createDirectory(String path) {
        if (new File(path).exists()) {
            return true;
        } else {
            new File(path).mkdir();
            return false;
        }

    }

    public void borrar(String path) {
        if (new File(path).isDirectory()) {

        } else {
            new File(path).delete();
        }

    }
}
