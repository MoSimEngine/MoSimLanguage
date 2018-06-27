/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Selection Addition Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter#getSelectableadditionvalue <em>Selectableadditionvalue</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter#getMultiplesettableaddition <em>Multiplesettableaddition</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getMultipleSelectionAdditionSetter()
 * @model
 * @generated
 */
public interface MultipleSelectionAdditionSetter extends AdditionSetter {
	/**
	 * Returns the value of the '<em><b>Selectableadditionvalue</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectableadditionvalue</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectableadditionvalue</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getMultipleSelectionAdditionSetter_Selectableadditionvalue()
	 * @model
	 * @generated
	 */
	EList<additionValue> getSelectableadditionvalue();

	/**
	 * Returns the value of the '<em><b>Multiplesettableaddition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplesettableaddition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplesettableaddition</em>' reference.
	 * @see #setMultiplesettableaddition(MultipleSettableAddition)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getMultipleSelectionAdditionSetter_Multiplesettableaddition()
	 * @model required="true"
	 * @generated
	 */
	MultipleSettableAddition getMultiplesettableaddition();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter#getMultiplesettableaddition <em>Multiplesettableaddition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplesettableaddition</em>' reference.
	 * @see #getMultiplesettableaddition()
	 * @generated
	 */
	void setMultiplesettableaddition(MultipleSettableAddition value);

} // MultipleSelectionAdditionSetter
