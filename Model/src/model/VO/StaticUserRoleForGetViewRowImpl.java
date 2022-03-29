package model.VO;

import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Mar 13 02:50:13 EET 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StaticUserRoleForGetViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_STATICUSERROLEFORGET = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        RoleName,
        RoleDescription;
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
    public static final int ROLENAME = AttributesEnum.RoleName.index();
    public static final int ROLEDESCRIPTION = AttributesEnum.RoleDescription.index();

    /**
     * This is the default constructor (do not remove).
     */
    public StaticUserRoleForGetViewRowImpl() {
    }

    /**
     * Gets StaticUserRoleForGet entity object.
     * @return the StaticUserRoleForGet
     */
    public EntityImpl getStaticUserRoleForGet() {
        return (EntityImpl) getEntity(ENTITY_STATICUSERROLEFORGET);
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
     * Gets the attribute value for ROLE_NAME using the alias name RoleName.
     * @return the ROLE_NAME
     */
    public String getRoleName() {
        return (String) getAttributeInternal(ROLENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for ROLE_NAME using the alias name RoleName.
     * @param value value to set the ROLE_NAME
     */
    public void setRoleName(String value) {
        setAttributeInternal(ROLENAME, value);
    }

    /**
     * Gets the attribute value for ROLE_DESCRIPTION using the alias name RoleDescription.
     * @return the ROLE_DESCRIPTION
     */
    public String getRoleDescription() {
        return (String) getAttributeInternal(ROLEDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for ROLE_DESCRIPTION using the alias name RoleDescription.
     * @param value value to set the ROLE_DESCRIPTION
     */
    public void setRoleDescription(String value) {
        setAttributeInternal(ROLEDESCRIPTION, value);
    }
}

