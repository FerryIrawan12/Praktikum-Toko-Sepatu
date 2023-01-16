package view.admin;
import java.lang.Integer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import java.awt.*;

import controller.ShoesHikingController;
import controller.ShoesWalkingController;
import controller.view_controller;

public class DashBoardCRUD extends JFrame {
    int row;

    ShoesWalkingController _ShoesWalkingC=new ShoesWalkingController();
    ShoesHikingController _ShoesHiking=new ShoesHikingController();

    final private Font mainFontLabel = new Font("Times New Roman",Font.BOLD,24);
    final private Font mainFontSmallLabel=new Font("Times New Roman",Font.BOLD,14);
    final private Font mainFontButton=new Font("Times New Roman",Font.BOLD,9);
    
    JLabel lblShowTable,lblShoesWalking,lblShoesHiking;
    JTable tableHiking=new JTable();
    JTable tableWalking=new JTable();
    JScrollPane scrollPaneHiking=new JScrollPane(tableHiking);
    JScrollPane scrollPaneWalking=new JScrollPane(tableWalking);

    JPanel pnlKiri;
    JLabel lblAdmin,lblNameHiking,lblNameWalking,lblSizeHiking,lblSizeWalking,
    lblPriceHiking,lblPriceWalking,lblHeightHiking,lblTypeWalking,lblShoesHikingLeft,lblShoesWalkingLeft;
    JTextField tfNameHiking,tfNameWalking,tfSizeHiking,tfSizeWalking,tfPriceHiking,
    tfPriceWalking,tfTypeWalking,tfWeigthHiking;
    JButton btnSaveHiking,btnSaveWalking,btnUpdateHiking,btnUpdateWalking,
    btnDeleteHiking,btnDeleteWalking,btnClearAll,btnBacktoLogin;
    JComboBox boxSizeHiking,boxSizeWalking,boxSizeType;
  
