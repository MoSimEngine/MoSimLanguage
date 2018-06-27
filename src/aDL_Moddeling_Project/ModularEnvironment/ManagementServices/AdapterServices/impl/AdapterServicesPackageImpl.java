/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesFactory;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMigrationAdapter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DescriptiveAdapter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.NewEClass27;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.SemanticAdapter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.StructuralAdapter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.TimeAdapter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.WorkloadAdapter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.referenceUsingConversion;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.transformationalConversion;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesPackageImpl;

import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;

import aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentPackageImpl;

import aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage;

import aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AssemblyAdditionEnhancementPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsPackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl;

import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.Unstructured_DataRepositoryPackageImpl;

import aDL_Moddeling_Project.basic.BasicPackage;

import aDL_Moddeling_Project.basic.impl.BasicPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdapterServicesPackageImpl extends EPackageImpl implements AdapterServicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMigrationAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathematicalConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedAdaptationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapatationConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationElementLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allToAllAdapationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationalConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseConnectedAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationDefinitionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationMarkerMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceUsingConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneMarkerToManyAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUsingAdaptationDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newEClass27EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdapterServicesPackageImpl() {
		super(eNS_URI, AdapterServicesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AdapterServicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdapterServicesPackage init() {
		if (isInited) return (AdapterServicesPackage)EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI);

		// Obtain or create and register package
		AdapterServicesPackageImpl theAdapterServicesPackage = (AdapterServicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdapterServicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdapterServicesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModularEnvironmentPackageImpl theModularEnvironmentPackage = (ModularEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) instanceof ModularEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) : ModularEnvironmentPackage.eINSTANCE);
		ManagementServicesPackageImpl theManagementServicesPackage = (ManagementServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI) instanceof ManagementServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI) : ManagementServicesPackage.eINSTANCE);
		ModularSimulationPackageImpl theModularSimulationPackage = (ModularSimulationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) instanceof ModularSimulationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) : ModularSimulationPackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);
		DataRepresentationPackageImpl theDataRepresentationPackage = (DataRepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) instanceof DataRepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) : DataRepresentationPackage.eINSTANCE);
		OperationModelPackageImpl theOperationModelPackage = (OperationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) instanceof OperationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) : OperationModelPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		DataSpecificationPackageImpl theDataSpecificationPackage = (DataSpecificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) instanceof DataSpecificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) : DataSpecificationPackage.eINSTANCE);
		ModularSimulationAssemblyPackageImpl theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) instanceof ModularSimulationAssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) : ModularSimulationAssemblyPackage.eINSTANCE);
		AssemblyConnectionsPackageImpl theAssemblyConnectionsPackage = (AssemblyConnectionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) instanceof AssemblyConnectionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) : AssemblyConnectionsPackage.eINSTANCE);
		AssemblyAdditionEnhancementPackageImpl theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) instanceof AssemblyAdditionEnhancementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) : AssemblyAdditionEnhancementPackage.eINSTANCE);
		AssemblyInterfacePackageImpl theAssemblyInterfacePackage = (AssemblyInterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) instanceof AssemblyInterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) : AssemblyInterfacePackage.eINSTANCE);
		Unstructured_DataRepositoryPackageImpl theUnstructured_DataRepositoryPackage = (Unstructured_DataRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) instanceof Unstructured_DataRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) : Unstructured_DataRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theAdapterServicesPackage.createPackageContents();
		theModularEnvironmentPackage.createPackageContents();
		theManagementServicesPackage.createPackageContents();
		theModularSimulationPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theDataRepresentationPackage.createPackageContents();
		theOperationModelPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theDataSpecificationPackage.createPackageContents();
		theModularSimulationAssemblyPackage.createPackageContents();
		theAssemblyConnectionsPackage.createPackageContents();
		theAssemblyAdditionEnhancementPackage.createPackageContents();
		theAssemblyInterfacePackage.createPackageContents();
		theUnstructured_DataRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theAdapterServicesPackage.initializePackageContents();
		theModularEnvironmentPackage.initializePackageContents();
		theManagementServicesPackage.initializePackageContents();
		theModularSimulationPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theDataRepresentationPackage.initializePackageContents();
		theOperationModelPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theDataSpecificationPackage.initializePackageContents();
		theModularSimulationAssemblyPackage.initializePackageContents();
		theAssemblyConnectionsPackage.initializePackageContents();
		theAssemblyAdditionEnhancementPackage.initializePackageContents();
		theAssemblyInterfacePackage.initializePackageContents();
		theUnstructured_DataRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdapterServicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdapterServicesPackage.eNS_URI, theAdapterServicesPackage);
		return theAdapterServicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMigrationAdapter() {
		return dataMigrationAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMigrationAdapter_Adaptationspecification() {
		return (EReference)dataMigrationAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticAdapter() {
		return semanticAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptiveAdapter() {
		return descriptiveAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralAdapter() {
		return structuralAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAdapter() {
		return timeAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkloadAdapter() {
		return workloadAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationSpecification() {
		return adaptationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationSpecification_FstEntityID() {
		return (EReference)adaptationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationSpecification_ScndEntityID() {
		return (EReference)adaptationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapterService() {
		return adapterServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdapterService_Adapterdescriptionattachment() {
		return (EReference)adapterServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathematicalConversion() {
		return mathematicalConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathematicalConversion_Term() {
		return (EAttribute)mathematicalConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathematicalConversion_Invertible() {
		return (EAttribute)mathematicalConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkedAdaptation() {
		return linkedAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedAdaptation_Linkedadaptationelement() {
		return (EReference)linkedAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedAdaptation_LowestContainingAdaptationElement() {
		return (EReference)linkedAdaptationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedAdaptation_HighestContainingAptationElement() {
		return (EReference)linkedAdaptationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedAdaptation_EncapsulatedContainer() {
		return (EReference)linkedAdaptationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationDescription() {
		return adaptationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptationDescription_SubProperty() {
		return (EAttribute)adaptationDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkedAdaptationElement() {
		return linkedAdaptationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedAdaptationElement_NextLink() {
		return (EReference)linkedAdaptationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedAdaptationElement_PreviousLink() {
		return (EReference)linkedAdaptationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkedAdaptationElement_LinkedElement() {
		return (EReference)linkedAdaptationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapatationConversion() {
		return adapatationConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationElementLink() {
		return adaptationElementLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationElementLink_Adapatationconversion() {
		return (EReference)adaptationElementLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationElementLink_LinkedAdapterElement() {
		return (EReference)adaptationElementLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getallToAllAdapation() {
		return allToAllAdapationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getallToAllAdapation_Adapatationconversion() {
		return (EReference)allToAllAdapationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getallToAllAdapation_Members() {
		return (EReference)allToAllAdapationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsingleAdaptation() {
		return singleAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsingleAdaptation_Adapatationconversion() {
		return (EReference)singleAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsingleAdaptation_From() {
		return (EReference)singleAdaptationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsingleAdaptation_To() {
		return (EReference)singleAdaptationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransformationalConversion() {
		return transformationalConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseConnectedAdaptation() {
		return baseConnectedAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseConnectedAdaptation_Derivedelement() {
		return (EReference)baseConnectedAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseConnectedAdaptation_BaseMarker() {
		return (EReference)baseConnectedAdaptationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedElement() {
		return derivedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedElement_Adapatationconversion() {
		return (EReference)derivedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedElement_Datamarker() {
		return (EReference)derivedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationDefinitionRepository() {
		return adaptationDefinitionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationDefinitionRepository_Adaptationdescription() {
		return (EReference)adaptationDefinitionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationDefinitionRepository_Datamarker() {
		return (EReference)adaptationDefinitionRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMarker() {
		return dataMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMarker_Semantics() {
		return (EAttribute)dataMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptationMarkerMapping() {
		return adaptationMarkerMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationMarkerMapping_Datamarker() {
		return (EReference)adaptationMarkerMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationMarkerMapping_Adaptable() {
		return (EReference)adaptationMarkerMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptationMarkerMapping_Adaptationdescription() {
		return (EReference)adaptationMarkerMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptable() {
		return adaptableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreferenceUsingConversion() {
		return referenceUsingConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoneMarkerToManyAdaptation() {
		return oneMarkerToManyAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoneMarkerToManyAdaptation_Datamarker() {
		return (EReference)oneMarkerToManyAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUsingAdaptationDescription() {
		return dataUsingAdaptationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUsingAdaptationDescription_Abstractassemblyentity() {
		return (EReference)dataUsingAdaptationDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewEClass27() {
		return newEClass27EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterServicesFactory getAdapterServicesFactory() {
		return (AdapterServicesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataMigrationAdapterEClass = createEClass(DATA_MIGRATION_ADAPTER);
		createEReference(dataMigrationAdapterEClass, DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION);

		semanticAdapterEClass = createEClass(SEMANTIC_ADAPTER);

		descriptiveAdapterEClass = createEClass(DESCRIPTIVE_ADAPTER);

		structuralAdapterEClass = createEClass(STRUCTURAL_ADAPTER);

		timeAdapterEClass = createEClass(TIME_ADAPTER);

		workloadAdapterEClass = createEClass(WORKLOAD_ADAPTER);

		adaptationSpecificationEClass = createEClass(ADAPTATION_SPECIFICATION);
		createEReference(adaptationSpecificationEClass, ADAPTATION_SPECIFICATION__FST_ENTITY_ID);
		createEReference(adaptationSpecificationEClass, ADAPTATION_SPECIFICATION__SCND_ENTITY_ID);

		adapterServiceEClass = createEClass(ADAPTER_SERVICE);
		createEReference(adapterServiceEClass, ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT);

		mathematicalConversionEClass = createEClass(MATHEMATICAL_CONVERSION);
		createEAttribute(mathematicalConversionEClass, MATHEMATICAL_CONVERSION__TERM);
		createEAttribute(mathematicalConversionEClass, MATHEMATICAL_CONVERSION__INVERTIBLE);

		linkedAdaptationEClass = createEClass(LINKED_ADAPTATION);
		createEReference(linkedAdaptationEClass, LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT);
		createEReference(linkedAdaptationEClass, LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT);
		createEReference(linkedAdaptationEClass, LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT);
		createEReference(linkedAdaptationEClass, LINKED_ADAPTATION__ENCAPSULATED_CONTAINER);

		adaptationDescriptionEClass = createEClass(ADAPTATION_DESCRIPTION);
		createEAttribute(adaptationDescriptionEClass, ADAPTATION_DESCRIPTION__SUB_PROPERTY);

		linkedAdaptationElementEClass = createEClass(LINKED_ADAPTATION_ELEMENT);
		createEReference(linkedAdaptationElementEClass, LINKED_ADAPTATION_ELEMENT__NEXT_LINK);
		createEReference(linkedAdaptationElementEClass, LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK);
		createEReference(linkedAdaptationElementEClass, LINKED_ADAPTATION_ELEMENT__LINKED_ELEMENT);

		adapatationConversionEClass = createEClass(ADAPATATION_CONVERSION);

		adaptationElementLinkEClass = createEClass(ADAPTATION_ELEMENT_LINK);
		createEReference(adaptationElementLinkEClass, ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION);
		createEReference(adaptationElementLinkEClass, ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT);

		allToAllAdapationEClass = createEClass(ALL_TO_ALL_ADAPATION);
		createEReference(allToAllAdapationEClass, ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION);
		createEReference(allToAllAdapationEClass, ALL_TO_ALL_ADAPATION__MEMBERS);

		singleAdaptationEClass = createEClass(SINGLE_ADAPTATION);
		createEReference(singleAdaptationEClass, SINGLE_ADAPTATION__ADAPATATIONCONVERSION);
		createEReference(singleAdaptationEClass, SINGLE_ADAPTATION__FROM);
		createEReference(singleAdaptationEClass, SINGLE_ADAPTATION__TO);

		transformationalConversionEClass = createEClass(TRANSFORMATIONAL_CONVERSION);

		baseConnectedAdaptationEClass = createEClass(BASE_CONNECTED_ADAPTATION);
		createEReference(baseConnectedAdaptationEClass, BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT);
		createEReference(baseConnectedAdaptationEClass, BASE_CONNECTED_ADAPTATION__BASE_MARKER);

		derivedElementEClass = createEClass(DERIVED_ELEMENT);
		createEReference(derivedElementEClass, DERIVED_ELEMENT__ADAPATATIONCONVERSION);
		createEReference(derivedElementEClass, DERIVED_ELEMENT__DATAMARKER);

		adaptationDefinitionRepositoryEClass = createEClass(ADAPTATION_DEFINITION_REPOSITORY);
		createEReference(adaptationDefinitionRepositoryEClass, ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION);
		createEReference(adaptationDefinitionRepositoryEClass, ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER);

		dataMarkerEClass = createEClass(DATA_MARKER);
		createEAttribute(dataMarkerEClass, DATA_MARKER__SEMANTICS);

		adaptationMarkerMappingEClass = createEClass(ADAPTATION_MARKER_MAPPING);
		createEReference(adaptationMarkerMappingEClass, ADAPTATION_MARKER_MAPPING__DATAMARKER);
		createEReference(adaptationMarkerMappingEClass, ADAPTATION_MARKER_MAPPING__ADAPTABLE);
		createEReference(adaptationMarkerMappingEClass, ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION);

		adaptableEClass = createEClass(ADAPTABLE);

		referenceUsingConversionEClass = createEClass(REFERENCE_USING_CONVERSION);

		oneMarkerToManyAdaptationEClass = createEClass(ONE_MARKER_TO_MANY_ADAPTATION);
		createEReference(oneMarkerToManyAdaptationEClass, ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER);

		dataUsingAdaptationDescriptionEClass = createEClass(DATA_USING_ADAPTATION_DESCRIPTION);
		createEReference(dataUsingAdaptationDescriptionEClass, DATA_USING_ADAPTATION_DESCRIPTION__ABSTRACTASSEMBLYENTITY);

		newEClass27EClass = createEClass(NEW_ECLASS27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		ManagementServicesPackage theManagementServicesPackage = (ManagementServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI);
		ModularSimulationAssemblyPackage theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		AssemblyInterfacePackage theAssemblyInterfacePackage = (AssemblyInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataMigrationAdapterEClass.getESuperTypes().add(this.getAdapterService());
		semanticAdapterEClass.getESuperTypes().add(this.getDataMigrationAdapter());
		descriptiveAdapterEClass.getESuperTypes().add(this.getDataMigrationAdapter());
		structuralAdapterEClass.getESuperTypes().add(this.getDataMigrationAdapter());
		timeAdapterEClass.getESuperTypes().add(this.getAdapterService());
		workloadAdapterEClass.getESuperTypes().add(this.getAdapterService());
		adaptationSpecificationEClass.getESuperTypes().add(theBasicPackage.getEntity());
		adapterServiceEClass.getESuperTypes().add(theManagementServicesPackage.getManagementService());
		mathematicalConversionEClass.getESuperTypes().add(this.getAdapatationConversion());
		linkedAdaptationEClass.getESuperTypes().add(this.getAdaptationDescription());
		adaptationDescriptionEClass.getESuperTypes().add(theBasicPackage.getEntity());
		linkedAdaptationElementEClass.getESuperTypes().add(theBasicPackage.getEntity());
		allToAllAdapationEClass.getESuperTypes().add(this.getAdaptationDescription());
		singleAdaptationEClass.getESuperTypes().add(this.getAdaptationDescription());
		transformationalConversionEClass.getESuperTypes().add(this.getAdapatationConversion());
		baseConnectedAdaptationEClass.getESuperTypes().add(this.getAdaptationDescription());
		adaptationDefinitionRepositoryEClass.getESuperTypes().add(theBasicPackage.getEntity());
		dataMarkerEClass.getESuperTypes().add(theBasicPackage.getEntity());
		referenceUsingConversionEClass.getESuperTypes().add(this.getAdapatationConversion());
		oneMarkerToManyAdaptationEClass.getESuperTypes().add(this.getAdaptationDescription());
		dataUsingAdaptationDescriptionEClass.getESuperTypes().add(this.getAdaptationDescription());
		dataUsingAdaptationDescriptionEClass.getESuperTypes().add(this.getsingleAdaptation());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataMigrationAdapterEClass, DataMigrationAdapter.class, "DataMigrationAdapter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataMigrationAdapter_Adaptationspecification(), this.getAdaptationSpecification(), null, "adaptationspecification", null, 0, -1, DataMigrationAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticAdapterEClass, SemanticAdapter.class, "SemanticAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptiveAdapterEClass, DescriptiveAdapter.class, "DescriptiveAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralAdapterEClass, StructuralAdapter.class, "StructuralAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeAdapterEClass, TimeAdapter.class, "TimeAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workloadAdapterEClass, WorkloadAdapter.class, "WorkloadAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptationSpecificationEClass, AdaptationSpecification.class, "AdaptationSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationSpecification_FstEntityID(), theBasicPackage.getIdentifier(), null, "fstEntityID", null, 1, 1, AdaptationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationSpecification_ScndEntityID(), theBasicPackage.getIdentifier(), null, "scndEntityID", null, 1, 1, AdaptationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adapterServiceEClass, AdapterService.class, "AdapterService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdapterService_Adapterdescriptionattachment(), theModularSimulationAssemblyPackage.getAdapterDescriptionAttachment(), theModularSimulationAssemblyPackage.getAdapterDescriptionAttachment_Adapterservice(), "adapterdescriptionattachment", null, 0, -1, AdapterService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mathematicalConversionEClass, MathematicalConversion.class, "MathematicalConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMathematicalConversion_Term(), ecorePackage.getEString(), "term", null, 1, 1, MathematicalConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMathematicalConversion_Invertible(), theXMLTypePackage.getBoolean(), "invertible", "true", 1, 1, MathematicalConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkedAdaptationEClass, LinkedAdaptation.class, "LinkedAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkedAdaptation_Linkedadaptationelement(), this.getLinkedAdaptationElement(), null, "linkedadaptationelement", null, 0, -1, LinkedAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkedAdaptation_LowestContainingAdaptationElement(), this.getLinkedAdaptationElement(), null, "lowestContainingAdaptationElement", null, 0, 1, LinkedAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkedAdaptation_HighestContainingAptationElement(), this.getLinkedAdaptationElement(), null, "highestContainingAptationElement", null, 0, 1, LinkedAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkedAdaptation_EncapsulatedContainer(), this.getDataMarker(), null, "encapsulatedContainer", null, 0, -1, LinkedAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationDescriptionEClass, AdaptationDescription.class, "AdaptationDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdaptationDescription_SubProperty(), ecorePackage.getEString(), "subProperty", null, 0, 1, AdaptationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkedAdaptationElementEClass, LinkedAdaptationElement.class, "LinkedAdaptationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkedAdaptationElement_NextLink(), this.getAdaptationElementLink(), null, "nextLink", null, 0, 1, LinkedAdaptationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkedAdaptationElement_PreviousLink(), this.getAdaptationElementLink(), null, "previousLink", null, 0, 1, LinkedAdaptationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkedAdaptationElement_LinkedElement(), this.getDataMarker(), null, "linkedElement", null, 0, -1, LinkedAdaptationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adapatationConversionEClass, AdapatationConversion.class, "AdapatationConversion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptationElementLinkEClass, AdaptationElementLink.class, "AdaptationElementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationElementLink_Adapatationconversion(), this.getAdapatationConversion(), null, "adapatationconversion", null, 1, 1, AdaptationElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationElementLink_LinkedAdapterElement(), this.getLinkedAdaptationElement(), null, "linkedAdapterElement", null, 1, 1, AdaptationElementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allToAllAdapationEClass, allToAllAdapation.class, "allToAllAdapation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getallToAllAdapation_Adapatationconversion(), this.getAdapatationConversion(), null, "adapatationconversion", null, 1, 1, allToAllAdapation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getallToAllAdapation_Members(), this.getDataMarker(), null, "members", null, 0, -1, allToAllAdapation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleAdaptationEClass, singleAdaptation.class, "singleAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsingleAdaptation_Adapatationconversion(), this.getAdapatationConversion(), null, "adapatationconversion", null, 1, 1, singleAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsingleAdaptation_From(), this.getDataMarker(), null, "from", null, 1, 1, singleAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsingleAdaptation_To(), this.getDataMarker(), null, "to", null, 1, 1, singleAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationalConversionEClass, transformationalConversion.class, "transformationalConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseConnectedAdaptationEClass, BaseConnectedAdaptation.class, "BaseConnectedAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseConnectedAdaptation_Derivedelement(), this.getDerivedElement(), null, "derivedelement", null, 0, -1, BaseConnectedAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseConnectedAdaptation_BaseMarker(), this.getDataMarker(), null, "baseMarker", null, 1, 1, BaseConnectedAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedElementEClass, DerivedElement.class, "DerivedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedElement_Adapatationconversion(), this.getAdapatationConversion(), null, "adapatationconversion", null, 1, 1, DerivedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivedElement_Datamarker(), this.getDataMarker(), null, "datamarker", null, 1, 1, DerivedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationDefinitionRepositoryEClass, AdaptationDefinitionRepository.class, "AdaptationDefinitionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationDefinitionRepository_Adaptationdescription(), this.getAdaptationDescription(), null, "adaptationdescription", null, 0, -1, AdaptationDefinitionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationDefinitionRepository_Datamarker(), this.getDataMarker(), null, "datamarker", null, 0, -1, AdaptationDefinitionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMarkerEClass, DataMarker.class, "DataMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataMarker_Semantics(), ecorePackage.getEString(), "Semantics", null, 0, 1, DataMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationMarkerMappingEClass, AdaptationMarkerMapping.class, "AdaptationMarkerMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptationMarkerMapping_Datamarker(), this.getDataMarker(), null, "datamarker", null, 1, 1, AdaptationMarkerMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationMarkerMapping_Adaptable(), this.getAdaptable(), null, "adaptable", null, 0, -1, AdaptationMarkerMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptationMarkerMapping_Adaptationdescription(), this.getAdaptationDescription(), null, "adaptationdescription", null, 1, 1, AdaptationMarkerMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptableEClass, Adaptable.class, "Adaptable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceUsingConversionEClass, referenceUsingConversion.class, "referenceUsingConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oneMarkerToManyAdaptationEClass, oneMarkerToManyAdaptation.class, "oneMarkerToManyAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getoneMarkerToManyAdaptation_Datamarker(), this.getDataMarker(), null, "datamarker", null, 1, 1, oneMarkerToManyAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataUsingAdaptationDescriptionEClass, DataUsingAdaptationDescription.class, "DataUsingAdaptationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataUsingAdaptationDescription_Abstractassemblyentity(), theAssemblyInterfacePackage.getAbstractAssemblyEntity(), null, "abstractassemblyentity", null, 0, -1, DataUsingAdaptationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newEClass27EClass, NewEClass27.class, "NewEClass27", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AdapterServicesPackageImpl
