package Ass1;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

public class Excerside1 extends Frame{
	
		 Label Lbl1,Lbl2,Lbl3,Lbl4;
		 TextField t1;
		 JCheckBox Java,PHP,Linux; 
		 TextArea Description;
		 Button Save,Clear;
		 
	
	public Excerside1(){
		addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e){
				dispose();
			}
		});
			setTitle("Resgistration Form");
			setSize(700,500);
			setLocationRelativeTo(null);
			
			
			Lbl1 = new Label();
			Lbl1.setText("Name");
			Lbl1.setBounds(30,50,200,50);
		//	Lbl1.setFont(new Font("Time New Romance",Font.PLAIN,30));
			t1= new TextField();
			t1.setBounds(100, 60, 400, 30);
		//	t1.setFont(new Font("Time New Romance",Font.PLAIN,30));
			
		//	Java.setText("Subject");
			Lbl2 = new Label();
			Lbl2.setText("SEX");
			Lbl2.setBounds(30,100,200,50);
			Java=new JCheckBox("Java");  
			Java.setBounds(150,150,150,20);  
			PHP=new JCheckBox("PHP");  
			PHP.setBounds(300,150,150,20);  
			Linux=new JCheckBox("Linux");  
			Linux.setBounds(400,150,150,20);  
			
			Lbl4 = new Label();
			Lbl4.setText("Subject");
			Lbl4.setBounds(30,150,200,50);
			JRadioButton r1=new JRadioButton(" Male");    
			JRadioButton r2=new JRadioButton(" Female");    
			r1.setBounds(100,100,100,30);    
			r2.setBounds(300,100,100,30);    
			ButtonGroup bg=new ButtonGroup();    
			bg.add(r1);
			bg.add(r2);    
			add(r1);
			add(r2);     
			
			Lbl3 = new Label();
			Lbl3.setText("Description");
			Lbl3.setBounds(30,380,200,50);
			Description = new TextArea("Welcom"); 
			Description.setBounds(100, 400, 300, 300);    
			JScrollPane scrollPane = new JScrollPane(Description); 
			Description. setEditable(false); 
			add(Description);  
			
			Save=new Button("Save");  
			Save.setBounds(100,350,80,30);   
			Clear=new Button("Clear");
			Clear.setBounds(200,350,80,30);
			
			 add(Lbl3);
			 add(Lbl2);
			 add(Lbl4);
	        add(Java);
	        add(PHP);
	        add(Linux);
	        add(Save);  
	        add(Clear);
	        add(Lbl1);
	        add(t1);
	        setSize(800,800);  
	        setLayout(null);
			setVisible(true);
	     
	    }  
	 /*  public void actionPerformed(ActionEvent e){  
	        float amount=0;  
	        String msg="";  
	        if(Java.isSelected()){  
	            amount+=100;  
	            msg="Java";  
	        }  
	        if(PHP.isSelected()){  
	            amount+=30;  
	            msg+="PHP";  
	        }  
	        if(Linux.isSelected()){  
	            amount+=10;  
	            msg+="Linux";  
	        }  
	        msg+="-----------------\n";  
	        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
	    }
	*/
	    
			
			
		/*	JRadioButton r1=new JRadioButton(" Male");    
			JRadioButton r2=new JRadioButton(" Female");    
			r1.setBounds(125,50,100,30);    
			r2.setBounds(125,100,100,30);    
			ButtonGroup bg=new ButtonGroup();    
			bg.add(r1);
			bg.add(r2);    
			add(r1);
			add(r2);      
			setSize(600,600);    */
			
			
			
		//}
	public static void main (String[] args){
		new Excerside1();
	}
	
}
