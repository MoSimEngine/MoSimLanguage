/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage
 * @generated
 */
public interface ManagementServicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManagementServicesFactory eINSTANCE = aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Service</em>'.
	 * @generated
	 */
	ManagementService createManagementService();

	/**
	 * Returns a new object of class '<em>Management Service Support Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Service Support Entity</em>'.
	 * @generated
	 */
	ManagementServiceSupportEntity createManagementServiceSupportEntity();

	/**
	 * Returns a new object of class '<em>Management Service Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Service Function</em>'.
	 * @generated
	 */
	ManagementServiceFunction createManagementServiceFunction();

	/**
	 * Returns a new object of class '<em>Management Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Service Interface</em>'.
	 * @generated
	 */
	ManagementServiceInterface createManagementServiceInterface();

	/**
	 * Returns a new object of class '<em>addition Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>addition Value</em>'.
	 * @generated
	 */
	additionValue createadditionValue();

	/**
	 * Returns a new object of class '<em>Multiple Selection Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Selection Addition Setter</em>'.
	 * @generated
	 */
	MultipleSelectionAdditionSetter createMultipleSelectionAdditionSetter();

	/**
	 * Returns a new object of class '<em>Exclusive Selection Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Selection Addition Setter</em>'.
	 * @generated
	 */
	ExclusiveSelectionAdditionSetter createExclusiveSelectionAdditionSetter();

	/**
	 * Returns a new object of class '<em>Combined Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Addition</em>'.
	 * @generated
	 */
	CombinedAddition createCombinedAddition();

	/**
	 * Returns a new object of class '<em>Combined Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Addition Setter</em>'.
	 * @generated
	 */
	CombinedAdditionSetter createCombinedAdditionSetter();

	/**
	 * Returns a new object of class '<em>Exclusive Settable Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Settable Addition</em>'.
	 * @generated
	 */
	ExclusiveSettableAddition createExclusiveSettableAddition();

	/**
	 * Returns a new object of class '<em>Multiple Settable Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Settable Addition</em>'.
	 * @generated
	 */
	MultipleSettableAddition createMultipleSettableAddition();

	/**
	 * Returns a new object of class '<em>Writable Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writable Addition</em>'.
	 * @generated
	 */
	WritableAddition createWritableAddition();

	/**
	 * Returns a new object of class '<em>Writable Addition Setter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writable Addition Setter</em>'.
	 * @generated
	 */
	WritableAdditionSetter createWritableAdditionSetter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ManagementServicesPackage getManagementServicesPackage();

} //ManagementServicesFactory
