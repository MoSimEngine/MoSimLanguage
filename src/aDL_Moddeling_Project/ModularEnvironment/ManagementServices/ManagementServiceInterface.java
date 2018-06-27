/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management Service Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface#getManagementservicefunction <em>Managementservicefunction</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementServiceInterface()
 * @model
 * @generated
 */
public interface ManagementServiceInterface extends Entity {
	/**
	 * Returns the value of the '<em><b>Managementservicefunction</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managementservicefunction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managementservicefunction</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementServiceInterface_Managementservicefunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManagementServiceFunction> getManagementservicefunction();

} // ManagementServiceInterface
