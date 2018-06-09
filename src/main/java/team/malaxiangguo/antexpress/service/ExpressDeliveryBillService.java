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

    public List<ExpressDeliveryBill> searchDispatchBill(int departmentId) {
        return expressDeliveryBillDao.selectExpressDeliveryBillByStatusAndSenderAddress(Constant.DISPATCH_BILL, Constant.getAddressByDepartmentId(departmentId));
    }

    public void delete(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillDao.deleteExpressDeliveryBill(expressDeliveryBill);
    }

    public void saveOrUpdate(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBillDao.saveOrUpdateExpressDeliveryBill(expressDeliveryBill);
    }

    public void agreeDispatchBill(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBill.setStatus(Constant.NORMAL_BILL);
        expressDeliveryBillDao.updateExpressDeliveryBill(expressDeliveryBill);
    }

    public List<ExpressDeliveryBill> searchNormalBill(int departmentId) {
        return expressDeliveryBillDao.selectExpressDeliveryBillByStatusAndReceiverAddress(Constant.NORMAL_BILL, Constant.getAddressByDepartmentId(departmentId));
    }

    public void agreeNormalBill(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBill.setStatus(Constant.WORKING_BILL);
        expressDeliveryBill.setWorkingSheetStatus(Constant.NEW_WORKING_BILL_STATUS);
        expressDeliveryBill.setExpressDeliveryPosition(Constant.EXPRESS_DELIVERY_SHIPPED);
        expressDeliveryBillDao.updateExpressDeliveryBill(expressDeliveryBill);
    }

    public List<ExpressDeliveryBill> searchWorkingSheet(int employeeId) {
        String workingSheetStatus = "('" + Constant.NEW_WORKING_BILL_STATUS + "', '" + Constant.MODIFIED_WORKING_BILL_STATUS + "')";
        return expressDeliveryBillDao.selectExpressDeliveryBillByEmployeeIdAndWorkingSheetStatus(employeeId, workingSheetStatus);
    }

    public void modifyWorkingSheet(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBill.setWorkingSheetStatus(Constant.MODIFIED_WORKING_BILL_STATUS);
        expressDeliveryBillDao.updateExpressDeliveryBill(expressDeliveryBill);
    }

    public void revokeWorkingSheet(ExpressDeliveryBill expressDeliveryBill) {
        expressDeliveryBill.setWorkingSheetStatus(Constant.REVOKED_WORKING_BILL_STATUS);
        expressDeliveryBillDao.updateExpressDeliveryBill(expressDeliveryBill);
    }
}
