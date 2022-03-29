package model;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Date;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import model.VO.GroupDetailForAddViewImpl;
import model.VO.StaticUserRoleForGetViewImpl;
import model.VO.StaticUserRoleForGetViewRowImpl;
import model.VO.UserRoleForMTFRenderViewImpl;

import model.VO.UserRoleForMTFRenderViewRowImpl;


import model.VO.UsersForAddNewUserViewImpl;

import myclass.UserInfo1;

import myclass.UserRole;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 11 02:00:05 EET 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for UsersView1.
     * @return UsersView1
     */
    public ViewObjectImpl getUsersView1() {
        return (ViewObjectImpl) findViewObject("UsersView1");
    }
    FacesContext context = FacesContext.getCurrentInstance();

    public UserInfo1 login(String username, String password) {


        /*  FacesMessage m4 =
            new FacesMessage("inlogin");
        context.addMessage(null, m4); */
        try {
            UserInfo1 user = null;

            /*   FacesMessage inlogin2 =
                new FacesMessage("inlogin2");
            context.addMessage(null, inlogin2); */


            ViewObject vo = getUsersView1();
            ViewCriteria vc = vo.createViewCriteria();
            ViewCriteriaRow vcr = vc.createViewCriteriaRow();
            vcr.setAttribute("UserName", username);
            vcr.setAttribute("UserPassword", password);
            vc.add(vcr);
            vo.applyViewCriteria(vc);
            vo.executeQuery();
            if (vo.hasNext()) {


                user = new UserInfo1();
                Row row = vo.next();

                user.setUserName((String) row.getAttribute("UserName"));
                user.setUserPassword((String) row.getAttribute("UserPassword"));
                user.setID((Integer) row.getAttribute("Id"));
                user.setUserFullName((String) row.getAttribute("UserFullName"));
                user.setUserPart((Integer) row.getAttribute("UserPart"));
                user.setACOUNTSTATE((Integer) row.getAttribute("AcountState"));
                user.setIPAddress((String) row.getAttribute("IpIddress"));
                user.setUserCity((Integer) row.getAttribute("UserCity"));


                /*  FacesMessage inlogin3 =
                    new FacesMessage("inlogin3");
                context.addMessage(null, inlogin3); */


            } else {

                /////////////////////////////////////

                /*   FacesMessage inlogin4 =
                    new FacesMessage("inlogin4");
                context.addMessage(null, inlogin4); */


                ViewObject vo1 = getUsersView1();
                vo1.executeQuery();
                ViewCriteria vc1 = vo1.createViewCriteria();
                ViewCriteriaRow vcr1 = vc1.createViewCriteriaRow();
                vcr1.setAttribute("UserName", username);

                vc1.add(vcr1);
                vo1.applyViewCriteria(vc1);
                vo1.executeQuery();

                if (vo1.hasNext()) {


                } else {


                    FacesMessage message4 = new FacesMessage("اسم المستخدم غير صحيح");
                    context.addMessage(null, message4);

                }
                ////////////////////////////////////

                /*   FacesMessage inlogin5 =
                    new FacesMessage("inlogin5");
                context.addMessage(null, inlogin5); */

                return null;
            }

            //  refreshPage();
            return user;
        } catch (Exception e) {


            FacesMessage message1 = new FacesMessage(e.getMessage());
            context.addMessage(null, message1);
            return null;
        }


    }


    public UserRole GetRole(String UserId) {


        ////////////////
        FacesContext context = FacesContext.getCurrentInstance();
        ViewObject VOEX = getUserRoleForMTFRenderView1();
        ViewCriteria vcEX = VOEX.createViewCriteria();
        ViewCriteriaRow vcrEX = vcEX.createViewCriteriaRow();

        vcrEX.setAttribute("UserId", UserId);
        vcEX.add(vcrEX);
        VOEX.applyViewCriteria(vcEX);
        VOEX.executeQuery();
        RowSet stdEX = VOEX;
        while (stdEX.hasNext()) {
            UserRoleForMTFRenderViewRowImpl stdcurrentex = (UserRoleForMTFRenderViewRowImpl) stdEX.next();

            /* context.getExternalContext().getSessionMap().put(stdcurrentex.getAttribute("RoleName").toString().trim(),
                                                             (Number)stdcurrentex.getAttribute("RoleStatus")); */

            context.getExternalContext()
                   .getSessionMap()
                   .put(stdcurrentex.getAttribute("RoleName")
                                    .toString()
                                    .trim(), stdcurrentex.getAttribute("RoleStatus"));


        }

        return null;
    }


    public String CurrentDateATime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dd = dateFormat.format(date);
        return dd;

    }

    public void loginmonitor() {

        // try {
        FacesContext context = FacesContext.getCurrentInstance();
        ViewObject usersActionsView = findViewObject("UsersActionViewView1");
        Row row = usersActionsView.createRow();


        if (context.getExternalContext()
                   .getSessionMap()
                   .get("UserId") != null) {
            row.setAttribute("UserId", context.getExternalContext()
                                              .getSessionMap()
                                              .get("UserId"));


            //  }


            row.setAttribute("ActionTime", CurrentDateATime());
            row.setAttribute("ActionType", 1);
            usersActionsView.insertRow(row);
            getDBTransaction().commit();

        }

        //   catch (Exception e) {

        //   System.out.println("error");

        //  }
        // refreshPage();
    }


    public void ResetAcountState() {


        String UserID = ADFContext.getCurrent()
                                  .getSessionScope()
                                  .get("UserId")
                                  .toString()
                                  .trim();


        ViewObjectImpl SectionImp = (ViewObjectImpl) findObject("UsersView1");
        RowIterator sectioniter =
            SectionImp.findByAltKey("AltKey", new Key(new Object[] { UserID, }), -1, Boolean.TRUE);
        if (sectioniter.hasNext()) {

            sectioniter.first().setAttribute("AcountState", 0);
            getDBTransaction().commit();


        }


    }


    public UserInfo1 namelogin(String username) {

        FacesContext context = FacesContext.getCurrentInstance();
        try {
            UserInfo1 user = null;


            ViewObject vo = getUsersView1();
            ViewCriteria vc = vo.createViewCriteria();
            ViewCriteriaRow vcr = vc.createViewCriteriaRow();
            vcr.setAttribute("UserName", username);

            vc.add(vcr);
            vo.applyViewCriteria(vc);
            vo.executeQuery();
            if (vo.hasNext()) {
                user = new UserInfo1();
                Row row = vo.next();
                user.setID((Integer) row.getAttribute("Id"));
                user.setUserName((String) row.getAttribute("UserName"));
                user.setUserPassword((String) row.getAttribute("UserPassword"));

                user.setUserFullName((String) row.getAttribute("UserFullName"));

                user.setUserPart((Integer) row.getAttribute("UserPart"));
                user.setACOUNTSTATE((Integer) row.getAttribute("AcountState"));

            }

            return user;
        } catch (Exception e) {
            FacesMessage message1 = new FacesMessage(e.getMessage());
            context.addMessage(null, message1);
            return null;
        }


    }


    public void Faildloginmonitor() {

        try {
            FacesContext context = FacesContext.getCurrentInstance();


            ViewObject usersActionsView = findViewObject("UsersActionView1");
            Row row = usersActionsView.createRow();

            /*   row.setAttribute("UserId",
                             (Number)context.getExternalContext().getSessionMap().get("UserId")); */


            if (context.getExternalContext()
                       .getSessionMap()
                       .get("UserId") != null) {

                row.setAttribute("UserId", context.getExternalContext()
                                                  .getSessionMap()
                                                  .get("UserId"));

            }


            row.setAttribute("ActionTime", CurrentDateATime());
            row.setAttribute("ActionType", 8);
            usersActionsView.insertRow(row);
            getDBTransaction().commit();
            getDBTransaction().rollback();


        } catch (Exception e) {

            System.out.println("error");

        }
    }

    public void incuseracountstate() {


        String UserId = ADFContext.getCurrent()
                                  .getSessionScope()
                                  .get("UserId")
                                  .toString();


        Number ACOUNTSTATE = (Number) ADFContext.getCurrent()
                                                .getSessionScope()
                                                .get("ACOUNTSTATE");


        ViewObjectImpl usersImp = (ViewObjectImpl) findObject("UsersView1");


        RowIterator useriter = usersImp.findByAltKey("AltKey", new Key(new Object[] { UserId }), -1, Boolean.TRUE);


        if (useriter.hasNext()) {

            Integer xx = ACOUNTSTATE.intValue();
            xx = xx + 1;
            String sd = xx.toString();


            useriter.first().setAttribute("AcountState", sd);
            getDBTransaction().commit();

        }

    }


    public void logoutmonitor() {
        //  try {


        //   getDBTransaction().rollback();


        ViewObject usersActionsView = findViewObject("UsersActionViewView1");
        Row row = usersActionsView.createRow();


        if (context.getExternalContext()
                   .getSessionMap()
                   .get("UserId") != null) {
            row.setAttribute("UserId", context.getExternalContext()
                                              .getSessionMap()
                                              .get("UserId"));


            row.setAttribute("ActionTime", CurrentDateATime());
            row.setAttribute("ActionType", 5);
            usersActionsView.insertRow(row);
            getDBTransaction().commit();

            //   getDBTransaction().rollback();

            //  } catch (Exception e) {

            // System.out.println("error");

            //  }

        }


    }


    public UserRole GetNullRole() {


        ////////////////
        FacesContext context = FacesContext.getCurrentInstance();
        ViewObject VOEX = getStaticUserRoleForGetView1();


        VOEX.executeQuery();
        RowSet stdEX = VOEX;


        while (stdEX.hasNext()) {
            StaticUserRoleForGetViewRowImpl stdcurrentex = (StaticUserRoleForGetViewRowImpl) stdEX.next();

            context.getExternalContext()
                   .getSessionMap()
                   .put(stdcurrentex.getAttribute("RoleName")
                                    .toString()
                                    .trim(), 0);


        }

        return null;
    }


    public Boolean CheckUserName(String UserName) {


        ViewObjectImpl SectionImp = (ViewObjectImpl) findObject("UsersForCheckUserView1");
        RowIterator sectioniter =
            SectionImp.findByAltKey("AltKey", new Key(new Object[] { UserName }), -1, Boolean.TRUE);
        if (sectioniter.hasNext()) {
            return true;
        }

        return false;

    }


    public void InsertMonitor(String tablename, String tableid) {

        try {


            FacesContext context = FacesContext.getCurrentInstance();


            ViewObject usersActionsView = findViewObject("UsersActionViewView1");
            Row row = usersActionsView.createRow();


            /* row.setAttribute("UserId",
                             (Number)context.getExternalContext().getSessionMap().get("UserId")); */

            row.setAttribute("UserId", context.getExternalContext()
                                              .getSessionMap()
                                              .get("UserId"));


            row.setAttribute("ActionTime", CurrentDateATime());
            row.setAttribute("ActionType", 2);
            row.setAttribute("TableName", tablename);
            row.setAttribute("TableId", tableid);
            usersActionsView.insertRow(row);
            getDBTransaction().commit();

        }

        catch (Exception e) {
            System.out.print(e.getMessage());
        }


    }
    
    
    public void UpdateField(String TabeName, String id) {


        String User =
            ADFContext.getCurrent().getSessionScope().get("UserName").toString();
        
        ViewObject VOEX = null; 
        if (TabeName.equalsIgnoreCase("USERS")) {
            
              VOEX = getUsersForCheckUserView1(); 
        }
        
        ViewCriteria vcEX = VOEX.createViewCriteria();
        ViewCriteriaRow vcrEX = vcEX.createViewCriteriaRow();
        vcrEX.setAttribute("Id", id);
        vcEX.add(vcrEX);
        VOEX.applyViewCriteria(vcEX);
        VOEX.executeQuery();
        RowSet stdEX = VOEX;
        if (stdEX.hasNext()) {
            
            
            stdEX.first().setAttribute("UPDATEDBY", User);
            stdEX.first().setAttribute("UPDATEDON", CurrentDate());

            getDBTransaction().commit();
            
            
        }  
      
       
    }


    public Boolean CheckUserInRole(String UserID) {

        //////////////////////////////// UsersForCheckUserView1

        ViewObject VOEX = getgetUserRoleForInsertView1();
        ViewCriteria vcEX = VOEX.createViewCriteria();
        ViewCriteriaRow vcrEX = vcEX.createViewCriteriaRow();
        vcrEX.setAttribute("UserId", UserID);
        vcEX.add(vcrEX);
        VOEX.applyViewCriteria(vcEX);
        VOEX.executeQuery();
        RowSet stdEX = VOEX;
        if (stdEX.hasNext()) {
            
            return true;
        } else {
            return false;
        }
        ///////////////////////////

        ////////////////////////////////////////////////////
    }


    public void InserttRoleForUser(String UserID) {

        try {
            ViewObjectImpl vo = getStaticUserRoleForGetView1();
            RowSetIterator iter = vo.createRowSetIterator(null);

            Boolean xx = CheckUserInRole(UserID);


            if (xx == false) {
                while (iter.hasNext()) {
                    Row r = iter.next();
                    //////////////insert in technicalcondition///


                    ViewObject usersActionsView = findViewObject("getUserRoleForInsertView1");
                    Row row = usersActionsView.createRow();


                    row.setAttribute("UserId", UserID);
                    row.setAttribute("RoleName", r.getAttribute("RoleName"));


                    usersActionsView.insertRow(row);
                    getDBTransaction().commit();
                }

                iter.closeRowSetIterator();
            }
        } catch (Exception e) {


            System.out.println("error");

        }


    }


    public Date CurrentDate() {


        Date date = new Date();

        return date;

    }
    
    
    public void UpdateTableField66(String TableId) {


        String UserID =
            ADFContext.getCurrent().getSessionScope().get("UserName").toString().trim();
     
        try {
           ViewObject vo = getUsersForEditView1();
            ViewCriteria vc = vo.createViewCriteria();
            ViewCriteriaRow vcr = vc.createViewCriteriaRow();
            vcr.setAttribute("Id", TableId);
            vc.add(vcr);
            vo.applyViewCriteria(vc);
            vo.executeQuery();
            if (vo.hasNext()) {
                Row row = vo.next();
                row.setAttribute("UpdatedBy", UserID);
                row.setAttribute("UPDATEDON", CurrentDateATime());
                getDBTransaction().commit();
   
            } 

       
        } catch (Exception e) {


            FacesMessage message1 = new FacesMessage(e.getMessage());
            context.addMessage(null, message1);
          
        }
        
        
/*
        String UserID =
            ADFContext.getCurrent().getSessionScope().get("UserName").toString().trim();


        ViewObjectImpl SectionImp = (ViewObjectImpl)findObject("UsersForEditView1");
        RowIterator sectioniter =
            SectionImp.findByAltKey("AltKey", new Key(new Object[] { TableId, }),
                                    -1, Boolean.TRUE);
        if (sectioniter.hasNext()) {

            sectioniter.first().setAttribute("UpdatedBy", UserID);
            sectioniter.first().setAttribute("UPDATEDON", CurrentDateATime());
            getDBTransaction().commit();
        }

*/


    }

    public void UpdateTableField( Object Key) {


        FacesMessage messageemptyuserU = new FacesMessage("11111111");
        context.addMessage(null, messageemptyuserU);


        String User = ADFContext.getCurrent()
                                .getSessionScope()
                                .get("UserName")
                                .toString();


        ViewObjectImpl usersImp = (ViewObjectImpl) findObject("UsersForEditView1");
        RowIterator useriter = usersImp.findByAltKey("AltKey", new Key(new Object[] { Key }), -1, Boolean.TRUE);
        if (useriter.hasNext()) {

            FacesMessage messageempty3 = new FacesMessage("IN Update Procedure");
            context.addMessage(null, messageempty3);


            useriter.first().setAttribute("UPDATEDBY", User);

            FacesMessage messageempty4 = new FacesMessage("after UPDATEDBY");
            context.addMessage(null, messageempty4);


            useriter.first().setAttribute("UPDATEDON", CurrentDate());


            FacesMessage messageempty5 = new FacesMessage("after UPDATEDON");
            context.addMessage(null, messageempty5);

            getDBTransaction().commit();


        }
    }


    public void UpdateMonitor(String tablename, String tableid) {

        try {
            FacesContext context = FacesContext.getCurrentInstance();
            ViewObject usersActionsView = findViewObject("UsersActionViewView1");
            Row row = usersActionsView.createRow();

            /* row.setAttribute("UserId",
                             (Number)context.getExternalContext().getSessionMap().get("UserId")); */

            row.setAttribute("UserId", context.getExternalContext()
                                              .getSessionMap()
                                              .get("UserId"));

            row.setAttribute("ActionTime", CurrentDateATime());
            row.setAttribute("ActionType", 3);
            row.setAttribute("TableName", tablename);
            row.setAttribute("TableId", tableid);
            usersActionsView.insertRow(row);
            getDBTransaction().commit();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }


    }


    public void InserttNewRoleForUser(String UserID) {


        ViewObjectImpl vo = getStaticUserRoleForGetView1();
      RowSetIterator iter = vo.createRowSetIterator(null);


        while (iter.hasNext()) {
            Row r = iter.next();

            String RoleNamee = r.getAttribute("RoleName")
                                .toString()
                                .trim();

            if (RoleNamee != null && UserID != null) {

                CheckUserAndNewInRole(UserID, RoleNamee);
            }


        }


        iter.closeRowSetIterator();


    }
    
    
    public void CheckUserAndNewInRole(String UserID, String RoleName) {

        //////////////////////////////// UsersForCheckUserView1

        ViewObject VOEX = getUserRoleForInsertView1();
        ViewCriteria vcEX = VOEX.createViewCriteria();
        ViewCriteriaRow vcrEX = vcEX.createViewCriteriaRow();
        vcrEX.setAttribute("UserId", UserID);
        vcrEX.setAttribute("RoleName", RoleName);

        vcEX.add(vcrEX);
        VOEX.applyViewCriteria(vcEX);
        VOEX.executeQuery();
        RowSet stdEX = VOEX;
        if (stdEX.hasNext()) {

        } else {

            EndInsertUSerRole(UserID, RoleName);

        }
     
    }
    
    
    public void EndInsertUSerRole(String UserId, String RoleName) {


        ViewObject usersActionsView = findViewObject("UserRoleForInsertView1");
        Row row = usersActionsView.createRow();
        row.setAttribute("UserId", UserId);
        row.setAttribute("RoleName", RoleName);
        usersActionsView.insertRow(row);
        getDBTransaction().commit();


    }
    
    
    public Boolean CheckUserInUserAdded(String UserID, String GroupID) {

        //////////////////////////////// UsersForCheckUserView1

        ViewObject VOEX = getUserGroupAddedForAddView1();
        ViewCriteria vcEX = VOEX.createViewCriteria();
        ViewCriteriaRow vcrEX = vcEX.createViewCriteriaRow();
        vcrEX.setAttribute("UserId", UserID);
        vcrEX.setAttribute("GroupId", GroupID);
        vcEX.add(vcrEX);
        VOEX.applyViewCriteria(vcEX);
        VOEX.executeQuery();
        RowSet stdEX = VOEX;
        if (stdEX.hasNext()) {
            return true;
        } else {
            return false;
        }
        ///////////////////////////

        ////////////////////////////////////////////////////
    }
    
    
    public void InsertUserGroup(String UserId, String GroupId) {


        ViewObject usersActionsView =
            findViewObject("UserGroupAddedForAddView1");
        Row row = usersActionsView.createRow();

        row.setAttribute("UserId", UserId);

        row.setAttribute("GroupId", GroupId);


        usersActionsView.insertRow(row);
        getDBTransaction().commit();


    }
    
    
    public void RemoveUserGroup(String UserId, String GroupId) {


        ViewObjectImpl SectionImp =
            (ViewObjectImpl)findObject("UserGroupAddedForAddView1");
        RowIterator sectioniter =
            SectionImp.findByAltKey("AltKey", new Key(new Object[] { UserId,
                                                                     GroupId }),
                                    -1, Boolean.TRUE);
        if (sectioniter.hasNext()) {


            sectioniter.first().remove();
            getDBTransaction().commit();


        }


    }
    
    
    public void InserttRoleForGroup(String RoleId) {

        try {
            ViewObjectImpl vo = getStaticUserRoleForGetView1();
            RowSetIterator iter = vo.createRowSetIterator(null);


            while (iter.hasNext()) {
                Row r = iter.next();
                //////////////insert in technicalcondition///
                ViewObject usersActionsView =
                    findViewObject("GroupDetailForAddView1");
                Row row = usersActionsView.createRow();

                row.setAttribute("GroupId", RoleId);
                row.setAttribute("RoleName", r.getAttribute("RoleName"));
                usersActionsView.insertRow(row);
                getDBTransaction().commit();

            }
            iter.closeRowSetIterator();

        } catch (Exception e) {

            System.out.println("error");
        }


    }
    
    
    public void RemovetRoleForGroup(String GroupId) {


        ViewObject VOEX = getGroupDetailForAddView1();
        ViewCriteria vcEX = VOEX.createViewCriteria();
        ViewCriteriaRow vcrEX = vcEX.createViewCriteriaRow();

        vcrEX.setAttribute("GroupId", GroupId);
        vcEX.add(vcrEX);
        VOEX.applyViewCriteria(vcEX);
        VOEX.executeQuery();
        RowSet stdEX = VOEX;
        while (stdEX.hasNext()) {


            stdEX.removeCurrentRow();
            getDBTransaction().commit();

        }
    }
    
    
    public Boolean UpdateUserPassword(String UserId, String UserName,
                                      String OldPassword, String NewPassword) {


        ViewObjectImpl SectionImp =
            (ViewObjectImpl)findObject("UsersForPaswordView1");
        SectionImp.executeQuery();
        RowIterator sectioniter =
            SectionImp.findByAltKey("AltKey", new Key(new Object[] { UserId }),
                                    -1, Boolean.TRUE);
        if (sectioniter.hasNext()) {


            String nUserName =
                sectioniter.first().getAttribute("UserName").toString().trim();
            String nPassword =
                sectioniter.first().getAttribute("UserPassword").toString().trim();

            if (nUserName.equalsIgnoreCase(UserName) &&
                nPassword.equalsIgnoreCase(OldPassword)) {
                sectioniter.first().setAttribute("UserPassword", NewPassword);
                getDBTransaction().commit();
                getDBTransaction().rollback();
                return true;
            }

            else {
                return false;
            }


        }

        return false;

    }


    /**
     * Container's getter for UserRoleForMTFRenderView1.
     * @return UserRoleForMTFRenderView1
     */
    public UserRoleForMTFRenderViewImpl getUserRoleForMTFRenderView1() {
        return (UserRoleForMTFRenderViewImpl) findViewObject("UserRoleForMTFRenderView1");
    }

    /**
     * Container's getter for UsersActionViewView1.
     * @return UsersActionViewView1
     */
    public ViewObjectImpl getUsersActionViewView1() {
        return (ViewObjectImpl) findViewObject("UsersActionViewView1");
    }

    /**
     * Container's getter for StaticUserRoleForGetView1.
     * @return StaticUserRoleForGetView1
     */
    public StaticUserRoleForGetViewImpl getStaticUserRoleForGetView1() {
        return (StaticUserRoleForGetViewImpl) findViewObject("StaticUserRoleForGetView1");
    }

    /**
     * Container's getter for UsersForAddNewUserView1.
     * @return UsersForAddNewUserView1
     */
    public UsersForAddNewUserViewImpl getUsersForAddNewUserView1() {
        return (UsersForAddNewUserViewImpl) findViewObject("UsersForAddNewUserView1");
    }

    /**
     * Container's getter for ProgramNconversionsRootView1.
     * @return ProgramNconversionsRootView1
     */
    public ViewObjectImpl getProgramNconversionsRootView1() {
        return (ViewObjectImpl) findViewObject("ProgramNconversionsRootView1");
    }

    /**
     * Container's getter for ProgramNconversionsUserPart1.
     * @return ProgramNconversionsUserPart1
     */
    public ViewObjectImpl getProgramNconversionsUserPart1() {
        return (ViewObjectImpl) findViewObject("ProgramNconversionsUserPart1");
    }

    /**
     * Container's getter for ProgramNconversionsPurview1.
     * @return ProgramNconversionsPurview1
     */
    public ViewObjectImpl getProgramNconversionsPurview1() {
        return (ViewObjectImpl) findViewObject("ProgramNconversionsPurview1");
    }

    /**
     * Container's getter for ProgramNconversionsAcountStat1.
     * @return ProgramNconversionsAcountStat1
     */
    public ViewObjectImpl getProgramNconversionsAcountStat1() {
        return (ViewObjectImpl) findViewObject("ProgramNconversionsAcountStat1");
    }


    /**
     * Container's getter for ItsNconversionsForRootView1.
     * @return ItsNconversionsForRootView1
     */
    public ViewObjectImpl getItsNconversionsForRootView1() {
        return (ViewObjectImpl) findViewObject("ItsNconversionsForRootView1");
    }

    /**
     * Container's getter for ItsNconversionsForCity1.
     * @return ItsNconversionsForCity1
     */
    public ViewObjectImpl getItsNconversionsForCity1() {
        return (ViewObjectImpl) findViewObject("ItsNconversionsForCity1");
    }

    /**
     * Container's getter for UsersForCheckUserView1.
     * @return UsersForCheckUserView1
     */
    public ViewObjectImpl getUsersForCheckUserView1() {
        return (ViewObjectImpl) findViewObject("UsersForCheckUserView1");
    }

    /**
     * Container's getter for getUserRoleForInsertView1.
     * @return getUserRoleForInsertView1
     */
    public ViewObjectImpl getgetUserRoleForInsertView1() {
        return (ViewObjectImpl) findViewObject("getUserRoleForInsertView1");
    }

    /**
     * Container's getter for UserRoleForInsertView1.
     * @return UserRoleForInsertView1
     */
    public ViewObjectImpl getUserRoleForInsertView1() {
        return (ViewObjectImpl) findViewObject("UserRoleForInsertView1");
    }


    /**
     * Container's getter for UserRoleWithUserForEditView1.
     * @return UserRoleWithUserForEditView1
     */
    public ViewObjectImpl getUserRoleWithUserForEditView1() {
        return (ViewObjectImpl) findViewObject("UserRoleWithUserForEditView1");
    }

    /**
     * Container's getter for UserRoleWithUserForEditView2.
     * @return UserRoleWithUserForEditView2
     */
    public ViewObjectImpl getUserRoleWithUserForEditView2() {
        return (ViewObjectImpl) findViewObject("UserRoleWithUserForEditView2");
    }

    /**
     * Container's getter for UserWithUserRole1.
     * @return UserWithUserRole1
     */
    public ViewLinkImpl getUserWithUserRole1() {
        return (ViewLinkImpl) findViewLink("UserWithUserRole1");
    }

    /**
     * Container's getter for ProgramNconversionsRoleStatus1.
     * @return ProgramNconversionsRoleStatus1
     */
    public ViewObjectImpl getProgramNconversionsRoleStatus1() {
        return (ViewObjectImpl) findViewObject("ProgramNconversionsRoleStatus1");
    }

    /**
     * Container's getter for UserGroupAddedForAddView1.
     * @return UserGroupAddedForAddView1
     */
    public ViewObjectImpl getUserGroupAddedForAddView1() {
        return (ViewObjectImpl) findViewObject("UserGroupAddedForAddView1");
    }

    /**
     * Container's getter for UserGroupAddedForAddView2.
     * @return UserGroupAddedForAddView2
     */
    public ViewObjectImpl getUserGroupAddedForAddView2() {
        return (ViewObjectImpl) findViewObject("UserGroupAddedForAddView2");
    }

    /**
     * Container's getter for UserWithUserGroup1.
     * @return UserWithUserGroup1
     */
    public ViewLinkImpl getUserWithUserGroup1() {
        return (ViewLinkImpl) findViewLink("UserWithUserGroup1");
    }

    /**
     * Container's getter for UserGroupForAddView1.
     * @return UserGroupForAddView1
     */
    public ViewObjectImpl getUserGroupForAddView1() {
        return (ViewObjectImpl) findViewObject("UserGroupForAddView1");
    }

    /**
     * Container's getter for UsersForEditView1.
     * @return UsersForEditView1
     */
    public ViewObjectImpl getUsersForEditView1() {
        return (ViewObjectImpl) findViewObject("UsersForEditView1");
    }

    /**
     * Container's getter for GroupDetailForAddView1.
     * @return GroupDetailForAddView1
     */
    public GroupDetailForAddViewImpl getGroupDetailForAddView1() {
        return (GroupDetailForAddViewImpl) findViewObject("GroupDetailForAddView1");
    }

    /**
     * Container's getter for GroupDetailForAddView2.
     * @return GroupDetailForAddView2
     */
    public GroupDetailForAddViewImpl getGroupDetailForAddView2() {
        return (GroupDetailForAddViewImpl) findViewObject("GroupDetailForAddView2");
    }

    /**
     * Container's getter for UserGroupWithGroupDetail1.
     * @return UserGroupWithGroupDetail1
     */
    public ViewLinkImpl getUserGroupWithGroupDetail1() {
        return (ViewLinkImpl) findViewLink("UserGroupWithGroupDetail1");
    }

    /**
     * Container's getter for UsersForActionOperationView1.
     * @return UsersForActionOperationView1
     */
    public ViewObjectImpl getUsersForActionOperationView1() {
        return (ViewObjectImpl) findViewObject("UsersForActionOperationView1");
    }

    /**
     * Container's getter for UsersActionForOperationView1.
     * @return UsersActionForOperationView1
     */
    public ViewObjectImpl getUsersActionForOperationView1() {
        return (ViewObjectImpl) findViewObject("UsersActionForOperationView1");
    }

    /**
     * Container's getter for UsersActionForOperationView2.
     * @return UsersActionForOperationView2
     */
    public ViewObjectImpl getUsersActionForOperationView2() {
        return (ViewObjectImpl) findViewObject("UsersActionForOperationView2");
    }

    /**
     * Container's getter for UsersWithUserAction1.
     * @return UsersWithUserAction1
     */
    public ViewLinkImpl getUsersWithUserAction1() {
        return (ViewLinkImpl) findViewLink("UsersWithUserAction1");
    }

    /**
     * Container's getter for ProgramNconversionsUserAction1.
     * @return ProgramNconversionsUserAction1
     */
    public ViewObjectImpl getProgramNconversionsUserAction1() {
        return (ViewObjectImpl) findViewObject("ProgramNconversionsUserAction1");
    }


    /**
     * Container's getter for UsersForPaswordView1.
     * @return UsersForPaswordView1
     */
    public ViewObjectImpl getUsersForPaswordView1() {
        return (ViewObjectImpl) findViewObject("UsersForPaswordView1");
    }

    /**
     * Container's getter for VehiclesForAddView1.
     * @return VehiclesForAddView1
     */
    public ViewObjectImpl getVehiclesForAddView1() {
        return (ViewObjectImpl) findViewObject("VehiclesForAddView1");
    }

    /**
     * Container's getter for OurviewvgvtftView1.
     * @return OurviewvgvtftView1
     */
    public ViewObjectImpl getOurviewvgvtftView1() {
        return (ViewObjectImpl) findViewObject("OurviewvgvtftView1");
    }

    /**
     * Container's getter for FuletypesForGetView1.
     * @return FuletypesForGetView1
     */
    public ViewObjectImpl getFuletypesForGetView1() {
        return (ViewObjectImpl) findViewObject("FuletypesForGetView1");
    }

    /**
     * Container's getter for OurviewdivunitView1.
     * @return OurviewdivunitView1
     */
    public ViewObjectImpl getOurviewdivunitView1() {
        return (ViewObjectImpl) findViewObject("OurviewdivunitView1");
    }
}
