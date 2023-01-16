package view.admin;
import javax.imageio.ImageIO;
import javax.swing.event.MouseInputListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;

import controller.view_controller;


import controller.CasshierController;


public class DasBoardRegister extends JFrame {
    private CasshierController _CasshierC=new CasshierController();
    final private Font mainFont = new Font("Times New Roman",Font.BOLD,20);
    Container c=getContentPane();

    public DasBoardRegister()
    {
        setTitle("Register");
        setSize(840,490);
        setLayout(null);
        setResizable(false);
        panelKiri();
        panelKanan();
        setVisible(true);
    }

    private JLabel loadImage(String imagePath)
{
    try {
        BufferedImage bImage;
        Image imgresize;
        ImageIcon imagIcon=null;

        bImage=ImageIO.read(new File(imagePath));

        imgresize=bImage.getScaledInstance(300,300,Image.SCALE_SMOOTH);

        imagIcon=new ImageIcon(imgresize);


        return new JLabel(imagIcon);
    } catch (Exception e) {
        return new JLabel("gagal");
    }
}
    public void panelKiri()
    {
        JLabel lblWelcome;
        JLabel imgLabel=loadImage("src/view/admin/aa.jpg");
        imgLabel.setBounds(9,100,350,350);

        //panel
        JPanel pnlKiri=new JPanel();
        pnlKiri.setBounds(0, 0, 370, 490);
        pnlKiri.setBackground(Color.darkGray);
        pnlKiri.setLayout(null);

        //label
        lblWelcome=new JLabel("REGISTER ADMIN");
        lblWelcome.setFont(new Font("Segoe UI",Font.BOLD,32));
        lblWelcome.setBounds(55,50,280,50);
        lblWelcome.setForeground(Color.gray);

        pnlKiri.add(lblWelcome);
        pnlKiri.add(imgLabel);
        c.add(pnlKiri);
    }

    public void panelKanan()
    {
        JPanel pnlKanan;
        JLabel lblRegister,lblUsername,lblPassword,lblNama,lblConfirmPassword;
        JTextField tfUsername,tfNama;
        JPasswordField pfPassword,pfConfirmPassword;
        JButton btnSave,btnLogin;
        JCheckBox cbPassword,cbCekPassword;

        //panel
        pnlKanan=new JPanel();
        pnlKanan.setBounds(370,0,470,490);
        pnlKanan.setBackground(Color.gray);
        pnlKanan.setLayout(null);

        //label
        lblRegister=new JLabel("REGISTER");
        lblRegister.setBounds(150,50,210,50);
        lblRegister.setForeground(Color.darkGray);
        lblRegister.setFont(new Font("Segoe UI",Font.BOLD,32));

        lblNama=new JLabel("Nama");
        lblNama.setBounds(26,150,97,20);
        lblNama.setForeground(Color.DARK_GRAY);
        lblNama.setFont(mainFont);

        lblUsername=new JLabel("Username");
        lblUsername.setBounds(26,190,97,50);
        lblUsername.setFont(mainFont);
        lblUsername.setForeground(Color.darkGray);


        lblPassword=new JLabel("Password");
        lblPassword.setBounds(26,230,97,75);
        lblPassword.setFont(mainFont);
        lblPassword.setForeground(Color.darkGray);


        lblConfirmPassword=new JLabel("Confirm Password");
        lblConfirmPassword.setBounds(26,270,200,100);
        lblConfirmPassword.setFont(mainFont);
        lblConfirmPassword.setForeground(Color.darkGray);

        //txtField
        tfNama=new JTextField();
        tfNama.setBounds(26,180,400,20);
        tfNama.setFont(mainFont);

        tfUsername=new JTextField();
        tfUsername.setBounds(26,230,400,20);
        tfUsername.setFont(mainFont);

        pfPassword=new JPasswordField();
        pfPassword.setBounds(26,285,380,20);
        pfPassword.setFont(mainFont);

        pfConfirmPassword=new JPasswordField();
        pfConfirmPassword.setBounds(26,340,380,20);
        pfConfirmPassword.setFont(mainFont);

        //button
        btnLogin=new JButton("LOGIN");
        btnLogin.setFont(new Font("Segoe UI",Font.BOLD,9));
        btnLogin.setBackground(Color.lightGray);
        btnLogin.setBounds(100,380,75,20);
        btnLogin.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                new view_controller().toLogin();
                setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogin.setBackground(Color.gray);  
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLogin.setBackground(Color.lightGray);
            }

            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {}
            
        });

        btnSave=new JButton("SAVE");
        btnSave.setFont(new Font("Segoe UI",Font.BOLD,9));
        btnSave.setBackground(Color.lightGray);
        btnSave.setBounds(20,380,75,20);
        btnSave.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                String nama=tfNama.getText();
                String username=tfUsername.getText();
                String password=pfPassword.getText();
                String confirmPassword=pfConfirmPassword.getText();

                

                if (tfNama.getText().equals("") && tfUsername.getText().equals("") && 
                pfPassword.getText().equals("") && pfConfirmPassword.getText().equals("")){

                    JOptionPane.showMessageDialog(null,"Silahkan Input !","Warning !" ,JOptionPane.ERROR_MESSAGE);
                
                }else if(tfNama.getText().equals(nama) && tfUsername.getText().equals("") &&  
                pfPassword.getText().equals("") && pfConfirmPassword.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Lengkapi data (username,password) !","Warning !" ,JOptionPane.ERROR_MESSAGE);
                }
                else if (tfNama.getText().equals("") && tfUsername.getText().equals(username) &&  
                pfPassword.getText().equals("") && pfConfirmPassword.getText().equals("")){

                    JOptionPane.showMessageDialog(null,"Lengkapi data (nama,password) !","Warning !" ,JOptionPane.ERROR_MESSAGE);
               
                }else if (tfNama.getText().equals("") && tfUsername.getText().equals("") &&  
                pfPassword.getText().equals(password) && pfConfirmPassword.getText().equals("")){

                    JOptionPane.showMessageDialog(null,"Lengkapi data (nama,username) !","Warning !" ,JOptionPane.ERROR_MESSAGE);
               
                }else if (tfNama.getText().equals("")){
                  
                    JOptionPane.showMessageDialog(null,"Lengkapi data (nama) !","Warning !" ,JOptionPane.ERROR_MESSAGE);
                
                }else if (tfUsername.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null,"Lengkapi data (username) !","Warning !" ,JOptionPane.ERROR_MESSAGE);
                
                }else if (pfPassword.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Lengkapi data (password) !","Warning !" ,JOptionPane.ERROR_MESSAGE);
                }else{
                  if(password.equals(confirmPassword)){
                    if (_CasshierC.tambahData(nama, username, confirmPassword)==true){
                        JOptionPane.showMessageDialog(null,"data berhasil");
                    }else
                    {
                        JOptionPane.showMessageDialog(null,"data sudah ada !","Warning !" ,JOptionPane.ERROR_MESSAGE);
                    }
                  }else
                  {
                    JOptionPane.showMessageDialog(null,"gagal validasi password!","Warning !" ,JOptionPane.ERROR_MESSAGE);
                  }
                }

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
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
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

       

        //checkBox
        cbPassword=new JCheckBox();
        cbPassword.setBounds(405,285,20,20);
        cbPassword.setBackground(Color.lightGray);
        cbPassword.addActionListener((e)->{
            if (cbPassword.isSelected()){
                pfPassword.setEchoChar((char)0);
            }else{
                pfPassword.setEchoChar('*');
            }
        });

        cbCekPassword=new JCheckBox();
        cbCekPassword.setBackground(Color.lightGray);
        cbCekPassword.setBounds(405,340,20,20);
        cbCekPassword.addActionListener((e)->{
            if (cbCekPassword.isSelected()){
                pfConfirmPassword.setEchoChar((char)0);
            }else{
                pfConfirmPassword.setEchoChar('*');
            }
        });

        pnlKanan.add(cbPassword);
        pnlKanan.add(cbCekPassword);
        pnlKanan.add(btnSave);
        pnlKanan.add(btnLogin);
        pnlKanan.add(pfPassword);
        pnlKanan.add(pfConfirmPassword);
        pnlKanan.add(tfUsername);
        pnlKanan.add(tfNama);
        pnlKanan.add(lblNama);
        pnlKanan.add(lblUsername);
        pnlKanan.add(lblPassword);
        pnlKanan.add(lblConfirmPassword);
        pnlKanan.add(lblRegister);
        c.add(pnlKanan);
    }

    
}
