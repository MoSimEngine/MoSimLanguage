/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;
import aDL_Moddeling_Project.DataRepresentation.SimulationData;
import aDL_Moddeling_Project.DataRepresentation.requiredDataInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.SimulationDataImpl#getRequireddata <em>Requireddata</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimulationDataImpl extends MinimalEObjectImpl.Container implements SimulationData {
	/**
	 * The cached value of the '{@link #getRequireddata() <em>Requireddata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireddata()
	 * @generated
	 * @ordered
	 */
	protected requiredDataInterface requireddata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.SIMULATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public requiredDataInterface getRequireddata() {
		return requireddata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireddata(requiredDataInterface newRequireddata, NotificationChain msgs) {
		requiredDataInterface oldRequireddata = requireddata;
		requireddata = newRequireddata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA, oldRequireddata, newRequireddata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireddata(requiredDataInterface newRequireddata) {
		if (newRequireddata != requireddata) {
			NotificationChain msgs = null;
			if (requireddata != null)
				msgs = ((InternalEObject)requireddata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA, null, msgs);
			if (newRequireddata != null)
				msgs = ((InternalEObject)newRequireddata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA, null, msgs);
			msgs = basicSetRequireddata(newRequireddata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA, newRequireddata, newRequireddata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA:
				return basicSetRequireddata(null, msgs);
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
			case DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA:
				return getRequireddata();
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
			case DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA:
				setRequireddata((requiredDataInterface)newValue);
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
			case DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA:
				setRequireddata((requiredDataInterface)null);
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
			case DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA:
				return requireddata != null;
		}
		return super.eIsSet(featureID);
	}

} //SimulationDataImpl
