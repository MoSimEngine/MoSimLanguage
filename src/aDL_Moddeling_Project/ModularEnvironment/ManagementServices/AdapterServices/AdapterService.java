/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService;

import aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapter Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService#getAdapterdescriptionattachment <em>Adapterdescriptionattachment</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdapterService()
 * @model abstract="true"
 * @generated
 */
public interface AdapterService extends ManagementService {
	/**
	 * Returns the value of the '<em><b>Adapterdescriptionattachment</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment}.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdapterservice <em>Adapterservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapterdescriptionattachment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapterdescriptionattachment</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdapterService_Adapterdescriptionattachment()
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment#getAdapterservice
	 * @model opposite="adapterservice"
	 * @generated
	 */
	EList<AdapterDescriptionAttachment> getAdapterdescriptionattachment();

} // AdapterService
