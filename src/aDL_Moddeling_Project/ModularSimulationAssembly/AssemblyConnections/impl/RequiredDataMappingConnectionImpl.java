/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection;

import aDL_Moddeling_Project.basic.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Data Mapping Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.RequiredDataMappingConnectionImpl#getProvidedrequiredconnection <em>Providedrequiredconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequiredDataMappingConnectionImpl extends IdentifierImpl implements RequiredDataMappingConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredDataMappingConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.REQUIRED_DATA_MAPPING_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRequiredConnection getProvidedrequiredconnection() {
		if (eContainerFeatureID() != AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION) return null;
		return (ProvidedRequiredConnection)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedrequiredconnection(ProvidedRequiredConnection newProvidedrequiredconnection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProvidedrequiredconnection, AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedrequiredconnection(ProvidedRequiredConnection newProvidedrequiredconnection) {
		if (newProvidedrequiredconnection != eInternalContainer() || (eContainerFeatureID() != AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION && newProvidedrequiredconnection != null)) {
			if (EcoreUtil.isAncestor(this, newProvidedrequiredconnection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvidedrequiredconnection != null)
				msgs = ((InternalEObject)newProvidedrequiredconnection).eInverseAdd(this, AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION, ProvidedRequiredConnection.class, msgs);
			msgs = basicSetProvidedrequiredconnection(newProvidedrequiredconnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION, newProvidedrequiredconnection, newProvidedrequiredconnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProvidedrequiredconnection((ProvidedRequiredConnection)otherEnd, msgs);
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
			case AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION:
				return basicSetProvidedrequiredconnection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION:
				return eInternalContainer().eInverseRemove(this, AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION__REQUIREDDATAMAPPINGCONNECTION, ProvidedRequiredConnection.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION:
				return getProvidedrequiredconnection();
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
			case AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION:
				setProvidedrequiredconnection((ProvidedRequiredConnection)newValue);
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
			case AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION:
				setProvidedrequiredconnection((ProvidedRequiredConnection)null);
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
			case AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION__PROVIDEDREQUIREDCONNECTION:
				return getProvidedrequiredconnection() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredDataMappingConnectionImpl
