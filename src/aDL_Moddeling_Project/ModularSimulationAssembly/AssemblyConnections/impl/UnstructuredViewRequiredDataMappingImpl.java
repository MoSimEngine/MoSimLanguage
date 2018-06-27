/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.MappableData;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured View Required Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.UnstructuredViewRequiredDataMappingImpl#getMappabledata <em>Mappabledata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnstructuredViewRequiredDataMappingImpl extends RequiredDataMappingConnectionImpl implements UnstructuredViewRequiredDataMapping {
	/**
	 * The cached value of the '{@link #getMappabledata() <em>Mappabledata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappabledata()
	 * @generated
	 * @ordered
	 */
	protected MappableData mappabledata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredViewRequiredDataMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyConnectionsPackage.Literals.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappableData getMappabledata() {
		if (mappabledata != null && mappabledata.eIsProxy()) {
			InternalEObject oldMappabledata = (InternalEObject)mappabledata;
			mappabledata = (MappableData)eResolveProxy(oldMappabledata);
			if (mappabledata != oldMappabledata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyConnectionsPackage.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA, oldMappabledata, mappabledata));
			}
		}
		return mappabledata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappableData basicGetMappabledata() {
		return mappabledata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappabledata(MappableData newMappabledata) {
		MappableData oldMappabledata = mappabledata;
		mappabledata = newMappabledata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyConnectionsPackage.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA, oldMappabledata, mappabledata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyConnectionsPackage.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA:
				if (resolve) return getMappabledata();
				return basicGetMappabledata();
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
			case AssemblyConnectionsPackage.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA:
				setMappabledata((MappableData)newValue);
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
			case AssemblyConnectionsPackage.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA:
				setMappabledata((MappableData)null);
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
			case AssemblyConnectionsPackage.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING__MAPPABLEDATA:
				return mappabledata != null;
		}
		return super.eIsSet(featureID);
	}

} //UnstructuredViewRequiredDataMappingImpl
