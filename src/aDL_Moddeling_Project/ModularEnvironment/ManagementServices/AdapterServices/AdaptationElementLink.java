/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Element Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink#getAdapatationconversion <em>Adapatationconversion</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink#getLinkedAdapterElement <em>Linked Adapter Element</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationElementLink()
 * @model
 * @generated
 */
public interface AdaptationElementLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Adapatationconversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapatationconversion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapatationconversion</em>' containment reference.
	 * @see #setAdapatationconversion(AdapatationConversion)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationElementLink_Adapatationconversion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AdapatationConversion getAdapatationconversion();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink#getAdapatationconversion <em>Adapatationconversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapatationconversion</em>' containment reference.
	 * @see #getAdapatationconversion()
	 * @generated
	 */
	void setAdapatationconversion(AdapatationConversion value);

	/**
	 * Returns the value of the '<em><b>Linked Adapter Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Adapter Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Adapter Element</em>' reference.
	 * @see #setLinkedAdapterElement(LinkedAdaptationElement)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationElementLink_LinkedAdapterElement()
	 * @model required="true"
	 * @generated
	 */
	LinkedAdaptationElement getLinkedAdapterElement();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink#getLinkedAdapterElement <em>Linked Adapter Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Adapter Element</em>' reference.
	 * @see #getLinkedAdapterElement()
	 * @generated
	 */
	void setLinkedAdapterElement(LinkedAdaptationElement value);

} // AdaptationElementLink
