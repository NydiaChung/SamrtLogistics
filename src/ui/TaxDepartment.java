/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: ui 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:26:43 
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

import domain.TaxDepartmentDomain;
import domain.TransportCompanyDomain;
import service.TaxDepartmentService;
import service.TransportCompanyService;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TaxDepartment.java    
*
* @Description: 
*/
public class TaxDepartment extends JFrame{
	public TaxDepartment(){
		 setSize(600,600);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setTitle("工商税务");
		 
		 
		 JLabel jl0 = new JLabel("工商税务");
		 jl0.setBounds(200,30,600,100);
		 jl0.setFont(new Font("宋体", Font.BOLD, 30));
		 add(jl0);
		 
		 JLabel jl_companyInfo =new JLabel("企业信息:");
		 jl_companyInfo.setBounds(100,150,100,30);
		 jl_companyInfo.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_companyInfo);
		 JTextField jt_companyInfo = new JTextField();
		 jt_companyInfo.setBounds(200,150,300,30);
		 add(jt_companyInfo);
		
		 JLabel jl_taxSubmit = new JLabel("交税申请:");
		 jl_taxSubmit.setBounds(100,200,100,30);
		 jl_taxSubmit.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_taxSubmit);
		 JTextField ht_taxSubmit = new JTextField("true");
		 ht_taxSubmit.setBounds(200,200,300,30);
		 add(ht_taxSubmit);
		 
		 JLabel jl_taxOnline = new JLabel("交税支持:");
		 jl_taxOnline.setBounds(100,250,100,30);
		 jl_taxOnline.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_taxOnline);
		 JTextField jt_taxOnline = new JTextField();
		 jt_taxOnline.setBounds(200,250,300,30);
		 add(jt_taxOnline);
		 
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
				TaxDepartmentService taxDepartmentService = new TaxDepartmentService();
				//调用方法根据录入的id到数据库中查询信息
				try{
					DBCursor cur = taxDepartmentService.findTaxDepartmentById(id);
					//判断是否存在录入的id对应的数据
					if(cur.size()!=0){
						//说明有该数据
						while(cur.hasNext()){
							//取出该数据
							DBObject taxDepartment = cur.next();
							//显示
							jt_companyInfo.setText((String) taxDepartment.get("companyInfo"));
							ht_taxSubmit.setText((String) taxDepartment.get("taxSubmit"));
							jt_taxOnline.setText((String) taxDepartment.get("taxOnline"));
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
				TaxDepartmentService taxDepartmentService = new TaxDepartmentService();
				//调用方法根据录入的id到数据库中查询信息
				try{
					DBCursor cur = taxDepartmentService.findTaxDepartmentById(id);
					//判断是否存在录入的id对应的数据
					if(cur.size()!=0){
						//说明有该数据
						while(cur.hasNext()){
							//取出该数据
							DBObject taxDepartment = cur.next();
							//显示
							jt_companyInfo.setText((String) taxDepartment.get("companyInfo"));
							ht_taxSubmit.setText((String) taxDepartment.get("taxSubmit"));
							jt_taxOnline.setText((String) taxDepartment.get("taxOnline"));
							//jt_id.setText((String) transportCompany.get("id"));
						}
						String idString = jt_id.getText();
						int id1 = Integer.parseInt(idString);
						String companyInfo=jt_companyInfo.getText();
						String taxSubmit=ht_taxSubmit.getText();
						String taxOnline=jt_taxOnline.getText();
						int confirm =JOptionPane.showConfirmDialog(null, "您确定要更新信息吗？", "更新信息", JOptionPane.YES_NO_OPTION); 
						 if (confirm==JOptionPane.YES_OPTION) {
							//创建对象
							 TaxDepartmentDomain taxDepartmentDomain = new TaxDepartmentDomain();
								//封装数据
								taxDepartmentDomain.setId(id1);
								taxDepartmentDomain.setCompanyInfo(companyInfo);
								taxDepartmentDomain.setTaxOnline(taxOnline);
								taxDepartmentDomain.setTaxSubmit(taxSubmit);
								//向业务层传递数据
								taxDepartmentService.updateTaxDepartment(taxDepartmentDomain);
								JOptionPane.showMessageDialog(null,"更新成功");
							 }else{
								 TaxDepartment taxDepartment = new TaxDepartment();
								 taxDepartment.setVisible(true);
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
					TaxDepartmentService taxDepartmentService = new TaxDepartmentService();
					//调用方法根据录入的id到数据库中查询信息
					DBCursor cur = taxDepartmentService.findTaxDepartmentById(id);
					//判断是否存在录入的id对应的数据
					if(cur.size()!=0){
						JOptionPane.showMessageDialog(null,"数据库中已有该数据");
						return ;
					}
					String companyInfo=jt_companyInfo.getText();
					String taxSubmit=ht_taxSubmit.getText();
					String taxOnline=jt_taxOnline.getText();
					
					//创建对象
					 TaxDepartmentDomain taxDepartmentDomain = new TaxDepartmentDomain();
						//封装数据
						taxDepartmentDomain.setId(id);
						taxDepartmentDomain.setCompanyInfo(companyInfo);
						taxDepartmentDomain.setTaxOnline(taxOnline);
						taxDepartmentDomain.setTaxSubmit(taxSubmit);
					//向业务层传递数据
						taxDepartmentService.addTaxDepartment(taxDepartmentDomain);
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
					//判断数据库中是否已有该数据
					TaxDepartmentService taxDepartmentService = new TaxDepartmentService();
					//调用方法根据录入的id到数据库中查询信息
					DBCursor cur = taxDepartmentService.findTaxDepartmentById(id);
					if(cur.size()==0){
						JOptionPane.showMessageDialog(null,"数据不存在请重新输入");
						return ;
					}
					while(cur.hasNext()){
						//取出该数据
						DBObject taxDepartment = cur.next();
						//显示
						jt_companyInfo.setText((String) taxDepartment.get("companyInfo"));
						ht_taxSubmit.setText((String) taxDepartment.get("taxSubmit"));
						jt_taxOnline.setText((String) taxDepartment.get("taxOnline"));
						//jt_id.setText((String) transportCompany.get("id"));
					}
					//提示是否删除
					System.out.println("提示是否删除");
					int confirm =JOptionPane.showConfirmDialog(null, "您确定要删除信息吗？", "删除信息", JOptionPane.YES_NO_OPTION); 
					 if (confirm==JOptionPane.YES_OPTION) {
						 taxDepartmentService.deleteTaxDepartmentById(id);
						 JOptionPane.showMessageDialog(null,"删除成功");
						 TaxDepartment taxDepartment = new TaxDepartment();
						 taxDepartment.setVisible(true);
						 setVisible(false);
					}else{
						 TaxDepartment taxDepartment = new TaxDepartment();
						 taxDepartment.setVisible(true);
						 setVisible(false);
					}
					
					
				}catch (Exception e2) {
					// TODO: handle exception
					System.out.println("删除失败");
					JOptionPane.showMessageDialog(null,"删除失败");
					 TaxDepartment taxDepartment = new TaxDepartment();
					 taxDepartment.setVisible(true);
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