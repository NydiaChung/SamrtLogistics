/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: ui 
 * @author: zongyue   
 * @date: 2020年4月26日 下午6:26:56 
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

import org.omg.CORBA.TRANSACTION_REQUIRED;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import domain.PersonDomain;
import domain.TradeCompanyDomain;
import domain.TransportCompanyDomain;
import service.PersonService;
import service.TradeCompanyService;
import service.TransportCompanyService;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TradeCompany.java    
*
* @Description: 
*/
public class TradeCompany extends JFrame{
	public TradeCompany(){
		 setSize(600,600);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setTitle("商贸型企业");
		 
		 
		 JLabel jl0 = new JLabel("商贸型企业");
		 jl0.setBounds(200,30,600,100);
		 jl0.setFont(new Font("宋体", Font.BOLD, 30));
		 add(jl0);
		 
		 JLabel jl_carGoodsTrace =new JLabel("车货追踪:");
		 jl_carGoodsTrace.setBounds(100,150,100,30);
		 jl_carGoodsTrace.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_carGoodsTrace);
		 JTextField jt_carGoodsTrace = new JTextField();
		 jt_carGoodsTrace.setBounds(200,150,300,30);
		 add(jt_carGoodsTrace);
		
		 JLabel jl_orderOnline = new JLabel("订单管理:");
		 jl_orderOnline.setBounds(100,200,100,30);
		 jl_orderOnline.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_orderOnline);
		 JTextField jt_orderOnline = new JTextField("true");
		 jt_orderOnline.setBounds(200,200,300,30);
		 add(jt_orderOnline);
		 
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
				TradeCompanyService tradeCompanyService = new TradeCompanyService();
				//调用方法根据录入的id到数据库中查询信息
				try{
					DBCursor cur = tradeCompanyService.findTradeCompanyById(id);
					//判断是否存在录入的id对应的数据
					if(cur.size()!=0){
						//说明有该数据
						while(cur.hasNext()){
							//取出该数据
							DBObject tradeCompany = cur.next();
							//显示
							jt_carGoodsTrace.setText((String) tradeCompany.get("carGoodsTrace"));
							jt_orderOnline.setText((String) tradeCompany.get("orderOnline"));
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
				TradeCompanyService tradeCompanyService = new TradeCompanyService();
				try{
					//调用方法根据录入的id到数据库中查询信息
					DBCursor cur = tradeCompanyService.findTradeCompanyById(id);
					//判断是否存在录入的id对应的数据
					if(cur.size()!=0){
						while(cur.hasNext()){
							//取出该数据
							DBObject tradeCompany = cur.next();
							//显示
							jt_carGoodsTrace.setText((String) tradeCompany.get("carGoodsTrace"));
							jt_orderOnline.setText((String) tradeCompany.get("orderOnline"));
							//jt_id.setText((String) transportCompany.get("id"));
						}
					}
					String idString = jt_id.getText();
					int id1 = Integer.parseInt(idString);
					String carGoodsTrace=jt_carGoodsTrace.getText();
					String orderOnline=jt_orderOnline.getText();
					int confirm =JOptionPane.showConfirmDialog(null, "您确定要更新信息吗？", "更新信息", JOptionPane.YES_NO_OPTION); 
					if (confirm==JOptionPane.YES_OPTION) {
						//创建对象
						 TradeCompanyDomain tradeCompanyDomain  =new TradeCompanyDomain();
							//封装数据
						 tradeCompanyDomain.setId(id1);
						 tradeCompanyDomain.setCarGoodsTrace(carGoodsTrace);
						 tradeCompanyDomain.setOrderOnline(orderOnline);
							//向业务层传递数据
							tradeCompanyService.updateTradeCompany(tradeCompanyDomain);
							JOptionPane.showMessageDialog(null,"更新成功");
						 }else{
							 TradeCompany tradeCompany = new TradeCompany();
							 tradeCompany.setVisible(true);
							 setVisible(false);
						 }
				
//					else{
//						JOptionPane.showMessageDialog(null,"该信息不存在");
//					}
//				
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
					TradeCompanyService tradeCompanyService = new TradeCompanyService();
					//调用方法根据录入的id到数据库中查询信息
					DBCursor cur = tradeCompanyService.findTradeCompanyById(id);
						
					if(cur.size()!=0){
						JOptionPane.showMessageDialog(null,"数据库中已有该数据");
						return ;
					}
					String carGoodsTrace=jt_carGoodsTrace.getText();
					String orderOnline=jt_orderOnline.getText();
					
					//创建对象
					 TradeCompanyDomain tradeCompanyDomain  =new TradeCompanyDomain();
					//封装数据
					 tradeCompanyDomain.setId(id);
					 tradeCompanyDomain.setCarGoodsTrace(carGoodsTrace);
					 tradeCompanyDomain.setOrderOnline(orderOnline);
					//向业务层传递数据
					tradeCompanyService.addTradeCompany(tradeCompanyDomain);
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
					TradeCompanyService tradeCompanyService = new TradeCompanyService();
					//调用方法根据录入的id到数据库中查询信息
					DBCursor cur = tradeCompanyService.findTradeCompanyById(id);
					if(cur.size()==0){
						JOptionPane.showMessageDialog(null,"数据不存在请重新输入");
						return ;
					}
					//显示
					while(cur.hasNext()){
						DBObject tradeCompany = cur.next();
						//显示
						jt_carGoodsTrace.setText((String) tradeCompany.get("carGoodsTrace"));
						jt_orderOnline.setText((String) tradeCompany.get("orderOnline"));
						break;
					}
					//提示是否删除
					System.out.println("提示是否删除");
					int confirm =JOptionPane.showConfirmDialog(null, "您确定要删除信息吗？", "删除信息", JOptionPane.YES_NO_OPTION); 
					 if (confirm==JOptionPane.YES_OPTION) {
						 tradeCompanyService.deleteTradeCompanyById(id);
						 JOptionPane.showMessageDialog(null,"删除成功");
						TradeCompany tradeCompany = new TradeCompany();
						tradeCompany.setVisible(true);
						 setVisible(false);
					}else{
						TradeCompany tradeCompany = new TradeCompany();
						tradeCompany.setVisible(true);
						 setVisible(false);
					}
					
					
				}catch (Exception e2) {
					// TODO: handle exception
					System.out.println("删除失败");
					JOptionPane.showMessageDialog(null,"删除失败");
					TradeCompany tradeCompany = new TradeCompany();
					tradeCompany.setVisible(true);
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