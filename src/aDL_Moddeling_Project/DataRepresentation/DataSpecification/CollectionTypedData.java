/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Typed Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.CollectionTypedData#getBasedatatype <em>Basedatatype</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#getCollectionTypedData()
 * @model
 * @generated
 */
public interface CollectionTypedData extends GeneralTypedData {
	/**
	 * Returns the value of the '<em><b>Basedatatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basedatatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basedatatype</em>' reference.
	 * @see #setBasedatatype(BaseDataType)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#getCollectionTypedData_Basedatatype()
	 * @model required="true"
	 * @generated
	 */
	BaseDataType getBasedatatype();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.CollectionTypedData#getBasedatatype <em>Basedatatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basedatatype</em>' reference.
	 * @see #getBasedatatype()
	 * @generated
	 */
	void setBasedatatype(BaseDataType value);

} // CollectionTypedData
