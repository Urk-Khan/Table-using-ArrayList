package tblarray;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GuiTblArray extends JFrame implements ActionListener{
    ArrayList List1=new ArrayList();
    ArrayList List2=new ArrayList();
    JLabel lid, l2;
    JTextField t1;
    JButton badd1, badd2, bremove, bsort, bshuffle, breverse, bdisplay, baddAll;
    JComboBox c1;
    
    GuiTblArray()
    {
        setVisible(true);
        setSize(1000,500);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        
        lid= new JLabel("data: ");
        t1 = new JTextField(15);
        badd1 =new JButton("Insert");
        
        c1=new JComboBox();
        
        add(lid); add(t1); add(badd1); add(c1);
        badd1.addActionListener(this);
        
    }
            
    
    @Override
    public void actionPerformed(ActionEvent e) {
        clinic c = new clinic();
        if (e.getSource()==badd1){
            c.id=Integer.parseInt(t1.getText());
            
        }
        for(clinic cobj:list1)
        {
            
        }
    }
    
    
}
