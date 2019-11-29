package com.scmpi.book.dao.impl;

import java.util.Collection;

import com.scmpi.book.dao.CartDao;
import com.scmpi.book.dao.OrderDao;
import com.scmpi.book.entity.Cart;
import com.scmpi.book.entity.OrderItem;
import com.scmpi.book.entity.User;
import com.scmpi.book.util.DBUtil;

public class CartDaoImpl implements CartDao{

	@Override
	public void insertCard(OrderItem o,User u) throws Exception {
		// TODO Auto-generated method stub
		
		int uid = u.getUid();
		
		{				
			
			String sql22="insert into `cart`(`user_id`,`product_id`,`pnum`) values("
							+ uid 
							+","
							+ o.getP().getPid()
							+ ","
							+ o.getOrder_num()  
							+ ")";
					
				DBUtil.Update(sql22);
			}
			
		
	}

	@Override
	public void updateCard(Cart c) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
