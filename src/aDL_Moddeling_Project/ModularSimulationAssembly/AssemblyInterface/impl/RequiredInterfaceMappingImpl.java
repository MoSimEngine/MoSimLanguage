/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Interface Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequiredInterfaceMappingImpl#getRequieringinterfaceobjectclassmapping <em>Requieringinterfaceobjectclassmapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredInterfaceMappingImpl extends InterfaceMappingImpl implements RequiredInterfaceMapping {
	/**
	 * The cached value of the '{@link #getRequieringinterfaceobjectclassmapping() <em>Requieringinterfaceobjectclassmapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequieringinterfaceobjectclassmapping()
	 * @generated
	 * @ordered
	 */
	protected EList<RequieringInterfaceObjectClassMapping> requieringinterfaceobjectclassmapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredInterfaceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.REQUIRED_INTERFACE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequieringInterfaceObjectClassMapping> getRequieringinterfaceobjectclassmapping() {
		if (requieringinterfaceobjectclassmapping == null) {
			requieringinterfaceobjectclassmapping = new EObjectContainmentEList<RequieringInterfaceObjectClassMapping>(RequieringInterfaceObjectClassMapping.class, this, AssemblyInterfacePackage.REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING);
		}
		return requieringinterfaceobjectclassmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyInterfacePackage.REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				return ((InternalEList<?>)getRequieringinterfaceobjectclassmapping()).basicRemove(otherEnd, msgs);
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
			case AssemblyInterfacePackage.REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				return getRequieringinterfaceobjectclassmapping();
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
			case AssemblyInterfacePackage.REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				getRequieringinterfaceobjectclassmapping().clear();
				getRequieringinterfaceobjectclassmapping().addAll((Collection<? extends RequieringInterfaceObjectClassMapping>)newValue);
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
			case AssemblyInterfacePackage.REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				getRequieringinterfaceobjectclassmapping().clear();
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
			case AssemblyInterfacePackage.REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING:
				return requieringinterfaceobjectclassmapping != null && !requieringinterfaceobjectclassmapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequiredInterfaceMappingImpl
