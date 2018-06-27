/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Management Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceInterfaceImpl#getManagementservicefunction <em>Managementservicefunction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagementServiceInterfaceImpl extends EntityImpl implements ManagementServiceInterface {
	/**
	 * The cached value of the '{@link #getManagementservicefunction() <em>Managementservicefunction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementservicefunction()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagementServiceFunction> managementservicefunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagementServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.MANAGEMENT_SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagementServiceFunction> getManagementservicefunction() {
		if (managementservicefunction == null) {
			managementservicefunction = new EObjectContainmentEList<ManagementServiceFunction>(ManagementServiceFunction.class, this, ManagementServicesPackage.MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION);
		}
		return managementservicefunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagementServicesPackage.MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION:
				return ((InternalEList<?>)getManagementservicefunction()).basicRemove(otherEnd, msgs);
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION:
				return getManagementservicefunction();
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION:
				getManagementservicefunction().clear();
				getManagementservicefunction().addAll((Collection<? extends ManagementServiceFunction>)newValue);
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION:
				getManagementservicefunction().clear();
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE_INTERFACE__MANAGEMENTSERVICEFUNCTION:
				return managementservicefunction != null && !managementservicefunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManagementServiceInterfaceImpl
