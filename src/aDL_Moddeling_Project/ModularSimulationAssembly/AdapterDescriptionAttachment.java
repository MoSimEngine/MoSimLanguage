/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapter Description Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationdescription <em>Adaptationdescription</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationdefinitionrepository <em>Adaptationdefinitionrepository</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdapterservice <em>Adapterservice</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationmarkermapping <em>Adaptationmarkermapping</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAdapterDescriptionAttachment()
 * @model
 * @generated
 */
public interface AdapterDescriptionAttachment extends EObject {
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
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAdapterDescriptionAttachment_Adaptationdescription()
	 * @model required="true"
	 * @generated
	 */
	AdaptationDescription getAdaptationdescription();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationdescription <em>Adaptationdescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptationdescription</em>' reference.
	 * @see #getAdaptationdescription()
	 * @generated
	 */
	void setAdaptationdescription(AdaptationDescription value);

	/**
	 * Returns the value of the '<em><b>Adaptationdefinitionrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptationdefinitionrepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptationdefinitionrepository</em>' reference.
	 * @see #setAdaptationdefinitionrepository(AdaptationDefinitionRepository)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAdapterDescriptionAttachment_Adaptationdefinitionrepository()
	 * @model required="true"
	 * @generated
	 */
	AdaptationDefinitionRepository getAdaptationdefinitionrepository();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdaptationdefinitionrepository <em>Adaptationdefinitionrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptationdefinitionrepository</em>' reference.
	 * @see #getAdaptationdefinitionrepository()
	 * @generated
	 */
	void setAdaptationdefinitionrepository(AdaptationDefinitionRepository value);

	/**
	 * Returns the value of the '<em><b>Adapterservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService#getAdapterdescriptionattachment <em>Adapterdescriptionattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapterservice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapterservice</em>' reference.
	 * @see #setAdapterservice(AdapterService)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAdapterDescriptionAttachment_Adapterservice()
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService#getAdapterdescriptionattachment
	 * @model opposite="adapterdescriptionattachment" required="true"
	 * @generated
	 */
	AdapterService getAdapterservice();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdapterservice <em>Adapterservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapterservice</em>' reference.
	 * @see #getAdapterservice()
	 * @generated
	 */
	void setAdapterservice(AdapterService value);

	/**
	 * Returns the value of the '<em><b>Adaptationmarkermapping</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptationmarkermapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptationmarkermapping</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAdapterDescriptionAttachment_Adaptationmarkermapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdaptationMarkerMapping> getAdaptationmarkermapping();

} // AdapterDescriptionAttachment
