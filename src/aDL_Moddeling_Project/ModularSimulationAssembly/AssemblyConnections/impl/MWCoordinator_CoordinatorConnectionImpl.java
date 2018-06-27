/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularEnvironment.Coordinator;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MW Coordinator Coordinator Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MWCoordinator_CoordinatorConnectionImpl#getWorker <em>Worker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MWCoordinator_CoordinatorConnectionImpl extends MasterWorkerConnectionImpl implements MWCoordinator_CoordinatorConnection {
	/**
	 * The cached value of the '{@link #getWorker() <em>Worker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorker()
	 * @generated
	 * @ordered
	 */
	protected Coordinator worker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MWCoordinator_CoordinatorConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.MW_COORDINATOR_COORDINATOR_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinator getWorker() {
		if (worker != null && worker.eIsProxy()) {
			InternalEObject oldWorker = (InternalEObject)worker;
			worker = (Coordinator)eResolveProxy(oldWorker);
			if (worker != oldWorker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER, oldWorker, worker));
			}
		}
		return worker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinator basicGetWorker() {
		return worker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorker(Coordinator newWorker) {
		Coordinator oldWorker = worker;
		worker = newWorker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER, oldWorker, worker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyConnectionsPackage.MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER:
				if (resolve) return getWorker();
				return basicGetWorker();
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
			case AssemblyConnectionsPackage.MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER:
				setWorker((Coordinator)newValue);
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
			case AssemblyConnectionsPackage.MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER:
				setWorker((Coordinator)null);
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
			case AssemblyConnectionsPackage.MW_COORDINATOR_COORDINATOR_CONNECTION__WORKER:
				return worker != null;
		}
		return super.eIsSet(featureID);
	}

} //MWCoordinator_CoordinatorConnectionImpl
