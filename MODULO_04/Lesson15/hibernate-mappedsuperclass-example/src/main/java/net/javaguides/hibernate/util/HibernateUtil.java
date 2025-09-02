package net.javaguides.hibernate.util;

import net.javaguides.hibernate.entity.CreditAccount;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				// Create registry
				//registry = new StandardServiceRegistryBuilder().configure().build();
				registry = new StandardServiceRegistryBuilder()
						.applySetting("hibernate.connection.driver_class", "org.h2.Driver")
						.applySetting("hibernate.connection.url", "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE")
						.applySetting("hibernate.connection.username", "sa")
						.applySetting("hibernate.connection.password", "")
						.applySetting("hibernate.dialect", "org.hibernate.dialect.H2Dialect")
						.applySetting("hibernate.hbm2ddl.auto", "update") // crea/actualiza tablas automáticamente
						.applySetting("hibernate.show_sql", "true") // muestra el SQL en consola
						.build();

				// Create metadata sources
				MetadataSources metadataSources = new MetadataSources(registry);
				metadataSources.addAnnotatedClass(CreditAccount.class); // Register the CreditAccount class

				// Build session factory
				sessionFactory = metadataSources.buildMetadata().buildSessionFactory();


			} catch (Exception e) {
				e.printStackTrace();
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
