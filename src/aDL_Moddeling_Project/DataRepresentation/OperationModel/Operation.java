/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getOperationexecutioneffect <em>Operationexecutioneffect</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Entity, Adaptable {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Precondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperation_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Precondition> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationParameterDefinition> getParameters();

	/**
	 * Returns the value of the '<em><b>Operationexecutioneffect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationexecutioneffect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationexecutioneffect</em>' containment reference.
	 * @see #setOperationexecutioneffect(operationExecutionEffect)
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperation_Operationexecutioneffect()
	 * @model containment="true"
	 * @generated
	 */
	operationExecutionEffect getOperationexecutioneffect();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getOperationexecutioneffect <em>Operationexecutioneffect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationexecutioneffect</em>' containment reference.
	 * @see #getOperationexecutioneffect()
	 * @generated
	 */
	void setOperationexecutioneffect(operationExecutionEffect value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Postcondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperation_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Postcondition> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(DataTypeSpecification)
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperation_ReturnType()
	 * @model
	 * @generated
	 */
	DataTypeSpecification getReturnType();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataTypeSpecification value);

} // Operation
