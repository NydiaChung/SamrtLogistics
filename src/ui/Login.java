package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	 public Login(){
		 
		 setSize(300,250);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setLayout(null);
		  
		 JLabel j=new JLabel("登录窗口");
		 j.setBounds(100,20,80,30);
		 add(j);
		  
		 JLabel j1=new JLabel("用户名:");
		 j1.setBounds(50,80,60,30);
		 add(j1);
		  
		 final JTextField jt1=new JTextField();
		 jt1.setBounds(120,80,120,30);
		 add(jt1);
		  
		 JLabel j2=new JLabel("密 码:");
		 j2.setBounds(50,130,60,30);
		 add(j2);
		  
		 final JPasswordField jp=new JPasswordField();
		 jp.setBounds(120,130,120,30);
		 add(jp);
		  
		 JButton jb1=new JButton("登录");
		 jb1.setBounds(70,180,60,30);
		 add(jb1);
		  
		 JButton jb2=new JButton("重置");
		 jb2.setBounds(170,180,60,30);
		 add(jb2);
		 
		 repaint();
		  
		 jb1.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent event){
				 String id=jt1.getText();
				 char ch[]=jp.getPassword();
				 String pass=new String(ch);
				 if(id.equals("admin")){//设置用户名为20050330
					 if(pass.equals("123456")){//设置密码为20050330
						 JOptionPane.showMessageDialog(null,"登录成功");
						 Welcome welcome = new Welcome();//成功后跳到welcom
						 welcome.setVisible(true);
						 setVisible(false);
					 }else{
						 JOptionPane.showMessageDialog(null,"密码错误");
						 jt1.setText("");
						 return;
					 }
				 }else{
					 JOptionPane.showMessageDialog(null,"您输入的账号有误");
					 jt1.setText("");
					 jp.setText("");
					 return;
				 }
			 }
		});
	}
	 public static void main(String[] args) {
		 Login lo=new Login();
	}

}
