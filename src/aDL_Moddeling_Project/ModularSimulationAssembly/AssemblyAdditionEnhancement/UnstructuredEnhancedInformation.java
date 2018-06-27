/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Enhanced Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation#getAdditionenhancedoperation <em>Additionenhancedoperation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation#getAdditionenhanceddata <em>Additionenhanceddata</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getUnstructuredEnhancedInformation()
 * @model
 * @generated
 */
public interface UnstructuredEnhancedInformation extends AdditionEnhancedInformation {
	/**
	 * Returns the value of the '<em><b>Additionenhancedoperation</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionenhancedoperation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionenhancedoperation</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getUnstructuredEnhancedInformation_Additionenhancedoperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionEnhancedOperation> getAdditionenhancedoperation();

	/**
	 * Returns the value of the '<em><b>Additionenhanceddata</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionenhanceddata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionenhanceddata</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getUnstructuredEnhancedInformation_Additionenhanceddata()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionEnhancedData> getAdditionenhanceddata();

} // UnstructuredEnhancedInformation
