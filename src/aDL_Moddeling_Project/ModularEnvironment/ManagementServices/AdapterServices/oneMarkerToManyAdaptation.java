/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>one Marker To Many Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation#getDatamarker <em>Datamarker</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getoneMarkerToManyAdaptation()
 * @model
 * @generated
 */
public interface oneMarkerToManyAdaptation extends AdaptationDescription {
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
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getoneMarkerToManyAdaptation_Datamarker()
	 * @model required="true"
	 * @generated
	 */
	DataMarker getDatamarker();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation#getDatamarker <em>Datamarker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamarker</em>' reference.
	 * @see #getDatamarker()
	 * @generated
	 */
	void setDatamarker(DataMarker value);

} // oneMarkerToManyAdaptation
