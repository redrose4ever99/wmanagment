package view.backing;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichSpacer;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

import javax.servlet.http.HttpServletRequest;

import model.AppModuleImpl;

import myclass.PasswordEncryption;
import myclass.UserInfo1;
import myclass.UserRole;


public class Logintf {
    private RichPanelStretchLayout psl1;
    private RichPanelGroupLayout pgl1;
    private RichPanelBox pb1;
    private RichPanelGroupLayout pgl2;
    private RichPanelGridLayout pgl3;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichImage i1;
    private RichPanelGridLayout pgl4;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichPanelGroupLayout pgl5;
    private RichPanelFormLayout pfl1;
    private RichSpacer s1;
    private RichPanelGroupLayout pgl6;
    private RichImage i2;
    private RichSpacer s2;
    private RichOutputText ot1;
    private RichSpacer s3;
    private RichInputText it1;
    private RichInputText it2;
    private RichPanelGridLayout pgl7;
    private RichGridRow gr3;
    private RichGridCell gc3;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichPanelGroupLayout pgl8;
    private RichSpacer s4;
    private RichSpacer s5;
    private RichButton b1;
    private String UsernameInput;
    private String PasswordInpu;
    
    /*   
    public FacesContext getfc() {
        
        FacesContext context = FacesContext.getCurrentInstance();
        return context;
    } */

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPgl3(RichPanelGridLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGridLayout getPgl3() {
        return pgl3;
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

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setPgl4(RichPanelGridLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGridLayout getPgl4() {
        return pgl4;
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

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setI2(RichImage i2) {
        this.i2 = i2;
    }

    public RichImage getI2() {
        return i2;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
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

    public void setPgl7(RichPanelGridLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGridLayout getPgl7() {
        return pgl7;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void setS5(RichSpacer s5) {
        this.s5 = s5;
    }

    public RichSpacer getS5() {
        return s5;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }
    
    public String LoginAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        
        
        Application app;
        app = context.getApplication();
        ValueBinding bind;
        
        /*  FacesMessage m1 =
            new FacesMessage("1");
        context.addMessage(null, m1); */
        
        
        bind =
                app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");
        AppModuleImpl am = (AppModuleImpl)bind.getValue(context);
        
      //  am.SetFirstRole() ; 
        
        UserRole userrole = null;


        /* FacesMessage m2 =
            new FacesMessage("2");
        context.addMessage(null, m2); */
        
        
        if (UsernameInput == null || PasswordInpu == null) {

            FacesMessage messageempty =
                new FacesMessage("يجب إدخال اسم المستخدم وكلمة السر");
            context.addMessage(null, messageempty);
            UsernameInput = null;
            PasswordInpu = null;
            it1.setValue(null);
            it2.setValue(null);
            userrole = null;
        } else {

            try {
               

                //get encrypted entered password

                String data = PasswordInpu.trim();
                String k = "Blowfish";

                PasswordEncryption encrypter;
                String encrypted = null;
                String decrypted = null;
               
                try {
                    encrypter = new PasswordEncryption();

                    encrypted = encrypter.encrypt(data, k);

                    decrypted = encrypter.decrypt(encrypted, k);

                   


                } catch (Exception e) {

                    System.out.println("Error In Encrypt Password");

                }

           

             
               
                
 

                UserInfo1 user =
                    am.login(UsernameInput.trim(), encrypted.trim());
                
                
                /*  FacesMessage m4 =
                    new FacesMessage("4");
                context.addMessage(null, m4); */

                if (user != null) {
                    
                    // Fill Session Map
                    
                    context.getExternalContext().getSessionMap().put("userKey",
                                                                     user);
                    context.getExternalContext().getSessionMap().put("UserId",
                                                                     user.getID());
                    context.getExternalContext().getSessionMap().put("BindingFullname",
                                                                     user.getUserFullName());
                    context.getExternalContext().getSessionMap().put("UserName",
                                                                     user.getUserName());

                    context.getExternalContext().getSessionMap().put("UserNameString",
                                                                     user.getUserName().toString().trim());

                    context.getExternalContext().getSessionMap().put("UserPart",
                                                                     user.getUserPart());

                    context.getExternalContext().getSessionMap().put("ACOUNTSTATE",
                                                                     user.getACOUNTSTATE());

                    context.getExternalContext().getSessionMap().put("UserCity",
                                                                     user.getUserCity());
                     
                    /*  FacesMessage m5 =
                        new FacesMessage("5");
                    context.addMessage(null, m5); */
                    

                    if (user.getACOUNTSTATE().intValue() >= 3) {
                        
                        
                        FacesMessage messagestate =
                            new FacesMessage("الحساب مقفل... راجع مدير النظام");
                        context.addMessage(null, messagestate);
                        
                        UsernameInput = null;
                        PasswordInpu = null;
                        userrole = null;
                        it1.setValue(null);
                        it2.setValue(null);
                    } else {

                        /* FacesMessage m6 =
                            new FacesMessage("6");
                        context.addMessage(null, m6); */
                        
                               
                        if ((user.getUserPart().toString().trim().equalsIgnoreCase("1"))) {
                            userrole = null;
                        } else {

                            /*  FacesMessage m7 =
                                new FacesMessage("7");
                            context.addMessage(null, m7); */
                            
                            
                            
                            /*  FacesMessage m77 =
                                new FacesMessage("the user id is ..".concat(user.getID().toString().trim()));
                            context.addMessage(null, m77); */
                            
                            
                            userrole =
                                    am.GetRole(user.getID().toString().trim());
                            
                            /*  FacesMessage m8 =
                                new FacesMessage("8");
                            context.addMessage(null, m8); */


                        }
                        
                        /*   FacesMessage m9 =
                            new FacesMessage("9");
                        context.addMessage(null, m9); */
                        
                        String ClientIpAddress = getClientIpAddress();
                        
                        /* FacesMessage m10 =
                            new FacesMessage("10");
                        context.addMessage(null, m10) */;
                        
                        if ((user.getUserPart().toString().trim().equalsIgnoreCase("1")) ||
                            (user.getUserPart().toString().trim().equalsIgnoreCase("66"))) {


                            /*  FacesMessage m11 =
                                new FacesMessage("11");
                            context.addMessage(null, m11); */
                            
                            am.loginmonitor();

                            am.ResetAcountState();


                            FacesMessage messagestate =
                                new FacesMessage("الحساب مقفل... راجع مدير النظام");
                            context.addMessage(null, messagestate);
                            

                            return "goHomePage";
                        }

                        try {
                            
                            /* FacesMessage m12 =
                                new FacesMessage("12");
                            context.addMessage(null, m12); */
                            
                            if ((ClientIpAddress.trim().equalsIgnoreCase(user.getIPAddress().toString().trim()))) {
                                am.loginmonitor();
                                //  String goto1 = user.getUserPage();

                            //    am.RefreshAll(); //////////////////
                             //   am.refreshPage();

                                //   exerotingtable();
                                ///// reset UserAcountState//////////
                                am.ResetAcountState();
                                ////////////////////////////////////
                                return "goHomePage";
                            } else {

                                /* 
                                FacesMessage m13 =
                                    new FacesMessage("13");
                                context.addMessage(null, m13); */

                                FacesMessage messagestate =
                                    new FacesMessage("لايمكن تسجيل الدخول من هذه الطرفية يرجى مراجعة مدير النظام");
                                context.addMessage(null, messagestate);

                                userrole = null;
                                UsernameInput = null;
                                PasswordInpu = null;
                                it1.setValue(null);
                                it2.setValue(null);
                                
                                /*  FacesMessage m14 =
                                    new FacesMessage("14");
                                context.addMessage(null, m14); */
                                
                                
                            }
                        } catch (Exception e) {
                            am.loginmonitor();
                            //   String goto1 = user.getUserPage();

                        //    am.RefreshAll(); //////////////////
                         //   am.refreshPage();

                            //    exerotingtable();
                            ///// reset UserAcountState//////////
                            am.ResetAcountState();
                            return "goHomePage";
                        }


                    }

                } else {
                    
                    
                    /* FacesMessage m15 =
                        new FacesMessage("15");
                    context.addMessage(null, m15); */
                    
                    UserInfo1 nameuser = am.namelogin(UsernameInput.trim());
                    
                    /*   FacesMessage m16 =
                        new FacesMessage("16");
                    context.addMessage(null, m16) */;
                    

                    if (nameuser != null) {
                        context.getExternalContext().getSessionMap().put("UserId",
                                                                         nameuser.getID());
                        context.getExternalContext().getSessionMap().put("ACOUNTSTATE",
                                                                         nameuser.getACOUNTSTATE());


                        if ((nameuser.getUserPart().intValue() > 1) &&
                            (nameuser.getUserPart() != null)) {

                            am.incuseracountstate();
                            
                            /*  FacesMessage m17 =
                                new FacesMessage("17");
                            context.addMessage(null, m17); */
                        }


                        if (nameuser.getACOUNTSTATE().intValue() >= 3) {


                            FacesMessage messagestate =
                                new FacesMessage("الحساب مقفل... راجع مدير النظام");
                            context.addMessage(null, messagestate);


                        } else {

                            /// insert in Action

                            FacesMessage message1 = new FacesMessage("كلمة السر خاطئة");
                            context.addMessage(null, message1);
                            
                            am.Faildloginmonitor();

                            userrole = null;
                            UsernameInput = null;
                            PasswordInpu = null;
                            it1.setValue(null);
                            it2.setValue(null);
                        }
                    }
                    
                    
                    UsernameInput = null;
                    PasswordInpu = null;
                    it1.setValue(null);
                    it2.setValue(null);
                    
                    /*  FacesMessage m18 =
                        new FacesMessage("18");
                    context.addMessage(null, m18); */
                }

            } catch (Exception e) {

               /*
                FacesMessage message1 = new FacesMessage(e.getMessage());
                context.addMessage(null, message1);


              */
                
               FacesMessage messagestate =
                   new FacesMessage(e.getMessage());
               context.addMessage(null, messagestate);

            }
            
            
            
            UsernameInput = null;
            PasswordInpu = null;

            it1.setValue(null);
            it2.setValue(null);
           

        }


        return null;

    }
    
    
    public String getClientIpAddress() {
        String clientIpAddress =
            ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getRemoteAddr();
        return clientIpAddress.trim();
    }

    public void setUsernameInput(String UsernameInput) {
        this.UsernameInput = UsernameInput;
    }

    public String getUsernameInput() {
        return UsernameInput;
    }

    public void setPasswordInpu(String PasswordInpu) {
        this.PasswordInpu = PasswordInpu;
    }

    public String getPasswordInpu() {
        return PasswordInpu;
    }
    
    
}
