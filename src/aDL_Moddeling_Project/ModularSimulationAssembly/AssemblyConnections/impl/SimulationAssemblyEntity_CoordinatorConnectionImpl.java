/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection;

import aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Assembly Entity Coordinator Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationAssemblyEntity_CoordinatorConnectionImpl#getSimulation <em>Simulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationAssemblyEntity_CoordinatorConnectionImpl extends Simulation_CoordinatorConnectionImpl implements SimulationAssemblyEntity_CoordinatorConnection {
	/**
	 * The cached value of the '{@link #getSimulation() <em>Simulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulation()
	 * @generated
	 * @ordered
	 */
	protected SimulationAssemblyEntity simulation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationAssemblyEntity_CoordinatorConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationAssemblyEntity getSimulation() {
		if (simulation != null && simulation.eIsProxy()) {
			InternalEObject oldSimulation = (InternalEObject)simulation;
			simulation = (SimulationAssemblyEntity)eResolveProxy(oldSimulation);
			if (simulation != oldSimulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION, oldSimulation, simulation));
			}
		}
		return simulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationAssemblyEntity basicGetSimulation() {
		return simulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulation(SimulationAssemblyEntity newSimulation) {
		SimulationAssemblyEntity oldSimulation = simulation;
		simulation = newSimulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION, oldSimulation, simulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyConnectionsPackage.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION:
				if (resolve) return getSimulation();
				return basicGetSimulation();
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
			case AssemblyConnectionsPackage.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION:
				setSimulation((SimulationAssemblyEntity)newValue);
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
			case AssemblyConnectionsPackage.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION:
				setSimulation((SimulationAssemblyEntity)null);
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
			case AssemblyConnectionsPackage.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION__SIMULATION:
				return simulation != null;
		}
		return super.eIsSet(featureID);
	}

} //SimulationAssemblyEntity_CoordinatorConnectionImpl
