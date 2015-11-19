// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.angularjs.metafacades;

import java.util.Collection;
import java.util.List;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.FrontEndController;

/**
 * <p>
 * Represents a controller for a JSF application.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface AngController
    extends FrontEndController
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isAngControllerMetaType();

    /**
     * 
     * @return AngControllerOperation
     */
    public AngControllerOperation getAngControllerOperation();

    /**
     * 
     * @return AngFactory
     */
    public AngFactory getAngFactory();

    /**
     * 
     * @return Collection
     */
    public Collection getControllerOperation();

    /**
     * <p>
     * All dependencies to a front-end JSF session object.
     * </p>
     * @return List<DependencyFacade>
     */
    public List<DependencyFacade> getSessionObjectReferences();

    /**
     * 
     * @return Collection<AngView>
     */
    public Collection<AngView> getViews();
}