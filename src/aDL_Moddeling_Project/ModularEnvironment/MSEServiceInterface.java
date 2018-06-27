/**
 */
package aDL_Moddeling_Project.ModularEnvironment;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSE Service Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.MSEServiceInterface#getManagementserviceinterface <em>Managementserviceinterface</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getMSEServiceInterface()
 * @model
 * @generated
 */
public interface MSEServiceInterface extends Entity {
	/**
	 * Returns the value of the '<em><b>Managementserviceinterface</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managementserviceinterface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managementserviceinterface</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getMSEServiceInterface_Managementserviceinterface()
	 * @model
	 * @generated
	 */
	EList<ManagementServiceInterface> getManagementserviceinterface();

} // MSEServiceInterface
