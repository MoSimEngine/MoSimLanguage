/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.CombinedDataType#getCombinedDatatypeEntry <em>Combined Datatype Entry</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getCombinedDataType()
 * @model
 * @generated
 */
public interface CombinedDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Combined Datatype Entry</b></em>' reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Datatype Entry</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Datatype Entry</em>' reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getCombinedDataType_CombinedDatatypeEntry()
	 * @model lower="2"
	 * @generated
	 */
	EList<DataType> getCombinedDatatypeEntry();

} // CombinedDataType
