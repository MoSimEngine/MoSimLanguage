/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Interface Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping#getRequieringinterfaceobjectclassmapping <em>Requieringinterfaceobjectclassmapping</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getRequiredInterfaceMapping()
 * @model
 * @generated
 */
public interface RequiredInterfaceMapping extends InterfaceMapping {
	/**
	 * Returns the value of the '<em><b>Requieringinterfaceobjectclassmapping</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requieringinterfaceobjectclassmapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requieringinterfaceobjectclassmapping</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getRequiredInterfaceMapping_Requieringinterfaceobjectclassmapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequieringInterfaceObjectClassMapping> getRequieringinterfaceobjectclassmapping();

} // RequiredInterfaceMapping
