/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Reference Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty#getReferencedObjectclass <em>Referenced Objectclass</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getClassReferenceProperty()
 * @model
 * @generated
 */
public interface ClassReferenceProperty extends Data {
	/**
	 * Returns the value of the '<em><b>Referenced Objectclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Objectclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Objectclass</em>' reference.
	 * @see #setReferencedObjectclass(ObjectClass)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getClassReferenceProperty_ReferencedObjectclass()
	 * @model
	 * @generated
	 */
	ObjectClass getReferencedObjectclass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty#getReferencedObjectclass <em>Referenced Objectclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Objectclass</em>' reference.
	 * @see #getReferencedObjectclass()
	 * @generated
	 */
	void setReferencedObjectclass(ObjectClass value);

} // ClassReferenceProperty
