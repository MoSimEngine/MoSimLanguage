/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.CombinedDataType;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataType;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.CombinedDataTypeImpl#getCombinedDatatypeEntry <em>Combined Datatype Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedDataTypeImpl extends DataTypeImpl implements CombinedDataType {
	/**
	 * The cached value of the '{@link #getCombinedDatatypeEntry() <em>Combined Datatype Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedDatatypeEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> combinedDatatypeEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.COMBINED_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getCombinedDatatypeEntry() {
		if (combinedDatatypeEntry == null) {
			combinedDatatypeEntry = new EObjectResolvingEList<DataType>(DataType.class, this, DataTypesPackage.COMBINED_DATA_TYPE__COMBINED_DATATYPE_ENTRY);
		}
		return combinedDatatypeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.COMBINED_DATA_TYPE__COMBINED_DATATYPE_ENTRY:
				return getCombinedDatatypeEntry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataTypesPackage.COMBINED_DATA_TYPE__COMBINED_DATATYPE_ENTRY:
				getCombinedDatatypeEntry().clear();
				getCombinedDatatypeEntry().addAll((Collection<? extends DataType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataTypesPackage.COMBINED_DATA_TYPE__COMBINED_DATATYPE_ENTRY:
				getCombinedDatatypeEntry().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataTypesPackage.COMBINED_DATA_TYPE__COMBINED_DATATYPE_ENTRY:
				return combinedDatatypeEntry != null && !combinedDatatypeEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CombinedDataTypeImpl
