/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Assembly Entity Coordinator Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection#getSimulation <em>Simulation</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getSimulationAssemblyEntity_CoordinatorConnection()
 * @model
 * @generated
 */
public interface SimulationAssemblyEntity_CoordinatorConnection extends Simulation_CoordinatorConnection {
	/**
	 * Returns the value of the '<em><b>Simulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation</em>' reference.
	 * @see #setSimulation(SimulationAssemblyEntity)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getSimulationAssemblyEntity_CoordinatorConnection_Simulation()
	 * @model required="true"
	 * @generated
	 */
	SimulationAssemblyEntity getSimulation();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection#getSimulation <em>Simulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation</em>' reference.
	 * @see #getSimulation()
	 * @generated
	 */
	void setSimulation(SimulationAssemblyEntity value);

} // SimulationAssemblyEntity_CoordinatorConnection
