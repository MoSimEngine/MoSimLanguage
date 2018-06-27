/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.ModularSimulationAssembly.Assembly;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MW Assembly Coordinator Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection#getWorkerAssembledSimulation <em>Worker Assembled Simulation</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getMWAssembly_CoordinatorConnection()
 * @model abstract="true"
 * @generated
 */
public interface MWAssembly_CoordinatorConnection extends MasterWorkerConnection {
	/**
	 * Returns the value of the '<em><b>Worker Assembled Simulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Assembled Simulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Assembled Simulation</em>' reference.
	 * @see #setWorkerAssembledSimulation(Assembly)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getMWAssembly_CoordinatorConnection_WorkerAssembledSimulation()
	 * @model required="true"
	 * @generated
	 */
	Assembly getWorkerAssembledSimulation();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection#getWorkerAssembledSimulation <em>Worker Assembled Simulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Assembled Simulation</em>' reference.
	 * @see #getWorkerAssembledSimulation()
	 * @generated
	 */
	void setWorkerAssembledSimulation(Assembly value);

} // MWAssembly_CoordinatorConnection
