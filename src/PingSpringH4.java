import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PingSpringH4 {
    public static void main(String[] argv) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-jpa-hibernate-4.xml");
        EntityManagerFactory factory = (EntityManagerFactory) context.getBean("factory0");
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
