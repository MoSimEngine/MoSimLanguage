/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management Service Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction#getPrintableDescription <em>Printable Description</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementServiceFunction()
 * @model
 * @generated
 */
public interface ManagementServiceFunction extends Operation {
	/**
	 * Returns the value of the '<em><b>Printable Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printable Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printable Description</em>' attribute.
	 * @see #setPrintableDescription(String)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementServiceFunction_PrintableDescription()
	 * @model
	 * @generated
	 */
	String getPrintableDescription();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction#getPrintableDescription <em>Printable Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printable Description</em>' attribute.
	 * @see #getPrintableDescription()
	 * @generated
	 */
	void setPrintableDescription(String value);

} // ManagementServiceFunction
