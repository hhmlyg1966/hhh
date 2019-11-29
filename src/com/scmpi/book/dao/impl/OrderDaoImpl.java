package com.scmpi.book.dao.impl;

import com.scmpi.book.dao.OrderDao;
import com.scmpi.book.dao.UserDao;
import com.scmpi.book.entity.Order;
import com.scmpi.book.entity.OrderItem;
import com.scmpi.book.entity.User;
import com.scmpi.book.util.*;

import java.sql.*;

public class OrderDaoImpl implements OrderDao {

	public void insertOrder(Order o,int num) throws Exception {
		
		try {
		    //int ids = CheckId.getOid("order_item");
			User u = o.getUser();
			int uid = u.getUid();
			//Getorder_uuid gu = new  Getorder_uuid();
			//double uuid =Math.random();    //gu.getuuid();	//获取uuid作为订单唯一识别码
			
			String sql = "insert into `Order`(`uuid`,`user_id`,`Total_amount`,`order_date`,`order_status`)values("
				+ o.getUuid()  +","+ uid
				+ ","
				+ o.getTotal_amount()  
				+ ", NOW(),'"
				+ o.getOrder_status() 
				+ "')";
			//System.out.println("uuid="+uuid);
			DBUtil.Update(sql);	
			String sql1 = "SELECT  maxOID from  maxOID";			
			 ResultSet rs=DBUtil.queryData(sql1);
			 //
			 int oid=0;
			 if(rs.next()) oid=rs.getInt("maxOID");
			 
			
			for (OrderItem oi : o.getItems()) {				
				
				String sql22="insert into `order_item`(`user_id`,`product_id`,`order_num`,`orderID`,`order_Subtotal`) values("
								+ uid 
								+","
								+ oi.getP().getPid()
								+ ","
								+ oi.getOrder_num()  
								+ ", "
								+ oid 
								+ ", "
								+ oi.getOrder_subtotal() 
								+ ")";
						
					DBUtil.Update(sql22);
				
						
//				oi.setOiid(itemid);	//oid自增无需设置
				
			}
			
//			UserDao udao=new UserDaoImpl();
//			udao.updateUser(u);
		} catch (Exception e) {
             e.printStackTrace();
		}

	}

	@Override
	public void insertOrder() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder(Order o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
