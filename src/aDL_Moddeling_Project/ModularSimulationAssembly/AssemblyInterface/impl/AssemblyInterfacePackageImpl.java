/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl;

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

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfaceFactory;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping;

import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyPackageImpl;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.Unstructured_DataRepositoryPackageImpl;

import aDL_Moddeling_Project.basic.BasicPackage;

import aDL_Moddeling_Project.basic.impl.BasicPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class AssemblyInterfacePackageImpl extends EPackageImpl implements AssemblyInterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAssemblyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInterfaceObjectClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInterfaceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInterfaceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInterfaceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privdedInterfaceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providingInterfaceObjectClassMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requieringInterfaceObjectClassMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enhancedToInterfaceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceTypedDataEEnum = null;

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
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssemblyInterfacePackageImpl() {
		super(eNS_URI, AssemblyInterfaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssemblyInterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssemblyInterfacePackage init() {
		if (isInited) return (AssemblyInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI);

		// Obtain or create and register package
		AssemblyInterfacePackageImpl theAssemblyInterfacePackage = (AssemblyInterfacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssemblyInterfacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssemblyInterfacePackageImpl());

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
		DataSpecificationPackageImpl theDataSpecificationPackage = (DataSpecificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) instanceof DataSpecificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) : DataSpecificationPackage.eINSTANCE);
		ModularSimulationAssemblyPackageImpl theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) instanceof ModularSimulationAssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) : ModularSimulationAssemblyPackage.eINSTANCE);
		AssemblyConnectionsPackageImpl theAssemblyConnectionsPackage = (AssemblyConnectionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) instanceof AssemblyConnectionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) : AssemblyConnectionsPackage.eINSTANCE);
		AssemblyAdditionEnhancementPackageImpl theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) instanceof AssemblyAdditionEnhancementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) : AssemblyAdditionEnhancementPackage.eINSTANCE);
		Unstructured_DataRepositoryPackageImpl theUnstructured_DataRepositoryPackage = (Unstructured_DataRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) instanceof Unstructured_DataRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) : Unstructured_DataRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theAssemblyInterfacePackage.createPackageContents();
		theModularEnvironmentPackage.createPackageContents();
		theManagementServicesPackage.createPackageContents();
		theAdapterServicesPackage.createPackageContents();
		theModularSimulationPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theDataRepresentationPackage.createPackageContents();
		theOperationModelPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theDataSpecificationPackage.createPackageContents();
		theModularSimulationAssemblyPackage.createPackageContents();
		theAssemblyConnectionsPackage.createPackageContents();
		theAssemblyAdditionEnhancementPackage.createPackageContents();
		theUnstructured_DataRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theAssemblyInterfacePackage.initializePackageContents();
		theModularEnvironmentPackage.initializePackageContents();
		theManagementServicesPackage.initializePackageContents();
		theAdapterServicesPackage.initializePackageContents();
		theModularSimulationPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theDataRepresentationPackage.initializePackageContents();
		theOperationModelPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theDataSpecificationPackage.initializePackageContents();
		theModularSimulationAssemblyPackage.initializePackageContents();
		theAssemblyConnectionsPackage.initializePackageContents();
		theAssemblyAdditionEnhancementPackage.initializePackageContents();
		theUnstructured_DataRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssemblyInterfacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssemblyInterfacePackage.eNS_URI, theAssemblyInterfacePackage);
		return theAssemblyInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRepository() {
		return interfaceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRepository_Assemblyinterface() {
		return (EReference)interfaceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyInterface() {
		return assemblyInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyInterface_Abstractinterfaceobjectclass() {
		return (EReference)assemblyInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAssemblyEntity() {
		return abstractAssemblyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractAssemblyEntity_Semantics() {
		return (EAttribute)abstractAssemblyEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInterfaceObjectClass() {
		return abstractInterfaceObjectClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInterfaceObjectClass_Abstractinterfacedata() {
		return (EReference)abstractInterfaceObjectClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInterfaceObjectClass_Abstractinterfaceoperation() {
		return (EReference)abstractInterfaceObjectClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInterfaceData() {
		return abstractInterfaceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInterfaceData_DataType() {
		return (EAttribute)abstractInterfaceDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInterfaceData_DataTypeDescriptions() {
		return (EAttribute)abstractInterfaceDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInterfaceOperation() {
		return abstractInterfaceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInterfaceOperation_ReturnType() {
		return (EAttribute)abstractInterfaceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInterfaceOperation_Abstractparameter() {
		return (EReference)abstractInterfaceOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractParameter() {
		return abstractParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractParameter_Name() {
		return (EAttribute)abstractParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractParameter_Optional() {
		return (EAttribute)abstractParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractParameter_AbstractParameterType() {
		return (EAttribute)abstractParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceMapping() {
		return interfaceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceMapping_Assembableentity() {
		return (EReference)interfaceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredInterfaceMapping() {
		return requiredInterfaceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredInterfaceMapping_Requieringinterfaceobjectclassmapping() {
		return (EReference)requiredInterfaceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivdedInterfaceMapping() {
		return privdedInterfaceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivdedInterfaceMapping_Providinginterfaceobjectclassmapping() {
		return (EReference)privdedInterfaceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidingInterfaceObjectClassMapping() {
		return providingInterfaceObjectClassMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidingInterfaceObjectClassMapping_InterfaceObjectClass() {
		return (EReference)providingInterfaceObjectClassMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidingInterfaceObjectClassMapping_Additionenchancedobjectclass() {
		return (EReference)providingInterfaceObjectClassMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidingInterfaceObjectClassMapping_Enhancedtointerfacemapping() {
		return (EReference)providingInterfaceObjectClassMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequieringInterfaceObjectClassMapping() {
		return requieringInterfaceObjectClassMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequieringInterfaceObjectClassMapping_Objectorientedviewrequiredentry() {
		return (EReference)requieringInterfaceObjectClassMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequieringInterfaceObjectClassMapping_InterfaceObjectClass() {
		return (EReference)requieringInterfaceObjectClassMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequieringInterfaceObjectClassMapping_Enhancedtointerfacemapping() {
		return (EReference)requieringInterfaceObjectClassMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnhancedToInterfaceMapping() {
		return enhancedToInterfaceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnhancedToInterfaceMapping_Abstractassemblyentity() {
		return (EReference)enhancedToInterfaceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnhancedToInterfaceMapping_Additionenhanced() {
		return (EReference)enhancedToInterfaceMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceTypedData() {
		return interfaceTypedDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInterfaceFactory getAssemblyInterfaceFactory() {
		return (AssemblyInterfaceFactory)getEFactoryInstance();
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
		interfaceRepositoryEClass = createEClass(INTERFACE_REPOSITORY);
		createEReference(interfaceRepositoryEClass, INTERFACE_REPOSITORY__ASSEMBLYINTERFACE);

		assemblyInterfaceEClass = createEClass(ASSEMBLY_INTERFACE);
		createEReference(assemblyInterfaceEClass, ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS);

		abstractAssemblyEntityEClass = createEClass(ABSTRACT_ASSEMBLY_ENTITY);
		createEAttribute(abstractAssemblyEntityEClass, ABSTRACT_ASSEMBLY_ENTITY__SEMANTICS);

		abstractInterfaceObjectClassEClass = createEClass(ABSTRACT_INTERFACE_OBJECT_CLASS);
		createEReference(abstractInterfaceObjectClassEClass, ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA);
		createEReference(abstractInterfaceObjectClassEClass, ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION);

		abstractInterfaceDataEClass = createEClass(ABSTRACT_INTERFACE_DATA);
		createEAttribute(abstractInterfaceDataEClass, ABSTRACT_INTERFACE_DATA__DATA_TYPE);
		createEAttribute(abstractInterfaceDataEClass, ABSTRACT_INTERFACE_DATA__DATA_TYPE_DESCRIPTIONS);

		abstractInterfaceOperationEClass = createEClass(ABSTRACT_INTERFACE_OPERATION);
		createEAttribute(abstractInterfaceOperationEClass, ABSTRACT_INTERFACE_OPERATION__RETURN_TYPE);
		createEReference(abstractInterfaceOperationEClass, ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER);

		abstractParameterEClass = createEClass(ABSTRACT_PARAMETER);
		createEAttribute(abstractParameterEClass, ABSTRACT_PARAMETER__NAME);
		createEAttribute(abstractParameterEClass, ABSTRACT_PARAMETER__OPTIONAL);
		createEAttribute(abstractParameterEClass, ABSTRACT_PARAMETER__ABSTRACT_PARAMETER_TYPE);

		interfaceMappingEClass = createEClass(INTERFACE_MAPPING);
		createEReference(interfaceMappingEClass, INTERFACE_MAPPING__ASSEMBABLEENTITY);

		requiredInterfaceMappingEClass = createEClass(REQUIRED_INTERFACE_MAPPING);
		createEReference(requiredInterfaceMappingEClass, REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING);

		privdedInterfaceMappingEClass = createEClass(PRIVDED_INTERFACE_MAPPING);
		createEReference(privdedInterfaceMappingEClass, PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING);

		providingInterfaceObjectClassMappingEClass = createEClass(PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING);
		createEReference(providingInterfaceObjectClassMappingEClass, PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS);
		createEReference(providingInterfaceObjectClassMappingEClass, PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS);
		createEReference(providingInterfaceObjectClassMappingEClass, PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING);

		requieringInterfaceObjectClassMappingEClass = createEClass(REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING);
		createEReference(requieringInterfaceObjectClassMappingEClass, REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY);
		createEReference(requieringInterfaceObjectClassMappingEClass, REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS);
		createEReference(requieringInterfaceObjectClassMappingEClass, REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING);

		enhancedToInterfaceMappingEClass = createEClass(ENHANCED_TO_INTERFACE_MAPPING);
		createEReference(enhancedToInterfaceMappingEClass, ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY);
		createEReference(enhancedToInterfaceMappingEClass, ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED);

		// Create enums
		interfaceTypedDataEEnum = createEEnum(INTERFACE_TYPED_DATA);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		ModularSimulationAssemblyPackage theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackage)EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI);
		AssemblyAdditionEnhancementPackage theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI);
		DataRepresentationPackage theDataRepresentationPackage = (DataRepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceRepositoryEClass.getESuperTypes().add(theBasicPackage.getEntity());
		assemblyInterfaceEClass.getESuperTypes().add(theBasicPackage.getEntity());
		abstractAssemblyEntityEClass.getESuperTypes().add(theBasicPackage.getEntity());
		abstractInterfaceObjectClassEClass.getESuperTypes().add(this.getAbstractAssemblyEntity());
		abstractInterfaceDataEClass.getESuperTypes().add(this.getAbstractAssemblyEntity());
		abstractInterfaceOperationEClass.getESuperTypes().add(this.getAbstractAssemblyEntity());
		interfaceMappingEClass.getESuperTypes().add(theBasicPackage.getIdentifier());
		requiredInterfaceMappingEClass.getESuperTypes().add(this.getInterfaceMapping());
		privdedInterfaceMappingEClass.getESuperTypes().add(this.getInterfaceMapping());

		// Initialize classes, features, and operations; add parameters
		initEClass(interfaceRepositoryEClass, InterfaceRepository.class, "InterfaceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRepository_Assemblyinterface(), this.getAssemblyInterface(), null, "assemblyinterface", null, 0, -1, InterfaceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyInterfaceEClass, AssemblyInterface.class, "AssemblyInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyInterface_Abstractinterfaceobjectclass(), this.getAbstractInterfaceObjectClass(), null, "abstractinterfaceobjectclass", null, 0, -1, AssemblyInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAssemblyEntityEClass, AbstractAssemblyEntity.class, "AbstractAssemblyEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractAssemblyEntity_Semantics(), ecorePackage.getEString(), "Semantics", null, 0, 1, AbstractAssemblyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInterfaceObjectClassEClass, AbstractInterfaceObjectClass.class, "AbstractInterfaceObjectClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractInterfaceObjectClass_Abstractinterfacedata(), this.getAbstractInterfaceData(), null, "abstractinterfacedata", null, 0, -1, AbstractInterfaceObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractInterfaceObjectClass_Abstractinterfaceoperation(), this.getAbstractInterfaceOperation(), null, "abstractinterfaceoperation", null, 0, -1, AbstractInterfaceObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInterfaceDataEClass, AbstractInterfaceData.class, "AbstractInterfaceData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractInterfaceData_DataType(), this.getInterfaceTypedData(), "DataType", null, 0, 1, AbstractInterfaceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInterfaceData_DataTypeDescriptions(), ecorePackage.getEString(), "DataTypeDescriptions", null, 0, -1, AbstractInterfaceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInterfaceOperationEClass, AbstractInterfaceOperation.class, "AbstractInterfaceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractInterfaceOperation_ReturnType(), this.getInterfaceTypedData(), "ReturnType", null, 0, 1, AbstractInterfaceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractInterfaceOperation_Abstractparameter(), this.getAbstractParameter(), null, "abstractparameter", null, 0, -1, AbstractInterfaceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractParameterEClass, AbstractParameter.class, "AbstractParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractParameter_Name(), ecorePackage.getEString(), "Name", null, 1, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractParameter_Optional(), theXMLTypePackage.getBoolean(), "optional", null, 0, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractParameter_AbstractParameterType(), this.getInterfaceTypedData(), "abstractParameterType", null, 0, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceMappingEClass, InterfaceMapping.class, "InterfaceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceMapping_Assembableentity(), theModularSimulationAssemblyPackage.getAssembableEntity(), theModularSimulationAssemblyPackage.getAssembableEntity_Interfacemapping(), "assembableentity", null, 0, 1, InterfaceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredInterfaceMappingEClass, RequiredInterfaceMapping.class, "RequiredInterfaceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredInterfaceMapping_Requieringinterfaceobjectclassmapping(), this.getRequieringInterfaceObjectClassMapping(), null, "requieringinterfaceobjectclassmapping", null, 0, -1, RequiredInterfaceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privdedInterfaceMappingEClass, PrivdedInterfaceMapping.class, "PrivdedInterfaceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivdedInterfaceMapping_Providinginterfaceobjectclassmapping(), this.getProvidingInterfaceObjectClassMapping(), null, "providinginterfaceobjectclassmapping", null, 0, -1, PrivdedInterfaceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providingInterfaceObjectClassMappingEClass, ProvidingInterfaceObjectClassMapping.class, "ProvidingInterfaceObjectClassMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidingInterfaceObjectClassMapping_InterfaceObjectClass(), this.getAbstractInterfaceObjectClass(), null, "interfaceObjectClass", null, 1, 1, ProvidingInterfaceObjectClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidingInterfaceObjectClassMapping_Additionenchancedobjectclass(), theAssemblyAdditionEnhancementPackage.getAdditionEnchancedObjectClass(), null, "additionenchancedobjectclass", null, 1, 1, ProvidingInterfaceObjectClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidingInterfaceObjectClassMapping_Enhancedtointerfacemapping(), this.getEnhancedToInterfaceMapping(), null, "enhancedtointerfacemapping", null, 0, -1, ProvidingInterfaceObjectClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requieringInterfaceObjectClassMappingEClass, RequieringInterfaceObjectClassMapping.class, "RequieringInterfaceObjectClassMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequieringInterfaceObjectClassMapping_Objectorientedviewrequiredentry(), theDataRepresentationPackage.getObjectOrientedViewRequiredEntry(), null, "objectorientedviewrequiredentry", null, 1, 1, RequieringInterfaceObjectClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequieringInterfaceObjectClassMapping_InterfaceObjectClass(), this.getAbstractInterfaceObjectClass(), null, "interfaceObjectClass", null, 1, 1, RequieringInterfaceObjectClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequieringInterfaceObjectClassMapping_Enhancedtointerfacemapping(), this.getEnhancedToInterfaceMapping(), null, "enhancedtointerfacemapping", null, 0, -1, RequieringInterfaceObjectClassMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enhancedToInterfaceMappingEClass, EnhancedToInterfaceMapping.class, "EnhancedToInterfaceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnhancedToInterfaceMapping_Abstractassemblyentity(), this.getAbstractAssemblyEntity(), null, "abstractassemblyentity", null, 1, 1, EnhancedToInterfaceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnhancedToInterfaceMapping_Additionenhanced(), theAssemblyAdditionEnhancementPackage.getAdditionEnhanced(), null, "additionenhanced", null, 1, 1, EnhancedToInterfaceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(interfaceTypedDataEEnum, InterfaceTypedData.class, "InterfaceTypedData");
		addEEnumLiteral(interfaceTypedDataEEnum, InterfaceTypedData.NUMERICAL);
		addEEnumLiteral(interfaceTypedDataEEnum, InterfaceTypedData.STRING_OR_CHAR);
		addEEnumLiteral(interfaceTypedDataEEnum, InterfaceTypedData.ENUM);
	}

} //AssemblyInterfacePackageImpl
