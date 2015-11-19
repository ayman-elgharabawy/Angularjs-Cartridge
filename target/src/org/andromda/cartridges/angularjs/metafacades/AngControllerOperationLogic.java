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
import org.andromda.metafacades.uml.ClassifierFacade;
import org.andromda.metafacades.uml.ConstraintFacade;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.FrontEndAction;
import org.andromda.metafacades.uml.FrontEndActivityGraph;
import org.andromda.metafacades.uml.FrontEndControllerOperation;
import org.andromda.metafacades.uml.FrontEndParameter;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.ParameterFacade;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TypeMappings;
import org.apache.log4j.Logger;

/**
 * <p>
 * Represents an operation for a JSF controller.
 * </p>
 * MetafacadeLogic for AngControllerOperation
 *
 * @see AngControllerOperation
 */
public abstract class AngControllerOperationLogic
    extends MetafacadeBase
    implements AngControllerOperation
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
    protected AngControllerOperationLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superFrontEndControllerOperation =
           (FrontEndControllerOperation)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.FrontEndControllerOperation",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * The logger instance.
     */
    private static final Logger logger = Logger.getLogger(AngControllerOperationLogic.class);

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to AngControllerOperation if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.angularjs.metafacades.AngControllerOperation";
        }
        return context;
    }

    private FrontEndControllerOperation superFrontEndControllerOperation;
    private boolean superFrontEndControllerOperationInitialized = false;

    /**
     * Gets the FrontEndControllerOperation parent instance.
     * @return this.superFrontEndControllerOperation FrontEndControllerOperation
     */
    private FrontEndControllerOperation getSuperFrontEndControllerOperation()
    {
        if (!this.superFrontEndControllerOperationInitialized)
        {
            ((MetafacadeBase)this.superFrontEndControllerOperation).setMetafacadeContext(this.getMetafacadeContext());
            this.superFrontEndControllerOperationInitialized = true;
        }
        return this.superFrontEndControllerOperation;
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
            if (this.superFrontEndControllerOperationInitialized)
            {
                ((MetafacadeBase)this.superFrontEndControllerOperation).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see AngControllerOperation
     */
    public boolean isAngControllerOperationMetaType()
    {
        return true;
    }

    // --------------- attributes ---------------------

   /**
    * @see org.andromda.cartridges.angularjs.metafacades.AngControllerOperation#getImplementationFormSignature()
    * @return String
    */
    protected abstract String handleGetImplementationFormSignature();

    private String __implementationFormSignature1a;
    private boolean __implementationFormSignature1aSet = false;

    /**
     * <p>
     * The controller implementation operation signature that takes the
     * appropriate form (if this operation has at least one form field)
     * as an argument.
     * </p>
     * @return (String)handleGetImplementationFormSignature()
     */
    public final String getImplementationFormSignature()
    {
        String implementationFormSignature1a = this.__implementationFormSignature1a;
        if (!this.__implementationFormSignature1aSet)
        {
            // implementationFormSignature has no pre constraints
            implementationFormSignature1a = handleGetImplementationFormSignature();
            // implementationFormSignature has no post constraints
            this.__implementationFormSignature1a = implementationFormSignature1a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__implementationFormSignature1aSet = true;
            }
        }
        return implementationFormSignature1a;
    }

    // ---------------- business methods ----------------------

    /**
     * Method to be implemented in descendants
     * 
     * @return String
     */
    protected abstract String handleGetOperationType();

    /**
     * 
     * @return handleGetOperationType()
     */
    public String getOperationType()
    {
        // getOperationType has no pre constraints
        String returnValue = handleGetOperationType();
        // getOperationType has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return String
     */
    protected abstract String handleGetFactoryName();

    /**
     * 
     * @return handleGetFactoryName()
     */
    public String getFactoryName()
    {
        // getFactoryName has no pre constraints
        String returnValue = handleGetFactoryName();
        // getFactoryName has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return String
     */
    protected abstract String handleGetFactoryType();

    /**
     * 
     * @return handleGetFactoryType()
     */
    public String getFactoryType()
    {
        // getFactoryType has no pre constraints
        String returnValue = handleGetFactoryType();
        // getFactoryType has no post constraints
        return returnValue;
    }

    // ------------- associations ------------------

    /**
     * 
     * @return (AngController)handleGetAngController()
     */
    public final AngController getAngController()
    {
        AngController getAngController1r = null;
        // angControllerOperation has no pre constraints
        Object result = handleGetAngController();
        MetafacadeBase shieldedResult = this.shieldedElement(result);
        try
        {
            getAngController1r = (AngController)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            AngControllerOperationLogic.logger.warn("incorrect metafacade cast for AngControllerOperationLogic.getAngController AngController " + result + ": " + shieldedResult);
        }
        // angControllerOperation has no post constraints
        return getAngController1r;
    }

    /**
     * UML Specific type is transformed by shieldedElements to AndroMDA Metafacade type
     * @return Object
     */
    protected abstract Object handleGetAngController();

    /**
     * @return true
     * @see FrontEndControllerOperation
     */
    public boolean isFrontEndControllerOperationMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see OperationFacade
     */
    public boolean isOperationFacadeMetaType()
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

    // ----------- delegates to FrontEndControllerOperation ------------
    /**
     * <p>
     * The activity graph in which this controller operation is used.
     * </p>
     * @see FrontEndControllerOperation#getActivityGraph()
     */
    public FrontEndActivityGraph getActivityGraph()
    {
        return this.getSuperFrontEndControllerOperation().getActivityGraph();
    }

    /**
     * <p>
     * All those actions that contain at least one front-end action
     * state that is deferring to this operation.
     * </p>
     * @see FrontEndControllerOperation#getDeferringActions()
     */
    public List<FrontEndAction> getDeferringActions()
    {
        return this.getSuperFrontEndControllerOperation().getDeferringActions();
    }

    /**
     * <p>
     * The set of fields in the form made up form this controller
     * operation's parameters.
     * </p>
     * @see FrontEndControllerOperation#getFormFields()
     */
    public List<FrontEndParameter> getFormFields()
    {
        return this.getSuperFrontEndControllerOperation().getFormFields();
    }

    /**
     * <p>
     * For each front-end controller operation argument there must
     * exist a form field for each action deferring to that operation.
     * This form field must carry the same name and must be of the same
     * type. True if this is the case, false otherwise.
     * </p>
     * @see FrontEndControllerOperation#isAllArgumentsHaveFormFields()
     */
    public boolean isAllArgumentsHaveFormFields()
    {
        return this.getSuperFrontEndControllerOperation().isAllArgumentsHaveFormFields();
    }

    /**
     * <p>
     * Indicates if the owner of this operation is a controller.
     * </p>
     * @see FrontEndControllerOperation#isOwnerIsController()
     */
    public boolean isOwnerIsController()
    {
        return this.getSuperFrontEndControllerOperation().isOwnerIsController();
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
        this.getSuperFrontEndControllerOperation().copyTaggedValues(element);
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
        return this.getSuperFrontEndControllerOperation().findTaggedValue(tagName);
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
        return this.getSuperFrontEndControllerOperation().findTaggedValues(tagName);
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
        return this.getSuperFrontEndControllerOperation().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperFrontEndControllerOperation().getConstraints();
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
        return this.getSuperFrontEndControllerOperation().getConstraints(kind);
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
        return this.getSuperFrontEndControllerOperation().getDocumentation(indent);
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
        return this.getSuperFrontEndControllerOperation().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperFrontEndControllerOperation().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperFrontEndControllerOperation().getFullyQualifiedName();
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
        return this.getSuperFrontEndControllerOperation().getFullyQualifiedName(modelName);
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
        return this.getSuperFrontEndControllerOperation().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperFrontEndControllerOperation().getId();
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
        return this.getSuperFrontEndControllerOperation().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperFrontEndControllerOperation().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperFrontEndControllerOperation().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperFrontEndControllerOperation().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperFrontEndControllerOperation().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperFrontEndControllerOperation().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperFrontEndControllerOperation().getPackageName();
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
        return this.getSuperFrontEndControllerOperation().getPackageName(modelName);
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
        return this.getSuperFrontEndControllerOperation().getPackagePath();
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
        return this.getSuperFrontEndControllerOperation().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperFrontEndControllerOperation().getRootPackage();
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
        return this.getSuperFrontEndControllerOperation().getSourceDependencies();
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
        return this.getSuperFrontEndControllerOperation().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperFrontEndControllerOperation().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperFrontEndControllerOperation().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperFrontEndControllerOperation().getTaggedValues();
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
        return this.getSuperFrontEndControllerOperation().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperFrontEndControllerOperation().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperFrontEndControllerOperation().getTemplateParameters();
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
        return this.getSuperFrontEndControllerOperation().getVisibility();
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
        return this.getSuperFrontEndControllerOperation().hasExactStereotype(stereotypeName);
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
        return this.getSuperFrontEndControllerOperation().hasKeyword(keywordName);
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
        return this.getSuperFrontEndControllerOperation().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperFrontEndControllerOperation().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperFrontEndControllerOperation().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperFrontEndControllerOperation().isDocumentationPresent();
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
        return this.getSuperFrontEndControllerOperation().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperFrontEndControllerOperation().isTemplateParametersPresent();
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
        return this.getSuperFrontEndControllerOperation().translateConstraint(name, translation);
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
        return this.getSuperFrontEndControllerOperation().translateConstraints(translation);
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
        return this.getSuperFrontEndControllerOperation().translateConstraints(kind, translation);
    }

    /**
     * <p>
     * Finds the parameter on this operation having the given name, if
     * no parameter is found, null is returned instead.
     * </p>
     * @see OperationFacade#findParameter(String name)
     */
    public ParameterFacade findParameter(String name)
    {
        return this.getSuperFrontEndControllerOperation().findParameter(name);
    }

    /**
     * <p>
     * Searches the given feature for the specified tag.
     * </p>
     * <p>
     * If the follow boolean is set to true then the search will
     * continue from the class operation to the class itself and then
     * up the class hierarchy.
     * </p>
     * @see OperationFacade#findTaggedValue(String name, boolean follow)
     */
    public Object findTaggedValue(String name, boolean follow)
    {
        return this.getSuperFrontEndControllerOperation().findTaggedValue(name, follow);
    }

    /**
     * <p>
     * A comma separated list of all argument names.
     * </p>
     * @see OperationFacade#getArgumentNames()
     */
    public String getArgumentNames()
    {
        return this.getSuperFrontEndControllerOperation().getArgumentNames();
    }

    /**
     * 
     * @see OperationFacade#getArgumentTypeNames()
     */
    public String getArgumentTypeNames()
    {
        return this.getSuperFrontEndControllerOperation().getArgumentTypeNames();
    }

    /**
     * 
     * @see OperationFacade#getArguments()
     */
    public Collection<ParameterFacade> getArguments()
    {
        return this.getSuperFrontEndControllerOperation().getArguments();
    }

    /**
     * 
     * @see OperationFacade#getCall()
     */
    public String getCall()
    {
        return this.getSuperFrontEndControllerOperation().getCall();
    }

    /**
     * <p>
     * Returns the concurrency modifier for this operation (i.e.
     * concurrent, guarded or sequential) of the model element, will
     * attempt a lookup for these values in the language mappings (if
     * any).
     * </p>
     * @see OperationFacade#getConcurrency()
     */
    public String getConcurrency()
    {
        return this.getSuperFrontEndControllerOperation().getConcurrency();
    }

    /**
     * <p>
     * A comma separated list containing all exceptions that this
     * operation throws.  Exceptions are determined through
     * dependencies that have the target element stereotyped as
     * <<Exception>>.
     * </p>
     * @see OperationFacade#getExceptionList()
     */
    public String getExceptionList()
    {
        return this.getSuperFrontEndControllerOperation().getExceptionList();
    }

    /**
     * <p>
     * Returns a comma separated list of exceptions appended to the
     * comma separated list of fully qualified 'initialException'
     * classes passed in to this method.
     * </p>
     * @see OperationFacade#getExceptionList(String initialExceptions)
     */
    public String getExceptionList(String initialExceptions)
    {
        return this.getSuperFrontEndControllerOperation().getExceptionList(initialExceptions);
    }

    /**
     * <p>
     * A collection of all exceptions thrown by this operation.
     * </p>
     * @see OperationFacade#getExceptions()
     */
    public Collection getExceptions()
    {
        return this.getSuperFrontEndControllerOperation().getExceptions();
    }

    /**
     * <p>
     * Return Type with multiplicity taken into account. UML14 does not
     * allow multiplicity *.
     * </p>
     * @see OperationFacade#getGetterSetterReturnTypeName()
     */
    public String getGetterSetterReturnTypeName()
    {
        return this.getSuperFrontEndControllerOperation().getGetterSetterReturnTypeName();
    }

    /**
     * <p>
     * the lower value for the multiplicity
     * </p>
     * <p>
     * -only applicable for UML2
     * </p>
     * @see OperationFacade#getLower()
     */
    public int getLower()
    {
        return this.getSuperFrontEndControllerOperation().getLower();
    }

    /**
     * <p>
     * Returns the operation method body determined from UML sequence
     * diagrams or other UML sources.
     * </p>
     * @see OperationFacade#getMethodBody()
     */
    public String getMethodBody()
    {
        return this.getSuperFrontEndControllerOperation().getMethodBody();
    }

    /**
     * <p>
     * The operation this operation overrides, null if this operation
     * is not overriding.
     * </p>
     * @see OperationFacade#getOverriddenOperation()
     */
    public OperationFacade getOverriddenOperation()
    {
        return this.getSuperFrontEndControllerOperation().getOverriddenOperation();
    }

    /**
     * <p>
     * Gets the owner of this operation
     * </p>
     * @see OperationFacade#getOwner()
     */
    public ClassifierFacade getOwner()
    {
        return this.getSuperFrontEndControllerOperation().getOwner();
    }

    /**
     * 
     * @see OperationFacade#getParameters()
     */
    public Collection<ParameterFacade> getParameters()
    {
        return this.getSuperFrontEndControllerOperation().getParameters();
    }

    /**
     * <p>
     * The name of the operation that handles postcondition
     * constraints.
     * </p>
     * @see OperationFacade#getPostconditionName()
     */
    public String getPostconditionName()
    {
        return this.getSuperFrontEndControllerOperation().getPostconditionName();
    }

    /**
     * <p>
     * The postcondition constraints belonging to this operation.
     * </p>
     * @see OperationFacade#getPostconditions()
     */
    public Collection<ConstraintFacade> getPostconditions()
    {
        return this.getSuperFrontEndControllerOperation().getPostconditions();
    }

    /**
     * <p>
     * The call to the precondition operation.
     * </p>
     * @see OperationFacade#getPreconditionCall()
     */
    public String getPreconditionCall()
    {
        return this.getSuperFrontEndControllerOperation().getPreconditionCall();
    }

    /**
     * <p>
     * The name of the operation that handles precondition constraints.
     * </p>
     * @see OperationFacade#getPreconditionName()
     */
    public String getPreconditionName()
    {
        return this.getSuperFrontEndControllerOperation().getPreconditionName();
    }

    /**
     * <p>
     * The signature of the precondition operation.
     * </p>
     * @see OperationFacade#getPreconditionSignature()
     */
    public String getPreconditionSignature()
    {
        return this.getSuperFrontEndControllerOperation().getPreconditionSignature();
    }

    /**
     * <p>
     * The precondition constraints belonging to this operation.
     * </p>
     * @see OperationFacade#getPreconditions()
     */
    public Collection<ConstraintFacade> getPreconditions()
    {
        return this.getSuperFrontEndControllerOperation().getPreconditions();
    }

    /**
     * <p>
     * (UML2 Only). Get the actual return parameter (which may have
     * stereotypes etc).
     * </p>
     * @see OperationFacade#getReturnParameter()
     */
    public ParameterFacade getReturnParameter()
    {
        return this.getSuperFrontEndControllerOperation().getReturnParameter();
    }

    /**
     * 
     * @see OperationFacade#getReturnType()
     */
    public ClassifierFacade getReturnType()
    {
        return this.getSuperFrontEndControllerOperation().getReturnType();
    }

    /**
     * 
     * @see OperationFacade#getSignature()
     */
    public String getSignature()
    {
        return this.getSuperFrontEndControllerOperation().getSignature();
    }

    /**
     * <p>
     * Returns the signature of the operation and optionally appends
     * the argument names (if withArgumentNames is true), otherwise
     * returns the signature with just the types alone in the
     * signature.
     * </p>
     * @see OperationFacade#getSignature(boolean withArgumentNames)
     */
    public String getSignature(boolean withArgumentNames)
    {
        return this.getSuperFrontEndControllerOperation().getSignature(withArgumentNames);
    }

    /**
     * <p>
     * Returns the signature of the operation and optionally appends
     * the given 'argumentModifier' to each argument.
     * </p>
     * @see OperationFacade#getSignature(String argumentModifier)
     */
    public String getSignature(String argumentModifier)
    {
        return this.getSuperFrontEndControllerOperation().getSignature(argumentModifier);
    }

    /**
     * <p>
     * A comma-separated parameter list  (type and name of each
     * parameter) of an operation.
     * </p>
     * @see OperationFacade#getTypedArgumentList()
     */
    public String getTypedArgumentList()
    {
        return this.getSuperFrontEndControllerOperation().getTypedArgumentList();
    }

    /**
     * <p>
     * A comma-separated parameter list  (type and name of each
     * parameter) of an operation with an optional modifier (i.e final)
     * before each parameter.
     * </p>
     * @see OperationFacade#getTypedArgumentList(String modifier)
     */
    public String getTypedArgumentList(String modifier)
    {
        return this.getSuperFrontEndControllerOperation().getTypedArgumentList(modifier);
    }

    /**
     * <p>
     * the upper value for the multiplicity (will be -1 for *)
     * </p>
     * <p>
     * - only applicable for UML2
     * </p>
     * @see OperationFacade#getUpper()
     */
    public int getUpper()
    {
        return this.getSuperFrontEndControllerOperation().getUpper();
    }

    /**
     * 
     * @see OperationFacade#isAbstract()
     */
    public boolean isAbstract()
    {
        return this.getSuperFrontEndControllerOperation().isAbstract();
    }

    /**
     * <p>
     * True if the operation has (i.e. throws any exceptions) false
     * otherwise.
     * </p>
     * @see OperationFacade#isExceptionsPresent()
     */
    public boolean isExceptionsPresent()
    {
        return this.getSuperFrontEndControllerOperation().isExceptionsPresent();
    }

    /**
     * <p>
     * IsLeaf property in the operation. If true, operation is final,
     * cannot be extended or implemented by a descendant.
     * Default=false.
     * </p>
     * @see OperationFacade#isLeaf()
     */
    public boolean isLeaf()
    {
        return this.getSuperFrontEndControllerOperation().isLeaf();
    }

    /**
     * <p>
     * UML2 only. If the return type parameter multiplicity>1 OR the
     * operation multiplicity>1. Default=false.
     * </p>
     * @see OperationFacade#isMany()
     */
    public boolean isMany()
    {
        return this.getSuperFrontEndControllerOperation().isMany();
    }

    /**
     * <p>
     * UML2 only: If isMany (Collection type returned), is the type
     * unique within the collection.  Unique+Ordered determines
     * CollectionType implementation of return result. Default=false.
     * </p>
     * @see OperationFacade#isOrdered()
     */
    public boolean isOrdered()
    {
        return this.getSuperFrontEndControllerOperation().isOrdered();
    }

    /**
     * <p>
     * True if this operation overrides an operation defined in an
     * ancestor class. An operation overrides when the names of the
     * operations as well as the types of the arguments are equal. The
     * return type may be different and is, as well as any exceptions,
     * ignored.
     * </p>
     * @see OperationFacade#isOverriding()
     */
    public boolean isOverriding()
    {
        return this.getSuperFrontEndControllerOperation().isOverriding();
    }

    /**
     * <p>
     * Whether any postcondition constraints are present on this
     * operation.
     * </p>
     * @see OperationFacade#isPostconditionsPresent()
     */
    public boolean isPostconditionsPresent()
    {
        return this.getSuperFrontEndControllerOperation().isPostconditionsPresent();
    }

    /**
     * <p>
     * Whether any precondition constraints are present on this
     * operation.
     * </p>
     * @see OperationFacade#isPreconditionsPresent()
     */
    public boolean isPreconditionsPresent()
    {
        return this.getSuperFrontEndControllerOperation().isPreconditionsPresent();
    }

    /**
     * <p>
     * Indicates whether or not this operation is a query operation.
     * </p>
     * @see OperationFacade#isQuery()
     */
    public boolean isQuery()
    {
        return this.getSuperFrontEndControllerOperation().isQuery();
    }

    /**
     * <p>
     * True/false depending on whether or not the operation has a
     * return type or not (i.e. a return type of something other than
     * void).
     * </p>
     * @see OperationFacade#isReturnTypePresent()
     */
    public boolean isReturnTypePresent()
    {
        return this.getSuperFrontEndControllerOperation().isReturnTypePresent();
    }

    /**
     * 
     * @see OperationFacade#isStatic()
     */
    public boolean isStatic()
    {
        return this.getSuperFrontEndControllerOperation().isStatic();
    }

    /**
     * <p>
     * UML2 only: for Collection return type, is the type unique within
     * the collection. Unique+Ordered determines the returned
     * CollectionType. Default=false.
     * </p>
     * @see OperationFacade#isUnique()
     */
    public boolean isUnique()
    {
        return this.getSuperFrontEndControllerOperation().isUnique();
    }

    /**
     * @see MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperFrontEndControllerOperation().initialize();
    }

    /**
     * @return Object getSuperFrontEndControllerOperation().getValidationOwner()
     * @see MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperFrontEndControllerOperation().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperFrontEndControllerOperation().getValidationName()
     * @see MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperFrontEndControllerOperation().getValidationName();
        return name;
    }

    /**
     * @param validationMessages Collection<ModelValidationMessage>
     * @see MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperFrontEndControllerOperation().validateInvariants(validationMessages);
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