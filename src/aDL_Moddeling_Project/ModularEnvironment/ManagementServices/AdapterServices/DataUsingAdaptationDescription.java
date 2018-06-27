/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Using Adaptation Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription#getAbstractassemblyentity <em>Abstractassemblyentity</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getDataUsingAdaptationDescription()
 * @model
 * @generated
 */
public interface DataUsingAdaptationDescription extends AdaptationDescription, singleAdaptation {
	/**
	 * Returns the value of the '<em><b>Abstractassemblyentity</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractassemblyentity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractassemblyentity</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getDataUsingAdaptationDescription_Abstractassemblyentity()
	 * @model
	 * @generated
	 */
	EList<AbstractAssemblyEntity> getAbstractassemblyentity();

} // DataUsingAdaptationDescription
