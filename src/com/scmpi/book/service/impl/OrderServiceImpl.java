package com.scmpi.book.service.impl;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import com.scmpi.book.dao.*;
import com.scmpi.book.dao.impl.*;
import com.scmpi.book.entity.*;
import com.scmpi.book.service.OrderService;

import java.util.*;
public class OrderServiceImpl implements OrderService {
    OrderDao dao=new OrderDaoImpl();
    OrderItemDaoImpl daoOT=new OrderItemDaoImpl();
	public void insertOrder(Collection<OrderItem> items, User u)
			throws Exception {
		try {
			//��������
			Order  o=new Order();
			UserDaoImpl udao=new UserDaoImpl();
			
			ProductDaoImpl pdao=new ProductDaoImpl();
			
			Set<OrderItem> ois=new HashSet<OrderItem>();
			float sum=0;
			int sum1=0;
			for(OrderItem oi:items){
				sum1+=1;
				sum+=oi.getOrder_subtotal();	//�����ܼ�
				//�˴�����޸Ĳ�Ʒ��֮��Ʒ������
				//oi.getP().setPnumber(oi.getOrder_num());
				//oi.getP().setPid(oi.getProduct_id());
				//pdao.update(oi.getP().getPid(),oi.getOrder_num());
				ois.add(oi);
				
			}
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-mm-dd  HH:mm:ss");
		    Date d=new Date();
		    String str=sf.format(d);
			o.setOrder_date(str);;
			o.setOrder_status("���ύ����");;
			o.setUser(u);
			o.setItems(ois);
			o.setTotal_amount(sum);
			o.setUuid(sum1);
			dao.insertOrder(o,sum1);
			//daoOT.insertOrderItem(ois);
			//�˴�����޸�user����������discount
			udao.updateBalance(u);
			udao.updateJF(u);
			udao.updateZK(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
