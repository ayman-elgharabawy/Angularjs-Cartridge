// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.angularjs.metafacades;

import org.andromda.metafacades.uml.FrontEndControllerOperation;

/**
 * <p>
 * Represents an operation for a JSF controller.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface AngControllerOperation
    extends FrontEndControllerOperation
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isAngControllerOperationMetaType();

    /**
     * 
     * @return AngController
     */
    public AngController getAngController();

    /**
     * 
     * @return String
     */
    public String getFactoryName();

    /**
     * 
     * @return String
     */
    public String getFactoryType();

    /**
     * <p>
     * The controller implementation operation signature that takes the
     * appropriate form (if this operation has at least one form field)
     * as an argument.
     * </p>
     * @return String
     */
    public String getImplementationFormSignature();

    /**
     * 
     * @return String
     */
    public String getOperationType();
}