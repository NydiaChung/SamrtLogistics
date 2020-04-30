/**   
 * Copyright © 2020 zongyue All rights reserved.
 * 
 * 功能描述：
 * @Package: ui 
 * @author: zongyue   
 * @date: 2020年4月26日 上午5:05:08 
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.ldap.HasControls;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import dao.TransportCompanyDao;
import domain.TransportCompanyDomain;
import service.TransportCompanyService;

/**   
* Copyright: Copyright (c) 2020
*
* Date         Author          Version           ClassName 
*---------------------------------------------------------*
* 2020年4月26日     zongyue           v1.0.0           TransportCompany.java    
*
* @Description: 
*/
public class TransportCompany extends JFrame{
	public TransportCompany(){
		 setSize(600,600);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setTitle("运输公司/车队");
		 
		 
		 JLabel jl0 = new JLabel("运输公司/车队");
		 jl0.setBounds(200,30,600,100);
		 jl0.setFont(new Font("宋体", Font.BOLD, 30));
		 add(jl0);
		 
		 JLabel jl_goodsInfo =new JLabel("货源信息:");
		 jl_goodsInfo.setBounds(100,150,100,30);
		 jl_goodsInfo.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_goodsInfo);
		 JTextField jt_goodsInfo = new JTextField();
		 jt_goodsInfo.setBounds(200,150,300,30);
		 add(jt_goodsInfo);
		
