/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;
import aDL_Moddeling_Project.DataRepresentation.ObjectClass;
import aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Oriented View Required Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewRequiredEntryImpl#getRequiredObjectClass <em>Required Object Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectOrientedViewRequiredEntryImpl extends RequiredDataEntryImpl implements ObjectOrientedViewRequiredEntry {
	/**
	 * The cached value of the '{@link #getRequiredObjectClass() <em>Required Object Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredObjectClass()
	 * @generated
	 * @ordered
	 */
	protected ObjectClass requiredObjectClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectOrientedViewRequiredEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass getRequiredObjectClass() {
		return requiredObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredObjectClass(ObjectClass newRequiredObjectClass, NotificationChain msgs) {
		ObjectClass oldRequiredObjectClass = requiredObjectClass;
		requiredObjectClass = newRequiredObjectClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS, oldRequiredObjectClass, newRequiredObjectClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredObjectClass(ObjectClass newRequiredObjectClass) {
		if (newRequiredObjectClass != requiredObjectClass) {
			NotificationChain msgs = null;
			if (requiredObjectClass != null)
				msgs = ((InternalEObject)requiredObjectClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS, null, msgs);
			if (newRequiredObjectClass != null)
				msgs = ((InternalEObject)newRequiredObjectClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS, null, msgs);
			msgs = basicSetRequiredObjectClass(newRequiredObjectClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS, newRequiredObjectClass, newRequiredObjectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS:
				return basicSetRequiredObjectClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS:
				return getRequiredObjectClass();
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
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS:
				setRequiredObjectClass((ObjectClass)newValue);
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
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS:
				setRequiredObjectClass((ObjectClass)null);
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
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS:
				return requiredObjectClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectOrientedViewRequiredEntryImpl
