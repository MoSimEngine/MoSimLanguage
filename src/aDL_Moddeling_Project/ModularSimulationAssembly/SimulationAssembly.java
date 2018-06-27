/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getGeneralsimulationfunctions <em>Generalsimulationfunctions</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getOnLevelAssembableEntities <em>On Level Assembable Entities</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getAssembledSimulationVisibleData <em>Assembled Simulation Visible Data</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getAdaptationdefinitionrepository <em>Adaptationdefinitionrepository</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getSimulationAssembly()
 * @model
 * @generated
 */
public interface SimulationAssembly extends Entity, Assembly {
	/**
	 * Returns the value of the '<em><b>Generalsimulationfunctions</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalsimulationfunctions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalsimulationfunctions</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getSimulationAssembly_Generalsimulationfunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<generalSimulationFunction> getGeneralsimulationfunctions();

	/**
	 * Returns the value of the '<em><b>On Level Assembable Entities</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Level Assembable Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Level Assembable Entities</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getSimulationAssembly_OnLevelAssembableEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssembableEntity> getOnLevelAssembableEntities();

	/**
	 * Returns the value of the '<em><b>Assembled Simulation Visible Data</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembled Simulation Visible Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembled Simulation Visible Data</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getSimulationAssembly_AssembledSimulationVisibleData()
	 * @model
	 * @generated
	 */
	EList<AdditionEnhanced> getAssembledSimulationVisibleData();

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
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getSimulationAssembly_Adaptationdefinitionrepository()
	 * @model
	 * @generated
	 */
	AdaptationDefinitionRepository getAdaptationdefinitionrepository();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly#getAdaptationdefinitionrepository <em>Adaptationdefinitionrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptationdefinitionrepository</em>' reference.
	 * @see #getAdaptationdefinitionrepository()
	 * @generated
	 */
	void setAdaptationdefinitionrepository(AdaptationDefinitionRepository value);

} // SimulationAssembly
