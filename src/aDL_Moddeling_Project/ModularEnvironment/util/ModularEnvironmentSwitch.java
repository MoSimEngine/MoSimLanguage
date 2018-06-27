/**
 */
package aDL_Moddeling_Project.ModularEnvironment.util;

import aDL_Moddeling_Project.ModularEnvironment.*;

import aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity;

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
 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage
 * @generated
 */
public class ModularEnvironmentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModularEnvironmentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularEnvironmentSwitch() {
		if (modelPackage == null) {
			modelPackage = ModularEnvironmentPackage.eINSTANCE;
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
			case ModularEnvironmentPackage.COORDINATOR: {
				Coordinator coordinator = (Coordinator)theEObject;
				T result = caseCoordinator(coordinator);
				if (result == null) result = caseEntity(coordinator);
				if (result == null) result = caseBasicModSimEntity(coordinator);
				if (result == null) result = caseCoordinatorEntity(coordinator);
				if (result == null) result = caseIdentifier(coordinator);
				if (result == null) result = caseNamedElement(coordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.MSE_SERVICE_INTERFACE: {
				MSEServiceInterface mseServiceInterface = (MSEServiceInterface)theEObject;
				T result = caseMSEServiceInterface(mseServiceInterface);
				if (result == null) result = caseEntity(mseServiceInterface);
				if (result == null) result = caseIdentifier(mseServiceInterface);
				if (result == null) result = caseNamedElement(mseServiceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.COORDINATOR_ENTITY: {
				CoordinatorEntity coordinatorEntity = (CoordinatorEntity)theEObject;
				T result = caseCoordinatorEntity(coordinatorEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.ADDITION_INTERFACE: {
				AdditionInterface additionInterface = (AdditionInterface)theEObject;
				T result = caseAdditionInterface(additionInterface);
				if (result == null) result = caseIdentifier(additionInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.UNSTRUCTURED_ADDITION_INTERFACE: {
				UnstructuredAdditionInterface unstructuredAdditionInterface = (UnstructuredAdditionInterface)theEObject;
				T result = caseUnstructuredAdditionInterface(unstructuredAdditionInterface);
				if (result == null) result = caseAdditionInterface(unstructuredAdditionInterface);
				if (result == null) result = caseIdentifier(unstructuredAdditionInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.DATA_ADDITION_INTERFACE: {
				DataAdditionInterface dataAdditionInterface = (DataAdditionInterface)theEObject;
				T result = caseDataAdditionInterface(dataAdditionInterface);
				if (result == null) result = caseAdditionInterfaceDefinition(dataAdditionInterface);
				if (result == null) result = caseIdentifier(dataAdditionInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.OPERATION_ADDITION_INTERFACE: {
				OperationAdditionInterface operationAdditionInterface = (OperationAdditionInterface)theEObject;
				T result = caseOperationAdditionInterface(operationAdditionInterface);
				if (result == null) result = caseAdditionInterfaceDefinition(operationAdditionInterface);
				if (result == null) result = caseIdentifier(operationAdditionInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE: {
				ObjectOrientedStructuredAdditionInterface objectOrientedStructuredAdditionInterface = (ObjectOrientedStructuredAdditionInterface)theEObject;
				T result = caseObjectOrientedStructuredAdditionInterface(objectOrientedStructuredAdditionInterface);
				if (result == null) result = caseAdditionInterface(objectOrientedStructuredAdditionInterface);
				if (result == null) result = caseIdentifier(objectOrientedStructuredAdditionInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.OBJECT_CLASS_ADDITION_INTERFACE: {
				ObjectClassAdditionInterface objectClassAdditionInterface = (ObjectClassAdditionInterface)theEObject;
				T result = caseObjectClassAdditionInterface(objectClassAdditionInterface);
				if (result == null) result = caseAdditionInterfaceDefinition(objectClassAdditionInterface);
				if (result == null) result = caseIdentifier(objectClassAdditionInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModularEnvironmentPackage.ADDITION_INTERFACE_DEFINITION: {
				AdditionInterfaceDefinition additionInterfaceDefinition = (AdditionInterfaceDefinition)theEObject;
				T result = caseAdditionInterfaceDefinition(additionInterfaceDefinition);
				if (result == null) result = caseIdentifier(additionInterfaceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinator(Coordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSE Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSE Service Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSEServiceInterface(MSEServiceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinator Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinator Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinatorEntity(CoordinatorEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionInterface(AdditionInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Addition Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredAdditionInterface(UnstructuredAdditionInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Addition Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAdditionInterface(DataAdditionInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Addition Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAdditionInterface(OperationAdditionInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Oriented Structured Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Oriented Structured Addition Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOrientedStructuredAdditionInterface(ObjectOrientedStructuredAdditionInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Addition Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassAdditionInterface(ObjectClassAdditionInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Interface Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionInterfaceDefinition(AdditionInterfaceDefinition object) {
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

} //ModularEnvironmentSwitch
