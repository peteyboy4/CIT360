package userHibernate;

/* 
 * My Hibernate Example
 */
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
public class MyHibernateExample {
    private List<User> users;
    
    public MyHibernateExample() {
        // TODO Auto-generated constructor stub
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	MyHibernateExample MyHibernateExample = new MyHibernateExample();
//        MyHibernateExample.addNewUsers();
        MyHibernateExample.showAllUsers();
        MyHibernateExample.deleteUsers(); 
    }
    /*
     * Add new users
     */
    private void addNewUsers() {
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        /*
         * Hibernate interactions must be in a transaction
         */
        Transaction transaction = session.beginTransaction();
        /*
         * Create some User instances.
         */
        User Jesse = new User();
        Jesse.setUsername("Jesse Peterson");
        Jesse.setPassword("HibernateExample1");
        Jesse.setEmail("peteyboy4@gmail.com");
        Jesse.setPhone("208-313-1336");
        
        User Shane = new User();
        Shane.setUsername("Shane Starr");
        Shane.setPassword("Java2Tutor");
        Shane.setEmail("starr4you@gmail.com");
        Shane.setPhone("208-123-4567");
        
        /*
         * Save instances
         */
        session.save(Jesse);
        session.save(Shane);
        transaction.commit();
        /*
         * Show that the users were added
         */
        System.out.println("Jesse's ID is: " + Jesse.getId());
        System.out.println("Shane's ID is: " + Shane.getId());
    }
    
    private void showAllUsers() {
        Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        /*
         * Query users
         */
        Query allUsers = session.createQuery("Select u from User as u order by u.id");
        /*
         * Get a list of users
         */
        users = allUsers.list();
        System.out.println("Number of users: "+users.size());
        transaction.commit();
  }
    
    private void deleteUsers() {
            // TODO Auto-generated method stub
            Session session = HibernateUtilSingleton.getSessionFactory().getCurrentSession();
            Transaction transaction = session.beginTransaction();
            
            int numUsers = users.size();
            System.out.println("user count: "+numUsers);
            for(int i = 0; i < numUsers; i++){
                System.out.println("deleting user "+users.get(i).getUsername());
                session.delete(users.get(i));
            }
            transaction.commit();

            System.out.println(users);
            users.clear();
            /*
             * Entries are deleted from the database
             */
            System.out.println(users);
        }
                                   
}
