/**
 */
package aDL_Moddeling_Project.ModularSimulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Time Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.SimulationTimeInformation#getSimulationTimeType <em>Simulation Time Type</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimulationTimeInformation()
 * @model
 * @generated
 */
public interface SimulationTimeInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Simulation Time Type</b></em>' attribute.
	 * The literals are from the enumeration {@link aDL_Moddeling_Project.ModularSimulation.TimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Time Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Time Type</em>' attribute.
	 * @see aDL_Moddeling_Project.ModularSimulation.TimeType
	 * @see #setSimulationTimeType(TimeType)
	 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage#getSimulationTimeInformation_SimulationTimeType()
	 * @model
	 * @generated
	 */
	TimeType getSimulationTimeType();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulation.SimulationTimeInformation#getSimulationTimeType <em>Simulation Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Time Type</em>' attribute.
	 * @see aDL_Moddeling_Project.ModularSimulation.TimeType
	 * @see #getSimulationTimeType()
	 * @generated
	 */
	void setSimulationTimeType(TimeType value);

} // SimulationTimeInformation
