/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instanced Objects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.InstancedObjects#getObjectinstance <em>Objectinstance</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getInstancedObjects()
 * @model
 * @generated
 */
public interface InstancedObjects extends AdditionEnhanceableEntity {
	/**
	 * Returns the value of the '<em><b>Objectinstance</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectinstance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectinstance</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getInstancedObjects_Objectinstance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ObjectInstance> getObjectinstance();

} // InstancedObjects
