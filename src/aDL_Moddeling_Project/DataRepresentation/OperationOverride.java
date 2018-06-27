/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Override</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationOverride#getParentClassOperation <em>Parent Class Operation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationOverride#getOverridingOperation <em>Overriding Operation</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getOperationOverride()
 * @model
 * @generated
 */
public interface OperationOverride extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Class Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Class Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Class Operation</em>' reference.
	 * @see #setParentClassOperation(ObjectClassOperation)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getOperationOverride_ParentClassOperation()
	 * @model required="true"
	 * @generated
	 */
	ObjectClassOperation getParentClassOperation();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationOverride#getParentClassOperation <em>Parent Class Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Class Operation</em>' reference.
	 * @see #getParentClassOperation()
	 * @generated
	 */
	void setParentClassOperation(ObjectClassOperation value);

	/**
	 * Returns the value of the '<em><b>Overriding Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overriding Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overriding Operation</em>' containment reference.
	 * @see #setOverridingOperation(ObjectClassOperation)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getOperationOverride_OverridingOperation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectClassOperation getOverridingOperation();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationOverride#getOverridingOperation <em>Overriding Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overriding Operation</em>' containment reference.
	 * @see #getOverridingOperation()
	 * @generated
	 */
	void setOverridingOperation(ObjectClassOperation value);

} // OperationOverride
