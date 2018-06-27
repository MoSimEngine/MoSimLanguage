/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly;

import aDL_Moddeling_Project.ModularSimulation.SimModule;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedInformation;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Assembly Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getSimmodule <em>Simmodule</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getAdditionenhancedinformation <em>Additionenhancedinformation</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getSimulationAssemblyEntity()
 * @model
 * @generated
 */
public interface SimulationAssemblyEntity extends Entity, AssembableEntity {
	/**
	 * Returns the value of the '<em><b>Simmodule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getBasesimulationassemblyentity <em>Basesimulationassemblyentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simmodule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simmodule</em>' reference.
	 * @see #setSimmodule(SimModule)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getSimulationAssemblyEntity_Simmodule()
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModule#getBasesimulationassemblyentity
	 * @model opposite="basesimulationassemblyentity" required="true"
	 * @generated
	 */
	SimModule getSimmodule();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getSimmodule <em>Simmodule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simmodule</em>' reference.
	 * @see #getSimmodule()
	 * @generated
	 */
	void setSimmodule(SimModule value);

	/**
	 * Returns the value of the '<em><b>Additionenhancedinformation</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionenhancedinformation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionenhancedinformation</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getSimulationAssemblyEntity_Additionenhancedinformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionEnhancedInformation> getAdditionenhancedinformation();

} // SimulationAssemblyEntity
