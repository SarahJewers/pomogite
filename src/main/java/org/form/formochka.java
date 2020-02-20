package org.form;

import javax.swing.*;
import java.awt.event.*;
import org.soedineniya.soed;

public class formochka extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;

    public formochka() {
        this.setResizable(false);
        this.setSize(450,450);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            soed root = new soed(textField1.getText());
            }
        });

    }
    public String getText(){
        return buttonOK.getText();
    }



}

