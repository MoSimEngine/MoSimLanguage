/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.ObjectBasedEnhancedInformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Based Enhanced Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.ObjectBasedEnhancedInformationImpl#getAdditionenchancedobjectclass <em>Additionenchancedobjectclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectBasedEnhancedInformationImpl extends AdditionEnhancedInformationImpl implements ObjectBasedEnhancedInformation {
	/**
	 * The cached value of the '{@link #getAdditionenchancedobjectclass() <em>Additionenchancedobjectclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenchancedobjectclass()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionEnchancedObjectClass> additionenchancedobjectclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectBasedEnhancedInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyAdditionEnhancementPackage.Literals.OBJECT_BASED_ENHANCED_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionEnchancedObjectClass> getAdditionenchancedobjectclass() {
		if (additionenchancedobjectclass == null) {
			additionenchancedobjectclass = new EObjectContainmentEList<AdditionEnchancedObjectClass>(AdditionEnchancedObjectClass.class, this, AssemblyAdditionEnhancementPackage.OBJECT_BASED_ENHANCED_INFORMATION__ADDITIONENCHANCEDOBJECTCLASS);
		}
		return additionenchancedobjectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyAdditionEnhancementPackage.OBJECT_BASED_ENHANCED_INFORMATION__ADDITIONENCHANCEDOBJECTCLASS:
				return ((InternalEList<?>)getAdditionenchancedobjectclass()).basicRemove(otherEnd, msgs);
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
			case AssemblyAdditionEnhancementPackage.OBJECT_BASED_ENHANCED_INFORMATION__ADDITIONENCHANCEDOBJECTCLASS:
				return getAdditionenchancedobjectclass();
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
			case AssemblyAdditionEnhancementPackage.OBJECT_BASED_ENHANCED_INFORMATION__ADDITIONENCHANCEDOBJECTCLASS:
				getAdditionenchancedobjectclass().clear();
				getAdditionenchancedobjectclass().addAll((Collection<? extends AdditionEnchancedObjectClass>)newValue);
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
			case AssemblyAdditionEnhancementPackage.OBJECT_BASED_ENHANCED_INFORMATION__ADDITIONENCHANCEDOBJECTCLASS:
				getAdditionenchancedobjectclass().clear();
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
			case AssemblyAdditionEnhancementPackage.OBJECT_BASED_ENHANCED_INFORMATION__ADDITIONENCHANCEDOBJECTCLASS:
				return additionenchancedobjectclass != null && !additionenchancedobjectclass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectBasedEnhancedInformationImpl
