/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.ModularSimulationAssembly.Assembly;

import aDL_Moddeling_Project.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection#getAssembly <em>Assembly</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends Entity {
	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' container reference.
	 * @see #setAssembly(Assembly)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getConnection_Assembly()
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Assembly#getConnection
	 * @model opposite="connection" required="true" transient="false"
	 * @generated
	 */
	Assembly getAssembly();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection#getAssembly <em>Assembly</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly</em>' container reference.
	 * @see #getAssembly()
	 * @generated
	 */
	void setAssembly(Assembly value);

} // Connection
