/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.SimulationData#getRequireddata <em>Requireddata</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getSimulationData()
 * @model abstract="true"
 * @generated
 */
public interface SimulationData extends EObject {
	/**
	 * Returns the value of the '<em><b>Requireddata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requireddata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requireddata</em>' containment reference.
	 * @see #setRequireddata(requiredDataInterface)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getSimulationData_Requireddata()
	 * @model containment="true"
	 * @generated
	 */
	requiredDataInterface getRequireddata();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.SimulationData#getRequireddata <em>Requireddata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requireddata</em>' containment reference.
	 * @see #getRequireddata()
	 * @generated
	 */
	void setRequireddata(requiredDataInterface value);

} // SimulationData
