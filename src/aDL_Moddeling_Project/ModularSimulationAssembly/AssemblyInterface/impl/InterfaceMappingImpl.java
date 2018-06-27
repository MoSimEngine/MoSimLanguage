/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping;

import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;

import aDL_Moddeling_Project.basic.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceMappingImpl#getAssembableentity <em>Assembableentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceMappingImpl extends IdentifierImpl implements InterfaceMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.INTERFACE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembableEntity getAssembableentity() {
		if (eContainerFeatureID() != AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY) return null;
		return (AssembableEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssembableentity(AssembableEntity newAssembableentity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssembableentity, AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssembableentity(AssembableEntity newAssembableentity) {
		if (newAssembableentity != eInternalContainer() || (eContainerFeatureID() != AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY && newAssembableentity != null)) {
			if (EcoreUtil.isAncestor(this, newAssembableentity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssembableentity != null)
				msgs = ((InternalEObject)newAssembableentity).eInverseAdd(this, ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING, AssembableEntity.class, msgs);
			msgs = basicSetAssembableentity(newAssembableentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY, newAssembableentity, newAssembableentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssembableentity((AssembableEntity)otherEnd, msgs);
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
			case AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY:
				return basicSetAssembableentity(null, msgs);
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
			case AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY:
				return eInternalContainer().eInverseRemove(this, ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING, AssembableEntity.class, msgs);
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
			case AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY:
				return getAssembableentity();
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
			case AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY:
				setAssembableentity((AssembableEntity)newValue);
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
			case AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY:
				setAssembableentity((AssembableEntity)null);
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
			case AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY:
				return getAssembableentity() != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceMappingImpl
