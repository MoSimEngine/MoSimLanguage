/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation#getObjectclass <em>Objectclass</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClassOperation()
 * @model
 * @generated
 */
public interface ObjectClassOperation extends AdditionEnhanceableEntity, Operation {
	/**
	 * Returns the value of the '<em><b>Objectclass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassoperation <em>Objectclassoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectclass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectclass</em>' container reference.
	 * @see #setObjectclass(ObjectClass)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectClassOperation_Objectclass()
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClass#getObjectclassoperation
	 * @model opposite="objectclassoperation" transient="false"
	 * @generated
	 */
	ObjectClass getObjectclass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation#getObjectclass <em>Objectclass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectclass</em>' container reference.
	 * @see #getObjectclass()
	 * @generated
	 */
	void setObjectclass(ObjectClass value);

} // ObjectClassOperation
