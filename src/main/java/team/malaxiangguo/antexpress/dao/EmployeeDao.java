package team.malaxiangguo.antexpress.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team.malaxiangguo.antexpress.bean.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Employee> selectEmployeeByOccupationId(int departmentId, String occupation) {
        List<Employee> employeeList = new ArrayList<>();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Employee e where e.departmentId = " + departmentId + "and e.occupationId in " + occupation;
        Query q = session.createQuery(hql);
        employeeList = q.list();
        transaction.commit();
        return employeeList;
    }


    public List<Employee> selectEmployeeByOutletId(int outletId) {
        List<Employee> employeeList = new ArrayList<>();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Employee e where e.outletId = " + outletId;
        Query q = session.createQuery(hql);
        employeeList = q.list();
        transaction.commit();
        return employeeList;
    }

    public Employee selectEmployeeByEmployeeId(int employeeId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class, employeeId);
        transaction.commit();
        return employee;
    }

    public void saveOrUpdateEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(employee);
        transaction.commit();
    }

    public void deleteEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(employee);
        transaction.commit();
    }

    public List<Employee> selectAllEmployee() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from  Employee";
        return session.createQuery(hql).list();
    }

    public void deleteEmployeeById(int employeeId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee e = session.get(Employee.class, employeeId);
        session.delete(e);
        transaction.commit();
    }

    public Employee selectEmployeeByInput(String account, String password) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from  Employee  where account = ? and password= ?";
        Query query = session.createQuery(hql);
        query.setString(0, account);
        query.setString(1, password);
        return (Employee) query.uniqueResult();
    }

    public void updateEmployee(Employee e) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(e);
        transaction.commit();
    }
}
