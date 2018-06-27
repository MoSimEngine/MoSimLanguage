/**
 */
package aDL_Moddeling_Project.ModularSimulation;

import aDL_Moddeling_Project.DataRepresentation.SimulationData;

import aDL_Moddeling_Project.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Module Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationDescription <em>Simulation Description</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationtimeinformation <em>Simulationtimeinformation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationdata <em>Simulationdata</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModuleDescription()
 * @model
 * @generated
 */
public interface SimModuleDescription extends Entity {
	/**
	 * Returns the value of the '<em><b>Simulation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Description</em>' attribute.
	 * @see #isSetSimulationDescription()
	 * @see #unsetSimulationDescription()
	 * @see #setSimulationDescription(String)
	 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModuleDescription_SimulationDescription()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSimulationDescription();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationDescription <em>Simulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Description</em>' attribute.
	 * @see #isSetSimulationDescription()
	 * @see #unsetSimulationDescription()
	 * @see #getSimulationDescription()
	 * @generated
	 */
	void setSimulationDescription(String value);

	/**
	 * Unsets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationDescription <em>Simulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSimulationDescription()
	 * @see #getSimulationDescription()
	 * @see #setSimulationDescription(String)
	 * @generated
	 */
	void unsetSimulationDescription();

	/**
	 * Returns whether the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationDescription <em>Simulation Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Simulation Description</em>' attribute is set.
	 * @see #unsetSimulationDescription()
	 * @see #getSimulationDescription()
	 * @see #setSimulationDescription(String)
	 * @generated
	 */
	boolean isSetSimulationDescription();

	/**
	 * Returns the value of the '<em><b>Simulationtimeinformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulationtimeinformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulationtimeinformation</em>' containment reference.
	 * @see #setSimulationtimeinformation(SimulationTimeInformation)
	 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModuleDescription_Simulationtimeinformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimulationTimeInformation getSimulationtimeinformation();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationtimeinformation <em>Simulationtimeinformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulationtimeinformation</em>' containment reference.
	 * @see #getSimulationtimeinformation()
	 * @generated
	 */
	void setSimulationtimeinformation(SimulationTimeInformation value);

	/**
	 * Returns the value of the '<em><b>Simulationdata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulationdata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulationdata</em>' containment reference.
	 * @see #setSimulationdata(SimulationData)
	 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModuleDescription_Simulationdata()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimulationData getSimulationdata();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationdata <em>Simulationdata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulationdata</em>' containment reference.
	 * @see #getSimulationdata()
	 * @generated
	 */
	void setSimulationdata(SimulationData value);

} // SimModuleDescription
