/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.util;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.*;

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
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage
 * @generated
 */
public class AssemblyInterfaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssemblyInterfacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInterfaceSwitch() {
		if (modelPackage == null) {
			modelPackage = AssemblyInterfacePackage.eINSTANCE;
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
			case AssemblyInterfacePackage.INTERFACE_REPOSITORY: {
				InterfaceRepository interfaceRepository = (InterfaceRepository)theEObject;
				T result = caseInterfaceRepository(interfaceRepository);
				if (result == null) result = caseEntity(interfaceRepository);
				if (result == null) result = caseIdentifier(interfaceRepository);
				if (result == null) result = caseNamedElement(interfaceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.ASSEMBLY_INTERFACE: {
				AssemblyInterface assemblyInterface = (AssemblyInterface)theEObject;
				T result = caseAssemblyInterface(assemblyInterface);
				if (result == null) result = caseEntity(assemblyInterface);
				if (result == null) result = caseIdentifier(assemblyInterface);
				if (result == null) result = caseNamedElement(assemblyInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.ABSTRACT_ASSEMBLY_ENTITY: {
				AbstractAssemblyEntity abstractAssemblyEntity = (AbstractAssemblyEntity)theEObject;
				T result = caseAbstractAssemblyEntity(abstractAssemblyEntity);
				if (result == null) result = caseEntity(abstractAssemblyEntity);
				if (result == null) result = caseIdentifier(abstractAssemblyEntity);
				if (result == null) result = caseNamedElement(abstractAssemblyEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS: {
				AbstractInterfaceObjectClass abstractInterfaceObjectClass = (AbstractInterfaceObjectClass)theEObject;
				T result = caseAbstractInterfaceObjectClass(abstractInterfaceObjectClass);
				if (result == null) result = caseAbstractAssemblyEntity(abstractInterfaceObjectClass);
				if (result == null) result = caseEntity(abstractInterfaceObjectClass);
				if (result == null) result = caseIdentifier(abstractInterfaceObjectClass);
				if (result == null) result = caseNamedElement(abstractInterfaceObjectClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA: {
				AbstractInterfaceData abstractInterfaceData = (AbstractInterfaceData)theEObject;
				T result = caseAbstractInterfaceData(abstractInterfaceData);
				if (result == null) result = caseAbstractAssemblyEntity(abstractInterfaceData);
				if (result == null) result = caseEntity(abstractInterfaceData);
				if (result == null) result = caseIdentifier(abstractInterfaceData);
				if (result == null) result = caseNamedElement(abstractInterfaceData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION: {
				AbstractInterfaceOperation abstractInterfaceOperation = (AbstractInterfaceOperation)theEObject;
				T result = caseAbstractInterfaceOperation(abstractInterfaceOperation);
				if (result == null) result = caseAbstractAssemblyEntity(abstractInterfaceOperation);
				if (result == null) result = caseEntity(abstractInterfaceOperation);
				if (result == null) result = caseIdentifier(abstractInterfaceOperation);
				if (result == null) result = caseNamedElement(abstractInterfaceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER: {
				AbstractParameter abstractParameter = (AbstractParameter)theEObject;
				T result = caseAbstractParameter(abstractParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.INTERFACE_MAPPING: {
				InterfaceMapping interfaceMapping = (InterfaceMapping)theEObject;
				T result = caseInterfaceMapping(interfaceMapping);
				if (result == null) result = caseIdentifier(interfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.REQUIRED_INTERFACE_MAPPING: {
				RequiredInterfaceMapping requiredInterfaceMapping = (RequiredInterfaceMapping)theEObject;
				T result = caseRequiredInterfaceMapping(requiredInterfaceMapping);
				if (result == null) result = caseInterfaceMapping(requiredInterfaceMapping);
				if (result == null) result = caseIdentifier(requiredInterfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.PRIVDED_INTERFACE_MAPPING: {
				PrivdedInterfaceMapping privdedInterfaceMapping = (PrivdedInterfaceMapping)theEObject;
				T result = casePrivdedInterfaceMapping(privdedInterfaceMapping);
				if (result == null) result = caseInterfaceMapping(privdedInterfaceMapping);
				if (result == null) result = caseIdentifier(privdedInterfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING: {
				ProvidingInterfaceObjectClassMapping providingInterfaceObjectClassMapping = (ProvidingInterfaceObjectClassMapping)theEObject;
				T result = caseProvidingInterfaceObjectClassMapping(providingInterfaceObjectClassMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING: {
				RequieringInterfaceObjectClassMapping requieringInterfaceObjectClassMapping = (RequieringInterfaceObjectClassMapping)theEObject;
				T result = caseRequieringInterfaceObjectClassMapping(requieringInterfaceObjectClassMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING: {
				EnhancedToInterfaceMapping enhancedToInterfaceMapping = (EnhancedToInterfaceMapping)theEObject;
				T result = caseEnhancedToInterfaceMapping(enhancedToInterfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRepository(InterfaceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyInterface(AssemblyInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Assembly Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Assembly Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAssemblyEntity(AbstractAssemblyEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Interface Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Interface Object Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInterfaceObjectClass(AbstractInterfaceObjectClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Interface Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Interface Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInterfaceData(AbstractInterfaceData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Interface Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Interface Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInterfaceOperation(AbstractInterfaceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractParameter(AbstractParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceMapping(InterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Interface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredInterfaceMapping(RequiredInterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privded Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privded Interface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivdedInterfaceMapping(PrivdedInterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Providing Interface Object Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Providing Interface Object Class Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidingInterfaceObjectClassMapping(ProvidingInterfaceObjectClassMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requiering Interface Object Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requiering Interface Object Class Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequieringInterfaceObjectClassMapping(RequieringInterfaceObjectClassMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enhanced To Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enhanced To Interface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnhancedToInterfaceMapping(EnhancedToInterfaceMapping object) {
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

} //AssemblyInterfaceSwitch
