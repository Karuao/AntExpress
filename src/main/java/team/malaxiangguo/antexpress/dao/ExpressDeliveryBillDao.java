package team.malaxiangguo.antexpress.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team.malaxiangguo.antexpress.bean.ExpressDeliveryBill;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpressDeliveryBillDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<ExpressDeliveryBill> selectExpressDeliveryBillByStatus(String status) {
        List<ExpressDeliveryBill> expressDeliveryBillList = new ArrayList<>();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from ExpressDeliveryBill e where e.status = '" + status + "'";
        Query q = session.createQuery(hql);
        expressDeliveryBillList = q.list();
        transaction.commit();
        return expressDeliveryBillList;
    }

    public void deleteExpressDeliveryBill(ExpressDeliveryBill expressDeliveryBill) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(expressDeliveryBill);
        transaction.commit();
    }

    public void updateExpressDeliveryBill(ExpressDeliveryBill expressDeliveryBill) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(expressDeliveryBill);
        transaction.commit();
    }

    public void saveExpressDeliveryBill(ExpressDeliveryBill expressDeliveryBill) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(expressDeliveryBill);
        transaction.commit();
    }
}
