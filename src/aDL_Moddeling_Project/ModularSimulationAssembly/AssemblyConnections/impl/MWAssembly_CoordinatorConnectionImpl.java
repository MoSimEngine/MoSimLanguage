/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.Assembly;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MW Assembly Coordinator Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWAssembly_CoordinatorConnectionImpl#getWorkerAssembledSimulation <em>Worker Assembled Simulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MWAssembly_CoordinatorConnectionImpl extends MasterWorkerConnectionImpl implements MWAssembly_CoordinatorConnection {
	/**
	 * The cached value of the '{@link #getWorkerAssembledSimulation() <em>Worker Assembled Simulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerAssembledSimulation()
	 * @generated
	 * @ordered
	 */
	protected Assembly workerAssembledSimulation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MWAssembly_CoordinatorConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.MW_ASSEMBLY_COORDINATOR_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly getWorkerAssembledSimulation() {
		if (workerAssembledSimulation != null && workerAssembledSimulation.eIsProxy()) {
			InternalEObject oldWorkerAssembledSimulation = (InternalEObject)workerAssembledSimulation;
			workerAssembledSimulation = (Assembly)eResolveProxy(oldWorkerAssembledSimulation);
			if (workerAssembledSimulation != oldWorkerAssembledSimulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION, oldWorkerAssembledSimulation, workerAssembledSimulation));
			}
		}
		return workerAssembledSimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly basicGetWorkerAssembledSimulation() {
		return workerAssembledSimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerAssembledSimulation(Assembly newWorkerAssembledSimulation) {
		Assembly oldWorkerAssembledSimulation = workerAssembledSimulation;
		workerAssembledSimulation = newWorkerAssembledSimulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION, oldWorkerAssembledSimulation, workerAssembledSimulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION:
				if (resolve) return getWorkerAssembledSimulation();
				return basicGetWorkerAssembledSimulation();
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
			case AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION:
				setWorkerAssembledSimulation((Assembly)newValue);
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
			case AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION:
				setWorkerAssembledSimulation((Assembly)null);
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
			case AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION:
				return workerAssembledSimulation != null;
		}
		return super.eIsSet(featureID);
	}

} //MWAssembly_CoordinatorConnectionImpl
