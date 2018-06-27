/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.MappableData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured View Required Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping#getMappabledata <em>Mappabledata</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getUnstructuredViewRequiredDataMapping()
 * @model
 * @generated
 */
public interface UnstructuredViewRequiredDataMapping extends RequiredDataMappingConnection {
	/**
	 * Returns the value of the '<em><b>Mappabledata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappabledata</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappabledata</em>' reference.
	 * @see #setMappabledata(MappableData)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage#getUnstructuredViewRequiredDataMapping_Mappabledata()
	 * @model required="true"
	 * @generated
	 */
	MappableData getMappabledata();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping#getMappabledata <em>Mappabledata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mappabledata</em>' reference.
	 * @see #getMappabledata()
	 * @generated
	 */
	void setMappabledata(MappableData value);

} // UnstructuredViewRequiredDataMapping
