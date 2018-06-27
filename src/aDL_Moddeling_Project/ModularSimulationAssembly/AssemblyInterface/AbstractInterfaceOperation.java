/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Interface Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation#getAbstractparameter <em>Abstractparameter</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getAbstractInterfaceOperation()
 * @model
 * @generated
 */
public interface AbstractInterfaceOperation extends AbstractAssemblyEntity {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData
	 * @see #setReturnType(InterfaceTypedData)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getAbstractInterfaceOperation_ReturnType()
	 * @model
	 * @generated
	 */
	InterfaceTypedData getReturnType();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(InterfaceTypedData value);

	/**
	 * Returns the value of the '<em><b>Abstractparameter</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractparameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractparameter</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getAbstractInterfaceOperation_Abstractparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractParameter> getAbstractparameter();

} // AbstractInterfaceOperation
