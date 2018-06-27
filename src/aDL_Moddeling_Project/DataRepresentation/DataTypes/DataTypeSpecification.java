/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification#getDataSemantics <em>Data Semantics</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getDataTypeSpecification()
 * @model abstract="true"
 * @generated
 */
public interface DataTypeSpecification extends Entity, Adaptable {
	/**
	 * Returns the value of the '<em><b>Data Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Semantics</em>' attribute.
	 * @see #setDataSemantics(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getDataTypeSpecification_DataSemantics()
	 * @model
	 * @generated
	 */
	String getDataSemantics();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification#getDataSemantics <em>Data Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Semantics</em>' attribute.
	 * @see #getDataSemantics()
	 * @generated
	 */
	void setDataSemantics(String value);

} // DataTypeSpecification
