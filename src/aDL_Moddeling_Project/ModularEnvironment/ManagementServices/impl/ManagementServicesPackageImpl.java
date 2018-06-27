/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSettableAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceSupportEntity;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesFactory;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSettableAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue;

import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;

import aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl;

import aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage;

import aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.Unstructured_DataRepositoryPackageImpl;

import aDL_Moddeling_Project.basic.BasicPackage;

import aDL_Moddeling_Project.basic.impl.BasicPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagementServicesPackageImpl extends EPackageImpl implements ManagementServicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementServiceSupportEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementServiceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementServiceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msePropertyAdditionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleSelectionAdditionSetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveSelectionAdditionSetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectableAdditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedAdditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedAdditionSetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionSetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveSettableAdditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleSettableAdditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEnhanceableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writableAdditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writableAdditionSetterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ManagementServicesPackageImpl() {
		super(eNS_URI, ManagementServicesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ManagementServicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ManagementServicesPackage init() {
		if (isInited) return (ManagementServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI);

		// Obtain or create and register package
		ManagementServicesPackageImpl theManagementServicesPackage = (ManagementServicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ManagementServicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ManagementServicesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModularEnvironmentPackageImpl theModularEnvironmentPackage = (ModularEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) instanceof ModularEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) : ModularEnvironmentPackage.eINSTANCE);
		AdapterServicesPackageImpl theAdapterServicesPackage = (AdapterServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI) instanceof AdapterServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI) : AdapterServicesPackage.eINSTANCE);
		ModularSimulationPackageImpl theModularSimulationPackage = (ModularSimulationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) instanceof ModularSimulationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) : ModularSimulationPackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);
		DataRepresentationPackageImpl theDataRepresentationPackage = (DataRepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) instanceof DataRepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) : DataRepresentationPackage.eINSTANCE);
		OperationModelPackageImpl theOperationModelPackage = (OperationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) instanceof OperationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) : OperationModelPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		DataSpecificationPackageImpl theDataSpecificationPackage = (DataSpecificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) instanceof DataSpecificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) : DataSpecificationPackage.eINSTANCE);
		ModularSimulationAssemblyPackageImpl theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) instanceof ModularSimulationAssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) : ModularSimulationAssemblyPackage.eINSTANCE);
		AssemblyConnectionsPackageImpl theAssemblyConnectionsPackage = (AssemblyConnectionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) instanceof AssemblyConnectionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) : AssemblyConnectionsPackage.eINSTANCE);
		AssemblyAdditionEnhancementPackageImpl theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) instanceof AssemblyAdditionEnhancementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) : AssemblyAdditionEnhancementPackage.eINSTANCE);
		AssemblyInterfacePackageImpl theAssemblyInterfacePackage = (AssemblyInterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) instanceof AssemblyInterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) : AssemblyInterfacePackage.eINSTANCE);
		Unstructured_DataRepositoryPackageImpl theUnstructured_DataRepositoryPackage = (Unstructured_DataRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) instanceof Unstructured_DataRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) : Unstructured_DataRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theManagementServicesPackage.createPackageContents();
		theModularEnvironmentPackage.createPackageContents();
		theAdapterServicesPackage.createPackageContents();
		theModularSimulationPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theDataRepresentationPackage.createPackageContents();
		theOperationModelPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theDataSpecificationPackage.createPackageContents();
		theModularSimulationAssemblyPackage.createPackageContents();
		theAssemblyConnectionsPackage.createPackageContents();
		theAssemblyAdditionEnhancementPackage.createPackageContents();
		theAssemblyInterfacePackage.createPackageContents();
		theUnstructured_DataRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theManagementServicesPackage.initializePackageContents();
		theModularEnvironmentPackage.initializePackageContents();
		theAdapterServicesPackage.initializePackageContents();
		theModularSimulationPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theDataRepresentationPackage.initializePackageContents();
		theOperationModelPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theDataSpecificationPackage.initializePackageContents();
		theModularSimulationAssemblyPackage.initializePackageContents();
		theAssemblyConnectionsPackage.initializePackageContents();
		theAssemblyAdditionEnhancementPackage.initializePackageContents();
		theAssemblyInterfacePackage.initializePackageContents();
		theUnstructured_DataRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theManagementServicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ManagementServicesPackage.eNS_URI, theManagementServicesPackage);
		return theManagementServicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementService() {
		return managementServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementService_Managementservice() {
		return (EReference)managementServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementService_Msefacility() {
		return (EReference)managementServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementService_Managementservicesupportentity() {
		return (EReference)managementServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementService_Managementserviceinterface() {
		return (EReference)managementServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementService_Msepropertyadditioncontainer() {
		return (EReference)managementServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementServiceSupportEntity() {
		return managementServiceSupportEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementServiceFunction() {
		return managementServiceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementServiceFunction_PrintableDescription() {
		return (EAttribute)managementServiceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementServiceInterface() {
		return managementServiceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementServiceInterface_Managementservicefunction() {
		return (EReference)managementServiceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSEPropertyAdditionContainer() {
		return msePropertyAdditionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSEPropertyAdditionContainer_Optional() {
		return (EAttribute)msePropertyAdditionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getadditionValue() {
		return additionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleSelectionAdditionSetter() {
		return multipleSelectionAdditionSetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleSelectionAdditionSetter_Selectableadditionvalue() {
		return (EReference)multipleSelectionAdditionSetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleSelectionAdditionSetter_Multiplesettableaddition() {
		return (EReference)multipleSelectionAdditionSetterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveSelectionAdditionSetter() {
		return exclusiveSelectionAdditionSetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveSelectionAdditionSetter_Selectableadditionvalue() {
		return (EReference)exclusiveSelectionAdditionSetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveSelectionAdditionSetter_Exclusivesettableaddition() {
		return (EReference)exclusiveSelectionAdditionSetterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectableAddition() {
		return selectableAdditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectableAddition_Additionvalue() {
		return (EReference)selectableAdditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedAddition() {
		return combinedAdditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedAddition_Msepropertyaddition() {
		return (EReference)combinedAdditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedAdditionSetter() {
		return combinedAdditionSetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedAdditionSetter_Combinedadditions() {
		return (EReference)combinedAdditionSetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedAdditionSetter_AdditionSetters() {
		return (EReference)combinedAdditionSetterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionSetter() {
		return additionSetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveSettableAddition() {
		return exclusiveSettableAdditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleSettableAddition() {
		return multipleSettableAdditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionEnhanceableEntity() {
		return additionEnhanceableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWritableAddition() {
		return writableAdditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWritableAdditionSetter() {
		return writableAdditionSetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritableAdditionSetter_Writableaddition() {
		return (EReference)writableAdditionSetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWritableAdditionSetter_ValueContent() {
		return (EAttribute)writableAdditionSetterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServicesFactory getManagementServicesFactory() {
		return (ManagementServicesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		managementServiceEClass = createEClass(MANAGEMENT_SERVICE);
		createEReference(managementServiceEClass, MANAGEMENT_SERVICE__MANAGEMENTSERVICE);
		createEReference(managementServiceEClass, MANAGEMENT_SERVICE__MSEFACILITY);
		createEReference(managementServiceEClass, MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY);
		createEReference(managementServiceEClass, MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE);
		createEReference(managementServiceEClass, MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER);

		managementServiceSupportEntityEClass = createEClass(MANAGEMENT_SERVICE_SUPPORT_ENTITY);

		managementServiceFunctionEClass = createEClass(MANAGEMENT_SERVICE_FUNCTION);
		createEAttribute(managementServiceFunctionEClass, MANAGEMENT_SERVICE_FUNCTION__PRINTABLE_DESCRIPTION);

		managementServiceInterfaceEClass = createEClass(MANAGEMENT_SERVICE_INTERFACE);
		createEReference(managementServiceInterfaceEClass, MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION);

		msePropertyAdditionContainerEClass = createEClass(MSE_PROPERTY_ADDITION_CONTAINER);
		createEAttribute(msePropertyAdditionContainerEClass, MSE_PROPERTY_ADDITION_CONTAINER__OPTIONAL);

		additionValueEClass = createEClass(ADDITION_VALUE);

		multipleSelectionAdditionSetterEClass = createEClass(MULTIPLE_SELECTION_ADDITION_SETTER);
		createEReference(multipleSelectionAdditionSetterEClass, MULTIPLE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE);
		createEReference(multipleSelectionAdditionSetterEClass, MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION);

		exclusiveSelectionAdditionSetterEClass = createEClass(EXCLUSIVE_SELECTION_ADDITION_SETTER);
		createEReference(exclusiveSelectionAdditionSetterEClass, EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE);
		createEReference(exclusiveSelectionAdditionSetterEClass, EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION);

		selectableAdditionEClass = createEClass(SELECTABLE_ADDITION);
		createEReference(selectableAdditionEClass, SELECTABLE_ADDITION__ADDITIONVALUE);

		combinedAdditionEClass = createEClass(COMBINED_ADDITION);
		createEReference(combinedAdditionEClass, COMBINED_ADDITION__MSEPROPERTYADDITION);

		combinedAdditionSetterEClass = createEClass(COMBINED_ADDITION_SETTER);
		createEReference(combinedAdditionSetterEClass, COMBINED_ADDITION_SETTER__COMBINEDADDITIONS);
		createEReference(combinedAdditionSetterEClass, COMBINED_ADDITION_SETTER__ADDITION_SETTERS);

		additionSetterEClass = createEClass(ADDITION_SETTER);

		exclusiveSettableAdditionEClass = createEClass(EXCLUSIVE_SETTABLE_ADDITION);

		multipleSettableAdditionEClass = createEClass(MULTIPLE_SETTABLE_ADDITION);

		additionEnhanceableEntityEClass = createEClass(ADDITION_ENHANCEABLE_ENTITY);

		writableAdditionEClass = createEClass(WRITABLE_ADDITION);

		writableAdditionSetterEClass = createEClass(WRITABLE_ADDITION_SETTER);
		createEReference(writableAdditionSetterEClass, WRITABLE_ADDITION_SETTER__WRITABLEADDITION);
		createEAttribute(writableAdditionSetterEClass, WRITABLE_ADDITION_SETTER__VALUE_CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AdapterServicesPackage theAdapterServicesPackage = (AdapterServicesPackage)EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		ModularEnvironmentPackage theModularEnvironmentPackage = (ModularEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI);
		OperationModelPackage theOperationModelPackage = (OperationModelPackage)EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAdapterServicesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		managementServiceEClass.getESuperTypes().add(theBasicPackage.getEntity());
		managementServiceSupportEntityEClass.getESuperTypes().add(theBasicPackage.getEntity());
		managementServiceFunctionEClass.getESuperTypes().add(theOperationModelPackage.getOperation());
		managementServiceInterfaceEClass.getESuperTypes().add(theBasicPackage.getEntity());
		msePropertyAdditionContainerEClass.getESuperTypes().add(theBasicPackage.getEntity());
		additionValueEClass.getESuperTypes().add(theBasicPackage.getEntity());
		multipleSelectionAdditionSetterEClass.getESuperTypes().add(this.getAdditionSetter());
		exclusiveSelectionAdditionSetterEClass.getESuperTypes().add(this.getAdditionSetter());
		selectableAdditionEClass.getESuperTypes().add(this.getMSEPropertyAdditionContainer());
		combinedAdditionEClass.getESuperTypes().add(this.getMSEPropertyAdditionContainer());
		combinedAdditionSetterEClass.getESuperTypes().add(this.getAdditionSetter());
		exclusiveSettableAdditionEClass.getESuperTypes().add(this.getSelectableAddition());
		multipleSettableAdditionEClass.getESuperTypes().add(this.getSelectableAddition());
		additionEnhanceableEntityEClass.getESuperTypes().add(theBasicPackage.getEntity());
		writableAdditionEClass.getESuperTypes().add(this.getMSEPropertyAdditionContainer());
		writableAdditionSetterEClass.getESuperTypes().add(this.getAdditionSetter());

		// Initialize classes, features, and operations; add parameters
		initEClass(managementServiceEClass, ManagementService.class, "ManagementService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagementService_Managementservice(), this.getManagementService(), null, "managementservice", null, 0, -1, ManagementService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagementService_Msefacility(), theModularEnvironmentPackage.getCoordinator(), theModularEnvironmentPackage.getCoordinator_Managementservice(), "msefacility", null, 0, 1, ManagementService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagementService_Managementservicesupportentity(), this.getManagementServiceSupportEntity(), null, "managementservicesupportentity", null, 0, -1, ManagementService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagementService_Managementserviceinterface(), this.getManagementServiceInterface(), null, "managementserviceinterface", null, 0, 1, ManagementService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagementService_Msepropertyadditioncontainer(), this.getMSEPropertyAdditionContainer(), null, "msepropertyadditioncontainer", null, 0, -1, ManagementService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managementServiceSupportEntityEClass, ManagementServiceSupportEntity.class, "ManagementServiceSupportEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(managementServiceFunctionEClass, ManagementServiceFunction.class, "ManagementServiceFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagementServiceFunction_PrintableDescription(), ecorePackage.getEString(), "printableDescription", null, 0, 1, ManagementServiceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managementServiceInterfaceEClass, ManagementServiceInterface.class, "ManagementServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagementServiceInterface_Managementservicefunction(), this.getManagementServiceFunction(), null, "managementservicefunction", null, 0, -1, ManagementServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msePropertyAdditionContainerEClass, MSEPropertyAdditionContainer.class, "MSEPropertyAdditionContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMSEPropertyAdditionContainer_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, MSEPropertyAdditionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionValueEClass, additionValue.class, "additionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleSelectionAdditionSetterEClass, MultipleSelectionAdditionSetter.class, "MultipleSelectionAdditionSetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleSelectionAdditionSetter_Selectableadditionvalue(), this.getadditionValue(), null, "selectableadditionvalue", null, 0, -1, MultipleSelectionAdditionSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleSelectionAdditionSetter_Multiplesettableaddition(), this.getMultipleSettableAddition(), null, "multiplesettableaddition", null, 1, 1, MultipleSelectionAdditionSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusiveSelectionAdditionSetterEClass, ExclusiveSelectionAdditionSetter.class, "ExclusiveSelectionAdditionSetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExclusiveSelectionAdditionSetter_Selectableadditionvalue(), this.getadditionValue(), null, "selectableadditionvalue", null, 0, 1, ExclusiveSelectionAdditionSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExclusiveSelectionAdditionSetter_Exclusivesettableaddition(), this.getExclusiveSettableAddition(), null, "exclusivesettableaddition", null, 1, 1, ExclusiveSelectionAdditionSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectableAdditionEClass, SelectableAddition.class, "SelectableAddition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectableAddition_Additionvalue(), this.getadditionValue(), null, "additionvalue", null, 0, -1, SelectableAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinedAdditionEClass, CombinedAddition.class, "CombinedAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinedAddition_Msepropertyaddition(), this.getMSEPropertyAdditionContainer(), null, "msepropertyaddition", null, 0, -1, CombinedAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinedAdditionSetterEClass, CombinedAdditionSetter.class, "CombinedAdditionSetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinedAdditionSetter_Combinedadditions(), this.getCombinedAddition(), null, "combinedadditions", null, 1, 1, CombinedAdditionSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombinedAdditionSetter_AdditionSetters(), this.getAdditionSetter(), null, "additionSetters", null, 0, -1, CombinedAdditionSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionSetterEClass, AdditionSetter.class, "AdditionSetter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveSettableAdditionEClass, ExclusiveSettableAddition.class, "ExclusiveSettableAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleSettableAdditionEClass, MultipleSettableAddition.class, "MultipleSettableAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionEnhanceableEntityEClass, AdditionEnhanceableEntity.class, "AdditionEnhanceableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(writableAdditionEClass, WritableAddition.class, "WritableAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(writableAdditionSetterEClass, WritableAdditionSetter.class, "WritableAdditionSetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWritableAdditionSetter_Writableaddition(), this.getWritableAddition(), null, "writableaddition", null, 1, 1, WritableAdditionSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWritableAdditionSetter_ValueContent(), ecorePackage.getEString(), "valueContent", null, 0, 1, WritableAdditionSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ManagementServicesPackageImpl
