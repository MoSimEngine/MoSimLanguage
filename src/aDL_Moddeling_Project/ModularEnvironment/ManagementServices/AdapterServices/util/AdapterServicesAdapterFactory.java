/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.util;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.*;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService;

import aDL_Moddeling_Project.basic.Entity;
import aDL_Moddeling_Project.basic.Identifier;
import aDL_Moddeling_Project.basic.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage
 * @generated
 */
public class AdapterServicesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdapterServicesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterServicesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdapterServicesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterServicesSwitch<Adapter> modelSwitch =
		new AdapterServicesSwitch<Adapter>() {
			@Override
			public Adapter caseDataMigrationAdapter(DataMigrationAdapter object) {
				return createDataMigrationAdapterAdapter();
			}
			@Override
			public Adapter caseSemanticAdapter(SemanticAdapter object) {
				return createSemanticAdapterAdapter();
			}
			@Override
			public Adapter caseDescriptiveAdapter(DescriptiveAdapter object) {
				return createDescriptiveAdapterAdapter();
			}
			@Override
			public Adapter caseStructuralAdapter(StructuralAdapter object) {
				return createStructuralAdapterAdapter();
			}
			@Override
			public Adapter caseTimeAdapter(TimeAdapter object) {
				return createTimeAdapterAdapter();
			}
			@Override
			public Adapter caseWorkloadAdapter(WorkloadAdapter object) {
				return createWorkloadAdapterAdapter();
			}
			@Override
			public Adapter caseAdaptationSpecification(AdaptationSpecification object) {
				return createAdaptationSpecificationAdapter();
			}
			@Override
			public Adapter caseAdapterService(AdapterService object) {
				return createAdapterServiceAdapter();
			}
			@Override
			public Adapter caseMathematicalConversion(MathematicalConversion object) {
				return createMathematicalConversionAdapter();
			}
			@Override
			public Adapter caseLinkedAdaptation(LinkedAdaptation object) {
				return createLinkedAdaptationAdapter();
			}
			@Override
			public Adapter caseAdaptationDescription(AdaptationDescription object) {
				return createAdaptationDescriptionAdapter();
			}
			@Override
			public Adapter caseLinkedAdaptationElement(LinkedAdaptationElement object) {
				return createLinkedAdaptationElementAdapter();
			}
			@Override
			public Adapter caseAdapatationConversion(AdapatationConversion object) {
				return createAdapatationConversionAdapter();
			}
			@Override
			public Adapter caseAdaptationElementLink(AdaptationElementLink object) {
				return createAdaptationElementLinkAdapter();
			}
			@Override
			public Adapter caseallToAllAdapation(allToAllAdapation object) {
				return createallToAllAdapationAdapter();
			}
			@Override
			public Adapter casesingleAdaptation(singleAdaptation object) {
				return createsingleAdaptationAdapter();
			}
			@Override
			public Adapter casetransformationalConversion(transformationalConversion object) {
				return createtransformationalConversionAdapter();
			}
			@Override
			public Adapter caseBaseConnectedAdaptation(BaseConnectedAdaptation object) {
				return createBaseConnectedAdaptationAdapter();
			}
			@Override
			public Adapter caseDerivedElement(DerivedElement object) {
				return createDerivedElementAdapter();
			}
			@Override
			public Adapter caseAdaptationDefinitionRepository(AdaptationDefinitionRepository object) {
				return createAdaptationDefinitionRepositoryAdapter();
			}
			@Override
			public Adapter caseDataMarker(DataMarker object) {
				return createDataMarkerAdapter();
			}
			@Override
			public Adapter caseAdaptationMarkerMapping(AdaptationMarkerMapping object) {
				return createAdaptationMarkerMappingAdapter();
			}
			@Override
			public Adapter caseAdaptable(Adaptable object) {
				return createAdaptableAdapter();
			}
			@Override
			public Adapter casereferenceUsingConversion(referenceUsingConversion object) {
				return createreferenceUsingConversionAdapter();
			}
			@Override
			public Adapter caseoneMarkerToManyAdaptation(oneMarkerToManyAdaptation object) {
				return createoneMarkerToManyAdaptationAdapter();
			}
			@Override
			public Adapter caseDataUsingAdaptationDescription(DataUsingAdaptationDescription object) {
				return createDataUsingAdaptationDescriptionAdapter();
			}
			@Override
			public Adapter caseNewEClass27(NewEClass27 object) {
				return createNewEClass27Adapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseManagementService(ManagementService object) {
				return createManagementServiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMigrationAdapter <em>Data Migration Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMigrationAdapter
	 * @generated
	 */
	public Adapter createDataMigrationAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.SemanticAdapter <em>Semantic Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.SemanticAdapter
	 * @generated
	 */
	public Adapter createSemanticAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DescriptiveAdapter <em>Descriptive Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DescriptiveAdapter
	 * @generated
	 */
	public Adapter createDescriptiveAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.StructuralAdapter <em>Structural Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.StructuralAdapter
	 * @generated
	 */
	public Adapter createStructuralAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.TimeAdapter <em>Time Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.TimeAdapter
	 * @generated
	 */
	public Adapter createTimeAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.WorkloadAdapter <em>Workload Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.WorkloadAdapter
	 * @generated
	 */
	public Adapter createWorkloadAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification <em>Adaptation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification
	 * @generated
	 */
	public Adapter createAdaptationSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService <em>Adapter Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService
	 * @generated
	 */
	public Adapter createAdapterServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion <em>Mathematical Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion
	 * @generated
	 */
	public Adapter createMathematicalConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation <em>Linked Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation
	 * @generated
	 */
	public Adapter createLinkedAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription <em>Adaptation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription
	 * @generated
	 */
	public Adapter createAdaptationDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement <em>Linked Adaptation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement
	 * @generated
	 */
	public Adapter createLinkedAdaptationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion <em>Adapatation Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion
	 * @generated
	 */
	public Adapter createAdapatationConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink <em>Adaptation Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink
	 * @generated
	 */
	public Adapter createAdaptationElementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation <em>all To All Adapation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation
	 * @generated
	 */
	public Adapter createallToAllAdapationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation <em>single Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation
	 * @generated
	 */
	public Adapter createsingleAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.transformationalConversion <em>transformational Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.transformationalConversion
	 * @generated
	 */
	public Adapter createtransformationalConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation <em>Base Connected Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation
	 * @generated
	 */
	public Adapter createBaseConnectedAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement <em>Derived Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement
	 * @generated
	 */
	public Adapter createDerivedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository <em>Adaptation Definition Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository
	 * @generated
	 */
	public Adapter createAdaptationDefinitionRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker <em>Data Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker
	 * @generated
	 */
	public Adapter createDataMarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping <em>Adaptation Marker Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping
	 * @generated
	 */
	public Adapter createAdaptationMarkerMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable
	 * @generated
	 */
	public Adapter createAdaptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.referenceUsingConversion <em>reference Using Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.referenceUsingConversion
	 * @generated
	 */
	public Adapter createreferenceUsingConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation <em>one Marker To Many Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation
	 * @generated
	 */
	public Adapter createoneMarkerToManyAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription <em>Data Using Adaptation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription
	 * @generated
	 */
	public Adapter createDataUsingAdaptationDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.NewEClass27 <em>New EClass27</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.NewEClass27
	 * @generated
	 */
	public Adapter createNewEClass27Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.basic.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.basic.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.basic.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.basic.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.basic.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.basic.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService <em>Management Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService
	 * @generated
	 */
	public Adapter createManagementServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdapterServicesAdapterFactory
