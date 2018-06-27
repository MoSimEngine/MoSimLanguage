/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.Assembly;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection;

import aDL_Moddeling_Project.ModularSimulationAssembly.CombinedAssemblyEntity;
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
 * An implementation of the model object '<em><b>Composed Assembly Coodinator Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl#getCoordinatorfunctionmapping <em>Coordinatorfunctionmapping</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl#getWorkerAssembledSimulation <em>Worker Assembled Simulation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl#getComposedassemblyentity <em>Composedassemblyentity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ComposedAssembly_CoodinatorConnectionImpl#getWorkerAssembledSimulationCoordinator <em>Worker Assembled Simulation Coordinator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposedAssembly_CoodinatorConnectionImpl extends Simulation_CoordinatorConnectionImpl implements ComposedAssembly_CoodinatorConnection {
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
	 * The cached value of the '{@link #getWorkerAssembledSimulation() <em>Worker Assembled Simulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerAssembledSimulation()
	 * @generated
	 * @ordered
	 */
	protected Assembly workerAssembledSimulation;

	/**
	 * The cached value of the '{@link #getComposedassemblyentity() <em>Composedassemblyentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedassemblyentity()
	 * @generated
	 * @ordered
	 */
	protected CombinedAssemblyEntity composedassemblyentity;

	/**
	 * The cached value of the '{@link #getWorkerAssembledSimulationCoordinator() <em>Worker Assembled Simulation Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerAssembledSimulationCoordinator()
	 * @generated
	 * @ordered
	 */
	protected CoordinatorAssemblyEntity workerAssembledSimulationCoordinator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAssembly_CoodinatorConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER, oldMaster, master));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER, oldMaster, master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinatorFunctionMapping> getCoordinatorfunctionmapping() {
		if (coordinatorfunctionmapping == null) {
			coordinatorfunctionmapping = new EObjectContainmentEList<CoordinatorFunctionMapping>(CoordinatorFunctionMapping.class, this, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING);
		}
		return coordinatorfunctionmapping;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION, oldWorkerAssembledSimulation, workerAssembledSimulation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION, oldWorkerAssembledSimulation, workerAssembledSimulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedAssemblyEntity getComposedassemblyentity() {
		if (composedassemblyentity != null && composedassemblyentity.eIsProxy()) {
			InternalEObject oldComposedassemblyentity = (InternalEObject)composedassemblyentity;
			composedassemblyentity = (CombinedAssemblyEntity)eResolveProxy(oldComposedassemblyentity);
			if (composedassemblyentity != oldComposedassemblyentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY, oldComposedassemblyentity, composedassemblyentity));
			}
		}
		return composedassemblyentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedAssemblyEntity basicGetComposedassemblyentity() {
		return composedassemblyentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposedassemblyentity(CombinedAssemblyEntity newComposedassemblyentity) {
		CombinedAssemblyEntity oldComposedassemblyentity = composedassemblyentity;
		composedassemblyentity = newComposedassemblyentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY, oldComposedassemblyentity, composedassemblyentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorAssemblyEntity getWorkerAssembledSimulationCoordinator() {
		if (workerAssembledSimulationCoordinator != null && workerAssembledSimulationCoordinator.eIsProxy()) {
			InternalEObject oldWorkerAssembledSimulationCoordinator = (InternalEObject)workerAssembledSimulationCoordinator;
			workerAssembledSimulationCoordinator = (CoordinatorAssemblyEntity)eResolveProxy(oldWorkerAssembledSimulationCoordinator);
			if (workerAssembledSimulationCoordinator != oldWorkerAssembledSimulationCoordinator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR, oldWorkerAssembledSimulationCoordinator, workerAssembledSimulationCoordinator));
			}
		}
		return workerAssembledSimulationCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorAssemblyEntity basicGetWorkerAssembledSimulationCoordinator() {
		return workerAssembledSimulationCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerAssembledSimulationCoordinator(CoordinatorAssemblyEntity newWorkerAssembledSimulationCoordinator) {
		CoordinatorAssemblyEntity oldWorkerAssembledSimulationCoordinator = workerAssembledSimulationCoordinator;
		workerAssembledSimulationCoordinator = newWorkerAssembledSimulationCoordinator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR, oldWorkerAssembledSimulationCoordinator, workerAssembledSimulationCoordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING:
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
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER:
				if (resolve) return getMaster();
				return basicGetMaster();
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING:
				return getCoordinatorfunctionmapping();
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION:
				if (resolve) return getWorkerAssembledSimulation();
				return basicGetWorkerAssembledSimulation();
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY:
				if (resolve) return getComposedassemblyentity();
				return basicGetComposedassemblyentity();
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR:
				if (resolve) return getWorkerAssembledSimulationCoordinator();
				return basicGetWorkerAssembledSimulationCoordinator();
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
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER:
				setMaster((CoordinatorAssemblyEntity)newValue);
				return;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING:
				getCoordinatorfunctionmapping().clear();
				getCoordinatorfunctionmapping().addAll((Collection<? extends CoordinatorFunctionMapping>)newValue);
				return;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION:
				setWorkerAssembledSimulation((Assembly)newValue);
				return;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY:
				setComposedassemblyentity((CombinedAssemblyEntity)newValue);
				return;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR:
				setWorkerAssembledSimulationCoordinator((CoordinatorAssemblyEntity)newValue);
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
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER:
				setMaster((CoordinatorAssemblyEntity)null);
				return;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING:
				getCoordinatorfunctionmapping().clear();
				return;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION:
				setWorkerAssembledSimulation((Assembly)null);
				return;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY:
				setComposedassemblyentity((CombinedAssemblyEntity)null);
				return;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR:
				setWorkerAssembledSimulationCoordinator((CoordinatorAssemblyEntity)null);
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
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER:
				return master != null;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING:
				return coordinatorfunctionmapping != null && !coordinatorfunctionmapping.isEmpty();
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION:
				return workerAssembledSimulation != null;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COMPOSEDASSEMBLYENTITY:
				return composedassemblyentity != null;
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION_COORDINATOR:
				return workerAssembledSimulationCoordinator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MasterWorkerConnection.class) {
			switch (derivedFeatureID) {
				case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER: return AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__MASTER;
				case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING: return AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING;
				default: return -1;
			}
		}
		if (baseClass == MWAssembly_CoordinatorConnection.class) {
			switch (derivedFeatureID) {
				case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION: return AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MasterWorkerConnection.class) {
			switch (baseFeatureID) {
				case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__MASTER: return AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__MASTER;
				case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION__COORDINATORFUNCTIONMAPPING: return AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__COORDINATORFUNCTIONMAPPING;
				default: return -1;
			}
		}
		if (baseClass == MWAssembly_CoordinatorConnection.class) {
			switch (baseFeatureID) {
				case AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION: return AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION__WORKER_ASSEMBLED_SIMULATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComposedAssembly_CoodinatorConnectionImpl
