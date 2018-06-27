/**
 */
package aDL_Moddeling_Project.ModularEnvironment.impl;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterfaceDefinition;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer;

import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;

import aDL_Moddeling_Project.basic.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addition Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceDefinitionImpl#getAdditions <em>Additions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AdditionInterfaceDefinitionImpl extends IdentifierImpl implements AdditionInterfaceDefinition {
	/**
	 * The cached value of the '{@link #getAdditions() <em>Additions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<MSEPropertyAdditionContainer> additions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionInterfaceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularEnvironmentPackage.Literals.ADDITION_INTERFACE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSEPropertyAdditionContainer> getAdditions() {
		if (additions == null) {
			additions = new EObjectResolvingEList<MSEPropertyAdditionContainer>(MSEPropertyAdditionContainer.class, this, ModularEnvironmentPackage.ADDITION_INTERFACE_DEFINITION__ADDITIONS);
		}
		return additions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModularEnvironmentPackage.ADDITION_INTERFACE_DEFINITION__ADDITIONS:
				return getAdditions();
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
			case ModularEnvironmentPackage.ADDITION_INTERFACE_DEFINITION__ADDITIONS:
				getAdditions().clear();
				getAdditions().addAll((Collection<? extends MSEPropertyAdditionContainer>)newValue);
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
			case ModularEnvironmentPackage.ADDITION_INTERFACE_DEFINITION__ADDITIONS:
				getAdditions().clear();
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
			case ModularEnvironmentPackage.ADDITION_INTERFACE_DEFINITION__ADDITIONS:
				return additions != null && !additions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdditionInterfaceDefinitionImpl
