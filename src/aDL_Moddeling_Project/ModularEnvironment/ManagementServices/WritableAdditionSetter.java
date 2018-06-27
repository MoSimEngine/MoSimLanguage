/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writable Addition Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter#getWritableaddition <em>Writableaddition</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter#getValueContent <em>Value Content</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getWritableAdditionSetter()
 * @model
 * @generated
 */
public interface WritableAdditionSetter extends AdditionSetter {
	/**
	 * Returns the value of the '<em><b>Writableaddition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writableaddition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writableaddition</em>' reference.
	 * @see #setWritableaddition(WritableAddition)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getWritableAdditionSetter_Writableaddition()
	 * @model required="true"
	 * @generated
	 */
	WritableAddition getWritableaddition();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter#getWritableaddition <em>Writableaddition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writableaddition</em>' reference.
	 * @see #getWritableaddition()
	 * @generated
	 */
	void setWritableaddition(WritableAddition value);

	/**
	 * Returns the value of the '<em><b>Value Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Content</em>' attribute.
	 * @see #setValueContent(String)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getWritableAdditionSetter_ValueContent()
	 * @model
	 * @generated
	 */
	String getValueContent();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter#getValueContent <em>Value Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Content</em>' attribute.
	 * @see #getValueContent()
	 * @generated
	 */
	void setValueContent(String value);

} // WritableAdditionSetter
