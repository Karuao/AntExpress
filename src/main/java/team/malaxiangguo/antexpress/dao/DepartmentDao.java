package team.malaxiangguo.antexpress.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team.malaxiangguo.antexpress.bean.Department;
import team.malaxiangguo.antexpress.bean.ExpressDeliveryBill;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentDao {

    @Autowired
    SessionFactory sessionFactory;

    public void saveOrUpdateDepartment(Department department) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(department);
        transaction.commit();
    }

    public void deleteDepartment(Department department) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(department);
        transaction.commit();
    }

    public List<Department> selectDepartment() {
        List<Department> departmentList = new ArrayList<>();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Department";
        Query q = session.createQuery(hql);
        departmentList = q.list();
        transaction.commit();
        return departmentList;
    }
}
