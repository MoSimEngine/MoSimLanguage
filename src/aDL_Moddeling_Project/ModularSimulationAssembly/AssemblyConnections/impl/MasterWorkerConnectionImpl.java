/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection;

import aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity;

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
 * An implementation of the model object '<em><b>Master Worker Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MasterWorkerConnectionImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.MasterWorkerConnectionImpl#getCoordinatorfunctionmapping <em>Coordinatorfunctionmapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MasterWorkerConnectionImpl extends ConnectionImpl implements MasterWorkerConnection {
	/**
	 * The cached value of the '{@link #getMaster() <em>Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaster()
	 * @generated
	 * @ordered
	 */
	protected CoordinatorAssemblyEntity master;

	/**
	 * The cached value of the '{@link #getCoordinatorfunctionmapping() <em>Coordinatorfunctionmapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatorfunctionmapping()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinatorFunctionMapping> coordinatorfunctionmapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterWorkerConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.MASTER_WORKER_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorAssemblyEntity getMaster() {
		if (master != null && master.eIsProxy()) {
			InternalEObject oldMaster = (InternalEObject)master;
			master = (CoordinatorAssemblyEntity)eResolveProxy(oldMaster);
			if (master != oldMaster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__MASTER, oldMaster, master));
			}
		}
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorAssemblyEntity basicGetMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(CoordinatorAssemblyEntity newMaster) {
		CoordinatorAssemblyEntity oldMaster = master;
		master = newMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__MASTER, oldMaster, master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinatorFunctionMapping> getCoordinatorfunctionmapping() {
		if (coordinatorfunctionmapping == null) {
			coordinatorfunctionmapping = new EObjectContainmentEList<CoordinatorFunctionMapping>(CoordinatorFunctionMapping.class, this, AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING);
		}
		return coordinatorfunctionmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING:
				return ((InternalEList<?>)getCoordinatorfunctionmapping()).basicRemove(otherEnd, msgs);
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
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__MASTER:
				if (resolve) return getMaster();
				return basicGetMaster();
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING:
				return getCoordinatorfunctionmapping();
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
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__MASTER:
				setMaster((CoordinatorAssemblyEntity)newValue);
				return;
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING:
				getCoordinatorfunctionmapping().clear();
				getCoordinatorfunctionmapping().addAll((Collection<? extends CoordinatorFunctionMapping>)newValue);
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
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__MASTER:
				setMaster((CoordinatorAssemblyEntity)null);
				return;
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING:
				getCoordinatorfunctionmapping().clear();
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
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__MASTER:
				return master != null;
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING:
				return coordinatorfunctionmapping != null && !coordinatorfunctionmapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MasterWorkerConnectionImpl
