/**
 */
package aDL_Moddeling_Project.DataRepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Oriented View Simulation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData#getInstancedobjects <em>Instancedobjects</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData#getObjectclassdefinitions <em>Objectclassdefinitions</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectOrientedViewSimulationData()
 * @model
 * @generated
 */
public interface ObjectOrientedViewSimulationData extends SimulationData {
	/**
	 * Returns the value of the '<em><b>Instancedobjects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instancedobjects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instancedobjects</em>' containment reference.
	 * @see #setInstancedobjects(InstancedObjects)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectOrientedViewSimulationData_Instancedobjects()
	 * @model containment="true"
	 * @generated
	 */
	InstancedObjects getInstancedobjects();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData#getInstancedobjects <em>Instancedobjects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instancedobjects</em>' containment reference.
	 * @see #getInstancedobjects()
	 * @generated
	 */
	void setInstancedobjects(InstancedObjects value);

	/**
	 * Returns the value of the '<em><b>Objectclassdefinitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectclassdefinitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectclassdefinitions</em>' containment reference.
	 * @see #setObjectclassdefinitions(ObjectClassDefinitions)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectOrientedViewSimulationData_Objectclassdefinitions()
	 * @model containment="true"
	 * @generated
	 */
	ObjectClassDefinitions getObjectclassdefinitions();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData#getObjectclassdefinitions <em>Objectclassdefinitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectclassdefinitions</em>' containment reference.
	 * @see #getObjectclassdefinitions()
	 * @generated
	 */
	void setObjectclassdefinitions(ObjectClassDefinitions value);

} // ObjectOrientedViewSimulationData
