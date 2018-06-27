/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment;
import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapter Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServiceImpl#getAdapterdescriptionattachment <em>Adapterdescriptionattachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AdapterServiceImpl extends ManagementServiceImpl implements AdapterService {
	/**
	 * The cached value of the '{@link #getAdapterdescriptionattachment() <em>Adapterdescriptionattachment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterdescriptionattachment()
	 * @generated
	 * @ordered
	 */
	protected EList<AdapterDescriptionAttachment> adapterdescriptionattachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.ADAPTER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdapterDescriptionAttachment> getAdapterdescriptionattachment() {
		if (adapterdescriptionattachment == null) {
			adapterdescriptionattachment = new EObjectWithInverseResolvingEList<AdapterDescriptionAttachment>(AdapterDescriptionAttachment.class, this, AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE);
		}
		return adapterdescriptionattachment;
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
			case AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdapterdescriptionattachment()).basicAdd(otherEnd, msgs);
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
			case AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT:
				return ((InternalEList<?>)getAdapterdescriptionattachment()).basicRemove(otherEnd, msgs);
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
			case AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT:
				return getAdapterdescriptionattachment();
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
			case AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT:
				getAdapterdescriptionattachment().clear();
				getAdapterdescriptionattachment().addAll((Collection<? extends AdapterDescriptionAttachment>)newValue);
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
			case AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT:
				getAdapterdescriptionattachment().clear();
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
			case AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT:
				return adapterdescriptionattachment != null && !adapterdescriptionattachment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdapterServiceImpl
