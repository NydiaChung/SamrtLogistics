/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: ui 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:27:10 
 */
package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import domain.TradeCompanyDomain;
import domain.TradeDepartmentDomain;
import service.TradeCompanyService;
import service.TradeDepartmentService;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TradeDepartment.java    
*
* @Description: 
*/
public class TradeDepartment extends JFrame{
	public TradeDepartment(){
		 setSize(600,600);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setTitle("经信局、商务厅");
		 
		 
		 JLabel jl0 = new JLabel("经信局、商务厅");
		 jl0.setBounds(200,30,600,100);
		 jl0.setFont(new Font("宋体", Font.BOLD, 30));
		 add(jl0);
		 
		 JLabel jl_development =new JLabel("产业发展:");
		 jl_development.setBounds(100,150,100,30);
		 jl_development.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_development);
		 JTextField jt_development = new JTextField();
		 jt_development.setBounds(200,150,300,30);
		 add(jt_development);
		
		 JLabel jl_currency = new JLabel("车货流通:");
		 jl_currency.setBounds(100,200,100,30);
		 jl_currency.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_currency);
		 JTextField jt_currency = new JTextField("");
		 jt_currency.setBounds(200,200,300,30);
		 add(jt_currency);
		 
		 JLabel jl_total = new JLabel("物流数据:");
		 jl_total.setBounds(100,250,100,30);
		 jl_total.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_total);
		 JTextField jt_total = new JTextField("");
		 jt_total.setBounds(200,250,300,30);
		 add(jt_total);
		 
		 JLabel jl_id = new JLabel("id:");
		 jl_id.setBounds(100,400,100,30);
		 jl_id.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_id);
		 JTextField jt_id = new JTextField("");
		 jt_id.setBounds(200,400,300,30);
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
					TradeDepartmentService tradeDepartmentService = new TradeDepartmentService();
					//调用方法根据录入的id到数据库中查询信息
					try{
						DBCursor cur = tradeDepartmentService.findTradeDepartmentById(id);
						//判断是否存在录入的id对应的数据
						if(cur.size()!=0){
							//说明有该数据
							while(cur.hasNext()){
								//取出该数据
								DBObject tradeDepartment = cur.next();
								//显示
								jt_development.setText((String) tradeDepartment.get("development"));
								jt_currency.setText((String) tradeDepartment.get("currency"));
								jt_total.setText((String) tradeDepartment.get("total"));
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
					TradeDepartmentService tradeDepartmentService = new TradeDepartmentService();
					//调用方法根据录入的id到数据库中查询信息
					try{
						DBCursor cur = tradeDepartmentService.findTradeDepartmentById(id);
						//判断是否存在录入的id对应的数据
						if(cur.size()!=0){
							//说明有该数据
							while(cur.hasNext()){
								//取出该数据
								DBObject tradeDepartment = cur.next();
								//显示
								jt_development.setText((String) tradeDepartment.get("development"));
								jt_currency.setText((String) tradeDepartment.get("currency"));
								jt_total.setText((String) tradeDepartment.get("total"));
								//jt_id.setText((String) transportCompany.get("id"));
							}
						
						String idString = jt_id.getText();
						int id1 = Integer.parseInt(idString);
						String development=jt_development.getText();
						String currency=jt_currency.getText();
						String total=jt_total.getText();
						int confirm =JOptionPane.showConfirmDialog(null, "您确定要更新信息吗？", "更新信息", JOptionPane.YES_NO_OPTION); 
						if (confirm==JOptionPane.YES_OPTION) {
							//创建对象
							TradeDepartmentDomain tradeDepartmentDomain = new TradeDepartmentDomain();
								//封装数据
							 tradeDepartmentDomain.setId(id1);
							 tradeDepartmentDomain.setDevelopment(development);
							 tradeDepartmentDomain.setCurrency(currency);
							 tradeDepartmentDomain.setTotal(total);
								//向业务层传递数据
								tradeDepartmentService.updateTradeDepartment(tradeDepartmentDomain);
								JOptionPane.showMessageDialog(null,"更新成功");
								TradeDepartment tradeDepartment = new TradeDepartment();
								tradeDepartment.setVisible(true);
								 setVisible(false);
						}
						 else{
							TradeDepartment tradeDepartment = new TradeDepartment();
							tradeDepartment.setVisible(true);
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
						TradeDepartmentService tradeDepartmentService = new TradeDepartmentService();
						//调用方法根据录入的id到数据库中查询信息
						DBCursor cur = tradeDepartmentService.findTradeDepartmentById(id);
								
						if(cur.size()!=0){
							JOptionPane.showMessageDialog(null,"数据库中已有该数据");
							return ;
						}
						String development=jt_development.getText();
						String currency=jt_currency.getText();
						String total=jt_total.getText();
						//创建对象
						TradeDepartmentDomain tradeDepartmentDomain = new TradeDepartmentDomain();
							//封装数据
						 tradeDepartmentDomain.setId(id);
						 tradeDepartmentDomain.setDevelopment(development);
						 tradeDepartmentDomain.setCurrency(currency);
						 tradeDepartmentDomain.setTotal(total);
							//向业务层传递数据
							tradeDepartmentService.addbTradeDepartment(tradeDepartmentDomain);
							JOptionPane.showMessageDialog(null,"添加成功");
				
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null,"添加失败");
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
						TradeDepartmentService tradeDepartmentService = new TradeDepartmentService();
						//调用方法根据录入的id到数据库中查询信息
						DBCursor cur = tradeDepartmentService.findTradeDepartmentById(id);
						if(cur.size()==0){
							JOptionPane.showMessageDialog(null,"数据不存在请重新输入");
							return ;
						}
						//显示
						while(cur.hasNext()){
							//取出该数据
							DBObject tradeDepartment = cur.next();
							//显示
							jt_development.setText((String) tradeDepartment.get("development"));
							jt_currency.setText((String) tradeDepartment.get("currency"));
							jt_total.setText((String) tradeDepartment.get("total"));
							break;
						}
						//提示是否删除
						System.out.println("提示是否删除");
						int confirm =JOptionPane.showConfirmDialog(null, "您确定要删除信息吗？", "删除信息", JOptionPane.YES_NO_OPTION); 
						 if (confirm==JOptionPane.YES_OPTION) {
							 tradeDepartmentService.deleteTradeDepartmentById(id);
							 JOptionPane.showMessageDialog(null,"删除成功");
							 TradeDepartment tradeDepartment = new TradeDepartment();
								tradeDepartment.setVisible(true);
								 setVisible(false);
						}else{
							TradeDepartment tradeDepartment = new TradeDepartment();
							tradeDepartment.setVisible(true);
							 setVisible(false);
						}
						
						
					}catch (Exception e2) {
						// TODO: handle exception
						System.out.println("删除失败");
						JOptionPane.showMessageDialog(null,"删除失败");
						TradeDepartment tradeDepartment = new TradeDepartment();
						tradeDepartment.setVisible(true);
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
