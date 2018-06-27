/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.ModularEnvironment.Coordinator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MW Coordinator Coordinator Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection#getWorker <em>Worker</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getMWCoordinator_CoordinatorConnection()
 * @model
 * @generated
 */
public interface MWCoordinator_CoordinatorConnection extends MasterWorkerConnection {
	/**
	 * Returns the value of the '<em><b>Worker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker</em>' reference.
	 * @see #setWorker(Coordinator)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getMWCoordinator_CoordinatorConnection_Worker()
	 * @model required="true"
	 * @generated
	 */
	Coordinator getWorker();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection#getWorker <em>Worker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker</em>' reference.
	 * @see #getWorker()
	 * @generated
	 */
	void setWorker(Coordinator value);

} // MWCoordinator_CoordinatorConnection
