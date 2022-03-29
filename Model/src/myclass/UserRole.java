package myclass;


 

public class UserRole {
    
    private Integer ID;
    private Integer UserId ;
    private String RoleName;
    private Integer RoleStatus ;


    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleStatus(Integer RoleStatus) {
        this.RoleStatus = RoleStatus;
    }

    public Integer getRoleStatus() {
        return RoleStatus;
    }
}
