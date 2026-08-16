/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author SIYABONGA NKOSI
 */
public class GreetingGUI extends JFrame {
    
    private JPanel headPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel surnameAndnamePnl;
    private JPanel taPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    
    private JLabel headLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    private JTextField nameTf;
    private JTextField surnameTf;
    
    private JTextArea cmntTa;
    
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton ExitBtn;
    
    public GreetingGUI(){
        
        setLayout(new BorderLayout());
        setTitle("Greeting UI");
        setSize(500, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        headPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
        headPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        
        namePnl=new JPanel(new FlowLayout());
        surnamePnl=new JPanel(new FlowLayout());
        surnameAndnamePnl=new JPanel(new GridLayout(2,1));
        taPnl=new JPanel(new BorderLayout());
        btnPnl=new JPanel(new FlowLayout());
        mainPnl=new JPanel(new BorderLayout());
        
        headLbl=new JLabel("Greeting App");
        nameLbl=new JLabel("Name: ");
        surnameLbl=new JLabel("Surname: ");
        
        nameTf=new JTextField(20);
        surnameTf=new JTextField(20);
        
        cmntTa=new JTextArea(25,40);
        cmntTa.setEditable(false);
        cmntTa.setText("hello [name] [surname]");
        
        greetBtn=new JButton("Greet");
        clearBtn=new JButton("Clear");
        ExitBtn=new JButton("Exit");
        
        headPnl.add(headLbl, BorderLayout.NORTH);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTf);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTf);
        
        surnameAndnamePnl.add(namePnl);
        surnameAndnamePnl.add(surnamePnl);
        
        
        taPnl.add(cmntTa);
        taPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1),"Greeting Text"));
        
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(ExitBtn);
        
        headPnl.add(headLbl);
        
        mainPnl.add(surnameAndnamePnl, BorderLayout.NORTH);
        mainPnl.add(taPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        add(headPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
        setVisible(true);
    }
}
