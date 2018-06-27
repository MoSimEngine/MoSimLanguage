/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive Selection Addition Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter#getSelectableadditionvalue <em>Selectableadditionvalue</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter#getExclusivesettableaddition <em>Exclusivesettableaddition</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getExclusiveSelectionAdditionSetter()
 * @model
 * @generated
 */
public interface ExclusiveSelectionAdditionSetter extends AdditionSetter {
	/**
	 * Returns the value of the '<em><b>Selectableadditionvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectableadditionvalue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectableadditionvalue</em>' reference.
	 * @see #setSelectableadditionvalue(additionValue)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getExclusiveSelectionAdditionSetter_Selectableadditionvalue()
	 * @model
	 * @generated
	 */
	additionValue getSelectableadditionvalue();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter#getSelectableadditionvalue <em>Selectableadditionvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectableadditionvalue</em>' reference.
	 * @see #getSelectableadditionvalue()
	 * @generated
	 */
	void setSelectableadditionvalue(additionValue value);

	/**
	 * Returns the value of the '<em><b>Exclusivesettableaddition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusivesettableaddition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusivesettableaddition</em>' reference.
	 * @see #setExclusivesettableaddition(ExclusiveSettableAddition)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getExclusiveSelectionAdditionSetter_Exclusivesettableaddition()
	 * @model required="true"
	 * @generated
	 */
	ExclusiveSettableAddition getExclusivesettableaddition();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter#getExclusivesettableaddition <em>Exclusivesettableaddition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusivesettableaddition</em>' reference.
	 * @see #getExclusivesettableaddition()
	 * @generated
	 */
	void setExclusivesettableaddition(ExclusiveSettableAddition value);

} // ExclusiveSelectionAdditionSetter
