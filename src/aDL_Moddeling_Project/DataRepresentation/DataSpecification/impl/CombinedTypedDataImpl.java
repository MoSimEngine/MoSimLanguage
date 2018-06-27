/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.CombinedTypedData;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.CombinedDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Typed Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CombinedTypedDataImpl#getCombineddatatype <em>Combineddatatype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedTypedDataImpl extends GeneralTypedDataImpl implements CombinedTypedData {
	/**
	 * The cached value of the '{@link #getCombineddatatype() <em>Combineddatatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineddatatype()
	 * @generated
	 * @ordered
	 */
	protected CombinedDataType combineddatatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedTypedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSpecificationPackage.Literals.COMBINED_TYPED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedDataType getCombineddatatype() {
		if (combineddatatype != null && combineddatatype.eIsProxy()) {
			InternalEObject oldCombineddatatype = (InternalEObject)combineddatatype;
			combineddatatype = (CombinedDataType)eResolveProxy(oldCombineddatatype);
			if (combineddatatype != oldCombineddatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSpecificationPackage.COMBINED_TYPED_DATA__COMBINEDDATATYPE, oldCombineddatatype, combineddatatype));
			}
		}
		return combineddatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedDataType basicGetCombineddatatype() {
		return combineddatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombineddatatype(CombinedDataType newCombineddatatype) {
		CombinedDataType oldCombineddatatype = combineddatatype;
		combineddatatype = newCombineddatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpecificationPackage.COMBINED_TYPED_DATA__COMBINEDDATATYPE, oldCombineddatatype, combineddatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataSpecificationPackage.COMBINED_TYPED_DATA__COMBINEDDATATYPE:
				if (resolve) return getCombineddatatype();
				return basicGetCombineddatatype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataSpecificationPackage.COMBINED_TYPED_DATA__COMBINEDDATATYPE:
				setCombineddatatype((CombinedDataType)newValue);
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
			case DataSpecificationPackage.COMBINED_TYPED_DATA__COMBINEDDATATYPE:
				setCombineddatatype((CombinedDataType)null);
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
			case DataSpecificationPackage.COMBINED_TYPED_DATA__COMBINEDDATATYPE:
				return combineddatatype != null;
		}
		return super.eIsSet(featureID);
	}

} //CombinedTypedDataImpl
