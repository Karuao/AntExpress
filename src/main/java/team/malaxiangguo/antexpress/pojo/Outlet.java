package team.malaxiangguo.antexpress.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Outlet {
    private int outletId;
    private String address;
    private String deliveryAddress;
    private Integer departmentId;
    private Timestamp createDateTime;
    private Timestamp modifyDateTime;

    @Id
    @Column(name = "outlet_id", nullable = false)
    public int getOutletId() {
        return outletId;
    }

    public void setOutletId(int outletId) {
        this.outletId = outletId;
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
    @Column(name = "delivery_address", nullable = true, length = 45)
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Basic
    @Column(name = "department_id", nullable = true)
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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

        Outlet outlet = (Outlet) o;

        if (outletId != outlet.outletId) return false;
        if (address != null ? !address.equals(outlet.address) : outlet.address != null) return false;
        if (deliveryAddress != null ? !deliveryAddress.equals(outlet.deliveryAddress) : outlet.deliveryAddress != null)
            return false;
        if (departmentId != null ? !departmentId.equals(outlet.departmentId) : outlet.departmentId != null)
            return false;
        if (createDateTime != null ? !createDateTime.equals(outlet.createDateTime) : outlet.createDateTime != null)
            return false;
        if (modifyDateTime != null ? !modifyDateTime.equals(outlet.modifyDateTime) : outlet.modifyDateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = outletId;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (deliveryAddress != null ? deliveryAddress.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        result = 31 * result + (modifyDateTime != null ? modifyDateTime.hashCode() : 0);
        return result;
    }
}
