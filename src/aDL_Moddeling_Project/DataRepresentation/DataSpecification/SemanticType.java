/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification;

import aDL_Moddeling_Project.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType#getSemanticDescription <em>Semantic Description</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#getSemanticType()
 * @model
 * @generated
 */
public interface SemanticType extends Entity {
	/**
	 * Returns the value of the '<em><b>Semantic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Description</em>' attribute.
	 * @see #setSemanticDescription(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage#getSemanticType_SemanticDescription()
	 * @model required="true"
	 * @generated
	 */
	String getSemanticDescription();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType#getSemanticDescription <em>Semantic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Description</em>' attribute.
	 * @see #getSemanticDescription()
	 * @generated
	 */
	void setSemanticDescription(String value);

} // SemanticType
