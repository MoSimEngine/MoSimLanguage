/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privded Interface Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping#getProvidinginterfaceobjectclassmapping <em>Providinginterfaceobjectclassmapping</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getPrivdedInterfaceMapping()
 * @model
 * @generated
 */
public interface PrivdedInterfaceMapping extends InterfaceMapping {
	/**
	 * Returns the value of the '<em><b>Providinginterfaceobjectclassmapping</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providinginterfaceobjectclassmapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providinginterfaceobjectclassmapping</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getPrivdedInterfaceMapping_Providinginterfaceobjectclassmapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidingInterfaceObjectClassMapping> getProvidinginterfaceobjectclassmapping();

} // PrivdedInterfaceMapping
