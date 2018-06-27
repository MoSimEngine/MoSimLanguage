/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Typed Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.EnumTypedData#getEnumtype <em>Enumtype</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#getEnumTypedData()
 * @model
 * @generated
 */
public interface EnumTypedData extends Data {
	/**
	 * Returns the value of the '<em><b>Enumtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumtype</em>' reference.
	 * @see #setEnumtype(EnumType)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#getEnumTypedData_Enumtype()
	 * @model required="true"
	 * @generated
	 */
	EnumType getEnumtype();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.EnumTypedData#getEnumtype <em>Enumtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumtype</em>' reference.
	 * @see #getEnumtype()
	 * @generated
	 */
	void setEnumtype(EnumType value);

} // EnumTypedData
