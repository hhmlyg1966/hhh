package com.scmpi.book.dao;

import java.util.Collection;

import com.scmpi.book.entity.Cart;
import com.scmpi.book.entity.Order;
import com.scmpi.book.entity.OrderItem;
import com.scmpi.book.entity.User;

public interface CartDao {
	public void insertCard(OrderItem c,User u) throws Exception;
	public void updateCard(Cart c) throws Exception;

}
