package com.nguyentran.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nguyentran.models.Category;
import com.nguyentran.models.Product;
import com.nguyentran.util.HibernateUtil;

public class ProductDAO {
	 @SuppressWarnings("unchecked")
	    public List<Product> getAllProduct() {

	        Transaction transaction = null;
	        List<Product> prods = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an  object

	            prods = session.createQuery("from Product").getResultList();
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return prods;
	    }
	    
	    /**
	     * Save 
	     * @param 
	     */
	    public void saveProduct(Product prod) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(prod);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    /**
	     * Update 
	     * @param 
	     */
	    public void updateProduct(Product prod) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.update(prod);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    /**
	     * Delete 
	     * @param id
	     */
	    public void deleteProduct(int id) {

	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	            // Delete a  object
	            Product prod = session.get(Product.class, id);
	            if (prod != null) {
	                session.delete(prod);
	                System.out.println(" is deleted");
	            }

	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    /**
	     * Get  By ID
	     * @param id
	     * @return
	     */
	    public Product getProduct(int id) {

	        Transaction transaction = null;
	        Product prod = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an category object
	            prod = session.get(Product.class, id);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return prod;
	    }
}
