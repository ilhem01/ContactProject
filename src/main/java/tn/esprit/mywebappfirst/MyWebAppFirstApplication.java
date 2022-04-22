package tn.esprit.mywebappfirst;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import tn.esprit.dao.ContactRepository;
import tn.esprit.entities.Contact;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


@Configuration
@Component
@SpringBootApplication
@ComponentScan(basePackageClasses = ContactRepository.class)
public class MyWebAppFirstApplication implements CommandLineRunner {

    @Autowired
    private ContactRepository contactRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyWebAppFirstApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    DateFormat df = new SimpleDateFormat("yy/MM/yyyy");
        contactRepository.save(new Contact("ilhem","djebbi", df.parse("15/06/1991"), "ilhemdj@gmail.com", 21973355l, "spec.jpeg"));
        contactRepository.save(new Contact("maj","djebbi", df.parse("15/06/1990"), "ilhemdj@gmail.com", 21973355l, "spec.jpeg"));
        contactRepository.save(new Contact("zeineb","djebbi", df.parse("15/06/1980"), "ilhemdj@gmail.com", 21973355l, "spec.jpeg"));
        contactRepository.findAll().forEach(c -> {
        System.out.println(c.getNom());
    });

    }
}
