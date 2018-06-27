/**
 */
package aDL_Moddeling_Project.DataRepresentation.util;

import aDL_Moddeling_Project.DataRepresentation.*;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity;

import aDL_Moddeling_Project.basic.Entity;
import aDL_Moddeling_Project.basic.Identifier;
import aDL_Moddeling_Project.basic.NamedElement;

import java.util.Map;

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
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage
 * @generated
 */
public class DataRepresentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataRepresentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationSwitch() {
		if (modelPackage == null) {
			modelPackage = DataRepresentationPackage.eINSTANCE;
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
			case DataRepresentationPackage.OBJECT_CLASS: {
				ObjectClass objectClass = (ObjectClass)theEObject;
				T result = caseObjectClass(objectClass);
				if (result == null) result = caseAdditionEnhanceableEntity(objectClass);
				if (result == null) result = caseAdaptable(objectClass);
				if (result == null) result = caseEntity(objectClass);
				if (result == null) result = caseIdentifier(objectClass);
				if (result == null) result = caseNamedElement(objectClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION: {
				ObjectClassOperation objectClassOperation = (ObjectClassOperation)theEObject;
				T result = caseObjectClassOperation(objectClassOperation);
				if (result == null) result = caseAdditionEnhanceableEntity(objectClassOperation);
				if (result == null) result = caseOperation(objectClassOperation);
				if (result == null) result = caseEntity(objectClassOperation);
				if (result == null) result = caseAdaptable(objectClassOperation);
				if (result == null) result = caseIdentifier(objectClassOperation);
				if (result == null) result = caseNamedElement(objectClassOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.OBJECT_INSTANCE: {
				ObjectInstance objectInstance = (ObjectInstance)theEObject;
				T result = caseObjectInstance(objectInstance);
				if (result == null) result = caseEntity(objectInstance);
				if (result == null) result = caseIdentifier(objectInstance);
				if (result == null) result = caseNamedElement(objectInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.CLASS_REFERENCE_PROPERTY: {
				ClassReferenceProperty classReferenceProperty = (ClassReferenceProperty)theEObject;
				T result = caseClassReferenceProperty(classReferenceProperty);
				if (result == null) result = caseData(classReferenceProperty);
				if (result == null) result = caseAdditionEnhanceableEntity(classReferenceProperty);
				if (result == null) result = caseEntity(classReferenceProperty);
				if (result == null) result = caseIdentifier(classReferenceProperty);
				if (result == null) result = caseNamedElement(classReferenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA: {
				ObjectOrientedViewSimulationData objectOrientedViewSimulationData = (ObjectOrientedViewSimulationData)theEObject;
				T result = caseObjectOrientedViewSimulationData(objectOrientedViewSimulationData);
				if (result == null) result = caseSimulationData(objectOrientedViewSimulationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE: {
				requiredDataInterface requiredDataInterface = (requiredDataInterface)theEObject;
				T result = caserequiredDataInterface(requiredDataInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.INSTANCED_OBJECTS: {
				InstancedObjects instancedObjects = (InstancedObjects)theEObject;
				T result = caseInstancedObjects(instancedObjects);
				if (result == null) result = caseAdditionEnhanceableEntity(instancedObjects);
				if (result == null) result = caseEntity(instancedObjects);
				if (result == null) result = caseIdentifier(instancedObjects);
				if (result == null) result = caseNamedElement(instancedObjects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.OBJECT_CLASS_DEFINITIONS: {
				ObjectClassDefinitions objectClassDefinitions = (ObjectClassDefinitions)theEObject;
				T result = caseObjectClassDefinitions(objectClassDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE: {
				ObjectClassInheritance objectClassInheritance = (ObjectClassInheritance)theEObject;
				T result = caseObjectClassInheritance(objectClassInheritance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.OPERATION_OVERRIDE: {
				OperationOverride operationOverride = (OperationOverride)theEObject;
				T result = caseOperationOverride(operationOverride);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.SIMULATION_DATA: {
				SimulationData simulationData = (SimulationData)theEObject;
				T result = caseSimulationData(simulationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.DATA_TO_VALUE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<Data, String> dataToValueMap = (Map.Entry<Data, String>)theEObject;
				T result = caseDataToValueMap(dataToValueMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.ENUM_TO_ENUMASSIGNMENT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<EnumType, EnumLiteral> enumToEnumassignmentMap = (Map.Entry<EnumType, EnumLiteral>)theEObject;
				T result = caseEnumToEnumassignmentMap(enumToEnumassignmentMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.DATA_TO_OBJECT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<ClassReferenceProperty, ObjectInstance> dataToObjectMap = (Map.Entry<ClassReferenceProperty, ObjectInstance>)theEObject;
				T result = caseDataToObjectMap(dataToObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY: {
				ObjectOrientedViewRequiredEntry objectOrientedViewRequiredEntry = (ObjectOrientedViewRequiredEntry)theEObject;
				T result = caseObjectOrientedViewRequiredEntry(objectOrientedViewRequiredEntry);
				if (result == null) result = caseRequiredDataEntry(objectOrientedViewRequiredEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.UNSTRUCTURED_VIEW_REQUIRED_ENTRY: {
				UnstructuredViewRequiredEntry unstructuredViewRequiredEntry = (UnstructuredViewRequiredEntry)theEObject;
				T result = caseUnstructuredViewRequiredEntry(unstructuredViewRequiredEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.REQUIRED_REFERENCE_PROPERTY: {
				RequiredReferenceProperty requiredReferenceProperty = (RequiredReferenceProperty)theEObject;
				T result = caseRequiredReferenceProperty(requiredReferenceProperty);
				if (result == null) result = caseData(requiredReferenceProperty);
				if (result == null) result = caseAdditionEnhanceableEntity(requiredReferenceProperty);
				if (result == null) result = caseEntity(requiredReferenceProperty);
				if (result == null) result = caseIdentifier(requiredReferenceProperty);
				if (result == null) result = caseNamedElement(requiredReferenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataRepresentationPackage.REQUIRED_DATA_ENTRY: {
				RequiredDataEntry requiredDataEntry = (RequiredDataEntry)theEObject;
				T result = caseRequiredDataEntry(requiredDataEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClass(ObjectClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassOperation(ObjectClassOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectInstance(ObjectInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassReferenceProperty(ClassReferenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Oriented View Simulation Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Oriented View Simulation Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOrientedViewSimulationData(ObjectOrientedViewSimulationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>required Data Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>required Data Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserequiredDataInterface(requiredDataInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanced Objects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanced Objects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancedObjects(InstancedObjects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassDefinitions(ObjectClassDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassInheritance(ObjectClassInheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Override</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Override</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationOverride(OperationOverride object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationData(SimulationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data To Value Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data To Value Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataToValueMap(Map.Entry<Data, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum To Enumassignment Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum To Enumassignment Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumToEnumassignmentMap(Map.Entry<EnumType, EnumLiteral> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data To Object Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data To Object Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataToObjectMap(Map.Entry<ClassReferenceProperty, ObjectInstance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Oriented View Required Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Oriented View Required Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOrientedViewRequiredEntry(ObjectOrientedViewRequiredEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured View Required Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured View Required Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredViewRequiredEntry(UnstructuredViewRequiredEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredReferenceProperty(RequiredReferenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Data Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Data Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredDataEntry(RequiredDataEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
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

} //DataRepresentationSwitch
