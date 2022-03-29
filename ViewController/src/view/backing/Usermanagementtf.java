package view.backing;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UISelectItems;

import javax.faces.context.FacesContext;


import javax.faces.el.ValueBinding;

import model.AppModuleImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;

public class Usermanagementtf {
    private RichPanelStretchLayout psl1;
    private RichPanelBox pb1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichInputDate id1;
    private RichPanelCollection pc1;
    private RichPanelBox pb2;
    private RichPanelBox pb3;
    private RichPanelBox pb4;
    private RichPanelGridLayout pgl3;
    private RichGridRow gr2;
    private RichGridCell gc2;
    private RichGridCell gc3;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichPanelFormLayout pfl1;
    private RichPanelFormLayout pfl2;
    private RichPanelFormLayout pfl3;
    private RichPanelFormLayout pfl4;
    private RichInputText it1;
    private RichInputText it2;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichInputText it3;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichSelectOneChoice soc8;
    private UISelectItems si8;
    private RichInputText it4;
    private RichInputText it5;
    private RichPanelLabelAndMessage plam1;
    private RichOutputText ot6;
    private RichPanelGridLayout pgl4;
    private RichGridRow gr3;
    private RichGridCell gc6;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichButton b4;
    private RichButton b5;
    private RichButton b6;
    private RichButton b7;
    private RichInputText it6;
    static Boolean is_insert = false;
    private RichButton b8;
    private RichPanelBox pb5;
    private RichPanelGridLayout pgl5;
    private RichGridRow gr4;
    private RichGridCell gc7;
    private RichPanelLabelAndMessage plam2;
    private RichOutputText ot8;
    private RichPanelGridLayout pgl6;
    private RichGridRow gr5;
    private RichGridCell gc8;
    private RichPanelGroupLayout pgl7;
    private RichPanelHeader ph2;
    private RichQuery qryId2;
    private RichPanelGridLayout pgl8;
    private RichGridRow gr6;
    private RichGridCell gc9;
    private RichGridCell gc10;
    private RichPanelCollection pc2;
    private RichTable t2;
    private RichPanelCollection pc3;
    private RichTable t1;
    private RichOutputText ot13;
    private RichOutputText ot14;
    private RichPanelGroupLayout pgl9;
    private RichPanelGroupLayout pgl10;
    private RichPanelGridLayout pgl11;
    private RichGridRow gr7;
    private RichGridCell gc11;
    private RichButton b9;
    private RichPanelGridLayout pgl12;
    private RichGridRow gr8;
    private RichGridCell gc12;
    private RichSelectOneChoice soc9;
    private UISelectItems si9;
    private RichSpacer s1;
    private RichPanelLabelAndMessage plam3;
    private RichOutputText ot15;
    private RichButton b10;
    private RichSpacer s2;
    private RichButton b11;
    private RichSpacer s3;
    private RichButton b12;
    private RichPanelGroupLayout pgl13;
    private RichSpacer s4;
    private RichSpacer s5;

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

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }

    public void setResId1(RichTable resId1) {
        this.resId1 = resId1;
    }

    public RichTable getResId1() {
        return resId1;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
    }

    public void setPgl3(RichPanelGridLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGridLayout getPgl3() {
        return pgl3;
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

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
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

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setSoc8(RichSelectOneChoice soc8) {
        this.soc8 = soc8;
    }

    public RichSelectOneChoice getSoc8() {
        return soc8;
    }

    public void setSi8(UISelectItems si8) {
        this.si8 = si8;
    }

    public UISelectItems getSi8() {
        return si8;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setOt6(RichOutputText ot6) {
        this.ot6 = ot6;
    }

    public RichOutputText getOt6() {
        return ot6;
    }

    public void setPgl4(RichPanelGridLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGridLayout getPgl4() {
        return pgl4;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String CurrentDateATime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dd = dateFormat.format(date);
        return dd;

    }

    String User = ADFContext.getCurrent()
                            .getSessionScope()
                            .get("UserName")
                            .toString();

    public String new_user() {

        is_insert = true;


        if (User != null) {

            it5.setValue(User);
        }

        it4.setValue(CurrentDateATime());

        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String b2_action() {


        FacesContext context = FacesContext.getCurrentInstance();

        Application app = context.getApplication();
        ValueBinding bind = app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");

        AppModuleImpl am = (AppModuleImpl) bind.getValue(context);
        BindingContainer bindings = getBindings();


        DCIteratorBinding parentIter = (DCIteratorBinding) bindings.get("UsersForAddNewUserView1Iterator");
        Key parentKey = parentIter.getCurrentRow().getKey();


        Boolean IsExists = am.CheckUserName(it6.getValue()
                                               .toString()
                                               .trim());


        if (IsExists == false && is_insert == true) {


            Commit_user();
            showMessage();

            RoleExecute(); // refresh Role For User

        }


        if (IsExists == false && is_insert == true) {


            String TabelId = ot6.getValue()
                                .toString()
                                .trim();
            am.InserttRoleForUser(TabelId);
            am.InsertMonitor("USERS", TabelId);


        }


        if (IsExists == true && is_insert == true) {

            showNotSave();
            roll();
        }


        // تعديل

        if (IsExists == true && is_insert == false) {


            String TabelId = ot6.getValue()
                                .toString()
                                .trim();

             

            am.UpdateMonitor("USERS", TabelId);     
            am.UpdateTableField66(TabelId);
            

            Commit_user();
            showMessage();
            RoleExecute(); // refresh Role For User
            Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
            if (row != null) {
                parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
            }

        }

        if (IsExists == false && is_insert == false) {
            Commit_user();
            // Insert Updated by
            //  am.UpdateField("UsersForCheckUserView1", UserName);
            showMessage();
            RoleExecute(); // refresh Role For User
            Refresh_user();

            roll();
            Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
            if (row != null) {
                parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
            }
        }

        // reset insert flag

        is_insert = false;

        // here code for insert from stataic role user

   
        return null;
    }

    public String Commit_user() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            Refresh_user();
            return null;
        }
        Refresh_user();
        return null;
    }

    public String showMessage() {
        FacesContext context = FacesContext.getCurrentInstance();

        String messageText = "\u062A\u0645 \u0627\u0644\u062D\u0641\u0638";
        FacesMessage fm = new FacesMessage(messageText);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);

        context.addMessage(getIt1().getClientId(context), fm);
        return null;
    }

    public String showNotSave() {

        //اسم المستخدم مكرر

        FacesContext context = FacesContext.getCurrentInstance();
        String messageText = "اسم المستخدم مكرر لم يتم الحفظ";
        FacesMessage fm = new FacesMessage(messageText);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        context.addMessage(getIt1().getClientId(context), fm);

        return null;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public String Refresh_user() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Execute");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String RoleExecute() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Execute");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String roll() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }


    public String AddNewRoleToUser() {

        FacesContext context = FacesContext.getCurrentInstance();

        Application app = context.getApplication();
        ValueBinding bind = app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");
        AppModuleImpl am = (AppModuleImpl) bind.getValue(context);
        BindingContainer bindings = getBindings();


        DCIteratorBinding parentIter = (DCIteratorBinding) bindings.get("UsersForAddNewUserView1Iterator");
        Key parentKey = parentIter.getCurrentRow().getKey();


        String TabelId = ot6.getValue()
                            .toString()
                            .trim();


        am.InserttNewRoleForUser(TabelId);


        RoleExecute(); // refresh Role For User

        Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
        if (row != null) {
            parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        }

        showMessageNewRoll();


        is_insert = false;


        return null;
    }


    public String showMessageNewRoll() {
        FacesContext context = FacesContext.getCurrentInstance();

        String messageText = "تم الانتهاء من إضافة الصلاحيات الجديدة";
        FacesMessage fm = new FacesMessage(messageText);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);

        context.addMessage(getIt1().getClientId(context), fm);
        return null;
    }

    public void setPb5(RichPanelBox pb5) {
        this.pb5 = pb5;
    }

    public RichPanelBox getPb5() {
        return pb5;
    }

    public void setPgl5(RichPanelGridLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGridLayout getPgl5() {
        return pgl5;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setOt8(RichOutputText ot8) {
        this.ot8 = ot8;
    }

    public RichOutputText getOt8() {
        return ot8;
    }

    public void setPgl6(RichPanelGridLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGridLayout getPgl6() {
        return pgl6;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setQryId2(RichQuery qryId2) {
        this.qryId2 = qryId2;
    }

    public RichQuery getQryId2() {
        return qryId2;
    }

    public void setPgl8(RichPanelGridLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGridLayout getPgl8() {
        return pgl8;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc9(RichGridCell gc9) {
        this.gc9 = gc9;
    }

    public RichGridCell getGc9() {
        return gc9;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }


    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setPc3(RichPanelCollection pc3) {
        this.pc3 = pc3;
    }

    public RichPanelCollection getPc3() {
        return pc3;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setOt13(RichOutputText ot13) {
        this.ot13 = ot13;
    }

    public RichOutputText getOt13() {
        return ot13;
    }

    public void setOt14(RichOutputText ot14) {
        this.ot14 = ot14;
    }

    public RichOutputText getOt14() {
        return ot14;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setPgl11(RichPanelGridLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGridLayout getPgl11() {
        return pgl11;
    }

    public void setGr7(RichGridRow gr7) {
        this.gr7 = gr7;
    }

    public RichGridRow getGr7() {
        return gr7;
    }

    public void setGc11(RichGridCell gc11) {
        this.gc11 = gc11;
    }

    public RichGridCell getGc11() {
        return gc11;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }

    public String ExeGiveRoll() {
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        ValueBinding bind = app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");

        AppModuleImpl am = (AppModuleImpl) bind.getValue(context);
        BindingContainer bindings = getBindings();


        DCIteratorBinding parentIter = (DCIteratorBinding) bindings.get("UsersForAddNewUserView1Iterator");
        Key parentKey = parentIter.getCurrentRow().getKey();


        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            //  RefreshExeGiveRoll();
            //   RoleExecute() ;
            //shawa
            roll();

            Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
            if (row != null) {
                parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
            }

            return null;
        }

        //    RefreshExeGiveRoll();
        // RoleExecute() ;
        //shawa
        roll();

        Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
        if (row != null) {
            parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        }
        return null;
    }

    public void setPgl12(RichPanelGridLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGridLayout getPgl12() {
        return pgl12;
    }

    public void setGr8(RichGridRow gr8) {
        this.gr8 = gr8;
    }

    public RichGridRow getGr8() {
        return gr8;
    }

    public void setGc12(RichGridCell gc12) {
        this.gc12 = gc12;
    }

    public RichGridCell getGc12() {
        return gc12;
    }

    public void setSoc9(RichSelectOneChoice soc9) {
        this.soc9 = soc9;
    }

    public RichSelectOneChoice getSoc9() {
        return soc9;
    }

    public void setSi9(UISelectItems si9) {
        this.si9 = si9;
    }

    public UISelectItems getSi9() {
        return si9;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setOt15(RichOutputText ot15) {
        this.ot15 = ot15;
    }

    public RichOutputText getOt15() {
        return ot15;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }

    public void setPgl13(RichPanelGroupLayout pgl13) {
        this.pgl13 = pgl13;
    }

    public RichPanelGroupLayout getPgl13() {
        return pgl13;
    }


    public String GrandGroupToUser() {


        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        ValueBinding bind = app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");
        AppModuleImpl am = (AppModuleImpl) bind.getValue(context);

        String TabelId = ot6.getValue()
                            .toString()
                            .trim();

        String GroupId = ot15.getValue()
                             .toString()
                             .trim();


        BindingContainer bindings = getBindings();
        DCIteratorBinding parentIter = (DCIteratorBinding) bindings.get("UsersForAddNewUserView1Iterator");
        Key parentKey = parentIter.getCurrentRow().getKey();


        Boolean yy = am.CheckUserInUserAdded(TabelId, GroupId);
        if (yy == false) {

            am.InsertUserGroup(TabelId, GroupId);
            roll();
            // RoleExecute();
            // GroupAddedExe() ;
            //shawa
        }


        Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
        if (row != null) {
            parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        }

        return null;
    }

    public String RevokeGroupFromUser() {
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        ValueBinding bind = app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");
        AppModuleImpl am = (AppModuleImpl) bind.getValue(context);

        String TabelId = ot6.getValue()
                            .toString()
                            .trim();

        String GroupId = ot15.getValue()
                             .toString()
                             .trim();


        BindingContainer bindings = getBindings();
        DCIteratorBinding parentIter = (DCIteratorBinding) bindings.get("UsersForAddNewUserView1Iterator");
        Key parentKey = parentIter.getCurrentRow().getKey();


        Boolean yy = am.CheckUserInUserAdded(TabelId, GroupId);
        if (yy == true) {

            am.RemoveUserGroup(TabelId, GroupId);
            roll();
            //shawa
            //  RoleExecute();
            // GroupAddedExe() ;
        }


        Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
        if (row != null) {
            parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        }

        return null;
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


}
