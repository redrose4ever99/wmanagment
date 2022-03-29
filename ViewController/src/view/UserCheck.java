package view;

 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.faces.application.Application;
import javax.faces.application.NavigationHandler;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;
import model.AppModuleImpl;
import myclass.UserInfo1;
 
import oracle.adf.model.BindingContext;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class UserCheck implements PhaseListener {
    @SuppressWarnings("compatibility:-4566362128968652254")
    private static final long serialVersionUID = 1L;

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public String roll() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public static void refreshPage() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        String refreshpage = fctx.getViewRoot().getViewId();
        ViewHandler ViewH = fctx.getApplication().getViewHandler();
        UIViewRoot UIV = ViewH.createView(fctx, refreshpage);
        UIV.setViewId(refreshpage);
        fctx.setViewRoot(UIV);

    }

    public String CurrentDateyyyy() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String dd = dateFormat.format(date);
        return dd;

    }

    public String CurrentATime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String dd = dateFormat.format(date);
        return dd;

    }


    public void afterPhase(PhaseEvent phaseEvent) {
        FacesContext context = FacesContext.getCurrentInstance(); //currentLang
        Application app;
        app = context.getApplication();
        ValueBinding bind;
        bind = app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");
        
        
        AppModuleImpl am = (AppModuleImpl)bind.getValue(context);
        FacesContext fc = phaseEvent.getFacesContext();
        //////////////////
       
       
        if (context.getExternalContext().getSessionMap().get("lang") == null) {
            context.getExternalContext().getSessionMap().put("lang", "ar");
        } else {
            Locale local =
                new Locale(context.getExternalContext().getSessionMap().get("lang").toString().trim());
            context.getViewRoot().setLocale(local);
            context.getExternalContext().getSessionMap().put("currentLang",
                                                             context.getExternalContext().getSessionMap().get("lang").toString().trim());

        }

        ///////////////////////

       
        HttpSession session =
            (HttpSession)fc.getExternalContext().getSession(true);
        UserInfo1 u = (UserInfo1)session.getAttribute("userKey");
        boolean loginpage =
            fc.getViewRoot().getViewId().lastIndexOf("LoginPage") > -1 ? true :
            false;
        if (!loginpage && u == null) {
            am.GetNullRole() ; 
            NavigationHandler nh = fc.getApplication().getNavigationHandler();
            nh.handleNavigation(fc, null, "logout");
        }
       

        //// check Role

        /////
    }


    public void beforePhase(PhaseEvent phaseEvent) {

        
        
        
    }


    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
}
