/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.util;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.*;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService;

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
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage
 * @generated
 */
public class AdapterServicesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdapterServicesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterServicesSwitch() {
		if (modelPackage == null) {
			modelPackage = AdapterServicesPackage.eINSTANCE;
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
			case AdapterServicesPackage.DATA_MIGRATION_ADAPTER: {
				DataMigrationAdapter dataMigrationAdapter = (DataMigrationAdapter)theEObject;
				T result = caseDataMigrationAdapter(dataMigrationAdapter);
				if (result == null) result = caseAdapterService(dataMigrationAdapter);
				if (result == null) result = caseManagementService(dataMigrationAdapter);
				if (result == null) result = caseEntity(dataMigrationAdapter);
				if (result == null) result = caseIdentifier(dataMigrationAdapter);
				if (result == null) result = caseNamedElement(dataMigrationAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.SEMANTIC_ADAPTER: {
				SemanticAdapter semanticAdapter = (SemanticAdapter)theEObject;
				T result = caseSemanticAdapter(semanticAdapter);
				if (result == null) result = caseDataMigrationAdapter(semanticAdapter);
				if (result == null) result = caseAdapterService(semanticAdapter);
				if (result == null) result = caseManagementService(semanticAdapter);
				if (result == null) result = caseEntity(semanticAdapter);
				if (result == null) result = caseIdentifier(semanticAdapter);
				if (result == null) result = caseNamedElement(semanticAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.DESCRIPTIVE_ADAPTER: {
				DescriptiveAdapter descriptiveAdapter = (DescriptiveAdapter)theEObject;
				T result = caseDescriptiveAdapter(descriptiveAdapter);
				if (result == null) result = caseDataMigrationAdapter(descriptiveAdapter);
				if (result == null) result = caseAdapterService(descriptiveAdapter);
				if (result == null) result = caseManagementService(descriptiveAdapter);
				if (result == null) result = caseEntity(descriptiveAdapter);
				if (result == null) result = caseIdentifier(descriptiveAdapter);
				if (result == null) result = caseNamedElement(descriptiveAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.STRUCTURAL_ADAPTER: {
				StructuralAdapter structuralAdapter = (StructuralAdapter)theEObject;
				T result = caseStructuralAdapter(structuralAdapter);
				if (result == null) result = caseDataMigrationAdapter(structuralAdapter);
				if (result == null) result = caseAdapterService(structuralAdapter);
				if (result == null) result = caseManagementService(structuralAdapter);
				if (result == null) result = caseEntity(structuralAdapter);
				if (result == null) result = caseIdentifier(structuralAdapter);
				if (result == null) result = caseNamedElement(structuralAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.TIME_ADAPTER: {
				TimeAdapter timeAdapter = (TimeAdapter)theEObject;
				T result = caseTimeAdapter(timeAdapter);
				if (result == null) result = caseAdapterService(timeAdapter);
				if (result == null) result = caseManagementService(timeAdapter);
				if (result == null) result = caseEntity(timeAdapter);
				if (result == null) result = caseIdentifier(timeAdapter);
				if (result == null) result = caseNamedElement(timeAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.WORKLOAD_ADAPTER: {
				WorkloadAdapter workloadAdapter = (WorkloadAdapter)theEObject;
				T result = caseWorkloadAdapter(workloadAdapter);
				if (result == null) result = caseAdapterService(workloadAdapter);
				if (result == null) result = caseManagementService(workloadAdapter);
				if (result == null) result = caseEntity(workloadAdapter);
				if (result == null) result = caseIdentifier(workloadAdapter);
				if (result == null) result = caseNamedElement(workloadAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ADAPTATION_SPECIFICATION: {
				AdaptationSpecification adaptationSpecification = (AdaptationSpecification)theEObject;
				T result = caseAdaptationSpecification(adaptationSpecification);
				if (result == null) result = caseEntity(adaptationSpecification);
				if (result == null) result = caseIdentifier(adaptationSpecification);
				if (result == null) result = caseNamedElement(adaptationSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ADAPTER_SERVICE: {
				AdapterService adapterService = (AdapterService)theEObject;
				T result = caseAdapterService(adapterService);
				if (result == null) result = caseManagementService(adapterService);
				if (result == null) result = caseEntity(adapterService);
				if (result == null) result = caseIdentifier(adapterService);
				if (result == null) result = caseNamedElement(adapterService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION: {
				MathematicalConversion mathematicalConversion = (MathematicalConversion)theEObject;
				T result = caseMathematicalConversion(mathematicalConversion);
				if (result == null) result = caseAdapatationConversion(mathematicalConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.LINKED_ADAPTATION: {
				LinkedAdaptation linkedAdaptation = (LinkedAdaptation)theEObject;
				T result = caseLinkedAdaptation(linkedAdaptation);
				if (result == null) result = caseAdaptationDescription(linkedAdaptation);
				if (result == null) result = caseEntity(linkedAdaptation);
				if (result == null) result = caseIdentifier(linkedAdaptation);
				if (result == null) result = caseNamedElement(linkedAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ADAPTATION_DESCRIPTION: {
				AdaptationDescription adaptationDescription = (AdaptationDescription)theEObject;
				T result = caseAdaptationDescription(adaptationDescription);
				if (result == null) result = caseEntity(adaptationDescription);
				if (result == null) result = caseIdentifier(adaptationDescription);
				if (result == null) result = caseNamedElement(adaptationDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT: {
				LinkedAdaptationElement linkedAdaptationElement = (LinkedAdaptationElement)theEObject;
				T result = caseLinkedAdaptationElement(linkedAdaptationElement);
				if (result == null) result = caseEntity(linkedAdaptationElement);
				if (result == null) result = caseIdentifier(linkedAdaptationElement);
				if (result == null) result = caseNamedElement(linkedAdaptationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ADAPATATION_CONVERSION: {
				AdapatationConversion adapatationConversion = (AdapatationConversion)theEObject;
				T result = caseAdapatationConversion(adapatationConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK: {
				AdaptationElementLink adaptationElementLink = (AdaptationElementLink)theEObject;
				T result = caseAdaptationElementLink(adaptationElementLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION: {
				allToAllAdapation allToAllAdapation = (allToAllAdapation)theEObject;
				T result = caseallToAllAdapation(allToAllAdapation);
				if (result == null) result = caseAdaptationDescription(allToAllAdapation);
				if (result == null) result = caseEntity(allToAllAdapation);
				if (result == null) result = caseIdentifier(allToAllAdapation);
				if (result == null) result = caseNamedElement(allToAllAdapation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.SINGLE_ADAPTATION: {
				singleAdaptation singleAdaptation = (singleAdaptation)theEObject;
				T result = casesingleAdaptation(singleAdaptation);
				if (result == null) result = caseAdaptationDescription(singleAdaptation);
				if (result == null) result = caseEntity(singleAdaptation);
				if (result == null) result = caseIdentifier(singleAdaptation);
				if (result == null) result = caseNamedElement(singleAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.TRANSFORMATIONAL_CONVERSION: {
				transformationalConversion transformationalConversion = (transformationalConversion)theEObject;
				T result = casetransformationalConversion(transformationalConversion);
				if (result == null) result = caseAdapatationConversion(transformationalConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION: {
				BaseConnectedAdaptation baseConnectedAdaptation = (BaseConnectedAdaptation)theEObject;
				T result = caseBaseConnectedAdaptation(baseConnectedAdaptation);
				if (result == null) result = caseAdaptationDescription(baseConnectedAdaptation);
				if (result == null) result = caseEntity(baseConnectedAdaptation);
				if (result == null) result = caseIdentifier(baseConnectedAdaptation);
				if (result == null) result = caseNamedElement(baseConnectedAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.DERIVED_ELEMENT: {
				DerivedElement derivedElement = (DerivedElement)theEObject;
				T result = caseDerivedElement(derivedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY: {
				AdaptationDefinitionRepository adaptationDefinitionRepository = (AdaptationDefinitionRepository)theEObject;
				T result = caseAdaptationDefinitionRepository(adaptationDefinitionRepository);
				if (result == null) result = caseEntity(adaptationDefinitionRepository);
				if (result == null) result = caseIdentifier(adaptationDefinitionRepository);
				if (result == null) result = caseNamedElement(adaptationDefinitionRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.DATA_MARKER: {
				DataMarker dataMarker = (DataMarker)theEObject;
				T result = caseDataMarker(dataMarker);
				if (result == null) result = caseEntity(dataMarker);
				if (result == null) result = caseIdentifier(dataMarker);
				if (result == null) result = caseNamedElement(dataMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING: {
				AdaptationMarkerMapping adaptationMarkerMapping = (AdaptationMarkerMapping)theEObject;
				T result = caseAdaptationMarkerMapping(adaptationMarkerMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ADAPTABLE: {
				Adaptable adaptable = (Adaptable)theEObject;
				T result = caseAdaptable(adaptable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.REFERENCE_USING_CONVERSION: {
				referenceUsingConversion referenceUsingConversion = (referenceUsingConversion)theEObject;
				T result = casereferenceUsingConversion(referenceUsingConversion);
				if (result == null) result = caseAdapatationConversion(referenceUsingConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.ONE_MARKER_TO_MANY_ADAPTATION: {
				oneMarkerToManyAdaptation oneMarkerToManyAdaptation = (oneMarkerToManyAdaptation)theEObject;
				T result = caseoneMarkerToManyAdaptation(oneMarkerToManyAdaptation);
				if (result == null) result = caseAdaptationDescription(oneMarkerToManyAdaptation);
				if (result == null) result = caseEntity(oneMarkerToManyAdaptation);
				if (result == null) result = caseIdentifier(oneMarkerToManyAdaptation);
				if (result == null) result = caseNamedElement(oneMarkerToManyAdaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION: {
				DataUsingAdaptationDescription dataUsingAdaptationDescription = (DataUsingAdaptationDescription)theEObject;
				T result = caseDataUsingAdaptationDescription(dataUsingAdaptationDescription);
				if (result == null) result = casesingleAdaptation(dataUsingAdaptationDescription);
				if (result == null) result = caseAdaptationDescription(dataUsingAdaptationDescription);
				if (result == null) result = caseEntity(dataUsingAdaptationDescription);
				if (result == null) result = caseIdentifier(dataUsingAdaptationDescription);
				if (result == null) result = caseNamedElement(dataUsingAdaptationDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterServicesPackage.NEW_ECLASS27: {
				NewEClass27 newEClass27 = (NewEClass27)theEObject;
				T result = caseNewEClass27(newEClass27);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Migration Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Migration Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMigrationAdapter(DataMigrationAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticAdapter(SemanticAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptive Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptive Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptiveAdapter(DescriptiveAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralAdapter(StructuralAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAdapter(TimeAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkloadAdapter(WorkloadAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationSpecification(AdaptationSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapterService(AdapterService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mathematical Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mathematical Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathematicalConversion(MathematicalConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linked Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linked Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkedAdaptation(LinkedAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationDescription(AdaptationDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linked Adaptation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linked Adaptation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkedAdaptationElement(LinkedAdaptationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapatation Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapatation Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapatationConversion(AdapatationConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Element Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Element Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationElementLink(AdaptationElementLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>all To All Adapation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>all To All Adapation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseallToAllAdapation(allToAllAdapation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>single Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>single Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesingleAdaptation(singleAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>transformational Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>transformational Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetransformationalConversion(transformationalConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Connected Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Connected Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseConnectedAdaptation(BaseConnectedAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedElement(DerivedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Definition Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Definition Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationDefinitionRepository(AdaptationDefinitionRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMarker(DataMarker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation Marker Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation Marker Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptationMarkerMapping(AdaptationMarkerMapping object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>reference Using Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>reference Using Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereferenceUsingConversion(referenceUsingConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>one Marker To Many Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>one Marker To Many Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoneMarkerToManyAdaptation(oneMarkerToManyAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Using Adaptation Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Using Adaptation Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataUsingAdaptationDescription(DataUsingAdaptationDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass27</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass27</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass27(NewEClass27 object) {
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

} //AdapterServicesSwitch
