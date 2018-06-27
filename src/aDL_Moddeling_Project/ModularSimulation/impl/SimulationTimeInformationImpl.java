/**
 */
package aDL_Moddeling_Project.ModularSimulation.impl;

import aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage;
import aDL_Moddeling_Project.ModularSimulation.SimulationTimeInformation;
import aDL_Moddeling_Project.ModularSimulation.TimeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Time Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.impl.SimulationTimeInformationImpl#getSimulationTimeType <em>Simulation Time Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationTimeInformationImpl extends MinimalEObjectImpl.Container implements SimulationTimeInformation {
	/**
	 * The default value of the '{@link #getSimulationTimeType() <em>Simulation Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationTimeType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeType SIMULATION_TIME_TYPE_EDEFAULT = TimeType.EVENT;

	/**
	 * The cached value of the '{@link #getSimulationTimeType() <em>Simulation Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationTimeType()
	 * @generated
	 * @ordered
	 */
	protected TimeType simulationTimeType = SIMULATION_TIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationTimeInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationPackage.Literals.SIMULATION_TIME_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getSimulationTimeType() {
		return simulationTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationTimeType(TimeType newSimulationTimeType) {
		TimeType oldSimulationTimeType = simulationTimeType;
		simulationTimeType = newSimulationTimeType == null ? SIMULATION_TIME_TYPE_EDEFAULT : newSimulationTimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIMULATION_TIME_INFORMATION__SIMULATION_TIME_TYPE, oldSimulationTimeType, simulationTimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModularSimulationPackage.SIMULATION_TIME_INFORMATION__SIMULATION_TIME_TYPE:
				return getSimulationTimeType();
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
			case ModularSimulationPackage.SIMULATION_TIME_INFORMATION__SIMULATION_TIME_TYPE:
				setSimulationTimeType((TimeType)newValue);
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
			case ModularSimulationPackage.SIMULATION_TIME_INFORMATION__SIMULATION_TIME_TYPE:
				setSimulationTimeType(SIMULATION_TIME_TYPE_EDEFAULT);
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
			case ModularSimulationPackage.SIMULATION_TIME_INFORMATION__SIMULATION_TIME_TYPE:
				return simulationTimeType != SIMULATION_TIME_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (simulationTimeType: ");
		result.append(simulationTimeType);
		result.append(')');
		return result.toString();
	}

} //SimulationTimeInformationImpl
