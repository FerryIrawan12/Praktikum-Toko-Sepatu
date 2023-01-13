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
    final private Font mainFont = new Font("Times New Roman",Font.BOLD,24);
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
    public void panelKiri()
    {
        JLabel lblWelcome;

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
      
        c.add(pnlKiri);
    }

    public void panelKanan()
    {
        JPanel pnlKanan;
        JLabel lblRegister,lblUsername,lblPassword,lblNama,lblConfirmPassword;
        JTextField tfUsername,tfNama;
        JPasswordField pfPassword,pfConfirmPassword;
        JButton btnSave,btnLogin;

        //panel
        pnlKanan=new JPanel();
        pnlKanan.setBounds(370,0,470,490);
        pnlKanan.setBackground(Color.gray);
        pnlKanan.setLayout(null);

        //label

        
        c.add(pnlKanan);
    }
}
