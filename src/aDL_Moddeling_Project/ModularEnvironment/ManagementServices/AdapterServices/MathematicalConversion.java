/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mathematical Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion#getTerm <em>Term</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion#isInvertible <em>Invertible</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getMathematicalConversion()
 * @model
 * @generated
 */
public interface MathematicalConversion extends AdapatationConversion {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getMathematicalConversion_Term()
	 * @model required="true"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Invertible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invertible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invertible</em>' attribute.
	 * @see #setInvertible(boolean)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getMathematicalConversion_Invertible()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isInvertible();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion#isInvertible <em>Invertible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invertible</em>' attribute.
	 * @see #isInvertible()
	 * @generated
	 */
	void setInvertible(boolean value);

} // MathematicalConversion
