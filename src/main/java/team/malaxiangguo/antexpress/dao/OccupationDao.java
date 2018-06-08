package team.malaxiangguo.antexpress.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team.malaxiangguo.antexpress.bean.Occupation;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OccupationDao {
    
    @Autowired
    SessionFactory sessionFactory;

    public void saveOrUpdateOccupation(Occupation occupation) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(occupation);
        transaction.commit();
    }

    public void deleteOccupation(Occupation occupation) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(occupation);
        transaction.commit();
    }

    public List<Occupation> selectOccupation() {
        List<Occupation> occupationList = new ArrayList<>();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Occupation";
        Query q = session.createQuery(hql);
        occupationList = q.list();
        transaction.commit();
        return occupationList;
    }
}
