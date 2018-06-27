/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdapterServicesFactoryImpl extends EFactoryImpl implements AdapterServicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdapterServicesFactory init() {
		try {
			AdapterServicesFactory theAdapterServicesFactory = (AdapterServicesFactory)EPackage.Registry.INSTANCE.getEFactory(AdapterServicesPackage.eNS_URI);
			if (theAdapterServicesFactory != null) {
				return theAdapterServicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdapterServicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterServicesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdapterServicesPackage.SEMANTIC_ADAPTER: return createSemanticAdapter();
			case AdapterServicesPackage.DESCRIPTIVE_ADAPTER: return createDescriptiveAdapter();
			case AdapterServicesPackage.STRUCTURAL_ADAPTER: return createStructuralAdapter();
			case AdapterServicesPackage.TIME_ADAPTER: return createTimeAdapter();
			case AdapterServicesPackage.WORKLOAD_ADAPTER: return createWorkloadAdapter();
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION: return createMathematicalConversion();
			case AdapterServicesPackage.LINKED_ADAPTATION: return createLinkedAdaptation();
			case AdapterServicesPackage.LINKED_ADAPTATION_ELEMENT: return createLinkedAdaptationElement();
			case AdapterServicesPackage.ADAPTATION_ELEMENT_LINK: return createAdaptationElementLink();
			case AdapterServicesPackage.ALL_TO_ALL_ADAPATION: return createallToAllAdapation();
			case AdapterServicesPackage.SINGLE_ADAPTATION: return createsingleAdaptation();
			case AdapterServicesPackage.TRANSFORMATIONAL_CONVERSION: return createtransformationalConversion();
			case AdapterServicesPackage.BASE_CONNECTED_ADAPTATION: return createBaseConnectedAdaptation();
			case AdapterServicesPackage.DERIVED_ELEMENT: return createDerivedElement();
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY: return createAdaptationDefinitionRepository();
			case AdapterServicesPackage.DATA_MARKER: return createDataMarker();
			case AdapterServicesPackage.ADAPTATION_MARKER_MAPPING: return createAdaptationMarkerMapping();
			case AdapterServicesPackage.REFERENCE_USING_CONVERSION: return createreferenceUsingConversion();
			case AdapterServicesPackage.ONE_MARKER_TO_MANY_ADAPTATION: return createoneMarkerToManyAdaptation();
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION: return createDataUsingAdaptationDescription();
			case AdapterServicesPackage.NEW_ECLASS27: return createNewEClass27();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticAdapter createSemanticAdapter() {
		SemanticAdapterImpl semanticAdapter = new SemanticAdapterImpl();
		return semanticAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptiveAdapter createDescriptiveAdapter() {
		DescriptiveAdapterImpl descriptiveAdapter = new DescriptiveAdapterImpl();
		return descriptiveAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralAdapter createStructuralAdapter() {
		StructuralAdapterImpl structuralAdapter = new StructuralAdapterImpl();
		return structuralAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdapter createTimeAdapter() {
		TimeAdapterImpl timeAdapter = new TimeAdapterImpl();
		return timeAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadAdapter createWorkloadAdapter() {
		WorkloadAdapterImpl workloadAdapter = new WorkloadAdapterImpl();
		return workloadAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathematicalConversion createMathematicalConversion() {
		MathematicalConversionImpl mathematicalConversion = new MathematicalConversionImpl();
		return mathematicalConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedAdaptation createLinkedAdaptation() {
		LinkedAdaptationImpl linkedAdaptation = new LinkedAdaptationImpl();
		return linkedAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedAdaptationElement createLinkedAdaptationElement() {
		LinkedAdaptationElementImpl linkedAdaptationElement = new LinkedAdaptationElementImpl();
		return linkedAdaptationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationElementLink createAdaptationElementLink() {
		AdaptationElementLinkImpl adaptationElementLink = new AdaptationElementLinkImpl();
		return adaptationElementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public allToAllAdapation createallToAllAdapation() {
		allToAllAdapationImpl allToAllAdapation = new allToAllAdapationImpl();
		return allToAllAdapation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public singleAdaptation createsingleAdaptation() {
		singleAdaptationImpl singleAdaptation = new singleAdaptationImpl();
		return singleAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transformationalConversion createtransformationalConversion() {
		transformationalConversionImpl transformationalConversion = new transformationalConversionImpl();
		return transformationalConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseConnectedAdaptation createBaseConnectedAdaptation() {
		BaseConnectedAdaptationImpl baseConnectedAdaptation = new BaseConnectedAdaptationImpl();
		return baseConnectedAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedElement createDerivedElement() {
		DerivedElementImpl derivedElement = new DerivedElementImpl();
		return derivedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDefinitionRepository createAdaptationDefinitionRepository() {
		AdaptationDefinitionRepositoryImpl adaptationDefinitionRepository = new AdaptationDefinitionRepositoryImpl();
		return adaptationDefinitionRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker createDataMarker() {
		DataMarkerImpl dataMarker = new DataMarkerImpl();
		return dataMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationMarkerMapping createAdaptationMarkerMapping() {
		AdaptationMarkerMappingImpl adaptationMarkerMapping = new AdaptationMarkerMappingImpl();
		return adaptationMarkerMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public referenceUsingConversion createreferenceUsingConversion() {
		referenceUsingConversionImpl referenceUsingConversion = new referenceUsingConversionImpl();
		return referenceUsingConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oneMarkerToManyAdaptation createoneMarkerToManyAdaptation() {
		oneMarkerToManyAdaptationImpl oneMarkerToManyAdaptation = new oneMarkerToManyAdaptationImpl();
		return oneMarkerToManyAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUsingAdaptationDescription createDataUsingAdaptationDescription() {
		DataUsingAdaptationDescriptionImpl dataUsingAdaptationDescription = new DataUsingAdaptationDescriptionImpl();
		return dataUsingAdaptationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEClass27 createNewEClass27() {
		NewEClass27Impl newEClass27 = new NewEClass27Impl();
		return newEClass27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterServicesPackage getAdapterServicesPackage() {
		return (AdapterServicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdapterServicesPackage getPackage() {
		return AdapterServicesPackage.eINSTANCE;
	}

} //AdapterServicesFactoryImpl
