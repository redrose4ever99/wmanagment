package myclass;

import oracle.jbo.domain.Number;

public class UserInfo1 {
    
    private Integer  ID;
    private String   UserFullName;
    private String   UserName;
    private String   UserPassword;
    private Integer  UserPart;
    private Integer  UserPurview;
    private Integer  ACOUNTSTATE;
    private String   IPAddress;
    private Integer   UserCity;


    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setUserFullName(String UserFullName) {
        this.UserFullName = UserFullName;
    }

    public String getUserFullName() {
        return UserFullName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPart(Integer UserPart) {
        this.UserPart = UserPart;
    }

    public Integer getUserPart() {
        return UserPart;
    }

    public void setUserPurview(Integer UserPurview) {
        this.UserPurview = UserPurview;
    }

    public Integer getUserPurview() {
        return UserPurview;
    }

    public void setACOUNTSTATE(Integer ACOUNTSTATE) {
        this.ACOUNTSTATE = ACOUNTSTATE;
    }

    public Integer getACOUNTSTATE() {
        return ACOUNTSTATE;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setUserCity(Integer UserCity) {
        this.UserCity = UserCity;
    }

    public Integer getUserCity() {
        return UserCity;
    }
}
