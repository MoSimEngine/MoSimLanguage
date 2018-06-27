/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.*;

import org.eclipse.emf.ecore.EClass;
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
public class DataSpecificationFactoryImpl extends EFactoryImpl implements DataSpecificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataSpecificationFactory init() {
		try {
			DataSpecificationFactory theDataSpecificationFactory = (DataSpecificationFactory)EPackage.Registry.INSTANCE.getEFactory(DataSpecificationPackage.eNS_URI);
			if (theDataSpecificationFactory != null) {
				return theDataSpecificationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataSpecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecificationFactoryImpl() {
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
			case DataSpecificationPackage.SEMANTIC_TYPE: return createSemanticType();
			case DataSpecificationPackage.COLLECTION_TYPED_DATA: return createCollectionTypedData();
			case DataSpecificationPackage.ENUM_TYPED_DATA: return createEnumTypedData();
			case DataSpecificationPackage.BASIC_TYPED_DATA: return createBasicTypedData();
			case DataSpecificationPackage.UNIT_TYPED_DATA: return createUnitTypedData();
			case DataSpecificationPackage.COMBINED_TYPED_DATA: return createCombinedTypedData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticType createSemanticType() {
		SemanticTypeImpl semanticType = new SemanticTypeImpl();
		return semanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypedData createCollectionTypedData() {
		CollectionTypedDataImpl collectionTypedData = new CollectionTypedDataImpl();
		return collectionTypedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTypedData createEnumTypedData() {
		EnumTypedDataImpl enumTypedData = new EnumTypedDataImpl();
		return enumTypedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicTypedData createBasicTypedData() {
		BasicTypedDataImpl basicTypedData = new BasicTypedDataImpl();
		return basicTypedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTypedData createUnitTypedData() {
		UnitTypedDataImpl unitTypedData = new UnitTypedDataImpl();
		return unitTypedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedTypedData createCombinedTypedData() {
		CombinedTypedDataImpl combinedTypedData = new CombinedTypedDataImpl();
		return combinedTypedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecificationPackage getDataSpecificationPackage() {
		return (DataSpecificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataSpecificationPackage getPackage() {
		return DataSpecificationPackage.eINSTANCE;
	}

} //DataSpecificationFactoryImpl
