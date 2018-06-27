/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selectable Addition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.SelectableAdditionImpl#getAdditionvalue <em>Additionvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SelectableAdditionImpl extends MSEPropertyAdditionContainerImpl implements SelectableAddition {
	/**
	 * The cached value of the '{@link #getAdditionvalue() <em>Additionvalue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<additionValue> additionvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectableAdditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.SELECTABLE_ADDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<additionValue> getAdditionvalue() {
		if (additionvalue == null) {
			additionvalue = new EObjectContainmentEList<additionValue>(additionValue.class, this, ManagementServicesPackage.SELECTABLE_ADDITION__ADDITIONVALUE);
		}
		return additionvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagementServicesPackage.SELECTABLE_ADDITION__ADDITIONVALUE:
				return ((InternalEList<?>)getAdditionvalue()).basicRemove(otherEnd, msgs);
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
			case ManagementServicesPackage.SELECTABLE_ADDITION__ADDITIONVALUE:
				return getAdditionvalue();
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
			case ManagementServicesPackage.SELECTABLE_ADDITION__ADDITIONVALUE:
				getAdditionvalue().clear();
				getAdditionvalue().addAll((Collection<? extends additionValue>)newValue);
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
			case ManagementServicesPackage.SELECTABLE_ADDITION__ADDITIONVALUE:
				getAdditionvalue().clear();
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
			case ManagementServicesPackage.SELECTABLE_ADDITION__ADDITIONVALUE:
				return additionvalue != null && !additionvalue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectableAdditionImpl
