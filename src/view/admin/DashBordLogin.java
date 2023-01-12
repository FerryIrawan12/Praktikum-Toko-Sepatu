package view.admin;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import controller.CasshierController;
import controller.LoginController;

public class DashBordLogin extends JFrame {
    private LoginController _loginController=new LoginController();
    final private Font mainFont = new Font("Segoe print",Font.BOLD,18);
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton loginBtn;
    private JButton clearBtn;
    private JButton registerBtn;
    private JLabel lbLoginForm;
    private JLabel lblPassword;
    private JLabel lblUsername;
    private JPanel formPanel;

    public void formLogin()
    {
        //label
        lbLoginForm=new JLabel("login",SwingConstants.CENTER);
        lbLoginForm.setFont(mainFont);
        lblUsername=new JLabel("username");
        lblUsername.setFont(mainFont);
        lblPassword=new JLabel("password");
        lblPassword.setFont(mainFont);

        //txt
        tfUsername=new JTextField("");
        tfUsername.setFont(mainFont);
        pfPassword=new JPasswordField("");
        pfPassword.setFont(mainFont);

        //Panel
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(0,1,10,10));
        formPanel.add(lbLoginForm);
        formPanel.add(lblUsername);
        formPanel.add(tfUsername);
        formPanel.add(lblPassword);
        formPanel.add(pfPassword);
        
        //button
        loginBtn=new JButton("login");
        loginBtn.setFont(mainFont);
    

        clearBtn=new JButton("clear");
        clearBtn.setFont(mainFont);
        clearBtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                tfUsername.setText("");
                pfPassword.setText("");
            }
        });

        registerBtn=new JButton("register");
        registerBtn.setFont(mainFont);
        registerBtn.addActionListener((Event)->{

            DasBoardRegister o=new DasBoardRegister();
            o.setVisible(true);
            dispose();
            
        });
        
        formPanel.add(loginBtn);
        formPanel.add(clearBtn);
        formPanel.add(registerBtn);
        add(formPanel,BorderLayout.NORTH);

        setTitle("login Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400,500);
        setMinimumSize(new DimensionUIResource(350,450));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed() {
        loginBtn.addActionListener((Event)->{
            String username=tfUsername.getText();
            String password=String.valueOf(pfPassword.getText());
    
            boolean cek=_loginController.loginProcces(username, password);
                    if (cek){
                        JOptionPane.showMessageDialog(rootPane,"login sukses");
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(rootPane,"login gagal");
                    }
        });     
}
}
