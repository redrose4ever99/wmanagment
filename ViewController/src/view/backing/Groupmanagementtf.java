package view.backing;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import javax.faces.el.ValueBinding;

import model.AppModuleImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;

public class Groupmanagementtf {
    private RichPanelStretchLayout psl1;
    private RichPanelBox pb1;
    private RichPanelGridLayout pgl1;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichInputText it1;
    private RichInputText it2;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr2;
    private RichGridCell gc3;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichButton b4;
    private RichButton b5;
    private RichButton b6;
    private RichButton b7;
    private RichPanelGridLayout pgl3;
    private RichGridRow gr3;
    private RichGridCell gc4;
    private RichPanelCollection pc1;
    private RichTable t1;
    private RichPanelGridLayout pgl4;
    private RichGridRow gr4;
    private RichGridCell gc5;
    private RichTable t2;
    private RichPanelGridLayout pgl6;
    private RichGridRow gr5;
    private RichGridCell gc6;
    private RichPanelCollection pc2;
    private RichPanelGridLayout pgl7;
    private RichGridRow gr6;
    private RichGridCell gc7;
    private RichButton b8;
    static Boolean is_insert = false;
    private RichPanelLabelAndMessage plam1;
    private RichOutputText ot5;
    private RichPanelGroupLayout pgl5;
    private RichPanelHeader ph1;
    private RichQuery qryId1;

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

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
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

    public void setPgl3(RichPanelGridLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGridLayout getPgl3() {
        return pgl3;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPgl4(RichPanelGridLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGridLayout getPgl4() {
        return pgl4;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
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

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setPgl7(RichPanelGridLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGridLayout getPgl7() {
        return pgl7;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String NewGroup() {
        is_insert = true; 
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


        // check if user exeits in user table   using CheckUserName procedure

        Application app = context.getApplication();
        ValueBinding bind =
            app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");
        
          BindingContainer bindings = getBindings();
        DCIteratorBinding parentIter = (DCIteratorBinding) bindings.get("UserGroupForAddView1Iterator");
        Key parentKey = parentIter.getCurrentRow().getKey();  

        AppModuleImpl am = (AppModuleImpl)bind.getValue(context);
       
        
         GroupExe() ;
          
        if (is_insert == true) {
            
            am.InserttRoleForGroup(ot5.getValue().toString().trim());
        }
           else {
           
            
            Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
            if (row != null) {
                parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
            }
        }  
        exeGroupDEtail();
        is_insert = false;
        return null;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setOt5(RichOutputText ot5) {
        this.ot5 = ot5;
    }

    public RichOutputText getOt5() {
        return ot5;
    }

    public String GroupRefresh() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Execute");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String GroupExe() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Execute");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            GroupCommit() ; 
            return null;
        }
        GroupCommit() ; 
        return null;
    }

    public String GroupCommit() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            GroupRefresh() ;
            return null;
        }
        GroupRefresh() ;
        return null;
    }

    public String GroupRoll() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            
            is_insert =false ; 
            
            return null;
        }
        
        is_insert =false ; 
        return null;
    }

    public String GroupDel() {
        FacesContext context = FacesContext.getCurrentInstance();


        // check if user exeits in user table   using CheckUserName procedure

        Application app = context.getApplication();
        ValueBinding bind =
            app.createValueBinding("#{data.AppModuleDataControl.dataProvider}");

        AppModuleImpl am = (AppModuleImpl)bind.getValue(context);
      //  am.RemovetRoleForGroup(ot5.getValue().toString().trim());
        
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
           
           GroupCommit() ; 
            return null;
        }
       
        GroupCommit() ; 
        return null;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
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

    public String exeGroupDEtail() {
        
        BindingContainer bindings = getBindings();  
        DCIteratorBinding parentIter = (DCIteratorBinding) bindings.get("UserGroupForAddView1Iterator");
        Key parentKey = parentIter.getCurrentRow().getKey();   
        
         
        OperationBinding operationBinding = bindings.getOperationBinding("Execute1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            
              Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
            if (row != null) {
                parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
            }  
            
            return null;
        }
        
           Row row = parentIter.findRowByKeyString(parentKey.toStringFormat(true));
        if (row != null) {
            parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        }  
        
        return null;
    }
}
