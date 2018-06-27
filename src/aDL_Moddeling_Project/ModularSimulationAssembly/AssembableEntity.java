/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity#getUsedgeneralsimulationfunction <em>Usedgeneralsimulationfunction</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity#getInterfacemapping <em>Interfacemapping</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAssembableEntity()
 * @model abstract="true"
 * @generated
 */
public interface AssembableEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Usedgeneralsimulationfunction</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usedgeneralsimulationfunction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usedgeneralsimulationfunction</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAssembableEntity_Usedgeneralsimulationfunction()
	 * @model
	 * @generated
	 */
	EList<generalSimulationFunction> getUsedgeneralsimulationfunction();

	/**
	 * Returns the value of the '<em><b>Interfacemapping</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping}.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping#getAssembableentity <em>Assembableentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacemapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacemapping</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAssembableEntity_Interfacemapping()
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping#getAssembableentity
	 * @model opposite="assembableentity" containment="true"
	 * @generated
	 */
	EList<InterfaceMapping> getInterfacemapping();

} // AssembableEntity
