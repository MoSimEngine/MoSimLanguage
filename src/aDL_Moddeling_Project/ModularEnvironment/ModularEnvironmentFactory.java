/**
 */
package aDL_Moddeling_Project.ModularEnvironment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage
 * @generated
 */
public interface ModularEnvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularEnvironmentFactory eINSTANCE = aDL_Moddeling_Project.ModularEnvironment.impl.ModularEnvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinator</em>'.
	 * @generated
	 */
	Coordinator createCoordinator();

	/**
	 * Returns a new object of class '<em>MSE Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSE Service Interface</em>'.
	 * @generated
	 */
	MSEServiceInterface createMSEServiceInterface();

	/**
	 * Returns a new object of class '<em>Unstructured Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Addition Interface</em>'.
	 * @generated
	 */
	UnstructuredAdditionInterface createUnstructuredAdditionInterface();

	/**
	 * Returns a new object of class '<em>Data Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Addition Interface</em>'.
	 * @generated
	 */
	DataAdditionInterface createDataAdditionInterface();

	/**
	 * Returns a new object of class '<em>Operation Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Addition Interface</em>'.
	 * @generated
	 */
	OperationAdditionInterface createOperationAdditionInterface();

	/**
	 * Returns a new object of class '<em>Object Oriented Structured Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Oriented Structured Addition Interface</em>'.
	 * @generated
	 */
	ObjectOrientedStructuredAdditionInterface createObjectOrientedStructuredAdditionInterface();

	/**
	 * Returns a new object of class '<em>Object Class Addition Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class Addition Interface</em>'.
	 * @generated
	 */
	ObjectClassAdditionInterface createObjectClassAdditionInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModularEnvironmentPackage getModularEnvironmentPackage();

} //ModularEnvironmentFactory
