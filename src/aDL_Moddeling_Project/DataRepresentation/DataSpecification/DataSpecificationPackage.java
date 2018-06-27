/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification;

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
 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface DataSpecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataSpecification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.DataRepresentation.DataSpecification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataSpecification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataSpecificationPackage eINSTANCE = aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.SemanticTypeImpl <em>Semantic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.SemanticTypeImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getSemanticType()
	 * @generated
	 */
	int SEMANTIC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_TYPE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_TYPE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_TYPE__SEMANTIC_DESCRIPTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_TYPE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Semantic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_TYPE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getData()
	 * @generated
	 */
	int DATA = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SEMANTIC_TYPE = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CONSTANT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.GeneralTypedDataImpl <em>General Typed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.GeneralTypedDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getGeneralTypedData()
	 * @generated
	 */
	int GENERAL_TYPED_DATA = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TYPED_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TYPED_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TYPED_DATA__SEMANTIC_TYPE = DATA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TYPED_DATA__CONSTANT = DATA__CONSTANT;

	/**
	 * The number of structural features of the '<em>General Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TYPED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TYPED_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CollectionTypedDataImpl <em>Collection Typed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CollectionTypedDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getCollectionTypedData()
	 * @generated
	 */
	int COLLECTION_TYPED_DATA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPED_DATA__ID = GENERAL_TYPED_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPED_DATA__NAME = GENERAL_TYPED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPED_DATA__SEMANTIC_TYPE = GENERAL_TYPED_DATA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPED_DATA__CONSTANT = GENERAL_TYPED_DATA__CONSTANT;

	/**
	 * The feature id for the '<em><b>Basedatatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPED_DATA__BASEDATATYPE = GENERAL_TYPED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPED_DATA_FEATURE_COUNT = GENERAL_TYPED_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPED_DATA_OPERATION_COUNT = GENERAL_TYPED_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.EnumTypedDataImpl <em>Enum Typed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.EnumTypedDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getEnumTypedData()
	 * @generated
	 */
	int ENUM_TYPED_DATA = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPED_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPED_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPED_DATA__SEMANTIC_TYPE = DATA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPED_DATA__CONSTANT = DATA__CONSTANT;

	/**
	 * The feature id for the '<em><b>Enumtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPED_DATA__ENUMTYPE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPED_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.BasicTypedDataImpl <em>Basic Typed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.BasicTypedDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getBasicTypedData()
	 * @generated
	 */
	int BASIC_TYPED_DATA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPED_DATA__ID = GENERAL_TYPED_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPED_DATA__NAME = GENERAL_TYPED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPED_DATA__SEMANTIC_TYPE = GENERAL_TYPED_DATA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPED_DATA__CONSTANT = GENERAL_TYPED_DATA__CONSTANT;

	/**
	 * The feature id for the '<em><b>Basedatatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPED_DATA__BASEDATATYPE = GENERAL_TYPED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPED_DATA_FEATURE_COUNT = GENERAL_TYPED_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPED_DATA_OPERATION_COUNT = GENERAL_TYPED_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.UnitTypedDataImpl <em>Unit Typed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.UnitTypedDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getUnitTypedData()
	 * @generated
	 */
	int UNIT_TYPED_DATA = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPED_DATA__ID = GENERAL_TYPED_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPED_DATA__NAME = GENERAL_TYPED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPED_DATA__SEMANTIC_TYPE = GENERAL_TYPED_DATA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPED_DATA__CONSTANT = GENERAL_TYPED_DATA__CONSTANT;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPED_DATA__UNIT = GENERAL_TYPED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPED_DATA_FEATURE_COUNT = GENERAL_TYPED_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPED_DATA_OPERATION_COUNT = GENERAL_TYPED_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CombinedTypedDataImpl <em>Combined Typed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CombinedTypedDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getCombinedTypedData()
	 * @generated
	 */
	int COMBINED_TYPED_DATA = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_TYPED_DATA__ID = GENERAL_TYPED_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_TYPED_DATA__NAME = GENERAL_TYPED_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_TYPED_DATA__SEMANTIC_TYPE = GENERAL_TYPED_DATA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_TYPED_DATA__CONSTANT = GENERAL_TYPED_DATA__CONSTANT;

	/**
	 * The feature id for the '<em><b>Combineddatatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_TYPED_DATA__COMBINEDDATATYPE = GENERAL_TYPED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combined Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_TYPED_DATA_FEATURE_COUNT = GENERAL_TYPED_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Combined Typed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_TYPED_DATA_OPERATION_COUNT = GENERAL_TYPED_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType <em>Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType
	 * @generated
	 */
	EClass getSemanticType();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType#getSemanticDescription <em>Semantic Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Description</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType#getSemanticDescription()
	 * @see #getSemanticType()
	 * @generated
	 */
	EAttribute getSemanticType_SemanticDescription();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.CollectionTypedData <em>Collection Typed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Typed Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.CollectionTypedData
	 * @generated
	 */
	EClass getCollectionTypedData();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.CollectionTypedData#getBasedatatype <em>Basedatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basedatatype</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.CollectionTypedData#getBasedatatype()
	 * @see #getCollectionTypedData()
	 * @generated
	 */
	EReference getCollectionTypedData_Basedatatype();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.EnumTypedData <em>Enum Typed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Typed Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.EnumTypedData
	 * @generated
	 */
	EClass getEnumTypedData();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.EnumTypedData#getEnumtype <em>Enumtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumtype</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.EnumTypedData#getEnumtype()
	 * @see #getEnumTypedData()
	 * @generated
	 */
	EReference getEnumTypedData_Enumtype();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.BasicTypedData <em>Basic Typed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Typed Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.BasicTypedData
	 * @generated
	 */
	EClass getBasicTypedData();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.BasicTypedData#getBasedatatype <em>Basedatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basedatatype</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.BasicTypedData#getBasedatatype()
	 * @see #getBasicTypedData()
	 * @generated
	 */
	EReference getBasicTypedData_Basedatatype();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.GeneralTypedData <em>General Typed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Typed Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.GeneralTypedData
	 * @generated
	 */
	EClass getGeneralTypedData();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.UnitTypedData <em>Unit Typed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Typed Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.UnitTypedData
	 * @generated
	 */
	EClass getUnitTypedData();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.UnitTypedData#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.UnitTypedData#getUnit()
	 * @see #getUnitTypedData()
	 * @generated
	 */
	EReference getUnitTypedData_Unit();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.CombinedTypedData <em>Combined Typed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Typed Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.CombinedTypedData
	 * @generated
	 */
	EClass getCombinedTypedData();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.CombinedTypedData#getCombineddatatype <em>Combineddatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combineddatatype</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.CombinedTypedData#getCombineddatatype()
	 * @see #getCombinedTypedData()
	 * @generated
	 */
	EReference getCombinedTypedData_Combineddatatype();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data#getSemanticType <em>Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semantic Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data#getSemanticType()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_SemanticType();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data#isConstant()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Constant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataSpecificationFactory getDataSpecificationFactory();

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
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.SemanticTypeImpl <em>Semantic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.SemanticTypeImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getSemanticType()
		 * @generated
		 */
		EClass SEMANTIC_TYPE = eINSTANCE.getSemanticType();

		/**
		 * The meta object literal for the '<em><b>Semantic Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_TYPE__SEMANTIC_DESCRIPTION = eINSTANCE.getSemanticType_SemanticDescription();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CollectionTypedDataImpl <em>Collection Typed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CollectionTypedDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getCollectionTypedData()
		 * @generated
		 */
		EClass COLLECTION_TYPED_DATA = eINSTANCE.getCollectionTypedData();

		/**
		 * The meta object literal for the '<em><b>Basedatatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPED_DATA__BASEDATATYPE = eINSTANCE.getCollectionTypedData_Basedatatype();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.EnumTypedDataImpl <em>Enum Typed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.EnumTypedDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getEnumTypedData()
		 * @generated
		 */
		EClass ENUM_TYPED_DATA = eINSTANCE.getEnumTypedData();

		/**
		 * The meta object literal for the '<em><b>Enumtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TYPED_DATA__ENUMTYPE = eINSTANCE.getEnumTypedData_Enumtype();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.BasicTypedDataImpl <em>Basic Typed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.BasicTypedDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getBasicTypedData()
		 * @generated
		 */
		EClass BASIC_TYPED_DATA = eINSTANCE.getBasicTypedData();

		/**
		 * The meta object literal for the '<em><b>Basedatatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_TYPED_DATA__BASEDATATYPE = eINSTANCE.getBasicTypedData_Basedatatype();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.GeneralTypedDataImpl <em>General Typed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.GeneralTypedDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getGeneralTypedData()
		 * @generated
		 */
		EClass GENERAL_TYPED_DATA = eINSTANCE.getGeneralTypedData();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.UnitTypedDataImpl <em>Unit Typed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.UnitTypedDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getUnitTypedData()
		 * @generated
		 */
		EClass UNIT_TYPED_DATA = eINSTANCE.getUnitTypedData();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TYPED_DATA__UNIT = eINSTANCE.getUnitTypedData_Unit();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CombinedTypedDataImpl <em>Combined Typed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CombinedTypedDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getCombinedTypedData()
		 * @generated
		 */
		EClass COMBINED_TYPED_DATA = eINSTANCE.getCombinedTypedData();

		/**
		 * The meta object literal for the '<em><b>Combineddatatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_TYPED_DATA__COMBINEDDATATYPE = eINSTANCE.getCombinedTypedData_Combineddatatype();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Semantic Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SEMANTIC_TYPE = eINSTANCE.getData_SemanticType();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__CONSTANT = eINSTANCE.getData_Constant();

	}

} //DataSpecificationPackage
