package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXml {
    public static void main(String[] args) {
        ApplicationContext springContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=springContext.getBean(IMetier.class);
        IMetier metier2=(IMetier) springContext.getBean("metier");
        System.out.println(metier.calcul());
    }
}