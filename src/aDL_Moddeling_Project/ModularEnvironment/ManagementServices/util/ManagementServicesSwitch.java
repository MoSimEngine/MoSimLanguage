/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.util;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.*;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

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
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage
 * @generated
 */
public class ManagementServicesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManagementServicesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServicesSwitch() {
		if (modelPackage == null) {
			modelPackage = ManagementServicesPackage.eINSTANCE;
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE: {
				ManagementService managementService = (ManagementService)theEObject;
				T result = caseManagementService(managementService);
				if (result == null) result = caseEntity(managementService);
				if (result == null) result = caseIdentifier(managementService);
				if (result == null) result = caseNamedElement(managementService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.MANAGEMENT_SERVICE_SUPPORT_ENTITY: {
				ManagementServiceSupportEntity managementServiceSupportEntity = (ManagementServiceSupportEntity)theEObject;
				T result = caseManagementServiceSupportEntity(managementServiceSupportEntity);
				if (result == null) result = caseEntity(managementServiceSupportEntity);
				if (result == null) result = caseIdentifier(managementServiceSupportEntity);
				if (result == null) result = caseNamedElement(managementServiceSupportEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.MANAGEMENT_SERVICE_FUNCTION: {
				ManagementServiceFunction managementServiceFunction = (ManagementServiceFunction)theEObject;
				T result = caseManagementServiceFunction(managementServiceFunction);
				if (result == null) result = caseOperation(managementServiceFunction);
				if (result == null) result = caseEntity(managementServiceFunction);
				if (result == null) result = caseAdaptable(managementServiceFunction);
				if (result == null) result = caseIdentifier(managementServiceFunction);
				if (result == null) result = caseNamedElement(managementServiceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.MANAGEMENT_SERVICE_INTERFACE: {
				ManagementServiceInterface managementServiceInterface = (ManagementServiceInterface)theEObject;
				T result = caseManagementServiceInterface(managementServiceInterface);
				if (result == null) result = caseEntity(managementServiceInterface);
				if (result == null) result = caseIdentifier(managementServiceInterface);
				if (result == null) result = caseNamedElement(managementServiceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.MSE_PROPERTY_ADDITION_CONTAINER: {
				MSEPropertyAdditionContainer msePropertyAdditionContainer = (MSEPropertyAdditionContainer)theEObject;
				T result = caseMSEPropertyAdditionContainer(msePropertyAdditionContainer);
				if (result == null) result = caseEntity(msePropertyAdditionContainer);
				if (result == null) result = caseIdentifier(msePropertyAdditionContainer);
				if (result == null) result = caseNamedElement(msePropertyAdditionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.ADDITION_VALUE: {
				additionValue additionValue = (additionValue)theEObject;
				T result = caseadditionValue(additionValue);
				if (result == null) result = caseEntity(additionValue);
				if (result == null) result = caseIdentifier(additionValue);
				if (result == null) result = caseNamedElement(additionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER: {
				MultipleSelectionAdditionSetter multipleSelectionAdditionSetter = (MultipleSelectionAdditionSetter)theEObject;
				T result = caseMultipleSelectionAdditionSetter(multipleSelectionAdditionSetter);
				if (result == null) result = caseAdditionSetter(multipleSelectionAdditionSetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER: {
				ExclusiveSelectionAdditionSetter exclusiveSelectionAdditionSetter = (ExclusiveSelectionAdditionSetter)theEObject;
				T result = caseExclusiveSelectionAdditionSetter(exclusiveSelectionAdditionSetter);
				if (result == null) result = caseAdditionSetter(exclusiveSelectionAdditionSetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.SELECTABLE_ADDITION: {
				SelectableAddition selectableAddition = (SelectableAddition)theEObject;
				T result = caseSelectableAddition(selectableAddition);
				if (result == null) result = caseMSEPropertyAdditionContainer(selectableAddition);
				if (result == null) result = caseEntity(selectableAddition);
				if (result == null) result = caseIdentifier(selectableAddition);
				if (result == null) result = caseNamedElement(selectableAddition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.COMBINED_ADDITION: {
				CombinedAddition combinedAddition = (CombinedAddition)theEObject;
				T result = caseCombinedAddition(combinedAddition);
				if (result == null) result = caseMSEPropertyAdditionContainer(combinedAddition);
				if (result == null) result = caseEntity(combinedAddition);
				if (result == null) result = caseIdentifier(combinedAddition);
				if (result == null) result = caseNamedElement(combinedAddition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER: {
				CombinedAdditionSetter combinedAdditionSetter = (CombinedAdditionSetter)theEObject;
				T result = caseCombinedAdditionSetter(combinedAdditionSetter);
				if (result == null) result = caseAdditionSetter(combinedAdditionSetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.ADDITION_SETTER: {
				AdditionSetter additionSetter = (AdditionSetter)theEObject;
				T result = caseAdditionSetter(additionSetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.EXCLUSIVE_SETTABLE_ADDITION: {
				ExclusiveSettableAddition exclusiveSettableAddition = (ExclusiveSettableAddition)theEObject;
				T result = caseExclusiveSettableAddition(exclusiveSettableAddition);
				if (result == null) result = caseSelectableAddition(exclusiveSettableAddition);
				if (result == null) result = caseMSEPropertyAdditionContainer(exclusiveSettableAddition);
				if (result == null) result = caseEntity(exclusiveSettableAddition);
				if (result == null) result = caseIdentifier(exclusiveSettableAddition);
				if (result == null) result = caseNamedElement(exclusiveSettableAddition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.MULTIPLE_SETTABLE_ADDITION: {
				MultipleSettableAddition multipleSettableAddition = (MultipleSettableAddition)theEObject;
				T result = caseMultipleSettableAddition(multipleSettableAddition);
				if (result == null) result = caseSelectableAddition(multipleSettableAddition);
				if (result == null) result = caseMSEPropertyAdditionContainer(multipleSettableAddition);
				if (result == null) result = caseEntity(multipleSettableAddition);
				if (result == null) result = caseIdentifier(multipleSettableAddition);
				if (result == null) result = caseNamedElement(multipleSettableAddition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.ADDITION_ENHANCEABLE_ENTITY: {
				AdditionEnhanceableEntity additionEnhanceableEntity = (AdditionEnhanceableEntity)theEObject;
				T result = caseAdditionEnhanceableEntity(additionEnhanceableEntity);
				if (result == null) result = caseEntity(additionEnhanceableEntity);
				if (result == null) result = caseIdentifier(additionEnhanceableEntity);
				if (result == null) result = caseNamedElement(additionEnhanceableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.WRITABLE_ADDITION: {
				WritableAddition writableAddition = (WritableAddition)theEObject;
				T result = caseWritableAddition(writableAddition);
				if (result == null) result = caseMSEPropertyAdditionContainer(writableAddition);
				if (result == null) result = caseEntity(writableAddition);
				if (result == null) result = caseIdentifier(writableAddition);
				if (result == null) result = caseNamedElement(writableAddition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER: {
				WritableAdditionSetter writableAdditionSetter = (WritableAdditionSetter)theEObject;
				T result = caseWritableAdditionSetter(writableAdditionSetter);
				if (result == null) result = caseAdditionSetter(writableAdditionSetter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementService(ManagementService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Service Support Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Service Support Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementServiceSupportEntity(ManagementServiceSupportEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Service Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Service Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementServiceFunction(ManagementServiceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management Service Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementServiceInterface(ManagementServiceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSE Property Addition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSE Property Addition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSEPropertyAdditionContainer(MSEPropertyAdditionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>addition Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>addition Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseadditionValue(additionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Selection Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Selection Addition Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleSelectionAdditionSetter(MultipleSelectionAdditionSetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Selection Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Selection Addition Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveSelectionAdditionSetter(ExclusiveSelectionAdditionSetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selectable Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selectable Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectableAddition(SelectableAddition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedAddition(CombinedAddition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Addition Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedAdditionSetter(CombinedAdditionSetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionSetter(AdditionSetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Settable Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Settable Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveSettableAddition(ExclusiveSettableAddition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Settable Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Settable Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleSettableAddition(MultipleSettableAddition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Enhanceable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Enhanceable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionEnhanceableEntity(AdditionEnhanceableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writable Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writable Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWritableAddition(WritableAddition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writable Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writable Addition Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWritableAdditionSetter(WritableAdditionSetter object) {
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

} //ManagementServicesSwitch
