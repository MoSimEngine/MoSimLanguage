/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import aDL_Moddeling_Project.basic.BasicPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesFactory
 * @model kind="package"
 * @generated
 */
public interface AdapterServicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AdapterServices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.ManagementServices.AdapterServices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AdapterServices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdapterServicesPackage eINSTANCE = aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServiceImpl <em>Adapter Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServiceImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdapterService()
	 * @generated
	 */
	int ADAPTER_SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE__ID = ManagementServicesPackage.MANAGEMENT_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE__NAME = ManagementServicesPackage.MANAGEMENT_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE__MANAGEMENTSERVICE = ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICE;

	/**
	 * The feature id for the '<em><b>Msefacility</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE__MSEFACILITY = ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY;

	/**
	 * The feature id for the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE__MANAGEMENTSERVICESUPPORTENTITY = ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE__MANAGEMENTSERVICEINTERFACE = ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE;

	/**
	 * The feature id for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE__MSEPROPERTYADDITIONCONTAINER = ManagementServicesPackage.MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER;

	/**
	 * The feature id for the '<em><b>Adapterdescriptionattachment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT = ManagementServicesPackage.MANAGEMENT_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adapter Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE_FEATURE_COUNT = ManagementServicesPackage.MANAGEMENT_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Adapter Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_SERVICE_OPERATION_COUNT = ManagementServicesPackage.MANAGEMENT_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMigrationAdapterImpl <em>Data Migration Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMigrationAdapterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDataMigrationAdapter()
	 * @generated
	 */
	int DATA_MIGRATION_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__ID = ADAPTER_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__NAME = ADAPTER_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICE = ADAPTER_SERVICE__MANAGEMENTSERVICE;

	/**
	 * The feature id for the '<em><b>Msefacility</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__MSEFACILITY = ADAPTER_SERVICE__MSEFACILITY;

	/**
	 * The feature id for the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY = ADAPTER_SERVICE__MANAGEMENTSERVICESUPPORTENTITY;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICEINTERFACE = ADAPTER_SERVICE__MANAGEMENTSERVICEINTERFACE;

	/**
	 * The feature id for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__MSEPROPERTYADDITIONCONTAINER = ADAPTER_SERVICE__MSEPROPERTYADDITIONCONTAINER;

	/**
	 * The feature id for the '<em><b>Adapterdescriptionattachment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT = ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT;

	/**
	 * The feature id for the '<em><b>Adaptationspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION = ADAPTER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Migration Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER_FEATURE_COUNT = ADAPTER_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Migration Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIGRATION_ADAPTER_OPERATION_COUNT = ADAPTER_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.SemanticAdapterImpl <em>Semantic Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.SemanticAdapterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getSemanticAdapter()
	 * @generated
	 */
	int SEMANTIC_ADAPTER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__ID = DATA_MIGRATION_ADAPTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__NAME = DATA_MIGRATION_ADAPTER__NAME;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__MANAGEMENTSERVICE = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICE;

	/**
	 * The feature id for the '<em><b>Msefacility</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__MSEFACILITY = DATA_MIGRATION_ADAPTER__MSEFACILITY;

	/**
	 * The feature id for the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__MANAGEMENTSERVICEINTERFACE = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICEINTERFACE;

	/**
	 * The feature id for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__MSEPROPERTYADDITIONCONTAINER = DATA_MIGRATION_ADAPTER__MSEPROPERTYADDITIONCONTAINER;

	/**
	 * The feature id for the '<em><b>Adapterdescriptionattachment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT = DATA_MIGRATION_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT;

	/**
	 * The feature id for the '<em><b>Adaptationspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER__ADAPTATIONSPECIFICATION = DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION;

	/**
	 * The number of structural features of the '<em>Semantic Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER_FEATURE_COUNT = DATA_MIGRATION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Semantic Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTER_OPERATION_COUNT = DATA_MIGRATION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DescriptiveAdapterImpl <em>Descriptive Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DescriptiveAdapterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDescriptiveAdapter()
	 * @generated
	 */
	int DESCRIPTIVE_ADAPTER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__ID = DATA_MIGRATION_ADAPTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__NAME = DATA_MIGRATION_ADAPTER__NAME;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__MANAGEMENTSERVICE = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICE;

	/**
	 * The feature id for the '<em><b>Msefacility</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__MSEFACILITY = DATA_MIGRATION_ADAPTER__MSEFACILITY;

	/**
	 * The feature id for the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__MANAGEMENTSERVICEINTERFACE = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICEINTERFACE;

	/**
	 * The feature id for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__MSEPROPERTYADDITIONCONTAINER = DATA_MIGRATION_ADAPTER__MSEPROPERTYADDITIONCONTAINER;

	/**
	 * The feature id for the '<em><b>Adapterdescriptionattachment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT = DATA_MIGRATION_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT;

	/**
	 * The feature id for the '<em><b>Adaptationspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER__ADAPTATIONSPECIFICATION = DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION;

	/**
	 * The number of structural features of the '<em>Descriptive Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER_FEATURE_COUNT = DATA_MIGRATION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Descriptive Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ADAPTER_OPERATION_COUNT = DATA_MIGRATION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.StructuralAdapterImpl <em>Structural Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.StructuralAdapterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getStructuralAdapter()
	 * @generated
	 */
	int STRUCTURAL_ADAPTER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__ID = DATA_MIGRATION_ADAPTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__NAME = DATA_MIGRATION_ADAPTER__NAME;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__MANAGEMENTSERVICE = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICE;

	/**
	 * The feature id for the '<em><b>Msefacility</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__MSEFACILITY = DATA_MIGRATION_ADAPTER__MSEFACILITY;

	/**
	 * The feature id for the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__MANAGEMENTSERVICEINTERFACE = DATA_MIGRATION_ADAPTER__MANAGEMENTSERVICEINTERFACE;

	/**
	 * The feature id for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__MSEPROPERTYADDITIONCONTAINER = DATA_MIGRATION_ADAPTER__MSEPROPERTYADDITIONCONTAINER;

	/**
	 * The feature id for the '<em><b>Adapterdescriptionattachment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT = DATA_MIGRATION_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT;

	/**
	 * The feature id for the '<em><b>Adaptationspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER__ADAPTATIONSPECIFICATION = DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION;

	/**
	 * The number of structural features of the '<em>Structural Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER_FEATURE_COUNT = DATA_MIGRATION_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structural Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTER_OPERATION_COUNT = DATA_MIGRATION_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.TimeAdapterImpl <em>Time Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.TimeAdapterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getTimeAdapter()
	 * @generated
	 */
	int TIME_ADAPTER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER__ID = ADAPTER_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER__NAME = ADAPTER_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER__MANAGEMENTSERVICE = ADAPTER_SERVICE__MANAGEMENTSERVICE;

	/**
	 * The feature id for the '<em><b>Msefacility</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER__MSEFACILITY = ADAPTER_SERVICE__MSEFACILITY;

	/**
	 * The feature id for the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY = ADAPTER_SERVICE__MANAGEMENTSERVICESUPPORTENTITY;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER__MANAGEMENTSERVICEINTERFACE = ADAPTER_SERVICE__MANAGEMENTSERVICEINTERFACE;

	/**
	 * The feature id for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER__MSEPROPERTYADDITIONCONTAINER = ADAPTER_SERVICE__MSEPROPERTYADDITIONCONTAINER;

	/**
	 * The feature id for the '<em><b>Adapterdescriptionattachment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT = ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT;

	/**
	 * The number of structural features of the '<em>Time Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER_FEATURE_COUNT = ADAPTER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADAPTER_OPERATION_COUNT = ADAPTER_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.WorkloadAdapterImpl <em>Workload Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.WorkloadAdapterImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getWorkloadAdapter()
	 * @generated
	 */
	int WORKLOAD_ADAPTER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER__ID = ADAPTER_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER__NAME = ADAPTER_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Managementservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER__MANAGEMENTSERVICE = ADAPTER_SERVICE__MANAGEMENTSERVICE;

	/**
	 * The feature id for the '<em><b>Msefacility</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER__MSEFACILITY = ADAPTER_SERVICE__MSEFACILITY;

	/**
	 * The feature id for the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER__MANAGEMENTSERVICESUPPORTENTITY = ADAPTER_SERVICE__MANAGEMENTSERVICESUPPORTENTITY;

	/**
	 * The feature id for the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER__MANAGEMENTSERVICEINTERFACE = ADAPTER_SERVICE__MANAGEMENTSERVICEINTERFACE;

	/**
	 * The feature id for the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER__MSEPROPERTYADDITIONCONTAINER = ADAPTER_SERVICE__MSEPROPERTYADDITIONCONTAINER;

	/**
	 * The feature id for the '<em><b>Adapterdescriptionattachment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER__ADAPTERDESCRIPTIONATTACHMENT = ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT;

	/**
	 * The number of structural features of the '<em>Workload Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER_FEATURE_COUNT = ADAPTER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workload Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_ADAPTER_OPERATION_COUNT = ADAPTER_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationSpecificationImpl <em>Adaptation Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationSpecificationImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationSpecification()
	 * @generated
	 */
	int ADAPTATION_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SPECIFICATION__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SPECIFICATION__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Fst Entity ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SPECIFICATION__FST_ENTITY_ID = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scnd Entity ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SPECIFICATION__SCND_ENTITY_ID = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adaptation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SPECIFICATION_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Adaptation Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_SPECIFICATION_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapatationConversionImpl <em>Adapatation Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapatationConversionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdapatationConversion()
	 * @generated
	 */
	int ADAPATATION_CONVERSION = 12;

	/**
	 * The number of structural features of the '<em>Adapatation Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPATATION_CONVERSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Adapatation Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPATATION_CONVERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.MathematicalConversionImpl <em>Mathematical Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.MathematicalConversionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getMathematicalConversion()
	 * @generated
	 */
	int MATHEMATICAL_CONVERSION = 8;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATHEMATICAL_CONVERSION__TERM = ADAPATATION_CONVERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invertible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATHEMATICAL_CONVERSION__INVERTIBLE = ADAPATATION_CONVERSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mathematical Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATHEMATICAL_CONVERSION_FEATURE_COUNT = ADAPATATION_CONVERSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mathematical Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATHEMATICAL_CONVERSION_OPERATION_COUNT = ADAPATATION_CONVERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDescriptionImpl <em>Adaptation Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDescriptionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationDescription()
	 * @generated
	 */
	int ADAPTATION_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DESCRIPTION__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DESCRIPTION__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DESCRIPTION__SUB_PROPERTY = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adaptation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DESCRIPTION_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Adaptation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DESCRIPTION_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationImpl <em>Linked Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getLinkedAdaptation()
	 * @generated
	 */
	int LINKED_ADAPTATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION__ID = ADAPTATION_DESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION__NAME = ADAPTATION_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION__SUB_PROPERTY = ADAPTATION_DESCRIPTION__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>Linkedadaptationelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lowest Containing Adaptation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Highest Containing Aptation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encapsulated Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION__ENCAPSULATED_CONTAINER = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Linked Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_FEATURE_COUNT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Linked Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_OPERATION_COUNT = ADAPTATION_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationElementImpl <em>Linked Adaptation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationElementImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getLinkedAdaptationElement()
	 * @generated
	 */
	int LINKED_ADAPTATION_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_ELEMENT__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_ELEMENT__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Next Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_ELEMENT__NEXT_LINK = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linked Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_ELEMENT__LINKED_ELEMENT = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Linked Adaptation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_ELEMENT_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Linked Adaptation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_ADAPTATION_ELEMENT_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationElementLinkImpl <em>Adaptation Element Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationElementLinkImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationElementLink()
	 * @generated
	 */
	int ADAPTATION_ELEMENT_LINK = 13;

	/**
	 * The feature id for the '<em><b>Adapatationconversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION = 0;

	/**
	 * The feature id for the '<em><b>Linked Adapter Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Adaptation Element Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_ELEMENT_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Adaptation Element Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_ELEMENT_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.allToAllAdapationImpl <em>all To All Adapation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.allToAllAdapationImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getallToAllAdapation()
	 * @generated
	 */
	int ALL_TO_ALL_ADAPATION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TO_ALL_ADAPATION__ID = ADAPTATION_DESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TO_ALL_ADAPATION__NAME = ADAPTATION_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TO_ALL_ADAPATION__SUB_PROPERTY = ADAPTATION_DESCRIPTION__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>Adapatationconversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TO_ALL_ADAPATION__MEMBERS = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>all To All Adapation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TO_ALL_ADAPATION_FEATURE_COUNT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>all To All Adapation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TO_ALL_ADAPATION_OPERATION_COUNT = ADAPTATION_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.singleAdaptationImpl <em>single Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.singleAdaptationImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getsingleAdaptation()
	 * @generated
	 */
	int SINGLE_ADAPTATION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ADAPTATION__ID = ADAPTATION_DESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ADAPTATION__NAME = ADAPTATION_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ADAPTATION__SUB_PROPERTY = ADAPTATION_DESCRIPTION__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>Adapatationconversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ADAPTATION__ADAPATATIONCONVERSION = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ADAPTATION__FROM = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ADAPTATION__TO = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>single Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ADAPTATION_FEATURE_COUNT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>single Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ADAPTATION_OPERATION_COUNT = ADAPTATION_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.transformationalConversionImpl <em>transformational Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.transformationalConversionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#gettransformationalConversion()
	 * @generated
	 */
	int TRANSFORMATIONAL_CONVERSION = 16;

	/**
	 * The number of structural features of the '<em>transformational Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATIONAL_CONVERSION_FEATURE_COUNT = ADAPATATION_CONVERSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>transformational Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATIONAL_CONVERSION_OPERATION_COUNT = ADAPATATION_CONVERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.BaseConnectedAdaptationImpl <em>Base Connected Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.BaseConnectedAdaptationImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getBaseConnectedAdaptation()
	 * @generated
	 */
	int BASE_CONNECTED_ADAPTATION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONNECTED_ADAPTATION__ID = ADAPTATION_DESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONNECTED_ADAPTATION__NAME = ADAPTATION_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONNECTED_ADAPTATION__SUB_PROPERTY = ADAPTATION_DESCRIPTION__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>Derivedelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Marker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONNECTED_ADAPTATION__BASE_MARKER = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base Connected Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONNECTED_ADAPTATION_FEATURE_COUNT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Base Connected Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONNECTED_ADAPTATION_OPERATION_COUNT = ADAPTATION_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DerivedElementImpl <em>Derived Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DerivedElementImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDerivedElement()
	 * @generated
	 */
	int DERIVED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Adapatationconversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ELEMENT__ADAPATATIONCONVERSION = 0;

	/**
	 * The feature id for the '<em><b>Datamarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ELEMENT__DATAMARKER = 1;

	/**
	 * The number of structural features of the '<em>Derived Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Derived Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDefinitionRepositoryImpl <em>Adaptation Definition Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDefinitionRepositoryImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationDefinitionRepository()
	 * @generated
	 */
	int ADAPTATION_DEFINITION_REPOSITORY = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DEFINITION_REPOSITORY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DEFINITION_REPOSITORY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Adaptationdescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datamarker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adaptation Definition Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DEFINITION_REPOSITORY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Adaptation Definition Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_DEFINITION_REPOSITORY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMarkerImpl <em>Data Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMarkerImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDataMarker()
	 * @generated
	 */
	int DATA_MARKER = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MARKER__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MARKER__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MARKER__SEMANTICS = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MARKER_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MARKER_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationMarkerMappingImpl <em>Adaptation Marker Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationMarkerMappingImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationMarkerMapping()
	 * @generated
	 */
	int ADAPTATION_MARKER_MAPPING = 21;

	/**
	 * The feature id for the '<em><b>Datamarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_MARKER_MAPPING__DATAMARKER = 0;

	/**
	 * The feature id for the '<em><b>Adaptable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_MARKER_MAPPING__ADAPTABLE = 1;

	/**
	 * The feature id for the '<em><b>Adaptationdescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Adaptation Marker Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_MARKER_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Adaptation Marker Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_MARKER_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable <em>Adaptable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptable()
	 * @generated
	 */
	int ADAPTABLE = 22;

	/**
	 * The number of structural features of the '<em>Adaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Adaptable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.referenceUsingConversionImpl <em>reference Using Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.referenceUsingConversionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getreferenceUsingConversion()
	 * @generated
	 */
	int REFERENCE_USING_CONVERSION = 23;

	/**
	 * The number of structural features of the '<em>reference Using Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_USING_CONVERSION_FEATURE_COUNT = ADAPATATION_CONVERSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>reference Using Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_USING_CONVERSION_OPERATION_COUNT = ADAPATATION_CONVERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.oneMarkerToManyAdaptationImpl <em>one Marker To Many Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.oneMarkerToManyAdaptationImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getoneMarkerToManyAdaptation()
	 * @generated
	 */
	int ONE_MARKER_TO_MANY_ADAPTATION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_MARKER_TO_MANY_ADAPTATION__ID = ADAPTATION_DESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_MARKER_TO_MANY_ADAPTATION__NAME = ADAPTATION_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_MARKER_TO_MANY_ADAPTATION__SUB_PROPERTY = ADAPTATION_DESCRIPTION__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>Datamarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>one Marker To Many Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_MARKER_TO_MANY_ADAPTATION_FEATURE_COUNT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>one Marker To Many Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_MARKER_TO_MANY_ADAPTATION_OPERATION_COUNT = ADAPTATION_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataUsingAdaptationDescriptionImpl <em>Data Using Adaptation Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataUsingAdaptationDescriptionImpl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDataUsingAdaptationDescription()
	 * @generated
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION__ID = ADAPTATION_DESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION__NAME = ADAPTATION_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION__SUB_PROPERTY = ADAPTATION_DESCRIPTION__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>Adapatationconversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION__FROM = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION__TO = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstractassemblyentity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION__ABSTRACTASSEMBLYENTITY = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Using Adaptation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION_FEATURE_COUNT = ADAPTATION_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Using Adaptation Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USING_ADAPTATION_DESCRIPTION_OPERATION_COUNT = ADAPTATION_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.NewEClass27Impl <em>New EClass27</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.NewEClass27Impl
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getNewEClass27()
	 * @generated
	 */
	int NEW_ECLASS27 = 26;

	/**
	 * The number of structural features of the '<em>New EClass27</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS27_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass27</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS27_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMigrationAdapter <em>Data Migration Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Migration Adapter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMigrationAdapter
	 * @generated
	 */
	EClass getDataMigrationAdapter();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMigrationAdapter#getAdaptationspecification <em>Adaptationspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptationspecification</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMigrationAdapter#getAdaptationspecification()
	 * @see #getDataMigrationAdapter()
	 * @generated
	 */
	EReference getDataMigrationAdapter_Adaptationspecification();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.SemanticAdapter <em>Semantic Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Adapter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.SemanticAdapter
	 * @generated
	 */
	EClass getSemanticAdapter();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DescriptiveAdapter <em>Descriptive Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive Adapter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DescriptiveAdapter
	 * @generated
	 */
	EClass getDescriptiveAdapter();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.StructuralAdapter <em>Structural Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Adapter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.StructuralAdapter
	 * @generated
	 */
	EClass getStructuralAdapter();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.TimeAdapter <em>Time Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Adapter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.TimeAdapter
	 * @generated
	 */
	EClass getTimeAdapter();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.WorkloadAdapter <em>Workload Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Adapter</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.WorkloadAdapter
	 * @generated
	 */
	EClass getWorkloadAdapter();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification <em>Adaptation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Specification</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification
	 * @generated
	 */
	EClass getAdaptationSpecification();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification#getFstEntityID <em>Fst Entity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fst Entity ID</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification#getFstEntityID()
	 * @see #getAdaptationSpecification()
	 * @generated
	 */
	EReference getAdaptationSpecification_FstEntityID();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification#getScndEntityID <em>Scnd Entity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scnd Entity ID</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification#getScndEntityID()
	 * @see #getAdaptationSpecification()
	 * @generated
	 */
	EReference getAdaptationSpecification_ScndEntityID();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService <em>Adapter Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Service</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService
	 * @generated
	 */
	EClass getAdapterService();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService#getAdapterdescriptionattachment <em>Adapterdescriptionattachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adapterdescriptionattachment</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterService#getAdapterdescriptionattachment()
	 * @see #getAdapterService()
	 * @generated
	 */
	EReference getAdapterService_Adapterdescriptionattachment();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion <em>Mathematical Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mathematical Conversion</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion
	 * @generated
	 */
	EClass getMathematicalConversion();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion#getTerm()
	 * @see #getMathematicalConversion()
	 * @generated
	 */
	EAttribute getMathematicalConversion_Term();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion#isInvertible <em>Invertible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invertible</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion#isInvertible()
	 * @see #getMathematicalConversion()
	 * @generated
	 */
	EAttribute getMathematicalConversion_Invertible();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation <em>Linked Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked Adaptation</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation
	 * @generated
	 */
	EClass getLinkedAdaptation();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getLinkedadaptationelement <em>Linkedadaptationelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkedadaptationelement</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getLinkedadaptationelement()
	 * @see #getLinkedAdaptation()
	 * @generated
	 */
	EReference getLinkedAdaptation_Linkedadaptationelement();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getLowestContainingAdaptationElement <em>Lowest Containing Adaptation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lowest Containing Adaptation Element</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getLowestContainingAdaptationElement()
	 * @see #getLinkedAdaptation()
	 * @generated
	 */
	EReference getLinkedAdaptation_LowestContainingAdaptationElement();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getHighestContainingAptationElement <em>Highest Containing Aptation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Highest Containing Aptation Element</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getHighestContainingAptationElement()
	 * @see #getLinkedAdaptation()
	 * @generated
	 */
	EReference getLinkedAdaptation_HighestContainingAptationElement();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getEncapsulatedContainer <em>Encapsulated Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulated Container</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptation#getEncapsulatedContainer()
	 * @see #getLinkedAdaptation()
	 * @generated
	 */
	EReference getLinkedAdaptation_EncapsulatedContainer();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription <em>Adaptation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Description</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription
	 * @generated
	 */
	EClass getAdaptationDescription();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription#getSubProperty <em>Sub Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Property</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription#getSubProperty()
	 * @see #getAdaptationDescription()
	 * @generated
	 */
	EAttribute getAdaptationDescription_SubProperty();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement <em>Linked Adaptation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked Adaptation Element</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement
	 * @generated
	 */
	EClass getLinkedAdaptationElement();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getNextLink <em>Next Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Link</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getNextLink()
	 * @see #getLinkedAdaptationElement()
	 * @generated
	 */
	EReference getLinkedAdaptationElement_NextLink();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getPreviousLink <em>Previous Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previous Link</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getPreviousLink()
	 * @see #getLinkedAdaptationElement()
	 * @generated
	 */
	EReference getLinkedAdaptationElement_PreviousLink();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getLinkedElement <em>Linked Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Element</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.LinkedAdaptationElement#getLinkedElement()
	 * @see #getLinkedAdaptationElement()
	 * @generated
	 */
	EReference getLinkedAdaptationElement_LinkedElement();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion <em>Adapatation Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapatation Conversion</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion
	 * @generated
	 */
	EClass getAdapatationConversion();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink <em>Adaptation Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Element Link</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink
	 * @generated
	 */
	EClass getAdaptationElementLink();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink#getAdapatationconversion <em>Adapatationconversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adapatationconversion</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink#getAdapatationconversion()
	 * @see #getAdaptationElementLink()
	 * @generated
	 */
	EReference getAdaptationElementLink_Adapatationconversion();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink#getLinkedAdapterElement <em>Linked Adapter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Adapter Element</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationElementLink#getLinkedAdapterElement()
	 * @see #getAdaptationElementLink()
	 * @generated
	 */
	EReference getAdaptationElementLink_LinkedAdapterElement();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation <em>all To All Adapation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>all To All Adapation</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation
	 * @generated
	 */
	EClass getallToAllAdapation();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation#getAdapatationconversion <em>Adapatationconversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adapatationconversion</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation#getAdapatationconversion()
	 * @see #getallToAllAdapation()
	 * @generated
	 */
	EReference getallToAllAdapation_Adapatationconversion();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.allToAllAdapation#getMembers()
	 * @see #getallToAllAdapation()
	 * @generated
	 */
	EReference getallToAllAdapation_Members();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation <em>single Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>single Adaptation</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation
	 * @generated
	 */
	EClass getsingleAdaptation();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation#getAdapatationconversion <em>Adapatationconversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adapatationconversion</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation#getAdapatationconversion()
	 * @see #getsingleAdaptation()
	 * @generated
	 */
	EReference getsingleAdaptation_Adapatationconversion();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation#getFrom()
	 * @see #getsingleAdaptation()
	 * @generated
	 */
	EReference getsingleAdaptation_From();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation#getTo()
	 * @see #getsingleAdaptation()
	 * @generated
	 */
	EReference getsingleAdaptation_To();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.transformationalConversion <em>transformational Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transformational Conversion</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.transformationalConversion
	 * @generated
	 */
	EClass gettransformationalConversion();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation <em>Base Connected Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Connected Adaptation</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation
	 * @generated
	 */
	EClass getBaseConnectedAdaptation();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation#getDerivedelement <em>Derivedelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derivedelement</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation#getDerivedelement()
	 * @see #getBaseConnectedAdaptation()
	 * @generated
	 */
	EReference getBaseConnectedAdaptation_Derivedelement();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation#getBaseMarker <em>Base Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Marker</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.BaseConnectedAdaptation#getBaseMarker()
	 * @see #getBaseConnectedAdaptation()
	 * @generated
	 */
	EReference getBaseConnectedAdaptation_BaseMarker();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement <em>Derived Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Element</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement
	 * @generated
	 */
	EClass getDerivedElement();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement#getAdapatationconversion <em>Adapatationconversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adapatationconversion</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement#getAdapatationconversion()
	 * @see #getDerivedElement()
	 * @generated
	 */
	EReference getDerivedElement_Adapatationconversion();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement#getDatamarker <em>Datamarker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datamarker</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DerivedElement#getDatamarker()
	 * @see #getDerivedElement()
	 * @generated
	 */
	EReference getDerivedElement_Datamarker();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository <em>Adaptation Definition Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Definition Repository</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository
	 * @generated
	 */
	EClass getAdaptationDefinitionRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository#getAdaptationdescription <em>Adaptationdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptationdescription</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository#getAdaptationdescription()
	 * @see #getAdaptationDefinitionRepository()
	 * @generated
	 */
	EReference getAdaptationDefinitionRepository_Adaptationdescription();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository#getDatamarker <em>Datamarker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datamarker</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository#getDatamarker()
	 * @see #getAdaptationDefinitionRepository()
	 * @generated
	 */
	EReference getAdaptationDefinitionRepository_Datamarker();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker <em>Data Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Marker</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker
	 * @generated
	 */
	EClass getDataMarker();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker#getSemantics()
	 * @see #getDataMarker()
	 * @generated
	 */
	EAttribute getDataMarker_Semantics();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping <em>Adaptation Marker Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation Marker Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping
	 * @generated
	 */
	EClass getAdaptationMarkerMapping();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getDatamarker <em>Datamarker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datamarker</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getDatamarker()
	 * @see #getAdaptationMarkerMapping()
	 * @generated
	 */
	EReference getAdaptationMarkerMapping_Datamarker();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getAdaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adaptable</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getAdaptable()
	 * @see #getAdaptationMarkerMapping()
	 * @generated
	 */
	EReference getAdaptationMarkerMapping_Adaptable();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getAdaptationdescription <em>Adaptationdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptationdescription</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationMarkerMapping#getAdaptationdescription()
	 * @see #getAdaptationMarkerMapping()
	 * @generated
	 */
	EReference getAdaptationMarkerMapping_Adaptationdescription();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptable</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable
	 * @generated
	 */
	EClass getAdaptable();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.referenceUsingConversion <em>reference Using Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>reference Using Conversion</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.referenceUsingConversion
	 * @generated
	 */
	EClass getreferenceUsingConversion();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation <em>one Marker To Many Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>one Marker To Many Adaptation</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation
	 * @generated
	 */
	EClass getoneMarkerToManyAdaptation();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation#getDatamarker <em>Datamarker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datamarker</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.oneMarkerToManyAdaptation#getDatamarker()
	 * @see #getoneMarkerToManyAdaptation()
	 * @generated
	 */
	EReference getoneMarkerToManyAdaptation_Datamarker();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription <em>Data Using Adaptation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Using Adaptation Description</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription
	 * @generated
	 */
	EClass getDataUsingAdaptationDescription();

	/**
	 * Returns the meta object for the reference list '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription#getAbstractassemblyentity <em>Abstractassemblyentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstractassemblyentity</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription#getAbstractassemblyentity()
	 * @see #getDataUsingAdaptationDescription()
	 * @generated
	 */
	EReference getDataUsingAdaptationDescription_Abstractassemblyentity();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.NewEClass27 <em>New EClass27</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass27</em>'.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.NewEClass27
	 * @generated
	 */
	EClass getNewEClass27();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdapterServicesFactory getAdapterServicesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMigrationAdapterImpl <em>Data Migration Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMigrationAdapterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDataMigrationAdapter()
		 * @generated
		 */
		EClass DATA_MIGRATION_ADAPTER = eINSTANCE.getDataMigrationAdapter();

		/**
		 * The meta object literal for the '<em><b>Adaptationspecification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION = eINSTANCE.getDataMigrationAdapter_Adaptationspecification();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.SemanticAdapterImpl <em>Semantic Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.SemanticAdapterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getSemanticAdapter()
		 * @generated
		 */
		EClass SEMANTIC_ADAPTER = eINSTANCE.getSemanticAdapter();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DescriptiveAdapterImpl <em>Descriptive Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DescriptiveAdapterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDescriptiveAdapter()
		 * @generated
		 */
		EClass DESCRIPTIVE_ADAPTER = eINSTANCE.getDescriptiveAdapter();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.StructuralAdapterImpl <em>Structural Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.StructuralAdapterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getStructuralAdapter()
		 * @generated
		 */
		EClass STRUCTURAL_ADAPTER = eINSTANCE.getStructuralAdapter();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.TimeAdapterImpl <em>Time Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.TimeAdapterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getTimeAdapter()
		 * @generated
		 */
		EClass TIME_ADAPTER = eINSTANCE.getTimeAdapter();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.WorkloadAdapterImpl <em>Workload Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.WorkloadAdapterImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getWorkloadAdapter()
		 * @generated
		 */
		EClass WORKLOAD_ADAPTER = eINSTANCE.getWorkloadAdapter();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationSpecificationImpl <em>Adaptation Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationSpecificationImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationSpecification()
		 * @generated
		 */
		EClass ADAPTATION_SPECIFICATION = eINSTANCE.getAdaptationSpecification();

		/**
		 * The meta object literal for the '<em><b>Fst Entity ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_SPECIFICATION__FST_ENTITY_ID = eINSTANCE.getAdaptationSpecification_FstEntityID();

		/**
		 * The meta object literal for the '<em><b>Scnd Entity ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_SPECIFICATION__SCND_ENTITY_ID = eINSTANCE.getAdaptationSpecification_ScndEntityID();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServiceImpl <em>Adapter Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServiceImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdapterService()
		 * @generated
		 */
		EClass ADAPTER_SERVICE = eINSTANCE.getAdapterService();

		/**
		 * The meta object literal for the '<em><b>Adapterdescriptionattachment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER_SERVICE__ADAPTERDESCRIPTIONATTACHMENT = eINSTANCE.getAdapterService_Adapterdescriptionattachment();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.MathematicalConversionImpl <em>Mathematical Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.MathematicalConversionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getMathematicalConversion()
		 * @generated
		 */
		EClass MATHEMATICAL_CONVERSION = eINSTANCE.getMathematicalConversion();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATHEMATICAL_CONVERSION__TERM = eINSTANCE.getMathematicalConversion_Term();

		/**
		 * The meta object literal for the '<em><b>Invertible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATHEMATICAL_CONVERSION__INVERTIBLE = eINSTANCE.getMathematicalConversion_Invertible();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationImpl <em>Linked Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getLinkedAdaptation()
		 * @generated
		 */
		EClass LINKED_ADAPTATION = eINSTANCE.getLinkedAdaptation();

		/**
		 * The meta object literal for the '<em><b>Linkedadaptationelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_ADAPTATION__LINKEDADAPTATIONELEMENT = eINSTANCE.getLinkedAdaptation_Linkedadaptationelement();

		/**
		 * The meta object literal for the '<em><b>Lowest Containing Adaptation Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_ADAPTATION__LOWEST_CONTAINING_ADAPTATION_ELEMENT = eINSTANCE.getLinkedAdaptation_LowestContainingAdaptationElement();

		/**
		 * The meta object literal for the '<em><b>Highest Containing Aptation Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_ADAPTATION__HIGHEST_CONTAINING_APTATION_ELEMENT = eINSTANCE.getLinkedAdaptation_HighestContainingAptationElement();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_ADAPTATION__ENCAPSULATED_CONTAINER = eINSTANCE.getLinkedAdaptation_EncapsulatedContainer();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDescriptionImpl <em>Adaptation Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDescriptionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationDescription()
		 * @generated
		 */
		EClass ADAPTATION_DESCRIPTION = eINSTANCE.getAdaptationDescription();

		/**
		 * The meta object literal for the '<em><b>Sub Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTATION_DESCRIPTION__SUB_PROPERTY = eINSTANCE.getAdaptationDescription_SubProperty();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationElementImpl <em>Linked Adaptation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.LinkedAdaptationElementImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getLinkedAdaptationElement()
		 * @generated
		 */
		EClass LINKED_ADAPTATION_ELEMENT = eINSTANCE.getLinkedAdaptationElement();

		/**
		 * The meta object literal for the '<em><b>Next Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_ADAPTATION_ELEMENT__NEXT_LINK = eINSTANCE.getLinkedAdaptationElement_NextLink();

		/**
		 * The meta object literal for the '<em><b>Previous Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_ADAPTATION_ELEMENT__PREVIOUS_LINK = eINSTANCE.getLinkedAdaptationElement_PreviousLink();

		/**
		 * The meta object literal for the '<em><b>Linked Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_ADAPTATION_ELEMENT__LINKED_ELEMENT = eINSTANCE.getLinkedAdaptationElement_LinkedElement();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapatationConversionImpl <em>Adapatation Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapatationConversionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdapatationConversion()
		 * @generated
		 */
		EClass ADAPATATION_CONVERSION = eINSTANCE.getAdapatationConversion();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationElementLinkImpl <em>Adaptation Element Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationElementLinkImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationElementLink()
		 * @generated
		 */
		EClass ADAPTATION_ELEMENT_LINK = eINSTANCE.getAdaptationElementLink();

		/**
		 * The meta object literal for the '<em><b>Adapatationconversion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_ELEMENT_LINK__ADAPATATIONCONVERSION = eINSTANCE.getAdaptationElementLink_Adapatationconversion();

		/**
		 * The meta object literal for the '<em><b>Linked Adapter Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_ELEMENT_LINK__LINKED_ADAPTER_ELEMENT = eINSTANCE.getAdaptationElementLink_LinkedAdapterElement();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.allToAllAdapationImpl <em>all To All Adapation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.allToAllAdapationImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getallToAllAdapation()
		 * @generated
		 */
		EClass ALL_TO_ALL_ADAPATION = eINSTANCE.getallToAllAdapation();

		/**
		 * The meta object literal for the '<em><b>Adapatationconversion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_TO_ALL_ADAPATION__ADAPATATIONCONVERSION = eINSTANCE.getallToAllAdapation_Adapatationconversion();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_TO_ALL_ADAPATION__MEMBERS = eINSTANCE.getallToAllAdapation_Members();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.singleAdaptationImpl <em>single Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.singleAdaptationImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getsingleAdaptation()
		 * @generated
		 */
		EClass SINGLE_ADAPTATION = eINSTANCE.getsingleAdaptation();

		/**
		 * The meta object literal for the '<em><b>Adapatationconversion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ADAPTATION__ADAPATATIONCONVERSION = eINSTANCE.getsingleAdaptation_Adapatationconversion();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ADAPTATION__FROM = eINSTANCE.getsingleAdaptation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ADAPTATION__TO = eINSTANCE.getsingleAdaptation_To();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.transformationalConversionImpl <em>transformational Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.transformationalConversionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#gettransformationalConversion()
		 * @generated
		 */
		EClass TRANSFORMATIONAL_CONVERSION = eINSTANCE.gettransformationalConversion();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.BaseConnectedAdaptationImpl <em>Base Connected Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.BaseConnectedAdaptationImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getBaseConnectedAdaptation()
		 * @generated
		 */
		EClass BASE_CONNECTED_ADAPTATION = eINSTANCE.getBaseConnectedAdaptation();

		/**
		 * The meta object literal for the '<em><b>Derivedelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_CONNECTED_ADAPTATION__DERIVEDELEMENT = eINSTANCE.getBaseConnectedAdaptation_Derivedelement();

		/**
		 * The meta object literal for the '<em><b>Base Marker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_CONNECTED_ADAPTATION__BASE_MARKER = eINSTANCE.getBaseConnectedAdaptation_BaseMarker();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DerivedElementImpl <em>Derived Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DerivedElementImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDerivedElement()
		 * @generated
		 */
		EClass DERIVED_ELEMENT = eINSTANCE.getDerivedElement();

		/**
		 * The meta object literal for the '<em><b>Adapatationconversion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_ELEMENT__ADAPATATIONCONVERSION = eINSTANCE.getDerivedElement_Adapatationconversion();

		/**
		 * The meta object literal for the '<em><b>Datamarker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_ELEMENT__DATAMARKER = eINSTANCE.getDerivedElement_Datamarker();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDefinitionRepositoryImpl <em>Adaptation Definition Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDefinitionRepositoryImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationDefinitionRepository()
		 * @generated
		 */
		EClass ADAPTATION_DEFINITION_REPOSITORY = eINSTANCE.getAdaptationDefinitionRepository();

		/**
		 * The meta object literal for the '<em><b>Adaptationdescription</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION = eINSTANCE.getAdaptationDefinitionRepository_Adaptationdescription();

		/**
		 * The meta object literal for the '<em><b>Datamarker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER = eINSTANCE.getAdaptationDefinitionRepository_Datamarker();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMarkerImpl <em>Data Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMarkerImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDataMarker()
		 * @generated
		 */
		EClass DATA_MARKER = eINSTANCE.getDataMarker();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MARKER__SEMANTICS = eINSTANCE.getDataMarker_Semantics();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationMarkerMappingImpl <em>Adaptation Marker Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationMarkerMappingImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptationMarkerMapping()
		 * @generated
		 */
		EClass ADAPTATION_MARKER_MAPPING = eINSTANCE.getAdaptationMarkerMapping();

		/**
		 * The meta object literal for the '<em><b>Datamarker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_MARKER_MAPPING__DATAMARKER = eINSTANCE.getAdaptationMarkerMapping_Datamarker();

		/**
		 * The meta object literal for the '<em><b>Adaptable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_MARKER_MAPPING__ADAPTABLE = eINSTANCE.getAdaptationMarkerMapping_Adaptable();

		/**
		 * The meta object literal for the '<em><b>Adaptationdescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION_MARKER_MAPPING__ADAPTATIONDESCRIPTION = eINSTANCE.getAdaptationMarkerMapping_Adaptationdescription();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable <em>Adaptable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getAdaptable()
		 * @generated
		 */
		EClass ADAPTABLE = eINSTANCE.getAdaptable();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.referenceUsingConversionImpl <em>reference Using Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.referenceUsingConversionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getreferenceUsingConversion()
		 * @generated
		 */
		EClass REFERENCE_USING_CONVERSION = eINSTANCE.getreferenceUsingConversion();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.oneMarkerToManyAdaptationImpl <em>one Marker To Many Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.oneMarkerToManyAdaptationImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getoneMarkerToManyAdaptation()
		 * @generated
		 */
		EClass ONE_MARKER_TO_MANY_ADAPTATION = eINSTANCE.getoneMarkerToManyAdaptation();

		/**
		 * The meta object literal for the '<em><b>Datamarker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_MARKER_TO_MANY_ADAPTATION__DATAMARKER = eINSTANCE.getoneMarkerToManyAdaptation_Datamarker();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataUsingAdaptationDescriptionImpl <em>Data Using Adaptation Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataUsingAdaptationDescriptionImpl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getDataUsingAdaptationDescription()
		 * @generated
		 */
		EClass DATA_USING_ADAPTATION_DESCRIPTION = eINSTANCE.getDataUsingAdaptationDescription();

		/**
		 * The meta object literal for the '<em><b>Abstractassemblyentity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_USING_ADAPTATION_DESCRIPTION__ABSTRACTASSEMBLYENTITY = eINSTANCE.getDataUsingAdaptationDescription_Abstractassemblyentity();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.NewEClass27Impl <em>New EClass27</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.NewEClass27Impl
		 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdapterServicesPackageImpl#getNewEClass27()
		 * @generated
		 */
		EClass NEW_ECLASS27 = eINSTANCE.getNewEClass27();

	}

} //AdapterServicesPackage
