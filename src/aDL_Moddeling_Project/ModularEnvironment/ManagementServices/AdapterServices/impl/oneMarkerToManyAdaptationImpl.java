/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>one Marker To Many Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.oneMarkerToManyAdaptationImpl#getDatamarker <em>Datamarker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class oneMarkerToManyAdaptationImpl extends AdaptationDescriptionImpl implements oneMarkerToManyAdaptation {
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
	protected oneMarkerToManyAdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.ONE_MARKER_TO_MANY_ADAPTATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER, oldDatamarker, datamarker));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER, oldDatamarker, datamarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdapterServicesPackage.ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER:
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
			case AdapterServicesPackage.ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER:
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
			case AdapterServicesPackage.ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER:
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
			case AdapterServicesPackage.ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER:
				return datamarker != null;
		}
		return super.eIsSet(featureID);
	}

} //oneMarkerToManyAdaptationImpl
