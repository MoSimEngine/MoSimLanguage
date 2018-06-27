/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType#getEnumliteral <em>Enumliteral</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends DataType {
	/**
	 * Returns the value of the '<em><b>Enumliteral</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumliteral</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumliteral</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getEnumType_Enumliteral()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumLiteral> getEnumliteral();

} // EnumType
