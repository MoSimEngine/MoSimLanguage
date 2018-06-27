/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance#getOperationoverride <em>Operationoverride</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClassInheritance()
 * @model
 * @generated
 */
public interface ObjectClassInheritance extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class</em>' reference.
	 * @see #setObjectClass(ObjectClass)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClassInheritance_ObjectClass()
	 * @model required="true"
	 * @generated
	 */
	ObjectClass getObjectClass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance#getObjectClass <em>Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class</em>' reference.
	 * @see #getObjectClass()
	 * @generated
	 */
	void setObjectClass(ObjectClass value);

	/**
	 * Returns the value of the '<em><b>Operationoverride</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.OperationOverride}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationoverride</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationoverride</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClassInheritance_Operationoverride()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationOverride> getOperationoverride();

} // ObjectClassInheritance
