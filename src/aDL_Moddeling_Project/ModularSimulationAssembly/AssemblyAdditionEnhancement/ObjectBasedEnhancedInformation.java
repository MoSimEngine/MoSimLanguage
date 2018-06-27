/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Based Enhanced Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.ObjectBasedEnhancedInformation#getAdditionenchancedobjectclass <em>Additionenchancedobjectclass</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getObjectBasedEnhancedInformation()
 * @model
 * @generated
 */
public interface ObjectBasedEnhancedInformation extends AdditionEnhancedInformation {
	/**
	 * Returns the value of the '<em><b>Additionenchancedobjectclass</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionenchancedobjectclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionenchancedobjectclass</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getObjectBasedEnhancedInformation_Additionenchancedobjectclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionEnchancedObjectClass> getAdditionenchancedobjectclass();

} // ObjectBasedEnhancedInformation
