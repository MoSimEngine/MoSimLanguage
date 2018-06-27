/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

import aDL_Moddeling_Project.DataRepresentation.ObjectClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class Reference Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.ObjectClassReferenceDataType#getObjectclass <em>Objectclass</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getObjectClassReferenceDataType()
 * @model
 * @generated
 */
public interface ObjectClassReferenceDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Objectclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectclass</em>' reference.
	 * @see #setObjectclass(ObjectClass)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getObjectClassReferenceDataType_Objectclass()
	 * @model required="true"
	 * @generated
	 */
	ObjectClass getObjectclass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.ObjectClassReferenceDataType#getObjectclass <em>Objectclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectclass</em>' reference.
	 * @see #getObjectclass()
	 * @generated
	 */
	void setObjectclass(ObjectClass value);

} // ObjectClassReferenceDataType
