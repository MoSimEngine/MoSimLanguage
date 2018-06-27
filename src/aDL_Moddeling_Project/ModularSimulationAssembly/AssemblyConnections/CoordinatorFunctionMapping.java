/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinator Function Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getMasterServiceFunction <em>Master Service Function</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getWorkerServiceFunction <em>Worker Service Function</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getFunctionMappingModus <em>Function Mapping Modus</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getCoordinatorFunctionMapping()
 * @model
 * @generated
 */
public interface CoordinatorFunctionMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Master Service Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Service Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Service Function</em>' reference.
	 * @see #setMasterServiceFunction(ManagementServiceFunction)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getCoordinatorFunctionMapping_MasterServiceFunction()
	 * @model required="true"
	 * @generated
	 */
	ManagementServiceFunction getMasterServiceFunction();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getMasterServiceFunction <em>Master Service Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Service Function</em>' reference.
	 * @see #getMasterServiceFunction()
	 * @generated
	 */
	void setMasterServiceFunction(ManagementServiceFunction value);

	/**
	 * Returns the value of the '<em><b>Worker Service Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Service Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Service Function</em>' reference.
	 * @see #setWorkerServiceFunction(ManagementServiceFunction)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getCoordinatorFunctionMapping_WorkerServiceFunction()
	 * @model required="true"
	 * @generated
	 */
	ManagementServiceFunction getWorkerServiceFunction();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getWorkerServiceFunction <em>Worker Service Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Service Function</em>' reference.
	 * @see #getWorkerServiceFunction()
	 * @generated
	 */
	void setWorkerServiceFunction(ManagementServiceFunction value);

	/**
	 * Returns the value of the '<em><b>Function Mapping Modus</b></em>' attribute.
	 * The literals are from the enumeration {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Mapping Modus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Mapping Modus</em>' attribute.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus
	 * @see #setFunctionMappingModus(FunctionMappingModus)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getCoordinatorFunctionMapping_FunctionMappingModus()
	 * @model required="true"
	 * @generated
	 */
	FunctionMappingModus getFunctionMappingModus();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping#getFunctionMappingModus <em>Function Mapping Modus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Mapping Modus</em>' attribute.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.FunctionMappingModus
	 * @see #getFunctionMappingModus()
	 * @generated
	 */
	void setFunctionMappingModus(FunctionMappingModus value);

} // CoordinatorFunctionMapping
