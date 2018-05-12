package team.malaxiangguo.antexpress.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "working_sheet", schema = "antexpress", catalog = "")
public class WorkingSheet {
    private int workingSheetId;
    private String status;
    private String expressDeliveryPosition;
    private Integer expressDeliveryBillId;
    private Timestamp createDateTime;
    private Timestamp modifyDateTime;

    @Id
    @Column(name = "working_sheet_id", nullable = false)
    public int getWorkingSheetId() {
        return workingSheetId;
    }

    public void setWorkingSheetId(int workingSheetId) {
        this.workingSheetId = workingSheetId;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 45)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "express_delivery_position", nullable = true, length = 45)
    public String getExpressDeliveryPosition() {
        return expressDeliveryPosition;
    }

    public void setExpressDeliveryPosition(String expressDeliveryPosition) {
        this.expressDeliveryPosition = expressDeliveryPosition;
    }

    @Basic
    @Column(name = "express_delivery_bill_id", nullable = true)
    public Integer getExpressDeliveryBillId() {
        return expressDeliveryBillId;
    }

    public void setExpressDeliveryBillId(Integer expressDeliveryBillId) {
        this.expressDeliveryBillId = expressDeliveryBillId;
    }

    @Basic
    @Column(name = "create_date_time", nullable = true)
    public Timestamp getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Timestamp createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Basic
    @Column(name = "modify_date_time", nullable = true)
    public Timestamp getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(Timestamp modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkingSheet that = (WorkingSheet) o;

        if (workingSheetId != that.workingSheetId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (expressDeliveryPosition != null ? !expressDeliveryPosition.equals(that.expressDeliveryPosition) : that.expressDeliveryPosition != null)
            return false;
        if (expressDeliveryBillId != null ? !expressDeliveryBillId.equals(that.expressDeliveryBillId) : that.expressDeliveryBillId != null)
            return false;
        if (createDateTime != null ? !createDateTime.equals(that.createDateTime) : that.createDateTime != null)
            return false;
        if (modifyDateTime != null ? !modifyDateTime.equals(that.modifyDateTime) : that.modifyDateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workingSheetId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (expressDeliveryPosition != null ? expressDeliveryPosition.hashCode() : 0);
        result = 31 * result + (expressDeliveryBillId != null ? expressDeliveryBillId.hashCode() : 0);
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        result = 31 * result + (modifyDateTime != null ? modifyDateTime.hashCode() : 0);
        return result;
    }
}
