/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.CollectionTypedData;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Typed Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.CollectionTypedDataImpl#getBasedatatype <em>Basedatatype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionTypedDataImpl extends GeneralTypedDataImpl implements CollectionTypedData {
	/**
	 * The cached value of the '{@link #getBasedatatype() <em>Basedatatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedatatype()
	 * @generated
	 * @ordered
	 */
	protected BaseDataType basedatatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTypedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSpecificationPackage.Literals.COLLECTION_TYPED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDataType getBasedatatype() {
		if (basedatatype != null && basedatatype.eIsProxy()) {
			InternalEObject oldBasedatatype = (InternalEObject)basedatatype;
			basedatatype = (BaseDataType)eResolveProxy(oldBasedatatype);
			if (basedatatype != oldBasedatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSpecificationPackage.COLLECTION_TYPED_DATA__BASEDATATYPE, oldBasedatatype, basedatatype));
			}
		}
		return basedatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDataType basicGetBasedatatype() {
		return basedatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedatatype(BaseDataType newBasedatatype) {
		BaseDataType oldBasedatatype = basedatatype;
		basedatatype = newBasedatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpecificationPackage.COLLECTION_TYPED_DATA__BASEDATATYPE, oldBasedatatype, basedatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataSpecificationPackage.COLLECTION_TYPED_DATA__BASEDATATYPE:
				if (resolve) return getBasedatatype();
				return basicGetBasedatatype();
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
			case DataSpecificationPackage.COLLECTION_TYPED_DATA__BASEDATATYPE:
				setBasedatatype((BaseDataType)newValue);
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
			case DataSpecificationPackage.COLLECTION_TYPED_DATA__BASEDATATYPE:
				setBasedatatype((BaseDataType)null);
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
			case DataSpecificationPackage.COLLECTION_TYPED_DATA__BASEDATATYPE:
				return basedatatype != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionTypedDataImpl
