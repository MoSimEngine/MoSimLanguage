/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataImpl;

import aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry;
import aDL_Moddeling_Project.DataRepresentation.RequiredReferenceProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Reference Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.RequiredReferencePropertyImpl#getObjectorientedviewrequiredentry <em>Objectorientedviewrequiredentry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredReferencePropertyImpl extends DataImpl implements RequiredReferenceProperty {
	/**
	 * The cached value of the '{@link #getObjectorientedviewrequiredentry() <em>Objectorientedviewrequiredentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectorientedviewrequiredentry()
	 * @generated
	 * @ordered
	 */
	protected ObjectOrientedViewRequiredEntry objectorientedviewrequiredentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredReferencePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.REQUIRED_REFERENCE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedViewRequiredEntry getObjectorientedviewrequiredentry() {
		if (objectorientedviewrequiredentry != null && objectorientedviewrequiredentry.eIsProxy()) {
			InternalEObject oldObjectorientedviewrequiredentry = (InternalEObject)objectorientedviewrequiredentry;
			objectorientedviewrequiredentry = (ObjectOrientedViewRequiredEntry)eResolveProxy(oldObjectorientedviewrequiredentry);
			if (objectorientedviewrequiredentry != oldObjectorientedviewrequiredentry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataRepresentationPackage.REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY, oldObjectorientedviewrequiredentry, objectorientedviewrequiredentry));
			}
		}
		return objectorientedviewrequiredentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedViewRequiredEntry basicGetObjectorientedviewrequiredentry() {
		return objectorientedviewrequiredentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectorientedviewrequiredentry(ObjectOrientedViewRequiredEntry newObjectorientedviewrequiredentry) {
		ObjectOrientedViewRequiredEntry oldObjectorientedviewrequiredentry = objectorientedviewrequiredentry;
		objectorientedviewrequiredentry = newObjectorientedviewrequiredentry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY, oldObjectorientedviewrequiredentry, objectorientedviewrequiredentry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataRepresentationPackage.REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY:
				if (resolve) return getObjectorientedviewrequiredentry();
				return basicGetObjectorientedviewrequiredentry();
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
			case DataRepresentationPackage.REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY:
				setObjectorientedviewrequiredentry((ObjectOrientedViewRequiredEntry)newValue);
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
			case DataRepresentationPackage.REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY:
				setObjectorientedviewrequiredentry((ObjectOrientedViewRequiredEntry)null);
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
			case DataRepresentationPackage.REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY:
				return objectorientedviewrequiredentry != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredReferencePropertyImpl
