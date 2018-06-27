/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

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
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.DataRepresentation.DataTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesPackage eINSTANCE = aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeSpecificationImpl <em>Data Type Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeSpecificationImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getDataTypeSpecification()
	 * @generated
	 */
	int DATA_TYPE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SPECIFICATION__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SPECIFICATION__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SPECIFICATION__DATA_SEMANTICS = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SPECIFICATION_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SPECIFICATION_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.EnumLiteralImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__LITERAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__LITERAL_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.RangeImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 2;

	/**
	 * The feature id for the '<em><b>Lower Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__LOWER_BOUNDS = 0;

	/**
	 * The feature id for the '<em><b>Upper Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__UPPER_BOUNDS = 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = DATA_TYPE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = DATA_TYPE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATA_SEMANTICS = DATA_TYPE_SPECIFICATION__DATA_SEMANTICS;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = DATA_TYPE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = DATA_TYPE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.BaseDataTypeImpl <em>Base Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.BaseDataTypeImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getBaseDataType()
	 * @generated
	 */
	int BASE_DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__DATA_SEMANTICS = DATA_TYPE__DATA_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__STEP_SIZE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__INITIAL_VALUE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primitive Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__PRIMITIVE_DATA_TYPE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Base Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Base Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitTypeContainerImpl <em>Unit Type Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitTypeContainerImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getUnitTypeContainer()
	 * @generated
	 */
	int UNIT_TYPE_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_CONTAINER__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_CONTAINER__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_CONTAINER__UNIT = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Type Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_CONTAINER_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit Type Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_CONTAINER_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ID = DATA_TYPE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = DATA_TYPE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DATA_SEMANTICS = DATA_TYPE_SPECIFICATION__DATA_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Basedatatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__BASEDATATYPE = DATA_TYPE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UNIT_SYMBOL = DATA_TYPE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unittypecontainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UNITTYPECONTAINER = DATA_TYPE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__RANGE = DATA_TYPE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = DATA_TYPE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = DATA_TYPE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.EnumTypeImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__DATA_SEMANTICS = DATA_TYPE__DATA_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Enumliteral</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ENUMLITERAL = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataSpecificationContainerImpl <em>Data Specification Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataSpecificationContainerImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getDataSpecificationContainer()
	 * @generated
	 */
	int DATA_SPECIFICATION_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_CONTAINER__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_CONTAINER__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Unittypecontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_CONTAINER__UNITTYPECONTAINER = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dataspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_CONTAINER__DATASPECIFICATION = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Specification Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_CONTAINER_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Specification Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_CONTAINER_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeCollectionImpl <em>Data Type Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeCollectionImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getDataTypeCollection()
	 * @generated
	 */
	int DATA_TYPE_COLLECTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_COLLECTION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_COLLECTION__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_COLLECTION__DATA_SEMANTICS = DATA_TYPE__DATA_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_COLLECTION__DATATYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_COLLECTION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_COLLECTION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.CombinedDataTypeImpl <em>Combined Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.CombinedDataTypeImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getCombinedDataType()
	 * @generated
	 */
	int COMBINED_DATA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_DATA_TYPE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_DATA_TYPE__DATA_SEMANTICS = DATA_TYPE__DATA_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Combined Datatype Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_DATA_TYPE__COMBINED_DATATYPE_ENTRY = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combined Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Combined Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.ObjectClassReferenceDataTypeImpl <em>Object Class Reference Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.ObjectClassReferenceDataTypeImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getObjectClassReferenceDataType()
	 * @generated
	 */
	int OBJECT_CLASS_REFERENCE_DATA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_REFERENCE_DATA_TYPE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_REFERENCE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_REFERENCE_DATA_TYPE__DATA_SEMANTICS = DATA_TYPE__DATA_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Objectclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_REFERENCE_DATA_TYPE__OBJECTCLASS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Class Reference Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_REFERENCE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Class Reference Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_REFERENCE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType <em>Primitive Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification <em>Data Type Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Specification</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification
	 * @generated
	 */
	EClass getDataTypeSpecification();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification#getDataSemantics <em>Data Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Semantics</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification#getDataSemantics()
	 * @see #getDataTypeSpecification()
	 * @generated
	 */
	EAttribute getDataTypeSpecification_DataSemantics();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral#getLiteralName <em>Literal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Name</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral#getLiteralName()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_LiteralName();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Value</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral#getLiteralValue()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_LiteralValue();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Range#getLowerBounds <em>Lower Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bounds</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Range#getLowerBounds()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_LowerBounds();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Range#getUpperBounds <em>Upper Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bounds</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Range#getUpperBounds()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_UpperBounds();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Data Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType
	 * @generated
	 */
	EClass getBaseDataType();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getStepSize()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EAttribute getBaseDataType_StepSize();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getInitialValue()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EAttribute getBaseDataType_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getPrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Data Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getPrimitiveDataType()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EAttribute getBaseDataType_PrimitiveDataType();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getRange()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EReference getBaseDataType_Range();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer <em>Unit Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type Container</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer
	 * @generated
	 */
	EClass getUnitTypeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer#getUnit()
	 * @see #getUnitTypeContainer()
	 * @generated
	 */
	EReference getUnitTypeContainer_Unit();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getBasedatatype <em>Basedatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basedatatype</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getBasedatatype()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Basedatatype();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnitSymbol <em>Unit Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Symbol</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnitSymbol()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_UnitSymbol();

	/**
	 * Returns the meta object for the container reference '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnittypecontainer <em>Unittypecontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unittypecontainer</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnittypecontainer()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Unittypecontainer();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getRange()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Range();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType#getEnumliteral <em>Enumliteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumliteral</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType#getEnumliteral()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_Enumliteral();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer <em>Data Specification Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Specification Container</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer
	 * @generated
	 */
	EClass getDataSpecificationContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer#getUnittypecontainer <em>Unittypecontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unittypecontainer</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer#getUnittypecontainer()
	 * @see #getDataSpecificationContainer()
	 * @generated
	 */
	EReference getDataSpecificationContainer_Unittypecontainer();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer#getDataspecification <em>Dataspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataspecification</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer#getDataspecification()
	 * @see #getDataSpecificationContainer()
	 * @generated
	 */
	EReference getDataSpecificationContainer_Dataspecification();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeCollection <em>Data Type Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Collection</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeCollection
	 * @generated
	 */
	EClass getDataTypeCollection();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeCollection#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeCollection#getDatatype()
	 * @see #getDataTypeCollection()
	 * @generated
	 */
	EReference getDataTypeCollection_Datatype();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.CombinedDataType <em>Combined Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Data Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.CombinedDataType
	 * @generated
	 */
	EClass getCombinedDataType();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.CombinedDataType#getCombinedDatatypeEntry <em>Combined Datatype Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combined Datatype Entry</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.CombinedDataType#getCombinedDatatypeEntry()
	 * @see #getCombinedDataType()
	 * @generated
	 */
	EReference getCombinedDataType_CombinedDatatypeEntry();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.ObjectClassReferenceDataType <em>Object Class Reference Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class Reference Data Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.ObjectClassReferenceDataType
	 * @generated
	 */
	EClass getObjectClassReferenceDataType();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.ObjectClassReferenceDataType#getObjectclass <em>Objectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objectclass</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.ObjectClassReferenceDataType#getObjectclass()
	 * @see #getObjectClassReferenceDataType()
	 * @generated
	 */
	EReference getObjectClassReferenceDataType_Objectclass();

	/**
	 * Returns the meta object for enum '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Data Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType
	 * @generated
	 */
	EEnum getPrimitiveDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesFactory getDataTypesFactory();

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
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeSpecificationImpl <em>Data Type Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeSpecificationImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getDataTypeSpecification()
		 * @generated
		 */
		EClass DATA_TYPE_SPECIFICATION = eINSTANCE.getDataTypeSpecification();

		/**
		 * The meta object literal for the '<em><b>Data Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_SPECIFICATION__DATA_SEMANTICS = eINSTANCE.getDataTypeSpecification_DataSemantics();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.EnumLiteralImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__LITERAL_NAME = eINSTANCE.getEnumLiteral_LiteralName();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__LITERAL_VALUE = eINSTANCE.getEnumLiteral_LiteralValue();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.RangeImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Lower Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__LOWER_BOUNDS = eINSTANCE.getRange_LowerBounds();

		/**
		 * The meta object literal for the '<em><b>Upper Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__UPPER_BOUNDS = eINSTANCE.getRange_UpperBounds();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.BaseDataTypeImpl <em>Base Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.BaseDataTypeImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getBaseDataType()
		 * @generated
		 */
		EClass BASE_DATA_TYPE = eINSTANCE.getBaseDataType();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_DATA_TYPE__STEP_SIZE = eINSTANCE.getBaseDataType_StepSize();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_DATA_TYPE__INITIAL_VALUE = eINSTANCE.getBaseDataType_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Primitive Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_DATA_TYPE__PRIMITIVE_DATA_TYPE = eINSTANCE.getBaseDataType_PrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_DATA_TYPE__RANGE = eINSTANCE.getBaseDataType_Range();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitTypeContainerImpl <em>Unit Type Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitTypeContainerImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getUnitTypeContainer()
		 * @generated
		 */
		EClass UNIT_TYPE_CONTAINER = eINSTANCE.getUnitTypeContainer();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TYPE_CONTAINER__UNIT = eINSTANCE.getUnitTypeContainer_Unit();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Basedatatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__BASEDATATYPE = eINSTANCE.getUnit_Basedatatype();

		/**
		 * The meta object literal for the '<em><b>Unit Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__UNIT_SYMBOL = eINSTANCE.getUnit_UnitSymbol();

		/**
		 * The meta object literal for the '<em><b>Unittypecontainer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__UNITTYPECONTAINER = eINSTANCE.getUnit_Unittypecontainer();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__RANGE = eINSTANCE.getUnit_Range();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.EnumTypeImpl <em>Enum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.EnumTypeImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getEnumType()
		 * @generated
		 */
		EClass ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '<em><b>Enumliteral</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TYPE__ENUMLITERAL = eINSTANCE.getEnumType_Enumliteral();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataSpecificationContainerImpl <em>Data Specification Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataSpecificationContainerImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getDataSpecificationContainer()
		 * @generated
		 */
		EClass DATA_SPECIFICATION_CONTAINER = eINSTANCE.getDataSpecificationContainer();

		/**
		 * The meta object literal for the '<em><b>Unittypecontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_CONTAINER__UNITTYPECONTAINER = eINSTANCE.getDataSpecificationContainer_Unittypecontainer();

		/**
		 * The meta object literal for the '<em><b>Dataspecification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION_CONTAINER__DATASPECIFICATION = eINSTANCE.getDataSpecificationContainer_Dataspecification();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeCollectionImpl <em>Data Type Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeCollectionImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getDataTypeCollection()
		 * @generated
		 */
		EClass DATA_TYPE_COLLECTION = eINSTANCE.getDataTypeCollection();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_COLLECTION__DATATYPE = eINSTANCE.getDataTypeCollection_Datatype();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.CombinedDataTypeImpl <em>Combined Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.CombinedDataTypeImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getCombinedDataType()
		 * @generated
		 */
		EClass COMBINED_DATA_TYPE = eINSTANCE.getCombinedDataType();

		/**
		 * The meta object literal for the '<em><b>Combined Datatype Entry</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_DATA_TYPE__COMBINED_DATATYPE_ENTRY = eINSTANCE.getCombinedDataType_CombinedDatatypeEntry();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.ObjectClassReferenceDataTypeImpl <em>Object Class Reference Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.ObjectClassReferenceDataTypeImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getObjectClassReferenceDataType()
		 * @generated
		 */
		EClass OBJECT_CLASS_REFERENCE_DATA_TYPE = eINSTANCE.getObjectClassReferenceDataType();

		/**
		 * The meta object literal for the '<em><b>Objectclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_REFERENCE_DATA_TYPE__OBJECTCLASS = eINSTANCE.getObjectClassReferenceDataType_Objectclass();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType <em>Primitive Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType
		 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EEnum PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

	}

} //DataTypesPackage
