/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DerivedElementImpl#getAdapatationconversion <em>Adapatationconversion</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DerivedElementImpl#getDatamarker <em>Datamarker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedElementImpl extends MinimalEObjectImpl.Container implements DerivedElement {
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
	 * The cached value of the '{@link #getDatamarker() <em>Datamarker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatamarker()
	 * @generated
	 * @ordered
	 */
	protected DataMarker datamarker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.DERIVED_ELEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION, oldAdapatationconversion, newAdapatationconversion);
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
				msgs = ((InternalEObject)adapatationconversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION, null, msgs);
			if (newAdapatationconversion != null)
				msgs = ((InternalEObject)newAdapatationconversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION, null, msgs);
			msgs = basicSetAdapatationconversion(newAdapatationconversion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION, newAdapatationconversion, newAdapatationconversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker getDatamarker() {
		if (datamarker != null && datamarker.eIsProxy()) {
			InternalEObject oldDatamarker = (InternalEObject)datamarker;
			datamarker = (DataMarker)eResolveProxy(oldDatamarker);
			if (datamarker != oldDatamarker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.DERIVED_ELEMENT__DATAMARKER, oldDatamarker, datamarker));
			}
		}
		return datamarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker basicGetDatamarker() {
		return datamarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatamarker(DataMarker newDatamarker) {
		DataMarker oldDatamarker = datamarker;
		datamarker = newDatamarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.DERIVED_ELEMENT__DATAMARKER, oldDatamarker, datamarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION:
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
			case AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION:
				return getAdapatationconversion();
			case AdapterServicesPackage.DERIVED_ELEMENT__DATAMARKER:
				if (resolve) return getDatamarker();
				return basicGetDatamarker();
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
			case AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)newValue);
				return;
			case AdapterServicesPackage.DERIVED_ELEMENT__DATAMARKER:
				setDatamarker((DataMarker)newValue);
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
			case AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)null);
				return;
			case AdapterServicesPackage.DERIVED_ELEMENT__DATAMARKER:
				setDatamarker((DataMarker)null);
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
			case AdapterServicesPackage.DERIVED_ELEMENT__ADAPATATIONCONVERSION:
				return adapatationconversion != null;
			case AdapterServicesPackage.DERIVED_ELEMENT__DATAMARKER:
				return datamarker != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedElementImpl
