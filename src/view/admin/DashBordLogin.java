package view.admin;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.security.PublicKey;

import controller.LoginController;
import controller.view_controller;

public class DashBordLogin extends JFrame {
    private LoginController _loginController=new LoginController();
    final private Font mainFont = new Font("Segoe UI",Font.BOLD,20);
    Container c=getContentPane();

    public DashBordLogin()
    {
        setTitle("Login");
        setSize(840,490);
        setLayout(null);
        setResizable(false);
        panelkanan();
        panekKiri();
        setVisible(true);
        
    }

    public void panelkanan()
    {
        JLabel lblUsername,lblPassword,lblLogin;
        JButton btnSignIn,btnRegister;
        JTextField jfUsername;
        JPasswordField pfPassword;
        JPanel pnlKanan;
        
        //panel
        pnlKanan=new JPanel();
        pnlKanan.setBounds(370,0,470,490);
        pnlKanan.setBackground(Color.gray);
        pnlKanan.setLayout(null);

        //label
        lblLogin=new JLabel("LOGIN");
        lblLogin.setFont(new Font("Segoe UI",Font.BOLD,32));
        lblLogin.setForeground(Color.darkGray);
        lblLogin.setBounds(195,50,210,50);
        

        lblUsername=new JLabel("username");
        lblUsername.setFont(mainFont);
        lblUsername.setForeground(Color.darkGray);
        lblUsername.setBounds(26,220,97,25);

        lblPassword=new JLabel("password");
        lblPassword.setFont(mainFont);
        lblPassword.setForeground(Color.darkGray);
        lblPassword.setBounds(26,220,97,150);

        //txtField
        jfUsername=new JTextField();
        jfUsername.setFont(mainFont);
        jfUsername.setBounds(26,250,400,25);

        pfPassword=new JPasswordField();
        pfPassword.setFont(mainFont);
        pfPassword.setBounds(26,320,400,25);

        //button
        btnSignIn=new JButton("SIGN IN");
        btnSignIn.setFont(new Font("Segoe UI",Font.BOLD,9));
        btnSignIn.setBounds(26, 350, 75, 20);
        btnSignIn.setBackground(Color.lightGray);
        btnSignIn.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
        
                String username=jfUsername.getText();
                String password=pfPassword.getText();

                boolean cek=_loginController.loginProcces(username, password);

                    if (cek)
                    {
                        new view_controller().toRegister();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"login gagal !","Warning !" ,JOptionPane.ERROR_MESSAGE);
                    }
            }

            @Override
            public void mousePressed(MouseEvent e) {
             
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                 
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSignIn.setBackground(Color.gray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSignIn.setBackground(Color.lightGray);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
  
            }
            
        });

        btnRegister=new JButton("SIGN UP");
        btnRegister.setFont(new Font( "Segoe UI",Font.BOLD,9));
        btnRegister.setBounds(120, 350, 75, 20);
        btnRegister.setBackground(Color.lightGray);
        btnRegister.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
               new view_controller().toRegister();
               setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnRegister.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnRegister.setBackground(Color.lightGray);
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });

        pnlKanan.add(jfUsername);
        pnlKanan.add(lblUsername);
        pnlKanan.add(lblPassword);
        pnlKanan.add(lblLogin);
        pnlKanan.add(pfPassword);
        pnlKanan.add(btnSignIn);
        pnlKanan.add(btnRegister);
        c.add(pnlKanan);
    }

    public void panekKiri()
    {
        JLabel lblWelcome;
        ImageIcon imShoes;


        //panel
        JPanel pnlKiri=new JPanel();
        pnlKiri.setBounds(0, 0, 370, 490);
        pnlKiri.setBackground(Color.darkGray);
        pnlKiri.setLayout(null);

        //label
        lblWelcome=new JLabel("Welcome Admin");
        lblWelcome.setFont(new Font("Segoe UI",Font.BOLD,32));
        lblWelcome.setBounds(55,50,250,50);
        lblWelcome.setForeground(Color.gray);

        //image
        
        





        pnlKiri.add(lblWelcome);
      
        c.add(pnlKiri);

    }


}
