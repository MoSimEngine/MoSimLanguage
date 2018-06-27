/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository#getAssemblyinterface <em>Assemblyinterface</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getInterfaceRepository()
 * @model
 * @generated
 */
public interface InterfaceRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>Assemblyinterface</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assemblyinterface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblyinterface</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getInterfaceRepository_Assemblyinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyInterface> getAssemblyinterface();

} // InterfaceRepository
