/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinator Function Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.CoordinatorFunctionMappingImpl#getMasterServiceFunction <em>Master Service Function</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.CoordinatorFunctionMappingImpl#getWorkerServiceFunction <em>Worker Service Function</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.CoordinatorFunctionMappingImpl#getFunctionMappingModus <em>Function Mapping Modus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinatorFunctionMappingImpl extends MinimalEObjectImpl.Container implements CoordinatorFunctionMapping {
	/**
	 * The cached value of the '{@link #getMasterServiceFunction() <em>Master Service Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterServiceFunction()
	 * @generated
	 * @ordered
	 */
	protected ManagementServiceFunction masterServiceFunction;

	/**
	 * The cached value of the '{@link #getWorkerServiceFunction() <em>Worker Service Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerServiceFunction()
	 * @generated
	 * @ordered
	 */
	protected ManagementServiceFunction workerServiceFunction;

	/**
	 * The default value of the '{@link #getFunctionMappingModus() <em>Function Mapping Modus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionMappingModus()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionMappingModus FUNCTION_MAPPING_MODUS_EDEFAULT = FunctionMappingModus.PASS_THROUGH;

	/**
	 * The cached value of the '{@link #getFunctionMappingModus() <em>Function Mapping Modus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionMappingModus()
	 * @generated
	 * @ordered
	 */
	protected FunctionMappingModus functionMappingModus = FUNCTION_MAPPING_MODUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatorFunctionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.COORDINATOR_FUNCTION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServiceFunction getMasterServiceFunction() {
		if (masterServiceFunction != null && masterServiceFunction.eIsProxy()) {
			InternalEObject oldMasterServiceFunction = (InternalEObject)masterServiceFunction;
			masterServiceFunction = (ManagementServiceFunction)eResolveProxy(oldMasterServiceFunction);
			if (masterServiceFunction != oldMasterServiceFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION, oldMasterServiceFunction, masterServiceFunction));
			}
		}
		return masterServiceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServiceFunction basicGetMasterServiceFunction() {
		return masterServiceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterServiceFunction(ManagementServiceFunction newMasterServiceFunction) {
		ManagementServiceFunction oldMasterServiceFunction = masterServiceFunction;
		masterServiceFunction = newMasterServiceFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION, oldMasterServiceFunction, masterServiceFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServiceFunction getWorkerServiceFunction() {
		if (workerServiceFunction != null && workerServiceFunction.eIsProxy()) {
			InternalEObject oldWorkerServiceFunction = (InternalEObject)workerServiceFunction;
			workerServiceFunction = (ManagementServiceFunction)eResolveProxy(oldWorkerServiceFunction);
			if (workerServiceFunction != oldWorkerServiceFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION, oldWorkerServiceFunction, workerServiceFunction));
			}
		}
		return workerServiceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServiceFunction basicGetWorkerServiceFunction() {
		return workerServiceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerServiceFunction(ManagementServiceFunction newWorkerServiceFunction) {
		ManagementServiceFunction oldWorkerServiceFunction = workerServiceFunction;
		workerServiceFunction = newWorkerServiceFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION, oldWorkerServiceFunction, workerServiceFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMappingModus getFunctionMappingModus() {
		return functionMappingModus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionMappingModus(FunctionMappingModus newFunctionMappingModus) {
		FunctionMappingModus oldFunctionMappingModus = functionMappingModus;
		functionMappingModus = newFunctionMappingModus == null ? FUNCTION_MAPPING_MODUS_EDEFAULT : newFunctionMappingModus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__FUNCTION_MAPPING_MODUS, oldFunctionMappingModus, functionMappingModus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION:
				if (resolve) return getMasterServiceFunction();
				return basicGetMasterServiceFunction();
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION:
				if (resolve) return getWorkerServiceFunction();
				return basicGetWorkerServiceFunction();
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__FUNCTION_MAPPING_MODUS:
				return getFunctionMappingModus();
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
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION:
				setMasterServiceFunction((ManagementServiceFunction)newValue);
				return;
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION:
				setWorkerServiceFunction((ManagementServiceFunction)newValue);
				return;
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__FUNCTION_MAPPING_MODUS:
				setFunctionMappingModus((FunctionMappingModus)newValue);
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
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION:
				setMasterServiceFunction((ManagementServiceFunction)null);
				return;
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION:
				setWorkerServiceFunction((ManagementServiceFunction)null);
				return;
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__FUNCTION_MAPPING_MODUS:
				setFunctionMappingModus(FUNCTION_MAPPING_MODUS_EDEFAULT);
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
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__MASTER_SERVICE_FUNCTION:
				return masterServiceFunction != null;
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__WORKER_SERVICE_FUNCTION:
				return workerServiceFunction != null;
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING__FUNCTION_MAPPING_MODUS:
				return functionMappingModus != FUNCTION_MAPPING_MODUS_EDEFAULT;
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
		result.append(" (functionMappingModus: ");
		result.append(functionMappingModus);
		result.append(')');
		return result.toString();
	}

} //CoordinatorFunctionMappingImpl
