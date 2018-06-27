/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationParameterDefinitionImpl#getIdentifiingName <em>Identifiing Name</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationParameterDefinitionImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationParameterDefinitionImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationParameterDefinitionImpl extends MinimalEObjectImpl.Container implements OperationParameterDefinition {
	/**
	 * The default value of the '{@link #getIdentifiingName() <em>Identifiing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiingName()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiingName() <em>Identifiing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiingName()
	 * @generated
	 * @ordered
	 */
	protected String identifiingName = IDENTIFIING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeSpecification dataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationParameterDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationModelPackage.Literals.OPERATION_PARAMETER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiingName() {
		return identifiingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiingName(String newIdentifiingName) {
		String oldIdentifiingName = identifiingName;
		identifiingName = newIdentifiingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationModelPackage.OPERATION_PARAMETER_DEFINITION__IDENTIFIING_NAME, oldIdentifiingName, identifiingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationModelPackage.OPERATION_PARAMETER_DEFINITION__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeSpecification getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataTypeSpecification)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationModelPackage.OPERATION_PARAMETER_DEFINITION__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeSpecification basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataTypeSpecification newDataType) {
		DataTypeSpecification oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationModelPackage.OPERATION_PARAMETER_DEFINITION__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__IDENTIFIING_NAME:
				return getIdentifiingName();
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__OPTIONAL:
				return isOptional();
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__IDENTIFIING_NAME:
				setIdentifiingName((String)newValue);
				return;
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__DATA_TYPE:
				setDataType((DataTypeSpecification)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__IDENTIFIING_NAME:
				setIdentifiingName(IDENTIFIING_NAME_EDEFAULT);
				return;
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__DATA_TYPE:
				setDataType((DataTypeSpecification)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__IDENTIFIING_NAME:
				return IDENTIFIING_NAME_EDEFAULT == null ? identifiingName != null : !IDENTIFIING_NAME_EDEFAULT.equals(identifiingName);
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION__DATA_TYPE:
				return dataType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifiingName: ");
		result.append(identifiingName);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //OperationParameterDefinitionImpl
