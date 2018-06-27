/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Range#getLowerBounds <em>Lower Bounds</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Range#getUpperBounds <em>Upper Bounds</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bounds</b></em>' attribute.
	 * The default value is <code>"inf"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bounds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bounds</em>' attribute.
	 * @see #setLowerBounds(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getRange_LowerBounds()
	 * @model default="inf"
	 * @generated
	 */
	String getLowerBounds();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Range#getLowerBounds <em>Lower Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bounds</em>' attribute.
	 * @see #getLowerBounds()
	 * @generated
	 */
	void setLowerBounds(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bounds</b></em>' attribute.
	 * The default value is <code>"inf"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bounds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bounds</em>' attribute.
	 * @see #setUpperBounds(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getRange_UpperBounds()
	 * @model default="inf"
	 * @generated
	 */
	String getUpperBounds();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Range#getUpperBounds <em>Upper Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bounds</em>' attribute.
	 * @see #getUpperBounds()
	 * @generated
	 */
	void setUpperBounds(String value);

} // Range
