/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getBasedatatype <em>Basedatatype</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnittypecontainer <em>Unittypecontainer</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends DataTypeSpecification {
	/**
	 * Returns the value of the '<em><b>Basedatatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basedatatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basedatatype</em>' reference.
	 * @see #setBasedatatype(BaseDataType)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getUnit_Basedatatype()
	 * @model required="true"
	 * @generated
	 */
	BaseDataType getBasedatatype();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getBasedatatype <em>Basedatatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basedatatype</em>' reference.
	 * @see #getBasedatatype()
	 * @generated
	 */
	void setBasedatatype(BaseDataType value);

	/**
	 * Returns the value of the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Symbol</em>' attribute.
	 * @see #setUnitSymbol(String)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getUnit_UnitSymbol()
	 * @model
	 * @generated
	 */
	String getUnitSymbol();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnitSymbol <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Symbol</em>' attribute.
	 * @see #getUnitSymbol()
	 * @generated
	 */
	void setUnitSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Unittypecontainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unittypecontainer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unittypecontainer</em>' container reference.
	 * @see #setUnittypecontainer(UnitTypeContainer)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getUnit_Unittypecontainer()
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer#getUnit
	 * @model opposite="unit" transient="false"
	 * @generated
	 */
	UnitTypeContainer getUnittypecontainer();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnittypecontainer <em>Unittypecontainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unittypecontainer</em>' container reference.
	 * @see #getUnittypecontainer()
	 * @generated
	 */
	void setUnittypecontainer(UnitTypeContainer value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getUnit_Range()
	 * @model containment="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

} // Unit
