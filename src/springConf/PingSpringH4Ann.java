package springConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.persistence.*;
import java.util.List;

public class PingSpringH4Ann {
    public static void main(String[] argv) {
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringFactory.class);
        EntityManagerFactory factory = (EntityManagerFactory) context.getBean("factory2");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        List result = manager.createQuery("select n.id from Lonely n").getResultList();
        System.out.println(result.size());
        transaction.commit();

        manager.close();
        factory.close();
    }
}



