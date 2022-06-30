package com.nguyentran.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.nguyentran.models.Admin;
import com.nguyentran.models.Category;
import com.nguyentran.models.Oder;
import com.nguyentran.models.OderDetail;
import com.nguyentran.models.OderDetailId;
import com.nguyentran.models.Product;

public class HibernateUtil {
	private  static SessionFactory FACTORY;
	public static SessionFactory getSessionFactory() {
		if (FACTORY == null) {
			try {
				Configuration conf = new Configuration();
				Properties prop = new Properties();
				prop.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				prop.put(Environment.URL, "jdbc:mysql://localhost:3306/shopnoithat?useSSL=false");
				prop.put(Environment.USER, "root");
				prop.put(Environment.PASS, "");
				prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				
				prop.put(Environment.SHOW_SQL, "true");
				prop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//				prop.put(Environment.HBM2DDL_AUTO, "create-drop");
				
				
				conf.setProperties(prop);
				conf.addAnnotatedClass(Admin.class);
				conf.addAnnotatedClass(Product.class);
				conf.addAnnotatedClass(Category.class);
				conf.addAnnotatedClass(Oder.class);
				conf.addAnnotatedClass(OderDetail.class);
				conf.addAnnotatedClass(OderDetailId.class);
				
				
				ServiceRegistry registry = new StandardServiceRegistryBuilder()
						.applySettings(conf.getProperties()).build();

				FACTORY = conf.buildSessionFactory(registry);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return FACTORY;
	}
}
