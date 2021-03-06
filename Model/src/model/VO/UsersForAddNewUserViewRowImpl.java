package model.VO;

import java.sql.Date;

import myclass.PasswordEncryption;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
 
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Mar 26 01:15:54 EEST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UsersForAddNewUserViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_USERSFORADDNEWUSER = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        UserFullName,
        UserName,
        UserPassword,
        UserPart,
        UserPurview,
        AcountState,
        IpIddress,
        UserCity,
        EnteredDate,
        EnteredUser,
        UPDATEDBY,
        UPDATEDON,
        UserRoleWithUserForEditView,
        UserGroupAddedForAddView,
        ProgramNconversionsUserPart1,
        ProgramNconversionsPurview1,
        ProgramNconversionsAcountStat1,
        ItsNconversionsForCity1;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int ID = AttributesEnum.Id.index();
    public static final int USERFULLNAME = AttributesEnum.UserFullName.index();
    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int USERPASSWORD = AttributesEnum.UserPassword.index();
    public static final int USERPART = AttributesEnum.UserPart.index();
    public static final int USERPURVIEW = AttributesEnum.UserPurview.index();
    public static final int ACOUNTSTATE = AttributesEnum.AcountState.index();
    public static final int IPIDDRESS = AttributesEnum.IpIddress.index();
    public static final int USERCITY = AttributesEnum.UserCity.index();
    public static final int ENTEREDDATE = AttributesEnum.EnteredDate.index();
    public static final int ENTEREDUSER = AttributesEnum.EnteredUser.index();
    public static final int UPDATEDBY = AttributesEnum.UPDATEDBY.index();
    public static final int UPDATEDON = AttributesEnum.UPDATEDON.index();
    public static final int USERROLEWITHUSERFOREDITVIEW = AttributesEnum.UserRoleWithUserForEditView.index();
    public static final int USERGROUPADDEDFORADDVIEW = AttributesEnum.UserGroupAddedForAddView.index();
    public static final int PROGRAMNCONVERSIONSUSERPART1 = AttributesEnum.ProgramNconversionsUserPart1.index();
    public static final int PROGRAMNCONVERSIONSPURVIEW1 = AttributesEnum.ProgramNconversionsPurview1.index();
    public static final int PROGRAMNCONVERSIONSACOUNTSTAT1 = AttributesEnum.ProgramNconversionsAcountStat1.index();
    public static final int ITSNCONVERSIONSFORCITY1 = AttributesEnum.ItsNconversionsForCity1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UsersForAddNewUserViewRowImpl() {
    }

    /**
     * Gets UsersForAddNewUser entity object.
     * @return the UsersForAddNewUser
     */
    public EntityImpl getUsersForAddNewUser() {
        return (EntityImpl) getEntity(ENTITY_USERSFORADDNEWUSER);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public Integer getId() {
        return (Integer) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(Integer value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for USER_FULL_NAME using the alias name UserFullName.
     * @return the USER_FULL_NAME
     */
    public String getUserFullName() {
        return (String) getAttributeInternal(USERFULLNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_FULL_NAME using the alias name UserFullName.
     * @param value value to set the USER_FULL_NAME
     */
    public void setUserFullName(String value) {
        setAttributeInternal(USERFULLNAME, value);
    }

    /**
     * Gets the attribute value for USER_NAME using the alias name UserName.
     * @return the USER_NAME
     */
    public String getUserName() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_NAME using the alias name UserName.
     * @param value value to set the USER_NAME
     */
    public void setUserName(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for USER_PASSWORD using the alias name UserPassword.
     * @return the USER_PASSWORD
     */
    public String getUserPassword() {
        return (String) getAttributeInternal(USERPASSWORD);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_PASSWORD using the alias name UserPassword.
     * @param value value to set the USER_PASSWORD
     */
    public void setUserPassword(String value) {
        
        String data = value;
        String k = "Blowfish";
        
        PasswordEncryption encrypter;
        String encrypted  = null ; 

        try {
        encrypter = new PasswordEncryption();
        encrypted = encrypter.encrypt(data,k);
        
        } catch (Exception e) {
        
        System.out.println("Error In Encrypt Password");
        
        }
        
        
        setAttributeInternal(USERPASSWORD, encrypted.trim());
        
        
        
    }

    /**
     * Gets the attribute value for USER_PART using the alias name UserPart.
     * @return the USER_PART
     */
    public Integer getUserPart() {
        return (Integer) getAttributeInternal(USERPART);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_PART using the alias name UserPart.
     * @param value value to set the USER_PART
     */
    public void setUserPart(Integer value) {
        setAttributeInternal(USERPART, value);
    }

    /**
     * Gets the attribute value for USER_PURVIEW using the alias name UserPurview.
     * @return the USER_PURVIEW
     */
    public Integer getUserPurview() {
        return (Integer) getAttributeInternal(USERPURVIEW);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_PURVIEW using the alias name UserPurview.
     * @param value value to set the USER_PURVIEW
     */
    public void setUserPurview(Integer value) {
        setAttributeInternal(USERPURVIEW, value);
    }

    /**
     * Gets the attribute value for ACOUNT_STATE using the alias name AcountState.
     * @return the ACOUNT_STATE
     */
    public Integer getAcountState() {
        return (Integer) getAttributeInternal(ACOUNTSTATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ACOUNT_STATE using the alias name AcountState.
     * @param value value to set the ACOUNT_STATE
     */
    public void setAcountState(Integer value) {
        setAttributeInternal(ACOUNTSTATE, value);
    }

    /**
     * Gets the attribute value for IP_IDDRESS using the alias name IpIddress.
     * @return the IP_IDDRESS
     */
    public String getIpIddress() {
        return (String) getAttributeInternal(IPIDDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for IP_IDDRESS using the alias name IpIddress.
     * @param value value to set the IP_IDDRESS
     */
    public void setIpIddress(String value) {
        setAttributeInternal(IPIDDRESS, value);
    }

    /**
     * Gets the attribute value for USER_CITY using the alias name UserCity.
     * @return the USER_CITY
     */
    public Integer getUserCity() {
        return (Integer) getAttributeInternal(USERCITY);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_CITY using the alias name UserCity.
     * @param value value to set the USER_CITY
     */
    public void setUserCity(Integer value) {
        setAttributeInternal(USERCITY, value);
    }

    /**
     * Gets the attribute value for ENTERED_DATE using the alias name EnteredDate.
     * @return the ENTERED_DATE
     */
    public Date getEnteredDate() {
        return (Date) getAttributeInternal(ENTEREDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ENTERED_DATE using the alias name EnteredDate.
     * @param value value to set the ENTERED_DATE
     */
    public void setEnteredDate(Date value) {
        setAttributeInternal(ENTEREDDATE, value);
    }

    /**
     * Gets the attribute value for ENTERED_USER using the alias name EnteredUser.
     * @return the ENTERED_USER
     */
    public String getEnteredUser() {
        return (String) getAttributeInternal(ENTEREDUSER);
    }

    /**
     * Sets <code>value</code> as attribute value for ENTERED_USER using the alias name EnteredUser.
     * @param value value to set the ENTERED_USER
     */
    public void setEnteredUser(String value) {
        setAttributeInternal(ENTEREDUSER, value);
    }

    /**
     * Gets the attribute value for UPDATED_BY using the alias name UPDATEDBY.
     * @return the UPDATED_BY
     */
    public String getUPDATEDBY() {
        return (String) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for UPDATED_BY using the alias name UPDATEDBY.
     * @param value value to set the UPDATED_BY
     */
    public void setUPDATEDBY(String value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UPDATED_ON using the alias name UPDATEDON.
     * @return the UPDATED_ON
     */
    public String getUPDATEDON() {
        return (String) getAttributeInternal(UPDATEDON);
    }

    /**
     * Sets <code>value</code> as attribute value for UPDATED_ON using the alias name UPDATEDON.
     * @param value value to set the UPDATED_ON
     */
    public void setUPDATEDON(String value) {
        setAttributeInternal(UPDATEDON, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UserRoleWithUserForEditView.
     */
    public RowIterator getUserRoleWithUserForEditView() {
        return (RowIterator) getAttributeInternal(USERROLEWITHUSERFOREDITVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UserGroupAddedForAddView.
     */
    public RowIterator getUserGroupAddedForAddView() {
        return (RowIterator) getAttributeInternal(USERGROUPADDEDFORADDVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProgramNconversionsUserPart1.
     */
    public RowSet getProgramNconversionsUserPart1() {
        return (RowSet) getAttributeInternal(PROGRAMNCONVERSIONSUSERPART1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProgramNconversionsPurview1.
     */
    public RowSet getProgramNconversionsPurview1() {
        return (RowSet) getAttributeInternal(PROGRAMNCONVERSIONSPURVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProgramNconversionsAcountStat1.
     */
    public RowSet getProgramNconversionsAcountStat1() {
        return (RowSet) getAttributeInternal(PROGRAMNCONVERSIONSACOUNTSTAT1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ItsNconversionsForCity1.
     */
    public RowSet getItsNconversionsForCity1() {
        return (RowSet) getAttributeInternal(ITSNCONVERSIONSFORCITY1);
    }
}

