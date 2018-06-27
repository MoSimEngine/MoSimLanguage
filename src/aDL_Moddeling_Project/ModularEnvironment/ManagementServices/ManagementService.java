/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices;

import aDL_Moddeling_Project.ModularEnvironment.Coordinator;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementservice <em>Managementservice</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsefacility <em>Msefacility</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementservicesupportentity <em>Managementservicesupportentity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementserviceinterface <em>Managementserviceinterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsepropertyadditioncontainer <em>Msepropertyadditioncontainer</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementService()
 * @model
 * @generated
 */
public interface ManagementService extends Entity {
	/**
	 * Returns the value of the '<em><b>Managementservice</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managementservice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managementservice</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementService_Managementservice()
	 * @model
	 * @generated
	 */
	EList<ManagementService> getManagementservice();

	/**
	 * Returns the value of the '<em><b>Msefacility</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getManagementservice <em>Managementservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msefacility</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msefacility</em>' container reference.
	 * @see #setMsefacility(Coordinator)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementService_Msefacility()
	 * @see aDL_Moddeling_Project.ModularEnvironment.Coordinator#getManagementservice
	 * @model opposite="managementservice" transient="false"
	 * @generated
	 */
	Coordinator getMsefacility();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsefacility <em>Msefacility</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msefacility</em>' container reference.
	 * @see #getMsefacility()
	 * @generated
	 */
	void setMsefacility(Coordinator value);

	/**
	 * Returns the value of the '<em><b>Managementservicesupportentity</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceSupportEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managementservicesupportentity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managementservicesupportentity</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementService_Managementservicesupportentity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManagementServiceSupportEntity> getManagementservicesupportentity();

	/**
	 * Returns the value of the '<em><b>Managementserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managementserviceinterface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managementserviceinterface</em>' containment reference.
	 * @see #setManagementserviceinterface(ManagementServiceInterface)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementService_Managementserviceinterface()
	 * @model containment="true"
	 * @generated
	 */
	ManagementServiceInterface getManagementserviceinterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getManagementserviceinterface <em>Managementserviceinterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managementserviceinterface</em>' containment reference.
	 * @see #getManagementserviceinterface()
	 * @generated
	 */
	void setManagementserviceinterface(ManagementServiceInterface value);

	/**
	 * Returns the value of the '<em><b>Msepropertyadditioncontainer</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msepropertyadditioncontainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msepropertyadditioncontainer</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage#getManagementService_Msepropertyadditioncontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<MSEPropertyAdditionContainer> getMsepropertyadditioncontainer();

} // ManagementService
