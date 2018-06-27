/**
 */
package aDL_Moddeling_Project.ModularSimulation;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer;

import aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.Connector;
import aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity;

import aDL_Moddeling_Project.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getSimmoduledescription <em>Simmoduledescription</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getBasesimulationassemblyentity <em>Basesimulationassemblyentity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getConnector <em>Connector</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getDataspecificationcontainer <em>Dataspecificationcontainer</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModule()
 * @model
 * @generated
 */
public interface SimModule extends Entity, BasicModSimEntity {
	/**
	 * Returns the value of the '<em><b>Simmoduledescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simmoduledescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simmoduledescription</em>' containment reference.
	 * @see #setSimmoduledescription(SimModuleDescription)
	 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModule_Simmoduledescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimModuleDescription getSimmoduledescription();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getSimmoduledescription <em>Simmoduledescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simmoduledescription</em>' containment reference.
	 * @see #getSimmoduledescription()
	 * @generated
	 */
	void setSimmoduledescription(SimModuleDescription value);

	/**
	 * Returns the value of the '<em><b>Basesimulationassemblyentity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getSimmodule <em>Simmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basesimulationassemblyentity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basesimulationassemblyentity</em>' reference.
	 * @see #setBasesimulationassemblyentity(SimulationAssemblyEntity)
	 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModule_Basesimulationassemblyentity()
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity#getSimmodule
	 * @model opposite="simmodule"
	 * @generated
	 */
	SimulationAssemblyEntity getBasesimulationassemblyentity();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getBasesimulationassemblyentity <em>Basesimulationassemblyentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basesimulationassemblyentity</em>' reference.
	 * @see #getBasesimulationassemblyentity()
	 * @generated
	 */
	void setBasesimulationassemblyentity(SimulationAssemblyEntity value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(Connector)
	 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModule_Connector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

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
	 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimModule_Dataspecificationcontainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSpecificationContainer getDataspecificationcontainer();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getDataspecificationcontainer <em>Dataspecificationcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataspecificationcontainer</em>' containment reference.
	 * @see #getDataspecificationcontainer()
	 * @generated
	 */
	void setDataspecificationcontainer(DataSpecificationContainer value);

} // SimModule
