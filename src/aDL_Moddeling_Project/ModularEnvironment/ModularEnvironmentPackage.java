/**
 */
package aDL_Moddeling_Project.ModularEnvironment;

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
 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface ModularEnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModularEnvironment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.ModularEnvironment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModularEnvironment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularEnvironmentPackage eINSTANCE = aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl <em>Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getCoordinator()
	 * @generated
	 */
	int COORDINATOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Dataadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__DATAADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__MANAGEMENTSERVICE = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mseserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__MSESERVICEINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__CONNECTOR = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dataspecificationcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__DATASPECIFICATIONCONTAINER = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.MSEServiceInterfaceImpl <em>MSE Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.MSEServiceInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getMSEServiceInterface()
	 * @generated
	 */
	int MSE_SERVICE_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_SERVICE_INTERFACE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_SERVICE_INTERFACE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_SERVICE_INTERFACE__MANAGEMENTSERVICEINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSE Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_SERVICE_INTERFACE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MSE Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_SERVICE_INTERFACE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorEntityImpl <em>Coordinator Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorEntityImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getCoordinatorEntity()
	 * @generated
	 */
	int COORDINATOR_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Dataadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ENTITY__DATAADDITIONINTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Coordinator Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Coordinator Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceImpl <em>Addition Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getAdditionInterface()
	 * @generated
	 */
	int ADDITION_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE__ID = BasicPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Operationadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE = BasicPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dataadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE__DATAADDITIONINTERFACE = BasicPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE_FEATURE_COUNT = BasicPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE_OPERATION_COUNT = BasicPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.UnstructuredAdditionInterfaceImpl <em>Unstructured Addition Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.UnstructuredAdditionInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getUnstructuredAdditionInterface()
	 * @generated
	 */
	int UNSTRUCTURED_ADDITION_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ADDITION_INTERFACE__ID = ADDITION_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Operationadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE = ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE;

	/**
	 * The feature id for the '<em><b>Dataadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ADDITION_INTERFACE__DATAADDITIONINTERFACE = ADDITION_INTERFACE__DATAADDITIONINTERFACE;

	/**
	 * The number of structural features of the '<em>Unstructured Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ADDITION_INTERFACE_FEATURE_COUNT = ADDITION_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unstructured Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ADDITION_INTERFACE_OPERATION_COUNT = ADDITION_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceDefinitionImpl <em>Addition Interface Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceDefinitionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getAdditionInterfaceDefinition()
	 * @generated
	 */
	int ADDITION_INTERFACE_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE_DEFINITION__ID = BasicPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Additions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE_DEFINITION__ADDITIONS = BasicPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Addition Interface Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE_DEFINITION_FEATURE_COUNT = BasicPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Addition Interface Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_INTERFACE_DEFINITION_OPERATION_COUNT = BasicPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.DataAdditionInterfaceImpl <em>Data Addition Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.DataAdditionInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getDataAdditionInterface()
	 * @generated
	 */
	int DATA_ADDITION_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDITION_INTERFACE__ID = ADDITION_INTERFACE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Additions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDITION_INTERFACE__ADDITIONS = ADDITION_INTERFACE_DEFINITION__ADDITIONS;

	/**
	 * The number of structural features of the '<em>Data Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDITION_INTERFACE_FEATURE_COUNT = ADDITION_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ADDITION_INTERFACE_OPERATION_COUNT = ADDITION_INTERFACE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.OperationAdditionInterfaceImpl <em>Operation Addition Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.OperationAdditionInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getOperationAdditionInterface()
	 * @generated
	 */
	int OPERATION_ADDITION_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADDITION_INTERFACE__ID = ADDITION_INTERFACE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Additions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADDITION_INTERFACE__ADDITIONS = ADDITION_INTERFACE_DEFINITION__ADDITIONS;

	/**
	 * The number of structural features of the '<em>Operation Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADDITION_INTERFACE_FEATURE_COUNT = ADDITION_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ADDITION_INTERFACE_OPERATION_COUNT = ADDITION_INTERFACE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.ObjectOrientedStructuredAdditionInterfaceImpl <em>Object Oriented Structured Addition Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ObjectOrientedStructuredAdditionInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getObjectOrientedStructuredAdditionInterface()
	 * @generated
	 */
	int OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__ID = ADDITION_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Operationadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE = ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE;

	/**
	 * The feature id for the '<em><b>Dataadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__DATAADDITIONINTERFACE = ADDITION_INTERFACE__DATAADDITIONINTERFACE;

	/**
	 * The feature id for the '<em><b>Objectclassadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE = ADDITION_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Oriented Structured Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE_FEATURE_COUNT = ADDITION_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Oriented Structured Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE_OPERATION_COUNT = ADDITION_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.ObjectClassAdditionInterfaceImpl <em>Object Class Addition Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ObjectClassAdditionInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getObjectClassAdditionInterface()
	 * @generated
	 */
	int OBJECT_CLASS_ADDITION_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_ADDITION_INTERFACE__ID = ADDITION_INTERFACE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Additions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_ADDITION_INTERFACE__ADDITIONS = ADDITION_INTERFACE_DEFINITION__ADDITIONS;

	/**
	 * The number of structural features of the '<em>Object Class Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_ADDITION_INTERFACE_FEATURE_COUNT = ADDITION_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Class Addition Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_ADDITION_INTERFACE_OPERATION_COUNT = ADDITION_INTERFACE_DEFINITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinator</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.Coordinator
	 * @generated
	 */
	EClass getCoordinator();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getManagementservice <em>Managementservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managementservice</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.Coordinator#getManagementservice()
	 * @see #getCoordinator()
	 * @generated
	 */
	EReference getCoordinator_Managementservice();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getMseserviceinterface <em>Mseserviceinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mseserviceinterface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.Coordinator#getMseserviceinterface()
	 * @see #getCoordinator()
	 * @generated
	 */
	EReference getCoordinator_Mseserviceinterface();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.Coordinator#getConnector()
	 * @see #getCoordinator()
	 * @generated
	 */
	EReference getCoordinator_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getDataspecificationcontainer <em>Dataspecificationcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataspecificationcontainer</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.Coordinator#getDataspecificationcontainer()
	 * @see #getCoordinator()
	 * @generated
	 */
	EReference getCoordinator_Dataspecificationcontainer();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.MSEServiceInterface <em>MSE Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSE Service Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.MSEServiceInterface
	 * @generated
	 */
	EClass getMSEServiceInterface();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.MSEServiceInterface#getManagementserviceinterface <em>Managementserviceinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managementserviceinterface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.MSEServiceInterface#getManagementserviceinterface()
	 * @see #getMSEServiceInterface()
	 * @generated
	 */
	EReference getMSEServiceInterface_Managementserviceinterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity <em>Coordinator Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinator Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity
	 * @generated
	 */
	EClass getCoordinatorEntity();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity#getDataadditioninterface <em>Dataadditioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataadditioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity#getDataadditioninterface()
	 * @see #getCoordinatorEntity()
	 * @generated
	 */
	EReference getCoordinatorEntity_Dataadditioninterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterface <em>Addition Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.AdditionInterface
	 * @generated
	 */
	EClass getAdditionInterface();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterface#getOperationadditioninterface <em>Operationadditioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operationadditioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.AdditionInterface#getOperationadditioninterface()
	 * @see #getAdditionInterface()
	 * @generated
	 */
	EReference getAdditionInterface_Operationadditioninterface();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterface#getDataadditioninterface <em>Dataadditioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataadditioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.AdditionInterface#getDataadditioninterface()
	 * @see #getAdditionInterface()
	 * @generated
	 */
	EReference getAdditionInterface_Dataadditioninterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.UnstructuredAdditionInterface <em>Unstructured Addition Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Addition Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.UnstructuredAdditionInterface
	 * @generated
	 */
	EClass getUnstructuredAdditionInterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.DataAdditionInterface <em>Data Addition Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Addition Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.DataAdditionInterface
	 * @generated
	 */
	EClass getDataAdditionInterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.OperationAdditionInterface <em>Operation Addition Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Addition Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.OperationAdditionInterface
	 * @generated
	 */
	EClass getOperationAdditionInterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ObjectOrientedStructuredAdditionInterface <em>Object Oriented Structured Addition Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Oriented Structured Addition Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ObjectOrientedStructuredAdditionInterface
	 * @generated
	 */
	EClass getObjectOrientedStructuredAdditionInterface();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.ObjectOrientedStructuredAdditionInterface#getObjectclassadditioninterface <em>Objectclassadditioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objectclassadditioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ObjectOrientedStructuredAdditionInterface#getObjectclassadditioninterface()
	 * @see #getObjectOrientedStructuredAdditionInterface()
	 * @generated
	 */
	EReference getObjectOrientedStructuredAdditionInterface_Objectclassadditioninterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ObjectClassAdditionInterface <em>Object Class Addition Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class Addition Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ObjectClassAdditionInterface
	 * @generated
	 */
	EClass getObjectClassAdditionInterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterfaceDefinition <em>Addition Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Interface Definition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.AdditionInterfaceDefinition
	 * @generated
	 */
	EClass getAdditionInterfaceDefinition();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterfaceDefinition#getAdditions <em>Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additions</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.AdditionInterfaceDefinition#getAdditions()
	 * @see #getAdditionInterfaceDefinition()
	 * @generated
	 */
	EReference getAdditionInterfaceDefinition_Additions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModularEnvironmentFactory getModularEnvironmentFactory();

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
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl <em>Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getCoordinator()
		 * @generated
		 */
		EClass COORDINATOR = eINSTANCE.getCoordinator();

		/**
		 * The meta object literal for the '<em><b>Managementservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR__MANAGEMENTSERVICE = eINSTANCE.getCoordinator_Managementservice();

		/**
		 * The meta object literal for the '<em><b>Mseserviceinterface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR__MSESERVICEINTERFACE = eINSTANCE.getCoordinator_Mseserviceinterface();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR__CONNECTOR = eINSTANCE.getCoordinator_Connector();

		/**
		 * The meta object literal for the '<em><b>Dataspecificationcontainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR__DATASPECIFICATIONCONTAINER = eINSTANCE.getCoordinator_Dataspecificationcontainer();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.MSEServiceInterfaceImpl <em>MSE Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.MSEServiceInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getMSEServiceInterface()
		 * @generated
		 */
		EClass MSE_SERVICE_INTERFACE = eINSTANCE.getMSEServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Managementserviceinterface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSE_SERVICE_INTERFACE__MANAGEMENTSERVICEINTERFACE = eINSTANCE.getMSEServiceInterface_Managementserviceinterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorEntityImpl <em>Coordinator Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorEntityImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getCoordinatorEntity()
		 * @generated
		 */
		EClass COORDINATOR_ENTITY = eINSTANCE.getCoordinatorEntity();

		/**
		 * The meta object literal for the '<em><b>Dataadditioninterface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR_ENTITY__DATAADDITIONINTERFACE = eINSTANCE.getCoordinatorEntity_Dataadditioninterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceImpl <em>Addition Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getAdditionInterface()
		 * @generated
		 */
		EClass ADDITION_INTERFACE = eINSTANCE.getAdditionInterface();

		/**
		 * The meta object literal for the '<em><b>Operationadditioninterface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE = eINSTANCE.getAdditionInterface_Operationadditioninterface();

		/**
		 * The meta object literal for the '<em><b>Dataadditioninterface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_INTERFACE__DATAADDITIONINTERFACE = eINSTANCE.getAdditionInterface_Dataadditioninterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.UnstructuredAdditionInterfaceImpl <em>Unstructured Addition Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.UnstructuredAdditionInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getUnstructuredAdditionInterface()
		 * @generated
		 */
		EClass UNSTRUCTURED_ADDITION_INTERFACE = eINSTANCE.getUnstructuredAdditionInterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.DataAdditionInterfaceImpl <em>Data Addition Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.DataAdditionInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getDataAdditionInterface()
		 * @generated
		 */
		EClass DATA_ADDITION_INTERFACE = eINSTANCE.getDataAdditionInterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.OperationAdditionInterfaceImpl <em>Operation Addition Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.OperationAdditionInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getOperationAdditionInterface()
		 * @generated
		 */
		EClass OPERATION_ADDITION_INTERFACE = eINSTANCE.getOperationAdditionInterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.ObjectOrientedStructuredAdditionInterfaceImpl <em>Object Oriented Structured Addition Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ObjectOrientedStructuredAdditionInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getObjectOrientedStructuredAdditionInterface()
		 * @generated
		 */
		EClass OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE = eINSTANCE.getObjectOrientedStructuredAdditionInterface();

		/**
		 * The meta object literal for the '<em><b>Objectclassadditioninterface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE = eINSTANCE.getObjectOrientedStructuredAdditionInterface_Objectclassadditioninterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.ObjectClassAdditionInterfaceImpl <em>Object Class Addition Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ObjectClassAdditionInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getObjectClassAdditionInterface()
		 * @generated
		 */
		EClass OBJECT_CLASS_ADDITION_INTERFACE = eINSTANCE.getObjectClassAdditionInterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceDefinitionImpl <em>Addition Interface Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceDefinitionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl#getAdditionInterfaceDefinition()
		 * @generated
		 */
		EClass ADDITION_INTERFACE_DEFINITION = eINSTANCE.getAdditionInterfaceDefinition();

		/**
		 * The meta object literal for the '<em><b>Additions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_INTERFACE_DEFINITION__ADDITIONS = eINSTANCE.getAdditionInterfaceDefinition_Additions();

	}

} //ModularEnvironmentPackage
