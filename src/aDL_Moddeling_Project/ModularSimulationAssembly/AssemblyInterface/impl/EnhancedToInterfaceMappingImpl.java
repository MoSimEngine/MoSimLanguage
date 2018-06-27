/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enhanced To Interface Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.EnhancedToInterfaceMappingImpl#getAbstractassemblyentity <em>Abstractassemblyentity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.EnhancedToInterfaceMappingImpl#getAdditionenhanced <em>Additionenhanced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnhancedToInterfaceMappingImpl extends MinimalEObjectImpl.Container implements EnhancedToInterfaceMapping {
	/**
	 * The cached value of the '{@link #getAbstractassemblyentity() <em>Abstractassemblyentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractassemblyentity()
	 * @generated
	 * @ordered
	 */
	protected AbstractAssemblyEntity abstractassemblyentity;

	/**
	 * The cached value of the '{@link #getAdditionenhanced() <em>Additionenhanced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenhanced()
	 * @generated
	 * @ordered
	 */
	protected AdditionEnhanced additionenhanced;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnhancedToInterfaceMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.ENHANCED_TO_INTERFACE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAssemblyEntity getAbstractassemblyentity() {
		if (abstractassemblyentity != null && abstractassemblyentity.eIsProxy()) {
			InternalEObject oldAbstractassemblyentity = (InternalEObject)abstractassemblyentity;
			abstractassemblyentity = (AbstractAssemblyEntity)eResolveProxy(oldAbstractassemblyentity);
			if (abstractassemblyentity != oldAbstractassemblyentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY, oldAbstractassemblyentity, abstractassemblyentity));
			}
		}
		return abstractassemblyentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAssemblyEntity basicGetAbstractassemblyentity() {
		return abstractassemblyentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractassemblyentity(AbstractAssemblyEntity newAbstractassemblyentity) {
		AbstractAssemblyEntity oldAbstractassemblyentity = abstractassemblyentity;
		abstractassemblyentity = newAbstractassemblyentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY, oldAbstractassemblyentity, abstractassemblyentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnhanced getAdditionenhanced() {
		if (additionenhanced != null && additionenhanced.eIsProxy()) {
			InternalEObject oldAdditionenhanced = (InternalEObject)additionenhanced;
			additionenhanced = (AdditionEnhanced)eResolveProxy(oldAdditionenhanced);
			if (additionenhanced != oldAdditionenhanced) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED, oldAdditionenhanced, additionenhanced));
			}
		}
		return additionenhanced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnhanced basicGetAdditionenhanced() {
		return additionenhanced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionenhanced(AdditionEnhanced newAdditionenhanced) {
		AdditionEnhanced oldAdditionenhanced = additionenhanced;
		additionenhanced = newAdditionenhanced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED, oldAdditionenhanced, additionenhanced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY:
				if (resolve) return getAbstractassemblyentity();
				return basicGetAbstractassemblyentity();
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED:
				if (resolve) return getAdditionenhanced();
				return basicGetAdditionenhanced();
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
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY:
				setAbstractassemblyentity((AbstractAssemblyEntity)newValue);
				return;
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED:
				setAdditionenhanced((AdditionEnhanced)newValue);
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
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY:
				setAbstractassemblyentity((AbstractAssemblyEntity)null);
				return;
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED:
				setAdditionenhanced((AdditionEnhanced)null);
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
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY:
				return abstractassemblyentity != null;
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED:
				return additionenhanced != null;
		}
		return super.eIsSet(featureID);
	}

} //EnhancedToInterfaceMappingImpl
