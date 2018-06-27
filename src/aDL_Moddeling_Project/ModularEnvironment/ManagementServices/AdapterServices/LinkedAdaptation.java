/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getLinkedadaptationelement <em>Linkedadaptationelement</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getLowestContainingAdaptationElement <em>Lowest Containing Adaptation Element</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getHighestContainingAptationElement <em>Highest Containing Aptation Element</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getEncapsulatedContainer <em>Encapsulated Container</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptation()
 * @model
 * @generated
 */
public interface LinkedAdaptation extends AdaptationDescription {
	/**
	 * Returns the value of the '<em><b>Linkedadaptationelement</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkedadaptationelement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkedadaptationelement</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptation_Linkedadaptationelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkedAdaptationElement> getLinkedadaptationelement();

	/**
	 * Returns the value of the '<em><b>Lowest Containing Adaptation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lowest Containing Adaptation Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowest Containing Adaptation Element</em>' reference.
	 * @see #setLowestContainingAdaptationElement(LinkedAdaptationElement)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptation_LowestContainingAdaptationElement()
	 * @model
	 * @generated
	 */
	LinkedAdaptationElement getLowestContainingAdaptationElement();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getLowestContainingAdaptationElement <em>Lowest Containing Adaptation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowest Containing Adaptation Element</em>' reference.
	 * @see #getLowestContainingAdaptationElement()
	 * @generated
	 */
	void setLowestContainingAdaptationElement(LinkedAdaptationElement value);

	/**
	 * Returns the value of the '<em><b>Highest Containing Aptation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highest Containing Aptation Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highest Containing Aptation Element</em>' reference.
	 * @see #setHighestContainingAptationElement(LinkedAdaptationElement)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptation_HighestContainingAptationElement()
	 * @model
	 * @generated
	 */
	LinkedAdaptationElement getHighestContainingAptationElement();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getHighestContainingAptationElement <em>Highest Containing Aptation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highest Containing Aptation Element</em>' reference.
	 * @see #getHighestContainingAptationElement()
	 * @generated
	 */
	void setHighestContainingAptationElement(LinkedAdaptationElement value);

	/**
	 * Returns the value of the '<em><b>Encapsulated Container</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulated Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Container</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getLinkedAdaptation_EncapsulatedContainer()
	 * @model
	 * @generated
	 */
	EList<DataMarker> getEncapsulatedContainer();

} // LinkedAdaptation
