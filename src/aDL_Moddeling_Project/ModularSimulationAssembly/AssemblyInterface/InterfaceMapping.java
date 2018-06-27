/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity;

import aDL_Moddeling_Project.basic.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping#getAssembableentity <em>Assembableentity</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getInterfaceMapping()
 * @model
 * @generated
 */
public interface InterfaceMapping extends Identifier {
	/**
	 * Returns the value of the '<em><b>Assembableentity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity#getInterfacemapping <em>Interfacemapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembableentity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembableentity</em>' container reference.
	 * @see #setAssembableentity(AssembableEntity)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getInterfaceMapping_Assembableentity()
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity#getInterfacemapping
	 * @model opposite="interfacemapping" transient="false"
	 * @generated
	 */
	AssembableEntity getAssembableentity();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping#getAssembableentity <em>Assembableentity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembableentity</em>' container reference.
	 * @see #getAssembableentity()
	 * @generated
	 */
	void setAssembableentity(AssembableEntity value);

} // InterfaceMapping
