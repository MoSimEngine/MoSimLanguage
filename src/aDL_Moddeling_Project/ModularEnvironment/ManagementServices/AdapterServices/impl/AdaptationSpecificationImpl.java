/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;

import aDL_Moddeling_Project.basic.Identifier;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationSpecificationImpl#getFstEntityID <em>Fst Entity ID</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationSpecificationImpl#getScndEntityID <em>Scnd Entity ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AdaptationSpecificationImpl extends EntityImpl implements AdaptationSpecification {
	/**
	 * The cached value of the '{@link #getFstEntityID() <em>Fst Entity ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstEntityID()
	 * @generated
	 * @ordered
	 */
	protected Identifier fstEntityID;

	/**
	 * The cached value of the '{@link #getScndEntityID() <em>Scnd Entity ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScndEntityID()
	 * @generated
	 * @ordered
	 */
	protected Identifier scndEntityID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.ADAPTATION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getFstEntityID() {
		if (fstEntityID != null && fstEntityID.eIsProxy()) {
			InternalEObject oldFstEntityID = (InternalEObject)fstEntityID;
			fstEntityID = (Identifier)eResolveProxy(oldFstEntityID);
			if (fstEntityID != oldFstEntityID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.ADAPTATION_SPECIFICATION__FST_ENTITY_ID, oldFstEntityID, fstEntityID));
			}
		}
		return fstEntityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetFstEntityID() {
		return fstEntityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFstEntityID(Identifier newFstEntityID) {
		Identifier oldFstEntityID = fstEntityID;
		fstEntityID = newFstEntityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ADAPTATION_SPECIFICATION__FST_ENTITY_ID, oldFstEntityID, fstEntityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getScndEntityID() {
		if (scndEntityID != null && scndEntityID.eIsProxy()) {
			InternalEObject oldScndEntityID = (InternalEObject)scndEntityID;
			scndEntityID = (Identifier)eResolveProxy(oldScndEntityID);
			if (scndEntityID != oldScndEntityID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.ADAPTATION_SPECIFICATION__SCND_ENTITY_ID, oldScndEntityID, scndEntityID));
			}
		}
		return scndEntityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetScndEntityID() {
		return scndEntityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScndEntityID(Identifier newScndEntityID) {
		Identifier oldScndEntityID = scndEntityID;
		scndEntityID = newScndEntityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ADAPTATION_SPECIFICATION__SCND_ENTITY_ID, oldScndEntityID, scndEntityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION__FST_ENTITY_ID:
				if (resolve) return getFstEntityID();
				return basicGetFstEntityID();
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION__SCND_ENTITY_ID:
				if (resolve) return getScndEntityID();
				return basicGetScndEntityID();
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
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION__FST_ENTITY_ID:
				setFstEntityID((Identifier)newValue);
				return;
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION__SCND_ENTITY_ID:
				setScndEntityID((Identifier)newValue);
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
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION__FST_ENTITY_ID:
				setFstEntityID((Identifier)null);
				return;
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION__SCND_ENTITY_ID:
				setScndEntityID((Identifier)null);
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
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION__FST_ENTITY_ID:
				return fstEntityID != null;
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION__SCND_ENTITY_ID:
				return scndEntityID != null;
		}
		return super.eIsSet(featureID);
	}

} //AdaptationSpecificationImpl
