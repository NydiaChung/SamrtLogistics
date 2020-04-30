/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: ui 
 * @author: zongyue   
 * @date: 2020年4月26日 上午4:16:02 
 */
package ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;import javax.transaction.TransactionRequiredException;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           Welcome.java    
*
* @Description: 欢迎界面
*/
public class Welcome extends JFrame{
	public Welcome(){
		 setSize(600,600);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setTitle("智慧物流");
		 
		 JLabel j=new JLabel("智慧物流");
		 j.setBounds(150,100,500,100);
		 j.setFont(new Font("华文行楷", Font.BOLD, 72));
		 add(j);
		 
		 JButton btn_transport_company = new JButton("运输公司/车队");
		 btn_transport_company.setBounds(100,300,150,30);
		 add(btn_transport_company);
		 
		 JButton btn_store_company = new JButton("仓储型物流公司");
		 btn_store_company.setBounds(100,350,150,30);
		 add(btn_store_company);
		 
		 JButton btn_goods_agent = new JButton("货运代理");
		 btn_goods_agent.setBounds(100,400,150,30);
		 add(btn_goods_agent);
		 
		 JButton btn_product_company = new JButton("生产制造企业");
		 btn_product_company.setBounds(100,450,150,30);
		 add(btn_product_company);
		 
		 JButton btn_trade_company = new JButton("商贸型企业");
		 btn_trade_company.setBounds(100,500,150,30);
		 add(btn_trade_company);
		 
		 
		 JButton btn_tax_department = new JButton("工商税务");
		 btn_tax_department.setBounds(350,300,150,30);
		 add(btn_tax_department);
		 
		 JButton btn_transport_department = new JButton("交通运输");
		 btn_transport_department.setBounds(350,350,150,30);
		 add(btn_transport_department);
		 
		 JButton btn_trade_department = new JButton("经信局、商务厅");
		 btn_trade_department.setBounds(350,400,150,30);
		 add(btn_trade_department);
		 
		 JButton btn_bank = new JButton("银行、保险公司");
		 btn_bank.setBounds(350,450,150,30);
		 add(btn_bank);
		 
		 JButton btn_person = new JButton("个体用户");
		 btn_person.setBounds(350,500,150,30);
		 add(btn_person);
		 
		 repaint();
		 
		 
		 btn_transport_company.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TransportCompany transportCompany = new TransportCompany();
				transportCompany.setVisible(true);
				setVisible(false);
			}
		});
		 
		 btn_bank.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Bank bank =new Bank();
				bank.setVisible(true);
				setVisible(false);
			}
		});
		 
		 
		 btn_goods_agent.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					GoodsAgent goodsAgent = new GoodsAgent();
					goodsAgent.setVisible(true);
					setVisible(false);
				}
			});
		 
		 btn_person.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Person person = new Person();
					person.setVisible(true);
					setVisible(false);
				}
			});
		 
		 btn_product_company.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					ProductCompany productCompany = new ProductCompany();
					productCompany.setVisible(true);
					setVisible(false);
				}
			});
		 
		 btn_store_company.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					StoreCompany c = new StoreCompany();
					c.setVisible(true);
					setVisible(false);
				}
			});
		 
		 btn_tax_department.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					TaxDepartment taxDepartment = new TaxDepartment();
					taxDepartment.setVisible(true);
					setVisible(false);
				}
			});
		 
		 btn_trade_company.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					TradeCompany tradeCompany = new TradeCompany();
					tradeCompany.setVisible(true);
					setVisible(false);
				}
			});
		 
		 
		 btn_trade_department.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					TradeDepartment tradeDepartment = new TradeDepartment();
					tradeDepartment.setVisible(true);
					setVisible(false);
				}
			});
		 
		 btn_transport_department.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					TransportDepartment transportDepartment = new TransportDepartment();
					transportDepartment.setVisible(true);
					setVisible(false);
				}
			});
	}
	
}
