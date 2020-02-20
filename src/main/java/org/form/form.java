package org.form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form extends javax.swing.JFrame{
    private JPanel workspace;
    private JTextArea textArea1;
    private JButton button1;

    public form() {
      this.frameInit();
        this.setResizable(false);
      this.setSize(450,450);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public String getText(){
        return button1.getText();
    }

    }
