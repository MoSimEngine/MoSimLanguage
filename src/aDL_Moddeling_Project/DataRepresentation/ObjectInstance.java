/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getInstantiatedObjectClass <em>Instantiated Object Class</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getObjectAssignment <em>Object Assignment</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getDataValueSetting <em>Data Value Setting</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getEnumValueSetting <em>Enum Value Setting</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectInstance()
 * @model
 * @generated
 */
public interface ObjectInstance extends Entity {
	/**
	 * Returns the value of the '<em><b>Instantiated Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Object Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Object Class</em>' reference.
	 * @see #setInstantiatedObjectClass(ObjectClass)
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectInstance_InstantiatedObjectClass()
	 * @model required="true"
	 * @generated
	 */
	ObjectClass getInstantiatedObjectClass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance#getInstantiatedObjectClass <em>Instantiated Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Object Class</em>' reference.
	 * @see #getInstantiatedObjectClass()
	 * @generated
	 */
	void setInstantiatedObjectClass(ObjectClass value);

	/**
	 * Returns the value of the '<em><b>Object Assignment</b></em>' map.
	 * The key is of type {@link aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty},
	 * and the value is of type {@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Assignment</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Assignment</em>' map.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectInstance_ObjectAssignment()
	 * @model mapType="aDL_Moddeling_Project.DataRepresentation.DataToObjectMap<aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty, aDL_Moddeling_Project.DataRepresentation.ObjectInstance>"
	 * @generated
	 */
	EMap<ClassReferenceProperty, ObjectInstance> getObjectAssignment();

	/**
	 * Returns the value of the '<em><b>Data Value Setting</b></em>' map.
	 * The key is of type {@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Value Setting</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Value Setting</em>' map.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectInstance_DataValueSetting()
	 * @model mapType="aDL_Moddeling_Project.DataRepresentation.DataToValueMap<aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<Data, String> getDataValueSetting();

	/**
	 * Returns the value of the '<em><b>Enum Value Setting</b></em>' map.
	 * The key is of type {@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType},
	 * and the value is of type {@link aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Value Setting</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value Setting</em>' map.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage#getObjectInstance_EnumValueSetting()
	 * @model mapType="aDL_Moddeling_Project.DataRepresentation.EnumToEnumassignmentMap<aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType, aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral>"
	 * @generated
	 */
	EMap<EnumType, EnumLiteral> getEnumValueSetting();

} // ObjectInstance
