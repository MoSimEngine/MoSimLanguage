/**
 */
package aDL_Moddeling_Project.DataRepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Oriented View Required Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry#getRequiredObjectClass <em>Required Object Class</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectOrientedViewRequiredEntry()
 * @model
 * @generated
 */
public interface ObjectOrientedViewRequiredEntry extends RequiredDataEntry {
	/**
	 * Returns the value of the '<em><b>Required Object Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Object Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Object Class</em>' containment reference.
	 * @see #setRequiredObjectClass(ObjectClass)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectOrientedViewRequiredEntry_RequiredObjectClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectClass getRequiredObjectClass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry#getRequiredObjectClass <em>Required Object Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Object Class</em>' containment reference.
	 * @see #getRequiredObjectClass()
	 * @generated
	 */
	void setRequiredObjectClass(ObjectClass value);

} // ObjectOrientedViewRequiredEntry
