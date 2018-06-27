/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition#getAdditionvalue <em>Additionvalue</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getSelectableAddition()
 * @model abstract="true"
 * @generated
 */
public interface SelectableAddition extends MSEPropertyAdditionContainer {
	/**
	 * Returns the value of the '<em><b>Additionvalue</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionvalue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionvalue</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getSelectableAddition_Additionvalue()
	 * @model containment="true"
	 * @generated
	 */
	EList<additionValue> getAdditionvalue();

} // SelectableAddition
