/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;

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
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesFactory
 * @model kind="package"
 * @generated
 */
public interface ManagementServicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ManagementServices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.ManagementServices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ManagementServices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManagementServicesPackage eINSTANCE = aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl <em>Management Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getManagementService()
	 * @generated
	 */
	int MANAGEMENT_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE__MANAGEMENTSERVICE = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msefacility</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE__MSEFACILITY = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Management Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Management Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceSupportEntityImpl <em>Management Service Support Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceSupportEntityImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getManagementServiceSupportEntity()
	 * @generated
	 */
	int MANAGEMENT_SERVICE_SUPPORT_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_SUPPORT_ENTITY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_SUPPORT_ENTITY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Management Service Support Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_SUPPORT_ENTITY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Management Service Support Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_SUPPORT_ENTITY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceFunctionImpl <em>Management Service Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceFunctionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getManagementServiceFunction()
	 * @generated
	 */
	int MANAGEMENT_SERVICE_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION__ID = OperationModelPackage.OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION__NAME = OperationModelPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION__PRECONDITION = OperationModelPackage.OPERATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION__PARAMETERS = OperationModelPackage.OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Operationexecutioneffect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION__OPERATIONEXECUTIONEFFECT = OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION__POSTCONDITION = OperationModelPackage.OPERATION__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION__RETURN_TYPE = OperationModelPackage.OPERATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Printable Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION__PRINTABLE_DESCRIPTION = OperationModelPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Management Service Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION_FEATURE_COUNT = OperationModelPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Management Service Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_FUNCTION_OPERATION_COUNT = OperationModelPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceInterfaceImpl <em>Management Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getManagementServiceInterface()
	 * @generated
	 */
	int MANAGEMENT_SERVICE_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_INTERFACE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_INTERFACE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Managementservicefunction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Management Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_INTERFACE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Management Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SERVICE_INTERFACE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MSEPropertyAdditionContainerImpl <em>MSE Property Addition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MSEPropertyAdditionContainerImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getMSEPropertyAdditionContainer()
	 * @generated
	 */
	int MSE_PROPERTY_ADDITION_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_PROPERTY_ADDITION_CONTAINER__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_PROPERTY_ADDITION_CONTAINER__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_PROPERTY_ADDITION_CONTAINER__OPTIONAL = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSE Property Addition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_PROPERTY_ADDITION_CONTAINER_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MSE Property Addition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSE_PROPERTY_ADDITION_CONTAINER_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.additionValueImpl <em>addition Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.additionValueImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getadditionValue()
	 * @generated
	 */
	int ADDITION_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_VALUE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_VALUE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>addition Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_VALUE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>addition Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_VALUE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionSetterImpl <em>Addition Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionSetterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getAdditionSetter()
	 * @generated
	 */
	int ADDITION_SETTER = 11;

	/**
	 * The number of structural features of the '<em>Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_SETTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_SETTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSelectionAdditionSetterImpl <em>Multiple Selection Addition Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSelectionAdditionSetterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getMultipleSelectionAdditionSetter()
	 * @generated
	 */
	int MULTIPLE_SELECTION_ADDITION_SETTER = 6;

	/**
	 * The feature id for the '<em><b>Selectableadditionvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE = ADDITION_SETTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplesettableaddition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION = ADDITION_SETTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Selection Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SELECTION_ADDITION_SETTER_FEATURE_COUNT = ADDITION_SETTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Selection Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SELECTION_ADDITION_SETTER_OPERATION_COUNT = ADDITION_SETTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSelectionAdditionSetterImpl <em>Exclusive Selection Addition Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSelectionAdditionSetterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getExclusiveSelectionAdditionSetter()
	 * @generated
	 */
	int EXCLUSIVE_SELECTION_ADDITION_SETTER = 7;

	/**
	 * The feature id for the '<em><b>Selectableadditionvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE = ADDITION_SETTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclusivesettableaddition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION = ADDITION_SETTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exclusive Selection Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SELECTION_ADDITION_SETTER_FEATURE_COUNT = ADDITION_SETTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exclusive Selection Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SELECTION_ADDITION_SETTER_OPERATION_COUNT = ADDITION_SETTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.SelectableAdditionImpl <em>Selectable Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.SelectableAdditionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getSelectableAddition()
	 * @generated
	 */
	int SELECTABLE_ADDITION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_ADDITION__ID = MSE_PROPERTY_ADDITION_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_ADDITION__NAME = MSE_PROPERTY_ADDITION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_ADDITION__OPTIONAL = MSE_PROPERTY_ADDITION_CONTAINER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Additionvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_ADDITION__ADDITIONVALUE = MSE_PROPERTY_ADDITION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selectable Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_ADDITION_FEATURE_COUNT = MSE_PROPERTY_ADDITION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selectable Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_ADDITION_OPERATION_COUNT = MSE_PROPERTY_ADDITION_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionImpl <em>Combined Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getCombinedAddition()
	 * @generated
	 */
	int COMBINED_ADDITION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION__ID = MSE_PROPERTY_ADDITION_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION__NAME = MSE_PROPERTY_ADDITION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION__OPTIONAL = MSE_PROPERTY_ADDITION_CONTAINER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Msepropertyaddition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION__MSEPROPERTYADDITION = MSE_PROPERTY_ADDITION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combined Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION_FEATURE_COUNT = MSE_PROPERTY_ADDITION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Combined Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION_OPERATION_COUNT = MSE_PROPERTY_ADDITION_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionSetterImpl <em>Combined Addition Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionSetterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getCombinedAdditionSetter()
	 * @generated
	 */
	int COMBINED_ADDITION_SETTER = 10;

	/**
	 * The feature id for the '<em><b>Combinedadditions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION_SETTER__COMBINEDADDITIONS = ADDITION_SETTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Addition Setters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION_SETTER__ADDITION_SETTERS = ADDITION_SETTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combined Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION_SETTER_FEATURE_COUNT = ADDITION_SETTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Combined Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_ADDITION_SETTER_OPERATION_COUNT = ADDITION_SETTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSettableAdditionImpl <em>Exclusive Settable Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSettableAdditionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getExclusiveSettableAddition()
	 * @generated
	 */
	int EXCLUSIVE_SETTABLE_ADDITION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SETTABLE_ADDITION__ID = SELECTABLE_ADDITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SETTABLE_ADDITION__NAME = SELECTABLE_ADDITION__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SETTABLE_ADDITION__OPTIONAL = SELECTABLE_ADDITION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Additionvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SETTABLE_ADDITION__ADDITIONVALUE = SELECTABLE_ADDITION__ADDITIONVALUE;

	/**
	 * The number of structural features of the '<em>Exclusive Settable Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SETTABLE_ADDITION_FEATURE_COUNT = SELECTABLE_ADDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusive Settable Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_SETTABLE_ADDITION_OPERATION_COUNT = SELECTABLE_ADDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSettableAdditionImpl <em>Multiple Settable Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSettableAdditionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getMultipleSettableAddition()
	 * @generated
	 */
	int MULTIPLE_SETTABLE_ADDITION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SETTABLE_ADDITION__ID = SELECTABLE_ADDITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SETTABLE_ADDITION__NAME = SELECTABLE_ADDITION__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SETTABLE_ADDITION__OPTIONAL = SELECTABLE_ADDITION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Additionvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SETTABLE_ADDITION__ADDITIONVALUE = SELECTABLE_ADDITION__ADDITIONVALUE;

	/**
	 * The number of structural features of the '<em>Multiple Settable Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SETTABLE_ADDITION_FEATURE_COUNT = SELECTABLE_ADDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiple Settable Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SETTABLE_ADDITION_OPERATION_COUNT = SELECTABLE_ADDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionEnhanceableEntityImpl <em>Addition Enhanceable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionEnhanceableEntityImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getAdditionEnhanceableEntity()
	 * @generated
	 */
	int ADDITION_ENHANCEABLE_ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCEABLE_ENTITY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCEABLE_ENTITY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Addition Enhanceable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition Enhanceable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCEABLE_ENTITY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionImpl <em>Writable Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getWritableAddition()
	 * @generated
	 */
	int WRITABLE_ADDITION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION__ID = MSE_PROPERTY_ADDITION_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION__NAME = MSE_PROPERTY_ADDITION_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION__OPTIONAL = MSE_PROPERTY_ADDITION_CONTAINER__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Writable Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION_FEATURE_COUNT = MSE_PROPERTY_ADDITION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Writable Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION_OPERATION_COUNT = MSE_PROPERTY_ADDITION_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionSetterImpl <em>Writable Addition Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionSetterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getWritableAdditionSetter()
	 * @generated
	 */
	int WRITABLE_ADDITION_SETTER = 16;

	/**
	 * The feature id for the '<em><b>Writableaddition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION_SETTER__WRITABLEADDITION = ADDITION_SETTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION_SETTER__VALUE_CONTENT = ADDITION_SETTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Writable Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION_SETTER_FEATURE_COUNT = ADDITION_SETTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Writable Addition Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITABLE_ADDITION_SETTER_OPERATION_COUNT = ADDITION_SETTER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService <em>Management Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Service</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService
	 * @generated
	 */
	EClass getManagementService();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementservice <em>Managementservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Managementservice</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementservice()
	 * @see #getManagementService()
	 * @generated
	 */
	EReference getManagementService_Managementservice();

	/**
	 * Returns the meta object for the container reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsefacility <em>Msefacility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Msefacility</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsefacility()
	 * @see #getManagementService()
	 * @generated
	 */
	EReference getManagementService_Msefacility();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementservicesupportentity <em>Managementservicesupportentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managementservicesupportentity</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementservicesupportentity()
	 * @see #getManagementService()
	 * @generated
	 */
	EReference getManagementService_Managementservicesupportentity();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementserviceinterface <em>Managementserviceinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Managementserviceinterface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementserviceinterface()
	 * @see #getManagementService()
	 * @generated
	 */
	EReference getManagementService_Managementserviceinterface();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsepropertyadditioncontainer <em>Msepropertyadditioncontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msepropertyadditioncontainer</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsepropertyadditioncontainer()
	 * @see #getManagementService()
	 * @generated
	 */
	EReference getManagementService_Msepropertyadditioncontainer();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceSupportEntity <em>Management Service Support Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Service Support Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceSupportEntity
	 * @generated
	 */
	EClass getManagementServiceSupportEntity();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction <em>Management Service Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Service Function</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction
	 * @generated
	 */
	EClass getManagementServiceFunction();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction#getPrintableDescription <em>Printable Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printable Description</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction#getPrintableDescription()
	 * @see #getManagementServiceFunction()
	 * @generated
	 */
	EAttribute getManagementServiceFunction_PrintableDescription();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface <em>Management Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Service Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface
	 * @generated
	 */
	EClass getManagementServiceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface#getManagementservicefunction <em>Managementservicefunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managementservicefunction</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface#getManagementservicefunction()
	 * @see #getManagementServiceInterface()
	 * @generated
	 */
	EReference getManagementServiceInterface_Managementservicefunction();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer <em>MSE Property Addition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSE Property Addition Container</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer
	 * @generated
	 */
	EClass getMSEPropertyAdditionContainer();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer#isOptional()
	 * @see #getMSEPropertyAdditionContainer()
	 * @generated
	 */
	EAttribute getMSEPropertyAdditionContainer_Optional();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue <em>addition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>addition Value</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue
	 * @generated
	 */
	EClass getadditionValue();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter <em>Multiple Selection Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Selection Addition Setter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter
	 * @generated
	 */
	EClass getMultipleSelectionAdditionSetter();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter#getSelectableadditionvalue <em>Selectableadditionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectableadditionvalue</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter#getSelectableadditionvalue()
	 * @see #getMultipleSelectionAdditionSetter()
	 * @generated
	 */
	EReference getMultipleSelectionAdditionSetter_Selectableadditionvalue();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter#getMultiplesettableaddition <em>Multiplesettableaddition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multiplesettableaddition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter#getMultiplesettableaddition()
	 * @see #getMultipleSelectionAdditionSetter()
	 * @generated
	 */
	EReference getMultipleSelectionAdditionSetter_Multiplesettableaddition();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter <em>Exclusive Selection Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Selection Addition Setter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter
	 * @generated
	 */
	EClass getExclusiveSelectionAdditionSetter();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter#getSelectableadditionvalue <em>Selectableadditionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selectableadditionvalue</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter#getSelectableadditionvalue()
	 * @see #getExclusiveSelectionAdditionSetter()
	 * @generated
	 */
	EReference getExclusiveSelectionAdditionSetter_Selectableadditionvalue();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter#getExclusivesettableaddition <em>Exclusivesettableaddition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exclusivesettableaddition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter#getExclusivesettableaddition()
	 * @see #getExclusiveSelectionAdditionSetter()
	 * @generated
	 */
	EReference getExclusiveSelectionAdditionSetter_Exclusivesettableaddition();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition <em>Selectable Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable Addition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition
	 * @generated
	 */
	EClass getSelectableAddition();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition#getAdditionvalue <em>Additionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionvalue</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition#getAdditionvalue()
	 * @see #getSelectableAddition()
	 * @generated
	 */
	EReference getSelectableAddition_Additionvalue();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition <em>Combined Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Addition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition
	 * @generated
	 */
	EClass getCombinedAddition();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition#getMsepropertyaddition <em>Msepropertyaddition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msepropertyaddition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition#getMsepropertyaddition()
	 * @see #getCombinedAddition()
	 * @generated
	 */
	EReference getCombinedAddition_Msepropertyaddition();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter <em>Combined Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Addition Setter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter
	 * @generated
	 */
	EClass getCombinedAdditionSetter();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter#getCombinedadditions <em>Combinedadditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combinedadditions</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter#getCombinedadditions()
	 * @see #getCombinedAdditionSetter()
	 * @generated
	 */
	EReference getCombinedAdditionSetter_Combinedadditions();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter#getAdditionSetters <em>Addition Setters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addition Setters</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter#getAdditionSetters()
	 * @see #getCombinedAdditionSetter()
	 * @generated
	 */
	EReference getCombinedAdditionSetter_AdditionSetters();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter <em>Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Setter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter
	 * @generated
	 */
	EClass getAdditionSetter();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSettableAddition <em>Exclusive Settable Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Settable Addition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSettableAddition
	 * @generated
	 */
	EClass getExclusiveSettableAddition();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSettableAddition <em>Multiple Settable Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Settable Addition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSettableAddition
	 * @generated
	 */
	EClass getMultipleSettableAddition();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity <em>Addition Enhanceable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Enhanceable Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity
	 * @generated
	 */
	EClass getAdditionEnhanceableEntity();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAddition <em>Writable Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writable Addition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAddition
	 * @generated
	 */
	EClass getWritableAddition();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter <em>Writable Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writable Addition Setter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter
	 * @generated
	 */
	EClass getWritableAdditionSetter();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter#getWritableaddition <em>Writableaddition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Writableaddition</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter#getWritableaddition()
	 * @see #getWritableAdditionSetter()
	 * @generated
	 */
	EReference getWritableAdditionSetter_Writableaddition();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter#getValueContent <em>Value Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Content</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter#getValueContent()
	 * @see #getWritableAdditionSetter()
	 * @generated
	 */
	EAttribute getWritableAdditionSetter_ValueContent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManagementServicesFactory getManagementServicesFactory();

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
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl <em>Management Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getManagementService()
		 * @generated
		 */
		EClass MANAGEMENT_SERVICE = eINSTANCE.getManagementService();

		/**
		 * The meta object literal for the '<em><b>Managementservice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SERVICE__MANAGEMENTSERVICE = eINSTANCE.getManagementService_Managementservice();

		/**
		 * The meta object literal for the '<em><b>Msefacility</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SERVICE__MSEFACILITY = eINSTANCE.getManagementService_Msefacility();

		/**
		 * The meta object literal for the '<em><b>Managementservicesupportentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY = eINSTANCE.getManagementService_Managementservicesupportentity();

		/**
		 * The meta object literal for the '<em><b>Managementserviceinterface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE = eINSTANCE.getManagementService_Managementserviceinterface();

		/**
		 * The meta object literal for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER = eINSTANCE.getManagementService_Msepropertyadditioncontainer();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceSupportEntityImpl <em>Management Service Support Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceSupportEntityImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getManagementServiceSupportEntity()
		 * @generated
		 */
		EClass MANAGEMENT_SERVICE_SUPPORT_ENTITY = eINSTANCE.getManagementServiceSupportEntity();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceFunctionImpl <em>Management Service Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceFunctionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getManagementServiceFunction()
		 * @generated
		 */
		EClass MANAGEMENT_SERVICE_FUNCTION = eINSTANCE.getManagementServiceFunction();

		/**
		 * The meta object literal for the '<em><b>Printable Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGEMENT_SERVICE_FUNCTION__PRINTABLE_DESCRIPTION = eINSTANCE.getManagementServiceFunction_PrintableDescription();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceInterfaceImpl <em>Management Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getManagementServiceInterface()
		 * @generated
		 */
		EClass MANAGEMENT_SERVICE_INTERFACE = eINSTANCE.getManagementServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Managementservicefunction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION = eINSTANCE.getManagementServiceInterface_Managementservicefunction();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MSEPropertyAdditionContainerImpl <em>MSE Property Addition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MSEPropertyAdditionContainerImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getMSEPropertyAdditionContainer()
		 * @generated
		 */
		EClass MSE_PROPERTY_ADDITION_CONTAINER = eINSTANCE.getMSEPropertyAdditionContainer();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSE_PROPERTY_ADDITION_CONTAINER__OPTIONAL = eINSTANCE.getMSEPropertyAdditionContainer_Optional();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.additionValueImpl <em>addition Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.additionValueImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getadditionValue()
		 * @generated
		 */
		EClass ADDITION_VALUE = eINSTANCE.getadditionValue();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSelectionAdditionSetterImpl <em>Multiple Selection Addition Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSelectionAdditionSetterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getMultipleSelectionAdditionSetter()
		 * @generated
		 */
		EClass MULTIPLE_SELECTION_ADDITION_SETTER = eINSTANCE.getMultipleSelectionAdditionSetter();

		/**
		 * The meta object literal for the '<em><b>Selectableadditionvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE = eINSTANCE.getMultipleSelectionAdditionSetter_Selectableadditionvalue();

		/**
		 * The meta object literal for the '<em><b>Multiplesettableaddition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION = eINSTANCE.getMultipleSelectionAdditionSetter_Multiplesettableaddition();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSelectionAdditionSetterImpl <em>Exclusive Selection Addition Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSelectionAdditionSetterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getExclusiveSelectionAdditionSetter()
		 * @generated
		 */
		EClass EXCLUSIVE_SELECTION_ADDITION_SETTER = eINSTANCE.getExclusiveSelectionAdditionSetter();

		/**
		 * The meta object literal for the '<em><b>Selectableadditionvalue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE = eINSTANCE.getExclusiveSelectionAdditionSetter_Selectableadditionvalue();

		/**
		 * The meta object literal for the '<em><b>Exclusivesettableaddition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION = eINSTANCE.getExclusiveSelectionAdditionSetter_Exclusivesettableaddition();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.SelectableAdditionImpl <em>Selectable Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.SelectableAdditionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getSelectableAddition()
		 * @generated
		 */
		EClass SELECTABLE_ADDITION = eINSTANCE.getSelectableAddition();

		/**
		 * The meta object literal for the '<em><b>Additionvalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTABLE_ADDITION__ADDITIONVALUE = eINSTANCE.getSelectableAddition_Additionvalue();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionImpl <em>Combined Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getCombinedAddition()
		 * @generated
		 */
		EClass COMBINED_ADDITION = eINSTANCE.getCombinedAddition();

		/**
		 * The meta object literal for the '<em><b>Msepropertyaddition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_ADDITION__MSEPROPERTYADDITION = eINSTANCE.getCombinedAddition_Msepropertyaddition();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionSetterImpl <em>Combined Addition Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionSetterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getCombinedAdditionSetter()
		 * @generated
		 */
		EClass COMBINED_ADDITION_SETTER = eINSTANCE.getCombinedAdditionSetter();

		/**
		 * The meta object literal for the '<em><b>Combinedadditions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_ADDITION_SETTER__COMBINEDADDITIONS = eINSTANCE.getCombinedAdditionSetter_Combinedadditions();

		/**
		 * The meta object literal for the '<em><b>Addition Setters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_ADDITION_SETTER__ADDITION_SETTERS = eINSTANCE.getCombinedAdditionSetter_AdditionSetters();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionSetterImpl <em>Addition Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionSetterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getAdditionSetter()
		 * @generated
		 */
		EClass ADDITION_SETTER = eINSTANCE.getAdditionSetter();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSettableAdditionImpl <em>Exclusive Settable Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSettableAdditionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getExclusiveSettableAddition()
		 * @generated
		 */
		EClass EXCLUSIVE_SETTABLE_ADDITION = eINSTANCE.getExclusiveSettableAddition();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSettableAdditionImpl <em>Multiple Settable Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSettableAdditionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getMultipleSettableAddition()
		 * @generated
		 */
		EClass MULTIPLE_SETTABLE_ADDITION = eINSTANCE.getMultipleSettableAddition();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionEnhanceableEntityImpl <em>Addition Enhanceable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionEnhanceableEntityImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getAdditionEnhanceableEntity()
		 * @generated
		 */
		EClass ADDITION_ENHANCEABLE_ENTITY = eINSTANCE.getAdditionEnhanceableEntity();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionImpl <em>Writable Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getWritableAddition()
		 * @generated
		 */
		EClass WRITABLE_ADDITION = eINSTANCE.getWritableAddition();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionSetterImpl <em>Writable Addition Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionSetterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl#getWritableAdditionSetter()
		 * @generated
		 */
		EClass WRITABLE_ADDITION_SETTER = eINSTANCE.getWritableAdditionSetter();

		/**
		 * The meta object literal for the '<em><b>Writableaddition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITABLE_ADDITION_SETTER__WRITABLEADDITION = eINSTANCE.getWritableAdditionSetter_Writableaddition();

		/**
		 * The meta object literal for the '<em><b>Value Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITABLE_ADDITION_SETTER__VALUE_CONTENT = eINSTANCE.getWritableAdditionSetter_ValueContent();

	}

} //ManagementServicesPackage