    public DashBoardCRUD()
    {
        setTitle("Register");
        setSize(840,490);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray);
        panelKiri();
        panelKanan();
        setVisible(true);
    }

    public void panelKanan()
    {
        //label
        lblShowTable=new JLabel("SHOW TABLE");
        lblShowTable.setBounds(480,10,200,50);
        lblShowTable.setForeground(Color.darkGray);
        lblShowTable.setFont(mainFontLabel);

        lblShoesHiking=new JLabel("SHOES HIKING");
        lblShoesHiking.setBounds( 595,70,250,50);
        lblShoesHiking.setForeground(Color.darkGray);
        lblShoesHiking.setFont(mainFontLabel);
       
        lblShoesWalking=new JLabel("SHOES WALKING");
        lblShoesWalking.setBounds(327,70,250,50);
        lblShoesWalking.setForeground(Color.DARK_GRAY);
        lblShoesWalking.setFont(mainFontLabel);


        //Tabel
        scrollPaneHiking.setBounds(570,120,230,320);
        tableHiking.setModel(listShoesHiking());
        tableHiking.addMouseListener(new MouseInputListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
            int index=tableHiking.getSelectedRow();
            row=index;
            tfNameHiking.setText(listShoesHiking().getValueAt(index, 0).toString());
            tfSizeHiking.setText(listShoesHiking().getValueAt(index, 1).toString());
            tfPriceHiking.setText(listShoesHiking().getValueAt(index, 2).toString());
            tfWeigthHiking.setText(listShoesHiking().getValueAt(index, 3).toString());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stubss
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
              
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
       
        scrollPaneWalking.setBounds(  315, 120, 230, 320);
        tableWalking.setModel(listShoesWalking());
        tableWalking.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int index=tableWalking.getSelectedRow();
                row=index;
                tfNameWalking.setText(listShoesWalking().getValueAt(index, 0).toString());
                tfSizeWalking.setText(listShoesWalking().getValueAt(index, 1).toString());
                tfPriceWalking.setText(listShoesWalking().getValueAt(index, 2).toString());
                tfTypeWalking.setText(listShoesWalking().getValueAt(index, 3).toString());
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
      
        add(scrollPaneWalking);
        add(scrollPaneHiking);
        add(lblShoesWalking);
        add(lblShowTable);
        add(lblShoesHiking);
    }

    private DefaultTableModel listShoesWalking()
    {
        DefaultTableModel modelShoesWalking=new DefaultTableModel();
        Object[] colum={"Name","Size","Price","Type"};
        modelShoesWalking.setColumnIdentifiers(colum);
        for (int i=0;i<_ShoesWalkingC.read().size();i++){
            Object[] inColum=new Object[4];
            inColum[0] = _ShoesWalkingC.read().get(i).getShoesName();
            inColum[1] = _ShoesWalkingC.read().get(i).getShoesSize();
            inColum[2] = _ShoesWalkingC.read().get(i).getPriceShoes();
            inColum[3] = _ShoesWalkingC.read().get(i).getShoesType();
            modelShoesWalking.addRow(inColum);
        }
        return modelShoesWalking;
    }

    public DefaultTableModel listShoesHiking()
    {
        DefaultTableModel modelShoesHiking=new DefaultTableModel();
        Object[] colum={"Name","Size","Price","Weight"};
        modelShoesHiking.setColumnIdentifiers(colum);
        for (int i=0;i<_ShoesHiking.read().size();i++){
            Object[] inColum=new Object[4];
            inColum[0] =_ShoesHiking.read().get(i).getShoesName();
            inColum[1] = _ShoesHiking.read().get(i).getShoesSize();
            inColum[2] = _ShoesHiking.read().get(i).getPriceShoes();
            inColum[3] = _ShoesHiking.read().get(i).getShoesWeight();
            modelShoesHiking.addRow(inColum);
        }
        return modelShoesHiking;
    }
    

    public void panelKiri()
    {
        //panel
        pnlKiri=new JPanel();
        pnlKiri.setBounds(0,0,290,490);
        pnlKiri.setBackground(Color.DARK_GRAY);
        pnlKiri.setLayout(null);

        //label
        lblAdmin=new JLabel("ADMIN");
        lblAdmin.setBounds(95, 10, 100, 50);
        lblAdmin.setForeground(Color.lightGray);
        lblAdmin.setFont(mainFontLabel);

        lblShoesHikingLeft=new JLabel("Shoes Hiking");
        lblShoesHikingLeft.setBounds(190,50, 100, 50);
        lblShoesHikingLeft.setFont(mainFontSmallLabel);
        lblShoesHikingLeft.setForeground(Color.lightGray);

        lblShoesWalkingLeft=new JLabel("Shoes Walking");
        lblShoesWalkingLeft.setBounds(10, 50, 100, 50);
        lblShoesWalkingLeft.setFont(mainFontSmallLabel);
        lblShoesWalkingLeft.setForeground(Color.lightGray);

        lblNameHiking=new JLabel("Name");
        lblNameHiking.setBounds(180,70, 90, 50);
        lblNameHiking.setFont(mainFontSmallLabel);
        lblNameHiking.setForeground(Color.lightGray);
        
        lblNameWalking=new JLabel("Name");
        lblNameWalking.setBounds(10,70, 90, 50);
        lblNameWalking.setFont(mainFontSmallLabel);
        lblNameWalking.setForeground(Color.lightGray);
        
        lblSizeHiking=new JLabel("Size");
        lblSizeHiking.setBounds( 180,120, 100, 50);
        lblSizeHiking.setFont(mainFontSmallLabel);
        lblSizeHiking.setForeground(Color.lightGray);
     
        lblSizeWalking=new JLabel("Size");
        lblSizeWalking.setBounds(10,120, 100, 50);
        lblSizeWalking.setFont(mainFontSmallLabel);
        lblSizeWalking.setForeground(Color.lightGray);

        lblPriceHiking=new JLabel("Price");
        lblPriceHiking.setBounds(180,170, 100, 50);
        lblPriceHiking.setFont(mainFontSmallLabel);
        lblPriceHiking.setForeground(Color.lightGray);
       
        lblPriceWalking=new JLabel("Price");
        lblPriceWalking.setBounds( 10,170, 100, 50);
        lblPriceWalking.setFont(mainFontSmallLabel);
        lblPriceWalking.setForeground(Color.lightGray);

       
        lblTypeWalking=new JLabel("Type");
        lblTypeWalking.setBounds(10,220, 100, 50);
        lblTypeWalking.setFont(mainFontSmallLabel);
        lblTypeWalking.setForeground(Color.lightGray);

        
        lblHeightHiking=new JLabel("Height");
        lblHeightHiking.setBounds(180,220, 100, 50);
        lblHeightHiking.setFont(mainFontSmallLabel);
        lblHeightHiking.setForeground(Color.lightGray);

        //txtfield
        tfNameHiking=new JTextField();
        tfNameHiking.setBounds(180, 110, 100, 20);
        tfNameHiking.setFont(mainFontSmallLabel);
       
        tfNameWalking=new JTextField();
        tfNameWalking.setBounds( 10, 110, 100, 20);
        tfNameWalking.setFont(mainFontSmallLabel);

        tfSizeHiking=new JTextField();
        tfSizeHiking.setBounds( 230, 160, 50, 20);
        tfSizeHiking.setFont(mainFontSmallLabel);
     
        tfSizeWalking=new JTextField();
        tfSizeWalking.setBounds(60, 160, 50, 20);
        tfSizeWalking.setFont(mainFontSmallLabel);
    
        tfPriceHiking=new JTextField();
        tfPriceHiking.setBounds(180, 210, 100, 20);
        tfPriceHiking.setFont(mainFontSmallLabel);

        tfPriceWalking=new JTextField();
        tfPriceWalking.setBounds(    10, 210, 100, 20);
        tfPriceWalking.setFont(mainFontSmallLabel);

        tfTypeWalking=new JTextField();
        tfTypeWalking.setBounds(60, 260, 50, 20);
        tfTypeWalking.setFont(mainFontSmallLabel);

        tfWeigthHiking=new JTextField();
        tfWeigthHiking.setBounds(180, 260, 100, 20);
        tfWeigthHiking.setFont(mainFontSmallLabel);

        //box
        String size[]={
            "37","38","39","40","41","42","43"
        };
        boxSizeHiking=new JComboBox<>(size);
        boxSizeHiking.setFont(mainFontSmallLabel);
        boxSizeHiking.setBounds( 180, 160, 50, 20);

        boxSizeHiking.addActionListener((e)->{
            if (e.getSource()==boxSizeHiking){
                String selectSize=boxSizeHiking.getSelectedItem().toString();
                tfSizeHiking.setText(selectSize);
            }
        });
       
        boxSizeWalking=new JComboBox<>(size);
        boxSizeWalking.setFont(mainFontSmallLabel);
        boxSizeWalking.setBounds(10, 160, 50, 20);
        boxSizeWalking.addActionListener((e)->{
            if (e.getSource()==boxSizeWalking){
                String selectSize=boxSizeWalking.getSelectedItem().toString();
                tfSizeWalking.setText(selectSize);
            }
        });

        String type[]={
            "low","high","velcro","classic"
        };
        boxSizeType=new JComboBox<>(type);
        boxSizeType.setFont(mainFontSmallLabel);
        boxSizeType.setBounds(10, 260, 50, 20);
        boxSizeType.addActionListener((e)->{
            if (e.getSource()==boxSizeType){
                String selectType=boxSizeType.getSelectedItem().toString();
                tfTypeWalking.setText(selectType);
            }
        });

    
        //button Shoes Hiking
        btnSaveHiking=new JButton("ADD11");
        btnSaveHiking.setBounds(180, 300, 100, 20);
        btnSaveHiking.setFont(mainFontButton);
        btnSaveHiking.setBackground(Color.LIGHT_GRAY);
        btnSaveHiking.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    String shoesName=tfNameHiking.getText();
                    String shoesSize=tfSizeHiking.getText();
                    int shoesPrice=Integer.valueOf(tfPriceHiking.getText());
                    int shoesWeight=Integer.valueOf(tfWeigthHiking.getText());
                    _ShoesHiking.create(shoesName, shoesSize, shoesPrice, shoesWeight);
                    tableHiking.setModel((listShoesHiking()));
                } catch (NumberFormatException ea) {
                    JOptionPane.showMessageDialog(null,"Something Wrong !","Information", JOptionPane.ERROR_MESSAGE);
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
               btnSaveHiking.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSaveHiking.setBackground(Color.LIGHT_GRAY);
                
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
     
        btnUpdateHiking=new JButton("UPDATE");
        btnUpdateHiking.setBounds(180, 330, 100, 20);
        btnUpdateHiking.setFont(mainFontButton);
        btnUpdateHiking.setBackground(Color.lightGray);
        btnUpdateHiking.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
              try {
                String shoesName=tfNameHiking.getText();
                String shoesSize=tfSizeHiking.getText();
                int shoesPrice=Integer.valueOf(tfPriceHiking.getText());
                int shoesWeight=Integer.valueOf(tfWeigthHiking.getText());
                _ShoesHiking.update(row, shoesName, shoesSize, shoesPrice, shoesWeight);
                tableHiking.setModel((listShoesHiking()));
              } catch (Exception ea) {
                JOptionPane.showMessageDialog(null,"Something Wrong !","Information", JOptionPane.ERROR_MESSAGE);
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
               btnUpdateHiking.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnUpdateHiking.setBackground(Color.lightGray);
                
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

        btnDeleteHiking=new JButton("DELETE");
        btnDeleteHiking.setBounds( 180, 360, 100, 20);
        btnDeleteHiking.setFont(mainFontButton);
        btnDeleteHiking.setBackground(Color.LIGHT_GRAY);
        btnDeleteHiking.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    _ShoesHiking.delete(row);
                    JOptionPane.showMessageDialog(null,"Delete Shoes Hiking Succes","Information", JOptionPane.INFORMATION_MESSAGE);
                    tableHiking.setModel((listShoesHiking()));
                } catch (Exception ea) {
                    JOptionPane.showMessageDialog(null,"Something Wrong !","Information", JOptionPane.ERROR_MESSAGE);
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
                btnDeleteHiking.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDeleteHiking.setBackground(Color.LIGHT_GRAY);
                
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

        //button Shoes Walking
        btnSaveWalking=new JButton("ADD");
        btnSaveWalking.setBounds( 10, 300, 100, 20);
        btnSaveWalking.setFont(mainFontButton);
        btnSaveWalking.setBackground(Color.lightGray);
        btnSaveWalking.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    String shoesName=tfNameWalking.getText();
                    String shoesSize=tfSizeWalking.getText();
                    int shoesPrice=Integer.valueOf(tfPriceWalking.getText());
                    String shoesType=tfTypeWalking.getText();
                    _ShoesWalkingC.create(shoesName, shoesSize, shoesPrice, shoesType);
                    tableWalking.setModel((listShoesWalking()));

                }catch(Exception ea)
                {
                    JOptionPane.showMessageDialog(null,"Something Wrong !","Information", JOptionPane.ERROR_MESSAGE);
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
                btnSaveWalking.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSaveWalking.setBackground(Color.lightGray);
                
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
        
        btnUpdateWalking=new JButton("UPDATE");
        btnUpdateWalking.setBounds( 10, 330, 100, 20);
        btnUpdateWalking.setFont(mainFontButton);
        btnUpdateWalking.setBackground(Color.LIGHT_GRAY);
        btnUpdateWalking.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    String shoesName=tfNameWalking.getText();
                    String shoesSize=tfSizeWalking.getText();
                    int shoesPrice=Integer.valueOf(tfPriceWalking.getText());
                    String shoesType=tfTypeWalking.getText();
                    _ShoesWalkingC.update(row, shoesName, shoesSize, shoesPrice, shoesType);
                    tableWalking.setModel((listShoesWalking()));
                } catch (Exception ea) {
                    JOptionPane.showMessageDialog(null,"Something Wrong !","Information", JOptionPane.ERROR_MESSAGE);
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
                btnUpdateWalking.setBackground(Color.gray);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnUpdateWalking.setBackground(Color.LIGHT_GRAY);
                
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
       
        btnDeleteWalking=new JButton("DELETE");
        btnDeleteWalking.setBounds( 10, 360, 100, 20);
        btnDeleteWalking.setFont(mainFontButton);
        btnDeleteWalking.setBackground(Color.lightGray);
        btnDeleteWalking.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            try {
                _ShoesWalkingC.delete(row);
                JOptionPane.showMessageDialog(null,"Delete Shoes Walking Succes","Information", JOptionPane.INFORMATION_MESSAGE);
                tableWalking.setModel((listShoesWalking()));
            } catch (Exception ea) {
                JOptionPane.showMessageDialog(null,"Something Wrong !","Information", JOptionPane.ERROR_MESSAGE);
            }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnDeleteWalking.setBackground(Color.gray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDeleteWalking.setBackground(Color.lightGray);
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

        btnClearAll=new JButton("CLEAR");
        btnClearAll.setFont(mainFontButton);
        btnClearAll.setBackground(Color.lightGray);
        btnClearAll.setBounds(95,390, 100, 20);
        btnClearAll.addActionListener((e)->{

            tfTypeWalking.setText("");
            tfWeigthHiking.setText("");
            tfPriceHiking.setText("");
            tfPriceWalking.setText("");
            tfSizeHiking.setText("");
            tfSizeWalking.setText("");
            tfNameHiking.setText("");
            tfNameWalking.setText("");
        });

        btnBacktoLogin=new JButton("back");
        btnBacktoLogin.setFont(mainFontButton);
        btnBacktoLogin.setBackground(Color.lightGray);
        btnBacktoLogin.setBounds(10,10,40,20);
        btnBacktoLogin.addActionListener((e)->{
            new view_controller().toLogin();
            setVisible(false);
        }); 
        //addbutton
        pnlKiri.add(btnBacktoLogin);
        pnlKiri.add(btnClearAll);
        pnlKiri.add(btnSaveWalking);
        pnlKiri.add(btnUpdateWalking);
        pnlKiri.add(btnDeleteWalking);
        pnlKiri.add(btnDeleteHiking);
        pnlKiri.add(btnUpdateHiking);
        pnlKiri.add(btnSaveHiking);


        //addComboBox
        pnlKiri.add(boxSizeType);
        pnlKiri.add(boxSizeWalking);
        pnlKiri.add(boxSizeHiking);

        //addTextField
        pnlKiri.add(tfTypeWalking);
        pnlKiri.add(tfWeigthHiking);
        pnlKiri.add(tfPriceHiking);
        pnlKiri.add(tfPriceWalking);
        pnlKiri.add(tfSizeWalking);
        pnlKiri.add(tfSizeHiking);
        pnlKiri.add(tfNameWalking);
        pnlKiri.add(tfNameHiking);

        //addLabel
        pnlKiri.add(lblHeightHiking);
        pnlKiri.add(lblTypeWalking);
        pnlKiri.add(lblPriceWalking);
        pnlKiri.add(lblPriceHiking);
        pnlKiri.add(lblSizeWalking);
        pnlKiri.add(lblSizeHiking);
        pnlKiri.add(lblNameWalking);
        pnlKiri.add(lblNameHiking);
        pnlKiri.add(lblAdmin);
        pnlKiri.add(lblShoesHikingLeft);
        pnlKiri.add(lblShoesWalkingLeft);

        //addPanel
        add(pnlKiri);
    }
}
