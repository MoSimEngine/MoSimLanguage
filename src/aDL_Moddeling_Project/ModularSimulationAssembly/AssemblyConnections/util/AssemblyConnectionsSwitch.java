/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.util;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.*;

import aDL_Moddeling_Project.basic.Entity;
import aDL_Moddeling_Project.basic.Identifier;
import aDL_Moddeling_Project.basic.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage
 * @generated
 */
public class AssemblyConnectionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssemblyConnectionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectionsSwitch() {
		if (modelPackage == null) {
			modelPackage = AssemblyConnectionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION: {
				ComposedAssembly_CoodinatorConnection composedAssembly_CoodinatorConnection = (ComposedAssembly_CoodinatorConnection)theEObject;
				T result = caseComposedAssembly_CoodinatorConnection(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseSimulation_CoordinatorConnection(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseMWAssembly_CoordinatorConnection(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseSimulationInvolvedConnection(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseMasterWorkerConnection(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseConnection(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseProvidedRequiredConnection(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseEntity(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseInterfaceProvidedRequiredConnection(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseIdentifier(composedAssembly_CoodinatorConnection);
				if (result == null) result = caseNamedElement(composedAssembly_CoodinatorConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.MW_ASSEMBLY_COORDINATOR_CONNECTION: {
				MWAssembly_CoordinatorConnection mwAssembly_CoordinatorConnection = (MWAssembly_CoordinatorConnection)theEObject;
				T result = caseMWAssembly_CoordinatorConnection(mwAssembly_CoordinatorConnection);
				if (result == null) result = caseMasterWorkerConnection(mwAssembly_CoordinatorConnection);
				if (result == null) result = caseConnection(mwAssembly_CoordinatorConnection);
				if (result == null) result = caseEntity(mwAssembly_CoordinatorConnection);
				if (result == null) result = caseIdentifier(mwAssembly_CoordinatorConnection);
				if (result == null) result = caseNamedElement(mwAssembly_CoordinatorConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.SIMULATION_COORDINATOR_CONNECTION: {
				Simulation_CoordinatorConnection simulation_CoordinatorConnection = (Simulation_CoordinatorConnection)theEObject;
				T result = caseSimulation_CoordinatorConnection(simulation_CoordinatorConnection);
				if (result == null) result = caseSimulationInvolvedConnection(simulation_CoordinatorConnection);
				if (result == null) result = caseConnection(simulation_CoordinatorConnection);
				if (result == null) result = caseProvidedRequiredConnection(simulation_CoordinatorConnection);
				if (result == null) result = caseEntity(simulation_CoordinatorConnection);
				if (result == null) result = caseInterfaceProvidedRequiredConnection(simulation_CoordinatorConnection);
				if (result == null) result = caseIdentifier(simulation_CoordinatorConnection);
				if (result == null) result = caseNamedElement(simulation_CoordinatorConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION: {
				SimulationAssemblyEntity_CoordinatorConnection simulationAssemblyEntity_CoordinatorConnection = (SimulationAssemblyEntity_CoordinatorConnection)theEObject;
				T result = caseSimulationAssemblyEntity_CoordinatorConnection(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = caseSimulation_CoordinatorConnection(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = caseSimulationInvolvedConnection(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = caseConnection(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = caseProvidedRequiredConnection(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = caseEntity(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = caseInterfaceProvidedRequiredConnection(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = caseIdentifier(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = caseNamedElement(simulationAssemblyEntity_CoordinatorConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.PROVIDED_REQUIRED_CONNECTION: {
				ProvidedRequiredConnection providedRequiredConnection = (ProvidedRequiredConnection)theEObject;
				T result = caseProvidedRequiredConnection(providedRequiredConnection);
				if (result == null) result = caseInterfaceProvidedRequiredConnection(providedRequiredConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.MW_COORDINATOR_COORDINATOR_CONNECTION: {
				MWCoordinator_CoordinatorConnection mwCoordinator_CoordinatorConnection = (MWCoordinator_CoordinatorConnection)theEObject;
				T result = caseMWCoordinator_CoordinatorConnection(mwCoordinator_CoordinatorConnection);
				if (result == null) result = caseMasterWorkerConnection(mwCoordinator_CoordinatorConnection);
				if (result == null) result = caseConnection(mwCoordinator_CoordinatorConnection);
				if (result == null) result = caseEntity(mwCoordinator_CoordinatorConnection);
				if (result == null) result = caseIdentifier(mwCoordinator_CoordinatorConnection);
				if (result == null) result = caseNamedElement(mwCoordinator_CoordinatorConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseEntity(connection);
				if (result == null) result = caseIdentifier(connection);
				if (result == null) result = caseNamedElement(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.MASTER_WORKER_CONNECTION: {
				MasterWorkerConnection masterWorkerConnection = (MasterWorkerConnection)theEObject;
				T result = caseMasterWorkerConnection(masterWorkerConnection);
				if (result == null) result = caseConnection(masterWorkerConnection);
				if (result == null) result = caseEntity(masterWorkerConnection);
				if (result == null) result = caseIdentifier(masterWorkerConnection);
				if (result == null) result = caseNamedElement(masterWorkerConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.SIMULATION_INVOLVED_CONNECTION: {
				SimulationInvolvedConnection simulationInvolvedConnection = (SimulationInvolvedConnection)theEObject;
				T result = caseSimulationInvolvedConnection(simulationInvolvedConnection);
				if (result == null) result = caseConnection(simulationInvolvedConnection);
				if (result == null) result = caseProvidedRequiredConnection(simulationInvolvedConnection);
				if (result == null) result = caseEntity(simulationInvolvedConnection);
				if (result == null) result = caseInterfaceProvidedRequiredConnection(simulationInvolvedConnection);
				if (result == null) result = caseIdentifier(simulationInvolvedConnection);
				if (result == null) result = caseNamedElement(simulationInvolvedConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING: {
				CoordinatorFunctionMapping coordinatorFunctionMapping = (CoordinatorFunctionMapping)theEObject;
				T result = caseCoordinatorFunctionMapping(coordinatorFunctionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.REQUIRED_DATA_MAPPING_CONNECTION: {
				RequiredDataMappingConnection requiredDataMappingConnection = (RequiredDataMappingConnection)theEObject;
				T result = caseRequiredDataMappingConnection(requiredDataMappingConnection);
				if (result == null) result = caseIdentifier(requiredDataMappingConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING: {
				ObjectOrientedViewRequiredDataMapping objectOrientedViewRequiredDataMapping = (ObjectOrientedViewRequiredDataMapping)theEObject;
				T result = caseObjectOrientedViewRequiredDataMapping(objectOrientedViewRequiredDataMapping);
				if (result == null) result = caseRequiredDataMappingConnection(objectOrientedViewRequiredDataMapping);
				if (result == null) result = caseIdentifier(objectOrientedViewRequiredDataMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING: {
				UnstructuredViewRequiredDataMapping unstructuredViewRequiredDataMapping = (UnstructuredViewRequiredDataMapping)theEObject;
				T result = caseUnstructuredViewRequiredDataMapping(unstructuredViewRequiredDataMapping);
				if (result == null) result = caseRequiredDataMappingConnection(unstructuredViewRequiredDataMapping);
				if (result == null) result = caseIdentifier(unstructuredViewRequiredDataMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyConnectionsPackage.INTERFACE_PROVIDED_REQUIRED_CONNECTION: {
				InterfaceProvidedRequiredConnection interfaceProvidedRequiredConnection = (InterfaceProvidedRequiredConnection)theEObject;
				T result = caseInterfaceProvidedRequiredConnection(interfaceProvidedRequiredConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Assembly Coodinator Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Assembly Coodinator Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedAssembly_CoodinatorConnection(ComposedAssembly_CoodinatorConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MW Assembly Coordinator Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MW Assembly Coordinator Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWAssembly_CoordinatorConnection(MWAssembly_CoordinatorConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Coordinator Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Coordinator Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulation_CoordinatorConnection(Simulation_CoordinatorConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Assembly Entity Coordinator Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Assembly Entity Coordinator Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationAssemblyEntity_CoordinatorConnection(SimulationAssemblyEntity_CoordinatorConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Required Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Required Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedRequiredConnection(ProvidedRequiredConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MW Coordinator Coordinator Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MW Coordinator Coordinator Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWCoordinator_CoordinatorConnection(MWCoordinator_CoordinatorConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Worker Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Worker Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterWorkerConnection(MasterWorkerConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Involved Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Involved Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationInvolvedConnection(SimulationInvolvedConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinator Function Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinator Function Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinatorFunctionMapping(CoordinatorFunctionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Data Mapping Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Data Mapping Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredDataMappingConnection(RequiredDataMappingConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Oriented View Required Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Oriented View Required Data Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOrientedViewRequiredDataMapping(ObjectOrientedViewRequiredDataMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured View Required Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured View Required Data Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredViewRequiredDataMapping(UnstructuredViewRequiredDataMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Provided Required Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Provided Required Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceProvidedRequiredConnection(InterfaceProvidedRequiredConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AssemblyConnectionsSwitch
