/**
 */
package aDL_Moddeling_Project.ModularEnvironment;

import aDL_Moddeling_Project.basic.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterface#getOperationadditioninterface <em>Operationadditioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterface#getDataadditioninterface <em>Dataadditioninterface</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getAdditionInterface()
 * @model abstract="true"
 * @generated
 */
public interface AdditionInterface extends Identifier {
	/**
	 * Returns the value of the '<em><b>Operationadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationadditioninterface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationadditioninterface</em>' containment reference.
	 * @see #setOperationadditioninterface(OperationAdditionInterface)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getAdditionInterface_Operationadditioninterface()
	 * @model containment="true"
	 * @generated
	 */
	OperationAdditionInterface getOperationadditioninterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterface#getOperationadditioninterface <em>Operationadditioninterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationadditioninterface</em>' containment reference.
	 * @see #getOperationadditioninterface()
	 * @generated
	 */
	void setOperationadditioninterface(OperationAdditionInterface value);

	/**
	 * Returns the value of the '<em><b>Dataadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataadditioninterface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataadditioninterface</em>' containment reference.
	 * @see #setDataadditioninterface(DataAdditionInterface)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getAdditionInterface_Dataadditioninterface()
	 * @model containment="true"
	 * @generated
	 */
	DataAdditionInterface getDataadditioninterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterface#getDataadditioninterface <em>Dataadditioninterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataadditioninterface</em>' containment reference.
	 * @see #getDataadditioninterface()
	 * @generated
	 */
	void setDataadditioninterface(DataAdditionInterface value);

} // AdditionInterface
