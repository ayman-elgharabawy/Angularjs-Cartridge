// license-header java merge-point
//
// Attention: generated code (by MetafacadeLogic.vsl) - do not modify!
//
package org.andromda.cartridges.angularjs.metafacades;

import java.util.Collection;
import java.util.List;
import org.andromda.core.common.Introspector;
import org.andromda.core.metafacade.MetafacadeBase;
import org.andromda.core.metafacade.MetafacadeFactory;
import org.andromda.core.metafacade.ModelValidationMessage;
import org.andromda.metafacades.uml.AssociationEndFacade;
import org.andromda.metafacades.uml.AttributeFacade;
import org.andromda.metafacades.uml.ClassifierFacade;
import org.andromda.metafacades.uml.ConstraintFacade;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.FrontEndAction;
import org.andromda.metafacades.uml.FrontEndController;
import org.andromda.metafacades.uml.FrontEndUseCase;
import org.andromda.metafacades.uml.GeneralizableElementFacade;
import org.andromda.metafacades.uml.GeneralizationFacade;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TypeMappings;
import org.apache.log4j.Logger;

/**
 * <p>
 * Represents a controller for a JSF application.
 * </p>
 * MetafacadeLogic for AngController
 *
 * @see AngController
 */
public abstract class AngControllerLogic
    extends MetafacadeBase
    implements AngController
{
    /**
     * The underlying UML object
     * @see Object
     */
    protected Object metaObject;

    /** Create Metafacade implementation instance using the MetafacadeFactory from the context
     * @param metaObjectIn
     * @param context
     */
    protected AngControllerLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superFrontEndController =
           (FrontEndController)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.FrontEndController",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * The logger instance.
     */
    private static final Logger logger = Logger.getLogger(AngControllerLogic.class);

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to AngController if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.angularjs.metafacades.AngController";
        }
        return context;
    }

    private FrontEndController superFrontEndController;
    private boolean superFrontEndControllerInitialized = false;

    /**
     * Gets the FrontEndController parent instance.
     * @return this.superFrontEndController FrontEndController
     */
    private FrontEndController getSuperFrontEndController()
    {
        if (!this.superFrontEndControllerInitialized)
        {
            ((MetafacadeBase)this.superFrontEndController).setMetafacadeContext(this.getMetafacadeContext());
            this.superFrontEndControllerInitialized = true;
        }
        return this.superFrontEndController;
    }

    /** Reset context only for non-root metafacades
     * @param context
     * @see MetafacadeBase#resetMetafacadeContext(String context)
     */
    @Override
    public void resetMetafacadeContext(String context)
    {
        if (!this.contextRoot) // reset context only for non-root metafacades
        {
            context = getContext(context);  // to have same value as in original constructor call
            setMetafacadeContext (context);
            if (this.superFrontEndControllerInitialized)
            {
                ((MetafacadeBase)this.superFrontEndController).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see AngController
     */
    public boolean isAngControllerMetaType()
    {
        return true;
    }

    // ---------------- business methods ----------------------

    /**
     * Method to be implemented in descendants
     * 
     * @return Collection
     */
    protected abstract Collection handleGetControllerOperation();

    /**
     * 
     * @return handleGetControllerOperation()
     */
    public Collection getControllerOperation()
    {
        // getControllerOperation has no pre constraints
        Collection returnValue = handleGetControllerOperation();
        // getControllerOperation has no post constraints
        return returnValue;
    }

    // ------------- associations ------------------

    /**
     * 
     * @return (List<DependencyFacade>)handleGetSessionObjectReferences()
     */
    public final List<DependencyFacade> getSessionObjectReferences()
    {
        List<DependencyFacade> getSessionObjectReferences1r = null;
        // angController has no pre constraints
        List result = handleGetSessionObjectReferences();
        List shieldedResult = this.shieldedElements(result);
        try
        {
            getSessionObjectReferences1r = (List<DependencyFacade>)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            AngControllerLogic.logger.warn("incorrect metafacade cast for AngControllerLogic.getSessionObjectReferences List<DependencyFacade> " + result + ": " + shieldedResult);
        }
        // angController has no post constraints
        return getSessionObjectReferences1r;
    }

    /**
     * UML Specific type is returned in Collection, transformed by shieldedElements to AndroMDA Metafacade type
     * @return  List
     */
    protected abstract List handleGetSessionObjectReferences();

    /**
     * 
     * @return (AngControllerOperation)handleGetAngControllerOperation()
     */
    public final AngControllerOperation getAngControllerOperation()
    {
        AngControllerOperation getAngControllerOperation2r = null;
        // angController has no pre constraints
        Object result = handleGetAngControllerOperation();
        MetafacadeBase shieldedResult = this.shieldedElement(result);
        try
        {
            getAngControllerOperation2r = (AngControllerOperation)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            AngControllerLogic.logger.warn("incorrect metafacade cast for AngControllerLogic.getAngControllerOperation AngControllerOperation " + result + ": " + shieldedResult);
        }
        // angController has no post constraints
        return getAngControllerOperation2r;
    }

    /**
     * UML Specific type is transformed by shieldedElements to AndroMDA Metafacade type
     * @return Object
     */
    protected abstract Object handleGetAngControllerOperation();

    /**
     * 
     * @return (AngFactory)handleGetAngFactory()
     */
    public final AngFactory getAngFactory()
    {
        AngFactory getAngFactory3r = null;
        // angController has no pre constraints
        Object result = handleGetAngFactory();
        MetafacadeBase shieldedResult = this.shieldedElement(result);
        try
        {
            getAngFactory3r = (AngFactory)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            AngControllerLogic.logger.warn("incorrect metafacade cast for AngControllerLogic.getAngFactory AngFactory " + result + ": " + shieldedResult);
        }
        // angController has no post constraints
        return getAngFactory3r;
    }

    /**
     * UML Specific type is transformed by shieldedElements to AndroMDA Metafacade type
     * @return Object
     */
    protected abstract Object handleGetAngFactory();

    /**
     * 
     * @return (Collection<AngView>)handleGetViews()
     */
    public final Collection<AngView> getViews()
    {
        Collection<AngView> getViews4r = null;
        // controller has no pre constraints
        Collection result = handleGetViews();
        List shieldedResult = this.shieldedElements(result);
        try
        {
            getViews4r = (Collection<AngView>)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            AngControllerLogic.logger.warn("incorrect metafacade cast for AngControllerLogic.getViews Collection<AngView> " + result + ": " + shieldedResult);
        }
        // controller has no post constraints
        return getViews4r;
    }

    /**
     * UML Specific type is returned in Collection, transformed by shieldedElements to AndroMDA Metafacade type
     * @return  Collection
     */
    protected abstract Collection handleGetViews();

    /**
     * @return true
     * @see FrontEndController
     */
    public boolean isFrontEndControllerMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see ClassifierFacade
     */
    public boolean isClassifierFacadeMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see GeneralizableElementFacade
     */
    public boolean isGeneralizableElementFacadeMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see ModelElementFacade
     */
    public boolean isModelElementFacadeMetaType()
    {
        return true;
    }

    // ----------- delegates to FrontEndController ------------
    /**
     * <p>
     * Return the attribute which name matches the parameter
     * </p>
     * @see ClassifierFacade#findAttribute(String name)
     */
    public AttributeFacade findAttribute(String name)
    {
        return this.getSuperFrontEndController().findAttribute(name);
    }

    /**
     * <p>
     * Those abstraction dependencies for which this classifier is the
     * client.
     * </p>
     * @see ClassifierFacade#getAbstractions()
     */
    public Collection<ClassifierFacade> getAbstractions()
    {
        return this.getSuperFrontEndController().getAbstractions();
    }

    /**
     * <p>
     * Lists all classes associated to this one and any ancestor
     * classes (through generalization). There will be no duplicates.
     * The order of the elements is predictable.
     * </p>
     * @see ClassifierFacade#getAllAssociatedClasses()
     */
    public Collection<ClassifierFacade> getAllAssociatedClasses()
    {
        return this.getSuperFrontEndController().getAllAssociatedClasses();
    }

    /**
     * <p>
     * A collection containing all 'properties' of the classifier and
     * its ancestors.  Properties are any attributes and navigable
     * connecting association ends.
     * </p>
     * @see ClassifierFacade#getAllProperties()
     */
    public Collection getAllProperties()
    {
        return this.getSuperFrontEndController().getAllProperties();
    }

    /**
     * <p>
     * A collection containing all required and/or read-only
     * 'properties' of the classifier and its ancestors. Properties are
     * any attributes and navigable connecting association ends.
     * </p>
     * @see ClassifierFacade#getAllRequiredConstructorParameters()
     */
    public Collection getAllRequiredConstructorParameters()
    {
        return this.getSuperFrontEndController().getAllRequiredConstructorParameters();
    }

    /**
     * <p>
     * Gets the array type for this classifier.  If this classifier
     * already represents an array, it just returns itself.
     * </p>
     * @see ClassifierFacade#getArray()
     */
    public ClassifierFacade getArray()
    {
        return this.getSuperFrontEndController().getArray();
    }

    /**
     * <p>
     * The name of the classifier as an array.
     * </p>
     * @see ClassifierFacade#getArrayName()
     */
    public String getArrayName()
    {
        return this.getSuperFrontEndController().getArrayName();
    }

    /**
     * <p>
     * Lists the classes associated to this one, there is no repitition
     * of classes. The order of the elements is predictable.
     * </p>
     * @see ClassifierFacade#getAssociatedClasses()
     */
    public Collection<ClassifierFacade> getAssociatedClasses()
    {
        return this.getSuperFrontEndController().getAssociatedClasses();
    }

    /**
     * <p>
     * Gets the association ends belonging to a classifier.
     * </p>
     * @see ClassifierFacade#getAssociationEnds()
     */
    public List<AssociationEndFacade> getAssociationEnds()
    {
        return this.getSuperFrontEndController().getAssociationEnds();
    }

    /**
     * <p>
     * Gets the attributes that belong to the classifier.
     * </p>
     * @see ClassifierFacade#getAttributes()
     */
    public List<AttributeFacade> getAttributes()
    {
        return this.getSuperFrontEndController().getAttributes();
    }

    /**
     * <p>
     * Gets all attributes for the classifier and if 'follow' is true
     * goes up the inheritance hierarchy and gets the attributes from
     * the super classes as well.
     * </p>
     * @see ClassifierFacade#getAttributes(boolean follow)
     */
    public List getAttributes(boolean follow)
    {
        return this.getSuperFrontEndController().getAttributes(follow);
    }

    /**
     * <p>
     * The fully qualified name of the classifier as an array.
     * </p>
     * @see ClassifierFacade#getFullyQualifiedArrayName()
     */
    public String getFullyQualifiedArrayName()
    {
        return this.getSuperFrontEndController().getFullyQualifiedArrayName();
    }

    /**
     * <p>
     * Returns all those operations that could be implemented at this
     * classifier's level. This means the operations owned by this
     * classifier as well as any realized interface's operations
     * (recursively) in case this classifier itself is not already an
     * interface, or generalized when this classifier is an interface.
     * </p>
     * @see ClassifierFacade#getImplementationOperations()
     */
    public Collection<OperationFacade> getImplementationOperations()
    {
        return this.getSuperFrontEndController().getImplementationOperations();
    }

    /**
     * <p>
     * A comma separated list of the fully qualified names of all
     * implemented interfaces.
     * </p>
     * @see ClassifierFacade#getImplementedInterfaceList()
     */
    public String getImplementedInterfaceList()
    {
        return this.getSuperFrontEndController().getImplementedInterfaceList();
    }

    /**
     * <p>
     * Those attributes that are scoped to an instance of this class.
     * </p>
     * @see ClassifierFacade#getInstanceAttributes()
     */
    public Collection<AttributeFacade> getInstanceAttributes()
    {
        return this.getSuperFrontEndController().getInstanceAttributes();
    }

    /**
     * <p>
     * Those operations that are scoped to an instance of this class.
     * </p>
     * @see ClassifierFacade#getInstanceOperations()
     */
    public List<OperationFacade> getInstanceOperations()
    {
        return this.getSuperFrontEndController().getInstanceOperations();
    }

    /**
     * <p>
     * Those interfaces that are abstractions of this classifier, this
     * basically means this classifier realizes them.
     * </p>
     * @see ClassifierFacade#getInterfaceAbstractions()
     */
    public Collection<ClassifierFacade> getInterfaceAbstractions()
    {
        return this.getSuperFrontEndController().getInterfaceAbstractions();
    }

    /**
     * <p>
     * A String representing a new Constructor declaration for this
     * classifier type to be used in a Java environment.
     * </p>
     * @see ClassifierFacade#getJavaNewString()
     */
    public String getJavaNewString()
    {
        return this.getSuperFrontEndController().getJavaNewString();
    }

    /**
     * <p>
     * A String representing the null-value for this classifier type to
     * be used in a Java environment.
     * </p>
     * @see ClassifierFacade#getJavaNullString()
     */
    public String getJavaNullString()
    {
        return this.getSuperFrontEndController().getJavaNullString();
    }

    /**
     * <p>
     * The other ends of this classifier's association ends which are
     * navigable.
     * </p>
     * @see ClassifierFacade#getNavigableConnectingEnds()
     */
    public Collection<ClassifierFacade> getNavigableConnectingEnds()
    {
        return this.getSuperFrontEndController().getNavigableConnectingEnds();
    }

    /**
     * <p>
     * Get the other ends of this classifier's association ends which
     * are navigable and if 'follow' is true goes up the inheritance
     * hierarchy and gets the super association ends as well.
     * </p>
     * @see ClassifierFacade#getNavigableConnectingEnds(boolean follow)
     */
    public List getNavigableConnectingEnds(boolean follow)
    {
        return this.getSuperFrontEndController().getNavigableConnectingEnds(follow);
    }

    /**
     * <p>
     * Assuming that the classifier is an array, this will return the
     * non array type of the classifier from
     * </p>
     * <p>
     * the model.  If the classifier is NOT an array, it will just
     * return itself.
     * </p>
     * @see ClassifierFacade#getNonArray()
     */
    public ClassifierFacade getNonArray()
    {
        return this.getSuperFrontEndController().getNonArray();
    }

    /**
     * <p>
     * The attributes from this classifier in the form of an operation
     * call (this example would be in Java): '(String attributeOne,
     * String attributeTwo).  If there were no attributes on the
     * classifier, the result would be an empty '()'.
     * </p>
     * @see ClassifierFacade#getOperationCallFromAttributes()
     */
    public String getOperationCallFromAttributes()
    {
        return this.getSuperFrontEndController().getOperationCallFromAttributes();
    }

    /**
     * <p>
     * The operations owned by this classifier.
     * </p>
     * @see ClassifierFacade#getOperations()
     */
    public List<OperationFacade> getOperations()
    {
        return this.getSuperFrontEndController().getOperations();
    }

    /**
     * <p>
     * A collection containing all 'properties' of the classifier. 
     * Properties are any attributes and navigable connecting
     * association ends.
     * </p>
     * @see ClassifierFacade#getProperties()
     */
    public List getProperties()
    {
        return this.getSuperFrontEndController().getProperties();
    }

    /**
     * <p>
     * Gets all properties (attributes and navigable association ends)
     * for the classifier and if 'follow' is true goes up the
     * inheritance hierarchy and gets the properties from the super
     * classes as well.
     * </p>
     * @see ClassifierFacade#getProperties(boolean follow)
     */
    public List getProperties(boolean follow)
    {
        return this.getSuperFrontEndController().getProperties(follow);
    }

    /**
     * <p>
     * A collection containing all required and/or read-only
     * 'properties' of the classifier.  Properties are any attributes
     * and navigable connecting association ends.
     * </p>
     * @see ClassifierFacade#getRequiredConstructorParameters()
     */
    public Collection getRequiredConstructorParameters()
    {
        return this.getSuperFrontEndController().getRequiredConstructorParameters();
    }

    /**
     * <p>
     * Returns the serial version UID of the underlying model element.
     * </p>
     * @see ClassifierFacade#getSerialVersionUID()
     */
    public long getSerialVersionUID()
    {
        return this.getSuperFrontEndController().getSerialVersionUID();
    }

    /**
     * <p>
     * Those attributes that are scoped to the definition of this
     * class.
     * </p>
     * @see ClassifierFacade#getStaticAttributes()
     */
    public Collection<AttributeFacade> getStaticAttributes()
    {
        return this.getSuperFrontEndController().getStaticAttributes();
    }

    /**
     * <p>
     * Those operations that are scoped to the definition of this
     * class.
     * </p>
     * @see ClassifierFacade#getStaticOperations()
     */
    public List<OperationFacade> getStaticOperations()
    {
        return this.getSuperFrontEndController().getStaticOperations();
    }

    /**
     * <p>
     * This class' superclass, returns the generalization if it is a
     * ClassifierFacade, null otherwise.
     * </p>
     * @see ClassifierFacade#getSuperClass()
     */
    public ClassifierFacade getSuperClass()
    {
        return this.getSuperFrontEndController().getSuperClass();
    }

    /**
     * <p>
     * The wrapper name for this classifier if a mapped type has a
     * defined wrapper class (ie. 'long' maps to 'Long').  If the
     * classifier doesn't have a wrapper defined for it, this method
     * will return a null.  Note that wrapper mappings must be defined
     * for the namespace by defining the 'wrapperMappingsUri', this
     * property must point to the location of the mappings file which
     * maps the primitives to wrapper types.
     * </p>
     * @see ClassifierFacade#getWrapperName()
     */
    public String getWrapperName()
    {
        return this.getSuperFrontEndController().getWrapperName();
    }

    /**
     * <p>
     * Indicates if this classifier is 'abstract'.
     * </p>
     * @see ClassifierFacade#isAbstract()
     */
    public boolean isAbstract()
    {
        return this.getSuperFrontEndController().isAbstract();
    }

    /**
     * <p>
     * True if this classifier represents an array type. False
     * otherwise.
     * </p>
     * @see ClassifierFacade#isArrayType()
     */
    public boolean isArrayType()
    {
        return this.getSuperFrontEndController().isArrayType();
    }

    /**
     * 
     * @see ClassifierFacade#isAssociationClass()
     */
    public boolean isAssociationClass()
    {
        return this.getSuperFrontEndController().isAssociationClass();
    }

    /**
     * <p>
     * Returns true if this type represents a Blob type.
     * </p>
     * @see ClassifierFacade#isBlobType()
     */
    public boolean isBlobType()
    {
        return this.getSuperFrontEndController().isBlobType();
    }

    /**
     * <p>
     * Indicates if this type represents a boolean type or not.
     * </p>
     * @see ClassifierFacade#isBooleanType()
     */
    public boolean isBooleanType()
    {
        return this.getSuperFrontEndController().isBooleanType();
    }

    /**
     * <p>
     * Indicates if this type represents a char, Character, or
     * java.lang.Character type or not.
     * </p>
     * @see ClassifierFacade#isCharacterType()
     */
    public boolean isCharacterType()
    {
        return this.getSuperFrontEndController().isCharacterType();
    }

    /**
     * <p>
     * Returns true if this type represents a Clob type.
     * </p>
     * @see ClassifierFacade#isClobType()
     */
    public boolean isClobType()
    {
        return this.getSuperFrontEndController().isClobType();
    }

    /**
     * <p>
     * True if this classifier represents a collection type. False
     * otherwise.
     * </p>
     * @see ClassifierFacade#isCollectionType()
     */
    public boolean isCollectionType()
    {
        return this.getSuperFrontEndController().isCollectionType();
    }

    /**
     * <p>
     * True/false depending on whether or not this classifier
     * represents a datatype. A data type is a type whose instances are
     * identified only by their value. A data type may contain
     * attributes to support the modeling of structured data types.
     * </p>
     * @see ClassifierFacade#isDataType()
     */
    public boolean isDataType()
    {
        return this.getSuperFrontEndController().isDataType();
    }

    /**
     * <p>
     * True when this classifier is a date type.
     * </p>
     * @see ClassifierFacade#isDateType()
     */
    public boolean isDateType()
    {
        return this.getSuperFrontEndController().isDateType();
    }

    /**
     * <p>
     * Indicates if this type represents a Double type or not.
     * </p>
     * @see ClassifierFacade#isDoubleType()
     */
    public boolean isDoubleType()
    {
        return this.getSuperFrontEndController().isDoubleType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents an
     * "EmbeddedValue'.
     * </p>
     * @see ClassifierFacade#isEmbeddedValue()
     */
    public boolean isEmbeddedValue()
    {
        return this.getSuperFrontEndController().isEmbeddedValue();
    }

    /**
     * <p>
     * True if this classifier is in fact marked as an enumeration.
     * </p>
     * @see ClassifierFacade#isEnumeration()
     */
    public boolean isEnumeration()
    {
        return this.getSuperFrontEndController().isEnumeration();
    }

    /**
     * <p>
     * Returns true if this type represents a 'file' type.
     * </p>
     * @see ClassifierFacade#isFileType()
     */
    public boolean isFileType()
    {
        return this.getSuperFrontEndController().isFileType();
    }

    /**
     * <p>
     * Indicates if this type represents a Float type or not.
     * </p>
     * @see ClassifierFacade#isFloatType()
     */
    public boolean isFloatType()
    {
        return this.getSuperFrontEndController().isFloatType();
    }

    /**
     * <p>
     * Indicates if this type represents an int or Integer or
     * java.lang.Integer type or not.
     * </p>
     * @see ClassifierFacade#isIntegerType()
     */
    public boolean isIntegerType()
    {
        return this.getSuperFrontEndController().isIntegerType();
    }

    /**
     * <p>
     * True/false depending on whether or not this Classifier
     * represents an interface.
     * </p>
     * @see ClassifierFacade#isInterface()
     */
    public boolean isInterface()
    {
        return this.getSuperFrontEndController().isInterface();
    }

    /**
     * <p>
     * True if this classifier cannot be extended and represent a leaf
     * in the inheritance tree.
     * </p>
     * @see ClassifierFacade#isLeaf()
     */
    public boolean isLeaf()
    {
        return this.getSuperFrontEndController().isLeaf();
    }

    /**
     * <p>
     * True if this classifier represents a list type. False otherwise.
     * </p>
     * @see ClassifierFacade#isListType()
     */
    public boolean isListType()
    {
        return this.getSuperFrontEndController().isListType();
    }

    /**
     * <p>
     * Indicates if this type represents a Long type or not.
     * </p>
     * @see ClassifierFacade#isLongType()
     */
    public boolean isLongType()
    {
        return this.getSuperFrontEndController().isLongType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a Map type.
     * </p>
     * @see ClassifierFacade#isMapType()
     */
    public boolean isMapType()
    {
        return this.getSuperFrontEndController().isMapType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a primitive
     * type.
     * </p>
     * @see ClassifierFacade#isPrimitive()
     */
    public boolean isPrimitive()
    {
        return this.getSuperFrontEndController().isPrimitive();
    }

    /**
     * <p>
     * True if this classifier represents a set type. False otherwise.
     * </p>
     * @see ClassifierFacade#isSetType()
     */
    public boolean isSetType()
    {
        return this.getSuperFrontEndController().isSetType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a string
     * type.
     * </p>
     * @see ClassifierFacade#isStringType()
     */
    public boolean isStringType()
    {
        return this.getSuperFrontEndController().isStringType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a time type.
     * </p>
     * @see ClassifierFacade#isTimeType()
     */
    public boolean isTimeType()
    {
        return this.getSuperFrontEndController().isTimeType();
    }

    /**
     * <p>
     * Returns true if this type is a wrapped primitive type.
     * </p>
     * @see ClassifierFacade#isWrappedPrimitive()
     */
    public boolean isWrappedPrimitive()
    {
        return this.getSuperFrontEndController().isWrappedPrimitive();
    }

    /**
     * <p>
     * All actions that defer to at least one operation of this
     * controller.
     * </p>
     * @see FrontEndController#getDeferringActions()
     */
    public List<FrontEndAction> getDeferringActions()
    {
        return this.getSuperFrontEndController().getDeferringActions();
    }

    /**
     * <p>
     * Returns all back-end services referenced by this controller.
     * </p>
     * @see FrontEndController#getServiceReferences()
     */
    public List<DependencyFacade> getServiceReferences()
    {
        return this.getSuperFrontEndController().getServiceReferences();
    }

    /**
     * <p>
     * Returns the use-case "controlled" by this controller.
     * </p>
     * @see FrontEndController#getUseCase()
     */
    public FrontEndUseCase getUseCase()
    {
        return this.getSuperFrontEndController().getUseCase();
    }

    /**
     * <p>
     * Finds the tagged value optional searching the entire inheritance
     * hierarchy if 'follow' is set to true.
     * </p>
     * @see GeneralizableElementFacade#findTaggedValue(String tagName, boolean follow)
     */
    public Object findTaggedValue(String tagName, boolean follow)
    {
        return this.getSuperFrontEndController().findTaggedValue(tagName, follow);
    }

    /**
     * <p>
     * All generalizations for this generalizable element, goes up the
     * inheritance tree.
     * </p>
     * @see GeneralizableElementFacade#getAllGeneralizations()
     */
    public Collection<GeneralizableElementFacade> getAllGeneralizations()
    {
        return this.getSuperFrontEndController().getAllGeneralizations();
    }

    /**
     * <p>
     * All specializations (travels down the inheritance hierarchy).
     * </p>
     * @see GeneralizableElementFacade#getAllSpecializations()
     */
    public Collection<GeneralizableElementFacade> getAllSpecializations()
    {
        return this.getSuperFrontEndController().getAllSpecializations();
    }

    /**
     * <p>
     * Gets the direct generalization for this generalizable element.
     * </p>
     * @see GeneralizableElementFacade#getGeneralization()
     */
    public GeneralizableElementFacade getGeneralization()
    {
        return this.getSuperFrontEndController().getGeneralization();
    }

    /**
     * <p>
     * Gets the actual links that this generalization element is part
     * of (it plays either the specialization or generalization).
     * </p>
     * @see GeneralizableElementFacade#getGeneralizationLinks()
     */
    public Collection<GeneralizationFacade> getGeneralizationLinks()
    {
        return this.getSuperFrontEndController().getGeneralizationLinks();
    }

    /**
     * <p>
     * A comma separated list of the fully qualified names of all
     * generalizations.
     * </p>
     * @see GeneralizableElementFacade#getGeneralizationList()
     */
    public String getGeneralizationList()
    {
        return this.getSuperFrontEndController().getGeneralizationList();
    }

    /**
     * <p>
     * The element found when you recursively follow the generalization
     * path up to the root. If an element has no generalization itself
     * will be considered the root.
     * </p>
     * @see GeneralizableElementFacade#getGeneralizationRoot()
     */
    public GeneralizableElementFacade getGeneralizationRoot()
    {
        return this.getSuperFrontEndController().getGeneralizationRoot();
    }

    /**
     * 
     * @see GeneralizableElementFacade#getGeneralizations()
     */
    public Collection<GeneralizableElementFacade> getGeneralizations()
    {
        return this.getSuperFrontEndController().getGeneralizations();
    }

    /**
     * <p>
     * Gets the direct specializations (i.e. sub elements) for this
     * generalizatble element.
     * </p>
     * @see GeneralizableElementFacade#getSpecializations()
     */
    public Collection<GeneralizableElementFacade> getSpecializations()
    {
        return this.getSuperFrontEndController().getSpecializations();
    }

    /**
     * <p>
     * Copies all tagged values from the given ModelElementFacade to
     * this model element facade.
     * </p>
     * @see ModelElementFacade#copyTaggedValues(ModelElementFacade element)
     */
    public void copyTaggedValues(ModelElementFacade element)
    {
        this.getSuperFrontEndController().copyTaggedValues(element);
    }

    /**
     * <p>
     * Finds the tagged value with the specified 'tagName'. In case
     * there are more values the first one found will be returned.
     * </p>
     * @see ModelElementFacade#findTaggedValue(String tagName)
     */
    public Object findTaggedValue(String tagName)
    {
        return this.getSuperFrontEndController().findTaggedValue(tagName);
    }

    /**
     * <p>
     * Returns all the values for the tagged value with the specified
     * name. The returned collection will contains only String
     * instances, or will be empty. Never null.
     * </p>
     * @see ModelElementFacade#findTaggedValues(String tagName)
     */
    public Collection findTaggedValues(String tagName)
    {
        return this.getSuperFrontEndController().findTaggedValues(tagName);
    }

    /**
     * <p>
     * Returns the fully qualified name of the model element. The fully
     * qualified name includes complete package qualified name of the
     * underlying model element. The templates parameter will be
     * replaced by the correct one given the binding relation of the
     * parameter to this element.
     * </p>
     * @see ModelElementFacade#getBindedFullyQualifiedName(ModelElementFacade bindedElement)
     */
    public String getBindedFullyQualifiedName(ModelElementFacade bindedElement)
    {
        return this.getSuperFrontEndController().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperFrontEndController().getConstraints();
    }

    /**
     * <p>
     * Returns the constraints of the argument kind that have been
     * placed onto this model. Typical kinds are "inv", "pre" and
     * "post". Other kinds are possible.
     * </p>
     * @see ModelElementFacade#getConstraints(String kind)
     */
    public Collection getConstraints(String kind)
    {
        return this.getSuperFrontEndController().getConstraints(kind);
    }

    /**
     * <p>
     * Gets the documentation for the model element, The indent
     * argument is prefixed to each line. By default this method wraps
     * lines after 64 characters.
     * </p>
     * <p>
     * This method is equivalent to <code>getDocumentation(indent,
     * 64)</code>.
     * </p>
     * @see ModelElementFacade#getDocumentation(String indent)
     */
    public String getDocumentation(String indent)
    {
        return this.getSuperFrontEndController().getDocumentation(indent);
    }

    /**
     * <p>
     * This method returns the documentation for this model element,
     * with the lines wrapped after the specified number of characters,
     * values of less than 1 will indicate no line wrapping is
     * required. By default paragraphs are returned as HTML.
     * </p>
     * <p>
     * This method is equivalent to <code>getDocumentation(indent,
     * lineLength, true)</code>.
     * </p>
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength)
     */
    public String getDocumentation(String indent, int lineLength)
    {
        return this.getSuperFrontEndController().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperFrontEndController().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperFrontEndController().getFullyQualifiedName();
    }

    /**
     * <p>
     * Returns the fully qualified name of the model element. The fully
     * qualified name includes complete package qualified name of the
     * underlying model element.  If modelName is true, then the
     * original name of the model element (the name contained within
     * the model) will be the name returned, otherwise a name from a
     * language mapping will be returned.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName(boolean modelName)
     */
    public String getFullyQualifiedName(boolean modelName)
    {
        return this.getSuperFrontEndController().getFullyQualifiedName(modelName);
    }

    /**
     * <p>
     * Returns the fully qualified name as a path, the returned value
     * always starts with out a slash '/'.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedNamePath()
     */
    public String getFullyQualifiedNamePath()
    {
        return this.getSuperFrontEndController().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperFrontEndController().getId();
    }

    /**
     * <p>
     * UML2: Retrieves the keywords for this element. Used to modify
     * implementation properties which are not represented by other
     * properties, i.e. native, transient, volatile, synchronized,
     * (added annotations) override, deprecated. Can also be used to
     * suppress compiler warnings: (added annotations) unchecked,
     * fallthrough, path, serial, finally, all. Annotations require
     * JDK5 compiler level.
     * </p>
     * @see ModelElementFacade#getKeywords()
     */
    public Collection<String> getKeywords()
    {
        return this.getSuperFrontEndController().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperFrontEndController().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperFrontEndController().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperFrontEndController().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperFrontEndController().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperFrontEndController().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperFrontEndController().getPackageName();
    }

    /**
     * <p>
     * Gets the package name (optionally providing the ability to
     * retrieve the model name and not the mapped name).
     * </p>
     * @see ModelElementFacade#getPackageName(boolean modelName)
     */
    public String getPackageName(boolean modelName)
    {
        return this.getSuperFrontEndController().getPackageName(modelName);
    }

    /**
     * <p>
     * Returns the package as a path, the returned value always starts
     * with out a slash '/'.
     * </p>
     * @see ModelElementFacade#getPackagePath()
     */
    public String getPackagePath()
    {
        return this.getSuperFrontEndController().getPackagePath();
    }

    /**
     * <p>
     * UML2: Returns the value of the 'Qualified Name' attribute. A
     * name which allows the NamedElement to be identified within a
     * hierarchy of nested Namespaces. It is constructed from the names
     * of the containing namespaces starting at the root of the
     * hierarchy and ending with the name of the NamedElement itself.
     * </p>
     * @see ModelElementFacade#getQualifiedName()
     */
    public String getQualifiedName()
    {
        return this.getSuperFrontEndController().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperFrontEndController().getRootPackage();
    }

    /**
     * <p>
     * Gets the dependencies for which this model element is the
     * source.
     * </p>
     * @see ModelElementFacade#getSourceDependencies()
     */
    public Collection<DependencyFacade> getSourceDependencies()
    {
        return this.getSuperFrontEndController().getSourceDependencies();
    }

    /**
     * <p>
     * If this model element is the context of an activity graph, this
     * represents that activity graph.
     * </p>
     * @see ModelElementFacade#getStateMachineContext()
     */
    public StateMachineFacade getStateMachineContext()
    {
        return this.getSuperFrontEndController().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperFrontEndController().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperFrontEndController().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperFrontEndController().getTaggedValues();
    }

    /**
     * <p>
     * Gets the dependencies for which this model element is the
     * target.
     * </p>
     * @see ModelElementFacade#getTargetDependencies()
     */
    public Collection<DependencyFacade> getTargetDependencies()
    {
        return this.getSuperFrontEndController().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperFrontEndController().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperFrontEndController().getTemplateParameters();
    }

    /**
     * <p>
     * The visibility (i.e. public, private, protected or package) of
     * the model element, will attempt a lookup for these values in the
     * language mappings (if any).
     * </p>
     * @see ModelElementFacade#getVisibility()
     */
    public String getVisibility()
    {
        return this.getSuperFrontEndController().getVisibility();
    }

    /**
     * <p>
     * Returns true if the model element has the exact stereotype
     * (meaning no stereotype inheritance is taken into account when
     * searching for the stereotype), false otherwise.
     * </p>
     * @see ModelElementFacade#hasExactStereotype(String stereotypeName)
     */
    public boolean hasExactStereotype(String stereotypeName)
    {
        return this.getSuperFrontEndController().hasExactStereotype(stereotypeName);
    }

    /**
     * <p>
     * Does the UML Element contain the named Keyword? Keywords can be
     * separated by space, comma, pipe, semicolon, or << >>
     * </p>
     * @see ModelElementFacade#hasKeyword(String keywordName)
     */
    public boolean hasKeyword(String keywordName)
    {
        return this.getSuperFrontEndController().hasKeyword(keywordName);
    }

    /**
     * <p>
     * Returns true if the model element has the specified stereotype. 
     * If the stereotype itself does not match, then a search will be
     * made up the stereotype inheritance hierarchy, and if one of the
     * stereotype's ancestors has a matching name this method will
     * return true, false otherwise.
     * </p>
     * <p>
     * For example, if we have a certain stereotype called
     * <<exception>> and a model element has a stereotype called
     * <<applicationException>> which extends <<exception>>, when
     * calling this method with 'stereotypeName' defined as 'exception'
     * the method would return true since <<applicationException>>
     * inherits from <<exception>>.  If you want to check if the model
     * element has the exact stereotype, then use the method
     * 'hasExactStereotype' instead.
     * </p>
     * @see ModelElementFacade#hasStereotype(String stereotypeName)
     */
    public boolean hasStereotype(String stereotypeName)
    {
        return this.getSuperFrontEndController().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperFrontEndController().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperFrontEndController().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperFrontEndController().isDocumentationPresent();
    }

    /**
     * <p>
     * True if this element name is a reserved word in Java, C#, ANSI
     * or ISO C, C++, JavaScript.
     * </p>
     * @see ModelElementFacade#isReservedWord()
     */
    public boolean isReservedWord()
    {
        return this.getSuperFrontEndController().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperFrontEndController().isTemplateParametersPresent();
    }

    /**
     * <p>
     * Searches for the constraint with the specified 'name' on this
     * model element, and if found translates it using the specified
     * 'translation' from a translation library discovered by the
     * framework.
     * </p>
     * @see ModelElementFacade#translateConstraint(String name, String translation)
     */
    public String translateConstraint(String name, String translation)
    {
        return this.getSuperFrontEndController().translateConstraint(name, translation);
    }

    /**
     * <p>
     * Translates all constraints belonging to this model element with
     * the given 'translation'.
     * </p>
     * @see ModelElementFacade#translateConstraints(String translation)
     */
    public String[] translateConstraints(String translation)
    {
        return this.getSuperFrontEndController().translateConstraints(translation);
    }

    /**
     * <p>
     * Translates the constraints of the specified 'kind' belonging to
     * this model element.
     * </p>
     * @see ModelElementFacade#translateConstraints(String kind, String translation)
     */
    public String[] translateConstraints(String kind, String translation)
    {
        return this.getSuperFrontEndController().translateConstraints(kind, translation);
    }

    /**
     * @see MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperFrontEndController().initialize();
    }

    /**
     * @return Object getSuperFrontEndController().getValidationOwner()
     * @see MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperFrontEndController().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperFrontEndController().getValidationName()
     * @see MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperFrontEndController().getValidationName();
        return name;
    }

    /**
     * @param validationMessages Collection<ModelValidationMessage>
     * @see MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperFrontEndController().validateInvariants(validationMessages);
    }

    /**
     * The property that stores the name of the metafacade.
     */
    private static final String NAME_PROPERTY = "name";
    private static final String FQNAME_PROPERTY = "fullyQualifiedName";

    /**
     * @see Object#toString()
     */
    @Override
    public String toString()
    {
        final StringBuilder toString = new StringBuilder(this.getClass().getName());
        toString.append("[");
        try
        {
            toString.append(Introspector.instance().getProperty(this, FQNAME_PROPERTY));
        }
        catch (final Throwable tryAgain)
        {
            try
            {
                toString.append(Introspector.instance().getProperty(this, NAME_PROPERTY));
            }
            catch (final Throwable ignore)
            {
                // - just ignore when the metafacade doesn't have a name or fullyQualifiedName property
            }
        }
        toString.append("]");
        return toString.toString();
    }
}