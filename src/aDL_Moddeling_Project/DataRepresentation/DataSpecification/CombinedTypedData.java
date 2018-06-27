/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.CombinedDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Typed Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.CombinedTypedData#getCombineddatatype <em>Combineddatatype</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#getCombinedTypedData()
 * @model
 * @generated
 */
public interface CombinedTypedData extends GeneralTypedData {
	/**
	 * Returns the value of the '<em><b>Combineddatatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combineddatatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combineddatatype</em>' reference.
	 * @see #setCombineddatatype(CombinedDataType)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#getCombinedTypedData_Combineddatatype()
	 * @model required="true"
	 * @generated
	 */
	CombinedDataType getCombineddatatype();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.CombinedTypedData#getCombineddatatype <em>Combineddatatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combineddatatype</em>' reference.
	 * @see #getCombineddatatype()
	 * @generated
	 */
	void setCombineddatatype(CombinedDataType value);

} // CombinedTypedData
