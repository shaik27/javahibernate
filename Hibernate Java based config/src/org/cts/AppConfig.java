package org.cts;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

@org.springframework.context.annotation.Configuration
public class AppConfig {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
			Configuration cfg = new Configuration();
			Properties properties = new Properties();
			properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			properties.put(Environment.URL,
					"jdbc:mysql://localhost:3306/employeehibernate");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "");
			properties
					.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			properties.put(Environment.SHOW_SQL, "true");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			cfg.setProperties(properties);
			cfg.addAnnotatedClass(Emp.class);
			ServiceRegistry registry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(registry);

		
		return sessionFactory;
	}
}