/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Connected Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.BaseConnectedAdaptationImpl#getDerivedelement <em>Derivedelement</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.BaseConnectedAdaptationImpl#getBaseMarker <em>Base Marker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseConnectedAdaptationImpl extends AdaptationDescriptionImpl implements BaseConnectedAdaptation {
	/**
	 * The cached value of the '{@link #getDerivedelement() <em>Derivedelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedelement()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivedElement> derivedelement;

	/**
	 * The cached value of the '{@link #getBaseMarker() <em>Base Marker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMarker()
	 * @generated
	 * @ordered
	 */
	protected DataMarker baseMarker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseConnectedAdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.BASE_CONNECTED_ADAPTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DerivedElement> getDerivedelement() {
		if (derivedelement == null) {
			derivedelement = new EObjectContainmentEList<DerivedElement>(DerivedElement.class, this, AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT);
		}
		return derivedelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker getBaseMarker() {
		if (baseMarker != null && baseMarker.eIsProxy()) {
			InternalEObject oldBaseMarker = (InternalEObject)baseMarker;
			baseMarker = (DataMarker)eResolveProxy(oldBaseMarker);
			if (baseMarker != oldBaseMarker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__BASE_MARKER, oldBaseMarker, baseMarker));
			}
		}
		return baseMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker basicGetBaseMarker() {
		return baseMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMarker(DataMarker newBaseMarker) {
		DataMarker oldBaseMarker = baseMarker;
		baseMarker = newBaseMarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__BASE_MARKER, oldBaseMarker, baseMarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT:
				return ((InternalEList<?>)getDerivedelement()).basicRemove(otherEnd, msgs);
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
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT:
				return getDerivedelement();
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__BASE_MARKER:
				if (resolve) return getBaseMarker();
				return basicGetBaseMarker();
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
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT:
				getDerivedelement().clear();
				getDerivedelement().addAll((Collection<? extends DerivedElement>)newValue);
				return;
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__BASE_MARKER:
				setBaseMarker((DataMarker)newValue);
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
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT:
				getDerivedelement().clear();
				return;
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__BASE_MARKER:
				setBaseMarker((DataMarker)null);
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
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT:
				return derivedelement != null && !derivedelement.isEmpty();
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION__BASE_MARKER:
				return baseMarker != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseConnectedAdaptationImpl
