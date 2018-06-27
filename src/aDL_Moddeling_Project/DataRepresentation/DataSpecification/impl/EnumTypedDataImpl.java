/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.EnumTypedData;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Typed Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.EnumTypedDataImpl#getEnumtype <em>Enumtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumTypedDataImpl extends DataImpl implements EnumTypedData {
	/**
	 * The cached value of the '{@link #getEnumtype() <em>Enumtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumtype()
	 * @generated
	 * @ordered
	 */
	protected EnumType enumtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumTypedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSpecificationPackage.Literals.ENUM_TYPED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType getEnumtype() {
		if (enumtype != null && enumtype.eIsProxy()) {
			InternalEObject oldEnumtype = (InternalEObject)enumtype;
			enumtype = (EnumType)eResolveProxy(oldEnumtype);
			if (enumtype != oldEnumtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataSpecificationPackage.ENUM_TYPED_DATA__ENUMTYPE, oldEnumtype, enumtype));
			}
		}
		return enumtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType basicGetEnumtype() {
		return enumtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumtype(EnumType newEnumtype) {
		EnumType oldEnumtype = enumtype;
		enumtype = newEnumtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpecificationPackage.ENUM_TYPED_DATA__ENUMTYPE, oldEnumtype, enumtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataSpecificationPackage.ENUM_TYPED_DATA__ENUMTYPE:
				if (resolve) return getEnumtype();
				return basicGetEnumtype();
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
			case DataSpecificationPackage.ENUM_TYPED_DATA__ENUMTYPE:
				setEnumtype((EnumType)newValue);
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
			case DataSpecificationPackage.ENUM_TYPED_DATA__ENUMTYPE:
				setEnumtype((EnumType)null);
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
			case DataSpecificationPackage.ENUM_TYPED_DATA__ENUMTYPE:
				return enumtype != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumTypedDataImpl
