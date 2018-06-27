/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly;

import aDL_Moddeling_Project.ModularEnvironment.ObjectOrientedStructuredAdditionInterface;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getBasicmodsimEntity <em>Basicmodsim Entity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getConnection <em>Connection</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getInterfacerepository <em>Interfacerepository</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getObjectorientedstructuredadditioninterface <em>Objectorientedstructuredadditioninterface</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAssembly()
 * @model abstract="true"
 * @generated
 */
public interface Assembly extends BasicModSimEntity {
	/**
	 * Returns the value of the '<em><b>Basicmodsim Entity</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basicmodsim Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basicmodsim Entity</em>' reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAssembly_BasicmodsimEntity()
	 * @model
	 * @generated
	 */
	EList<BasicModSimEntity> getBasicmodsimEntity();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection}.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAssembly_Connection()
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection#getAssembly
	 * @model opposite="assembly" containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Interfacerepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacerepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacerepository</em>' reference.
	 * @see #setInterfacerepository(InterfaceRepository)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAssembly_Interfacerepository()
	 * @model
	 * @generated
	 */
	InterfaceRepository getInterfacerepository();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getInterfacerepository <em>Interfacerepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfacerepository</em>' reference.
	 * @see #getInterfacerepository()
	 * @generated
	 */
	void setInterfacerepository(InterfaceRepository value);

	/**
	 * Returns the value of the '<em><b>Objectorientedstructuredadditioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectorientedstructuredadditioninterface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectorientedstructuredadditioninterface</em>' reference.
	 * @see #setObjectorientedstructuredadditioninterface(ObjectOrientedStructuredAdditionInterface)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage#getAssembly_Objectorientedstructuredadditioninterface()
	 * @model
	 * @generated
	 */
	ObjectOrientedStructuredAdditionInterface getObjectorientedstructuredadditioninterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getObjectorientedstructuredadditioninterface <em>Objectorientedstructuredadditioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectorientedstructuredadditioninterface</em>' reference.
	 * @see #getObjectorientedstructuredadditioninterface()
	 * @generated
	 */
	void setObjectorientedstructuredadditioninterface(ObjectOrientedStructuredAdditionInterface value);

} // Assembly
