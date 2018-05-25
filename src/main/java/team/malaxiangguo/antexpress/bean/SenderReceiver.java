package team.malaxiangguo.antexpress.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sender_receiver", schema = "antexpress", catalog = "")
public class SenderReceiver {
    private int senderReceiverId;
    private String name;
    private String phoneNo;
    private String telephoneNo;
    private String address;
    private String completeAddress;
    private Timestamp createDateTime;
    private Timestamp modifyDateTime;

    @Id
    @Column(name = "sender_receiver_id", nullable = false)
    public int getSenderReceiverId() {
        return senderReceiverId;
    }

    public void setSenderReceiverId(int senderReceiverId) {
        this.senderReceiverId = senderReceiverId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "phone_no", nullable = true, length = 45)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "telephone_no", nullable = true, length = 45)
    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "complete_address", nullable = true, length = -1)
    public String getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
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
    @Column(name = "create_date_time", nullable = true, updatable = false)
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

        SenderReceiver that = (SenderReceiver) o;

        if (senderReceiverId != that.senderReceiverId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (phoneNo != null ? !phoneNo.equals(that.phoneNo) : that.phoneNo != null) return false;
        if (telephoneNo != null ? !telephoneNo.equals(that.telephoneNo) : that.telephoneNo != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (completeAddress != null ? !completeAddress.equals(that.completeAddress) : that.completeAddress != null)
            return false;
        if (createDateTime != null ? !createDateTime.equals(that.createDateTime) : that.createDateTime != null)
            return false;
        if (modifyDateTime != null ? !modifyDateTime.equals(that.modifyDateTime) : that.modifyDateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = senderReceiverId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phoneNo != null ? phoneNo.hashCode() : 0);
        result = 31 * result + (telephoneNo != null ? telephoneNo.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (completeAddress != null ? completeAddress.hashCode() : 0);
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        result = 31 * result + (modifyDateTime != null ? modifyDateTime.hashCode() : 0);
        return result;
    }
}
