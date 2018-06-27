/**
 */
package aDL_Moddeling_Project.ModularEnvironment;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService;

import aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.Connector;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getManagementservice <em>Managementservice</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getMseserviceinterface <em>Mseserviceinterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getConnector <em>Connector</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getDataspecificationcontainer <em>Dataspecificationcontainer</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getCoordinator()
 * @model
 * @generated
 */
public interface Coordinator extends Entity, BasicModSimEntity, CoordinatorEntity {
	/**
	 * Returns the value of the '<em><b>Managementservice</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService}.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsefacility <em>Msefacility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managementservice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managementservice</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getCoordinator_Managementservice()
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService#getMsefacility
	 * @model opposite="msefacility" containment="true"
	 * @generated
	 */
	EList<ManagementService> getManagementservice();

	/**
	 * Returns the value of the '<em><b>Mseserviceinterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mseserviceinterface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mseserviceinterface</em>' containment reference.
	 * @see #setMseserviceinterface(MSEServiceInterface)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getCoordinator_Mseserviceinterface()
	 * @model containment="true"
	 * @generated
	 */
	MSEServiceInterface getMseserviceinterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getMseserviceinterface <em>Mseserviceinterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mseserviceinterface</em>' containment reference.
	 * @see #getMseserviceinterface()
	 * @generated
	 */
	void setMseserviceinterface(MSEServiceInterface value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getCoordinator_Connector()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Dataspecificationcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataspecificationcontainer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataspecificationcontainer</em>' containment reference.
	 * @see #setDataspecificationcontainer(DataSpecificationContainer)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getCoordinator_Dataspecificationcontainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSpecificationContainer getDataspecificationcontainer();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.Coordinator#getDataspecificationcontainer <em>Dataspecificationcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataspecificationcontainer</em>' containment reference.
	 * @see #getDataspecificationcontainer()
	 * @generated
	 */
	void setDataspecificationcontainer(DataSpecificationContainer value);

} // Coordinator
