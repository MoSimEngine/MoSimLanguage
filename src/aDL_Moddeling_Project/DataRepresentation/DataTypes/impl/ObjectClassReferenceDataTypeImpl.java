/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.ObjectClassReferenceDataType;

import aDL_Moddeling_Project.DataRepresentation.ObjectClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Class Reference Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.ObjectClassReferenceDataTypeImpl#getObjectclass <em>Objectclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectClassReferenceDataTypeImpl extends DataTypeImpl implements ObjectClassReferenceDataType {
	/**
	 * The cached value of the '{@link #getObjectclass() <em>Objectclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectclass()
	 * @generated
	 * @ordered
	 */
	protected ObjectClass objectclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectClassReferenceDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.OBJECT_CLASS_REFERENCE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass getObjectclass() {
		if (objectclass != null && objectclass.eIsProxy()) {
			InternalEObject oldObjectclass = (InternalEObject)objectclass;
			objectclass = (ObjectClass)eResolveProxy(oldObjectclass);
			if (objectclass != oldObjectclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.OBJECT_CLASS_REFERENCE_DATA_TYPE__OBJECTCLASS, oldObjectclass, objectclass));
			}
		}
		return objectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass basicGetObjectclass() {
		return objectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectclass(ObjectClass newObjectclass) {
		ObjectClass oldObjectclass = objectclass;
		objectclass = newObjectclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.OBJECT_CLASS_REFERENCE_DATA_TYPE__OBJECTCLASS, oldObjectclass, objectclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.OBJECT_CLASS_REFERENCE_DATA_TYPE__OBJECTCLASS:
				if (resolve) return getObjectclass();
				return basicGetObjectclass();
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
			case DataTypesPackage.OBJECT_CLASS_REFERENCE_DATA_TYPE__OBJECTCLASS:
				setObjectclass((ObjectClass)newValue);
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
			case DataTypesPackage.OBJECT_CLASS_REFERENCE_DATA_TYPE__OBJECTCLASS:
				setObjectclass((ObjectClass)null);
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
			case DataTypesPackage.OBJECT_CLASS_REFERENCE_DATA_TYPE__OBJECTCLASS:
				return objectclass != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectClassReferenceDataTypeImpl
