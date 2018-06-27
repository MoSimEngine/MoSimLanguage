/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>all To All Adapation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.allToAllAdapationImpl#getAdapatationconversion <em>Adapatationconversion</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.allToAllAdapationImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class allToAllAdapationImpl extends AdaptationDescriptionImpl implements allToAllAdapation {
	/**
	 * The cached value of the '{@link #getAdapatationconversion() <em>Adapatationconversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapatationconversion()
	 * @generated
	 * @ordered
	 */
	protected AdapatationConversion adapatationconversion;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<DataMarker> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected allToAllAdapationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.ALL_TO_ALL_ADAPATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapatationConversion getAdapatationconversion() {
		return adapatationconversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdapatationconversion(AdapatationConversion newAdapatationconversion, NotificationChain msgs) {
		AdapatationConversion oldAdapatationconversion = adapatationconversion;
		adapatationconversion = newAdapatationconversion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION, oldAdapatationconversion, newAdapatationconversion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapatationconversion(AdapatationConversion newAdapatationconversion) {
		if (newAdapatationconversion != adapatationconversion) {
			NotificationChain msgs = null;
			if (adapatationconversion != null)
				msgs = ((InternalEObject)adapatationconversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION, null, msgs);
			if (newAdapatationconversion != null)
				msgs = ((InternalEObject)newAdapatationconversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION, null, msgs);
			msgs = basicSetAdapatationconversion(newAdapatationconversion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION, newAdapatationconversion, newAdapatationconversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataMarker> getMembers() {
		if (members == null) {
			members = new EObjectResolvingEList<DataMarker>(DataMarker.class, this, AdapterServicesPackage.ALL_TO_ALL_ADAPATION__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION:
				return basicSetAdapatationconversion(null, msgs);
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
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION:
				return getAdapatationconversion();
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__MEMBERS:
				return getMembers();
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
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)newValue);
				return;
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends DataMarker>)newValue);
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
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)null);
				return;
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__MEMBERS:
				getMembers().clear();
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
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION:
				return adapatationconversion != null;
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION__MEMBERS:
				return members != null && !members.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //allToAllAdapationImpl
