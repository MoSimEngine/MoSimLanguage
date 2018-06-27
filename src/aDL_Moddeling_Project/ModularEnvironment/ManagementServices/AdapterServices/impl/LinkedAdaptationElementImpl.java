/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked Adaptation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationElementImpl#getNextLink <em>Next Link</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationElementImpl#getPreviousLink <em>Previous Link</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationElementImpl#getLinkedElement <em>Linked Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkedAdaptationElementImpl extends EntityImpl implements LinkedAdaptationElement {
	/**
	 * The cached value of the '{@link #getNextLink() <em>Next Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextLink()
	 * @generated
	 * @ordered
	 */
	protected AdaptationElementLink nextLink;

	/**
	 * The cached value of the '{@link #getPreviousLink() <em>Previous Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousLink()
	 * @generated
	 * @ordered
	 */
	protected AdaptationElementLink previousLink;

	/**
	 * The cached value of the '{@link #getLinkedElement() <em>Linked Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataMarker> linkedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkedAdaptationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.LINKED_ADAPTATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationElementLink getNextLink() {
		return nextLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextLink(AdaptationElementLink newNextLink, NotificationChain msgs) {
		AdaptationElementLink oldNextLink = nextLink;
		nextLink = newNextLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK, oldNextLink, newNextLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextLink(AdaptationElementLink newNextLink) {
		if (newNextLink != nextLink) {
			NotificationChain msgs = null;
			if (nextLink != null)
				msgs = ((InternalEObject)nextLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK, null, msgs);
			if (newNextLink != null)
				msgs = ((InternalEObject)newNextLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK, null, msgs);
			msgs = basicSetNextLink(newNextLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK, newNextLink, newNextLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationElementLink getPreviousLink() {
		return previousLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousLink(AdaptationElementLink newPreviousLink, NotificationChain msgs) {
		AdaptationElementLink oldPreviousLink = previousLink;
		previousLink = newPreviousLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK, oldPreviousLink, newPreviousLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousLink(AdaptationElementLink newPreviousLink) {
		if (newPreviousLink != previousLink) {
			NotificationChain msgs = null;
			if (previousLink != null)
				msgs = ((InternalEObject)previousLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK, null, msgs);
			if (newPreviousLink != null)
				msgs = ((InternalEObject)newPreviousLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK, null, msgs);
			msgs = basicSetPreviousLink(newPreviousLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK, newPreviousLink, newPreviousLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataMarker> getLinkedElement() {
		if (linkedElement == null) {
			linkedElement = new EObjectResolvingEList<DataMarker>(DataMarker.class, this, AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__LINKED_ELEMENT);
		}
		return linkedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK:
				return basicSetNextLink(null, msgs);
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK:
				return basicSetPreviousLink(null, msgs);
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
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK:
				return getNextLink();
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK:
				return getPreviousLink();
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__LINKED_ELEMENT:
				return getLinkedElement();
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
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK:
				setNextLink((AdaptationElementLink)newValue);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK:
				setPreviousLink((AdaptationElementLink)newValue);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__LINKED_ELEMENT:
				getLinkedElement().clear();
				getLinkedElement().addAll((Collection<? extends DataMarker>)newValue);
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
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK:
				setNextLink((AdaptationElementLink)null);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK:
				setPreviousLink((AdaptationElementLink)null);
				return;
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__LINKED_ELEMENT:
				getLinkedElement().clear();
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
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__NEXT_LINK:
				return nextLink != null;
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK:
				return previousLink != null;
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT__LINKED_ELEMENT:
				return linkedElement != null && !linkedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkedAdaptationElementImpl
