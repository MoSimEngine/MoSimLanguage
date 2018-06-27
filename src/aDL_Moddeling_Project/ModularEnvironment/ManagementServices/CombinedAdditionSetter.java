/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Addition Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter#getCombinedadditions <em>Combinedadditions</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter#getAdditionSetters <em>Addition Setters</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getCombinedAdditionSetter()
 * @model
 * @generated
 */
public interface CombinedAdditionSetter extends AdditionSetter {
	/**
	 * Returns the value of the '<em><b>Combinedadditions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combinedadditions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combinedadditions</em>' reference.
	 * @see #setCombinedadditions(CombinedAddition)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getCombinedAdditionSetter_Combinedadditions()
	 * @model required="true"
	 * @generated
	 */
	CombinedAddition getCombinedadditions();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter#getCombinedadditions <em>Combinedadditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combinedadditions</em>' reference.
	 * @see #getCombinedadditions()
	 * @generated
	 */
	void setCombinedadditions(CombinedAddition value);

	/**
	 * Returns the value of the '<em><b>Addition Setters</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition Setters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addition Setters</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getCombinedAdditionSetter_AdditionSetters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionSetter> getAdditionSetters();

} // CombinedAdditionSetter
