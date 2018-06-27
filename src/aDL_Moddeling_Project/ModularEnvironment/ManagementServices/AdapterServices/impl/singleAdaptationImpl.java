/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>single Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.singleAdaptationImpl#getAdapatationconversion <em>Adapatationconversion</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.singleAdaptationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.singleAdaptationImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class singleAdaptationImpl extends AdaptationDescriptionImpl implements singleAdaptation {
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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected DataMarker from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected DataMarker to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected singleAdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.SINGLE_ADAPTATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION, oldAdapatationconversion, newAdapatationconversion);
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
				msgs = ((InternalEObject)adapatationconversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION, null, msgs);
			if (newAdapatationconversion != null)
				msgs = ((InternalEObject)newAdapatationconversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION, null, msgs);
			msgs = basicSetAdapatationconversion(newAdapatationconversion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION, newAdapatationconversion, newAdapatationconversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (DataMarker)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.SINGLE_ADAPTATION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(DataMarker newFrom) {
		DataMarker oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.SINGLE_ADAPTATION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (DataMarker)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.SINGLE_ADAPTATION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(DataMarker newTo) {
		DataMarker oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.SINGLE_ADAPTATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION:
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
			case AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION:
				return getAdapatationconversion();
			case AdapterServicesPackage.SINGLE_ADAPTATION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case AdapterServicesPackage.SINGLE_ADAPTATION__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)newValue);
				return;
			case AdapterServicesPackage.SINGLE_ADAPTATION__FROM:
				setFrom((DataMarker)newValue);
				return;
			case AdapterServicesPackage.SINGLE_ADAPTATION__TO:
				setTo((DataMarker)newValue);
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
			case AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)null);
				return;
			case AdapterServicesPackage.SINGLE_ADAPTATION__FROM:
				setFrom((DataMarker)null);
				return;
			case AdapterServicesPackage.SINGLE_ADAPTATION__TO:
				setTo((DataMarker)null);
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
			case AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION:
				return adapatationconversion != null;
			case AdapterServicesPackage.SINGLE_ADAPTATION__FROM:
				return from != null;
			case AdapterServicesPackage.SINGLE_ADAPTATION__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //singleAdaptationImpl
