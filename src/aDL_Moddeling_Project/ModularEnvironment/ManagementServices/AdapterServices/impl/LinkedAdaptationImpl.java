/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationImpl#getLinkedadaptationelement <em>Linkedadaptationelement</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationImpl#getLowestContainingAdaptationElement <em>Lowest Containing Adaptation Element</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationImpl#getHighestContainingAptationElement <em>Highest Containing Aptation Element</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationImpl#getEncapsulatedContainer <em>Encapsulated Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkedAdaptationImpl extends AdaptationDescriptionImpl implements LinkedAdaptation {
	/**
	 * The cached value of the '{@link #getLinkedadaptationelement() <em>Linkedadaptationelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedadaptationelement()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkedAdaptationElement> linkedadaptationelement;

	/**
	 * The cached value of the '{@link #getLowestContainingAdaptationElement() <em>Lowest Containing Adaptation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowestContainingAdaptationElement()
	 * @generated
	 * @ordered
	 */
	protected LinkedAdaptationElement lowestContainingAdaptationElement;

	/**
	 * The cached value of the '{@link #getHighestContainingAptationElement() <em>Highest Containing Aptation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestContainingAptationElement()
	 * @generated
	 * @ordered
	 */
	protected LinkedAdaptationElement highestContainingAptationElement;

	/**
	 * The cached value of the '{@link #getEncapsulatedContainer() <em>Encapsulated Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<DataMarker> encapsulatedContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkedAdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.LINKED_ADAPTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkedAdaptationElement> getLinkedadaptationelement() {
		if (linkedadaptationelement == null) {
			linkedadaptationelement = new EObjectContainmentEList<LinkedAdaptationElement>(LinkedAdaptationElement.class, this, AdapterServicesPackage.LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT);
		}
		return linkedadaptationelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedAdaptationElement getLowestContainingAdaptationElement() {
		if (lowestContainingAdaptationElement != null && lowestContainingAdaptationElement.eIsProxy()) {
			InternalEObject oldLowestContainingAdaptationElement = (InternalEObject)lowestContainingAdaptationElement;
			lowestContainingAdaptationElement = (LinkedAdaptationElement)eResolveProxy(oldLowestContainingAdaptationElement);
			if (lowestContainingAdaptationElement != oldLowestContainingAdaptationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT, oldLowestContainingAdaptationElement, lowestContainingAdaptationElement));
			}
		}
		return lowestContainingAdaptationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedAdaptationElement basicGetLowestContainingAdaptationElement() {
		return lowestContainingAdaptationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowestContainingAdaptationElement(LinkedAdaptationElement newLowestContainingAdaptationElement) {
		LinkedAdaptationElement oldLowestContainingAdaptationElement = lowestContainingAdaptationElement;
		lowestContainingAdaptationElement = newLowestContainingAdaptationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT, oldLowestContainingAdaptationElement, lowestContainingAdaptationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedAdaptationElement getHighestContainingAptationElement() {
		if (highestContainingAptationElement != null && highestContainingAptationElement.eIsProxy()) {
			InternalEObject oldHighestContainingAptationElement = (InternalEObject)highestContainingAptationElement;
			highestContainingAptationElement = (LinkedAdaptationElement)eResolveProxy(oldHighestContainingAptationElement);
			if (highestContainingAptationElement != oldHighestContainingAptationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT, oldHighestContainingAptationElement, highestContainingAptationElement));
			}
		}
		return highestContainingAptationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedAdaptationElement basicGetHighestContainingAptationElement() {
		return highestContainingAptationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighestContainingAptationElement(LinkedAdaptationElement newHighestContainingAptationElement) {
		LinkedAdaptationElement oldHighestContainingAptationElement = highestContainingAptationElement;
		highestContainingAptationElement = newHighestContainingAptationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT, oldHighestContainingAptationElement, highestContainingAptationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataMarker> getEncapsulatedContainer() {
		if (encapsulatedContainer == null) {
			encapsulatedContainer = new EObjectResolvingEList<DataMarker>(DataMarker.class, this, AdapterServicesPackage.LINKED_ADAPTATION__ENCAPSULATED_CONTAINER);
		}
		return encapsulatedContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT:
				return ((InternalEList<?>)getLinkedadaptationelement()).basicRemove(otherEnd, msgs);
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
			case AdapterServicesPackage.LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT:
				return getLinkedadaptationelement();
			case AdapterServicesPackage.LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT:
				if (resolve) return getLowestContainingAdaptationElement();
				return basicGetLowestContainingAdaptationElement();
			case AdapterServicesPackage.LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT:
				if (resolve) return getHighestContainingAptationElement();
				return basicGetHighestContainingAptationElement();
			case AdapterServicesPackage.LINKED_ADAPTATION__ENCAPSULATED_CONTAINER:
				return getEncapsulatedContainer();
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
			case AdapterServicesPackage.LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT:
				getLinkedadaptationelement().clear();
				getLinkedadaptationelement().addAll((Collection<? extends LinkedAdaptationElement>)newValue);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT:
				setLowestContainingAdaptationElement((LinkedAdaptationElement)newValue);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT:
				setHighestContainingAptationElement((LinkedAdaptationElement)newValue);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION__ENCAPSULATED_CONTAINER:
				getEncapsulatedContainer().clear();
				getEncapsulatedContainer().addAll((Collection<? extends DataMarker>)newValue);
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
			case AdapterServicesPackage.LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT:
				getLinkedadaptationelement().clear();
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT:
				setLowestContainingAdaptationElement((LinkedAdaptationElement)null);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT:
				setHighestContainingAptationElement((LinkedAdaptationElement)null);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION__ENCAPSULATED_CONTAINER:
				getEncapsulatedContainer().clear();
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
			case AdapterServicesPackage.LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT:
				return linkedadaptationelement != null && !linkedadaptationelement.isEmpty();
			case AdapterServicesPackage.LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT:
				return lowestContainingAdaptationElement != null;
			case AdapterServicesPackage.LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT:
				return highestContainingAptationElement != null;
			case AdapterServicesPackage.LINKED_ADAPTATION__ENCAPSULATED_CONTAINER:
				return encapsulatedContainer != null && !encapsulatedContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkedAdaptationImpl
