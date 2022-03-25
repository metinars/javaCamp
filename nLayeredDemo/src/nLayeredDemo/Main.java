package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductServices;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAcces.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductServices productServices = new ProductManager(new HibernateProductDao(),
				new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,00);
		productServices.add(product);
		
	}

}
