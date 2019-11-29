package com.scmpi.book.dao;
import com.scmpi.book.entity.*;
public interface OrderDao {
	public void insertOrder(Order o,int num) throws Exception;
	public void insertOrder() throws Exception;
	public void updateOrder(Order o) throws Exception;

}
