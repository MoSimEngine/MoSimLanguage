/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Marker Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationMarkerMappingImpl#getDatamarker <em>Datamarker</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationMarkerMappingImpl#getAdaptable <em>Adaptable</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationMarkerMappingImpl#getAdaptationdescription <em>Adaptationdescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptationMarkerMappingImpl extends MinimalEObjectImpl.Container implements AdaptationMarkerMapping {
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
	 * The cached value of the '{@link #getAdaptable() <em>Adaptable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptable()
	 * @generated
	 * @ordered
	 */
	protected EList<Adaptable> adaptable;

	/**
	 * The cached value of the '{@link #getAdaptationdescription() <em>Adaptationdescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationdescription()
	 * @generated
	 * @ordered
	 */
	protected AdaptationDescription adaptationdescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationMarkerMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.ADAPTATION_MARKER_MAPPING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__DATAMARKER, oldDatamarker, datamarker));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__DATAMARKER, oldDatamarker, datamarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Adaptable> getAdaptable() {
		if (adaptable == null) {
			adaptable = new EObjectResolvingEList<Adaptable>(Adaptable.class, this, AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTABLE);
		}
		return adaptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDescription getAdaptationdescription() {
		if (adaptationdescription != null && adaptationdescription.eIsProxy()) {
			InternalEObject oldAdaptationdescription = (InternalEObject)adaptationdescription;
			adaptationdescription = (AdaptationDescription)eResolveProxy(oldAdaptationdescription);
			if (adaptationdescription != oldAdaptationdescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION, oldAdaptationdescription, adaptationdescription));
			}
		}
		return adaptationdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDescription basicGetAdaptationdescription() {
		return adaptationdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationdescription(AdaptationDescription newAdaptationdescription) {
		AdaptationDescription oldAdaptationdescription = adaptationdescription;
		adaptationdescription = newAdaptationdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION, oldAdaptationdescription, adaptationdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__DATAMARKER:
				if (resolve) return getDatamarker();
				return basicGetDatamarker();
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTABLE:
				return getAdaptable();
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION:
				if (resolve) return getAdaptationdescription();
				return basicGetAdaptationdescription();
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
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__DATAMARKER:
				setDatamarker((DataMarker)newValue);
				return;
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTABLE:
				getAdaptable().clear();
				getAdaptable().addAll((Collection<? extends Adaptable>)newValue);
				return;
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION:
				setAdaptationdescription((AdaptationDescription)newValue);
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
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__DATAMARKER:
				setDatamarker((DataMarker)null);
				return;
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTABLE:
				getAdaptable().clear();
				return;
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION:
				setAdaptationdescription((AdaptationDescription)null);
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
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__DATAMARKER:
				return datamarker != null;
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTABLE:
				return adaptable != null && !adaptable.isEmpty();
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION:
				return adaptationdescription != null;
		}
		return super.eIsSet(featureID);
	}

} //AdaptationMarkerMappingImpl
