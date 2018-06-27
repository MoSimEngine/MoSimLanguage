/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.*;

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
public class ManagementServicesFactoryImpl extends EFactoryImpl implements ManagementServicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManagementServicesFactory init() {
		try {
			ManagementServicesFactory theManagementServicesFactory = (ManagementServicesFactory)EPackage.Registry.INSTANCE.getEFactory(ManagementServicesPackage.eNS_URI);
			if (theManagementServicesFactory != null) {
				return theManagementServicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ManagementServicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServicesFactoryImpl() {
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE: return createManagementService();
			case ManagementServicesPackage.MANAGEMENT_SERVICE_SUPPORT_ENTITY: return createManagementServiceSupportEntity();
			case ManagementServicesPackage.MANAGEMENT_SERVICE_FUNCTION: return createManagementServiceFunction();
			case ManagementServicesPackage.MANAGEMENT_SERVICE_INTERFACE: return createManagementServiceInterface();
			case ManagementServicesPackage.ADDITION_VALUE: return createadditionValue();
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER: return createMultipleSelectionAdditionSetter();
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER: return createExclusiveSelectionAdditionSetter();
			case ManagementServicesPackage.COMBINED_ADDITION: return createCombinedAddition();
			case ManagementServicesPackage.COMBINED_ADDITION_SETTER: return createCombinedAdditionSetter();
			case ManagementServicesPackage.EXCLUSIVE_SETTABLE_ADDITION: return createExclusiveSettableAddition();
			case ManagementServicesPackage.MULTIPLE_SETTABLE_ADDITION: return createMultipleSettableAddition();
			case ManagementServicesPackage.WRITABLE_ADDITION: return createWritableAddition();
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER: return createWritableAdditionSetter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementService createManagementService() {
		ManagementServiceImpl managementService = new ManagementServiceImpl();
		return managementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServiceSupportEntity createManagementServiceSupportEntity() {
		ManagementServiceSupportEntityImpl managementServiceSupportEntity = new ManagementServiceSupportEntityImpl();
		return managementServiceSupportEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServiceFunction createManagementServiceFunction() {
		ManagementServiceFunctionImpl managementServiceFunction = new ManagementServiceFunctionImpl();
		return managementServiceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServiceInterface createManagementServiceInterface() {
		ManagementServiceInterfaceImpl managementServiceInterface = new ManagementServiceInterfaceImpl();
		return managementServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public additionValue createadditionValue() {
		additionValueImpl additionValue = new additionValueImpl();
		return additionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSelectionAdditionSetter createMultipleSelectionAdditionSetter() {
		MultipleSelectionAdditionSetterImpl multipleSelectionAdditionSetter = new MultipleSelectionAdditionSetterImpl();
		return multipleSelectionAdditionSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveSelectionAdditionSetter createExclusiveSelectionAdditionSetter() {
		ExclusiveSelectionAdditionSetterImpl exclusiveSelectionAdditionSetter = new ExclusiveSelectionAdditionSetterImpl();
		return exclusiveSelectionAdditionSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedAddition createCombinedAddition() {
		CombinedAdditionImpl combinedAddition = new CombinedAdditionImpl();
		return combinedAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedAdditionSetter createCombinedAdditionSetter() {
		CombinedAdditionSetterImpl combinedAdditionSetter = new CombinedAdditionSetterImpl();
		return combinedAdditionSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveSettableAddition createExclusiveSettableAddition() {
		ExclusiveSettableAdditionImpl exclusiveSettableAddition = new ExclusiveSettableAdditionImpl();
		return exclusiveSettableAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSettableAddition createMultipleSettableAddition() {
		MultipleSettableAdditionImpl multipleSettableAddition = new MultipleSettableAdditionImpl();
		return multipleSettableAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritableAddition createWritableAddition() {
		WritableAdditionImpl writableAddition = new WritableAdditionImpl();
		return writableAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritableAdditionSetter createWritableAdditionSetter() {
		WritableAdditionSetterImpl writableAdditionSetter = new WritableAdditionSetterImpl();
		return writableAdditionSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServicesPackage getManagementServicesPackage() {
		return (ManagementServicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ManagementServicesPackage getPackage() {
		return ManagementServicesPackage.eINSTANCE;
	}

} //ManagementServicesFactoryImpl
