/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.util;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.ModularSimulationAssembly.*;

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
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage
 * @generated
 */
public class ModularSimulationAssemblySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModularSimulationAssemblyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularSimulationAssemblySwitch() {
		if (modelPackage == null) {
			modelPackage = ModularSimulationAssemblyPackage.eINSTANCE;
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY: {
				SimulationAssembly simulationAssembly = (SimulationAssembly)theEObject;
				T result = caseSimulationAssembly(simulationAssembly);
				if (result == null) result = caseEntity(simulationAssembly);
				if (result == null) result = caseAssembly(simulationAssembly);
				if (result == null) result = caseIdentifier(simulationAssembly);
				if (result == null) result = caseNamedElement(simulationAssembly);
				if (result == null) result = caseBasicModSimEntity(simulationAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseEntity(connector);
				if (result == null) result = caseIdentifier(connector);
				if (result == null) result = caseNamedElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.GENERAL_SIMULATION_FUNCTION: {
				generalSimulationFunction generalSimulationFunction = (generalSimulationFunction)theEObject;
				T result = casegeneralSimulationFunction(generalSimulationFunction);
				if (result == null) result = caseOperation(generalSimulationFunction);
				if (result == null) result = caseEntity(generalSimulationFunction);
				if (result == null) result = caseAdaptable(generalSimulationFunction);
				if (result == null) result = caseIdentifier(generalSimulationFunction);
				if (result == null) result = caseNamedElement(generalSimulationFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.BASIC_MOD_SIM_ENTITY: {
				BasicModSimEntity basicModSimEntity = (BasicModSimEntity)theEObject;
				T result = caseBasicModSimEntity(basicModSimEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.ASSEMBLY: {
				Assembly assembly = (Assembly)theEObject;
				T result = caseAssembly(assembly);
				if (result == null) result = caseBasicModSimEntity(assembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY: {
				SimulationAssemblyEntity simulationAssemblyEntity = (SimulationAssemblyEntity)theEObject;
				T result = caseSimulationAssemblyEntity(simulationAssemblyEntity);
				if (result == null) result = caseAssembableEntity(simulationAssemblyEntity);
				if (result == null) result = caseEntity(simulationAssemblyEntity);
				if (result == null) result = caseIdentifier(simulationAssemblyEntity);
				if (result == null) result = caseNamedElement(simulationAssemblyEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY: {
				AssembableEntity assembableEntity = (AssembableEntity)theEObject;
				T result = caseAssembableEntity(assembableEntity);
				if (result == null) result = caseEntity(assembableEntity);
				if (result == null) result = caseIdentifier(assembableEntity);
				if (result == null) result = caseNamedElement(assembableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.COMBINED_ASSEMBLY_ENTITY: {
				CombinedAssemblyEntity combinedAssemblyEntity = (CombinedAssemblyEntity)theEObject;
				T result = caseCombinedAssemblyEntity(combinedAssemblyEntity);
				if (result == null) result = caseAssembableEntity(combinedAssemblyEntity);
				if (result == null) result = caseEntity(combinedAssemblyEntity);
				if (result == null) result = caseIdentifier(combinedAssemblyEntity);
				if (result == null) result = caseNamedElement(combinedAssemblyEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT: {
				AdapterDescriptionAttachment adapterDescriptionAttachment = (AdapterDescriptionAttachment)theEObject;
				T result = caseAdapterDescriptionAttachment(adapterDescriptionAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY: {
				CoordinatorAssemblyEntity coordinatorAssemblyEntity = (CoordinatorAssemblyEntity)theEObject;
				T result = caseCoordinatorAssemblyEntity(coordinatorAssemblyEntity);
				if (result == null) result = caseAssembableEntity(coordinatorAssemblyEntity);
				if (result == null) result = caseEntity(coordinatorAssemblyEntity);
				if (result == null) result = caseIdentifier(coordinatorAssemblyEntity);
				if (result == null) result = caseNamedElement(coordinatorAssemblyEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationAssembly(SimulationAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>general Simulation Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>general Simulation Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegeneralSimulationFunction(generalSimulationFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Mod Sim Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Mod Sim Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicModSimEntity(BasicModSimEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembly(Assembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Assembly Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Assembly Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationAssemblyEntity(SimulationAssemblyEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembableEntity(AssembableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Assembly Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Assembly Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedAssemblyEntity(CombinedAssemblyEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter Description Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter Description Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapterDescriptionAttachment(AdapterDescriptionAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinator Assembly Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinator Assembly Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinatorAssemblyEntity(CoordinatorAssemblyEntity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
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

} //ModularSimulationAssemblySwitch
