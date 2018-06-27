/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Coordinator Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection#getCoordinatorAssemblyEntity <em>Coordinator Assembly Entity</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getSimulation_CoordinatorConnection()
 * @model abstract="true"
 * @generated
 */
public interface Simulation_CoordinatorConnection extends SimulationInvolvedConnection {
	/**
	 * Returns the value of the '<em><b>Coordinator Assembly Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinator Assembly Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator Assembly Entity</em>' reference.
	 * @see #setCoordinatorAssemblyEntity(CoordinatorAssemblyEntity)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getSimulation_CoordinatorConnection_CoordinatorAssemblyEntity()
	 * @model required="true"
	 * @generated
	 */
	CoordinatorAssemblyEntity getCoordinatorAssemblyEntity();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection#getCoordinatorAssemblyEntity <em>Coordinator Assembly Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinator Assembly Entity</em>' reference.
	 * @see #getCoordinatorAssemblyEntity()
	 * @generated
	 */
	void setCoordinatorAssemblyEntity(CoordinatorAssemblyEntity value);

} // Simulation_CoordinatorConnection
