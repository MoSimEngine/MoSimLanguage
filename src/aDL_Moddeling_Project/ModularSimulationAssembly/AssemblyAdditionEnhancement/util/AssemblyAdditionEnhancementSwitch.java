/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.util;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.*;

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
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage
 * @generated
 */
public class AssemblyAdditionEnhancementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssemblyAdditionEnhancementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyAdditionEnhancementSwitch() {
		if (modelPackage == null) {
			modelPackage = AssemblyAdditionEnhancementPackage.eINSTANCE;
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
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION: {
				UnstructuredEnhancedInformation unstructuredEnhancedInformation = (UnstructuredEnhancedInformation)theEObject;
				T result = caseUnstructuredEnhancedInformation(unstructuredEnhancedInformation);
				if (result == null) result = caseAdditionEnhancedInformation(unstructuredEnhancedInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS: {
				AdditionEnchancedObjectClass additionEnchancedObjectClass = (AdditionEnchancedObjectClass)theEObject;
				T result = caseAdditionEnchancedObjectClass(additionEnchancedObjectClass);
				if (result == null) result = caseEntity(additionEnchancedObjectClass);
				if (result == null) result = caseAdditionEnhanced(additionEnchancedObjectClass);
				if (result == null) result = caseIdentifier(additionEnchancedObjectClass);
				if (result == null) result = caseNamedElement(additionEnchancedObjectClass);
				if (result == null) result = caseMappableData(additionEnchancedObjectClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION: {
				AdditionEnhancedOperation additionEnhancedOperation = (AdditionEnhancedOperation)theEObject;
				T result = caseAdditionEnhancedOperation(additionEnhancedOperation);
				if (result == null) result = caseEntity(additionEnhancedOperation);
				if (result == null) result = caseAdditionEnhanced(additionEnhancedOperation);
				if (result == null) result = caseIdentifier(additionEnhancedOperation);
				if (result == null) result = caseNamedElement(additionEnhancedOperation);
				if (result == null) result = caseMappableData(additionEnhancedOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyAdditionEnhancementPackage.MAPPABLE_DATA: {
				MappableData mappableData = (MappableData)theEObject;
				T result = caseMappableData(mappableData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED: {
				OverriddenAdditionEnhanced overriddenAdditionEnhanced = (OverriddenAdditionEnhanced)theEObject;
				T result = caseOverriddenAdditionEnhanced(overriddenAdditionEnhanced);
				if (result == null) result = caseEntity(overriddenAdditionEnhanced);
				if (result == null) result = caseAdditionEnhanced(overriddenAdditionEnhanced);
				if (result == null) result = caseIdentifier(overriddenAdditionEnhanced);
				if (result == null) result = caseNamedElement(overriddenAdditionEnhanced);
				if (result == null) result = caseMappableData(overriddenAdditionEnhanced);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED: {
				AdditionEnhanced additionEnhanced = (AdditionEnhanced)theEObject;
				T result = caseAdditionEnhanced(additionEnhanced);
				if (result == null) result = caseMappableData(additionEnhanced);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyAdditionEnhancementPackage.OBJECT_BASED_ENHANCED_INFORMATION: {
				ObjectBasedEnhancedInformation objectBasedEnhancedInformation = (ObjectBasedEnhancedInformation)theEObject;
				T result = caseObjectBasedEnhancedInformation(objectBasedEnhancedInformation);
				if (result == null) result = caseAdditionEnhancedInformation(objectBasedEnhancedInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_INFORMATION: {
				AdditionEnhancedInformation additionEnhancedInformation = (AdditionEnhancedInformation)theEObject;
				T result = caseAdditionEnhancedInformation(additionEnhancedInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA: {
				AdditionEnhancedData additionEnhancedData = (AdditionEnhancedData)theEObject;
				T result = caseAdditionEnhancedData(additionEnhancedData);
				if (result == null) result = caseEntity(additionEnhancedData);
				if (result == null) result = caseAdditionEnhanced(additionEnhancedData);
				if (result == null) result = caseIdentifier(additionEnhancedData);
				if (result == null) result = caseNamedElement(additionEnhancedData);
				if (result == null) result = caseMappableData(additionEnhancedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Enhanced Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Enhanced Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredEnhancedInformation(UnstructuredEnhancedInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Enchanced Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Enchanced Object Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionEnchancedObjectClass(AdditionEnchancedObjectClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Enhanced Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Enhanced Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionEnhancedOperation(AdditionEnhancedOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mappable Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mappable Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappableData(MappableData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overridden Addition Enhanced</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overridden Addition Enhanced</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverriddenAdditionEnhanced(OverriddenAdditionEnhanced object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Enhanced</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Enhanced</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionEnhanced(AdditionEnhanced object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Based Enhanced Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Based Enhanced Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectBasedEnhancedInformation(ObjectBasedEnhancedInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Enhanced Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Enhanced Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionEnhancedInformation(AdditionEnhancedInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Enhanced Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Enhanced Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionEnhancedData(AdditionEnhancedData object) {
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

} //AssemblyAdditionEnhancementSwitch
