/**
 */
package aDL_Moddeling_Project.ModularEnvironment;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer;

import aDL_Moddeling_Project.basic.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.AdditionInterfaceDefinition#getAdditions <em>Additions</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getAdditionInterfaceDefinition()
 * @model abstract="true"
 * @generated
 */
public interface AdditionInterfaceDefinition extends Identifier {
	/**
	 * Returns the value of the '<em><b>Additions</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additions</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getAdditionInterfaceDefinition_Additions()
	 * @model
	 * @generated
	 */
	EList<MSEPropertyAdditionContainer> getAdditions();

} // AdditionInterfaceDefinition
