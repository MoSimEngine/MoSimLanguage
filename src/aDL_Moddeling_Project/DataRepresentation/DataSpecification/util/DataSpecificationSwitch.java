/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification.util;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.*;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity;

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
 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage
 * @generated
 */
public class DataSpecificationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataSpecificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecificationSwitch() {
		if (modelPackage == null) {
			modelPackage = DataSpecificationPackage.eINSTANCE;
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
			case DataSpecificationPackage.SEMANTIC_TYPE: {
				SemanticType semanticType = (SemanticType)theEObject;
				T result = caseSemanticType(semanticType);
				if (result == null) result = caseEntity(semanticType);
				if (result == null) result = caseIdentifier(semanticType);
				if (result == null) result = caseNamedElement(semanticType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSpecificationPackage.COLLECTION_TYPED_DATA: {
				CollectionTypedData collectionTypedData = (CollectionTypedData)theEObject;
				T result = caseCollectionTypedData(collectionTypedData);
				if (result == null) result = caseGeneralTypedData(collectionTypedData);
				if (result == null) result = caseData(collectionTypedData);
				if (result == null) result = caseAdditionEnhanceableEntity(collectionTypedData);
				if (result == null) result = caseEntity(collectionTypedData);
				if (result == null) result = caseIdentifier(collectionTypedData);
				if (result == null) result = caseNamedElement(collectionTypedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSpecificationPackage.ENUM_TYPED_DATA: {
				EnumTypedData enumTypedData = (EnumTypedData)theEObject;
				T result = caseEnumTypedData(enumTypedData);
				if (result == null) result = caseData(enumTypedData);
				if (result == null) result = caseAdditionEnhanceableEntity(enumTypedData);
				if (result == null) result = caseEntity(enumTypedData);
				if (result == null) result = caseIdentifier(enumTypedData);
				if (result == null) result = caseNamedElement(enumTypedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSpecificationPackage.BASIC_TYPED_DATA: {
				BasicTypedData basicTypedData = (BasicTypedData)theEObject;
				T result = caseBasicTypedData(basicTypedData);
				if (result == null) result = caseGeneralTypedData(basicTypedData);
				if (result == null) result = caseData(basicTypedData);
				if (result == null) result = caseAdditionEnhanceableEntity(basicTypedData);
				if (result == null) result = caseEntity(basicTypedData);
				if (result == null) result = caseIdentifier(basicTypedData);
				if (result == null) result = caseNamedElement(basicTypedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSpecificationPackage.GENERAL_TYPED_DATA: {
				GeneralTypedData generalTypedData = (GeneralTypedData)theEObject;
				T result = caseGeneralTypedData(generalTypedData);
				if (result == null) result = caseData(generalTypedData);
				if (result == null) result = caseAdditionEnhanceableEntity(generalTypedData);
				if (result == null) result = caseEntity(generalTypedData);
				if (result == null) result = caseIdentifier(generalTypedData);
				if (result == null) result = caseNamedElement(generalTypedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSpecificationPackage.UNIT_TYPED_DATA: {
				UnitTypedData unitTypedData = (UnitTypedData)theEObject;
				T result = caseUnitTypedData(unitTypedData);
				if (result == null) result = caseGeneralTypedData(unitTypedData);
				if (result == null) result = caseData(unitTypedData);
				if (result == null) result = caseAdditionEnhanceableEntity(unitTypedData);
				if (result == null) result = caseEntity(unitTypedData);
				if (result == null) result = caseIdentifier(unitTypedData);
				if (result == null) result = caseNamedElement(unitTypedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSpecificationPackage.COMBINED_TYPED_DATA: {
				CombinedTypedData combinedTypedData = (CombinedTypedData)theEObject;
				T result = caseCombinedTypedData(combinedTypedData);
				if (result == null) result = caseGeneralTypedData(combinedTypedData);
				if (result == null) result = caseData(combinedTypedData);
				if (result == null) result = caseAdditionEnhanceableEntity(combinedTypedData);
				if (result == null) result = caseEntity(combinedTypedData);
				if (result == null) result = caseIdentifier(combinedTypedData);
				if (result == null) result = caseNamedElement(combinedTypedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataSpecificationPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseAdditionEnhanceableEntity(data);
				if (result == null) result = caseEntity(data);
				if (result == null) result = caseIdentifier(data);
				if (result == null) result = caseNamedElement(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticType(SemanticType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Typed Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionTypedData(CollectionTypedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Typed Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumTypedData(EnumTypedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Typed Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicTypedData(BasicTypedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Typed Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralTypedData(GeneralTypedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Typed Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitTypedData(UnitTypedData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Typed Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedTypedData(CombinedTypedData object) {
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

} //DataSpecificationSwitch
