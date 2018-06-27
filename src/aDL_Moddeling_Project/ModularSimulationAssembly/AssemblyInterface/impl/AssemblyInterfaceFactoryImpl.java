/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AssemblyInterfaceFactoryImpl extends EFactoryImpl implements AssemblyInterfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssemblyInterfaceFactory init() {
		try {
			AssemblyInterfaceFactory theAssemblyInterfaceFactory = (AssemblyInterfaceFactory)EPackage.Registry.INSTANCE.getEFactory(AssemblyInterfacePackage.eNS_URI);
			if (theAssemblyInterfaceFactory != null) {
				return theAssemblyInterfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssemblyInterfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInterfaceFactoryImpl() {
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
			case AssemblyInterfacePackage.INTERFACE_REPOSITORY: return createInterfaceRepository();
			case AssemblyInterfacePackage.ASSEMBLY_INTERFACE: return createAssemblyInterface();
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS: return createAbstractInterfaceObjectClass();
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA: return createAbstractInterfaceData();
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION: return createAbstractInterfaceOperation();
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER: return createAbstractParameter();
			case AssemblyInterfacePackage.INTERFACE_MAPPING: return createInterfaceMapping();
			case AssemblyInterfacePackage.REQUIRED_INTERFACE_MAPPING: return createRequiredInterfaceMapping();
			case AssemblyInterfacePackage.PRIVDED_INTERFACE_MAPPING: return createPrivdedInterfaceMapping();
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING: return createProvidingInterfaceObjectClassMapping();
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING: return createRequieringInterfaceObjectClassMapping();
			case AssemblyInterfacePackage.ENHANCED_TO_INTERFACE_MAPPING: return createEnhancedToInterfaceMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AssemblyInterfacePackage.INTERFACE_TYPED_DATA:
				return createInterfaceTypedDataFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AssemblyInterfacePackage.INTERFACE_TYPED_DATA:
				return convertInterfaceTypedDataToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepository createInterfaceRepository() {
		InterfaceRepositoryImpl interfaceRepository = new InterfaceRepositoryImpl();
		return interfaceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInterface createAssemblyInterface() {
		AssemblyInterfaceImpl assemblyInterface = new AssemblyInterfaceImpl();
		return assemblyInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInterfaceObjectClass createAbstractInterfaceObjectClass() {
		AbstractInterfaceObjectClassImpl abstractInterfaceObjectClass = new AbstractInterfaceObjectClassImpl();
		return abstractInterfaceObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInterfaceData createAbstractInterfaceData() {
		AbstractInterfaceDataImpl abstractInterfaceData = new AbstractInterfaceDataImpl();
		return abstractInterfaceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInterfaceOperation createAbstractInterfaceOperation() {
		AbstractInterfaceOperationImpl abstractInterfaceOperation = new AbstractInterfaceOperationImpl();
		return abstractInterfaceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractParameter createAbstractParameter() {
		AbstractParameterImpl abstractParameter = new AbstractParameterImpl();
		return abstractParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceMapping createInterfaceMapping() {
		InterfaceMappingImpl interfaceMapping = new InterfaceMappingImpl();
		return interfaceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterfaceMapping createRequiredInterfaceMapping() {
		RequiredInterfaceMappingImpl requiredInterfaceMapping = new RequiredInterfaceMappingImpl();
		return requiredInterfaceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivdedInterfaceMapping createPrivdedInterfaceMapping() {
		PrivdedInterfaceMappingImpl privdedInterfaceMapping = new PrivdedInterfaceMappingImpl();
		return privdedInterfaceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidingInterfaceObjectClassMapping createProvidingInterfaceObjectClassMapping() {
		ProvidingInterfaceObjectClassMappingImpl providingInterfaceObjectClassMapping = new ProvidingInterfaceObjectClassMappingImpl();
		return providingInterfaceObjectClassMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequieringInterfaceObjectClassMapping createRequieringInterfaceObjectClassMapping() {
		RequieringInterfaceObjectClassMappingImpl requieringInterfaceObjectClassMapping = new RequieringInterfaceObjectClassMappingImpl();
		return requieringInterfaceObjectClassMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnhancedToInterfaceMapping createEnhancedToInterfaceMapping() {
		EnhancedToInterfaceMappingImpl enhancedToInterfaceMapping = new EnhancedToInterfaceMappingImpl();
		return enhancedToInterfaceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTypedData createInterfaceTypedDataFromString(EDataType eDataType, String initialValue) {
		InterfaceTypedData result = InterfaceTypedData.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceTypedDataToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInterfacePackage getAssemblyInterfacePackage() {
		return (AssemblyInterfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssemblyInterfacePackage getPackage() {
		return AssemblyInterfacePackage.eINSTANCE;
	}

} //AssemblyInterfaceFactoryImpl
