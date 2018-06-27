/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty;
import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataImpl;

import aDL_Moddeling_Project.DataRepresentation.ObjectClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Reference Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ClassReferencePropertyImpl#getReferencedObjectclass <em>Referenced Objectclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassReferencePropertyImpl extends DataImpl implements ClassReferenceProperty {
	/**
	 * The cached value of the '{@link #getReferencedObjectclass() <em>Referenced Objectclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedObjectclass()
	 * @generated
	 * @ordered
	 */
	protected ObjectClass referencedObjectclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassReferencePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.CLASS_REFERENCE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass getReferencedObjectclass() {
		if (referencedObjectclass != null && referencedObjectclass.eIsProxy()) {
			InternalEObject oldReferencedObjectclass = (InternalEObject)referencedObjectclass;
			referencedObjectclass = (ObjectClass)eResolveProxy(oldReferencedObjectclass);
			if (referencedObjectclass != oldReferencedObjectclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataRepresentationPackage.CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS, oldReferencedObjectclass, referencedObjectclass));
			}
		}
		return referencedObjectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass basicGetReferencedObjectclass() {
		return referencedObjectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedObjectclass(ObjectClass newReferencedObjectclass) {
		ObjectClass oldReferencedObjectclass = referencedObjectclass;
		referencedObjectclass = newReferencedObjectclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS, oldReferencedObjectclass, referencedObjectclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataRepresentationPackage.CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS:
				if (resolve) return getReferencedObjectclass();
				return basicGetReferencedObjectclass();
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
			case DataRepresentationPackage.CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS:
				setReferencedObjectclass((ObjectClass)newValue);
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
			case DataRepresentationPackage.CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS:
				setReferencedObjectclass((ObjectClass)null);
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
			case DataRepresentationPackage.CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS:
				return referencedObjectclass != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassReferencePropertyImpl
