package team.malaxiangguo.antexpress.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "express_delivery_bill", schema = "antexpress", catalog = "")
public class ExpressDeliveryBill {
    private int expressDeliveryBillId;
    private String trackingNo;
    private String status;
    private String senderName;
    private String senderPhoneNo;
    private String senderAddress;
    private String senderDetailedAddress;
    private String receiverName;
    private String receiverPhoneNo;
    private String receiverAddress;
    private String receiverDetailedAddress;
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
    @Column(name = "tracking_no", nullable = true, length = 45)
    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
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
    @Column(name = "sender_name", nullable = true, length = 45)
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Basic
    @Column(name = "sender_phone_no", nullable = true, length = 45)
    public String getSenderPhoneNo() {
        return senderPhoneNo;
    }

    public void setSenderPhoneNo(String senderPhoneNo) {
        this.senderPhoneNo = senderPhoneNo;
    }

    @Basic
    @Column(name = "sender_address", nullable = true, length = 45)
    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    @Basic
    @Column(name = "sender_detailed_address", nullable = true, length = 45)
    public String getSenderDetailedAddress() {
        return senderDetailedAddress;
    }

    public void setSenderDetailedAddress(String senderDetailedAddress) {
        this.senderDetailedAddress = senderDetailedAddress;
    }

    @Basic
    @Column(name = "receiver_name", nullable = true, length = 45)
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "receiver_phone_no", nullable = true, length = 45)
    public String getReceiverPhoneNo() {
        return receiverPhoneNo;
    }

    public void setReceiverPhoneNo(String receiverPhoneNo) {
        this.receiverPhoneNo = receiverPhoneNo;
    }

    @Basic
    @Column(name = "receiver_address", nullable = true, length = 45)
    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    @Basic
    @Column(name = "receiver_detailed_address", nullable = true, length = 45)
    public String getReceiverDetailedAddress() {
        return receiverDetailedAddress;
    }

    public void setReceiverDetailedAddress(String receiverDetailedAddress) {
        this.receiverDetailedAddress = receiverDetailedAddress;
    }

    @Basic
    @Column(name = "create_date_time", nullable = true, updatable = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Timestamp getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Timestamp createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Basic
    @Column(name = "modify_date_time", nullable = true, updatable = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
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
        if (trackingNo != null ? !trackingNo.equals(that.trackingNo) : that.trackingNo != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (senderName != null ? !senderName.equals(that.senderName) : that.senderName != null) return false;
        if (senderPhoneNo != null ? !senderPhoneNo.equals(that.senderPhoneNo) : that.senderPhoneNo != null)
            return false;
        if (senderAddress != null ? !senderAddress.equals(that.senderAddress) : that.senderAddress != null)
            return false;
        if (senderDetailedAddress != null ? !senderDetailedAddress.equals(that.senderDetailedAddress) : that.senderDetailedAddress != null)
            return false;
        if (receiverName != null ? !receiverName.equals(that.receiverName) : that.receiverName != null) return false;
        if (receiverPhoneNo != null ? !receiverPhoneNo.equals(that.receiverPhoneNo) : that.receiverPhoneNo != null)
            return false;
        if (receiverAddress != null ? !receiverAddress.equals(that.receiverAddress) : that.receiverAddress != null)
            return false;
        if (receiverDetailedAddress != null ? !receiverDetailedAddress.equals(that.receiverDetailedAddress) : that.receiverDetailedAddress != null)
            return false;
        if (createDateTime != null ? !createDateTime.equals(that.createDateTime) : that.createDateTime != null)
            return false;
        if (modifyDateTime != null ? !modifyDateTime.equals(that.modifyDateTime) : that.modifyDateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = expressDeliveryBillId;
        result = 31 * result + (trackingNo != null ? trackingNo.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (senderName != null ? senderName.hashCode() : 0);
        result = 31 * result + (senderPhoneNo != null ? senderPhoneNo.hashCode() : 0);
        result = 31 * result + (senderAddress != null ? senderAddress.hashCode() : 0);
        result = 31 * result + (senderDetailedAddress != null ? senderDetailedAddress.hashCode() : 0);
        result = 31 * result + (receiverName != null ? receiverName.hashCode() : 0);
        result = 31 * result + (receiverPhoneNo != null ? receiverPhoneNo.hashCode() : 0);
        result = 31 * result + (receiverAddress != null ? receiverAddress.hashCode() : 0);
        result = 31 * result + (receiverDetailedAddress != null ? receiverDetailedAddress.hashCode() : 0);
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        result = 31 * result + (modifyDateTime != null ? modifyDateTime.hashCode() : 0);
        return result;
    }
}
