/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping;

import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssembableEntityImpl#getUsedgeneralsimulationfunction <em>Usedgeneralsimulationfunction</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssembableEntityImpl#getInterfacemapping <em>Interfacemapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssembableEntityImpl extends EntityImpl implements AssembableEntity {
	/**
	 * The cached value of the '{@link #getUsedgeneralsimulationfunction() <em>Usedgeneralsimulationfunction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedgeneralsimulationfunction()
	 * @generated
	 * @ordered
	 */
	protected EList<generalSimulationFunction> usedgeneralsimulationfunction;

	/**
	 * The cached value of the '{@link #getInterfacemapping() <em>Interfacemapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacemapping()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceMapping> interfacemapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssembableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationAssemblyPackage.Literals.ASSEMBABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<generalSimulationFunction> getUsedgeneralsimulationfunction() {
		if (usedgeneralsimulationfunction == null) {
			usedgeneralsimulationfunction = new EObjectResolvingEList<generalSimulationFunction>(generalSimulationFunction.class, this, ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION);
		}
		return usedgeneralsimulationfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceMapping> getInterfacemapping() {
		if (interfacemapping == null) {
			interfacemapping = new EObjectContainmentWithInverseEList<InterfaceMapping>(InterfaceMapping.class, this, ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING, AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY);
		}
		return interfacemapping;
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
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfacemapping()).basicAdd(otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING:
				return ((InternalEList<?>)getInterfacemapping()).basicRemove(otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				return getUsedgeneralsimulationfunction();
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING:
				return getInterfacemapping();
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
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				getUsedgeneralsimulationfunction().clear();
				getUsedgeneralsimulationfunction().addAll((Collection<? extends generalSimulationFunction>)newValue);
				return;
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING:
				getInterfacemapping().clear();
				getInterfacemapping().addAll((Collection<? extends InterfaceMapping>)newValue);
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
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				getUsedgeneralsimulationfunction().clear();
				return;
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING:
				getInterfacemapping().clear();
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
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				return usedgeneralsimulationfunction != null && !usedgeneralsimulationfunction.isEmpty();
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING:
				return interfacemapping != null && !interfacemapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssembableEntityImpl
