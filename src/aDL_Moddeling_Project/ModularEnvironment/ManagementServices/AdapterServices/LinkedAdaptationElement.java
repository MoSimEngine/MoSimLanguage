/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked Adaptation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getNextLink <em>Next Link</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getPreviousLink <em>Previous Link</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getLinkedElement <em>Linked Element</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptationElement()
 * @model
 * @generated
 */
public interface LinkedAdaptationElement extends Entity {
	/**
	 * Returns the value of the '<em><b>Next Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Link</em>' containment reference.
	 * @see #setNextLink(AdaptationElementLink)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptationElement_NextLink()
	 * @model containment="true"
	 * @generated
	 */
	AdaptationElementLink getNextLink();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getNextLink <em>Next Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Link</em>' containment reference.
	 * @see #getNextLink()
	 * @generated
	 */
	void setNextLink(AdaptationElementLink value);

	/**
	 * Returns the value of the '<em><b>Previous Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Link</em>' containment reference.
	 * @see #setPreviousLink(AdaptationElementLink)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptationElement_PreviousLink()
	 * @model containment="true"
	 * @generated
	 */
	AdaptationElementLink getPreviousLink();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getPreviousLink <em>Previous Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Link</em>' containment reference.
	 * @see #getPreviousLink()
	 * @generated
	 */
	void setPreviousLink(AdaptationElementLink value);

	/**
	 * Returns the value of the '<em><b>Linked Element</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Element</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptationElement_LinkedElement()
	 * @model
	 * @generated
	 */
	EList<DataMarker> getLinkedElement();

} // LinkedAdaptationElement
