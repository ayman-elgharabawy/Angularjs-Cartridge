// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.angularjs.metafacades;

import java.util.Collection;
import org.andromda.metafacades.uml.FrontEndView;

/**
 * <p>
 * Represents a Angularjs view for a front-end application.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface AngView
    extends FrontEndView
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isAngViewMetaType();

    /**
     * 
     * @return String
     */
    public String getAngModel();

    /**
     * 
     * @return AngController
     */
    public AngController getController();

    /**
     * 
     * @return Collection
     */
    public Collection getDetailPages();

    /**
     * 
     * @return String
     */
    public String getMasterPage();

    /**
     * 
     * @return Collection
     */
    public Collection getNextViewStatesHasGaurd();

    /**
     * 
     * @return Collection
     */
    public Collection getOutgoingsStates();

    /**
     * 
     * @return Collection
     */
    public Collection getOutgoingsStatesHasFormAction();

    /**
     * 
     * @return Collection
     */
    public Collection getOutgoingsStatesHasLinkAction();

    /**
     * 
     * @return Collection
     */
    public Collection getOutgoingsStatesHasNoLinkAction();

    /**
     * <p>
     * The full path of the view resources (i.e. the JSP page).
     * </p>
     * @return String
     */
    public String getPath();

    /**
     * 
     * @return String
     */
    public String getViewType();

    /**
     * 
     * @return boolean
     */
    public boolean hasParameter();

    /**
     * 
     * @return boolean
     */
    public boolean isDetail();

    /**
     * 
     * @return boolean
     */
    public boolean isMaster();

    /**
     * <p>
     * Indicates whether or not at least one parameter of an outgoing
     * action in this view requires validation.
     * </p>
     * @return boolean
     */
    public boolean isValidationRequired();
}