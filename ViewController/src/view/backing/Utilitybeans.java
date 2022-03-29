package view.backing;





import java.sql.Connection;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.faces.el.ValueBinding;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import model.AppModuleImpl;



import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.event.AttributeChangeEvent;

import org.apache.myfaces.trinidad.event.DisclosureEvent;



import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;


import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;



import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;



public class Utilitybeans {


    public String getTodayDate() {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/MM/yyyy -- HH:mm:ss");
        String today = sdf.format(d);
        return today;

    }


    public String getBindingFullName() {

        FacesContext context = FacesContext.getCurrentInstance();
        String bb;
        bb =
 (String)context.getExternalContext().getSessionMap().get("BindingFullname");
        return bb;


    }


    public String dropAllChangesAndReturn() {
        FacesContext fc = FacesContext.getCurrentInstance();
        ValueBinding vb =
            fc.getApplication().createValueBinding("#{bindings}");
        DCBindingContainer bc = (DCBindingContainer)vb.getValue(fc);
        String IterName = null;
        for (int i = 1; i <= 19; i++) {

            if (i == 1) {
                IterName = "PublicPersonForAddView1Iterator";
            }

            if (i == 2) {
                IterName = "UserRoleWithUserForEditView2Iterator";
            }

            if (i == 3) {
                IterName = "LostDetailForAddView2Iterator";
            }

            if (i == 4) {
                IterName = "WonDetailForAddView2Iterator";
            }

            if (i == 5) {
                IterName = "MarDetailForAddView2Iterator";
            }

            if (i == 6) {
                IterName = "HonorCardForAddView2Iterator";
            }

            if (i == 7) {
                IterName = "ImmortalDocForAddView2Iterator";
            }

            if (i == 8) {
                IterName = "ClaimBookForAddView2Iterator";
            }

            if (i == 9) {
                IterName = "PersonRelateForAddView2Iterator";
            }

            if (i == 10) {
                IterName = "FinancialAidForAddView2Iterator";
            }

            if (i == 11) {
                IterName = "SchoolSubventionForAddView2Iterator";
            }

            if (i == 12) {
                IterName = "PersonGiftForAddView2Iterator";
            }

            if (i == 13) {
                IterName = "BodygurdInformationForAddView2Iterator";
            }

            if (i == 14) {
                IterName = "PersonStatusForAddView2Iterator";
            }

            if (i == 15) {
                IterName = "WonAgentForAddView2Iterator";
            }

            if (i == 16) {
                IterName = "AcumulationVactionDistForAddView2Iterator";
            }

            if (i == 17) {
                IterName = "AcumulationVactionForAddView2Iterator";
            }

            if (i == 18) {
                IterName = "PersonRelateForLOVView2Iterator";
            }

            if (i == 19) {
                IterName = "ItsForSiteMessage1Iterator";
            }


            DCIteratorBinding iterator =
                bc.findIteratorBinding(IterName.trim());
            ViewObject vo = iterator.getViewObject();
            Row row = vo.getCurrentRow();

            if (row != null) {
                row.refresh(row.REFRESH_UNDO_CHANGES |
                            row.REFRESH_FORGET_NEW_ROWS |
                            row.REFRESH_WITH_DB_FORGET_CHANGES);


                //     row.refresh(row.REFRESH_REMOVE_NEW_ROWS);
                //  iterator.getDataControl().commitTransaction();


            }


        }
        ///////////////////////////////////////


        //////////////////////////////


        ////////////////////////////


        return "SomeNavigationRule";
    }




    public String Logout() {
        FacesContext context = FacesContext.getCurrentInstance();

         

        try {


            Application app = context.getApplication();
            ValueBinding bind =
                app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");
            AppModuleImpl am = (AppModuleImpl)bind.getValue(context);
            
           // dropAllChangesAndReturn() ; 
            
                
                
          am.logoutmonitor();
            
             
            
            context.getExternalContext().getSessionMap().put("BindingFullname",
                                                             null);
            context.getExternalContext().getSessionMap().put("userKey", null);
            
     
   
 

         

 

    

       

     

     
            
 
            ///////////////////////
            
         
     

 
            ///////////////////////
            
        
            
       
            
 
           
            
          
            
      
        }

        catch (Exception e) {


            FacesMessage message1 = new FacesMessage(e.getMessage());
            context.addMessage(null, message1);
            // rollback();
        }


        return "firstpage";
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public String rollback() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }


