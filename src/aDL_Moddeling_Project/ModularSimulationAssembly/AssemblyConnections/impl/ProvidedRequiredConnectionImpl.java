/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Required Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ProvidedRequiredConnectionImpl#getRequireddatamappingconnection <em>Requireddatamappingconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProvidedRequiredConnectionImpl extends InterfaceProvidedRequiredConnectionImpl implements ProvidedRequiredConnection {
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
	protected ProvidedRequiredConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.PROVIDED_REQUIRED_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredDataMappingConnection> getRequireddatamappingconnection() {
		if (requireddatamappingconnection == null) {
			requireddatamappingconnection = new EObjectContainmentWithInverseEList<RequiredDataMappingConnection>(RequiredDataMappingConnection.class, this, AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION, AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION);
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
			case AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
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
			case AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
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
			case AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
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
			case AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
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
			case AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
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
			case AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION:
				return requireddatamappingconnection != null && !requireddatamappingconnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvidedRequiredConnectionImpl
