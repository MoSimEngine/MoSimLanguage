/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.InterfaceProvidedRequiredConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationInvolvedConnection;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Involved Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.SimulationInvolvedConnectionImpl#getRequireddatamappingconnection <em>Requireddatamappingconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimulationInvolvedConnectionImpl extends ConnectionImpl implements SimulationInvolvedConnection {
	/**
	 * The cached value of the '{@link #getRequireddatamappingconnection() <em>Requireddatamappingconnection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireddatamappingconnection()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredDataMappingConnection> requireddatamappingconnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationInvolvedConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.SIMULATION_INVOLVED_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredDataMappingConnection> getRequireddatamappingconnection() {
		if (requireddatamappingconnection == null) {
			requireddatamappingconnection = new EObjectContainmentWithInverseEList<RequiredDataMappingConnection>(RequiredDataMappingConnection.class, this, AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION, AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION);
		}
		return requireddatamappingconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequireddatamappingconnection()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
				return ((InternalEList<?>)getRequireddatamappingconnection()).basicRemove(otherEnd, msgs);
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
			case AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
				return getRequireddatamappingconnection();
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
			case AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
				getRequireddatamappingconnection().clear();
				getRequireddatamappingconnection().addAll((Collection<? extends RequiredDataMappingConnection>)newValue);
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
			case AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
				getRequireddatamappingconnection().clear();
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
			case AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
				return requireddatamappingconnection != null && !requireddatamappingconnection.isEmpty();
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
		if (baseClass == InterfaceProvidedRequiredConnection.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProvidedRequiredConnection.class) {
			switch (derivedFeatureID) {
				case AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION: return AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION;
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
		if (baseClass == InterfaceProvidedRequiredConnection.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProvidedRequiredConnection.class) {
			switch (baseFeatureID) {
				case AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION: return AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimulationInvolvedConnectionImpl
