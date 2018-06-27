/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement#getAdapatationconversion <em>Adapatationconversion</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement#getDatamarker <em>Datamarker</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getDerivedElement()
 * @model
 * @generated
 */
public interface DerivedElement extends EObject {
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
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getDerivedElement_Adapatationconversion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AdapatationConversion getAdapatationconversion();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement#getAdapatationconversion <em>Adapatationconversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapatationconversion</em>' containment reference.
	 * @see #getAdapatationconversion()
	 * @generated
	 */
	void setAdapatationconversion(AdapatationConversion value);

	/**
	 * Returns the value of the '<em><b>Datamarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datamarker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamarker</em>' reference.
	 * @see #setDatamarker(DataMarker)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getDerivedElement_Datamarker()
	 * @model required="true"
	 * @generated
	 */
	DataMarker getDatamarker();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement#getDatamarker <em>Datamarker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamarker</em>' reference.
	 * @see #getDatamarker()
	 * @generated
	 */
	void setDatamarker(DataMarker value);

} // DerivedElement
