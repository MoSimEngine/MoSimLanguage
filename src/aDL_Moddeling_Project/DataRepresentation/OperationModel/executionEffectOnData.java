/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>execution Effect On Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData#getEffect <em>Effect</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getexecutionEffectOnData()
 * @model
 * @generated
 */
public interface executionEffectOnData extends EObject {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getexecutionEffectOnData_Effect()
	 * @model
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getexecutionEffectOnData_Data()
	 * @model required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // executionEffectOnData
