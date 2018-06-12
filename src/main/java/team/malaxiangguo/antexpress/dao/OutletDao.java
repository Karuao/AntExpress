package team.malaxiangguo.antexpress.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team.malaxiangguo.antexpress.bean.Outlet;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OutletDao {
    
    @Autowired
    SessionFactory sessionFactory;

    public void saveOrUpdateOutlet(Outlet outlet) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(outlet);
        transaction.commit();
    }

    public void deleteOutlet(Outlet outlet) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(outlet);
        transaction.commit();
    }

    public List<Outlet> selectOutlet() {
        List<Outlet> outletList;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Outlet";
        Query q = session.createQuery(hql);
        outletList = q.list();
        transaction.commit();
        return outletList;
    }

    public List<Outlet> selectOutletByDepartmentId(int departmentId) {
        List<Outlet> outletList = new ArrayList<>();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Outlet o where o.departmentId = " + departmentId;
        Query q = session.createQuery(hql);
        outletList = q.list();
        transaction.commit();
        return outletList;
    }
}
