/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

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

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsFactory;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.InterfaceProvidedRequiredConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationInvolvedConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping;

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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyConnectionsPackageImpl extends EPackageImpl implements AssemblyConnectionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedAssembly_CoodinatorConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mwAssembly_CoordinatorConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulation_CoordinatorConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationAssemblyEntity_CoordinatorConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedRequiredConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mwCoordinator_CoordinatorConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterWorkerConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationInvolvedConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatorFunctionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredDataMappingConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectOrientedViewRequiredDataMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredViewRequiredDataMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceProvidedRequiredConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionMappingModusEEnum = null;

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
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssemblyConnectionsPackageImpl() {
		super(eNS_URI, AssemblyConnectionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssemblyConnectionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssemblyConnectionsPackage init() {
		if (isInited) return (AssemblyConnectionsPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI);

		// Obtain or create and register package
		AssemblyConnectionsPackageImpl theAssemblyConnectionsPackage = (AssemblyConnectionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssemblyConnectionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssemblyConnectionsPackageImpl());

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
		ModularSimulationAssemblyPackageImpl theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) instanceof ModularSimulationAssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) : ModularSimulationAssemblyPackage.eINSTANCE);
		AssemblyAdditionEnhancementPackageImpl theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) instanceof AssemblyAdditionEnhancementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) : AssemblyAdditionEnhancementPackage.eINSTANCE);
		AssemblyInterfacePackageImpl theAssemblyInterfacePackage = (AssemblyInterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) instanceof AssemblyInterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) : AssemblyInterfacePackage.eINSTANCE);
		Unstructured_DataRepositoryPackageImpl theUnstructured_DataRepositoryPackage = (Unstructured_DataRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) instanceof Unstructured_DataRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) : Unstructured_DataRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theAssemblyConnectionsPackage.createPackageContents();
		theModularEnvironmentPackage.createPackageContents();
		theManagementServicesPackage.createPackageContents();
		theAdapterServicesPackage.createPackageContents();
		theModularSimulationPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theDataRepresentationPackage.createPackageContents();
		theOperationModelPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theDataSpecificationPackage.createPackageContents();
		theModularSimulationAssemblyPackage.createPackageContents();
		theAssemblyAdditionEnhancementPackage.createPackageContents();
		theAssemblyInterfacePackage.createPackageContents();
		theUnstructured_DataRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theAssemblyConnectionsPackage.initializePackageContents();
		theModularEnvironmentPackage.initializePackageContents();
		theManagementServicesPackage.initializePackageContents();
		theAdapterServicesPackage.initializePackageContents();
		theModularSimulationPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theDataRepresentationPackage.initializePackageContents();
		theOperationModelPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theDataSpecificationPackage.initializePackageContents();
		theModularSimulationAssemblyPackage.initializePackageContents();
		theAssemblyAdditionEnhancementPackage.initializePackageContents();
		theAssemblyInterfacePackage.initializePackageContents();
		theUnstructured_DataRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssemblyConnectionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssemblyConnectionsPackage.eNS_URI, theAssemblyConnectionsPackage);
		return theAssemblyConnectionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedAssembly_CoodinatorConnection() {
		return composedAssembly_CoodinatorConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedAssembly_CoodinatorConnection_Composedassemblyentity() {
		return (EReference)composedAssembly_CoodinatorConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedAssembly_CoodinatorConnection_WorkerAssembledSimulationCoordinator() {
		return (EReference)composedAssembly_CoodinatorConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMWAssembly_CoordinatorConnection() {
		return mwAssembly_CoordinatorConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMWAssembly_CoordinatorConnection_WorkerAssembledSimulation() {
		return (EReference)mwAssembly_CoordinatorConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulation_CoordinatorConnection() {
		return simulation_CoordinatorConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_CoordinatorConnection_CoordinatorAssemblyEntity() {
		return (EReference)simulation_CoordinatorConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationAssemblyEntity_CoordinatorConnection() {
		return simulationAssemblyEntity_CoordinatorConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationAssemblyEntity_CoordinatorConnection_Simulation() {
		return (EReference)simulationAssemblyEntity_CoordinatorConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedRequiredConnection() {
		return providedRequiredConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedRequiredConnection_Requireddatamappingconnection() {
		return (EReference)providedRequiredConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMWCoordinator_CoordinatorConnection() {
		return mwCoordinator_CoordinatorConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMWCoordinator_CoordinatorConnection_Worker() {
		return (EReference)mwCoordinator_CoordinatorConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Assembly() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterWorkerConnection() {
		return masterWorkerConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterWorkerConnection_Master() {
		return (EReference)masterWorkerConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterWorkerConnection_Coordinatorfunctionmapping() {
		return (EReference)masterWorkerConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationInvolvedConnection() {
		return simulationInvolvedConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatorFunctionMapping() {
		return coordinatorFunctionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinatorFunctionMapping_MasterServiceFunction() {
		return (EReference)coordinatorFunctionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinatorFunctionMapping_WorkerServiceFunction() {
		return (EReference)coordinatorFunctionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatorFunctionMapping_FunctionMappingModus() {
		return (EAttribute)coordinatorFunctionMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredDataMappingConnection() {
		return requiredDataMappingConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredDataMappingConnection_Providedrequiredconnection() {
		return (EReference)requiredDataMappingConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOrientedViewRequiredDataMapping() {
		return objectOrientedViewRequiredDataMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOrientedViewRequiredDataMapping_Requieringinterfaceobjectclassmapping() {
		return (EReference)objectOrientedViewRequiredDataMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOrientedViewRequiredDataMapping_Providinginterfaceobjectclassmapping() {
		return (EReference)objectOrientedViewRequiredDataMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredViewRequiredDataMapping() {
		return unstructuredViewRequiredDataMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnstructuredViewRequiredDataMapping_Mappabledata() {
		return (EReference)unstructuredViewRequiredDataMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceProvidedRequiredConnection() {
		return interfaceProvidedRequiredConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionMappingModus() {
		return functionMappingModusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectionsFactory getAssemblyConnectionsFactory() {
		return (AssemblyConnectionsFactory)getEFactoryInstance();
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
		composedAssembly_CoodinatorConnectionEClass = createEClass(COMPOSED_ASSEMBLY_COODINATOR_CONNECTION);
		createEReference(composedAssembly_CoodinatorConnectionEClass, COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY);
		createEReference(composedAssembly_CoodinatorConnectionEClass, COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR);

		mwAssembly_CoordinatorConnectionEClass = createEClass(MW_ASSEMBLY_COORDINATOR_CONNECTION);
		createEReference(mwAssembly_CoordinatorConnectionEClass, MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION);

		simulation_CoordinatorConnectionEClass = createEClass(SIMULATION_COORDINATOR_CONNECTION);
		createEReference(simulation_CoordinatorConnectionEClass, SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY);

		simulationAssemblyEntity_CoordinatorConnectionEClass = createEClass(SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION);
		createEReference(simulationAssemblyEntity_CoordinatorConnectionEClass, SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION);

		providedRequiredConnectionEClass = createEClass(PROVIDED_REQUIRED_CONNECTION);
		createEReference(providedRequiredConnectionEClass, PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION);

		mwCoordinator_CoordinatorConnectionEClass = createEClass(MW_COORDINATOR_COORDINATOR_CONNECTION);
		createEReference(mwCoordinator_CoordinatorConnectionEClass, MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__ASSEMBLY);

		masterWorkerConnectionEClass = createEClass(MASTER_WORKER_CONNECTION);
		createEReference(masterWorkerConnectionEClass, MASTER_WORKER_CONNECTION__MASTER);
		createEReference(masterWorkerConnectionEClass, MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING);

		simulationInvolvedConnectionEClass = createEClass(SIMULATION_INVOLVED_CONNECTION);

		coordinatorFunctionMappingEClass = createEClass(COORDINATOR_FUNCTION_MAPPING);
		createEReference(coordinatorFunctionMappingEClass, COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION);
		createEReference(coordinatorFunctionMappingEClass, COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION);
		createEAttribute(coordinatorFunctionMappingEClass, COORDINATOR_FUNCTION_MAPPING__FUNCTION_MAPPING_MODUS);

		requiredDataMappingConnectionEClass = createEClass(REQUIRED_DATA_MAPPING_CONNECTION);
		createEReference(requiredDataMappingConnectionEClass, REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION);

		objectOrientedViewRequiredDataMappingEClass = createEClass(OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING);
		createEReference(objectOrientedViewRequiredDataMappingEClass, OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING);
		createEReference(objectOrientedViewRequiredDataMappingEClass, OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING);

		unstructuredViewRequiredDataMappingEClass = createEClass(UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING);
		createEReference(unstructuredViewRequiredDataMappingEClass, UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA);

		interfaceProvidedRequiredConnectionEClass = createEClass(INTERFACE_PROVIDED_REQUIRED_CONNECTION);

		// Create enums
		functionMappingModusEEnum = createEEnum(FUNCTION_MAPPING_MODUS);
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
		ModularSimulationAssemblyPackage theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI);
		ModularEnvironmentPackage theModularEnvironmentPackage = (ModularEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		ManagementServicesPackage theManagementServicesPackage = (ManagementServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI);
		AssemblyInterfacePackage theAssemblyInterfacePackage = (AssemblyInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI);
		AssemblyAdditionEnhancementPackage theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		composedAssembly_CoodinatorConnectionEClass.getESuperTypes().add(this.getSimulation_CoordinatorConnection());
		composedAssembly_CoodinatorConnectionEClass.getESuperTypes().add(this.getMWAssembly_CoordinatorConnection());
		mwAssembly_CoordinatorConnectionEClass.getESuperTypes().add(this.getMasterWorkerConnection());
		simulation_CoordinatorConnectionEClass.getESuperTypes().add(this.getSimulationInvolvedConnection());
		simulationAssemblyEntity_CoordinatorConnectionEClass.getESuperTypes().add(this.getSimulation_CoordinatorConnection());
		providedRequiredConnectionEClass.getESuperTypes().add(this.getInterfaceProvidedRequiredConnection());
		mwCoordinator_CoordinatorConnectionEClass.getESuperTypes().add(this.getMasterWorkerConnection());
		connectionEClass.getESuperTypes().add(theBasicPackage.getEntity());
		masterWorkerConnectionEClass.getESuperTypes().add(this.getConnection());
		simulationInvolvedConnectionEClass.getESuperTypes().add(this.getConnection());
		simulationInvolvedConnectionEClass.getESuperTypes().add(this.getProvidedRequiredConnection());
		requiredDataMappingConnectionEClass.getESuperTypes().add(theBasicPackage.getIdentifier());
		objectOrientedViewRequiredDataMappingEClass.getESuperTypes().add(this.getRequiredDataMappingConnection());
		unstructuredViewRequiredDataMappingEClass.getESuperTypes().add(this.getRequiredDataMappingConnection());

		// Initialize classes, features, and operations; add parameters
		initEClass(composedAssembly_CoodinatorConnectionEClass, ComposedAssembly_CoodinatorConnection.class, "ComposedAssembly_CoodinatorConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedAssembly_CoodinatorConnection_Composedassemblyentity(), theModularSimulationAssemblyPackage.getCombinedAssemblyEntity(), null, "composedassemblyentity", null, 1, 1, ComposedAssembly_CoodinatorConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedAssembly_CoodinatorConnection_WorkerAssembledSimulationCoordinator(), theModularSimulationAssemblyPackage.getCoordinatorAssemblyEntity(), null, "workerAssembledSimulationCoordinator", null, 0, 1, ComposedAssembly_CoodinatorConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mwAssembly_CoordinatorConnectionEClass, MWAssembly_CoordinatorConnection.class, "MWAssembly_CoordinatorConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMWAssembly_CoordinatorConnection_WorkerAssembledSimulation(), theModularSimulationAssemblyPackage.getAssembly(), null, "workerAssembledSimulation", null, 1, 1, MWAssembly_CoordinatorConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulation_CoordinatorConnectionEClass, Simulation_CoordinatorConnection.class, "Simulation_CoordinatorConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulation_CoordinatorConnection_CoordinatorAssemblyEntity(), theModularSimulationAssemblyPackage.getCoordinatorAssemblyEntity(), null, "CoordinatorAssemblyEntity", null, 1, 1, Simulation_CoordinatorConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationAssemblyEntity_CoordinatorConnectionEClass, SimulationAssemblyEntity_CoordinatorConnection.class, "SimulationAssemblyEntity_CoordinatorConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulationAssemblyEntity_CoordinatorConnection_Simulation(), theModularSimulationAssemblyPackage.getSimulationAssemblyEntity(), null, "Simulation", null, 1, 1, SimulationAssemblyEntity_CoordinatorConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedRequiredConnectionEClass, ProvidedRequiredConnection.class, "ProvidedRequiredConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedRequiredConnection_Requireddatamappingconnection(), this.getRequiredDataMappingConnection(), this.getRequiredDataMappingConnection_Providedrequiredconnection(), "requireddatamappingconnection", null, 0, -1, ProvidedRequiredConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mwCoordinator_CoordinatorConnectionEClass, MWCoordinator_CoordinatorConnection.class, "MWCoordinator_CoordinatorConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMWCoordinator_CoordinatorConnection_Worker(), theModularEnvironmentPackage.getCoordinator(), null, "worker", null, 1, 1, MWCoordinator_CoordinatorConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Assembly(), theModularSimulationAssemblyPackage.getAssembly(), theModularSimulationAssemblyPackage.getAssembly_Connection(), "assembly", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterWorkerConnectionEClass, MasterWorkerConnection.class, "MasterWorkerConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterWorkerConnection_Master(), theModularSimulationAssemblyPackage.getCoordinatorAssemblyEntity(), null, "master", null, 1, 1, MasterWorkerConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterWorkerConnection_Coordinatorfunctionmapping(), this.getCoordinatorFunctionMapping(), null, "coordinatorfunctionmapping", null, 0, -1, MasterWorkerConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationInvolvedConnectionEClass, SimulationInvolvedConnection.class, "SimulationInvolvedConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinatorFunctionMappingEClass, CoordinatorFunctionMapping.class, "CoordinatorFunctionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinatorFunctionMapping_MasterServiceFunction(), theManagementServicesPackage.getManagementServiceFunction(), null, "masterServiceFunction", null, 1, 1, CoordinatorFunctionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinatorFunctionMapping_WorkerServiceFunction(), theManagementServicesPackage.getManagementServiceFunction(), null, "workerServiceFunction", null, 1, 1, CoordinatorFunctionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinatorFunctionMapping_FunctionMappingModus(), this.getFunctionMappingModus(), "functionMappingModus", null, 1, 1, CoordinatorFunctionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredDataMappingConnectionEClass, RequiredDataMappingConnection.class, "RequiredDataMappingConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredDataMappingConnection_Providedrequiredconnection(), this.getProvidedRequiredConnection(), this.getProvidedRequiredConnection_Requireddatamappingconnection(), "providedrequiredconnection", null, 1, 1, RequiredDataMappingConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectOrientedViewRequiredDataMappingEClass, ObjectOrientedViewRequiredDataMapping.class, "ObjectOrientedViewRequiredDataMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectOrientedViewRequiredDataMapping_Requieringinterfaceobjectclassmapping(), theAssemblyInterfacePackage.getRequieringInterfaceObjectClassMapping(), null, "requieringinterfaceobjectclassmapping", null, 1, 1, ObjectOrientedViewRequiredDataMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectOrientedViewRequiredDataMapping_Providinginterfaceobjectclassmapping(), theAssemblyInterfacePackage.getProvidingInterfaceObjectClassMapping(), null, "providinginterfaceobjectclassmapping", null, 1, 1, ObjectOrientedViewRequiredDataMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unstructuredViewRequiredDataMappingEClass, UnstructuredViewRequiredDataMapping.class, "UnstructuredViewRequiredDataMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnstructuredViewRequiredDataMapping_Mappabledata(), theAssemblyAdditionEnhancementPackage.getMappableData(), null, "mappabledata", null, 1, 1, UnstructuredViewRequiredDataMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceProvidedRequiredConnectionEClass, InterfaceProvidedRequiredConnection.class, "InterfaceProvidedRequiredConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(functionMappingModusEEnum, FunctionMappingModus.class, "FunctionMappingModus");
		addEEnumLiteral(functionMappingModusEEnum, FunctionMappingModus.PASS_THROUGH);
	}

} //AssemblyConnectionsPackageImpl
