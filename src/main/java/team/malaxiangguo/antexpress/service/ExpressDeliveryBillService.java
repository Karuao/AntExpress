package team.malaxiangguo.antexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.malaxiangguo.antexpress.Constant;
import team.malaxiangguo.antexpress.bean.ExpressDeliveryBill;
import team.malaxiangguo.antexpress.dao.ExpressDeliveryBillDao;

import java.util.List;

@Service
public class ExpressDeliveryBillService {

    @Autowired
    ExpressDeliveryBillDao expressDeliveryBillDao;

    public List<ExpressDeliveryBill> searchDispatchBill() {
        return expressDeliveryBillDao.selectExpressDeliveryBillByStatus(Constant.DISPATCH_BILL);
    }

    public void delete(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillDao.deleteExpressDeliveryBill(expressDeliveryBill);
    }
    public void save(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillDao.saveExpressDeliveryBill(expressDeliveryBill);
    }

    public void agreeDispatchBill(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBill.setStatus(Constant.NORMAL_BILL);
        expressDeliveryBillDao.updateExpressDeliveryBill(expressDeliveryBill);
    }
}
