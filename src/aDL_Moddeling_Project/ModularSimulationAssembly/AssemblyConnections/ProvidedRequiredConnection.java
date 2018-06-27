/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Required Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection#getRequireddatamappingconnection <em>Requireddatamappingconnection</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getProvidedRequiredConnection()
 * @model abstract="true"
 * @generated
 */
public interface ProvidedRequiredConnection extends InterfaceProvidedRequiredConnection {
	/**
	 * Returns the value of the '<em><b>Requireddatamappingconnection</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection}.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection#getProvidedrequiredconnection <em>Providedrequiredconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requireddatamappingconnection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requireddatamappingconnection</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getProvidedRequiredConnection_Requireddatamappingconnection()
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection#getProvidedrequiredconnection
	 * @model opposite="providedrequiredconnection" containment="true"
	 * @generated
	 */
	EList<RequiredDataMappingConnection> getRequireddatamappingconnection();

} // ProvidedRequiredConnection
