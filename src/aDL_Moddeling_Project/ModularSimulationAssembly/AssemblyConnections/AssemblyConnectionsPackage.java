/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.basic.BasicPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsFactory
 * @model kind="package"
 * @generated
 */
public interface AssemblyConnectionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AssemblyConnections";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.Assembly.AssemblyConnections";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AssemblyConnections";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyConnectionsPackage eINSTANCE = aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ASSEMBLY = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationInvolvedConnectionImpl <em>Simulation Involved Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationInvolvedConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getSimulationInvolvedConnection()
	 * @generated
	 */
	int SIMULATION_INVOLVED_CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INVOLVED_CONNECTION__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INVOLVED_CONNECTION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INVOLVED_CONNECTION__ASSEMBLY = CONNECTION__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Requireddatamappingconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simulation Involved Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INVOLVED_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simulation Involved Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_INVOLVED_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.Simulation_CoordinatorConnectionImpl <em>Simulation Coordinator Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.Simulation_CoordinatorConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getSimulation_CoordinatorConnection()
	 * @generated
	 */
	int SIMULATION_COORDINATOR_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_COORDINATOR_CONNECTION__ID = SIMULATION_INVOLVED_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_COORDINATOR_CONNECTION__NAME = SIMULATION_INVOLVED_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_COORDINATOR_CONNECTION__ASSEMBLY = SIMULATION_INVOLVED_CONNECTION__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Requireddatamappingconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_COORDINATOR_CONNECTION__REQUIREDDATAMAPPINGCONNECTION = SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION;

	/**
	 * The feature id for the '<em><b>Coordinator Assembly Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY = SIMULATION_INVOLVED_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simulation Coordinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT = SIMULATION_INVOLVED_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simulation Coordinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_COORDINATOR_CONNECTION_OPERATION_COUNT = SIMULATION_INVOLVED_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl <em>Composed Assembly Coodinator Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getComposedAssembly_CoodinatorConnection()
	 * @generated
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__ID = SIMULATION_COORDINATOR_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__NAME = SIMULATION_COORDINATOR_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__ASSEMBLY = SIMULATION_COORDINATOR_CONNECTION__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Requireddatamappingconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__REQUIREDDATAMAPPINGCONNECTION = SIMULATION_COORDINATOR_CONNECTION__REQUIREDDATAMAPPINGCONNECTION;

	/**
	 * The feature id for the '<em><b>Coordinator Assembly Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY = SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER = SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordinatorfunctionmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING = SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Worker Assembled Simulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION = SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Composedassemblyentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY = SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Worker Assembled Simulation Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR = SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Composed Assembly Coodinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION_FEATURE_COUNT = SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Composed Assembly Coodinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ASSEMBLY_COODINATOR_CONNECTION_OPERATION_COUNT = SIMULATION_COORDINATOR_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MasterWorkerConnectionImpl <em>Master Worker Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MasterWorkerConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getMasterWorkerConnection()
	 * @generated
	 */
	int MASTER_WORKER_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_WORKER_CONNECTION__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_WORKER_CONNECTION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_WORKER_CONNECTION__ASSEMBLY = CONNECTION__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_WORKER_CONNECTION__MASTER = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordinatorfunctionmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Master Worker Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_WORKER_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Master Worker Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_WORKER_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWAssembly_CoordinatorConnectionImpl <em>MW Assembly Coordinator Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWAssembly_CoordinatorConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getMWAssembly_CoordinatorConnection()
	 * @generated
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION__ID = MASTER_WORKER_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION__NAME = MASTER_WORKER_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION__ASSEMBLY = MASTER_WORKER_CONNECTION__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION__MASTER = MASTER_WORKER_CONNECTION__MASTER;

	/**
	 * The feature id for the '<em><b>Coordinatorfunctionmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING = MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING;

	/**
	 * The feature id for the '<em><b>Worker Assembled Simulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION = MASTER_WORKER_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MW Assembly Coordinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION_FEATURE_COUNT = MASTER_WORKER_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MW Assembly Coordinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ASSEMBLY_COORDINATOR_CONNECTION_OPERATION_COUNT = MASTER_WORKER_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationAssemblyEntity_CoordinatorConnectionImpl <em>Simulation Assembly Entity Coordinator Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationAssemblyEntity_CoordinatorConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getSimulationAssemblyEntity_CoordinatorConnection()
	 * @generated
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__ID = SIMULATION_COORDINATOR_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__NAME = SIMULATION_COORDINATOR_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__ASSEMBLY = SIMULATION_COORDINATOR_CONNECTION__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Requireddatamappingconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__REQUIREDDATAMAPPINGCONNECTION = SIMULATION_COORDINATOR_CONNECTION__REQUIREDDATAMAPPINGCONNECTION;

	/**
	 * The feature id for the '<em><b>Coordinator Assembly Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY = SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY;

	/**
	 * The feature id for the '<em><b>Simulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION = SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simulation Assembly Entity Coordinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION_FEATURE_COUNT = SIMULATION_COORDINATOR_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simulation Assembly Entity Coordinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION_OPERATION_COUNT = SIMULATION_COORDINATOR_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.InterfaceProvidedRequiredConnectionImpl <em>Interface Provided Required Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.InterfaceProvidedRequiredConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getInterfaceProvidedRequiredConnection()
	 * @generated
	 */
	int INTERFACE_PROVIDED_REQUIRED_CONNECTION = 13;

	/**
	 * The number of structural features of the '<em>Interface Provided Required Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDED_REQUIRED_CONNECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface Provided Required Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDED_REQUIRED_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ProvidedRequiredConnectionImpl <em>Provided Required Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ProvidedRequiredConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getProvidedRequiredConnection()
	 * @generated
	 */
	int PROVIDED_REQUIRED_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Requireddatamappingconnection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION = INTERFACE_PROVIDED_REQUIRED_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided Required Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_REQUIRED_CONNECTION_FEATURE_COUNT = INTERFACE_PROVIDED_REQUIRED_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provided Required Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_REQUIRED_CONNECTION_OPERATION_COUNT = INTERFACE_PROVIDED_REQUIRED_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWCoordinator_CoordinatorConnectionImpl <em>MW Coordinator Coordinator Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWCoordinator_CoordinatorConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getMWCoordinator_CoordinatorConnection()
	 * @generated
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION__ID = MASTER_WORKER_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION__NAME = MASTER_WORKER_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION__ASSEMBLY = MASTER_WORKER_CONNECTION__ASSEMBLY;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION__MASTER = MASTER_WORKER_CONNECTION__MASTER;

	/**
	 * The feature id for the '<em><b>Coordinatorfunctionmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING = MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING;

	/**
	 * The feature id for the '<em><b>Worker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER = MASTER_WORKER_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MW Coordinator Coordinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION_FEATURE_COUNT = MASTER_WORKER_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MW Coordinator Coordinator Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COORDINATOR_COORDINATOR_CONNECTION_OPERATION_COUNT = MASTER_WORKER_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.CoordinatorFunctionMappingImpl <em>Coordinator Function Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.CoordinatorFunctionMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getCoordinatorFunctionMapping()
	 * @generated
	 */
	int COORDINATOR_FUNCTION_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Master Service Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Worker Service Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Function Mapping Modus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_FUNCTION_MAPPING__FUNCTION_MAPPING_MODUS = 2;

	/**
	 * The number of structural features of the '<em>Coordinator Function Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_FUNCTION_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coordinator Function Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_FUNCTION_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.RequiredDataMappingConnectionImpl <em>Required Data Mapping Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.RequiredDataMappingConnectionImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getRequiredDataMappingConnection()
	 * @generated
	 */
	int REQUIRED_DATA_MAPPING_CONNECTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_MAPPING_CONNECTION__ID = BasicPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Providedrequiredconnection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION = BasicPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Data Mapping Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_MAPPING_CONNECTION_FEATURE_COUNT = BasicPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Data Mapping Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_MAPPING_CONNECTION_OPERATION_COUNT = BasicPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ObjectOrientedViewRequiredDataMappingImpl <em>Object Oriented View Required Data Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ObjectOrientedViewRequiredDataMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getObjectOrientedViewRequiredDataMapping()
	 * @generated
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__ID = REQUIRED_DATA_MAPPING_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Providedrequiredconnection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDEDREQUIREDCONNECTION = REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION;

	/**
	 * The feature id for the '<em><b>Requieringinterfaceobjectclassmapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING = REQUIRED_DATA_MAPPING_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providinginterfaceobjectclassmapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING = REQUIRED_DATA_MAPPING_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Oriented View Required Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING_FEATURE_COUNT = REQUIRED_DATA_MAPPING_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Oriented View Required Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING_OPERATION_COUNT = REQUIRED_DATA_MAPPING_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.UnstructuredViewRequiredDataMappingImpl <em>Unstructured View Required Data Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.UnstructuredViewRequiredDataMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getUnstructuredViewRequiredDataMapping()
	 * @generated
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__ID = REQUIRED_DATA_MAPPING_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Providedrequiredconnection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__PROVIDEDREQUIREDCONNECTION = REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION;

	/**
	 * The feature id for the '<em><b>Mappabledata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA = REQUIRED_DATA_MAPPING_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unstructured View Required Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING_FEATURE_COUNT = REQUIRED_DATA_MAPPING_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unstructured View Required Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING_OPERATION_COUNT = REQUIRED_DATA_MAPPING_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus <em>Function Mapping Modus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getFunctionMappingModus()
	 * @generated
	 */
	int FUNCTION_MAPPING_MODUS = 14;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection <em>Composed Assembly Coodinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Assembly Coodinator Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection
	 * @generated
	 */
	EClass getComposedAssembly_CoodinatorConnection();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection#getComposedassemblyentity <em>Composedassemblyentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composedassemblyentity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection#getComposedassemblyentity()
	 * @see #getComposedAssembly_CoodinatorConnection()
	 * @generated
	 */
	EReference getComposedAssembly_CoodinatorConnection_Composedassemblyentity();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection#getWorkerAssembledSimulationCoordinator <em>Worker Assembled Simulation Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worker Assembled Simulation Coordinator</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection#getWorkerAssembledSimulationCoordinator()
	 * @see #getComposedAssembly_CoodinatorConnection()
	 * @generated
	 */
	EReference getComposedAssembly_CoodinatorConnection_WorkerAssembledSimulationCoordinator();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection <em>MW Assembly Coordinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MW Assembly Coordinator Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection
	 * @generated
	 */
	EClass getMWAssembly_CoordinatorConnection();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection#getWorkerAssembledSimulation <em>Worker Assembled Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worker Assembled Simulation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection#getWorkerAssembledSimulation()
	 * @see #getMWAssembly_CoordinatorConnection()
	 * @generated
	 */
	EReference getMWAssembly_CoordinatorConnection_WorkerAssembledSimulation();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection <em>Simulation Coordinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Coordinator Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection
	 * @generated
	 */
	EClass getSimulation_CoordinatorConnection();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection#getCoordinatorAssemblyEntity <em>Coordinator Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator Assembly Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection#getCoordinatorAssemblyEntity()
	 * @see #getSimulation_CoordinatorConnection()
	 * @generated
	 */
	EReference getSimulation_CoordinatorConnection_CoordinatorAssemblyEntity();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection <em>Simulation Assembly Entity Coordinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Assembly Entity Coordinator Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection
	 * @generated
	 */
	EClass getSimulationAssemblyEntity_CoordinatorConnection();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection#getSimulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simulation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection#getSimulation()
	 * @see #getSimulationAssemblyEntity_CoordinatorConnection()
	 * @generated
	 */
	EReference getSimulationAssemblyEntity_CoordinatorConnection_Simulation();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection <em>Provided Required Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Required Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection
	 * @generated
	 */
	EClass getProvidedRequiredConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection#getRequireddatamappingconnection <em>Requireddatamappingconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requireddatamappingconnection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection#getRequireddatamappingconnection()
	 * @see #getProvidedRequiredConnection()
	 * @generated
	 */
	EReference getProvidedRequiredConnection_Requireddatamappingconnection();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection <em>MW Coordinator Coordinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MW Coordinator Coordinator Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection
	 * @generated
	 */
	EClass getMWCoordinator_CoordinatorConnection();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection#getWorker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worker</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection#getWorker()
	 * @see #getMWCoordinator_CoordinatorConnection()
	 * @generated
	 */
	EReference getMWCoordinator_CoordinatorConnection_Worker();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the container reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assembly</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection#getAssembly()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Assembly();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection <em>Master Worker Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Worker Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection
	 * @generated
	 */
	EClass getMasterWorkerConnection();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection#getMaster()
	 * @see #getMasterWorkerConnection()
	 * @generated
	 */
	EReference getMasterWorkerConnection_Master();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection#getCoordinatorfunctionmapping <em>Coordinatorfunctionmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinatorfunctionmapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection#getCoordinatorfunctionmapping()
	 * @see #getMasterWorkerConnection()
	 * @generated
	 */
	EReference getMasterWorkerConnection_Coordinatorfunctionmapping();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationInvolvedConnection <em>Simulation Involved Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Involved Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationInvolvedConnection
	 * @generated
	 */
	EClass getSimulationInvolvedConnection();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping <em>Coordinator Function Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinator Function Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping
	 * @generated
	 */
	EClass getCoordinatorFunctionMapping();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getMasterServiceFunction <em>Master Service Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master Service Function</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getMasterServiceFunction()
	 * @see #getCoordinatorFunctionMapping()
	 * @generated
	 */
	EReference getCoordinatorFunctionMapping_MasterServiceFunction();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getWorkerServiceFunction <em>Worker Service Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worker Service Function</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getWorkerServiceFunction()
	 * @see #getCoordinatorFunctionMapping()
	 * @generated
	 */
	EReference getCoordinatorFunctionMapping_WorkerServiceFunction();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getFunctionMappingModus <em>Function Mapping Modus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Mapping Modus</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getFunctionMappingModus()
	 * @see #getCoordinatorFunctionMapping()
	 * @generated
	 */
	EAttribute getCoordinatorFunctionMapping_FunctionMappingModus();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection <em>Required Data Mapping Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Data Mapping Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection
	 * @generated
	 */
	EClass getRequiredDataMappingConnection();

	/**
	 * Returns the meta object for the container reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection#getProvidedrequiredconnection <em>Providedrequiredconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Providedrequiredconnection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection#getProvidedrequiredconnection()
	 * @see #getRequiredDataMappingConnection()
	 * @generated
	 */
	EReference getRequiredDataMappingConnection_Providedrequiredconnection();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping <em>Object Oriented View Required Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Oriented View Required Data Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping
	 * @generated
	 */
	EClass getObjectOrientedViewRequiredDataMapping();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping#getRequieringinterfaceobjectclassmapping <em>Requieringinterfaceobjectclassmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requieringinterfaceobjectclassmapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping#getRequieringinterfaceobjectclassmapping()
	 * @see #getObjectOrientedViewRequiredDataMapping()
	 * @generated
	 */
	EReference getObjectOrientedViewRequiredDataMapping_Requieringinterfaceobjectclassmapping();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping#getProvidinginterfaceobjectclassmapping <em>Providinginterfaceobjectclassmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providinginterfaceobjectclassmapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping#getProvidinginterfaceobjectclassmapping()
	 * @see #getObjectOrientedViewRequiredDataMapping()
	 * @generated
	 */
	EReference getObjectOrientedViewRequiredDataMapping_Providinginterfaceobjectclassmapping();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping <em>Unstructured View Required Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured View Required Data Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping
	 * @generated
	 */
	EClass getUnstructuredViewRequiredDataMapping();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping#getMappabledata <em>Mappabledata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mappabledata</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping#getMappabledata()
	 * @see #getUnstructuredViewRequiredDataMapping()
	 * @generated
	 */
	EReference getUnstructuredViewRequiredDataMapping_Mappabledata();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.InterfaceProvidedRequiredConnection <em>Interface Provided Required Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Provided Required Connection</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.InterfaceProvidedRequiredConnection
	 * @generated
	 */
	EClass getInterfaceProvidedRequiredConnection();

	/**
	 * Returns the meta object for enum '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus <em>Function Mapping Modus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Mapping Modus</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus
	 * @generated
	 */
	EEnum getFunctionMappingModus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyConnectionsFactory getAssemblyConnectionsFactory();

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
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl <em>Composed Assembly Coodinator Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getComposedAssembly_CoodinatorConnection()
		 * @generated
		 */
		EClass COMPOSED_ASSEMBLY_COODINATOR_CONNECTION = eINSTANCE.getComposedAssembly_CoodinatorConnection();

		/**
		 * The meta object literal for the '<em><b>Composedassemblyentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY = eINSTANCE.getComposedAssembly_CoodinatorConnection_Composedassemblyentity();

		/**
		 * The meta object literal for the '<em><b>Worker Assembled Simulation Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR = eINSTANCE.getComposedAssembly_CoodinatorConnection_WorkerAssembledSimulationCoordinator();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWAssembly_CoordinatorConnectionImpl <em>MW Assembly Coordinator Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWAssembly_CoordinatorConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getMWAssembly_CoordinatorConnection()
		 * @generated
		 */
		EClass MW_ASSEMBLY_COORDINATOR_CONNECTION = eINSTANCE.getMWAssembly_CoordinatorConnection();

		/**
		 * The meta object literal for the '<em><b>Worker Assembled Simulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION = eINSTANCE.getMWAssembly_CoordinatorConnection_WorkerAssembledSimulation();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.Simulation_CoordinatorConnectionImpl <em>Simulation Coordinator Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.Simulation_CoordinatorConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getSimulation_CoordinatorConnection()
		 * @generated
		 */
		EClass SIMULATION_COORDINATOR_CONNECTION = eINSTANCE.getSimulation_CoordinatorConnection();

		/**
		 * The meta object literal for the '<em><b>Coordinator Assembly Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY = eINSTANCE.getSimulation_CoordinatorConnection_CoordinatorAssemblyEntity();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationAssemblyEntity_CoordinatorConnectionImpl <em>Simulation Assembly Entity Coordinator Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationAssemblyEntity_CoordinatorConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getSimulationAssemblyEntity_CoordinatorConnection()
		 * @generated
		 */
		EClass SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION = eINSTANCE.getSimulationAssemblyEntity_CoordinatorConnection();

		/**
		 * The meta object literal for the '<em><b>Simulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION = eINSTANCE.getSimulationAssemblyEntity_CoordinatorConnection_Simulation();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ProvidedRequiredConnectionImpl <em>Provided Required Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ProvidedRequiredConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getProvidedRequiredConnection()
		 * @generated
		 */
		EClass PROVIDED_REQUIRED_CONNECTION = eINSTANCE.getProvidedRequiredConnection();

		/**
		 * The meta object literal for the '<em><b>Requireddatamappingconnection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION = eINSTANCE.getProvidedRequiredConnection_Requireddatamappingconnection();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWCoordinator_CoordinatorConnectionImpl <em>MW Coordinator Coordinator Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWCoordinator_CoordinatorConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getMWCoordinator_CoordinatorConnection()
		 * @generated
		 */
		EClass MW_COORDINATOR_COORDINATOR_CONNECTION = eINSTANCE.getMWCoordinator_CoordinatorConnection();

		/**
		 * The meta object literal for the '<em><b>Worker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER = eINSTANCE.getMWCoordinator_CoordinatorConnection_Worker();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Assembly</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ASSEMBLY = eINSTANCE.getConnection_Assembly();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MasterWorkerConnectionImpl <em>Master Worker Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MasterWorkerConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getMasterWorkerConnection()
		 * @generated
		 */
		EClass MASTER_WORKER_CONNECTION = eINSTANCE.getMasterWorkerConnection();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_WORKER_CONNECTION__MASTER = eINSTANCE.getMasterWorkerConnection_Master();

		/**
		 * The meta object literal for the '<em><b>Coordinatorfunctionmapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING = eINSTANCE.getMasterWorkerConnection_Coordinatorfunctionmapping();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationInvolvedConnectionImpl <em>Simulation Involved Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationInvolvedConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getSimulationInvolvedConnection()
		 * @generated
		 */
		EClass SIMULATION_INVOLVED_CONNECTION = eINSTANCE.getSimulationInvolvedConnection();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.CoordinatorFunctionMappingImpl <em>Coordinator Function Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.CoordinatorFunctionMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getCoordinatorFunctionMapping()
		 * @generated
		 */
		EClass COORDINATOR_FUNCTION_MAPPING = eINSTANCE.getCoordinatorFunctionMapping();

		/**
		 * The meta object literal for the '<em><b>Master Service Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION = eINSTANCE.getCoordinatorFunctionMapping_MasterServiceFunction();

		/**
		 * The meta object literal for the '<em><b>Worker Service Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION = eINSTANCE.getCoordinatorFunctionMapping_WorkerServiceFunction();

		/**
		 * The meta object literal for the '<em><b>Function Mapping Modus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATOR_FUNCTION_MAPPING__FUNCTION_MAPPING_MODUS = eINSTANCE.getCoordinatorFunctionMapping_FunctionMappingModus();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.RequiredDataMappingConnectionImpl <em>Required Data Mapping Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.RequiredDataMappingConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getRequiredDataMappingConnection()
		 * @generated
		 */
		EClass REQUIRED_DATA_MAPPING_CONNECTION = eINSTANCE.getRequiredDataMappingConnection();

		/**
		 * The meta object literal for the '<em><b>Providedrequiredconnection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION = eINSTANCE.getRequiredDataMappingConnection_Providedrequiredconnection();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ObjectOrientedViewRequiredDataMappingImpl <em>Object Oriented View Required Data Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ObjectOrientedViewRequiredDataMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getObjectOrientedViewRequiredDataMapping()
		 * @generated
		 */
		EClass OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING = eINSTANCE.getObjectOrientedViewRequiredDataMapping();

		/**
		 * The meta object literal for the '<em><b>Requieringinterfaceobjectclassmapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING = eINSTANCE.getObjectOrientedViewRequiredDataMapping_Requieringinterfaceobjectclassmapping();

		/**
		 * The meta object literal for the '<em><b>Providinginterfaceobjectclassmapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING = eINSTANCE.getObjectOrientedViewRequiredDataMapping_Providinginterfaceobjectclassmapping();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.UnstructuredViewRequiredDataMappingImpl <em>Unstructured View Required Data Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.UnstructuredViewRequiredDataMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getUnstructuredViewRequiredDataMapping()
		 * @generated
		 */
		EClass UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING = eINSTANCE.getUnstructuredViewRequiredDataMapping();

		/**
		 * The meta object literal for the '<em><b>Mappabledata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA = eINSTANCE.getUnstructuredViewRequiredDataMapping_Mappabledata();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.InterfaceProvidedRequiredConnectionImpl <em>Interface Provided Required Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.InterfaceProvidedRequiredConnectionImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getInterfaceProvidedRequiredConnection()
		 * @generated
		 */
		EClass INTERFACE_PROVIDED_REQUIRED_CONNECTION = eINSTANCE.getInterfaceProvidedRequiredConnection();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus <em>Function Mapping Modus</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl#getFunctionMappingModus()
		 * @generated
		 */
		EEnum FUNCTION_MAPPING_MODUS = eINSTANCE.getFunctionMappingModus();

	}

} //AssemblyConnectionsPackage
