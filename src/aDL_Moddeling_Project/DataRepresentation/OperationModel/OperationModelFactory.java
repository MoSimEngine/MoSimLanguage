/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage
 * @generated
 */
public interface OperationModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationModelFactory eINSTANCE = aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>operation Execution Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operation Execution Effect</em>'.
	 * @generated
	 */
	operationExecutionEffect createoperationExecutionEffect();

	/**
	 * Returns a new object of class '<em>execution Effect On Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>execution Effect On Data</em>'.
	 * @generated
	 */
	executionEffectOnData createexecutionEffectOnData();

	/**
	 * Returns a new object of class '<em>Operation Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Parameter Definition</em>'.
	 * @generated
	 */
	OperationParameterDefinition createOperationParameterDefinition();

	/**
	 * Returns a new object of class '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition</em>'.
	 * @generated
	 */
	Precondition createPrecondition();

	/**
	 * Returns a new object of class '<em>Postcondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postcondition</em>'.
	 * @generated
	 */
	Postcondition createPostcondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationModelPackage getOperationModelPackage();

} //OperationModelFactory