		 JLabel jl_carGoodsMatch = new JLabel("车货匹配:");
		 jl_carGoodsMatch.setBounds(100,200,100,30);
		 jl_carGoodsMatch.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_carGoodsMatch);
		 JTextField jt_carGoodsMatch = new JTextField("true");
		 jt_carGoodsMatch.setBounds(200,200,300,30);
		 add(jt_carGoodsMatch);
		 
		 JLabel jl_carGoodsTrace = new JLabel("车货跟踪:");
		 jl_carGoodsTrace.setBounds(100,250,100,30);
		 jl_carGoodsTrace.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_carGoodsTrace);
		 JTextField jt_carGoodsTrace = new JTextField();
		 jt_carGoodsTrace.setBounds(200,250,300,30);
		 add(jt_carGoodsTrace);
		 
		 JLabel jl_deviceInfo = new JLabel("设备信息:");
		 jl_deviceInfo.setBounds(100,300,100,30);
		 jl_deviceInfo.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_deviceInfo);
		 JTextField jt_deviceInfo = new JTextField();
		 jt_deviceInfo.setBounds(200,300,300,30);
		 add(jt_deviceInfo);
		 
		 JLabel jl_transit = new JLabel("运输中转:");
		 jl_transit.setBounds(100,350,100,30);
		 jl_transit.setFont(new Font("宋体", Font.PLAIN, 20));
		 add(jl_transit);
		 JTextField jt_transit = new JTextField();
		 jt_transit.setBounds(200,350,300,30);
		 add(jt_transit);
		 
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
				TransportCompanyService transportCompanyService = new TransportCompanyService();
				//调用方法根据录入的id到数据库中查询信息
				try{
					DBCursor cur = transportCompanyService.findTransportCopmpanyById(id);
					//判断是否存在录入的id对应的数据
					if(cur.size()!=0){
						//说明有该数据
						while(cur.hasNext()){
							//取出该数据
							DBObject transportCompany = cur.next();
							//显示
							jt_goodsInfo.setText((String) transportCompany.get("goodsInfo"));
							jt_carGoodsMatch.setText((String) transportCompany.get("carGoodsMatch"));
							jt_carGoodsTrace.setText((String) transportCompany.get("carGoodsTrace"));
							jt_deviceInfo.setText((String) transportCompany.get("deviceInfo"));
							jt_transit.setText((String) transportCompany.get("transit"));
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
				TransportCompanyService transportCompanyService = new TransportCompanyService();
				//调用方法根据录入的id到数据库中查询信息
				try{
					DBCursor cur = transportCompanyService.findTransportCopmpanyById(id);
					//判断是否存在录入的id对应的数据
					if(cur.size()!=0){
						//说明有该数据
						while(cur.hasNext()){
							//取出该数据
							DBObject transportCompany = cur.next();
							//显示
							jt_goodsInfo.setText((String) transportCompany.get("goodsInfo"));
							jt_carGoodsMatch.setText((String) transportCompany.get("carGoodsMatch"));
							jt_carGoodsTrace.setText((String) transportCompany.get("carGoodsTrace"));
							jt_deviceInfo.setText((String) transportCompany.get("deviceInfo"));
							jt_transit.setText((String) transportCompany.get("transit"));
							//jt_id.setText((String) transportCompany.get("id"));
						}
						String idString = jt_id.getText();
						int id1 = Integer.parseInt(idString);
						String goodsInfo=jt_goodsInfo.getText();
						String carGoodsMatch=jt_carGoodsMatch.getText();
						String carGoodsTrace=jt_carGoodsTrace.getText();
						String deviceInfo=jt_deviceInfo.getText();
						String transit=jt_transit.getText();
						int confirm =JOptionPane.showConfirmDialog(null, "您确定要更新信息吗？", "更新信息", JOptionPane.YES_NO_OPTION); 
						 if (confirm==JOptionPane.YES_OPTION) {
							//创建对象
								TransportCompanyDomain transportCompanyDomain = new TransportCompanyDomain();
								//封装数据
								transportCompanyDomain.setId(id1);
								transportCompanyDomain.setGoodsInfo(goodsInfo);
								transportCompanyDomain.setCarGoodsMatch(carGoodsMatch);
								transportCompanyDomain.setCarGoodsTrace(carGoodsTrace);
								transportCompanyDomain.setDeviceInfo(deviceInfo);
								transportCompanyDomain.setTransit(transit);
								//向业务层传递数据
								transportCompanyService.updateTransportCompany(transportCompanyDomain);
								JOptionPane.showMessageDialog(null,"更新成功");
							 }else{
								 TransportCompany tCompany = new TransportCompany();
								 tCompany.setVisible(true);
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
					TransportCompanyService transportCompanyService = new TransportCompanyService();
					DBCursor cur = transportCompanyService.findTransportCopmpanyById(id);
					if(cur.size()!=0){
						JOptionPane.showMessageDialog(null,"数据库中已有该数据");
						return ;
					}
					String goodsInfo=jt_goodsInfo.getText();
					String carGoodsMatch=jt_carGoodsMatch.getText();
					String carGoodsTrace=jt_carGoodsTrace.getText();
					String deviceInfo=jt_deviceInfo.getText();
					String transit=jt_transit.getText();
					
					//创建对象
					TransportCompanyDomain transportCompanyDomain = new TransportCompanyDomain();
					//封装数据
					transportCompanyDomain.setId(id);
					transportCompanyDomain.setGoodsInfo(goodsInfo);
					transportCompanyDomain.setCarGoodsMatch(carGoodsMatch);
					transportCompanyDomain.setCarGoodsTrace(carGoodsTrace);
					transportCompanyDomain.setDeviceInfo(deviceInfo);
					transportCompanyDomain.setTransit(transit);
					
//					//创建应用层对象
//					TransportCompanyService transportCompanyService = new TransportCompanyService();
					//向业务层传递数据
					transportCompanyService.addTransportCompany(transportCompanyDomain);
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
					TransportCompanyService transportCompanyService = new TransportCompanyService();
					DBCursor cur = transportCompanyService.findTransportCopmpanyById(id);
					if(cur.size()==0){
						JOptionPane.showMessageDialog(null,"数据不存在请重新输入");
						return ;
					}
					//显示
					while(cur.hasNext()){
						//取出数据
						DBObject transportCompanyDomain = cur.next();
						//显示
						jt_carGoodsMatch.setText((String) transportCompanyDomain.get("carGoodsMatch"));
						jt_goodsInfo.setText((String) transportCompanyDomain.get("goodsInfo"));
						jt_carGoodsTrace.setText((String) transportCompanyDomain.get("carGoodsTrace"));
						jt_deviceInfo.setText((String) transportCompanyDomain.get("deviceInfo"));
						jt_transit.setText((String) transportCompanyDomain.get("transit"));
//						jt_id.setText((String) transportCompanyDomain.get("id"));
						break;
					}
					//提示是否删除
					System.out.println("提示是否删除");
					int confirm =JOptionPane.showConfirmDialog(null, "您确定要删除信息吗？", "删除信息", JOptionPane.YES_NO_OPTION); 
					 if (confirm==JOptionPane.YES_OPTION) {
						 transportCompanyService.deleteTransportCompanyById(id);
						 JOptionPane.showMessageDialog(null,"删除成功");
						 TransportCompany transportCompany = new TransportCompany();
						 transportCompany.setVisible(true); 
						 setVisible(false);
					}else{
						TransportCompany transportCompany = new TransportCompany();
						transportCompany.setVisible(true); 
						setVisible(false);
					}
					
					
				}catch (Exception e2) {
					// TODO: handle exception
					System.out.println("删除失败");
					JOptionPane.showMessageDialog(null,"删除失败");
					TransportCompany transportCompany = new TransportCompany();
					transportCompany.setVisible(true); 
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
	

