/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Marker Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getDatamarker <em>Datamarker</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getAdaptable <em>Adaptable</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getAdaptationdescription <em>Adaptationdescription</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationMarkerMapping()
 * @model
 * @generated
 */
public interface AdaptationMarkerMapping extends EObject {
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
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationMarkerMapping_Datamarker()
	 * @model required="true"
	 * @generated
	 */
	DataMarker getDatamarker();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getDatamarker <em>Datamarker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamarker</em>' reference.
	 * @see #getDatamarker()
	 * @generated
	 */
	void setDatamarker(DataMarker value);

	/**
	 * Returns the value of the '<em><b>Adaptable</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptable</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationMarkerMapping_Adaptable()
	 * @model
	 * @generated
	 */
	EList<Adaptable> getAdaptable();

	/**
	 * Returns the value of the '<em><b>Adaptationdescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptationdescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptationdescription</em>' reference.
	 * @see #setAdaptationdescription(AdaptationDescription)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationMarkerMapping_Adaptationdescription()
	 * @model required="true"
	 * @generated
	 */
	AdaptationDescription getAdaptationdescription();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getAdaptationdescription <em>Adaptationdescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptationdescription</em>' reference.
	 * @see #getAdaptationdescription()
	 * @generated
	 */
	void setAdaptationdescription(AdaptationDescription value);

} // AdaptationMarkerMapping
