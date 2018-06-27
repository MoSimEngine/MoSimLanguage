/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Element Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationElementLinkImpl#getAdapatationconversion <em>Adapatationconversion</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationElementLinkImpl#getLinkedAdapterElement <em>Linked Adapter Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptationElementLinkImpl extends MinimalEObjectImpl.Container implements AdaptationElementLink {
	/**
	 * The cached value of the '{@link #getAdapatationconversion() <em>Adapatationconversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapatationconversion()
	 * @generated
	 * @ordered
	 */
	protected AdapatationConversion adapatationconversion;

	/**
	 * The cached value of the '{@link #getLinkedAdapterElement() <em>Linked Adapter Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedAdapterElement()
	 * @generated
	 * @ordered
	 */
	protected LinkedAdaptationElement linkedAdapterElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationElementLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.ADAPTATION_ELEMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapatationConversion getAdapatationconversion() {
		return adapatationconversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdapatationconversion(AdapatationConversion newAdapatationconversion, NotificationChain msgs) {
		AdapatationConversion oldAdapatationconversion = adapatationconversion;
		adapatationconversion = newAdapatationconversion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION, oldAdapatationconversion, newAdapatationconversion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapatationconversion(AdapatationConversion newAdapatationconversion) {
		if (newAdapatationconversion != adapatationconversion) {
			NotificationChain msgs = null;
			if (adapatationconversion != null)
				msgs = ((InternalEObject)adapatationconversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION, null, msgs);
			if (newAdapatationconversion != null)
				msgs = ((InternalEObject)newAdapatationconversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION, null, msgs);
			msgs = basicSetAdapatationconversion(newAdapatationconversion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION, newAdapatationconversion, newAdapatationconversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedAdaptationElement getLinkedAdapterElement() {
		if (linkedAdapterElement != null && linkedAdapterElement.eIsProxy()) {
			InternalEObject oldLinkedAdapterElement = (InternalEObject)linkedAdapterElement;
			linkedAdapterElement = (LinkedAdaptationElement)eResolveProxy(oldLinkedAdapterElement);
			if (linkedAdapterElement != oldLinkedAdapterElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT, oldLinkedAdapterElement, linkedAdapterElement));
			}
		}
		return linkedAdapterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedAdaptationElement basicGetLinkedAdapterElement() {
		return linkedAdapterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedAdapterElement(LinkedAdaptationElement newLinkedAdapterElement) {
		LinkedAdaptationElement oldLinkedAdapterElement = linkedAdapterElement;
		linkedAdapterElement = newLinkedAdapterElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT, oldLinkedAdapterElement, linkedAdapterElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION:
				return basicSetAdapatationconversion(null, msgs);
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
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION:
				return getAdapatationconversion();
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT:
				if (resolve) return getLinkedAdapterElement();
				return basicGetLinkedAdapterElement();
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
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)newValue);
				return;
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT:
				setLinkedAdapterElement((LinkedAdaptationElement)newValue);
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
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)null);
				return;
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT:
				setLinkedAdapterElement((LinkedAdaptationElement)null);
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
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION:
				return adapatationconversion != null;
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT:
				return linkedAdapterElement != null;
		}
		return super.eIsSet(featureID);
	}

} //AdaptationElementLinkImpl
