/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Connected Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation#getDerivedelement <em>Derivedelement</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation#getBaseMarker <em>Base Marker</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getBaseConnectedAdaptation()
 * @model
 * @generated
 */
public interface BaseConnectedAdaptation extends AdaptationDescription {
	/**
	 * Returns the value of the '<em><b>Derivedelement</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivedelement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivedelement</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getBaseConnectedAdaptation_Derivedelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<DerivedElement> getDerivedelement();

	/**
	 * Returns the value of the '<em><b>Base Marker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Marker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Marker</em>' reference.
	 * @see #setBaseMarker(DataMarker)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getBaseConnectedAdaptation_BaseMarker()
	 * @model required="true"
	 * @generated
	 */
	DataMarker getBaseMarker();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation#getBaseMarker <em>Base Marker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Marker</em>' reference.
	 * @see #getBaseMarker()
	 * @generated
	 */
	void setBaseMarker(DataMarker value);

} // BaseConnectedAdaptation
