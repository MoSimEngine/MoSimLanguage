/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty;
import aDL_Moddeling_Project.DataRepresentation.DataRepresentationFactory;
import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypesPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.InstancedObjects;
import aDL_Moddeling_Project.DataRepresentation.ObjectClass;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation;
import aDL_Moddeling_Project.DataRepresentation.ObjectInstance;
import aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry;
import aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl;

import aDL_Moddeling_Project.DataRepresentation.OperationOverride;
import aDL_Moddeling_Project.DataRepresentation.RequiredDataEntry;
import aDL_Moddeling_Project.DataRepresentation.RequiredReferenceProperty;
import aDL_Moddeling_Project.DataRepresentation.SimulationData;
import aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry;
import aDL_Moddeling_Project.DataRepresentation.requiredDataInterface;

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

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataRepresentationPackageImpl extends EPackageImpl implements DataRepresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectClassOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classReferencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectOrientedViewSimulationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredDataInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancedObjectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectClassDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectClassInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataToValueMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumToEnumassignmentMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataToObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectOrientedViewRequiredEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredViewRequiredEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredReferencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredDataEntryEClass = null;

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
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataRepresentationPackageImpl() {
		super(eNS_URI, DataRepresentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataRepresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataRepresentationPackage init() {
		if (isInited) return (DataRepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(DataRepresentationPackage.eNS_URI);

		// Obtain or create and register package
		DataRepresentationPackageImpl theDataRepresentationPackage = (DataRepresentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataRepresentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataRepresentationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModularEnvironmentPackageImpl theModularEnvironmentPackage = (ModularEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) instanceof ModularEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularEnvironmentPackage.eNS_URI) : ModularEnvironmentPackage.eINSTANCE);
		ManagementServicesPackageImpl theManagementServicesPackage = (ManagementServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI) instanceof ManagementServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI) : ManagementServicesPackage.eINSTANCE);
		AdapterServicesPackageImpl theAdapterServicesPackage = (AdapterServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI) instanceof AdapterServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI) : AdapterServicesPackage.eINSTANCE);
		ModularSimulationPackageImpl theModularSimulationPackage = (ModularSimulationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) instanceof ModularSimulationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationPackage.eNS_URI) : ModularSimulationPackage.eINSTANCE);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI) : BasicPackage.eINSTANCE);
		OperationModelPackageImpl theOperationModelPackage = (OperationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) instanceof OperationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI) : OperationModelPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		DataSpecificationPackageImpl theDataSpecificationPackage = (DataSpecificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) instanceof DataSpecificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI) : DataSpecificationPackage.eINSTANCE);
		ModularSimulationAssemblyPackageImpl theModularSimulationAssemblyPackage = (ModularSimulationAssemblyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) instanceof ModularSimulationAssemblyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModularSimulationAssemblyPackage.eNS_URI) : ModularSimulationAssemblyPackage.eINSTANCE);
		AssemblyConnectionsPackageImpl theAssemblyConnectionsPackage = (AssemblyConnectionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) instanceof AssemblyConnectionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyConnectionsPackage.eNS_URI) : AssemblyConnectionsPackage.eINSTANCE);
		AssemblyAdditionEnhancementPackageImpl theAssemblyAdditionEnhancementPackage = (AssemblyAdditionEnhancementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) instanceof AssemblyAdditionEnhancementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyAdditionEnhancementPackage.eNS_URI) : AssemblyAdditionEnhancementPackage.eINSTANCE);
		AssemblyInterfacePackageImpl theAssemblyInterfacePackage = (AssemblyInterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) instanceof AssemblyInterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblyInterfacePackage.eNS_URI) : AssemblyInterfacePackage.eINSTANCE);
		Unstructured_DataRepositoryPackageImpl theUnstructured_DataRepositoryPackage = (Unstructured_DataRepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) instanceof Unstructured_DataRepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Unstructured_DataRepositoryPackage.eNS_URI) : Unstructured_DataRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theDataRepresentationPackage.createPackageContents();
		theModularEnvironmentPackage.createPackageContents();
		theManagementServicesPackage.createPackageContents();
		theAdapterServicesPackage.createPackageContents();
		theModularSimulationPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theOperationModelPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theDataSpecificationPackage.createPackageContents();
		theModularSimulationAssemblyPackage.createPackageContents();
		theAssemblyConnectionsPackage.createPackageContents();
		theAssemblyAdditionEnhancementPackage.createPackageContents();
		theAssemblyInterfacePackage.createPackageContents();
		theUnstructured_DataRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theDataRepresentationPackage.initializePackageContents();
		theModularEnvironmentPackage.initializePackageContents();
		theManagementServicesPackage.initializePackageContents();
		theAdapterServicesPackage.initializePackageContents();
		theModularSimulationPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theOperationModelPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theDataSpecificationPackage.initializePackageContents();
		theModularSimulationAssemblyPackage.initializePackageContents();
		theAssemblyConnectionsPackage.initializePackageContents();
		theAssemblyAdditionEnhancementPackage.initializePackageContents();
		theAssemblyInterfacePackage.initializePackageContents();
		theUnstructured_DataRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataRepresentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataRepresentationPackage.eNS_URI, theDataRepresentationPackage);
		return theDataRepresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectClass() {
		return objectClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClass_Objectclassoperation() {
		return (EReference)objectClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClass_Objectclassinheritance() {
		return (EReference)objectClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClass_Data() {
		return (EReference)objectClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectClassOperation() {
		return objectClassOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassOperation_Objectclass() {
		return (EReference)objectClassOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectInstance() {
		return objectInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstance_InstantiatedObjectClass() {
		return (EReference)objectInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstance_ObjectAssignment() {
		return (EReference)objectInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstance_DataValueSetting() {
		return (EReference)objectInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstance_EnumValueSetting() {
		return (EReference)objectInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassReferenceProperty() {
		return classReferencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassReferenceProperty_ReferencedObjectclass() {
		return (EReference)classReferencePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOrientedViewSimulationData() {
		return objectOrientedViewSimulationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOrientedViewSimulationData_Instancedobjects() {
		return (EReference)objectOrientedViewSimulationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOrientedViewSimulationData_Objectclassdefinitions() {
		return (EReference)objectOrientedViewSimulationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrequiredDataInterface() {
		return requiredDataInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getrequiredDataInterface_Purpose() {
		return (EAttribute)requiredDataInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getrequiredDataInterface_Requireddataentry() {
		return (EReference)requiredDataInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancedObjects() {
		return instancedObjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstancedObjects_Objectinstance() {
		return (EReference)instancedObjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectClassDefinitions() {
		return objectClassDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassDefinitions_Objectclass() {
		return (EReference)objectClassDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectClassInheritance() {
		return objectClassInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassInheritance_ObjectClass() {
		return (EReference)objectClassInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassInheritance_Operationoverride() {
		return (EReference)objectClassInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationOverride() {
		return operationOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOverride_ParentClassOperation() {
		return (EReference)operationOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOverride_OverridingOperation() {
		return (EReference)operationOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationData() {
		return simulationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationData_Requireddata() {
		return (EReference)simulationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataToValueMap() {
		return dataToValueMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataToValueMap_Value() {
		return (EAttribute)dataToValueMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataToValueMap_Key() {
		return (EReference)dataToValueMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumToEnumassignmentMap() {
		return enumToEnumassignmentMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumToEnumassignmentMap_Key() {
		return (EReference)enumToEnumassignmentMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumToEnumassignmentMap_Value() {
		return (EReference)enumToEnumassignmentMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataToObjectMap() {
		return dataToObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataToObjectMap_Key() {
		return (EReference)dataToObjectMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataToObjectMap_Value() {
		return (EReference)dataToObjectMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOrientedViewRequiredEntry() {
		return objectOrientedViewRequiredEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOrientedViewRequiredEntry_RequiredObjectClass() {
		return (EReference)objectOrientedViewRequiredEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredViewRequiredEntry() {
		return unstructuredViewRequiredEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnstructuredViewRequiredEntry_Data() {
		return (EReference)unstructuredViewRequiredEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredReferenceProperty() {
		return requiredReferencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredReferenceProperty_Objectorientedviewrequiredentry() {
		return (EReference)requiredReferencePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredDataEntry() {
		return requiredDataEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationFactory getDataRepresentationFactory() {
		return (DataRepresentationFactory)getEFactoryInstance();
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
		objectClassEClass = createEClass(OBJECT_CLASS);
		createEReference(objectClassEClass, OBJECT_CLASS__OBJECTCLASSOPERATION);
		createEReference(objectClassEClass, OBJECT_CLASS__OBJECTCLASSINHERITANCE);
		createEReference(objectClassEClass, OBJECT_CLASS__DATA);

		objectClassOperationEClass = createEClass(OBJECT_CLASS_OPERATION);
		createEReference(objectClassOperationEClass, OBJECT_CLASS_OPERATION__OBJECTCLASS);

		objectInstanceEClass = createEClass(OBJECT_INSTANCE);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__OBJECT_ASSIGNMENT);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__DATA_VALUE_SETTING);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__ENUM_VALUE_SETTING);

		classReferencePropertyEClass = createEClass(CLASS_REFERENCE_PROPERTY);
		createEReference(classReferencePropertyEClass, CLASS_REFERENCE_PROPERTY__REFERENCED_OBJECTCLASS);

		objectOrientedViewSimulationDataEClass = createEClass(OBJECT_ORIENTED_VIEW_SIMULATION_DATA);
		createEReference(objectOrientedViewSimulationDataEClass, OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS);
		createEReference(objectOrientedViewSimulationDataEClass, OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS);

		requiredDataInterfaceEClass = createEClass(REQUIRED_DATA_INTERFACE);
		createEAttribute(requiredDataInterfaceEClass, REQUIRED_DATA_INTERFACE__PURPOSE);
		createEReference(requiredDataInterfaceEClass, REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY);

		instancedObjectsEClass = createEClass(INSTANCED_OBJECTS);
		createEReference(instancedObjectsEClass, INSTANCED_OBJECTS__OBJECTINSTANCE);

		objectClassDefinitionsEClass = createEClass(OBJECT_CLASS_DEFINITIONS);
		createEReference(objectClassDefinitionsEClass, OBJECT_CLASS_DEFINITIONS__OBJECTCLASS);

		objectClassInheritanceEClass = createEClass(OBJECT_CLASS_INHERITANCE);
		createEReference(objectClassInheritanceEClass, OBJECT_CLASS_INHERITANCE__OBJECT_CLASS);
		createEReference(objectClassInheritanceEClass, OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE);

		operationOverrideEClass = createEClass(OPERATION_OVERRIDE);
		createEReference(operationOverrideEClass, OPERATION_OVERRIDE__PARENT_CLASS_OPERATION);
		createEReference(operationOverrideEClass, OPERATION_OVERRIDE__OVERRIDING_OPERATION);

		simulationDataEClass = createEClass(SIMULATION_DATA);
		createEReference(simulationDataEClass, SIMULATION_DATA__REQUIREDDATA);

		dataToValueMapEClass = createEClass(DATA_TO_VALUE_MAP);
		createEAttribute(dataToValueMapEClass, DATA_TO_VALUE_MAP__VALUE);
		createEReference(dataToValueMapEClass, DATA_TO_VALUE_MAP__KEY);

		enumToEnumassignmentMapEClass = createEClass(ENUM_TO_ENUMASSIGNMENT_MAP);
		createEReference(enumToEnumassignmentMapEClass, ENUM_TO_ENUMASSIGNMENT_MAP__KEY);
		createEReference(enumToEnumassignmentMapEClass, ENUM_TO_ENUMASSIGNMENT_MAP__VALUE);

		dataToObjectMapEClass = createEClass(DATA_TO_OBJECT_MAP);
		createEReference(dataToObjectMapEClass, DATA_TO_OBJECT_MAP__KEY);
		createEReference(dataToObjectMapEClass, DATA_TO_OBJECT_MAP__VALUE);

		objectOrientedViewRequiredEntryEClass = createEClass(OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY);
		createEReference(objectOrientedViewRequiredEntryEClass, OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY__REQUIRED_OBJECT_CLASS);

		unstructuredViewRequiredEntryEClass = createEClass(UNSTRUCTURED_VIEW_REQUIRED_ENTRY);
		createEReference(unstructuredViewRequiredEntryEClass, UNSTRUCTURED_VIEW_REQUIRED_ENTRY__DATA);

		requiredReferencePropertyEClass = createEClass(REQUIRED_REFERENCE_PROPERTY);
		createEReference(requiredReferencePropertyEClass, REQUIRED_REFERENCE_PROPERTY__OBJECTORIENTEDVIEWREQUIREDENTRY);

		requiredDataEntryEClass = createEClass(REQUIRED_DATA_ENTRY);
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
		OperationModelPackage theOperationModelPackage = (OperationModelPackage)EPackage.Registry.INSTANCE.getEPackage(OperationModelPackage.eNS_URI);
		DataTypesPackage theDataTypesPackage = (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);
		DataSpecificationPackage theDataSpecificationPackage = (DataSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(DataSpecificationPackage.eNS_URI);
		ManagementServicesPackage theManagementServicesPackage = (ManagementServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ManagementServicesPackage.eNS_URI);
		AdapterServicesPackage theAdapterServicesPackage = (AdapterServicesPackage)EPackage.Registry.INSTANCE.getEPackage(AdapterServicesPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOperationModelPackage);
		getESubpackages().add(theDataTypesPackage);
		getESubpackages().add(theDataSpecificationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		objectClassEClass.getESuperTypes().add(theManagementServicesPackage.getAdditionEnhanceableEntity());
		objectClassEClass.getESuperTypes().add(theAdapterServicesPackage.getAdaptable());
		objectClassOperationEClass.getESuperTypes().add(theManagementServicesPackage.getAdditionEnhanceableEntity());
		objectClassOperationEClass.getESuperTypes().add(theOperationModelPackage.getOperation());
		objectInstanceEClass.getESuperTypes().add(theBasicPackage.getEntity());
		classReferencePropertyEClass.getESuperTypes().add(theDataSpecificationPackage.getData());
		objectOrientedViewSimulationDataEClass.getESuperTypes().add(this.getSimulationData());
		instancedObjectsEClass.getESuperTypes().add(theManagementServicesPackage.getAdditionEnhanceableEntity());
		objectOrientedViewRequiredEntryEClass.getESuperTypes().add(this.getRequiredDataEntry());
		requiredReferencePropertyEClass.getESuperTypes().add(theDataSpecificationPackage.getData());

		// Initialize classes, features, and operations; add parameters
		initEClass(objectClassEClass, ObjectClass.class, "ObjectClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectClass_Objectclassoperation(), this.getObjectClassOperation(), this.getObjectClassOperation_Objectclass(), "objectclassoperation", null, 0, -1, ObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectClass_Objectclassinheritance(), this.getObjectClassInheritance(), null, "objectclassinheritance", null, 0, 1, ObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectClass_Data(), theDataSpecificationPackage.getData(), null, "data", null, 0, -1, ObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectClassOperationEClass, ObjectClassOperation.class, "ObjectClassOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectClassOperation_Objectclass(), this.getObjectClass(), this.getObjectClass_Objectclassoperation(), "objectclass", null, 0, 1, ObjectClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectInstanceEClass, ObjectInstance.class, "ObjectInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectInstance_InstantiatedObjectClass(), this.getObjectClass(), null, "InstantiatedObjectClass", null, 1, 1, ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectInstance_ObjectAssignment(), this.getDataToObjectMap(), null, "ObjectAssignment", null, 0, -1, ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectInstance_DataValueSetting(), this.getDataToValueMap(), null, "dataValueSetting", null, 0, -1, ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectInstance_EnumValueSetting(), this.getEnumToEnumassignmentMap(), null, "enumValueSetting", null, 0, -1, ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classReferencePropertyEClass, ClassReferenceProperty.class, "ClassReferenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassReferenceProperty_ReferencedObjectclass(), this.getObjectClass(), null, "referencedObjectclass", null, 0, 1, ClassReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectOrientedViewSimulationDataEClass, ObjectOrientedViewSimulationData.class, "ObjectOrientedViewSimulationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectOrientedViewSimulationData_Instancedobjects(), this.getInstancedObjects(), null, "instancedobjects", null, 0, 1, ObjectOrientedViewSimulationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectOrientedViewSimulationData_Objectclassdefinitions(), this.getObjectClassDefinitions(), null, "objectclassdefinitions", null, 0, 1, ObjectOrientedViewSimulationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredDataInterfaceEClass, requiredDataInterface.class, "requiredDataInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getrequiredDataInterface_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, requiredDataInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getrequiredDataInterface_Requireddataentry(), this.getRequiredDataEntry(), null, "requireddataentry", null, 0, -1, requiredDataInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instancedObjectsEClass, InstancedObjects.class, "InstancedObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstancedObjects_Objectinstance(), this.getObjectInstance(), null, "objectinstance", null, 1, -1, InstancedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectClassDefinitionsEClass, ObjectClassDefinitions.class, "ObjectClassDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectClassDefinitions_Objectclass(), this.getObjectClass(), null, "objectclass", null, 1, -1, ObjectClassDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectClassInheritanceEClass, ObjectClassInheritance.class, "ObjectClassInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectClassInheritance_ObjectClass(), this.getObjectClass(), null, "objectClass", null, 1, 1, ObjectClassInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectClassInheritance_Operationoverride(), this.getOperationOverride(), null, "operationoverride", null, 0, -1, ObjectClassInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationOverrideEClass, OperationOverride.class, "OperationOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationOverride_ParentClassOperation(), this.getObjectClassOperation(), null, "parentClassOperation", null, 1, 1, OperationOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationOverride_OverridingOperation(), this.getObjectClassOperation(), null, "overridingOperation", null, 1, 1, OperationOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationDataEClass, SimulationData.class, "SimulationData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulationData_Requireddata(), this.getrequiredDataInterface(), null, "requireddata", null, 0, 1, SimulationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataToValueMapEClass, Map.Entry.class, "DataToValueMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataToValueMap_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataToValueMap_Key(), theDataSpecificationPackage.getData(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumToEnumassignmentMapEClass, Map.Entry.class, "EnumToEnumassignmentMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumToEnumassignmentMap_Key(), theDataTypesPackage.getEnumType(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumToEnumassignmentMap_Value(), theDataTypesPackage.getEnumLiteral(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataToObjectMapEClass, Map.Entry.class, "DataToObjectMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataToObjectMap_Key(), this.getClassReferenceProperty(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataToObjectMap_Value(), this.getObjectInstance(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectOrientedViewRequiredEntryEClass, ObjectOrientedViewRequiredEntry.class, "ObjectOrientedViewRequiredEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectOrientedViewRequiredEntry_RequiredObjectClass(), this.getObjectClass(), null, "requiredObjectClass", null, 1, 1, ObjectOrientedViewRequiredEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unstructuredViewRequiredEntryEClass, UnstructuredViewRequiredEntry.class, "UnstructuredViewRequiredEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnstructuredViewRequiredEntry_Data(), theDataSpecificationPackage.getData(), null, "data", null, 1, 1, UnstructuredViewRequiredEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredReferencePropertyEClass, RequiredReferenceProperty.class, "RequiredReferenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredReferenceProperty_Objectorientedviewrequiredentry(), this.getObjectOrientedViewRequiredEntry(), null, "objectorientedviewrequiredentry", null, 1, 1, RequiredReferenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredDataEntryEClass, RequiredDataEntry.class, "RequiredDataEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DataRepresentationPackageImpl
