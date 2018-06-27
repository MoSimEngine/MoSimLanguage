/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Definition Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository#getAdaptationdescription <em>Adaptationdescription</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository#getDatamarker <em>Datamarker</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationDefinitionRepository()
 * @model
 * @generated
 */
public interface AdaptationDefinitionRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>Adaptationdescription</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptationdescription</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptationdescription</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationDefinitionRepository_Adaptationdescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdaptationDescription> getAdaptationdescription();

	/**
	 * Returns the value of the '<em><b>Datamarker</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datamarker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamarker</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationDefinitionRepository_Datamarker()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataMarker> getDatamarker();

} // AdaptationDefinitionRepository
