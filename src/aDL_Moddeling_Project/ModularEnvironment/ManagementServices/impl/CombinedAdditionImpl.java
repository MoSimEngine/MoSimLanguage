/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Addition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionImpl#getMsepropertyaddition <em>Msepropertyaddition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedAdditionImpl extends MSEPropertyAdditionContainerImpl implements CombinedAddition {
	/**
	 * The cached value of the '{@link #getMsepropertyaddition() <em>Msepropertyaddition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsepropertyaddition()
	 * @generated
	 * @ordered
	 */
	protected EList<MSEPropertyAdditionContainer> msepropertyaddition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedAdditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.COMBINED_ADDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSEPropertyAdditionContainer> getMsepropertyaddition() {
		if (msepropertyaddition == null) {
			msepropertyaddition = new EObjectContainmentEList<MSEPropertyAdditionContainer>(MSEPropertyAdditionContainer.class, this, ManagementServicesPackage.COMBINED_ADDITION__MSEPROPERTYADDITION);
		}
		return msepropertyaddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagementServicesPackage.COMBINED_ADDITION__MSEPROPERTYADDITION:
				return ((InternalEList<?>)getMsepropertyaddition()).basicRemove(otherEnd, msgs);
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
			case ManagementServicesPackage.COMBINED_ADDITION__MSEPROPERTYADDITION:
				return getMsepropertyaddition();
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
			case ManagementServicesPackage.COMBINED_ADDITION__MSEPROPERTYADDITION:
				getMsepropertyaddition().clear();
				getMsepropertyaddition().addAll((Collection<? extends MSEPropertyAdditionContainer>)newValue);
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
			case ManagementServicesPackage.COMBINED_ADDITION__MSEPROPERTYADDITION:
				getMsepropertyaddition().clear();
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
			case ManagementServicesPackage.COMBINED_ADDITION__MSEPROPERTYADDITION:
				return msepropertyaddition != null && !msepropertyaddition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CombinedAdditionImpl
