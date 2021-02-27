package hellojpa;

import com.mysql.cj.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class JpaMain {
    public static void main(String[] args) {
        String a="  나는 바보다\n 하잉  ~\n ";
        System.out.println("a = " + a);
        String b= StringUtils.safeTrim(a.replaceAll("(\\r|\\n)",""));
        System.out.println("b = " + b);
        System.out.println("====");
//        EntityManagerFactory emf=Persistence.createEntityManagerFactory("hello");
//
//        EntityManager em=emf.createEntityManager();
//
//        EntityTransaction entityTransaction=em.getTransaction();
//        entityTransaction.begin();
//        //code
//        try {
//            Member member=new Member();
//            member.setName("kwan");
//            member.setCreatedAt(LocalDateTime.now());
//            member.setCreatedBy("Joon");
//            em.persist(member);
//
//            em.flush();
//            em.clear();
//            Member m1=em.getReference(Member.class,member.getId());
//            System.out.println("m1.getName() = " + m1.getName());
//            System.out.println("m1.getClass() = " + m1.getClass());
//            Member m2=em.getReference(Member.class,member.getId());
//            System.out.println("m2.getClass() = " + m2.getClass());
//            System.out.println(m1==m2);
//
//
//            entityTransaction.commit();
//        }catch (Exception e) {
//            entityTransaction.rollback();
//            System.out.println(e.getMessage());
//        }finally {
//            em.close();
//        }
//
//        emf. close();
    }
}
