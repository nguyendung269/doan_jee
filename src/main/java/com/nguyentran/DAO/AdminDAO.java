package com.nguyentran.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nguyentran.models.Admin;
import com.nguyentran.util.HibernateUtil;

public class AdminDAO {
	  /**
     * Get all admin
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Admin> getAllAdmins() {

        Transaction transaction = null;
        List<Admin> admins = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an admin object

            admins = session.createQuery("from Admin").getResultList();
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return admins;
    }
    
    /**
     * Save admin
     * @param admin
     */
    public void saveAdmin(Admin admin) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(admin);
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
     * Update admin
     * @param admin
     */
    public void updateAdmin(Admin admin) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(admin);
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
     * Delete admin
     * @param id
     */
    public void deleteAdmin(int id) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a admin object
            Admin admin = session.get(Admin.class, id);
            if (admin != null) {
                session.delete(admin);
                System.out.println("admin is deleted");
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
     * Get admin By ID
     * @param id
     * @return
     */
    public Admin getAdmin(int id) {

        Transaction transaction = null;
        Admin admin = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an admin object
            admin = session.get(Admin.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return admin;
    }

}
