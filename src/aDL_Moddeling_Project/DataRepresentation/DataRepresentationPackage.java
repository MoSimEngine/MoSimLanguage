/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import aDL_Moddeling_Project.basic.BasicPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationFactory
 * @model kind="package"
 * @generated
 */
public interface DataRepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataRepresentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.DataRepresentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataRepresentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataRepresentationPackage eINSTANCE = aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassImpl <em>Object Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectClass()
	 * @generated
	 */
	int OBJECT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__ID = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__NAME = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Objectclassoperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__OBJECTCLASSOPERATION = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objectclassinheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__OBJECTCLASSINHERITANCE = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__DATA = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_FEATURE_COUNT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION_COUNT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl <em>Object Class Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectClassOperation()
	 * @generated
	 */
	int OBJECT_CLASS_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION__ID = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION__NAME = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION__PRECONDITION = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION__PARAMETERS = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operationexecutioneffect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION__POSTCONDITION = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION__RETURN_TYPE = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Objectclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION__OBJECTCLASS = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Object Class Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION_FEATURE_COUNT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Object Class Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_OPERATION_OPERATION_COUNT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectInstanceImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectInstance()
	 * @generated
	 */
	int OBJECT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Assignment</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__OBJECT_ASSIGNMENT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Value Setting</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__DATA_VALUE_SETTING = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enum Value Setting</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__ENUM_VALUE_SETTING = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Object Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ClassReferencePropertyImpl <em>Class Reference Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.ClassReferencePropertyImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getClassReferenceProperty()
	 * @generated
	 */
	int CLASS_REFERENCE_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REFERENCE_PROPERTY__ID = DataSpecificationPackage.DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REFERENCE_PROPERTY__NAME = DataSpecificationPackage.DATA__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REFERENCE_PROPERTY__SEMANTIC_TYPE = DataSpecificationPackage.DATA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REFERENCE_PROPERTY__CONSTANT = DataSpecificationPackage.DATA__CONSTANT;

	/**
	 * The feature id for the '<em><b>Referenced Objectclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS = DataSpecificationPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Reference Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REFERENCE_PROPERTY_FEATURE_COUNT = DataSpecificationPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Reference Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REFERENCE_PROPERTY_OPERATION_COUNT = DataSpecificationPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.SimulationDataImpl <em>Simulation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.SimulationDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getSimulationData()
	 * @generated
	 */
	int SIMULATION_DATA = 10;

	/**
	 * The feature id for the '<em><b>Requireddata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_DATA__REQUIREDDATA = 0;

	/**
	 * The number of structural features of the '<em>Simulation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Simulation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewSimulationDataImpl <em>Object Oriented View Simulation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewSimulationDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectOrientedViewSimulationData()
	 * @generated
	 */
	int OBJECT_ORIENTED_VIEW_SIMULATION_DATA = 4;

	/**
	 * The feature id for the '<em><b>Requireddata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_SIMULATION_DATA__REQUIREDDATA = SIMULATION_DATA__REQUIREDDATA;

	/**
	 * The feature id for the '<em><b>Instancedobjects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS = SIMULATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objectclassdefinitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS = SIMULATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Oriented View Simulation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_SIMULATION_DATA_FEATURE_COUNT = SIMULATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Oriented View Simulation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_SIMULATION_DATA_OPERATION_COUNT = SIMULATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.requiredDataInterfaceImpl <em>required Data Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.requiredDataInterfaceImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getrequiredDataInterface()
	 * @generated
	 */
	int REQUIRED_DATA_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_INTERFACE__PURPOSE = 0;

	/**
	 * The feature id for the '<em><b>Requireddataentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY = 1;

	/**
	 * The number of structural features of the '<em>required Data Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>required Data Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.InstancedObjectsImpl <em>Instanced Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.InstancedObjectsImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getInstancedObjects()
	 * @generated
	 */
	int INSTANCED_OBJECTS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCED_OBJECTS__ID = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCED_OBJECTS__NAME = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Objectinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCED_OBJECTS__OBJECTINSTANCE = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instanced Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCED_OBJECTS_FEATURE_COUNT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instanced Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCED_OBJECTS_OPERATION_COUNT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassDefinitionsImpl <em>Object Class Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassDefinitionsImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectClassDefinitions()
	 * @generated
	 */
	int OBJECT_CLASS_DEFINITIONS = 7;

	/**
	 * The feature id for the '<em><b>Objectclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_DEFINITIONS__OBJECTCLASS = 0;

	/**
	 * The number of structural features of the '<em>Object Class Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object Class Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassInheritanceImpl <em>Object Class Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassInheritanceImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectClassInheritance()
	 * @generated
	 */
	int OBJECT_CLASS_INHERITANCE = 8;

	/**
	 * The feature id for the '<em><b>Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_INHERITANCE__OBJECT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Operationoverride</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE = 1;

	/**
	 * The number of structural features of the '<em>Object Class Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_INHERITANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object Class Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_INHERITANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.OperationOverrideImpl <em>Operation Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.OperationOverrideImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getOperationOverride()
	 * @generated
	 */
	int OPERATION_OVERRIDE = 9;

	/**
	 * The feature id for the '<em><b>Parent Class Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OVERRIDE__PARENT_CLASS_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Overriding Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OVERRIDE__OVERRIDING_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Operation Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OVERRIDE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OVERRIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.DataToValueMapImpl <em>Data To Value Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataToValueMapImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getDataToValueMap()
	 * @generated
	 */
	int DATA_TO_VALUE_MAP = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TO_VALUE_MAP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TO_VALUE_MAP__KEY = 1;

	/**
	 * The number of structural features of the '<em>Data To Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TO_VALUE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data To Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TO_VALUE_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.EnumToEnumassignmentMapImpl <em>Enum To Enumassignment Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.EnumToEnumassignmentMapImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getEnumToEnumassignmentMap()
	 * @generated
	 */
	int ENUM_TO_ENUMASSIGNMENT_MAP = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TO_ENUMASSIGNMENT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TO_ENUMASSIGNMENT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enum To Enumassignment Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TO_ENUMASSIGNMENT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum To Enumassignment Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TO_ENUMASSIGNMENT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.DataToObjectMapImpl <em>Data To Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataToObjectMapImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getDataToObjectMap()
	 * @generated
	 */
	int DATA_TO_OBJECT_MAP = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TO_OBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TO_OBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TO_OBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data To Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TO_OBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.RequiredDataEntryImpl <em>Required Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.RequiredDataEntryImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getRequiredDataEntry()
	 * @generated
	 */
	int REQUIRED_DATA_ENTRY = 17;

	/**
	 * The number of structural features of the '<em>Required Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Required Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DATA_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewRequiredEntryImpl <em>Object Oriented View Required Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewRequiredEntryImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectOrientedViewRequiredEntry()
	 * @generated
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Required Object Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS = REQUIRED_DATA_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Oriented View Required Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY_FEATURE_COUNT = REQUIRED_DATA_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Oriented View Required Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY_OPERATION_COUNT = REQUIRED_DATA_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.UnstructuredViewRequiredEntryImpl <em>Unstructured View Required Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.UnstructuredViewRequiredEntryImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getUnstructuredViewRequiredEntry()
	 * @generated
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_ENTRY__DATA = 0;

	/**
	 * The number of structural features of the '<em>Unstructured View Required Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unstructured View Required Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_REQUIRED_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.RequiredReferencePropertyImpl <em>Required Reference Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.RequiredReferencePropertyImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getRequiredReferenceProperty()
	 * @generated
	 */
	int REQUIRED_REFERENCE_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REFERENCE_PROPERTY__ID = DataSpecificationPackage.DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REFERENCE_PROPERTY__NAME = DataSpecificationPackage.DATA__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REFERENCE_PROPERTY__SEMANTIC_TYPE = DataSpecificationPackage.DATA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REFERENCE_PROPERTY__CONSTANT = DataSpecificationPackage.DATA__CONSTANT;

	/**
	 * The feature id for the '<em><b>Objectorientedviewrequiredentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY = DataSpecificationPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Reference Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REFERENCE_PROPERTY_FEATURE_COUNT = DataSpecificationPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Reference Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REFERENCE_PROPERTY_OPERATION_COUNT = DataSpecificationPackage.DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClass
	 * @generated
	 */
	EClass getObjectClass();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassoperation <em>Objectclassoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectclassoperation</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassoperation()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Objectclassoperation();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassinheritance <em>Objectclassinheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objectclassinheritance</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassinheritance()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Objectclassinheritance();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClass#getData()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Data();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation <em>Object Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class Operation</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation
	 * @generated
	 */
	EClass getObjectClassOperation();

	/**
	 * Returns the meta object for the container reference '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation#getObjectclass <em>Objectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Objectclass</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation#getObjectclass()
	 * @see #getObjectClassOperation()
	 * @generated
	 */
	EReference getObjectClassOperation_Objectclass();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance <em>Object Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Instance</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectInstance
	 * @generated
	 */
	EClass getObjectInstance();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getInstantiatedObjectClass <em>Instantiated Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Object Class</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getInstantiatedObjectClass()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_InstantiatedObjectClass();

	/**
	 * Returns the meta object for the map '{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getObjectAssignment <em>Object Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Object Assignment</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getObjectAssignment()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_ObjectAssignment();

	/**
	 * Returns the meta object for the map '{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getDataValueSetting <em>Data Value Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Data Value Setting</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getDataValueSetting()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_DataValueSetting();

	/**
	 * Returns the meta object for the map '{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getEnumValueSetting <em>Enum Value Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Enum Value Setting</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getEnumValueSetting()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_EnumValueSetting();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty <em>Class Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Reference Property</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty
	 * @generated
	 */
	EClass getClassReferenceProperty();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty#getReferencedObjectclass <em>Referenced Objectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Objectclass</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty#getReferencedObjectclass()
	 * @see #getClassReferenceProperty()
	 * @generated
	 */
	EReference getClassReferenceProperty_ReferencedObjectclass();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData <em>Object Oriented View Simulation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Oriented View Simulation Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData
	 * @generated
	 */
	EClass getObjectOrientedViewSimulationData();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData#getInstancedobjects <em>Instancedobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instancedobjects</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData#getInstancedobjects()
	 * @see #getObjectOrientedViewSimulationData()
	 * @generated
	 */
	EReference getObjectOrientedViewSimulationData_Instancedobjects();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData#getObjectclassdefinitions <em>Objectclassdefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objectclassdefinitions</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData#getObjectclassdefinitions()
	 * @see #getObjectOrientedViewSimulationData()
	 * @generated
	 */
	EReference getObjectOrientedViewSimulationData_Objectclassdefinitions();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.requiredDataInterface <em>required Data Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>required Data Interface</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.requiredDataInterface
	 * @generated
	 */
	EClass getrequiredDataInterface();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.requiredDataInterface#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.requiredDataInterface#getPurpose()
	 * @see #getrequiredDataInterface()
	 * @generated
	 */
	EAttribute getrequiredDataInterface_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.requiredDataInterface#getRequireddataentry <em>Requireddataentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requireddataentry</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.requiredDataInterface#getRequireddataentry()
	 * @see #getrequiredDataInterface()
	 * @generated
	 */
	EReference getrequiredDataInterface_Requireddataentry();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.InstancedObjects <em>Instanced Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instanced Objects</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.InstancedObjects
	 * @generated
	 */
	EClass getInstancedObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.InstancedObjects#getObjectinstance <em>Objectinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectinstance</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.InstancedObjects#getObjectinstance()
	 * @see #getInstancedObjects()
	 * @generated
	 */
	EReference getInstancedObjects_Objectinstance();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions <em>Object Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class Definitions</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions
	 * @generated
	 */
	EClass getObjectClassDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions#getObjectclass <em>Objectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectclass</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions#getObjectclass()
	 * @see #getObjectClassDefinitions()
	 * @generated
	 */
	EReference getObjectClassDefinitions_Objectclass();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance <em>Object Class Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class Inheritance</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance
	 * @generated
	 */
	EClass getObjectClassInheritance();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance#getObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Class</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance#getObjectClass()
	 * @see #getObjectClassInheritance()
	 * @generated
	 */
	EReference getObjectClassInheritance_ObjectClass();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance#getOperationoverride <em>Operationoverride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationoverride</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance#getOperationoverride()
	 * @see #getObjectClassInheritance()
	 * @generated
	 */
	EReference getObjectClassInheritance_Operationoverride();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.OperationOverride <em>Operation Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Override</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationOverride
	 * @generated
	 */
	EClass getOperationOverride();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.OperationOverride#getParentClassOperation <em>Parent Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Class Operation</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationOverride#getParentClassOperation()
	 * @see #getOperationOverride()
	 * @generated
	 */
	EReference getOperationOverride_ParentClassOperation();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.OperationOverride#getOverridingOperation <em>Overriding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overriding Operation</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationOverride#getOverridingOperation()
	 * @see #getOperationOverride()
	 * @generated
	 */
	EReference getOperationOverride_OverridingOperation();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.SimulationData <em>Simulation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.SimulationData
	 * @generated
	 */
	EClass getSimulationData();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.SimulationData#getRequireddata <em>Requireddata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requireddata</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.SimulationData#getRequireddata()
	 * @see #getSimulationData()
	 * @generated
	 */
	EReference getSimulationData_Requireddata();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Data To Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data To Value Map</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 *        keyType="aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data" keyRequired="true"
	 * @generated
	 */
	EClass getDataToValueMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDataToValueMap()
	 * @generated
	 */
	EAttribute getDataToValueMap_Value();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDataToValueMap()
	 * @generated
	 */
	EReference getDataToValueMap_Key();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Enum To Enumassignment Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum To Enumassignment Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType" keyRequired="true"
	 *        valueType="aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral" valueRequired="true"
	 * @generated
	 */
	EClass getEnumToEnumassignmentMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEnumToEnumassignmentMap()
	 * @generated
	 */
	EReference getEnumToEnumassignmentMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEnumToEnumassignmentMap()
	 * @generated
	 */
	EReference getEnumToEnumassignmentMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Data To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data To Object Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty" keyRequired="true"
	 *        valueType="aDL_Moddeling_Project.DataRepresentation.ObjectInstance" valueRequired="true"
	 * @generated
	 */
	EClass getDataToObjectMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDataToObjectMap()
	 * @generated
	 */
	EReference getDataToObjectMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDataToObjectMap()
	 * @generated
	 */
	EReference getDataToObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry <em>Object Oriented View Required Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Oriented View Required Entry</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry
	 * @generated
	 */
	EClass getObjectOrientedViewRequiredEntry();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry#getRequiredObjectClass <em>Required Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Object Class</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry#getRequiredObjectClass()
	 * @see #getObjectOrientedViewRequiredEntry()
	 * @generated
	 */
	EReference getObjectOrientedViewRequiredEntry_RequiredObjectClass();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry <em>Unstructured View Required Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured View Required Entry</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry
	 * @generated
	 */
	EClass getUnstructuredViewRequiredEntry();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry#getData()
	 * @see #getUnstructuredViewRequiredEntry()
	 * @generated
	 */
	EReference getUnstructuredViewRequiredEntry_Data();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.RequiredReferenceProperty <em>Required Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Reference Property</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.RequiredReferenceProperty
	 * @generated
	 */
	EClass getRequiredReferenceProperty();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.RequiredReferenceProperty#getObjectorientedviewrequiredentry <em>Objectorientedviewrequiredentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objectorientedviewrequiredentry</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.RequiredReferenceProperty#getObjectorientedviewrequiredentry()
	 * @see #getRequiredReferenceProperty()
	 * @generated
	 */
	EReference getRequiredReferenceProperty_Objectorientedviewrequiredentry();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.RequiredDataEntry <em>Required Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Data Entry</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.RequiredDataEntry
	 * @generated
	 */
	EClass getRequiredDataEntry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataRepresentationFactory getDataRepresentationFactory();

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
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassImpl <em>Object Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectClass()
		 * @generated
		 */
		EClass OBJECT_CLASS = eINSTANCE.getObjectClass();

		/**
		 * The meta object literal for the '<em><b>Objectclassoperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS__OBJECTCLASSOPERATION = eINSTANCE.getObjectClass_Objectclassoperation();

		/**
		 * The meta object literal for the '<em><b>Objectclassinheritance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS__OBJECTCLASSINHERITANCE = eINSTANCE.getObjectClass_Objectclassinheritance();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS__DATA = eINSTANCE.getObjectClass_Data();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl <em>Object Class Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectClassOperation()
		 * @generated
		 */
		EClass OBJECT_CLASS_OPERATION = eINSTANCE.getObjectClassOperation();

		/**
		 * The meta object literal for the '<em><b>Objectclass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_OPERATION__OBJECTCLASS = eINSTANCE.getObjectClassOperation_Objectclass();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectInstanceImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectInstance()
		 * @generated
		 */
		EClass OBJECT_INSTANCE = eINSTANCE.getObjectInstance();

		/**
		 * The meta object literal for the '<em><b>Instantiated Object Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS = eINSTANCE.getObjectInstance_InstantiatedObjectClass();

		/**
		 * The meta object literal for the '<em><b>Object Assignment</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__OBJECT_ASSIGNMENT = eINSTANCE.getObjectInstance_ObjectAssignment();

		/**
		 * The meta object literal for the '<em><b>Data Value Setting</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__DATA_VALUE_SETTING = eINSTANCE.getObjectInstance_DataValueSetting();

		/**
		 * The meta object literal for the '<em><b>Enum Value Setting</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__ENUM_VALUE_SETTING = eINSTANCE.getObjectInstance_EnumValueSetting();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ClassReferencePropertyImpl <em>Class Reference Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.ClassReferencePropertyImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getClassReferenceProperty()
		 * @generated
		 */
		EClass CLASS_REFERENCE_PROPERTY = eINSTANCE.getClassReferenceProperty();

		/**
		 * The meta object literal for the '<em><b>Referenced Objectclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS = eINSTANCE.getClassReferenceProperty_ReferencedObjectclass();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewSimulationDataImpl <em>Object Oriented View Simulation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewSimulationDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectOrientedViewSimulationData()
		 * @generated
		 */
		EClass OBJECT_ORIENTED_VIEW_SIMULATION_DATA = eINSTANCE.getObjectOrientedViewSimulationData();

		/**
		 * The meta object literal for the '<em><b>Instancedobjects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS = eINSTANCE.getObjectOrientedViewSimulationData_Instancedobjects();

		/**
		 * The meta object literal for the '<em><b>Objectclassdefinitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS = eINSTANCE.getObjectOrientedViewSimulationData_Objectclassdefinitions();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.requiredDataInterfaceImpl <em>required Data Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.requiredDataInterfaceImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getrequiredDataInterface()
		 * @generated
		 */
		EClass REQUIRED_DATA_INTERFACE = eINSTANCE.getrequiredDataInterface();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_DATA_INTERFACE__PURPOSE = eINSTANCE.getrequiredDataInterface_Purpose();

		/**
		 * The meta object literal for the '<em><b>Requireddataentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY = eINSTANCE.getrequiredDataInterface_Requireddataentry();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.InstancedObjectsImpl <em>Instanced Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.InstancedObjectsImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getInstancedObjects()
		 * @generated
		 */
		EClass INSTANCED_OBJECTS = eINSTANCE.getInstancedObjects();

		/**
		 * The meta object literal for the '<em><b>Objectinstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCED_OBJECTS__OBJECTINSTANCE = eINSTANCE.getInstancedObjects_Objectinstance();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassDefinitionsImpl <em>Object Class Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassDefinitionsImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectClassDefinitions()
		 * @generated
		 */
		EClass OBJECT_CLASS_DEFINITIONS = eINSTANCE.getObjectClassDefinitions();

		/**
		 * The meta object literal for the '<em><b>Objectclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_DEFINITIONS__OBJECTCLASS = eINSTANCE.getObjectClassDefinitions_Objectclass();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassInheritanceImpl <em>Object Class Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassInheritanceImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectClassInheritance()
		 * @generated
		 */
		EClass OBJECT_CLASS_INHERITANCE = eINSTANCE.getObjectClassInheritance();

		/**
		 * The meta object literal for the '<em><b>Object Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_INHERITANCE__OBJECT_CLASS = eINSTANCE.getObjectClassInheritance_ObjectClass();

		/**
		 * The meta object literal for the '<em><b>Operationoverride</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE = eINSTANCE.getObjectClassInheritance_Operationoverride();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.OperationOverrideImpl <em>Operation Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.OperationOverrideImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getOperationOverride()
		 * @generated
		 */
		EClass OPERATION_OVERRIDE = eINSTANCE.getOperationOverride();

		/**
		 * The meta object literal for the '<em><b>Parent Class Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_OVERRIDE__PARENT_CLASS_OPERATION = eINSTANCE.getOperationOverride_ParentClassOperation();

		/**
		 * The meta object literal for the '<em><b>Overriding Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_OVERRIDE__OVERRIDING_OPERATION = eINSTANCE.getOperationOverride_OverridingOperation();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.SimulationDataImpl <em>Simulation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.SimulationDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getSimulationData()
		 * @generated
		 */
		EClass SIMULATION_DATA = eINSTANCE.getSimulationData();

		/**
		 * The meta object literal for the '<em><b>Requireddata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_DATA__REQUIREDDATA = eINSTANCE.getSimulationData_Requireddata();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.DataToValueMapImpl <em>Data To Value Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataToValueMapImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getDataToValueMap()
		 * @generated
		 */
		EClass DATA_TO_VALUE_MAP = eINSTANCE.getDataToValueMap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TO_VALUE_MAP__VALUE = eINSTANCE.getDataToValueMap_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TO_VALUE_MAP__KEY = eINSTANCE.getDataToValueMap_Key();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.EnumToEnumassignmentMapImpl <em>Enum To Enumassignment Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.EnumToEnumassignmentMapImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getEnumToEnumassignmentMap()
		 * @generated
		 */
		EClass ENUM_TO_ENUMASSIGNMENT_MAP = eINSTANCE.getEnumToEnumassignmentMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TO_ENUMASSIGNMENT_MAP__KEY = eINSTANCE.getEnumToEnumassignmentMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TO_ENUMASSIGNMENT_MAP__VALUE = eINSTANCE.getEnumToEnumassignmentMap_Value();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.DataToObjectMapImpl <em>Data To Object Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataToObjectMapImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getDataToObjectMap()
		 * @generated
		 */
		EClass DATA_TO_OBJECT_MAP = eINSTANCE.getDataToObjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TO_OBJECT_MAP__KEY = eINSTANCE.getDataToObjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TO_OBJECT_MAP__VALUE = eINSTANCE.getDataToObjectMap_Value();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewRequiredEntryImpl <em>Object Oriented View Required Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewRequiredEntryImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getObjectOrientedViewRequiredEntry()
		 * @generated
		 */
		EClass OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY = eINSTANCE.getObjectOrientedViewRequiredEntry();

		/**
		 * The meta object literal for the '<em><b>Required Object Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS = eINSTANCE.getObjectOrientedViewRequiredEntry_RequiredObjectClass();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.UnstructuredViewRequiredEntryImpl <em>Unstructured View Required Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.UnstructuredViewRequiredEntryImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getUnstructuredViewRequiredEntry()
		 * @generated
		 */
		EClass UNSTRUCTURED_VIEW_REQUIRED_ENTRY = eINSTANCE.getUnstructuredViewRequiredEntry();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRUCTURED_VIEW_REQUIRED_ENTRY__DATA = eINSTANCE.getUnstructuredViewRequiredEntry_Data();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.RequiredReferencePropertyImpl <em>Required Reference Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.RequiredReferencePropertyImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getRequiredReferenceProperty()
		 * @generated
		 */
		EClass REQUIRED_REFERENCE_PROPERTY = eINSTANCE.getRequiredReferenceProperty();

		/**
		 * The meta object literal for the '<em><b>Objectorientedviewrequiredentry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY = eINSTANCE.getRequiredReferenceProperty_Objectorientedviewrequiredentry();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.impl.RequiredDataEntryImpl <em>Required Data Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.RequiredDataEntryImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl#getRequiredDataEntry()
		 * @generated
		 */
		EClass REQUIRED_DATA_ENTRY = eINSTANCE.getRequiredDataEntry();

	}

} //DataRepresentationPackage
