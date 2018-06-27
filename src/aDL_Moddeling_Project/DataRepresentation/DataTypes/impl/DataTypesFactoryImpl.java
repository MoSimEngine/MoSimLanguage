/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesFactoryImpl extends EFactoryImpl implements DataTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataTypesFactory init() {
		try {
			DataTypesFactory theDataTypesFactory = (DataTypesFactory)EPackage.Registry.INSTANCE.getEFactory(DataTypesPackage.eNS_URI);
			if (theDataTypesFactory != null) {
				return theDataTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataTypesPackage.ENUM_LITERAL: return createEnumLiteral();
			case DataTypesPackage.RANGE: return createRange();
			case DataTypesPackage.BASE_DATA_TYPE: return createBaseDataType();
			case DataTypesPackage.UNIT_TYPE_CONTAINER: return createUnitTypeContainer();
			case DataTypesPackage.UNIT: return createUnit();
			case DataTypesPackage.ENUM_TYPE: return createEnumType();
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER: return createDataSpecificationContainer();
			case DataTypesPackage.DATA_TYPE_COLLECTION: return createDataTypeCollection();
			case DataTypesPackage.COMBINED_DATA_TYPE: return createCombinedDataType();
			case DataTypesPackage.OBJECT_CLASS_REFERENCE_DATA_TYPE: return createObjectClassReferenceDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DataTypesPackage.PRIMITIVE_DATA_TYPE:
				return createPrimitiveDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DataTypesPackage.PRIMITIVE_DATA_TYPE:
				return convertPrimitiveDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDataType createBaseDataType() {
		BaseDataTypeImpl baseDataType = new BaseDataTypeImpl();
		return baseDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTypeContainer createUnitTypeContainer() {
		UnitTypeContainerImpl unitTypeContainer = new UnitTypeContainerImpl();
		return unitTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecificationContainer createDataSpecificationContainer() {
		DataSpecificationContainerImpl dataSpecificationContainer = new DataSpecificationContainerImpl();
		return dataSpecificationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeCollection createDataTypeCollection() {
		DataTypeCollectionImpl dataTypeCollection = new DataTypeCollectionImpl();
		return dataTypeCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedDataType createCombinedDataType() {
		CombinedDataTypeImpl combinedDataType = new CombinedDataTypeImpl();
		return combinedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassReferenceDataType createObjectClassReferenceDataType() {
		ObjectClassReferenceDataTypeImpl objectClassReferenceDataType = new ObjectClassReferenceDataTypeImpl();
		return objectClassReferenceDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType createPrimitiveDataTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveDataType result = PrimitiveDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesPackage getDataTypesPackage() {
		return (DataTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataTypesPackage getPackage() {
		return DataTypesPackage.eINSTANCE;
	}

} //DataTypesFactoryImpl
