/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured View Required Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getUnstructuredViewRequiredEntry()
 * @model
 * @generated
 */
public interface UnstructuredViewRequiredEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Data)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getUnstructuredViewRequiredEntry_Data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // UnstructuredViewRequiredEntry
