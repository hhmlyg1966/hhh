package com.scmpi.book.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.scmpi.book.dao.ProductDao;
import com.scmpi.book.entity.Product;
import com.scmpi.book.entity.ProductType;
import com.scmpi.book.util.DBUtil;

public class ProductDaoImpl implements ProductDao {

	public void deleteInsert(Product p) throws Exception {

	}

	public void insert(Product p) throws Exception {

	}

	public List<Product> queryAll() throws Exception {

		List<Product> list = new ArrayList<Product>();
		try {

			String sql = "select * from product_item";
			ResultSet rs = DBUtil.queryData(sql);
			while (rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setDescw(rs.getString("descw"));//
				p.setPname(rs.getString("pname"));
				p.setPrice(rs.getFloat("price"));
				p.setImg(rs.getString("img"));//
				p.setPclassifyid(String.valueOf(rs.getInt("pclassifyid")));
				p.setPdate(rs.getString("pdate"));
				p.setSuppliers(rs.getString("Suppliers"));
				p.setPnumber(rs.getInt("pnumber"));
				p.setPrice(rs.getFloat("price"));
				list.add(p);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Product queryById(Integer pid) throws Exception {

		Product p = new Product();
		try {

			String sql = "select * from product_item where pid=" + pid;
			ResultSet rs = DBUtil.queryData(sql);
			while (rs.next()) {

				p.setPid(rs.getInt("pid"));
				p.setDescw(rs.getString("descw"));
				p.setPname(rs.getString("pname"));
				p.setPrice(rs.getFloat("price"));
				p.setImg(rs.getString("img"));
				p.setPclassifyid(String.valueOf(rs.getInt("pclassifyid")));
				p.setPdate(rs.getString("pdate"));
				p.setSuppliers(rs.getString("Suppliers"));
				p.setPnumber(rs.getInt("pnumber"));
				p.setPrice(rs.getFloat("price"));
			}
			return p;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Product queryByName(String name) throws Exception {

		Product p = new Product();
		try {
			String sql = "select * from product_item where pname='" + name
					+ "'";
			ResultSet rs = DBUtil.queryData(sql);
			while (rs.next()) {
				p.setPid(rs.getInt("pid"));
				p.setDescw(rs.getString("descw"));
				p.setPname(rs.getString("pname"));
				p.setPrice(rs.getFloat("price"));
				p.setImg(rs.getString("img"));
				p.setPclassifyid(String.valueOf(rs.getInt("pclassifyid")));
				p.setPdate(rs.getString("pdate"));
				p.setSuppliers(rs.getString("Suppliers"));
				p.setPnumber(rs.getInt("pnumber"));
				p.setPrice(rs.getFloat("price"));
			}
			return p;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void update(int pid, int pnum ) throws Exception {
		// TODO Auto-generated method stub
		try {

			String sql = "update product_item set pnumber=pnumber-'" + pnum
					   + "' where pid=" + pid;
			System.out.println(sql);
			DBUtil.Update(sql);
		} catch (Exception e) {
			e.printStackTrace();

		}


	}

	// ��Ʒ����
	public List<ProductType> getProductTypes() throws Exception {

		List<ProductType> list = new ArrayList<ProductType>();
		try {

			String sql = "select * from product_category";
			ResultSet rs = DBUtil.queryData(sql);
			while (rs.next()) {
				ProductType pt = new ProductType();
				pt.setCid(rs.getInt("cid"));
				pt.setcName(rs.getString("cname"));
				list.add(pt);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public List<Product> queryPdtsById(int pclassifyid) throws Exception {

		List<Product> list = new ArrayList<Product>();
		try {

		 String sql="select * from product_item where pclassifyid='"+pclassifyid+"'";
		 
			ResultSet rs = DBUtil.queryData(sql);
			while (rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setDescw(rs.getString("descw"));
				p.setPname(rs.getString("pname"));
				p.setPrice(rs.getFloat("price"));
				p.setImg(rs.getString("img"));
				p.setPclassifyid(String.valueOf(rs.getInt("pclassifyid")));
				p.setPdate(rs.getString("pdate"));
				p.setSuppliers(rs.getString("Suppliers"));
				p.setPnumber(rs.getInt("pnumber"));
				p.setPrice(rs.getFloat("price"));
				list.add(p); 
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void update(Product p) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
