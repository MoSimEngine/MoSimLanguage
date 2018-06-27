/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions#getObjectclass <em>Objectclass</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClassDefinitions()
 * @model
 * @generated
 */
public interface ObjectClassDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Objectclass</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.ObjectClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectclass</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClassDefinitions_Objectclass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ObjectClass> getObjectclass();

} // ObjectClassDefinitions
