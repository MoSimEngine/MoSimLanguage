/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassoperation <em>Objectclassoperation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassinheritance <em>Objectclassinheritance</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClass()
 * @model
 * @generated
 */
public interface ObjectClass extends AdditionEnhanceableEntity, Adaptable {
	/**
	 * Returns the value of the '<em><b>Objectclassoperation</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation}.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation#getObjectclass <em>Objectclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectclassoperation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectclassoperation</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClass_Objectclassoperation()
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation#getObjectclass
	 * @model opposite="objectclass" containment="true"
	 * @generated
	 */
	EList<ObjectClassOperation> getObjectclassoperation();

	/**
	 * Returns the value of the '<em><b>Objectclassinheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectclassinheritance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectclassinheritance</em>' containment reference.
	 * @see #setObjectclassinheritance(ObjectClassInheritance)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClass_Objectclassinheritance()
	 * @model containment="true"
	 * @generated
	 */
	ObjectClassInheritance getObjectclassinheritance();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassinheritance <em>Objectclassinheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectclassinheritance</em>' containment reference.
	 * @see #getObjectclassinheritance()
	 * @generated
	 */
	void setObjectclassinheritance(ObjectClassInheritance value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClass_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // ObjectClass
