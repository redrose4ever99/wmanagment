package view.backing;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import javax.faces.el.ValueBinding;

import model.AppModuleImpl;

import myclass.PasswordEncryption;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;

public class Userchangepasswordtf {
    private RichPanelStretchLayout psl1;
    private RichPanelBox pb1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichPanelFormLayout pfl1;
    private RichButton b1;

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }
    
    Boolean xx;
    public String UpdatePassword() {
        // Add event code here...
        FacesContext context = FacesContext.getCurrentInstance();
      
        if (it1.getValue() != null && it2.getValue() != null &&
            it3.getValue() != null) {


            Application app = context.getApplication();
            ValueBinding bind =
                app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");
            AppModuleImpl am = (AppModuleImpl)bind.getValue(context);
            String UserIdFrom =
                ADFContext.getCurrent().getSessionScope().get("UserId").toString().trim();
            
            if (it1.getValue() == null ) {
                
                FacesMessage messageempty =
                    new FacesMessage("يرجى إدخال اسم المستخدم");
                context.addMessage(null, messageempty);
                return null; 
                
            }
            String data1 = null ;
            String data2 = null ; 
            
            if (it2.getValue() != null ) {
                  data1 =  it2.getValue().toString().trim();
                
            }
           
            if (it3.getValue() != null ) {
                
                  data2 =  it3.getValue().toString().trim();  
            }
            
           
            
            
            
            String k = "Blowfish";
            
            PasswordEncryption encrypter;
            String encrypted1  = null ; 
            String encrypted2  = null ; 

            try {
            encrypter = new PasswordEncryption();
                
            encrypted1 = encrypter.encrypt(data1,k);
            encrypted2 = encrypter.encrypt(data2,k);
                
             
            
            } catch (Exception e) {
            
            System.out.println("Error In Encrypt Password");
            
            }
            


            try {
                xx = am.UpdateUserPassword(UserIdFrom, it1.getValue().toString().trim(),
                      encrypted1.trim(),
                       encrypted2.trim());
                
            } catch (Exception e) {
                
                System.out.println("Error In  UpdateUserPassword  "); 
            }
            
            if (xx == true) {


                FacesMessage messagenc =
                    new FacesMessage("تم تعديل كلمة السر بنجاح");
                context.addMessage(null, messagenc);
                
                it1.setValue(null);
                it2.setValue(null);
                it3.setValue(null);

            } else {


                FacesMessage messagenc =
                    new FacesMessage("العملية غير مسموحة ...");
                context.addMessage(null, messagenc);

            }

            it1.setValue(null);
            it2.setValue(null);
            it3.setValue(null);
        } else {


            FacesMessage messagenc44 =
                new FacesMessage(" يجب إدخال كافة المعلومات المطلوبة....");
            context.addMessage(null, messagenc44);


        }


        return null;
    }
}
