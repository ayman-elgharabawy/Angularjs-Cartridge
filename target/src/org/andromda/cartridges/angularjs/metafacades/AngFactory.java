// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.angularjs.metafacades;

import org.andromda.metafacades.uml.ClassifierFacade;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface AngFactory
    extends ClassifierFacade
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isAngFactoryMetaType();

    /**
     * 
     * @return AngController
     */
    public AngController getAngController();

    /**
     * 
     * @return String
     */
    public String getDeleteParams();

    /**
     * 
     * @return String
     */
    public String getFactoryType();

    /**
     * 
     * @return String
     */
    public String getFname();

    /**
     * 
     * @return String
     */
    public String getShapedShowParams();

    /**
     * 
     * @return String
     */
    public String getShowParams();

    /**
     * 
     * @return String
     */
    public String getUrl();

    /**
     * 
     * @return boolean
     */
    public boolean isCreate();

    /**
     * 
     * @return boolean
     */
    public boolean isDelete();

    /**
     * 
     * @return boolean
     */
    public boolean isQuery();

    /**
     * 
     * @return boolean
     */
    public boolean isShow();

    /**
     * 
     * @return boolean
     */
    public boolean isUpdate();
}