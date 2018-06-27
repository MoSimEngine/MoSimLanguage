/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement;

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
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementFactory
 * @model kind="package"
 * @generated
 */
public interface AssemblyAdditionEnhancementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AssemblyAdditionEnhancement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.Assembly.AdditionEnhancement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AssemblyAdditionEnhancement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyAdditionEnhancementPackage eINSTANCE = aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedInformationImpl <em>Addition Enhanced Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedInformationImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnhancedInformation()
	 * @generated
	 */
	int ADDITION_ENHANCED_INFORMATION = 7;

	/**
	 * The number of structural features of the '<em>Addition Enhanced Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Addition Enhanced Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.UnstructuredEnhancedInformationImpl <em>Unstructured Enhanced Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.UnstructuredEnhancedInformationImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getUnstructuredEnhancedInformation()
	 * @generated
	 */
	int UNSTRUCTURED_ENHANCED_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Additionenhancedoperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDOPERATION = ADDITION_ENHANCED_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additionenhanceddata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDDATA = ADDITION_ENHANCED_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unstructured Enhanced Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ENHANCED_INFORMATION_FEATURE_COUNT = ADDITION_ENHANCED_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unstructured Enhanced Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_ENHANCED_INFORMATION_OPERATION_COUNT = ADDITION_ENHANCED_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl <em>Addition Enchanced Object Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnchancedObjectClass()
	 * @generated
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Additionsetter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objectclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS__OBJECTCLASS = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Additionenhancedoperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDOPERATION = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Additionenhanceddata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDDATA = BasicPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Addition Enchanced Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Addition Enchanced Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENCHANCED_OBJECT_CLASS_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedOperationImpl <em>Addition Enhanced Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedOperationImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnhancedOperation()
	 * @generated
	 */
	int ADDITION_ENHANCED_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Additionsetter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION__ADDITIONSETTER = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION__ADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION__OPERATION = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Addition Enhanced Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Addition Enhanced Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.MappableDataImpl <em>Mappable Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.MappableDataImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getMappableData()
	 * @generated
	 */
	int MAPPABLE_DATA = 3;

	/**
	 * The number of structural features of the '<em>Mappable Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mappable Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.OverriddenAdditionEnhancedImpl <em>Overridden Addition Enhanced</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.OverriddenAdditionEnhancedImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getOverriddenAdditionEnhanced()
	 * @generated
	 */
	int OVERRIDDEN_ADDITION_ENHANCED = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_ADDITION_ENHANCED__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_ADDITION_ENHANCED__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Additionsetter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additionenhanced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_ADDITION_ENHANCED__ADDITIONENHANCED = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_ADDITION_ENHANCED__ADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Overridden Addition Enhanced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_ADDITION_ENHANCED_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Overridden Addition Enhanced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDDEN_ADDITION_ENHANCED_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedImpl <em>Addition Enhanced</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnhanced()
	 * @generated
	 */
	int ADDITION_ENHANCED = 5;

	/**
	 * The feature id for the '<em><b>Additionsetter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED__ADDITIONSETTER = MAPPABLE_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE = MAPPABLE_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Addition Enhanced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_FEATURE_COUNT = MAPPABLE_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Addition Enhanced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_OPERATION_COUNT = MAPPABLE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.ObjectBasedEnhancedInformationImpl <em>Object Based Enhanced Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.ObjectBasedEnhancedInformationImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getObjectBasedEnhancedInformation()
	 * @generated
	 */
	int OBJECT_BASED_ENHANCED_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Additionenchancedobjectclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BASED_ENHANCED_INFORMATION__ADDITIONENCHANCEDOBJECTCLASS = ADDITION_ENHANCED_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Based Enhanced Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BASED_ENHANCED_INFORMATION_FEATURE_COUNT = ADDITION_ENHANCED_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Based Enhanced Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BASED_ENHANCED_INFORMATION_OPERATION_COUNT = ADDITION_ENHANCED_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedDataImpl <em>Addition Enhanced Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedDataImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnhancedData()
	 * @generated
	 */
	int ADDITION_ENHANCED_DATA = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_DATA__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_DATA__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Additionsetter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_DATA__ADDITIONSETTER = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_DATA__ADDITIONINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_DATA__DATA = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Addition Enhanced Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_DATA_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Addition Enhanced Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENHANCED_DATA_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation <em>Unstructured Enhanced Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Enhanced Information</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation
	 * @generated
	 */
	EClass getUnstructuredEnhancedInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation#getAdditionenhancedoperation <em>Additionenhancedoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionenhancedoperation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation#getAdditionenhancedoperation()
	 * @see #getUnstructuredEnhancedInformation()
	 * @generated
	 */
	EReference getUnstructuredEnhancedInformation_Additionenhancedoperation();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation#getAdditionenhanceddata <em>Additionenhanceddata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionenhanceddata</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation#getAdditionenhanceddata()
	 * @see #getUnstructuredEnhancedInformation()
	 * @generated
	 */
	EReference getUnstructuredEnhancedInformation_Additionenhanceddata();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass <em>Addition Enchanced Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Enchanced Object Class</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass
	 * @generated
	 */
	EClass getAdditionEnchancedObjectClass();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getObjectclass <em>Objectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objectclass</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getObjectclass()
	 * @see #getAdditionEnchancedObjectClass()
	 * @generated
	 */
	EReference getAdditionEnchancedObjectClass_Objectclass();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditioninterface <em>Additioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditioninterface()
	 * @see #getAdditionEnchancedObjectClass()
	 * @generated
	 */
	EReference getAdditionEnchancedObjectClass_Additioninterface();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditionenhancedoperation <em>Additionenhancedoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionenhancedoperation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditionenhancedoperation()
	 * @see #getAdditionEnchancedObjectClass()
	 * @generated
	 */
	EReference getAdditionEnchancedObjectClass_Additionenhancedoperation();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditionenhanceddata <em>Additionenhanceddata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionenhanceddata</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditionenhanceddata()
	 * @see #getAdditionEnchancedObjectClass()
	 * @generated
	 */
	EReference getAdditionEnchancedObjectClass_Additionenhanceddata();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation <em>Addition Enhanced Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Enhanced Operation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation
	 * @generated
	 */
	EClass getAdditionEnhancedOperation();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation#getAdditioninterface <em>Additioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation#getAdditioninterface()
	 * @see #getAdditionEnhancedOperation()
	 * @generated
	 */
	EReference getAdditionEnhancedOperation_Additioninterface();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation#getOperation()
	 * @see #getAdditionEnhancedOperation()
	 * @generated
	 */
	EReference getAdditionEnhancedOperation_Operation();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.MappableData <em>Mappable Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mappable Data</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.MappableData
	 * @generated
	 */
	EClass getMappableData();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.OverriddenAdditionEnhanced <em>Overridden Addition Enhanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overridden Addition Enhanced</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.OverriddenAdditionEnhanced
	 * @generated
	 */
	EClass getOverriddenAdditionEnhanced();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.OverriddenAdditionEnhanced#getAdditionenhanced <em>Additionenhanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additionenhanced</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.OverriddenAdditionEnhanced#getAdditionenhanced()
	 * @see #getOverriddenAdditionEnhanced()
	 * @generated
	 */
	EReference getOverriddenAdditionEnhanced_Additionenhanced();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.OverriddenAdditionEnhanced#getAdditioninterface <em>Additioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.OverriddenAdditionEnhanced#getAdditioninterface()
	 * @see #getOverriddenAdditionEnhanced()
	 * @generated
	 */
	EReference getOverriddenAdditionEnhanced_Additioninterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced <em>Addition Enhanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Enhanced</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced
	 * @generated
	 */
	EClass getAdditionEnhanced();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced#getAdditionsetter <em>Additionsetter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionsetter</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced#getAdditionsetter()
	 * @see #getAdditionEnhanced()
	 * @generated
	 */
	EReference getAdditionEnhanced_Additionsetter();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced#getReferencedAdditioninterface <em>Referenced Additioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Additioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced#getReferencedAdditioninterface()
	 * @see #getAdditionEnhanced()
	 * @generated
	 */
	EReference getAdditionEnhanced_ReferencedAdditioninterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.ObjectBasedEnhancedInformation <em>Object Based Enhanced Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Based Enhanced Information</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.ObjectBasedEnhancedInformation
	 * @generated
	 */
	EClass getObjectBasedEnhancedInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.ObjectBasedEnhancedInformation#getAdditionenchancedobjectclass <em>Additionenchancedobjectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionenchancedobjectclass</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.ObjectBasedEnhancedInformation#getAdditionenchancedobjectclass()
	 * @see #getObjectBasedEnhancedInformation()
	 * @generated
	 */
	EReference getObjectBasedEnhancedInformation_Additionenchancedobjectclass();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedInformation <em>Addition Enhanced Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Enhanced Information</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedInformation
	 * @generated
	 */
	EClass getAdditionEnhancedInformation();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData <em>Addition Enhanced Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Enhanced Data</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData
	 * @generated
	 */
	EClass getAdditionEnhancedData();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData#getAdditioninterface <em>Additioninterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additioninterface</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData#getAdditioninterface()
	 * @see #getAdditionEnhancedData()
	 * @generated
	 */
	EReference getAdditionEnhancedData_Additioninterface();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData#getData()
	 * @see #getAdditionEnhancedData()
	 * @generated
	 */
	EReference getAdditionEnhancedData_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyAdditionEnhancementFactory getAssemblyAdditionEnhancementFactory();

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
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.UnstructuredEnhancedInformationImpl <em>Unstructured Enhanced Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.UnstructuredEnhancedInformationImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getUnstructuredEnhancedInformation()
		 * @generated
		 */
		EClass UNSTRUCTURED_ENHANCED_INFORMATION = eINSTANCE.getUnstructuredEnhancedInformation();

		/**
		 * The meta object literal for the '<em><b>Additionenhancedoperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDOPERATION = eINSTANCE.getUnstructuredEnhancedInformation_Additionenhancedoperation();

		/**
		 * The meta object literal for the '<em><b>Additionenhanceddata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDDATA = eINSTANCE.getUnstructuredEnhancedInformation_Additionenhanceddata();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl <em>Addition Enchanced Object Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnchancedObjectClass()
		 * @generated
		 */
		EClass ADDITION_ENCHANCED_OBJECT_CLASS = eINSTANCE.getAdditionEnchancedObjectClass();

		/**
		 * The meta object literal for the '<em><b>Objectclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENCHANCED_OBJECT_CLASS__OBJECTCLASS = eINSTANCE.getAdditionEnchancedObjectClass_Objectclass();

		/**
		 * The meta object literal for the '<em><b>Additioninterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONINTERFACE = eINSTANCE.getAdditionEnchancedObjectClass_Additioninterface();

		/**
		 * The meta object literal for the '<em><b>Additionenhancedoperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDOPERATION = eINSTANCE.getAdditionEnchancedObjectClass_Additionenhancedoperation();

		/**
		 * The meta object literal for the '<em><b>Additionenhanceddata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDDATA = eINSTANCE.getAdditionEnchancedObjectClass_Additionenhanceddata();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedOperationImpl <em>Addition Enhanced Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedOperationImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnhancedOperation()
		 * @generated
		 */
		EClass ADDITION_ENHANCED_OPERATION = eINSTANCE.getAdditionEnhancedOperation();

		/**
		 * The meta object literal for the '<em><b>Additioninterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENHANCED_OPERATION__ADDITIONINTERFACE = eINSTANCE.getAdditionEnhancedOperation_Additioninterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENHANCED_OPERATION__OPERATION = eINSTANCE.getAdditionEnhancedOperation_Operation();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.MappableDataImpl <em>Mappable Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.MappableDataImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getMappableData()
		 * @generated
		 */
		EClass MAPPABLE_DATA = eINSTANCE.getMappableData();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.OverriddenAdditionEnhancedImpl <em>Overridden Addition Enhanced</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.OverriddenAdditionEnhancedImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getOverriddenAdditionEnhanced()
		 * @generated
		 */
		EClass OVERRIDDEN_ADDITION_ENHANCED = eINSTANCE.getOverriddenAdditionEnhanced();

		/**
		 * The meta object literal for the '<em><b>Additionenhanced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERRIDDEN_ADDITION_ENHANCED__ADDITIONENHANCED = eINSTANCE.getOverriddenAdditionEnhanced_Additionenhanced();

		/**
		 * The meta object literal for the '<em><b>Additioninterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERRIDDEN_ADDITION_ENHANCED__ADDITIONINTERFACE = eINSTANCE.getOverriddenAdditionEnhanced_Additioninterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedImpl <em>Addition Enhanced</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnhanced()
		 * @generated
		 */
		EClass ADDITION_ENHANCED = eINSTANCE.getAdditionEnhanced();

		/**
		 * The meta object literal for the '<em><b>Additionsetter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENHANCED__ADDITIONSETTER = eINSTANCE.getAdditionEnhanced_Additionsetter();

		/**
		 * The meta object literal for the '<em><b>Referenced Additioninterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE = eINSTANCE.getAdditionEnhanced_ReferencedAdditioninterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.ObjectBasedEnhancedInformationImpl <em>Object Based Enhanced Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.ObjectBasedEnhancedInformationImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getObjectBasedEnhancedInformation()
		 * @generated
		 */
		EClass OBJECT_BASED_ENHANCED_INFORMATION = eINSTANCE.getObjectBasedEnhancedInformation();

		/**
		 * The meta object literal for the '<em><b>Additionenchancedobjectclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_BASED_ENHANCED_INFORMATION__ADDITIONENCHANCEDOBJECTCLASS = eINSTANCE.getObjectBasedEnhancedInformation_Additionenchancedobjectclass();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedInformationImpl <em>Addition Enhanced Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedInformationImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnhancedInformation()
		 * @generated
		 */
		EClass ADDITION_ENHANCED_INFORMATION = eINSTANCE.getAdditionEnhancedInformation();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedDataImpl <em>Addition Enhanced Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedDataImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl#getAdditionEnhancedData()
		 * @generated
		 */
		EClass ADDITION_ENHANCED_DATA = eINSTANCE.getAdditionEnhancedData();

		/**
		 * The meta object literal for the '<em><b>Additioninterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENHANCED_DATA__ADDITIONINTERFACE = eINSTANCE.getAdditionEnhancedData_Additioninterface();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION_ENHANCED_DATA__DATA = eINSTANCE.getAdditionEnhancedData_Data();

	}

} //AssemblyAdditionEnhancementPackage
