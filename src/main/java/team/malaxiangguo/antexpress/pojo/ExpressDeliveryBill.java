package team.malaxiangguo.antexpress.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "express_delivery_bill", schema = "antexpress", catalog = "")
public class ExpressDeliveryBill {
    private int expressDeliveryBillId;
    private String expressDeliveryBillNo;
    private String status;
    private Integer senderId;
    private Integer receiverId;
    private Timestamp createDateTime;
    private Timestamp modifyDateTime;

    @Id
    @Column(name = "express_delivery_bill_id", nullable = false)
    public int getExpressDeliveryBillId() {
        return expressDeliveryBillId;
    }

    public void setExpressDeliveryBillId(int expressDeliveryBillId) {
        this.expressDeliveryBillId = expressDeliveryBillId;
    }

    @Basic
    @Column(name = "express_delivery_bill_no", nullable = true, length = 45)
    public String getExpressDeliveryBillNo() {
        return expressDeliveryBillNo;
    }

    public void setExpressDeliveryBillNo(String expressDeliveryBillNo) {
        this.expressDeliveryBillNo = expressDeliveryBillNo;
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
    @Column(name = "sender_id", nullable = true)
    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    @Basic
    @Column(name = "receiver_id", nullable = true)
    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
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

        ExpressDeliveryBill that = (ExpressDeliveryBill) o;

        if (expressDeliveryBillId != that.expressDeliveryBillId) return false;
        if (expressDeliveryBillNo != null ? !expressDeliveryBillNo.equals(that.expressDeliveryBillNo) : that.expressDeliveryBillNo != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (senderId != null ? !senderId.equals(that.senderId) : that.senderId != null) return false;
        if (receiverId != null ? !receiverId.equals(that.receiverId) : that.receiverId != null) return false;
        if (createDateTime != null ? !createDateTime.equals(that.createDateTime) : that.createDateTime != null)
            return false;
        if (modifyDateTime != null ? !modifyDateTime.equals(that.modifyDateTime) : that.modifyDateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = expressDeliveryBillId;
        result = 31 * result + (expressDeliveryBillNo != null ? expressDeliveryBillNo.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (senderId != null ? senderId.hashCode() : 0);
        result = 31 * result + (receiverId != null ? receiverId.hashCode() : 0);
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        result = 31 * result + (modifyDateTime != null ? modifyDateTime.hashCode() : 0);
        return result;
    }
}
