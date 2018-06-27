/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Oriented View Required Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ObjectOrientedViewRequiredDataMappingImpl#getRequieringinterfaceobjectclassmapping <em>Requieringinterfaceobjectclassmapping</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.ObjectOrientedViewRequiredDataMappingImpl#getProvidinginterfaceobjectclassmapping <em>Providinginterfaceobjectclassmapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectOrientedViewRequiredDataMappingImpl extends RequiredDataMappingConnectionImpl implements ObjectOrientedViewRequiredDataMapping {
	/**
	 * The cached value of the '{@link #getRequieringinterfaceobjectclassmapping() <em>Requieringinterfaceobjectclassmapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequieringinterfaceobjectclassmapping()
	 * @generated
	 * @ordered
	 */
	protected RequieringInterfaceObjectClassMapping requieringinterfaceobjectclassmapping;

	/**
	 * The cached value of the '{@link #getProvidinginterfaceobjectclassmapping() <em>Providinginterfaceobjectclassmapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidinginterfaceobjectclassmapping()
	 * @generated
	 * @ordered
	 */
	protected ProvidingInterfaceObjectClassMapping providinginterfaceobjectclassmapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectOrientedViewRequiredDataMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequieringInterfaceObjectClassMapping getRequieringinterfaceobjectclassmapping() {
		if (requieringinterfaceobjectclassmapping != null && requieringinterfaceobjectclassmapping.eIsProxy()) {
			InternalEObject oldRequieringinterfaceobjectclassmapping = (InternalEObject)requieringinterfaceobjectclassmapping;
			requieringinterfaceobjectclassmapping = (RequieringInterfaceObjectClassMapping)eResolveProxy(oldRequieringinterfaceobjectclassmapping);
			if (requieringinterfaceobjectclassmapping != oldRequieringinterfaceobjectclassmapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING, oldRequieringinterfaceobjectclassmapping, requieringinterfaceobjectclassmapping));
			}
		}
		return requieringinterfaceobjectclassmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequieringInterfaceObjectClassMapping basicGetRequieringinterfaceobjectclassmapping() {
		return requieringinterfaceobjectclassmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequieringinterfaceobjectclassmapping(RequieringInterfaceObjectClassMapping newRequieringinterfaceobjectclassmapping) {
		RequieringInterfaceObjectClassMapping oldRequieringinterfaceobjectclassmapping = requieringinterfaceobjectclassmapping;
		requieringinterfaceobjectclassmapping = newRequieringinterfaceobjectclassmapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING, oldRequieringinterfaceobjectclassmapping, requieringinterfaceobjectclassmapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidingInterfaceObjectClassMapping getProvidinginterfaceobjectclassmapping() {
		if (providinginterfaceobjectclassmapping != null && providinginterfaceobjectclassmapping.eIsProxy()) {
			InternalEObject oldProvidinginterfaceobjectclassmapping = (InternalEObject)providinginterfaceobjectclassmapping;
			providinginterfaceobjectclassmapping = (ProvidingInterfaceObjectClassMapping)eResolveProxy(oldProvidinginterfaceobjectclassmapping);
			if (providinginterfaceobjectclassmapping != oldProvidinginterfaceobjectclassmapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING, oldProvidinginterfaceobjectclassmapping, providinginterfaceobjectclassmapping));
			}
		}
		return providinginterfaceobjectclassmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidingInterfaceObjectClassMapping basicGetProvidinginterfaceobjectclassmapping() {
		return providinginterfaceobjectclassmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidinginterfaceobjectclassmapping(ProvidingInterfaceObjectClassMapping newProvidinginterfaceobjectclassmapping) {
		ProvidingInterfaceObjectClassMapping oldProvidinginterfaceobjectclassmapping = providinginterfaceobjectclassmapping;
		providinginterfaceobjectclassmapping = newProvidinginterfaceobjectclassmapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING, oldProvidinginterfaceobjectclassmapping, providinginterfaceobjectclassmapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				if (resolve) return getRequieringinterfaceobjectclassmapping();
				return basicGetRequieringinterfaceobjectclassmapping();
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				if (resolve) return getProvidinginterfaceobjectclassmapping();
				return basicGetProvidinginterfaceobjectclassmapping();
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
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				setRequieringinterfaceobjectclassmapping((RequieringInterfaceObjectClassMapping)newValue);
				return;
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				setProvidinginterfaceobjectclassmapping((ProvidingInterfaceObjectClassMapping)newValue);
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
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				setRequieringinterfaceobjectclassmapping((RequieringInterfaceObjectClassMapping)null);
				return;
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				setProvidinginterfaceobjectclassmapping((ProvidingInterfaceObjectClassMapping)null);
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
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				return requieringinterfaceobjectclassmapping != null;
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				return providinginterfaceobjectclassmapping != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectOrientedViewRequiredDataMappingImpl
