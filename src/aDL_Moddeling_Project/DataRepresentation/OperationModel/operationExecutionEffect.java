/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>operation Execution Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.operationExecutionEffect#getExecutioneffectondata <em>Executioneffectondata</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getoperationExecutionEffect()
 * @model
 * @generated
 */
public interface operationExecutionEffect extends EObject {
	/**
	 * Returns the value of the '<em><b>Executioneffectondata</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executioneffectondata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executioneffectondata</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage#getoperationExecutionEffect_Executioneffectondata()
	 * @model containment="true"
	 * @generated
	 */
	EList<executionEffectOnData> getExecutioneffectondata();

} // operationExecutionEffect
