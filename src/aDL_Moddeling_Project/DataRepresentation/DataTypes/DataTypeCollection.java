/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeCollection#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getDataTypeCollection()
 * @model
 * @generated
 */
public interface DataTypeCollection extends DataType {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getDataTypeCollection_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeCollection#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // DataTypeCollection
