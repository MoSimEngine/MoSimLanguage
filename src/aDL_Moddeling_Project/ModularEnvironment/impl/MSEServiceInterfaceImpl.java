/**
 */
package aDL_Moddeling_Project.ModularEnvironment.impl;

import aDL_Moddeling_Project.ModularEnvironment.MSEServiceInterface;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface;

import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSE Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.MSEServiceInterfaceImpl#getManagementserviceinterface <em>Managementserviceinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSEServiceInterfaceImpl extends EntityImpl implements MSEServiceInterface {
	/**
	 * The cached value of the '{@link #getManagementserviceinterface() <em>Managementserviceinterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementserviceinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagementServiceInterface> managementserviceinterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSEServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularEnvironmentPackage.Literals.MSE_SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagementServiceInterface> getManagementserviceinterface() {
		if (managementserviceinterface == null) {
			managementserviceinterface = new EObjectResolvingEList<ManagementServiceInterface>(ManagementServiceInterface.class, this, ModularEnvironmentPackage.MSE_SERVICE_INTERFACE__MANAGEMENTSERVICEINTERFACE);
		}
		return managementserviceinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModularEnvironmentPackage.MSE_SERVICE_INTERFACE__MANAGEMENTSERVICEINTERFACE:
				return getManagementserviceinterface();
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
			case ModularEnvironmentPackage.MSE_SERVICE_INTERFACE__MANAGEMENTSERVICEINTERFACE:
				getManagementserviceinterface().clear();
				getManagementserviceinterface().addAll((Collection<? extends ManagementServiceInterface>)newValue);
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
			case ModularEnvironmentPackage.MSE_SERVICE_INTERFACE__MANAGEMENTSERVICEINTERFACE:
				getManagementserviceinterface().clear();
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
			case ModularEnvironmentPackage.MSE_SERVICE_INTERFACE__MANAGEMENTSERVICEINTERFACE:
				return managementserviceinterface != null && !managementserviceinterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MSEServiceInterfaceImpl
