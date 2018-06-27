/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;

import aDL_Moddeling_Project.basic.BasicPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyFactory
 * @model kind="package"
 * @generated
 */
public interface ModularSimulationAssemblyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModularSimulationAssembly";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.Assembly";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModularSimulationAssembly";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularSimulationAssemblyPackage eINSTANCE = aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl <em>Simulation Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getSimulationAssembly()
	 * @generated
	 */
	int SIMULATION_ASSEMBLY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Basicmodsim Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__BASICMODSIM_ENTITY = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__CONNECTION = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfacerepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__INTERFACEREPOSITORY = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objectorientedstructuredadditioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generalsimulationfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>On Level Assembable Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES = BasicPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assembled Simulation Visible Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__ASSEMBLED_SIMULATION_VISIBLE_DATA = BasicPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Adaptationdefinitionrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY = BasicPackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Simulation Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Simulation Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ConnectorImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.generalSimulationFunctionImpl <em>general Simulation Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.generalSimulationFunctionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getgeneralSimulationFunction()
	 * @generated
	 */
	int GENERAL_SIMULATION_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION__ID = OperationModelPackage.OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION__NAME = OperationModelPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION__PRECONDITION = OperationModelPackage.OPERATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION__PARAMETERS = OperationModelPackage.OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Operationexecutioneffect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION__OPERATIONEXECUTIONEFFECT = OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION__POSTCONDITION = OperationModelPackage.OPERATION__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION__RETURN_TYPE = OperationModelPackage.OPERATION__RETURN_TYPE;

	/**
	 * The number of structural features of the '<em>general Simulation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION_FEATURE_COUNT = OperationModelPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>general Simulation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_SIMULATION_FUNCTION_OPERATION_COUNT = OperationModelPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.BasicModSimEntityImpl <em>Basic Mod Sim Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.BasicModSimEntityImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getBasicModSimEntity()
	 * @generated
	 */
	int BASIC_MOD_SIM_ENTITY = 3;

	/**
	 * The number of structural features of the '<em>Basic Mod Sim Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MOD_SIM_ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Basic Mod Sim Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_MOD_SIM_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssemblyImpl <em>Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssemblyImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getAssembly()
	 * @generated
	 */
	int ASSEMBLY = 4;

	/**
	 * The feature id for the '<em><b>Basicmodsim Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__BASICMODSIM_ENTITY = BASIC_MOD_SIM_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__CONNECTION = BASIC_MOD_SIM_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfacerepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__INTERFACEREPOSITORY = BASIC_MOD_SIM_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objectorientedstructuredadditioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE = BASIC_MOD_SIM_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_FEATURE_COUNT = BASIC_MOD_SIM_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_OPERATION_COUNT = BASIC_MOD_SIM_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyEntityImpl <em>Simulation Assembly Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyEntityImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getSimulationAssemblyEntity()
	 * @generated
	 */
	int SIMULATION_ASSEMBLY_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Usedgeneralsimulationfunction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfacemapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simmodule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY__SIMMODULE = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Additionenhancedinformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simulation Assembly Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Simulation Assembly Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssembableEntityImpl <em>Assembable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssembableEntityImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getAssembableEntity()
	 * @generated
	 */
	int ASSEMBABLE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBABLE_ENTITY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBABLE_ENTITY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Usedgeneralsimulationfunction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfacemapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBABLE_ENTITY__INTERFACEMAPPING = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBABLE_ENTITY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assembable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBABLE_ENTITY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.CombinedAssemblyEntityImpl <em>Combined Assembly Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.CombinedAssemblyEntityImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getCombinedAssemblyEntity()
	 * @generated
	 */
	int COMBINED_ASSEMBLY_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ASSEMBLY_ENTITY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ASSEMBLY_ENTITY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Usedgeneralsimulationfunction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfacemapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ASSEMBLY_ENTITY__INTERFACEMAPPING = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combined Assembly Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ASSEMBLY_ENTITY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Combined Assembly Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ASSEMBLY_ENTITY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AdapterDescriptionAttachmentImpl <em>Adapter Description Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.AdapterDescriptionAttachmentImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getAdapterDescriptionAttachment()
	 * @generated
	 */
	int ADAPTER_DESCRIPTION_ATTACHMENT = 8;

	/**
	 * The feature id for the '<em><b>Adaptationdescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Adaptationdefinitionrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Adapterservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Adaptationmarkermapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING = 3;

	/**
	 * The number of structural features of the '<em>Adapter Description Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DESCRIPTION_ATTACHMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Adapter Description Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DESCRIPTION_ATTACHMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.CoordinatorAssemblyEntityImpl <em>Coordinator Assembly Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.CoordinatorAssemblyEntityImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getCoordinatorAssemblyEntity()
	 * @generated
	 */
	int COORDINATOR_ASSEMBLY_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ASSEMBLY_ENTITY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ASSEMBLY_ENTITY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Usedgeneralsimulationfunction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfacemapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Adapterdescriptionattachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordinatorentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coordinator Assembly Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ASSEMBLY_ENTITY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Coordinator Assembly Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ASSEMBLY_ENTITY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly <em>Simulation Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Assembly</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly
	 * @generated
	 */
	EClass getSimulationAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getGeneralsimulationfunctions <em>Generalsimulationfunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalsimulationfunctions</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getGeneralsimulationfunctions()
	 * @see #getSimulationAssembly()
	 * @generated
	 */
	EReference getSimulationAssembly_Generalsimulationfunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getOnLevelAssembableEntities <em>On Level Assembable Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Level Assembable Entities</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getOnLevelAssembableEntities()
	 * @see #getSimulationAssembly()
	 * @generated
	 */
	EReference getSimulationAssembly_OnLevelAssembableEntities();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getAssembledSimulationVisibleData <em>Assembled Simulation Visible Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assembled Simulation Visible Data</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getAssembledSimulationVisibleData()
	 * @see #getSimulationAssembly()
	 * @generated
	 */
	EReference getSimulationAssembly_AssembledSimulationVisibleData();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getAdaptationdefinitionrepository <em>Adaptationdefinitionrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptationdefinitionrepository</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getAdaptationdefinitionrepository()
	 * @see #getSimulationAssembly()
	 * @generated
	 */
	EReference getSimulationAssembly_Adaptationdefinitionrepository();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction <em>general Simulation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>general Simulation Function</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction
	 * @generated
	 */
	EClass getgeneralSimulationFunction();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity <em>Basic Mod Sim Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Mod Sim Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity
	 * @generated
	 */
	EClass getBasicModSimEntity();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Assembly
	 * @generated
	 */
	EClass getAssembly();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getBasicmodsimEntity <em>Basicmodsim Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basicmodsim Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getBasicmodsimEntity()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_BasicmodsimEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getConnection()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_Connection();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getInterfacerepository <em>Interfacerepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interfacerepository</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getInterfacerepository()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_Interfacerepository();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getObjectorientedstructuredadditioninterface <em>Objectorientedstructuredadditioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objectorientedstructuredadditioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getObjectorientedstructuredadditioninterface()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_Objectorientedstructuredadditioninterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity <em>Simulation Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Assembly Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity
	 * @generated
	 */
	EClass getSimulationAssemblyEntity();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getSimmodule <em>Simmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simmodule</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getSimmodule()
	 * @see #getSimulationAssemblyEntity()
	 * @generated
	 */
	EReference getSimulationAssemblyEntity_Simmodule();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getAdditionenhancedinformation <em>Additionenhancedinformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionenhancedinformation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getAdditionenhancedinformation()
	 * @see #getSimulationAssemblyEntity()
	 * @generated
	 */
	EReference getSimulationAssemblyEntity_Additionenhancedinformation();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity <em>Assembable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembable Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity
	 * @generated
	 */
	EClass getAssembableEntity();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity#getUsedgeneralsimulationfunction <em>Usedgeneralsimulationfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usedgeneralsimulationfunction</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity#getUsedgeneralsimulationfunction()
	 * @see #getAssembableEntity()
	 * @generated
	 */
	EReference getAssembableEntity_Usedgeneralsimulationfunction();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity#getInterfacemapping <em>Interfacemapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacemapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity#getInterfacemapping()
	 * @see #getAssembableEntity()
	 * @generated
	 */
	EReference getAssembableEntity_Interfacemapping();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.CombinedAssemblyEntity <em>Combined Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Assembly Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.CombinedAssemblyEntity
	 * @generated
	 */
	EClass getCombinedAssemblyEntity();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment <em>Adapter Description Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Description Attachment</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment
	 * @generated
	 */
	EClass getAdapterDescriptionAttachment();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationdescription <em>Adaptationdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptationdescription</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationdescription()
	 * @see #getAdapterDescriptionAttachment()
	 * @generated
	 */
	EReference getAdapterDescriptionAttachment_Adaptationdescription();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationdefinitionrepository <em>Adaptationdefinitionrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptationdefinitionrepository</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationdefinitionrepository()
	 * @see #getAdapterDescriptionAttachment()
	 * @generated
	 */
	EReference getAdapterDescriptionAttachment_Adaptationdefinitionrepository();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdapterservice <em>Adapterservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adapterservice</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdapterservice()
	 * @see #getAdapterDescriptionAttachment()
	 * @generated
	 */
	EReference getAdapterDescriptionAttachment_Adapterservice();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationmarkermapping <em>Adaptationmarkermapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptationmarkermapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationmarkermapping()
	 * @see #getAdapterDescriptionAttachment()
	 * @generated
	 */
	EReference getAdapterDescriptionAttachment_Adaptationmarkermapping();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity <em>Coordinator Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinator Assembly Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity
	 * @generated
	 */
	EClass getCoordinatorAssemblyEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity#getAdapterdescriptionattachment <em>Adapterdescriptionattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adapterdescriptionattachment</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity#getAdapterdescriptionattachment()
	 * @see #getCoordinatorAssemblyEntity()
	 * @generated
	 */
	EReference getCoordinatorAssemblyEntity_Adapterdescriptionattachment();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity#getCoordinatorentity <em>Coordinatorentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinatorentity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity#getCoordinatorentity()
	 * @see #getCoordinatorAssemblyEntity()
	 * @generated
	 */
	EReference getCoordinatorAssemblyEntity_Coordinatorentity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModularSimulationAssemblyFactory getModularSimulationAssemblyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl <em>Simulation Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getSimulationAssembly()
		 * @generated
		 */
		EClass SIMULATION_ASSEMBLY = eINSTANCE.getSimulationAssembly();

		/**
		 * The meta object literal for the '<em><b>Generalsimulationfunctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS = eINSTANCE.getSimulationAssembly_Generalsimulationfunctions();

		/**
		 * The meta object literal for the '<em><b>On Level Assembable Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES = eINSTANCE.getSimulationAssembly_OnLevelAssembableEntities();

		/**
		 * The meta object literal for the '<em><b>Assembled Simulation Visible Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_ASSEMBLY__ASSEMBLED_SIMULATION_VISIBLE_DATA = eINSTANCE.getSimulationAssembly_AssembledSimulationVisibleData();

		/**
		 * The meta object literal for the '<em><b>Adaptationdefinitionrepository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY = eINSTANCE.getSimulationAssembly_Adaptationdefinitionrepository();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ConnectorImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.generalSimulationFunctionImpl <em>general Simulation Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.generalSimulationFunctionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getgeneralSimulationFunction()
		 * @generated
		 */
		EClass GENERAL_SIMULATION_FUNCTION = eINSTANCE.getgeneralSimulationFunction();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.BasicModSimEntityImpl <em>Basic Mod Sim Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.BasicModSimEntityImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getBasicModSimEntity()
		 * @generated
		 */
		EClass BASIC_MOD_SIM_ENTITY = eINSTANCE.getBasicModSimEntity();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssemblyImpl <em>Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssemblyImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getAssembly()
		 * @generated
		 */
		EClass ASSEMBLY = eINSTANCE.getAssembly();

		/**
		 * The meta object literal for the '<em><b>Basicmodsim Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__BASICMODSIM_ENTITY = eINSTANCE.getAssembly_BasicmodsimEntity();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__CONNECTION = eINSTANCE.getAssembly_Connection();

		/**
		 * The meta object literal for the '<em><b>Interfacerepository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__INTERFACEREPOSITORY = eINSTANCE.getAssembly_Interfacerepository();

		/**
		 * The meta object literal for the '<em><b>Objectorientedstructuredadditioninterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE = eINSTANCE.getAssembly_Objectorientedstructuredadditioninterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyEntityImpl <em>Simulation Assembly Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyEntityImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getSimulationAssemblyEntity()
		 * @generated
		 */
		EClass SIMULATION_ASSEMBLY_ENTITY = eINSTANCE.getSimulationAssemblyEntity();

		/**
		 * The meta object literal for the '<em><b>Simmodule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_ASSEMBLY_ENTITY__SIMMODULE = eINSTANCE.getSimulationAssemblyEntity_Simmodule();

		/**
		 * The meta object literal for the '<em><b>Additionenhancedinformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION = eINSTANCE.getSimulationAssemblyEntity_Additionenhancedinformation();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssembableEntityImpl <em>Assembable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssembableEntityImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getAssembableEntity()
		 * @generated
		 */
		EClass ASSEMBABLE_ENTITY = eINSTANCE.getAssembableEntity();

		/**
		 * The meta object literal for the '<em><b>Usedgeneralsimulationfunction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION = eINSTANCE.getAssembableEntity_Usedgeneralsimulationfunction();

		/**
		 * The meta object literal for the '<em><b>Interfacemapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBABLE_ENTITY__INTERFACEMAPPING = eINSTANCE.getAssembableEntity_Interfacemapping();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.CombinedAssemblyEntityImpl <em>Combined Assembly Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.CombinedAssemblyEntityImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getCombinedAssemblyEntity()
		 * @generated
		 */
		EClass COMBINED_ASSEMBLY_ENTITY = eINSTANCE.getCombinedAssemblyEntity();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AdapterDescriptionAttachmentImpl <em>Adapter Description Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.AdapterDescriptionAttachmentImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getAdapterDescriptionAttachment()
		 * @generated
		 */
		EClass ADAPTER_DESCRIPTION_ATTACHMENT = eINSTANCE.getAdapterDescriptionAttachment();

		/**
		 * The meta object literal for the '<em><b>Adaptationdescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION = eINSTANCE.getAdapterDescriptionAttachment_Adaptationdescription();

		/**
		 * The meta object literal for the '<em><b>Adaptationdefinitionrepository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY = eINSTANCE.getAdapterDescriptionAttachment_Adaptationdefinitionrepository();

		/**
		 * The meta object literal for the '<em><b>Adapterservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE = eINSTANCE.getAdapterDescriptionAttachment_Adapterservice();

		/**
		 * The meta object literal for the '<em><b>Adaptationmarkermapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING = eINSTANCE.getAdapterDescriptionAttachment_Adaptationmarkermapping();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.CoordinatorAssemblyEntityImpl <em>Coordinator Assembly Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.CoordinatorAssemblyEntityImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl#getCoordinatorAssemblyEntity()
		 * @generated
		 */
		EClass COORDINATOR_ASSEMBLY_ENTITY = eINSTANCE.getCoordinatorAssemblyEntity();

		/**
		 * The meta object literal for the '<em><b>Adapterdescriptionattachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT = eINSTANCE.getCoordinatorAssemblyEntity_Adapterdescriptionattachment();

		/**
		 * The meta object literal for the '<em><b>Coordinatorentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY = eINSTANCE.getCoordinatorAssemblyEntity_Coordinatorentity();

	}

} //ModularSimulationAssemblyPackage
