/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>required Data Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.requiredDataInterface#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.requiredDataInterface#getRequireddataentry <em>Requireddataentry</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getrequiredDataInterface()
 * @model
 * @generated
 */
public interface requiredDataInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getrequiredDataInterface_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.requiredDataInterface#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Requireddataentry</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.RequiredDataEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requireddataentry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requireddataentry</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getrequiredDataInterface_Requireddataentry()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredDataEntry> getRequireddataentry();

} // requiredDataInterface
