/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Addition Setter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionSetterImpl#getCombinedadditions <em>Combinedadditions</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.CombinedAdditionSetterImpl#getAdditionSetters <em>Addition Setters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedAdditionSetterImpl extends AdditionSetterImpl implements CombinedAdditionSetter {
	/**
	 * The cached value of the '{@link #getCombinedadditions() <em>Combinedadditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedadditions()
	 * @generated
	 * @ordered
	 */
	protected CombinedAddition combinedadditions;

	/**
	 * The cached value of the '{@link #getAdditionSetters() <em>Addition Setters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionSetters()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionSetter> additionSetters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedAdditionSetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.COMBINED_ADDITION_SETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedAddition getCombinedadditions() {
		if (combinedadditions != null && combinedadditions.eIsProxy()) {
			InternalEObject oldCombinedadditions = (InternalEObject)combinedadditions;
			combinedadditions = (CombinedAddition)eResolveProxy(oldCombinedadditions);
			if (combinedadditions != oldCombinedadditions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagementServicesPackage.COMBINED_ADDITION_SETTER__COMBINEDADDITIONS, oldCombinedadditions, combinedadditions));
			}
		}
		return combinedadditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedAddition basicGetCombinedadditions() {
		return combinedadditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinedadditions(CombinedAddition newCombinedadditions) {
		CombinedAddition oldCombinedadditions = combinedadditions;
		combinedadditions = newCombinedadditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.COMBINED_ADDITION_SETTER__COMBINEDADDITIONS, oldCombinedadditions, combinedadditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionSetter> getAdditionSetters() {
		if (additionSetters == null) {
			additionSetters = new EObjectContainmentEList<AdditionSetter>(AdditionSetter.class, this, ManagementServicesPackage.COMBINED_ADDITION_SETTER__ADDITION_SETTERS);
		}
		return additionSetters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__ADDITION_SETTERS:
				return ((InternalEList<?>)getAdditionSetters()).basicRemove(otherEnd, msgs);
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
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__COMBINEDADDITIONS:
				if (resolve) return getCombinedadditions();
				return basicGetCombinedadditions();
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__ADDITION_SETTERS:
				return getAdditionSetters();
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
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__COMBINEDADDITIONS:
				setCombinedadditions((CombinedAddition)newValue);
				return;
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__ADDITION_SETTERS:
				getAdditionSetters().clear();
				getAdditionSetters().addAll((Collection<? extends AdditionSetter>)newValue);
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
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__COMBINEDADDITIONS:
				setCombinedadditions((CombinedAddition)null);
				return;
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__ADDITION_SETTERS:
				getAdditionSetters().clear();
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
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__COMBINEDADDITIONS:
				return combinedadditions != null;
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER__ADDITION_SETTERS:
				return additionSetters != null && !additionSetters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CombinedAdditionSetterImpl
