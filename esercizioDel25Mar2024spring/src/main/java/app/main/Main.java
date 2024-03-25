package app.main;

import app.beans.Macchina;
import app.beans.Motore;
import app.configuration.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		 System.out.println("pre-apertura");
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	        System.out.println("post-apertura");
	        
	        Macchina m1 = context.getBean("diesel", Macchina.class);
	        m1.setModello("Ferrari");
	        Motore mo1 = context.getBean("motoreDiesel", Motore.class);
	        mo1.setCilindrata(150);
	        System.out.println(m1);
	        
	        Macchina m2 = context.getBean("macchinaBenzina", Macchina.class);
	        Macchina m3 = context.getBean("macchinaElettrico", Macchina.class);
	        
	        System.out.println(m2);
	        System.out.println(m3);
	        
			System.out.println("pre-chiusura");
			context.close();
			System.out.println("post-chiusura");

	}

}
