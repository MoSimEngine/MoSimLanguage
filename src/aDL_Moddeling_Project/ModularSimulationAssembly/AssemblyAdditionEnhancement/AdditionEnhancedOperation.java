/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.OperationAdditionInterface;

import aDL_Moddeling_Project.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition Enhanced Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation#getAdditioninterface <em>Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnhancedOperation()
 * @model
 * @generated
 */
public interface AdditionEnhancedOperation extends Entity, AdditionEnhanced {
	/**
	 * Returns the value of the '<em><b>Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additioninterface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additioninterface</em>' reference.
	 * @see #setAdditioninterface(OperationAdditionInterface)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnhancedOperation_Additioninterface()
	 * @model required="true"
	 * @generated
	 */
	OperationAdditionInterface getAdditioninterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation#getAdditioninterface <em>Additioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additioninterface</em>' reference.
	 * @see #getAdditioninterface()
	 * @generated
	 */
	void setAdditioninterface(OperationAdditionInterface value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnhancedOperation_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // AdditionEnhancedOperation
