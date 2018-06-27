/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment;
import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapter Description Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AdapterDescriptionAttachmentImpl#getAdaptationdescription <em>Adaptationdescription</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AdapterDescriptionAttachmentImpl#getAdaptationdefinitionrepository <em>Adaptationdefinitionrepository</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AdapterDescriptionAttachmentImpl#getAdapterservice <em>Adapterservice</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AdapterDescriptionAttachmentImpl#getAdaptationmarkermapping <em>Adaptationmarkermapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdapterDescriptionAttachmentImpl extends MinimalEObjectImpl.Container implements AdapterDescriptionAttachment {
	/**
	 * The cached value of the '{@link #getAdaptationdescription() <em>Adaptationdescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationdescription()
	 * @generated
	 * @ordered
	 */
	protected AdaptationDescription adaptationdescription;

	/**
	 * The cached value of the '{@link #getAdaptationdefinitionrepository() <em>Adaptationdefinitionrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationdefinitionrepository()
	 * @generated
	 * @ordered
	 */
	protected AdaptationDefinitionRepository adaptationdefinitionrepository;

	/**
	 * The cached value of the '{@link #getAdapterservice() <em>Adapterservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterservice()
	 * @generated
	 * @ordered
	 */
	protected AdapterService adapterservice;

	/**
	 * The cached value of the '{@link #getAdaptationmarkermapping() <em>Adaptationmarkermapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationmarkermapping()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationMarkerMapping> adaptationmarkermapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterDescriptionAttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationAssemblyPackage.Literals.ADAPTER_DESCRIPTION_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDescription getAdaptationdescription() {
		if (adaptationdescription != null && adaptationdescription.eIsProxy()) {
			InternalEObject oldAdaptationdescription = (InternalEObject)adaptationdescription;
			adaptationdescription = (AdaptationDescription)eResolveProxy(oldAdaptationdescription);
			if (adaptationdescription != oldAdaptationdescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION, oldAdaptationdescription, adaptationdescription));
			}
		}
		return adaptationdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDescription basicGetAdaptationdescription() {
		return adaptationdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationdescription(AdaptationDescription newAdaptationdescription) {
		AdaptationDescription oldAdaptationdescription = adaptationdescription;
		adaptationdescription = newAdaptationdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION, oldAdaptationdescription, adaptationdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDefinitionRepository getAdaptationdefinitionrepository() {
		if (adaptationdefinitionrepository != null && adaptationdefinitionrepository.eIsProxy()) {
			InternalEObject oldAdaptationdefinitionrepository = (InternalEObject)adaptationdefinitionrepository;
			adaptationdefinitionrepository = (AdaptationDefinitionRepository)eResolveProxy(oldAdaptationdefinitionrepository);
			if (adaptationdefinitionrepository != oldAdaptationdefinitionrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY, oldAdaptationdefinitionrepository, adaptationdefinitionrepository));
			}
		}
		return adaptationdefinitionrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDefinitionRepository basicGetAdaptationdefinitionrepository() {
		return adaptationdefinitionrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationdefinitionrepository(AdaptationDefinitionRepository newAdaptationdefinitionrepository) {
		AdaptationDefinitionRepository oldAdaptationdefinitionrepository = adaptationdefinitionrepository;
		adaptationdefinitionrepository = newAdaptationdefinitionrepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY, oldAdaptationdefinitionrepository, adaptationdefinitionrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterService getAdapterservice() {
		if (adapterservice != null && adapterservice.eIsProxy()) {
			InternalEObject oldAdapterservice = (InternalEObject)adapterservice;
			adapterservice = (AdapterService)eResolveProxy(oldAdapterservice);
			if (adapterservice != oldAdapterservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE, oldAdapterservice, adapterservice));
			}
		}
		return adapterservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterService basicGetAdapterservice() {
		return adapterservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdapterservice(AdapterService newAdapterservice, NotificationChain msgs) {
		AdapterService oldAdapterservice = adapterservice;
		adapterservice = newAdapterservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE, oldAdapterservice, newAdapterservice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapterservice(AdapterService newAdapterservice) {
		if (newAdapterservice != adapterservice) {
			NotificationChain msgs = null;
			if (adapterservice != null)
				msgs = ((InternalEObject)adapterservice).eInverseRemove(this, AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT, AdapterService.class, msgs);
			if (newAdapterservice != null)
				msgs = ((InternalEObject)newAdapterservice).eInverseAdd(this, AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT, AdapterService.class, msgs);
			msgs = basicSetAdapterservice(newAdapterservice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE, newAdapterservice, newAdapterservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationMarkerMapping> getAdaptationmarkermapping() {
		if (adaptationmarkermapping == null) {
			adaptationmarkermapping = new EObjectContainmentEList<AdaptationMarkerMapping>(AdaptationMarkerMapping.class, this, ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING);
		}
		return adaptationmarkermapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE:
				if (adapterservice != null)
					msgs = ((InternalEObject)adapterservice).eInverseRemove(this, AdapterServicesPackage.ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT, AdapterService.class, msgs);
				return basicSetAdapterservice((AdapterService)otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE:
				return basicSetAdapterservice(null, msgs);
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING:
				return ((InternalEList<?>)getAdaptationmarkermapping()).basicRemove(otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION:
				if (resolve) return getAdaptationdescription();
				return basicGetAdaptationdescription();
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY:
				if (resolve) return getAdaptationdefinitionrepository();
				return basicGetAdaptationdefinitionrepository();
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE:
				if (resolve) return getAdapterservice();
				return basicGetAdapterservice();
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING:
				return getAdaptationmarkermapping();
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
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION:
				setAdaptationdescription((AdaptationDescription)newValue);
				return;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY:
				setAdaptationdefinitionrepository((AdaptationDefinitionRepository)newValue);
				return;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE:
				setAdapterservice((AdapterService)newValue);
				return;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING:
				getAdaptationmarkermapping().clear();
				getAdaptationmarkermapping().addAll((Collection<? extends AdaptationMarkerMapping>)newValue);
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
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION:
				setAdaptationdescription((AdaptationDescription)null);
				return;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY:
				setAdaptationdefinitionrepository((AdaptationDefinitionRepository)null);
				return;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE:
				setAdapterservice((AdapterService)null);
				return;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING:
				getAdaptationmarkermapping().clear();
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
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDESCRIPTION:
				return adaptationdescription != null;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONDEFINITIONREPOSITORY:
				return adaptationdefinitionrepository != null;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTERSERVICE:
				return adapterservice != null;
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT__ADAPTATIONMARKERMAPPING:
				return adaptationmarkermapping != null && !adaptationmarkermapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdapterDescriptionAttachmentImpl
