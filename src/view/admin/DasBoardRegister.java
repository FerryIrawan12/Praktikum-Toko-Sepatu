package view.admin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.*;
import controller.CasshierController;

public class DasBoardRegister extends JFrame {
    private CasshierController _CasshierC=new CasshierController();
    final private Font mainFont = new Font("Times New Roman",Font.BOLD,20);

    public DasBoardRegister()
    {
        setTitle("Register");
        setSize(554,681);
        setLayout(null);

        formRegister();
    }
    public void formRegister()
    {
        JTextField tfnama,tfUsername;
        JPasswordField psPassword,psCekPassword;
        JButton saveBtn,clearBtn,loginBtn;
        JLabel lblRegis,lblnama,lblusername,lblpassword,lblCekPassword;

        //label
        lblRegis=new JLabel("Welcome to Register");
        lblRegis.setFont(mainFont);
        lblRegis.setBounds(148, 48, 258,61);

        lblnama=new JLabel("nama");
        lblnama.setFont(mainFont);
        lblnama.setBounds(19, 153, 174,61 );

        lblusername=new JLabel("username");
        lblusername.setFont(mainFont);
        lblusername.setBounds(19, 242, 174, 61);

        lblpassword=new JLabel("password");
        lblpassword.setFont(mainFont);
        lblpassword.setBounds(19, 333, 174, 61);

        lblCekPassword=new JLabel("cek password");
        lblCekPassword.setFont(mainFont);
        lblCekPassword.setBounds(19, 424, 174, 61);

        //textFiled and PasswordField
        tfnama=new JTextField("");
        tfnama.setFont(mainFont);
        tfnama.setBounds(224, 153, 299, 61);

        tfUsername=new JTextField("");
        tfUsername.setFont(mainFont);
        tfUsername.setBounds(224, 242, 299, 61);
        
        psPassword=new JPasswordField("");
        psPassword.setFont(mainFont);
        psPassword.setBounds(224, 333, 299, 61);

        psCekPassword=new JPasswordField("");
        psCekPassword.setFont(mainFont);
        psCekPassword.setBounds(224, 422, 299, 61);
        
        //button
        saveBtn=new JButton("save");
        saveBtn.setFont(mainFont);
        saveBtn.setBounds(33,557, 115, 34);
        saveBtn.addActionListener((Event)->{
        
            String nama=tfnama.getText();
            String username=tfUsername.getText();
            String password=String.valueOf(psPassword.getText());
            String cekPassword=psCekPassword.getText();

            boolean cek=_CasshierC.tambahData(nama, username, password);

            if (!password.equals(cekPassword)){
                JOptionPane.showMessageDialog(rootPane,"gagal validasi password");
            }else if (nama.equals("")&&username.equals("")&&password.equals("")&&cekPassword.equals("")){
                JOptionPane.showMessageDialog(rootPane,"silahkan input ! ");
            }else{
            if (cek){
                JOptionPane.showMessageDialog(rootPane,"tambah data berhasil");
            }
            else 
            {
                JOptionPane.showMessageDialog(rootPane,"tambah data gagal");
            }
            }
            

    });

        clearBtn=new JButton("clear");
        clearBtn.setFont(mainFont);
        clearBtn.setBounds(213, 557, 115, 34);
        clearBtn.addActionListener((Event)->{

            tfnama.setText("");
            tfUsername.setText("");
            psPassword.setText("");
            psCekPassword.setText(""); 
        });

        loginBtn=new JButton("Login");
        loginBtn.setFont(mainFont);
        loginBtn.setBounds(393,557, 115, 34);
        loginBtn.addActionListener((Event)->
        {
            DashBordLogin o=new DashBordLogin();
            o.setVisible(true);
        });
    add(lblRegis);
    add(tfnama);
    add(tfUsername);
    add(psPassword);
    add(psCekPassword);
    add(lblnama);
    add(lblusername);
    add(lblpassword);
    add(lblCekPassword);
    add(saveBtn);
    add(clearBtn);
    add(loginBtn);
    }
}
