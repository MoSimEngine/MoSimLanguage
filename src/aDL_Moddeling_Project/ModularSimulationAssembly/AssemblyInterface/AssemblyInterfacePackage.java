/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import aDL_Moddeling_Project.basic.BasicPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface AssemblyInterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AssemblyInterface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.Assembly.AssemblyInterface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AssemblyInterface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyInterfacePackage eINSTANCE = aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceRepositoryImpl <em>Interface Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceRepositoryImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getInterfaceRepository()
	 * @generated
	 */
	int INTERFACE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Assemblyinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY__ASSEMBLYINTERFACE = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REPOSITORY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfaceImpl <em>Assembly Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfaceImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAssemblyInterface()
	 * @generated
	 */
	int ASSEMBLY_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INTERFACE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INTERFACE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Abstractinterfaceobjectclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assembly Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INTERFACE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assembly Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INTERFACE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractAssemblyEntityImpl <em>Abstract Assembly Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractAssemblyEntityImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractAssemblyEntity()
	 * @generated
	 */
	int ABSTRACT_ASSEMBLY_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSEMBLY_ENTITY__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSEMBLY_ENTITY__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSEMBLY_ENTITY__SEMANTICS = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Assembly Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Assembly Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSEMBLY_ENTITY_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceObjectClassImpl <em>Abstract Interface Object Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceObjectClassImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractInterfaceObjectClass()
	 * @generated
	 */
	int ABSTRACT_INTERFACE_OBJECT_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OBJECT_CLASS__ID = ABSTRACT_ASSEMBLY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OBJECT_CLASS__NAME = ABSTRACT_ASSEMBLY_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OBJECT_CLASS__SEMANTICS = ABSTRACT_ASSEMBLY_ENTITY__SEMANTICS;

	/**
	 * The feature id for the '<em><b>Abstractinterfacedata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstractinterfaceoperation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Interface Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OBJECT_CLASS_FEATURE_COUNT = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Interface Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OBJECT_CLASS_OPERATION_COUNT = ABSTRACT_ASSEMBLY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceDataImpl <em>Abstract Interface Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceDataImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractInterfaceData()
	 * @generated
	 */
	int ABSTRACT_INTERFACE_DATA = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_DATA__ID = ABSTRACT_ASSEMBLY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_DATA__NAME = ABSTRACT_ASSEMBLY_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_DATA__SEMANTICS = ABSTRACT_ASSEMBLY_ENTITY__SEMANTICS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_DATA__DATA_TYPE = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type Descriptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_DATA__DATA_TYPE_DESCRIPTIONS = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Interface Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_DATA_FEATURE_COUNT = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Interface Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_DATA_OPERATION_COUNT = ABSTRACT_ASSEMBLY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceOperationImpl <em>Abstract Interface Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceOperationImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractInterfaceOperation()
	 * @generated
	 */
	int ABSTRACT_INTERFACE_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OPERATION__ID = ABSTRACT_ASSEMBLY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OPERATION__NAME = ABSTRACT_ASSEMBLY_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OPERATION__SEMANTICS = ABSTRACT_ASSEMBLY_ENTITY__SEMANTICS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OPERATION__RETURN_TYPE = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstractparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Interface Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OPERATION_FEATURE_COUNT = ABSTRACT_ASSEMBLY_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Interface Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERFACE_OPERATION_OPERATION_COUNT = ABSTRACT_ASSEMBLY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractParameterImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractParameter()
	 * @generated
	 */
	int ABSTRACT_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__OPTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Abstract Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__ABSTRACT_PARAMETER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Abstract Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceMappingImpl <em>Interface Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getInterfaceMapping()
	 * @generated
	 */
	int INTERFACE_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MAPPING__ID = BasicPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Assembableentity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MAPPING__ASSEMBABLEENTITY = BasicPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MAPPING_FEATURE_COUNT = BasicPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_MAPPING_OPERATION_COUNT = BasicPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequiredInterfaceMappingImpl <em>Required Interface Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequiredInterfaceMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getRequiredInterfaceMapping()
	 * @generated
	 */
	int REQUIRED_INTERFACE_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_MAPPING__ID = INTERFACE_MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Assembableentity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_MAPPING__ASSEMBABLEENTITY = INTERFACE_MAPPING__ASSEMBABLEENTITY;

	/**
	 * The feature id for the '<em><b>Requieringinterfaceobjectclassmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING = INTERFACE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Interface Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_MAPPING_FEATURE_COUNT = INTERFACE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Interface Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_MAPPING_OPERATION_COUNT = INTERFACE_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.PrivdedInterfaceMappingImpl <em>Privded Interface Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.PrivdedInterfaceMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getPrivdedInterfaceMapping()
	 * @generated
	 */
	int PRIVDED_INTERFACE_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVDED_INTERFACE_MAPPING__ID = INTERFACE_MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Assembableentity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVDED_INTERFACE_MAPPING__ASSEMBABLEENTITY = INTERFACE_MAPPING__ASSEMBABLEENTITY;

	/**
	 * The feature id for the '<em><b>Providinginterfaceobjectclassmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING = INTERFACE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Privded Interface Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVDED_INTERFACE_MAPPING_FEATURE_COUNT = INTERFACE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Privded Interface Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVDED_INTERFACE_MAPPING_OPERATION_COUNT = INTERFACE_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.ProvidingInterfaceObjectClassMappingImpl <em>Providing Interface Object Class Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.ProvidingInterfaceObjectClassMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getProvidingInterfaceObjectClassMapping()
	 * @generated
	 */
	int PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Interface Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Additionenchancedobjectclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS = 1;

	/**
	 * The feature id for the '<em><b>Enhancedtointerfacemapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING = 2;

	/**
	 * The number of structural features of the '<em>Providing Interface Object Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Providing Interface Object Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequieringInterfaceObjectClassMappingImpl <em>Requiering Interface Object Class Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequieringInterfaceObjectClassMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getRequieringInterfaceObjectClassMapping()
	 * @generated
	 */
	int REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Objectorientedviewrequiredentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY = 0;

	/**
	 * The feature id for the '<em><b>Interface Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Enhancedtointerfacemapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING = 2;

	/**
	 * The number of structural features of the '<em>Requiering Interface Object Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requiering Interface Object Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.EnhancedToInterfaceMappingImpl <em>Enhanced To Interface Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.EnhancedToInterfaceMappingImpl
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getEnhancedToInterfaceMapping()
	 * @generated
	 */
	int ENHANCED_TO_INTERFACE_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Abstractassemblyentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY = 0;

	/**
	 * The feature id for the '<em><b>Additionenhanced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED = 1;

	/**
	 * The number of structural features of the '<em>Enhanced To Interface Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_TO_INTERFACE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enhanced To Interface Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_TO_INTERFACE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData <em>Interface Typed Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getInterfaceTypedData()
	 * @generated
	 */
	int INTERFACE_TYPED_DATA = 13;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository <em>Interface Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Repository</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository
	 * @generated
	 */
	EClass getInterfaceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository#getAssemblyinterface <em>Assemblyinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assemblyinterface</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository#getAssemblyinterface()
	 * @see #getInterfaceRepository()
	 * @generated
	 */
	EReference getInterfaceRepository_Assemblyinterface();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface <em>Assembly Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Interface</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface
	 * @generated
	 */
	EClass getAssemblyInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface#getAbstractinterfaceobjectclass <em>Abstractinterfaceobjectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstractinterfaceobjectclass</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface#getAbstractinterfaceobjectclass()
	 * @see #getAssemblyInterface()
	 * @generated
	 */
	EReference getAssemblyInterface_Abstractinterfaceobjectclass();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity <em>Abstract Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Assembly Entity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity
	 * @generated
	 */
	EClass getAbstractAssemblyEntity();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity#getSemantics()
	 * @see #getAbstractAssemblyEntity()
	 * @generated
	 */
	EAttribute getAbstractAssemblyEntity_Semantics();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass <em>Abstract Interface Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Interface Object Class</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass
	 * @generated
	 */
	EClass getAbstractInterfaceObjectClass();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass#getAbstractinterfacedata <em>Abstractinterfacedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstractinterfacedata</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass#getAbstractinterfacedata()
	 * @see #getAbstractInterfaceObjectClass()
	 * @generated
	 */
	EReference getAbstractInterfaceObjectClass_Abstractinterfacedata();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass#getAbstractinterfaceoperation <em>Abstractinterfaceoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstractinterfaceoperation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass#getAbstractinterfaceoperation()
	 * @see #getAbstractInterfaceObjectClass()
	 * @generated
	 */
	EReference getAbstractInterfaceObjectClass_Abstractinterfaceoperation();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData <em>Abstract Interface Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Interface Data</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData
	 * @generated
	 */
	EClass getAbstractInterfaceData();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData#getDataType()
	 * @see #getAbstractInterfaceData()
	 * @generated
	 */
	EAttribute getAbstractInterfaceData_DataType();

	/**
	 * Returns the meta object for the attribute list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData#getDataTypeDescriptions <em>Data Type Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Type Descriptions</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData#getDataTypeDescriptions()
	 * @see #getAbstractInterfaceData()
	 * @generated
	 */
	EAttribute getAbstractInterfaceData_DataTypeDescriptions();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation <em>Abstract Interface Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Interface Operation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation
	 * @generated
	 */
	EClass getAbstractInterfaceOperation();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation#getReturnType()
	 * @see #getAbstractInterfaceOperation()
	 * @generated
	 */
	EAttribute getAbstractInterfaceOperation_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation#getAbstractparameter <em>Abstractparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstractparameter</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation#getAbstractparameter()
	 * @see #getAbstractInterfaceOperation()
	 * @generated
	 */
	EReference getAbstractInterfaceOperation_Abstractparameter();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter <em>Abstract Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Parameter</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter
	 * @generated
	 */
	EClass getAbstractParameter();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter#getName()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter#isOptional()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_Optional();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter#getAbstractParameterType <em>Abstract Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Parameter Type</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter#getAbstractParameterType()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_AbstractParameterType();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping <em>Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping
	 * @generated
	 */
	EClass getInterfaceMapping();

	/**
	 * Returns the meta object for the container reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping#getAssembableentity <em>Assembableentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assembableentity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping#getAssembableentity()
	 * @see #getInterfaceMapping()
	 * @generated
	 */
	EReference getInterfaceMapping_Assembableentity();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping <em>Required Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping
	 * @generated
	 */
	EClass getRequiredInterfaceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping#getRequieringinterfaceobjectclassmapping <em>Requieringinterfaceobjectclassmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requieringinterfaceobjectclassmapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping#getRequieringinterfaceobjectclassmapping()
	 * @see #getRequiredInterfaceMapping()
	 * @generated
	 */
	EReference getRequiredInterfaceMapping_Requieringinterfaceobjectclassmapping();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping <em>Privded Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privded Interface Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping
	 * @generated
	 */
	EClass getPrivdedInterfaceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping#getProvidinginterfaceobjectclassmapping <em>Providinginterfaceobjectclassmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providinginterfaceobjectclassmapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping#getProvidinginterfaceobjectclassmapping()
	 * @see #getPrivdedInterfaceMapping()
	 * @generated
	 */
	EReference getPrivdedInterfaceMapping_Providinginterfaceobjectclassmapping();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping <em>Providing Interface Object Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Providing Interface Object Class Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping
	 * @generated
	 */
	EClass getProvidingInterfaceObjectClassMapping();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getInterfaceObjectClass <em>Interface Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Object Class</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getInterfaceObjectClass()
	 * @see #getProvidingInterfaceObjectClassMapping()
	 * @generated
	 */
	EReference getProvidingInterfaceObjectClassMapping_InterfaceObjectClass();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getAdditionenchancedobjectclass <em>Additionenchancedobjectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additionenchancedobjectclass</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getAdditionenchancedobjectclass()
	 * @see #getProvidingInterfaceObjectClassMapping()
	 * @generated
	 */
	EReference getProvidingInterfaceObjectClassMapping_Additionenchancedobjectclass();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getEnhancedtointerfacemapping <em>Enhancedtointerfacemapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enhancedtointerfacemapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getEnhancedtointerfacemapping()
	 * @see #getProvidingInterfaceObjectClassMapping()
	 * @generated
	 */
	EReference getProvidingInterfaceObjectClassMapping_Enhancedtointerfacemapping();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping <em>Requiering Interface Object Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requiering Interface Object Class Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping
	 * @generated
	 */
	EClass getRequieringInterfaceObjectClassMapping();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getObjectorientedviewrequiredentry <em>Objectorientedviewrequiredentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objectorientedviewrequiredentry</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getObjectorientedviewrequiredentry()
	 * @see #getRequieringInterfaceObjectClassMapping()
	 * @generated
	 */
	EReference getRequieringInterfaceObjectClassMapping_Objectorientedviewrequiredentry();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getInterfaceObjectClass <em>Interface Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Object Class</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getInterfaceObjectClass()
	 * @see #getRequieringInterfaceObjectClassMapping()
	 * @generated
	 */
	EReference getRequieringInterfaceObjectClassMapping_InterfaceObjectClass();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getEnhancedtointerfacemapping <em>Enhancedtointerfacemapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enhancedtointerfacemapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getEnhancedtointerfacemapping()
	 * @see #getRequieringInterfaceObjectClassMapping()
	 * @generated
	 */
	EReference getRequieringInterfaceObjectClassMapping_Enhancedtointerfacemapping();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping <em>Enhanced To Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enhanced To Interface Mapping</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping
	 * @generated
	 */
	EClass getEnhancedToInterfaceMapping();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping#getAbstractassemblyentity <em>Abstractassemblyentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstractassemblyentity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping#getAbstractassemblyentity()
	 * @see #getEnhancedToInterfaceMapping()
	 * @generated
	 */
	EReference getEnhancedToInterfaceMapping_Abstractassemblyentity();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping#getAdditionenhanced <em>Additionenhanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additionenhanced</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping#getAdditionenhanced()
	 * @see #getEnhancedToInterfaceMapping()
	 * @generated
	 */
	EReference getEnhancedToInterfaceMapping_Additionenhanced();

	/**
	 * Returns the meta object for enum '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData <em>Interface Typed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Typed Data</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData
	 * @generated
	 */
	EEnum getInterfaceTypedData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyInterfaceFactory getAssemblyInterfaceFactory();

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
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceRepositoryImpl <em>Interface Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceRepositoryImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getInterfaceRepository()
		 * @generated
		 */
		EClass INTERFACE_REPOSITORY = eINSTANCE.getInterfaceRepository();

		/**
		 * The meta object literal for the '<em><b>Assemblyinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_REPOSITORY__ASSEMBLYINTERFACE = eINSTANCE.getInterfaceRepository_Assemblyinterface();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfaceImpl <em>Assembly Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfaceImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAssemblyInterface()
		 * @generated
		 */
		EClass ASSEMBLY_INTERFACE = eINSTANCE.getAssemblyInterface();

		/**
		 * The meta object literal for the '<em><b>Abstractinterfaceobjectclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS = eINSTANCE.getAssemblyInterface_Abstractinterfaceobjectclass();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractAssemblyEntityImpl <em>Abstract Assembly Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractAssemblyEntityImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractAssemblyEntity()
		 * @generated
		 */
		EClass ABSTRACT_ASSEMBLY_ENTITY = eINSTANCE.getAbstractAssemblyEntity();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ASSEMBLY_ENTITY__SEMANTICS = eINSTANCE.getAbstractAssemblyEntity_Semantics();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceObjectClassImpl <em>Abstract Interface Object Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceObjectClassImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractInterfaceObjectClass()
		 * @generated
		 */
		EClass ABSTRACT_INTERFACE_OBJECT_CLASS = eINSTANCE.getAbstractInterfaceObjectClass();

		/**
		 * The meta object literal for the '<em><b>Abstractinterfacedata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA = eINSTANCE.getAbstractInterfaceObjectClass_Abstractinterfacedata();

		/**
		 * The meta object literal for the '<em><b>Abstractinterfaceoperation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION = eINSTANCE.getAbstractInterfaceObjectClass_Abstractinterfaceoperation();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceDataImpl <em>Abstract Interface Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceDataImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractInterfaceData()
		 * @generated
		 */
		EClass ABSTRACT_INTERFACE_DATA = eINSTANCE.getAbstractInterfaceData();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INTERFACE_DATA__DATA_TYPE = eINSTANCE.getAbstractInterfaceData_DataType();

		/**
		 * The meta object literal for the '<em><b>Data Type Descriptions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INTERFACE_DATA__DATA_TYPE_DESCRIPTIONS = eINSTANCE.getAbstractInterfaceData_DataTypeDescriptions();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceOperationImpl <em>Abstract Interface Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceOperationImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractInterfaceOperation()
		 * @generated
		 */
		EClass ABSTRACT_INTERFACE_OPERATION = eINSTANCE.getAbstractInterfaceOperation();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INTERFACE_OPERATION__RETURN_TYPE = eINSTANCE.getAbstractInterfaceOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Abstractparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER = eINSTANCE.getAbstractInterfaceOperation_Abstractparameter();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractParameterImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getAbstractParameter()
		 * @generated
		 */
		EClass ABSTRACT_PARAMETER = eINSTANCE.getAbstractParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__NAME = eINSTANCE.getAbstractParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__OPTIONAL = eINSTANCE.getAbstractParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Abstract Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__ABSTRACT_PARAMETER_TYPE = eINSTANCE.getAbstractParameter_AbstractParameterType();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceMappingImpl <em>Interface Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.InterfaceMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getInterfaceMapping()
		 * @generated
		 */
		EClass INTERFACE_MAPPING = eINSTANCE.getInterfaceMapping();

		/**
		 * The meta object literal for the '<em><b>Assembableentity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_MAPPING__ASSEMBABLEENTITY = eINSTANCE.getInterfaceMapping_Assembableentity();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequiredInterfaceMappingImpl <em>Required Interface Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequiredInterfaceMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getRequiredInterfaceMapping()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE_MAPPING = eINSTANCE.getRequiredInterfaceMapping();

		/**
		 * The meta object literal for the '<em><b>Requieringinterfaceobjectclassmapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_INTERFACE_MAPPING__REQUIERINGINTERFACEOBJECTCLASSMAPPING = eINSTANCE.getRequiredInterfaceMapping_Requieringinterfaceobjectclassmapping();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.PrivdedInterfaceMappingImpl <em>Privded Interface Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.PrivdedInterfaceMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getPrivdedInterfaceMapping()
		 * @generated
		 */
		EClass PRIVDED_INTERFACE_MAPPING = eINSTANCE.getPrivdedInterfaceMapping();

		/**
		 * The meta object literal for the '<em><b>Providinginterfaceobjectclassmapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVDED_INTERFACE_MAPPING__PROVIDINGINTERFACEOBJECTCLASSMAPPING = eINSTANCE.getPrivdedInterfaceMapping_Providinginterfaceobjectclassmapping();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.ProvidingInterfaceObjectClassMappingImpl <em>Providing Interface Object Class Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.ProvidingInterfaceObjectClassMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getProvidingInterfaceObjectClassMapping()
		 * @generated
		 */
		EClass PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING = eINSTANCE.getProvidingInterfaceObjectClassMapping();

		/**
		 * The meta object literal for the '<em><b>Interface Object Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS = eINSTANCE.getProvidingInterfaceObjectClassMapping_InterfaceObjectClass();

		/**
		 * The meta object literal for the '<em><b>Additionenchancedobjectclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS = eINSTANCE.getProvidingInterfaceObjectClassMapping_Additionenchancedobjectclass();

		/**
		 * The meta object literal for the '<em><b>Enhancedtointerfacemapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING = eINSTANCE.getProvidingInterfaceObjectClassMapping_Enhancedtointerfacemapping();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequieringInterfaceObjectClassMappingImpl <em>Requiering Interface Object Class Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequieringInterfaceObjectClassMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getRequieringInterfaceObjectClassMapping()
		 * @generated
		 */
		EClass REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING = eINSTANCE.getRequieringInterfaceObjectClassMapping();

		/**
		 * The meta object literal for the '<em><b>Objectorientedviewrequiredentry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY = eINSTANCE.getRequieringInterfaceObjectClassMapping_Objectorientedviewrequiredentry();

		/**
		 * The meta object literal for the '<em><b>Interface Object Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS = eINSTANCE.getRequieringInterfaceObjectClassMapping_InterfaceObjectClass();

		/**
		 * The meta object literal for the '<em><b>Enhancedtointerfacemapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING = eINSTANCE.getRequieringInterfaceObjectClassMapping_Enhancedtointerfacemapping();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.EnhancedToInterfaceMappingImpl <em>Enhanced To Interface Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.EnhancedToInterfaceMappingImpl
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getEnhancedToInterfaceMapping()
		 * @generated
		 */
		EClass ENHANCED_TO_INTERFACE_MAPPING = eINSTANCE.getEnhancedToInterfaceMapping();

		/**
		 * The meta object literal for the '<em><b>Abstractassemblyentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENHANCED_TO_INTERFACE_MAPPING__ABSTRACTASSEMBLYENTITY = eINSTANCE.getEnhancedToInterfaceMapping_Abstractassemblyentity();

		/**
		 * The meta object literal for the '<em><b>Additionenhanced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENHANCED_TO_INTERFACE_MAPPING__ADDITIONENHANCED = eINSTANCE.getEnhancedToInterfaceMapping_Additionenhanced();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData <em>Interface Typed Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData
		 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfacePackageImpl#getInterfaceTypedData()
		 * @generated
		 */
		EEnum INTERFACE_TYPED_DATA = eINSTANCE.getInterfaceTypedData();

	}

} //AssemblyInterfacePackage
