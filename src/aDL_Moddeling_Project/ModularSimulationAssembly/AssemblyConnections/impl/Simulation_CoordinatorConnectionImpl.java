/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection;

import aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Coordinator Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.Simulation_CoordinatorConnectionImpl#getCoordinatorAssemblyEntity <em>Coordinator Assembly Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Simulation_CoordinatorConnectionImpl extends SimulationInvolvedConnectionImpl implements Simulation_CoordinatorConnection {
	/**
	 * The cached value of the '{@link #getCoordinatorAssemblyEntity() <em>Coordinator Assembly Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatorAssemblyEntity()
	 * @generated
	 * @ordered
	 */
	protected CoordinatorAssemblyEntity coordinatorAssemblyEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Simulation_CoordinatorConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.SIMULATION_COORDINATOR_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorAssemblyEntity getCoordinatorAssemblyEntity() {
		if (coordinatorAssemblyEntity != null && coordinatorAssemblyEntity.eIsProxy()) {
			InternalEObject oldCoordinatorAssemblyEntity = (InternalEObject)coordinatorAssemblyEntity;
			coordinatorAssemblyEntity = (CoordinatorAssemblyEntity)eResolveProxy(oldCoordinatorAssemblyEntity);
			if (coordinatorAssemblyEntity != oldCoordinatorAssemblyEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY, oldCoordinatorAssemblyEntity, coordinatorAssemblyEntity));
			}
		}
		return coordinatorAssemblyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorAssemblyEntity basicGetCoordinatorAssemblyEntity() {
		return coordinatorAssemblyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinatorAssemblyEntity(CoordinatorAssemblyEntity newCoordinatorAssemblyEntity) {
		CoordinatorAssemblyEntity oldCoordinatorAssemblyEntity = coordinatorAssemblyEntity;
		coordinatorAssemblyEntity = newCoordinatorAssemblyEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY, oldCoordinatorAssemblyEntity, coordinatorAssemblyEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyConnectionsPackage.SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY:
				if (resolve) return getCoordinatorAssemblyEntity();
				return basicGetCoordinatorAssemblyEntity();
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
			case AssemblyConnectionsPackage.SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY:
				setCoordinatorAssemblyEntity((CoordinatorAssemblyEntity)newValue);
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
			case AssemblyConnectionsPackage.SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY:
				setCoordinatorAssemblyEntity((CoordinatorAssemblyEntity)null);
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
			case AssemblyConnectionsPackage.SIMULATION_COORDINATOR_CONNECTION__COORDINATOR_ASSEMBLY_ENTITY:
				return coordinatorAssemblyEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //Simulation_CoordinatorConnectionImpl
