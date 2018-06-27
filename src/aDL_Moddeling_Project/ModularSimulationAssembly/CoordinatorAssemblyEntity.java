/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly;

import aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinator Assembly Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity#getAdapterdescriptionattachment <em>Adapterdescriptionattachment</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity#getCoordinatorentity <em>Coordinatorentity</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getCoordinatorAssemblyEntity()
 * @model
 * @generated
 */
public interface CoordinatorAssemblyEntity extends Entity, AssembableEntity {
	/**
	 * Returns the value of the '<em><b>Adapterdescriptionattachment</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapterdescriptionattachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapterdescriptionattachment</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getCoordinatorAssemblyEntity_Adapterdescriptionattachment()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdapterDescriptionAttachment> getAdapterdescriptionattachment();

	/**
	 * Returns the value of the '<em><b>Coordinatorentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinatorentity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinatorentity</em>' reference.
	 * @see #setCoordinatorentity(CoordinatorEntity)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getCoordinatorAssemblyEntity_Coordinatorentity()
	 * @model required="true"
	 * @generated
	 */
	CoordinatorEntity getCoordinatorentity();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity#getCoordinatorentity <em>Coordinatorentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinatorentity</em>' reference.
	 * @see #getCoordinatorentity()
	 * @generated
	 */
	void setCoordinatorentity(CoordinatorEntity value);

} // CoordinatorAssemblyEntity
