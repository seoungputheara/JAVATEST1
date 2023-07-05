package Ass1;
// Import the File class
import java.io.File; 
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class FileChooserExample extends JFrame implements ActionListener{
			JMenu jfile;
			JMenuBar jmb;
			JMenuItem jopen;
			JTextArea jta;
	
	public class FileChooserExample(){
		// sub menu to open file and do action this menu item
		jopen = new JMenuItem("Opean File");
		jopen.addActionListener(this);
		//show menu 
		jfile = new JMenu("D:\\Assignment");
		jfile.add(jopen);
		// show menu bar
		jmb = new JMenuBar();
		jmb.setBounds(0, 0, 800, 20);
		jmb.add(jfile);
		// textarea
		jta = new JTextArea(800, 800);
		jta.setBounds(0, 20, 800, 800);
		//add menu bar and textarea
		add(jmb);
		add(jta);
		
	}
	
	
	public static void main(String[] args) {
			FileChooserExample fchoose = new FileChooserExample();
			fchoose.setSize(500, 300);
			fchoose.setLayout(null);
			fchoose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fchoose.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//getSource Returns the object on which the event occurred.
		if(e.getSource() == jopen){
			// make file chooser
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(this);
			// click file to open
			//APPROVE_OPTION =Return value if approve (yes, ok) is chosen.
			  // if the user selects a file
			if(i == JFileChooser.APPROVE_OPTION){
				File f = fc.getSelectedFile();
				String filepath = f.getPath();
				try {
					//read file
					BufferedReader br = new BufferedReader(new FileReader(filepath));
					String s1 = "", s2 = "";
					while ((s1=br.readLine())!=null) {
						s2 += s1+"\n";
					}
					jta.setText(s2);
					br.close();
				} catch (Exception e2) {
					//a tool used to handle exceptions and errors.
					e2.printStackTrace();
				}
			}
		}
	}

}
