package team.malaxiangguo.antexpress.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "occupation_permission_mapping", schema = "antexpress", catalog = "")
public class OccupationPermissionMapping {
    private int occupationPermissionMappingId;
    private Integer occupationId;
    private Integer permissionId;
    private Timestamp createDateTime;
    private Timestamp modifyDateTime;

    @Id
    @Column(name = "occupation_permission_mapping_id", nullable = false)
    public int getOccupationPermissionMappingId() {
        return occupationPermissionMappingId;
    }

    public void setOccupationPermissionMappingId(int occupationPermissionMappingId) {
        this.occupationPermissionMappingId = occupationPermissionMappingId;
    }

    @Basic
    @Column(name = "occupation_id", nullable = true)
    public Integer getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(Integer occupationId) {
        this.occupationId = occupationId;
    }

    @Basic
    @Column(name = "permission_id", nullable = true)
    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
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

        OccupationPermissionMapping that = (OccupationPermissionMapping) o;

        if (occupationPermissionMappingId != that.occupationPermissionMappingId) return false;
        if (occupationId != null ? !occupationId.equals(that.occupationId) : that.occupationId != null) return false;
        if (permissionId != null ? !permissionId.equals(that.permissionId) : that.permissionId != null) return false;
        if (createDateTime != null ? !createDateTime.equals(that.createDateTime) : that.createDateTime != null)
            return false;
        if (modifyDateTime != null ? !modifyDateTime.equals(that.modifyDateTime) : that.modifyDateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = occupationPermissionMappingId;
        result = 31 * result + (occupationId != null ? occupationId.hashCode() : 0);
        result = 31 * result + (permissionId != null ? permissionId.hashCode() : 0);
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        result = 31 * result + (modifyDateTime != null ? modifyDateTime.hashCode() : 0);
        return result;
    }
}
