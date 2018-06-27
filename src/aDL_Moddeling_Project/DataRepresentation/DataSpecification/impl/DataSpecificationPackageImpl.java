/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.BasicTypedData;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.CollectionTypedData;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.CombinedTypedData;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationFactory;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.EnumTypedData;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.GeneralTypedData;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.UnitTypedData;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationPackageImpl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl;

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
public class DataSpecificationPackageImpl extends EPackageImpl implements DataSpecificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTypedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalTypedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTypedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedTypedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

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
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataSpecificationPackageImpl() {
		super(eNS_URI, DataSpecificationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataSpecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataSpecificationPackage init() {
		if (isInited) return (DataSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI);

		// Obtain or create and register package
		DataSpecificationPackageImpl theDataSpecificationPackage = (DataSpecificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataSpecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataSpecificationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModularEnvironmentPackageImpl theModularEnvironmentPackage = (ModularEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) instanceof ModularEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) : ModularEnvironmentPackage.eINSTANCE);
		ManagementServicesPackageImpl theManagementServicesPackage = (ManagementServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI) instanceof ManagementServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI) : ManagementServicesPackage.eINSTANCE);
		AdapterServicesPackageImpl theAdapterServicesPackage = (AdapterServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI) instanceof AdapterServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI) : AdapterServicesPackage.eINSTANCE);
		ModularSimulationPackageImpl theModularSimulationPackage = (ModularSimulationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) instanceof ModularSimulationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) : ModularSimulationPackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);
		DataRepresentationPackageImpl theDataRepresentationPackage = (DataRepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) instanceof DataRepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI) : DataRepresentationPackage.eINSTANCE);
		OperationModelPackageImpl theOperationModelPackage = (OperationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) instanceof OperationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) : OperationModelPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		ModularSimulationAssemblyPackageImpl theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) instanceof ModularSimulationAssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) : ModularSimulationAssemblyPackage.eINSTANCE);
		AssemblyConnectionsPackageImpl theAssemblyConnectionsPackage = (AssemblyConnectionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) instanceof AssemblyConnectionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) : AssemblyConnectionsPackage.eINSTANCE);
		AssemblyAdditionEnhancementPackageImpl theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) instanceof AssemblyAdditionEnhancementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) : AssemblyAdditionEnhancementPackage.eINSTANCE);
		AssemblyInterfacePackageImpl theAssemblyInterfacePackage = (AssemblyInterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) instanceof AssemblyInterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) : AssemblyInterfacePackage.eINSTANCE);
		Unstructured_DataRepositoryPackageImpl theUnstructured_DataRepositoryPackage = (Unstructured_DataRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) instanceof Unstructured_DataRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) : Unstructured_DataRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theDataSpecificationPackage.createPackageContents();
		theModularEnvironmentPackage.createPackageContents();
		theManagementServicesPackage.createPackageContents();
		theAdapterServicesPackage.createPackageContents();
		theModularSimulationPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theDataRepresentationPackage.createPackageContents();
		theOperationModelPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theModularSimulationAssemblyPackage.createPackageContents();
		theAssemblyConnectionsPackage.createPackageContents();
		theAssemblyAdditionEnhancementPackage.createPackageContents();
		theAssemblyInterfacePackage.createPackageContents();
		theUnstructured_DataRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theDataSpecificationPackage.initializePackageContents();
		theModularEnvironmentPackage.initializePackageContents();
		theManagementServicesPackage.initializePackageContents();
		theAdapterServicesPackage.initializePackageContents();
		theModularSimulationPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theDataRepresentationPackage.initializePackageContents();
		theOperationModelPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theModularSimulationAssemblyPackage.initializePackageContents();
		theAssemblyConnectionsPackage.initializePackageContents();
		theAssemblyAdditionEnhancementPackage.initializePackageContents();
		theAssemblyInterfacePackage.initializePackageContents();
		theUnstructured_DataRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataSpecificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataSpecificationPackage.eNS_URI, theDataSpecificationPackage);
		return theDataSpecificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticType() {
		return semanticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticType_SemanticDescription() {
		return (EAttribute)semanticTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionTypedData() {
		return collectionTypedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTypedData_Basedatatype() {
		return (EReference)collectionTypedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumTypedData() {
		return enumTypedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumTypedData_Enumtype() {
		return (EReference)enumTypedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicTypedData() {
		return basicTypedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicTypedData_Basedatatype() {
		return (EReference)basicTypedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralTypedData() {
		return generalTypedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTypedData() {
		return unitTypedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTypedData_Unit() {
		return (EReference)unitTypedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedTypedData() {
		return combinedTypedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedTypedData_Combineddatatype() {
		return (EReference)combinedTypedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_SemanticType() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Constant() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecificationFactory getDataSpecificationFactory() {
		return (DataSpecificationFactory)getEFactoryInstance();
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
		semanticTypeEClass = createEClass(SEMANTIC_TYPE);
		createEAttribute(semanticTypeEClass, SEMANTIC_TYPE__SEMANTIC_DESCRIPTION);

		collectionTypedDataEClass = createEClass(COLLECTION_TYPED_DATA);
		createEReference(collectionTypedDataEClass, COLLECTION_TYPED_DATA__BASEDATATYPE);

		enumTypedDataEClass = createEClass(ENUM_TYPED_DATA);
		createEReference(enumTypedDataEClass, ENUM_TYPED_DATA__ENUMTYPE);

		basicTypedDataEClass = createEClass(BASIC_TYPED_DATA);
		createEReference(basicTypedDataEClass, BASIC_TYPED_DATA__BASEDATATYPE);

		generalTypedDataEClass = createEClass(GENERAL_TYPED_DATA);

		unitTypedDataEClass = createEClass(UNIT_TYPED_DATA);
		createEReference(unitTypedDataEClass, UNIT_TYPED_DATA__UNIT);

		combinedTypedDataEClass = createEClass(COMBINED_TYPED_DATA);
		createEReference(combinedTypedDataEClass, COMBINED_TYPED_DATA__COMBINEDDATATYPE);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__SEMANTIC_TYPE);
		createEAttribute(dataEClass, DATA__CONSTANT);
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
		DataTypesPackage theDataTypesPackage = (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);
		ManagementServicesPackage theManagementServicesPackage = (ManagementServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		semanticTypeEClass.getESuperTypes().add(theBasicPackage.getEntity());
		collectionTypedDataEClass.getESuperTypes().add(this.getGeneralTypedData());
		enumTypedDataEClass.getESuperTypes().add(this.getData());
		basicTypedDataEClass.getESuperTypes().add(this.getGeneralTypedData());
		generalTypedDataEClass.getESuperTypes().add(this.getData());
		unitTypedDataEClass.getESuperTypes().add(this.getGeneralTypedData());
		combinedTypedDataEClass.getESuperTypes().add(this.getGeneralTypedData());
		dataEClass.getESuperTypes().add(theManagementServicesPackage.getAdditionEnhanceableEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(semanticTypeEClass, SemanticType.class, "SemanticType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticType_SemanticDescription(), ecorePackage.getEString(), "SemanticDescription", null, 1, 1, SemanticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionTypedDataEClass, CollectionTypedData.class, "CollectionTypedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionTypedData_Basedatatype(), theDataTypesPackage.getBaseDataType(), null, "basedatatype", null, 1, 1, CollectionTypedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumTypedDataEClass, EnumTypedData.class, "EnumTypedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumTypedData_Enumtype(), theDataTypesPackage.getEnumType(), null, "enumtype", null, 1, 1, EnumTypedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicTypedDataEClass, BasicTypedData.class, "BasicTypedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicTypedData_Basedatatype(), theDataTypesPackage.getBaseDataType(), null, "basedatatype", null, 1, 1, BasicTypedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalTypedDataEClass, GeneralTypedData.class, "GeneralTypedData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitTypedDataEClass, UnitTypedData.class, "UnitTypedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitTypedData_Unit(), theDataTypesPackage.getUnit(), null, "unit", null, 1, 1, UnitTypedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinedTypedDataEClass, CombinedTypedData.class, "CombinedTypedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinedTypedData_Combineddatatype(), theDataTypesPackage.getCombinedDataType(), null, "combineddatatype", null, 1, 1, CombinedTypedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_SemanticType(), this.getSemanticType(), null, "semanticType", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Constant(), theXMLTypePackage.getBoolean(), "constant", "false", 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DataSpecificationPackageImpl
