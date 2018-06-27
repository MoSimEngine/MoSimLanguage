/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.impl;

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

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl;

import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;

import aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl;

import aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage;

import aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.Assembly;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.CombinedAssemblyEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.Connector;
import aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyFactory;
import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly;
import aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.Unstructured_DataRepositoryPackageImpl;

import aDL_Moddeling_Project.basic.BasicPackage;

import aDL_Moddeling_Project.basic.impl.BasicPackageImpl;

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
public class ModularSimulationAssemblyPackageImpl extends EPackageImpl implements ModularSimulationAssemblyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationAssemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalSimulationFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicModSimEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationAssemblyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assembableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedAssemblyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterDescriptionAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatorAssemblyEntityEClass = null;

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
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModularSimulationAssemblyPackageImpl() {
		super(eNS_URI, ModularSimulationAssemblyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModularSimulationAssemblyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModularSimulationAssemblyPackage init() {
		if (isInited) return (ModularSimulationAssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI);

		// Obtain or create and register package
		ModularSimulationAssemblyPackageImpl theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModularSimulationAssemblyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModularSimulationAssemblyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModularEnvironmentPackageImpl theModularEnvironmentPackage = (ModularEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) instanceof ModularEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) : ModularEnvironmentPackage.eINSTANCE);
		ManagementServicesPackageImpl theManagementServicesPackage = (ManagementServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI) instanceof ManagementServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI) : ManagementServicesPackage.eINSTANCE);
		AdapterServicesPackageImpl theAdapterServicesPackage = (AdapterServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI) instanceof AdapterServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI) : AdapterServicesPackage.eINSTANCE);
		ModularSimulationPackageImpl theModularSimulationPackage = (ModularSimulationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) instanceof ModularSimulationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) : ModularSimulationPackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);
		DataRepresentationPackageImpl theDataRepresentationPackage = (DataRepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) instanceof DataRepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) : DataRepresentationPackage.eINSTANCE);
		OperationModelPackageImpl theOperationModelPackage = (OperationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) instanceof OperationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) : OperationModelPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		DataSpecificationPackageImpl theDataSpecificationPackage = (DataSpecificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) instanceof DataSpecificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) : DataSpecificationPackage.eINSTANCE);
		AssemblyConnectionsPackageImpl theAssemblyConnectionsPackage = (AssemblyConnectionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) instanceof AssemblyConnectionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) : AssemblyConnectionsPackage.eINSTANCE);
		AssemblyAdditionEnhancementPackageImpl theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) instanceof AssemblyAdditionEnhancementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) : AssemblyAdditionEnhancementPackage.eINSTANCE);
		AssemblyInterfacePackageImpl theAssemblyInterfacePackage = (AssemblyInterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) instanceof AssemblyInterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) : AssemblyInterfacePackage.eINSTANCE);
		Unstructured_DataRepositoryPackageImpl theUnstructured_DataRepositoryPackage = (Unstructured_DataRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) instanceof Unstructured_DataRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) : Unstructured_DataRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theModularSimulationAssemblyPackage.createPackageContents();
		theModularEnvironmentPackage.createPackageContents();
		theManagementServicesPackage.createPackageContents();
		theAdapterServicesPackage.createPackageContents();
		theModularSimulationPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theDataRepresentationPackage.createPackageContents();
		theOperationModelPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theDataSpecificationPackage.createPackageContents();
		theAssemblyConnectionsPackage.createPackageContents();
		theAssemblyAdditionEnhancementPackage.createPackageContents();
		theAssemblyInterfacePackage.createPackageContents();
		theUnstructured_DataRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theModularSimulationAssemblyPackage.initializePackageContents();
		theModularEnvironmentPackage.initializePackageContents();
		theManagementServicesPackage.initializePackageContents();
		theAdapterServicesPackage.initializePackageContents();
		theModularSimulationPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theDataRepresentationPackage.initializePackageContents();
		theOperationModelPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theDataSpecificationPackage.initializePackageContents();
		theAssemblyConnectionsPackage.initializePackageContents();
		theAssemblyAdditionEnhancementPackage.initializePackageContents();
		theAssemblyInterfacePackage.initializePackageContents();
		theUnstructured_DataRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModularSimulationAssemblyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModularSimulationAssemblyPackage.eNS_URI, theModularSimulationAssemblyPackage);
		return theModularSimulationAssemblyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationAssembly() {
		return simulationAssemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationAssembly_Generalsimulationfunctions() {
		return (EReference)simulationAssemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationAssembly_OnLevelAssembableEntities() {
		return (EReference)simulationAssemblyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationAssembly_AssembledSimulationVisibleData() {
		return (EReference)simulationAssemblyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationAssembly_Adaptationdefinitionrepository() {
		return (EReference)simulationAssemblyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgeneralSimulationFunction() {
		return generalSimulationFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicModSimEntity() {
		return basicModSimEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssembly() {
		return assemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_BasicmodsimEntity() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_Connection() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_Interfacerepository() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembly_Objectorientedstructuredadditioninterface() {
		return (EReference)assemblyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationAssemblyEntity() {
		return simulationAssemblyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationAssemblyEntity_Simmodule() {
		return (EReference)simulationAssemblyEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationAssemblyEntity_Additionenhancedinformation() {
		return (EReference)simulationAssemblyEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssembableEntity() {
		return assembableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembableEntity_Usedgeneralsimulationfunction() {
		return (EReference)assembableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembableEntity_Interfacemapping() {
		return (EReference)assembableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedAssemblyEntity() {
		return combinedAssemblyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapterDescriptionAttachment() {
		return adapterDescriptionAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdapterDescriptionAttachment_Adaptationdescription() {
		return (EReference)adapterDescriptionAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdapterDescriptionAttachment_Adaptationdefinitionrepository() {
		return (EReference)adapterDescriptionAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdapterDescriptionAttachment_Adapterservice() {
		return (EReference)adapterDescriptionAttachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdapterDescriptionAttachment_Adaptationmarkermapping() {
		return (EReference)adapterDescriptionAttachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatorAssemblyEntity() {
		return coordinatorAssemblyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinatorAssemblyEntity_Adapterdescriptionattachment() {
		return (EReference)coordinatorAssemblyEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinatorAssemblyEntity_Coordinatorentity() {
		return (EReference)coordinatorAssemblyEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularSimulationAssemblyFactory getModularSimulationAssemblyFactory() {
		return (ModularSimulationAssemblyFactory)getEFactoryInstance();
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
		simulationAssemblyEClass = createEClass(SIMULATION_ASSEMBLY);
		createEReference(simulationAssemblyEClass, SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS);
		createEReference(simulationAssemblyEClass, SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES);
		createEReference(simulationAssemblyEClass, SIMULATION_ASSEMBLY__ASSEMBLED_SIMULATION_VISIBLE_DATA);
		createEReference(simulationAssemblyEClass, SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY);

		connectorEClass = createEClass(CONNECTOR);

		generalSimulationFunctionEClass = createEClass(GENERAL_SIMULATION_FUNCTION);

		basicModSimEntityEClass = createEClass(BASIC_MOD_SIM_ENTITY);

		assemblyEClass = createEClass(ASSEMBLY);
		createEReference(assemblyEClass, ASSEMBLY__BASICMODSIM_ENTITY);
		createEReference(assemblyEClass, ASSEMBLY__CONNECTION);
		createEReference(assemblyEClass, ASSEMBLY__INTERFACEREPOSITORY);
		createEReference(assemblyEClass, ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE);

		simulationAssemblyEntityEClass = createEClass(SIMULATION_ASSEMBLY_ENTITY);
		createEReference(simulationAssemblyEntityEClass, SIMULATION_ASSEMBLY_ENTITY__SIMMODULE);
		createEReference(simulationAssemblyEntityEClass, SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION);

		assembableEntityEClass = createEClass(ASSEMBABLE_ENTITY);
		createEReference(assembableEntityEClass, ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION);
		createEReference(assembableEntityEClass, ASSEMBABLE_ENTITY__INTERFACEMAPPING);

		combinedAssemblyEntityEClass = createEClass(COMBINED_ASSEMBLY_ENTITY);

		adapterDescriptionAttachmentEClass = createEClass(ADAPTER_DESCRIPTION_ATTACHMENT);
		createEReference(adapterDescriptionAttachmentEClass, ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION);
		createEReference(adapterDescriptionAttachmentEClass, ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY);
		createEReference(adapterDescriptionAttachmentEClass, ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE);
		createEReference(adapterDescriptionAttachmentEClass, ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING);

		coordinatorAssemblyEntityEClass = createEClass(COORDINATOR_ASSEMBLY_ENTITY);
		createEReference(coordinatorAssemblyEntityEClass, COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT);
		createEReference(coordinatorAssemblyEntityEClass, COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY);
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
		AssemblyConnectionsPackage theAssemblyConnectionsPackage = (AssemblyConnectionsPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI);
		AssemblyAdditionEnhancementPackage theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI);
		AssemblyInterfacePackage theAssemblyInterfacePackage = (AssemblyInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		AdapterServicesPackage theAdapterServicesPackage = (AdapterServicesPackage)EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI);
		OperationModelPackage theOperationModelPackage = (OperationModelPackage)EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI);
		ModularEnvironmentPackage theModularEnvironmentPackage = (ModularEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI);
		ModularSimulationPackage theModularSimulationPackage = (ModularSimulationPackage)EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAssemblyConnectionsPackage);
		getESubpackages().add(theAssemblyAdditionEnhancementPackage);
		getESubpackages().add(theAssemblyInterfacePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simulationAssemblyEClass.getESuperTypes().add(theBasicPackage.getEntity());
		simulationAssemblyEClass.getESuperTypes().add(this.getAssembly());
		connectorEClass.getESuperTypes().add(theBasicPackage.getEntity());
		generalSimulationFunctionEClass.getESuperTypes().add(theOperationModelPackage.getOperation());
		assemblyEClass.getESuperTypes().add(this.getBasicModSimEntity());
		simulationAssemblyEntityEClass.getESuperTypes().add(theBasicPackage.getEntity());
		simulationAssemblyEntityEClass.getESuperTypes().add(this.getAssembableEntity());
		assembableEntityEClass.getESuperTypes().add(theBasicPackage.getEntity());
		combinedAssemblyEntityEClass.getESuperTypes().add(theBasicPackage.getEntity());
		combinedAssemblyEntityEClass.getESuperTypes().add(this.getAssembableEntity());
		coordinatorAssemblyEntityEClass.getESuperTypes().add(theBasicPackage.getEntity());
		coordinatorAssemblyEntityEClass.getESuperTypes().add(this.getAssembableEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(simulationAssemblyEClass, SimulationAssembly.class, "SimulationAssembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulationAssembly_Generalsimulationfunctions(), this.getgeneralSimulationFunction(), null, "generalsimulationfunctions", null, 0, -1, SimulationAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationAssembly_OnLevelAssembableEntities(), this.getAssembableEntity(), null, "onLevelAssembableEntities", null, 0, -1, SimulationAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationAssembly_AssembledSimulationVisibleData(), theAssemblyAdditionEnhancementPackage.getAdditionEnhanced(), null, "assembledSimulationVisibleData", null, 0, -1, SimulationAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationAssembly_Adaptationdefinitionrepository(), theAdapterServicesPackage.getAdaptationDefinitionRepository(), null, "adaptationdefinitionrepository", null, 0, 1, SimulationAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalSimulationFunctionEClass, generalSimulationFunction.class, "generalSimulationFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicModSimEntityEClass, BasicModSimEntity.class, "BasicModSimEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assemblyEClass, Assembly.class, "Assembly", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssembly_BasicmodsimEntity(), this.getBasicModSimEntity(), null, "basicmodsimEntity", null, 0, -1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_Connection(), theAssemblyConnectionsPackage.getConnection(), theAssemblyConnectionsPackage.getConnection_Assembly(), "connection", null, 0, -1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_Interfacerepository(), theAssemblyInterfacePackage.getInterfaceRepository(), null, "interfacerepository", null, 0, 1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembly_Objectorientedstructuredadditioninterface(), theModularEnvironmentPackage.getObjectOrientedStructuredAdditionInterface(), null, "objectorientedstructuredadditioninterface", null, 0, 1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationAssemblyEntityEClass, SimulationAssemblyEntity.class, "SimulationAssemblyEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulationAssemblyEntity_Simmodule(), theModularSimulationPackage.getSimModule(), theModularSimulationPackage.getSimModule_Basesimulationassemblyentity(), "simmodule", null, 1, 1, SimulationAssemblyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationAssemblyEntity_Additionenhancedinformation(), theAssemblyAdditionEnhancementPackage.getAdditionEnhancedInformation(), null, "additionenhancedinformation", null, 0, -1, SimulationAssemblyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assembableEntityEClass, AssembableEntity.class, "AssembableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssembableEntity_Usedgeneralsimulationfunction(), this.getgeneralSimulationFunction(), null, "usedgeneralsimulationfunction", null, 0, -1, AssembableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembableEntity_Interfacemapping(), theAssemblyInterfacePackage.getInterfaceMapping(), theAssemblyInterfacePackage.getInterfaceMapping_Assembableentity(), "interfacemapping", null, 0, -1, AssembableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinedAssemblyEntityEClass, CombinedAssemblyEntity.class, "CombinedAssemblyEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adapterDescriptionAttachmentEClass, AdapterDescriptionAttachment.class, "AdapterDescriptionAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdapterDescriptionAttachment_Adaptationdescription(), theAdapterServicesPackage.getAdaptationDescription(), null, "adaptationdescription", null, 1, 1, AdapterDescriptionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapterDescriptionAttachment_Adaptationdefinitionrepository(), theAdapterServicesPackage.getAdaptationDefinitionRepository(), null, "adaptationdefinitionrepository", null, 1, 1, AdapterDescriptionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapterDescriptionAttachment_Adapterservice(), theAdapterServicesPackage.getAdapterService(), theAdapterServicesPackage.getAdapterService_Adapterdescriptionattachment(), "adapterservice", null, 1, 1, AdapterDescriptionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapterDescriptionAttachment_Adaptationmarkermapping(), theAdapterServicesPackage.getAdaptationMarkerMapping(), null, "adaptationmarkermapping", null, 0, -1, AdapterDescriptionAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinatorAssemblyEntityEClass, CoordinatorAssemblyEntity.class, "CoordinatorAssemblyEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinatorAssemblyEntity_Adapterdescriptionattachment(), this.getAdapterDescriptionAttachment(), null, "adapterdescriptionattachment", null, 0, -1, CoordinatorAssemblyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinatorAssemblyEntity_Coordinatorentity(), theModularEnvironmentPackage.getCoordinatorEntity(), null, "coordinatorentity", null, 1, 1, CoordinatorAssemblyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModularSimulationAssemblyPackageImpl
