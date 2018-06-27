/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#getIdentifiingName <em>Identifiing Name</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#isOptional <em>Optional</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperationParameterDefinition()
 * @model
 * @generated
 */
public interface OperationParameterDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiing Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiing Name</em>' attribute.
	 * @see #setIdentifiingName(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperationParameterDefinition_IdentifiingName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIdentifiingName();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#getIdentifiingName <em>Identifiing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiing Name</em>' attribute.
	 * @see #getIdentifiingName()
	 * @generated
	 */
	void setIdentifiingName(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperationParameterDefinition_Optional()
	 * @model required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataTypeSpecification)
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getOperationParameterDefinition_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataTypeSpecification getDataType();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataTypeSpecification value);

} // OperationParameterDefinition
