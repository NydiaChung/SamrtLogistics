/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: ui 
 * @author: zongyue   
 * @date: 2020年4月26日 下午4:52:57 
 */
package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import domain.BankDomain;
import domain.TransportCompanyDomain;
import service.BankService;
import service.TransportCompanyService;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           Bank.java    
*
* @Description: 
*/
public class Bank extends JFrame{
	public Bank(){
		 setSize(600,600);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setTitle("银行/保险公司");
		 
		 JLabel jl0 = new JLabel("银行/保险公司");
		 jl0.setBounds(200,30,600,100);
		 jl0.setFont(new Font("宋体", Font.BOLD, 30));
		 add(jl0);
		 
		 JLabel jl_qualification =new JLabel("<html>企业资质<br>信用信息:</html>");
		 jl_qualification.setBounds(100,150,100,60);
		 jl_qualification.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_qualification);
		 JTextArea jt_qualification = new JTextArea();
		 jt_qualification.setBounds(200,150,300,60);
		 add(jt_qualification);
		
		 JLabel jl_payInfo = new JLabel("<html>支付消息<br>单据凭证:</html>");
		 jl_payInfo.setBounds(100,230,100,60);
		 jl_payInfo.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_payInfo);
		 JTextArea jt_payInfo = new JTextArea("");
		 jt_payInfo.setBounds(200,230,300,60);
		 add(jt_payInfo);
		 
		 JLabel jl_sevice = new JLabel("<html>业务办理<br>接口:</html>:");
		 jl_sevice.setBounds(100,310,100,60);
		 jl_sevice.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_sevice);
		 JTextArea jt_sevice = new JTextArea();
		 jt_sevice.setBounds(200,310,300,60);
		 add(jt_sevice);
		 
		 JLabel jl_id = new JLabel("id:");
		 jl_id.setBounds(100,390,100,30);
		 jl_id.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_id);
		 JTextField jt_id = new JTextField("");
		 jt_id.setBounds(200,390,300,30);
		 add(jt_id);
		 
		 
		 
		 JButton jb1 = new JButton("查找");
		 jb1.setBounds(50, 500, 80, 30);
		 add(jb1);
		 JButton jb2 = new JButton("修改");
		 jb2.setBounds(150, 500, 80, 30);
		 add(jb2);
		 JButton jb3 = new JButton("添加");
		 jb3.setBounds(250, 500, 80, 30);
		 add(jb3);
		 JButton jb4 = new JButton("删除");
		 jb4.setBounds(350, 500, 80, 30);
		 add(jb4);
		 JButton jb5 = new JButton("返回");
		 jb5.setBounds(450, 500, 80, 30);
		 add(jb5);
		 repaint();
		 
		 jb1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//根据id查找信息
					//获取id值
					String idstr = jt_id.getText();
					//强转
					int id = Integer.parseInt(idstr);
					//创建业务层对象
					BankService bankService = new BankService();
					//调用方法根据录入的id到数据库中查询信息
					try{
						DBCursor cur = bankService.findBankById(id);
						//判断是否存在录入的id对应的数据
						if(cur.size()!=0){
							//说明有该数据
							while(cur.hasNext()){
								//取出该数据
								DBObject bank = cur.next();
								//显示
								jt_qualification.setText((String) bank.get("qualification"));
								jt_payInfo.setText((String) bank.get("payInfo"));
								jt_sevice.setText((String) bank.get("sevice"));
								//jt_id.setText((String) transportCompany.get("id"));
							}
						}
						else{
							JOptionPane.showMessageDialog(null,"该信息不存在");
						}
					}
					catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("查询失败");
						e1.printStackTrace();
					}
				}
			});
			
			 
			 //根据id修改
			 jb2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//根据id查找信息
					//获取id值
					String idstr = jt_id.getText();
					//强转
					int id = Integer.parseInt(idstr);
					//创建业务层对象
					BankService bankService = new BankService();
					//调用方法根据录入的id到数据库中查询信息
					try{
						DBCursor cur = bankService.findBankById(id);
						//判断是否存在录入的id对应的数据
						if(cur.size()!=0){
							//说明有该数据
							while(cur.hasNext()){
								//取出该数据
								DBObject bank = cur.next();
								//显示
								jt_qualification.setText((String) bank.get("qualification"));
								jt_payInfo.setText((String) bank.get("payInfo"));
								jt_sevice.setText((String) bank.get("sevice"));
								//jt_id.setText((String) transportCompany.get("id"));
							}
							String idString = jt_id.getText();
							int id1 = Integer.parseInt(idString);
							String qualification=jt_qualification.getText();
							String payInfo=jt_payInfo.getText();
							String sevice=jt_sevice.getText();
							int confirm =JOptionPane.showConfirmDialog(null, "您确定要更新信息吗？", "更新信息", JOptionPane.YES_NO_OPTION); 
							 if (confirm==JOptionPane.YES_OPTION) {
								//创建对象
									BankDomain bankDomain = new BankDomain();
									//封装数据
									bankDomain.setId(id1);
									bankDomain.setQualification(qualification);
									bankDomain.setPayInfo(payInfo);
									bankDomain.setSevice(sevice);
									//向业务层传递数据
									bankService.updatebank(bankDomain);
									JOptionPane.showMessageDialog(null,"更新成功");
								 }else{
									 Bank bank = new Bank();
									 bank.setVisible(true);
									 setVisible(false);
								 }
							}
						
						else{
							JOptionPane.showMessageDialog(null,"该信息不存在");
						}
					}
					catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("更新失败");
						e1.printStackTrace();
					}
				}
			});
			 
			 
			 jb3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						// 获取输入的内容
						//获取id值
						String idstr = jt_id.getText();
						//强转
						int id = Integer.parseInt(idstr);
						//判断数据库中是否已有该数据
						BankService bankService = new BankService();
						DBCursor cur = bankService.findBankById(id);
						if(cur.size()!=0){
							JOptionPane.showMessageDialog(null,"数据库中已有该数据");
							return ;
						}
						String qualification=jt_qualification.getText();
						String payInfo=jt_payInfo.getText();
						String sevice=jt_sevice.getText();
						//创建对象
						BankDomain bankDomain = new BankDomain();
						//封装数据
						bankDomain.setId(id);
						bankDomain.setQualification(qualification);
						bankDomain.setPayInfo(payInfo);
						bankDomain.setSevice(sevice);
						//向业务层传递数据
						//向业务层传递数据
						bankService.addbank(bankDomain);
						JOptionPane.showMessageDialog(null,"添加成功");
						 Bank bank = new Bank();
						 bank.setVisible(true); 
						 setVisible(false);
				
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null,"添加失败");
						 Bank bank = new Bank();
						 bank.setVisible(true); 
						 setVisible(false);
					}
				}
					
			});
			 
			 
			 jb4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						// 获取输入的内容
						//获取id值
						String idstr = jt_id.getText();
						//强转
						int id = Integer.parseInt(idstr);
						//判断数据库中是否已有该数据
						BankService bankService = new BankService();
						DBCursor cur = bankService.findBankById(id);
						if(cur.size()==0){
							JOptionPane.showMessageDialog(null,"数据不存在请重新输入");
							return ;
						}
						//显示
						while(cur.hasNext()){
							//取出数据
							DBObject bankDomain = cur.next();
							//显示
							jt_qualification.setText((String) bankDomain.get("qualification"));
							jt_payInfo.setText((String) bankDomain.get("payInfo"));
							jt_sevice.setText((String) bankDomain.get("sevice"));
//							jt_id.setText((String) transportCompanyDomain.get("id"));
							break;
						}
						//提示是否删除
						System.out.println("提示是否删除");
						int confirm =JOptionPane.showConfirmDialog(null, "您确定要删除信息吗？", "删除信息", JOptionPane.YES_NO_OPTION); 
						 if (confirm==JOptionPane.YES_OPTION) {
							 bankService.deleteBankById(id);
							 JOptionPane.showMessageDialog(null,"删除成功");
							 Bank bank = new Bank();
							 bank.setVisible(true); 
							 setVisible(false);
						}else{
							 Bank bank = new Bank();
							 bank.setVisible(true); 
							 setVisible(false);
						}
						
						
					}catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null,"删除失败");
						 Bank bank = new Bank();
						 bank.setVisible(true); 
						 setVisible(false);
					}
				}
			});
			 
			 
			 
			 jb5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Welcome welcome = new Welcome();
				welcome.setVisible(true);
				setVisible(false);
			}
		});
		
		 
	}
}
