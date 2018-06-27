/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.util;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.*;

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
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage
 * @generated
 */
public class DataTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DataTypesPackage.eINSTANCE;
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
			case DataTypesPackage.DATA_TYPE_SPECIFICATION: {
				DataTypeSpecification dataTypeSpecification = (DataTypeSpecification)theEObject;
				T result = caseDataTypeSpecification(dataTypeSpecification);
				if (result == null) result = caseEntity(dataTypeSpecification);
				if (result == null) result = caseAdaptable(dataTypeSpecification);
				if (result == null) result = caseIdentifier(dataTypeSpecification);
				if (result == null) result = caseNamedElement(dataTypeSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				T result = caseEnumLiteral(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.BASE_DATA_TYPE: {
				BaseDataType baseDataType = (BaseDataType)theEObject;
				T result = caseBaseDataType(baseDataType);
				if (result == null) result = caseDataType(baseDataType);
				if (result == null) result = caseDataTypeSpecification(baseDataType);
				if (result == null) result = caseEntity(baseDataType);
				if (result == null) result = caseAdaptable(baseDataType);
				if (result == null) result = caseIdentifier(baseDataType);
				if (result == null) result = caseNamedElement(baseDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.UNIT_TYPE_CONTAINER: {
				UnitTypeContainer unitTypeContainer = (UnitTypeContainer)theEObject;
				T result = caseUnitTypeContainer(unitTypeContainer);
				if (result == null) result = caseEntity(unitTypeContainer);
				if (result == null) result = caseIdentifier(unitTypeContainer);
				if (result == null) result = caseNamedElement(unitTypeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseDataTypeSpecification(unit);
				if (result == null) result = caseEntity(unit);
				if (result == null) result = caseAdaptable(unit);
				if (result == null) result = caseIdentifier(unit);
				if (result == null) result = caseNamedElement(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ENUM_TYPE: {
				EnumType enumType = (EnumType)theEObject;
				T result = caseEnumType(enumType);
				if (result == null) result = caseDataType(enumType);
				if (result == null) result = caseDataTypeSpecification(enumType);
				if (result == null) result = caseEntity(enumType);
				if (result == null) result = caseAdaptable(enumType);
				if (result == null) result = caseIdentifier(enumType);
				if (result == null) result = caseNamedElement(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER: {
				DataSpecificationContainer dataSpecificationContainer = (DataSpecificationContainer)theEObject;
				T result = caseDataSpecificationContainer(dataSpecificationContainer);
				if (result == null) result = caseEntity(dataSpecificationContainer);
				if (result == null) result = caseAdaptable(dataSpecificationContainer);
				if (result == null) result = caseIdentifier(dataSpecificationContainer);
				if (result == null) result = caseNamedElement(dataSpecificationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATA_TYPE_COLLECTION: {
				DataTypeCollection dataTypeCollection = (DataTypeCollection)theEObject;
				T result = caseDataTypeCollection(dataTypeCollection);
				if (result == null) result = caseDataType(dataTypeCollection);
				if (result == null) result = caseDataTypeSpecification(dataTypeCollection);
				if (result == null) result = caseEntity(dataTypeCollection);
				if (result == null) result = caseAdaptable(dataTypeCollection);
				if (result == null) result = caseIdentifier(dataTypeCollection);
				if (result == null) result = caseNamedElement(dataTypeCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.COMBINED_DATA_TYPE: {
				CombinedDataType combinedDataType = (CombinedDataType)theEObject;
				T result = caseCombinedDataType(combinedDataType);
				if (result == null) result = caseDataType(combinedDataType);
				if (result == null) result = caseDataTypeSpecification(combinedDataType);
				if (result == null) result = caseEntity(combinedDataType);
				if (result == null) result = caseAdaptable(combinedDataType);
				if (result == null) result = caseIdentifier(combinedDataType);
				if (result == null) result = caseNamedElement(combinedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseDataTypeSpecification(dataType);
				if (result == null) result = caseEntity(dataType);
				if (result == null) result = caseAdaptable(dataType);
				if (result == null) result = caseIdentifier(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.OBJECT_CLASS_REFERENCE_DATA_TYPE: {
				ObjectClassReferenceDataType objectClassReferenceDataType = (ObjectClassReferenceDataType)theEObject;
				T result = caseObjectClassReferenceDataType(objectClassReferenceDataType);
				if (result == null) result = caseDataType(objectClassReferenceDataType);
				if (result == null) result = caseDataTypeSpecification(objectClassReferenceDataType);
				if (result == null) result = caseEntity(objectClassReferenceDataType);
				if (result == null) result = caseAdaptable(objectClassReferenceDataType);
				if (result == null) result = caseIdentifier(objectClassReferenceDataType);
				if (result == null) result = caseNamedElement(objectClassReferenceDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeSpecification(DataTypeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseDataType(BaseDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Type Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitTypeContainer(UnitTypeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumType(EnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Specification Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Specification Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSpecificationContainer(DataSpecificationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeCollection(DataTypeCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedDataType(CombinedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Reference Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Reference Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassReferenceDataType(ObjectClassReferenceDataType object) {
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

} //DataTypesSwitch
