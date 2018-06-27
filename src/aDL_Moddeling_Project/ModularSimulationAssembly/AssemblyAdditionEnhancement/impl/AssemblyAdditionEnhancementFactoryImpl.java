/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.*;

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
public class AssemblyAdditionEnhancementFactoryImpl extends EFactoryImpl implements AssemblyAdditionEnhancementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssemblyAdditionEnhancementFactory init() {
		try {
			AssemblyAdditionEnhancementFactory theAssemblyAdditionEnhancementFactory = (AssemblyAdditionEnhancementFactory)EPackage.Registry.INSTANCE.getEFactory(AssemblyAdditionEnhancementPackage.eNS_URI);
			if (theAssemblyAdditionEnhancementFactory != null) {
				return theAssemblyAdditionEnhancementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssemblyAdditionEnhancementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyAdditionEnhancementFactoryImpl() {
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
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION: return createUnstructuredEnhancedInformation();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS: return createAdditionEnchancedObjectClass();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION: return createAdditionEnhancedOperation();
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED: return createOverriddenAdditionEnhanced();
			case AssemblyAdditionEnhancementPackage.OBJECT_BASED_ENHANCED_INFORMATION: return createObjectBasedEnhancedInformation();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA: return createAdditionEnhancedData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredEnhancedInformation createUnstructuredEnhancedInformation() {
		UnstructuredEnhancedInformationImpl unstructuredEnhancedInformation = new UnstructuredEnhancedInformationImpl();
		return unstructuredEnhancedInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnchancedObjectClass createAdditionEnchancedObjectClass() {
		AdditionEnchancedObjectClassImpl additionEnchancedObjectClass = new AdditionEnchancedObjectClassImpl();
		return additionEnchancedObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnhancedOperation createAdditionEnhancedOperation() {
		AdditionEnhancedOperationImpl additionEnhancedOperation = new AdditionEnhancedOperationImpl();
		return additionEnhancedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverriddenAdditionEnhanced createOverriddenAdditionEnhanced() {
		OverriddenAdditionEnhancedImpl overriddenAdditionEnhanced = new OverriddenAdditionEnhancedImpl();
		return overriddenAdditionEnhanced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectBasedEnhancedInformation createObjectBasedEnhancedInformation() {
		ObjectBasedEnhancedInformationImpl objectBasedEnhancedInformation = new ObjectBasedEnhancedInformationImpl();
		return objectBasedEnhancedInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnhancedData createAdditionEnhancedData() {
		AdditionEnhancedDataImpl additionEnhancedData = new AdditionEnhancedDataImpl();
		return additionEnhancedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyAdditionEnhancementPackage getAssemblyAdditionEnhancementPackage() {
		return (AssemblyAdditionEnhancementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssemblyAdditionEnhancementPackage getPackage() {
		return AssemblyAdditionEnhancementPackage.eINSTANCE;
	}

} //AssemblyAdditionEnhancementFactoryImpl
