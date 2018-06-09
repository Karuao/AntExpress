package team.malaxiangguo.antexpress;

public class Constant {

    public static final String DISPATCH_BILL = "Dispatch Bill";

    public static final String NORMAL_BILL = "Normal Bill";

    public static final String WORKING_BILL = "Working Bill";

    public static final String NEW_WORKING_BILL_STATUS = "New";

    public static final String MODIFIED_WORKING_BILL_STATUS = "Modified";

    public static final String REVOKED_WORKING_BILL_STATUS = "Revoked";

    public static final String EXPRESS_DELIVERY_SHIPPED = "Shipped";

    public static final String SHINAN_DISTRICT = "Shinan District";

    public static final String SHIBEI_DISTRICT = "Shibei District";

    public static final String LAOSHAN_DISTRICT = "Laoshan District";

    public static final String LICANG_DISTRICT = "Licang District";

    public static final String CHENGYANG_DISTRICT = "Chengyang District";

    public static String getAddressByDepartmentId(int departmentId) {
        switch (departmentId) {
            case 1:
                return SHINAN_DISTRICT;
            case 2:
                return SHIBEI_DISTRICT;
            case 3:
                return LAOSHAN_DISTRICT;
            case 4:
                return LICANG_DISTRICT;
            case 5:
                return CHENGYANG_DISTRICT;
        }
        return null;
    }
}
