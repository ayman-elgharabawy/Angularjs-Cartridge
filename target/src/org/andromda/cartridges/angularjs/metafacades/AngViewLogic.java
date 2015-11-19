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
import org.andromda.metafacades.uml.ActionFacade;
import org.andromda.metafacades.uml.ConstraintFacade;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.EventFacade;
import org.andromda.metafacades.uml.FrontEndAction;
import org.andromda.metafacades.uml.FrontEndExceptionHandler;
import org.andromda.metafacades.uml.FrontEndForward;
import org.andromda.metafacades.uml.FrontEndParameter;
import org.andromda.metafacades.uml.FrontEndUseCase;
import org.andromda.metafacades.uml.FrontEndView;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.PartitionFacade;
import org.andromda.metafacades.uml.StateFacade;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TransitionFacade;
import org.andromda.metafacades.uml.TypeMappings;
import org.andromda.translation.ocl.validation.OCLCollections;
import org.andromda.translation.ocl.validation.OCLIntrospector;
import org.andromda.translation.ocl.validation.OCLResultEnsurer;
import org.apache.commons.collections.Transformer;
import org.apache.log4j.Logger;

/**
 * <p>
 * Represents a Angularjs view for a front-end application.
 * </p>
 * MetafacadeLogic for AngView
 *
 * @see AngView
 */
