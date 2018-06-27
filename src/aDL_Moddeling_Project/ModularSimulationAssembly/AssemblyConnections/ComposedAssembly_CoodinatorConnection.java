/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.ModularSimulationAssembly.CombinedAssemblyEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Assembly Coodinator Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection#getComposedassemblyentity <em>Composedassemblyentity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection#getWorkerAssembledSimulationCoordinator <em>Worker Assembled Simulation Coordinator</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getComposedAssembly_CoodinatorConnection()
 * @model
 * @generated
 */
public interface ComposedAssembly_CoodinatorConnection extends Simulation_CoordinatorConnection, MWAssembly_CoordinatorConnection {
	/**
	 * Returns the value of the '<em><b>Composedassemblyentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composedassemblyentity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composedassemblyentity</em>' reference.
	 * @see #setComposedassemblyentity(CombinedAssemblyEntity)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getComposedAssembly_CoodinatorConnection_Composedassemblyentity()
	 * @model required="true"
	 * @generated
	 */
	CombinedAssemblyEntity getComposedassemblyentity();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection#getComposedassemblyentity <em>Composedassemblyentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composedassemblyentity</em>' reference.
	 * @see #getComposedassemblyentity()
	 * @generated
	 */
	void setComposedassemblyentity(CombinedAssemblyEntity value);

	/**
	 * Returns the value of the '<em><b>Worker Assembled Simulation Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Assembled Simulation Coordinator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Assembled Simulation Coordinator</em>' reference.
	 * @see #setWorkerAssembledSimulationCoordinator(CoordinatorAssemblyEntity)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getComposedAssembly_CoodinatorConnection_WorkerAssembledSimulationCoordinator()
	 * @model
	 * @generated
	 */
	CoordinatorAssemblyEntity getWorkerAssembledSimulationCoordinator();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection#getWorkerAssembledSimulationCoordinator <em>Worker Assembled Simulation Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Assembled Simulation Coordinator</em>' reference.
	 * @see #getWorkerAssembledSimulationCoordinator()
	 * @generated
	 */
	void setWorkerAssembledSimulationCoordinator(CoordinatorAssemblyEntity value);

} // ComposedAssembly_CoodinatorConnection