    public String othercommit() {
        FacesContext context = FacesContext.getCurrentInstance();

        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            FacesMessage message2 = new FacesMessage("حدث خطأ ما");
            context.addMessage(null, message2);
            return null;
        }

        FacesMessage message1 = new FacesMessage("تم الإدخال بنجاح");
        context.addMessage(null, message1);
        return null;
    }


    public String savepapercommit() {
        FacesContext context = FacesContext.getCurrentInstance();

        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            FacesMessage message2 = new FacesMessage("حدث خطأ ما");
            context.addMessage(null, message2);
            return null;
        }

        FacesMessage message1 =
            new FacesMessage("\u062A\u0645 \u0627\u0644\u062D\u0641\u0638 بنجاح");
        context.addMessage(null, message1);
        return null;
    }


    public String regcomm() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        reqeditexe();
        return null;
    }

    public String reqexe() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Execute1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        regcomm();
        reqeditexe();
        return null;
    }

    public String reqadd() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Execute");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String reqcomm() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        reqadd();
        return null;
    }

    public String reqeditexe() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Execute1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String detailexe() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Execute");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String detailcomm() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        detailexe();
        return null;
    }

    public String requirededit() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Execute");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        regcomm();
        return null;
    }

    


    public Connection getDataSourceConnection(String dataSourceName) throws Exception {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource)ctx.lookup(dataSourceName);
        return ds.getConnection();
    }

    private Connection getConnection() throws Exception {
        return getDataSourceConnection("java:comp/env/jdbc/Connection1DS");
    }

    public ServletContext getContext() {
        return (ServletContext)getFacesContext().getExternalContext().getContext();
    }

    public HttpServletResponse getResponse() {
        return (HttpServletResponse)getFacesContext().getExternalContext().getResponse();
    }

    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }


    public void close(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

  





    public static void refreshPage() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        String refreshpage = fctx.getViewRoot().getViewId();
        ViewHandler ViewH = fctx.getApplication().getViewHandler();
        UIViewRoot UIV = ViewH.createView(fctx, refreshpage);
        UIV.setViewId(refreshpage);
        fctx.setViewRoot(UIV);

    }

    public void ChangeToArabic() {


        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().put("lang", "ar");
        ChangeLanguage();
        //   return null;

        //    return ChangeLanguage("ar");


    }

    public void ChangeToEnglish() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().getSessionMap().put("lang", "en");
            ChangeLanguage();
        } catch (Exception e) {

        }
        // return null;


        //return ChangeLanguage("en");


    }

    public void ChangeLanguage() {
        FacesContext context = FacesContext.getCurrentInstance(); //currentLang

        Locale local =
            new Locale(context.getExternalContext().getSessionMap().get("lang").toString().trim());
        context.getViewRoot().setLocale(local);
        context.getExternalContext().getSessionMap().put("currentLang",
                                                         context.getExternalContext().getSessionMap().get("lang").toString().trim());
        //  return null;

    }


    public String refresss() {
        // Add event code here...
        FacesContext fctx = FacesContext.getCurrentInstance();
        String refreshpage = fctx.getViewRoot().getViewId();
        ViewHandler ViewH = fctx.getApplication().getViewHandler();
        UIViewRoot UIV = ViewH.createView(fctx, refreshpage);
        UIV.setViewId(refreshpage);
        fctx.setViewRoot(UIV);
        return null;
    }


    public String GoBack() {
        // Add event code here...
        // UserPart

        FacesContext context = FacesContext.getCurrentInstance();
        String UserPart =
            context.getExternalContext().getSessionMap().get("UserPart").toString();
        if (UserPart.equalsIgnoreCase("8") || UserPart.equalsIgnoreCase("9") ||
            UserPart.equalsIgnoreCase("10") ||
            UserPart.equalsIgnoreCase("66") ||
            UserPart.equalsIgnoreCase("11")) {
            return "golrouting";
        } else if (UserPart.equalsIgnoreCase("1") ||
                   UserPart.equalsIgnoreCase("12")) {

            return null;
        } else {
            return "gorouting";
        }
        //  return null;
    }
}