public abstract class AngViewLogic
    extends MetafacadeBase
    implements AngView
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
    protected AngViewLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superFrontEndView =
           (FrontEndView)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.FrontEndView",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * The logger instance.
     */
    private static final Logger logger = Logger.getLogger(AngViewLogic.class);

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to AngView if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.angularjs.metafacades.AngView";
        }
        return context;
    }

    private FrontEndView superFrontEndView;
    private boolean superFrontEndViewInitialized = false;

    /**
     * Gets the FrontEndView parent instance.
     * @return this.superFrontEndView FrontEndView
     */
    private FrontEndView getSuperFrontEndView()
    {
        if (!this.superFrontEndViewInitialized)
        {
            ((MetafacadeBase)this.superFrontEndView).setMetafacadeContext(this.getMetafacadeContext());
            this.superFrontEndViewInitialized = true;
        }
        return this.superFrontEndView;
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
            if (this.superFrontEndViewInitialized)
            {
                ((MetafacadeBase)this.superFrontEndView).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see AngView
     */
    public boolean isAngViewMetaType()
    {
        return true;
    }

    // --------------- attributes ---------------------

   /**
    * @see org.andromda.cartridges.angularjs.metafacades.AngView#getPath()
    * @return String
    */
    protected abstract String handleGetPath();

    private String __path1a;
    private boolean __path1aSet = false;

    /**
     * <p>
     * The full path of the view resources (i.e. the JSP page).
     * </p>
     * @return (String)handleGetPath()
     */
    public final String getPath()
    {
        String path1a = this.__path1a;
        if (!this.__path1aSet)
        {
            // path has no pre constraints
            path1a = handleGetPath();
            // path has no post constraints
            this.__path1a = path1a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__path1aSet = true;
            }
        }
        return path1a;
    }

   /**
    * @see org.andromda.cartridges.angularjs.metafacades.AngView#isValidationRequired()
    * @return boolean
    */
    protected abstract boolean handleIsValidationRequired();

    private boolean __validationRequired2a;
    private boolean __validationRequired2aSet = false;

    /**
     * <p>
     * Indicates whether or not at least one parameter of an outgoing
     * action in this view requires validation.
     * </p>
     * @return (boolean)handleIsValidationRequired()
     */
    public final boolean isValidationRequired()
    {
        boolean validationRequired2a = this.__validationRequired2a;
        if (!this.__validationRequired2aSet)
        {
            // validationRequired has no pre constraints
            validationRequired2a = handleIsValidationRequired();
            // validationRequired has no post constraints
            this.__validationRequired2a = validationRequired2a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__validationRequired2aSet = true;
            }
        }
        return validationRequired2a;
    }

    // ---------------- business methods ----------------------

    /**
     * Method to be implemented in descendants
     * 
     * @return String
     */
    protected abstract String handleGetAngModel();

    /**
     * 
     * @return handleGetAngModel()
     */
    public String getAngModel()
    {
        // getAngModel has no pre constraints
        String returnValue = handleGetAngModel();
        // getAngModel has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return Collection
     */
    protected abstract Collection handleGetOutgoingsStates();

    /**
     * 
     * @return handleGetOutgoingsStates()
     */
    public Collection getOutgoingsStates()
    {
        // getOutgoingsStates has no pre constraints
        Collection returnValue = handleGetOutgoingsStates();
        // getOutgoingsStates has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return Collection
     */
    protected abstract Collection handleGetOutgoingsStatesHasLinkAction();

    /**
     * 
     * @return handleGetOutgoingsStatesHasLinkAction()
     */
    public Collection getOutgoingsStatesHasLinkAction()
    {
        // getOutgoingsStatesHasLinkAction has no pre constraints
        Collection returnValue = handleGetOutgoingsStatesHasLinkAction();
        // getOutgoingsStatesHasLinkAction has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return Collection
     */
    protected abstract Collection handleGetOutgoingsStatesHasFormAction();

    /**
     * 
     * @return handleGetOutgoingsStatesHasFormAction()
     */
    public Collection getOutgoingsStatesHasFormAction()
    {
        // getOutgoingsStatesHasFormAction has no pre constraints
        Collection returnValue = handleGetOutgoingsStatesHasFormAction();
        // getOutgoingsStatesHasFormAction has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return Collection
     */
    protected abstract Collection handleGetOutgoingsStatesHasNoLinkAction();

    /**
     * 
     * @return handleGetOutgoingsStatesHasNoLinkAction()
     */
    public Collection getOutgoingsStatesHasNoLinkAction()
    {
        // getOutgoingsStatesHasNoLinkAction has no pre constraints
        Collection returnValue = handleGetOutgoingsStatesHasNoLinkAction();
        // getOutgoingsStatesHasNoLinkAction has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return String
     */
    protected abstract String handleGetViewType();

    /**
     * 
     * @return handleGetViewType()
     */
    public String getViewType()
    {
        // getViewType has no pre constraints
        String returnValue = handleGetViewType();
        // getViewType has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return boolean
     */
    protected abstract boolean handleIsMaster();

    /**
     * 
     * @return handleIsMaster()
     */
    public boolean isMaster()
    {
        // isMaster has no pre constraints
        boolean returnValue = handleIsMaster();
        // isMaster has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return boolean
     */
    protected abstract boolean handleIsDetail();

    /**
     * 
     * @return handleIsDetail()
     */
    public boolean isDetail()
    {
        // isDetail has no pre constraints
        boolean returnValue = handleIsDetail();
        // isDetail has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return String
     */
    protected abstract String handleGetMasterPage();

    /**
     * 
     * @return handleGetMasterPage()
     */
    public String getMasterPage()
    {
        // getMasterPage has no pre constraints
        String returnValue = handleGetMasterPage();
        // getMasterPage has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return boolean
     */
    protected abstract boolean handleHasParameter();

    /**
     * 
     * @return handleHasParameter()
     */
    public boolean hasParameter()
    {
        // hasParameter has no pre constraints
        boolean returnValue = handleHasParameter();
        // hasParameter has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return Collection
     */
    protected abstract Collection handleGetDetailPages();

    /**
     * 
     * @return handleGetDetailPages()
     */
    public Collection getDetailPages()
    {
        // getDetailPages has no pre constraints
        Collection returnValue = handleGetDetailPages();
        // getDetailPages has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @return Collection
     */
    protected abstract Collection handleGetNextViewStatesHasGaurd();

    /**
     * 
     * @return handleGetNextViewStatesHasGaurd()
     */
    public Collection getNextViewStatesHasGaurd()
    {
        // getNextViewStatesHasGaurd has no pre constraints
        Collection returnValue = handleGetNextViewStatesHasGaurd();
        // getNextViewStatesHasGaurd has no post constraints
        return returnValue;
    }

    // ------------- associations ------------------

    /**
     * 
     * @return (AngController)handleGetController()
     */
    public final AngController getController()
    {
        AngController getController1r = null;
        // views has no pre constraints
        Object result = handleGetController();
        MetafacadeBase shieldedResult = this.shieldedElement(result);
        try
        {
            getController1r = (AngController)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            AngViewLogic.logger.warn("incorrect metafacade cast for AngViewLogic.getController AngController " + result + ": " + shieldedResult);
        }
        // views has no post constraints
        return getController1r;
    }

    /**
     * UML Specific type is transformed by shieldedElements to AndroMDA Metafacade type
     * @return Object
     */
    protected abstract Object handleGetController();

    /**
     * @return true
     * @see FrontEndView
     */
    public boolean isFrontEndViewMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see org.andromda.metafacades.uml.FrontEndActionState
     */
    public boolean isFrontEndActionStateMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see org.andromda.metafacades.uml.ActionStateFacade
     */
    public boolean isActionStateFacadeMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see StateFacade
     */
    public boolean isStateFacadeMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see org.andromda.metafacades.uml.StateVertexFacade
     */
    public boolean isStateVertexFacadeMetaType()
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

    // ----------- delegates to FrontEndView ------------
    /**
     * <p>
     * The entry action for this action state (if any).
     * </p>
     * @see org.andromda.metafacades.uml.ActionStateFacade#getEntry()
     */
    public ActionFacade getEntry()
    {
        return this.getSuperFrontEndView().getEntry();
    }

    /**
     * <p>
     * The method name representing this action state.
     * </p>
     * @see org.andromda.metafacades.uml.FrontEndActionState#getActionMethodName()
     */
    public String getActionMethodName()
    {
        return this.getSuperFrontEndView().getActionMethodName();
    }

    /**
     * <p>
     * The actions that pass through this action state.
     * </p>
     * @see org.andromda.metafacades.uml.FrontEndActionState#getContainerActions()
     */
    public List<FrontEndAction> getContainerActions()
    {
        return this.getSuperFrontEndView().getContainerActions();
    }

    /**
     * <p>
     * All calls deferred to the controller by this action state.
     * </p>
     * @see org.andromda.metafacades.uml.FrontEndActionState#getControllerCalls()
     */
    public List<OperationFacade> getControllerCalls()
    {
        return this.getSuperFrontEndView().getControllerCalls();
    }

    /**
     * <p>
     * All exceptions modelled on this action state.
     * </p>
     * @see org.andromda.metafacades.uml.FrontEndActionState#getExceptions()
     */
    public List<FrontEndExceptionHandler> getExceptions()
    {
        return this.getSuperFrontEndView().getExceptions();
    }

    /**
     * <p>
     * The next transition, there can be only one transition going out
     * of an action state, otherwise decision points should be used
     * (triggers are not supported at the server-side).
     * </p>
     * @see org.andromda.metafacades.uml.FrontEndActionState#getForward()
     */
    public FrontEndForward getForward()
    {
        return this.getSuperFrontEndView().getForward();
    }

    /**
     * <p>
     * All calls deferred to the services by this action state.
     * </p>
     * @see org.andromda.metafacades.uml.FrontEndActionState#getServiceCalls()
     */
    public List<OperationFacade> getServiceCalls()
    {
        return this.getSuperFrontEndView().getServiceCalls();
    }

    /**
     * <p>
     * True if this element is contained in a FrontEndUseCase.
     * </p>
     * @see org.andromda.metafacades.uml.FrontEndActionState#isContainedInFrontEndUseCase()
     */
    public boolean isContainedInFrontEndUseCase()
    {
        return this.getSuperFrontEndView().isContainedInFrontEndUseCase();
    }

    /**
     * <p>
     * Indicates whether or not this front end action state is server
     * side. Pages, for example, are also action states but they return
     * control to the client.
     * </p>
     * @see org.andromda.metafacades.uml.FrontEndActionState#isServerSide()
     */
    public boolean isServerSide()
    {
        return this.getSuperFrontEndView().isServerSide();
    }

    /**
     * <p>
     * All actions that can be triggered on this view.
     * </p>
     * @see FrontEndView#getActions()
     */
    public List<FrontEndAction> getActions()
    {
        return this.getSuperFrontEndView().getActions();
    }

    /**
     * <p>
     * All parameters for each action going out of this view.
     * </p>
     * @see FrontEndView#getAllActionParameters()
     */
    public List<FrontEndParameter> getAllActionParameters()
    {
        return this.getSuperFrontEndView().getAllActionParameters();
    }

    /**
     * <p>
     * All fields from all forms on the given view.
     * </p>
     * @see FrontEndView#getAllFormFields()
     */
    public List<FrontEndParameter> getAllFormFields()
    {
        return this.getSuperFrontEndView().getAllFormFields();
    }

    /**
     * <p>
     * All tables belonging to the front end view.
     * </p>
     * @see FrontEndView#getTables()
     */
    public List<FrontEndParameter> getTables()
    {
        return this.getSuperFrontEndView().getTables();
    }

    /**
     * <p>
     * The use-case of which this view is a member.
     * </p>
     * @see FrontEndView#getUseCase()
     */
    public FrontEndUseCase getUseCase()
    {
        return this.getSuperFrontEndView().getUseCase();
    }

    /**
     * <p>
     * All those variables that will be present as variables in the
     * target view. These are the trigger parameters on the incoming
     * transitions.
     * </p>
     * @see FrontEndView#getVariables()
     */
    public List<FrontEndParameter> getVariables()
    {
        return this.getSuperFrontEndView().getVariables();
    }

    /**
     * <p>
     * True if this element carries the FrontEndView stereotype.
     * </p>
     * @see FrontEndView#isFrontEndView()
     */
    public boolean isFrontEndView()
    {
        return this.getSuperFrontEndView().isFrontEndView();
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
        this.getSuperFrontEndView().copyTaggedValues(element);
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
        return this.getSuperFrontEndView().findTaggedValue(tagName);
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
        return this.getSuperFrontEndView().findTaggedValues(tagName);
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
        return this.getSuperFrontEndView().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperFrontEndView().getConstraints();
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
        return this.getSuperFrontEndView().getConstraints(kind);
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
        return this.getSuperFrontEndView().getDocumentation(indent);
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
        return this.getSuperFrontEndView().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperFrontEndView().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperFrontEndView().getFullyQualifiedName();
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
        return this.getSuperFrontEndView().getFullyQualifiedName(modelName);
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
        return this.getSuperFrontEndView().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperFrontEndView().getId();
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
        return this.getSuperFrontEndView().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperFrontEndView().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperFrontEndView().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperFrontEndView().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperFrontEndView().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperFrontEndView().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperFrontEndView().getPackageName();
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
        return this.getSuperFrontEndView().getPackageName(modelName);
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
        return this.getSuperFrontEndView().getPackagePath();
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
        return this.getSuperFrontEndView().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperFrontEndView().getRootPackage();
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
        return this.getSuperFrontEndView().getSourceDependencies();
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
        return this.getSuperFrontEndView().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperFrontEndView().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperFrontEndView().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperFrontEndView().getTaggedValues();
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
        return this.getSuperFrontEndView().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperFrontEndView().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperFrontEndView().getTemplateParameters();
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
        return this.getSuperFrontEndView().getVisibility();
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
        return this.getSuperFrontEndView().hasExactStereotype(stereotypeName);
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
        return this.getSuperFrontEndView().hasKeyword(keywordName);
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
        return this.getSuperFrontEndView().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperFrontEndView().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperFrontEndView().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperFrontEndView().isDocumentationPresent();
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
        return this.getSuperFrontEndView().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperFrontEndView().isTemplateParametersPresent();
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
        return this.getSuperFrontEndView().translateConstraint(name, translation);
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
        return this.getSuperFrontEndView().translateConstraints(translation);
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
        return this.getSuperFrontEndView().translateConstraints(kind, translation);
    }

    /**
     * <p>
     * Events to which is being deferred in this action state.
     * </p>
     * @see StateFacade#getDeferrableEvents()
     */
    public Collection<EventFacade> getDeferrableEvents()
    {
        return this.getSuperFrontEndView().getDeferrableEvents();
    }

    /**
     * 
     * @see org.andromda.metafacades.uml.StateVertexFacade#getContainer()
     */
    public StateFacade getContainer()
    {
        return this.getSuperFrontEndView().getContainer();
    }

    /**
     * 
     * @see org.andromda.metafacades.uml.StateVertexFacade#getIncomings()
     */
    public Collection<TransitionFacade> getIncomings()
    {
        return this.getSuperFrontEndView().getIncomings();
    }

    /**
     * 
     * @see org.andromda.metafacades.uml.StateVertexFacade#getOutgoings()
     */
    public Collection<TransitionFacade> getOutgoings()
    {
        return this.getSuperFrontEndView().getOutgoings();
    }

    /**
     * <p>
     * The partition (if any) to which this vertex belongs.
     * </p>
     * @see org.andromda.metafacades.uml.StateVertexFacade#getPartition()
     */
    public PartitionFacade getPartition()
    {
        return this.getSuperFrontEndView().getPartition();
    }

    /**
     * 
     * @see org.andromda.metafacades.uml.StateVertexFacade#getStateMachine()
     */
    public StateMachineFacade getStateMachine()
    {
        return this.getSuperFrontEndView().getStateMachine();
    }

    /**
     * @see MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperFrontEndView().initialize();
    }

    /**
     * @return Object getSuperFrontEndView().getValidationOwner()
     * @see MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperFrontEndView().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperFrontEndView().getValidationName()
     * @see MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperFrontEndView().getValidationName();
        return name;
    }

    /**
     * <p><b>Constraint:</b> org::andromda::cartridges::angularjs::metafacades::AngView::duplicate view action names not allowed</p>
     * <p><b>Error:</b> Each view must contain actions which each have a unique name, this view has actions with duplicate names or names that cause an action name to be duplicated in faces-config.xml.</p>
     * <p><b>OCL:</b> context JSFView inv: actions->isUnique(name)</p>
     * @param validationMessages Collection<ModelValidationMessage>
     * @see MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperFrontEndView().validateInvariants(validationMessages);
        try
        {
            final Object contextElement = this.THIS();
            boolean constraintValid = OCLResultEnsurer.ensure(OCLCollections.isUnique(OCLIntrospector.invoke(contextElement,"actions"),new Transformer(){public Object transform(Object object){return OCLIntrospector.invoke(object,"name");}}));
            if (!constraintValid)
            {
                validationMessages.add(
                    new ModelValidationMessage(
                        (MetafacadeBase)contextElement ,
                        "org::andromda::cartridges::angularjs::metafacades::AngView::duplicate view action names not allowed",
                        "Each view must contain actions which each have a unique name, this view has actions with duplicate names or names that cause an action name to be duplicated in faces-config.xml."));
            }
        }
        catch (Throwable th)
        {
            Throwable cause = th.getCause();
            int depth = 0; // Some throwables have infinite recursion
            while (cause != null && depth < 7)
            {
                th = cause;
                depth++;
            }
            logger.error("Error validating constraint 'org::andromda::cartridges::angularjs::metafacades::AngView::duplicate view action names not allowed' ON "
                + this.THIS().toString() + ": " + th.getMessage(), th);
        }
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