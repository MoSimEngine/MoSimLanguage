/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.basic.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Data Mapping Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection#getProvidedrequiredconnection <em>Providedrequiredconnection</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getRequiredDataMappingConnection()
 * @model abstract="true"
 * @generated
 */
public interface RequiredDataMappingConnection extends Identifier {
	/**
	 * Returns the value of the '<em><b>Providedrequiredconnection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection#getRequireddatamappingconnection <em>Requireddatamappingconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providedrequiredconnection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedrequiredconnection</em>' container reference.
	 * @see #setProvidedrequiredconnection(ProvidedRequiredConnection)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getRequiredDataMappingConnection_Providedrequiredconnection()
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection#getRequireddatamappingconnection
	 * @model opposite="requireddatamappingconnection" required="true" transient="false"
	 * @generated
	 */
	ProvidedRequiredConnection getProvidedrequiredconnection();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection#getProvidedrequiredconnection <em>Providedrequiredconnection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providedrequiredconnection</em>' container reference.
	 * @see #getProvidedrequiredconnection()
	 * @generated
	 */
	void setProvidedrequiredconnection(ProvidedRequiredConnection value);

} // RequiredDataMappingConnection
