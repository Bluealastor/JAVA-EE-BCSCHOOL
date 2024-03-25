package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Macchina;
import com.example.demo.entity.Motore;


@SpringBootApplication
public class Eserciziodel25mar2024springbootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Eserciziodel25mar2024springbootApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(Eserciziodel25mar2024springbootApplication.class, args);
		
		Macchina ma1 = context.getBean(Macchina.class);
		Macchina ma2 = context.getBean(Macchina.class);
		Macchina ma3 = context.getBean(Macchina.class);
		System.out.println();
		ma1.setModello("Ferrari");
		ma1.getMotore().setTipologia("elettrica");
		System.out.println(ma1.toString());
		System.out.println();
		ma2.setModello("Fiat");
		ma2.getMotore().setTipologia("benzina");
		System.out.println(ma2.toString());
		System.out.println();
		ma3.setModello("Merceds");
		ma3.getMotore().setTipologia("diesel");
		System.out.println(ma3.toString());
		
	


	}

}
