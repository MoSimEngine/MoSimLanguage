/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral#getLiteralName <em>Literal Name</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getEnumLiteral()
 * @model
 * @generated
 */
public interface EnumLiteral extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Name</em>' attribute.
	 * @see #setLiteralName(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getEnumLiteral_LiteralName()
	 * @model required="true"
	 * @generated
	 */
	String getLiteralName();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral#getLiteralName <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Name</em>' attribute.
	 * @see #getLiteralName()
	 * @generated
	 */
	void setLiteralName(String value);

	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' attribute.
	 * @see #setLiteralValue(int)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getEnumLiteral_LiteralValue()
	 * @model required="true"
	 * @generated
	 */
	int getLiteralValue();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral#getLiteralValue <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Value</em>' attribute.
	 * @see #getLiteralValue()
	 * @generated
	 */
	void setLiteralValue(int value);

} // EnumLiteral
