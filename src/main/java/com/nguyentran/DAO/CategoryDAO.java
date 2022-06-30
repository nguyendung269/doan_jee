package com.nguyentran.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nguyentran.models.Category;
import com.nguyentran.util.HibernateUtil;

public class CategoryDAO {
	 @SuppressWarnings("unchecked")
	    public List<Category> getAllCats() {

	        Transaction transaction = null;
	        List<Category> cats = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an  object

	            cats = session.createQuery("from Category").getResultList();
	            // commit transaction
	            transaction.commit();
	            
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return cats;
	    }
	    
	    /**
	     * Save 
	     * @param 
	     */
	    public void saveCategory(Category cate) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(cate);
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
	    public void updateCate(Category cate) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.update(cate);
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
	    @SuppressWarnings("null")
	    public void deleteCategory(int id) {

	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	            // Delete a  object
	            Category cate = session.get(Category.class, id);
	            if (cate != null) {
	                session.delete(cate);
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
	    public Category getCategory(int id) {

	        Transaction transaction = null;
	        Category cate = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an category object
	            cate = session.get(Category.class, id);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return cate;
	    }
}
