package team.malaxiangguo.antexpress.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team.malaxiangguo.antexpress.bean.Employee;

import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Employee[] selectEmployeeById(int employeeId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class, 1);
        transaction.commit();
        return new Employee[]{employee};
    }

    public boolean selectEmployeeByInput(String account,String password) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from  Employee  where account = ? and password= ?";
        Query query = session.createQuery(hql);
        query.setString(0, account);
        query.setString(1, password);
        transaction.commit();
        List<Employee> list = query.list();
        if(list.size() == 0){
            return false;
        }else {
            return true;
        }
    }

    public void setSessionFactory(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
    }
}
