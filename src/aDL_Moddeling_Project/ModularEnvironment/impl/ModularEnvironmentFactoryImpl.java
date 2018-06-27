/**
 */
package aDL_Moddeling_Project.ModularEnvironment.impl;

import aDL_Moddeling_Project.ModularEnvironment.*;

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
public class ModularEnvironmentFactoryImpl extends EFactoryImpl implements ModularEnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModularEnvironmentFactory init() {
		try {
			ModularEnvironmentFactory theModularEnvironmentFactory = (ModularEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(ModularEnvironmentPackage.eNS_URI);
			if (theModularEnvironmentFactory != null) {
				return theModularEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModularEnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularEnvironmentFactoryImpl() {
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
			case ModularEnvironmentPackage.COORDINATOR: return createCoordinator();
			case ModularEnvironmentPackage.MSE_SERVICE_INTERFACE: return createMSEServiceInterface();
			case ModularEnvironmentPackage.UNSTRUCTURED_ADDITION_INTERFACE: return createUnstructuredAdditionInterface();
			case ModularEnvironmentPackage.DATA_ADDITION_INTERFACE: return createDataAdditionInterface();
			case ModularEnvironmentPackage.OPERATION_ADDITION_INTERFACE: return createOperationAdditionInterface();
			case ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE: return createObjectOrientedStructuredAdditionInterface();
			case ModularEnvironmentPackage.OBJECT_CLASS_ADDITION_INTERFACE: return createObjectClassAdditionInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinator createCoordinator() {
		CoordinatorImpl coordinator = new CoordinatorImpl();
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSEServiceInterface createMSEServiceInterface() {
		MSEServiceInterfaceImpl mseServiceInterface = new MSEServiceInterfaceImpl();
		return mseServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredAdditionInterface createUnstructuredAdditionInterface() {
		UnstructuredAdditionInterfaceImpl unstructuredAdditionInterface = new UnstructuredAdditionInterfaceImpl();
		return unstructuredAdditionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdditionInterface createDataAdditionInterface() {
		DataAdditionInterfaceImpl dataAdditionInterface = new DataAdditionInterfaceImpl();
		return dataAdditionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAdditionInterface createOperationAdditionInterface() {
		OperationAdditionInterfaceImpl operationAdditionInterface = new OperationAdditionInterfaceImpl();
		return operationAdditionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedStructuredAdditionInterface createObjectOrientedStructuredAdditionInterface() {
		ObjectOrientedStructuredAdditionInterfaceImpl objectOrientedStructuredAdditionInterface = new ObjectOrientedStructuredAdditionInterfaceImpl();
		return objectOrientedStructuredAdditionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassAdditionInterface createObjectClassAdditionInterface() {
		ObjectClassAdditionInterfaceImpl objectClassAdditionInterface = new ObjectClassAdditionInterfaceImpl();
		return objectClassAdditionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularEnvironmentPackage getModularEnvironmentPackage() {
		return (ModularEnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModularEnvironmentPackage getPackage() {
		return ModularEnvironmentPackage.eINSTANCE;
	}

} //ModularEnvironmentFactoryImpl
