/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getBaseDataType()
 * @model
 * @generated
 */
public interface BaseDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size</em>' attribute.
	 * @see #setStepSize(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getBaseDataType_StepSize()
	 * @model
	 * @generated
	 */
	String getStepSize();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getStepSize <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' attribute.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getBaseDataType_InitialValue()
	 * @model
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Primitive Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Data Type</em>' attribute.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType
	 * @see #setPrimitiveDataType(PrimitiveDataType)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getBaseDataType_PrimitiveDataType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveDataType getPrimitiveDataType();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getPrimitiveDataType <em>Primitive Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Data Type</em>' attribute.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	void setPrimitiveDataType(PrimitiveDataType value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getBaseDataType_Range()
	 * @model containment="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

} // BaseDataType
