/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privded Interface Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.PrivdedInterfaceMappingImpl#getProvidinginterfaceobjectclassmapping <em>Providinginterfaceobjectclassmapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivdedInterfaceMappingImpl extends InterfaceMappingImpl implements PrivdedInterfaceMapping {
	/**
	 * The cached value of the '{@link #getProvidinginterfaceobjectclassmapping() <em>Providinginterfaceobjectclassmapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidinginterfaceobjectclassmapping()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidingInterfaceObjectClassMapping> providinginterfaceobjectclassmapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivdedInterfaceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.PRIVDED_INTERFACE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidingInterfaceObjectClassMapping> getProvidinginterfaceobjectclassmapping() {
		if (providinginterfaceobjectclassmapping == null) {
			providinginterfaceobjectclassmapping = new EObjectContainmentEList<ProvidingInterfaceObjectClassMapping>(ProvidingInterfaceObjectClassMapping.class, this, AssemblyInterfacePackage.PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING);
		}
		return providinginterfaceobjectclassmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyInterfacePackage.PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				return ((InternalEList<?>)getProvidinginterfaceobjectclassmapping()).basicRemove(otherEnd, msgs);
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
			case AssemblyInterfacePackage.PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				return getProvidinginterfaceobjectclassmapping();
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
			case AssemblyInterfacePackage.PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				getProvidinginterfaceobjectclassmapping().clear();
				getProvidinginterfaceobjectclassmapping().addAll((Collection<? extends ProvidingInterfaceObjectClassMapping>)newValue);
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
			case AssemblyInterfacePackage.PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				getProvidinginterfaceobjectclassmapping().clear();
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
			case AssemblyInterfacePackage.PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING:
				return providinginterfaceobjectclassmapping != null && !providinginterfaceobjectclassmapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrivdedInterfaceMappingImpl
