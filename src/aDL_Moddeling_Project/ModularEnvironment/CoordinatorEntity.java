/**
 */
package aDL_Moddeling_Project.ModularEnvironment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinator Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity#getDataadditioninterface <em>Dataadditioninterface</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getCoordinatorEntity()
 * @model abstract="true"
 * @generated
 */
public interface CoordinatorEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataadditioninterface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataadditioninterface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataadditioninterface</em>' containment reference.
	 * @see #setDataadditioninterface(AdditionInterface)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage#getCoordinatorEntity_Dataadditioninterface()
	 * @model containment="true"
	 * @generated
	 */
	AdditionInterface getDataadditioninterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity#getDataadditioninterface <em>Dataadditioninterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataadditioninterface</em>' containment reference.
	 * @see #getDataadditioninterface()
	 * @generated
	 */
	void setDataadditioninterface(AdditionInterface value);

} // CoordinatorEntity
