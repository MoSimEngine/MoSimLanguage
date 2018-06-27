/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Interface Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceDataImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceDataImpl#getDataTypeDescriptions <em>Data Type Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractInterfaceDataImpl extends AbstractAssemblyEntityImpl implements AbstractInterfaceData {
	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceTypedData DATA_TYPE_EDEFAULT = InterfaceTypedData.NUMERICAL;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceTypedData dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataTypeDescriptions() <em>Data Type Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataTypeDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInterfaceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.ABSTRACT_INTERFACE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTypedData getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(InterfaceTypedData newDataType) {
		InterfaceTypedData oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDataTypeDescriptions() {
		if (dataTypeDescriptions == null) {
			dataTypeDescriptions = new EDataTypeUniqueEList<String>(String.class, this, AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE_DESCRIPTIONS);
		}
		return dataTypeDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE:
				return getDataType();
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE_DESCRIPTIONS:
				return getDataTypeDescriptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE:
				setDataType((InterfaceTypedData)newValue);
				return;
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE_DESCRIPTIONS:
				getDataTypeDescriptions().clear();
				getDataTypeDescriptions().addAll((Collection<? extends String>)newValue);
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
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE_DESCRIPTIONS:
				getDataTypeDescriptions().clear();
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
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_DATA__DATA_TYPE_DESCRIPTIONS:
				return dataTypeDescriptions != null && !dataTypeDescriptions.isEmpty();
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
		result.append(" (DataType: ");
		result.append(dataType);
		result.append(", DataTypeDescriptions: ");
		result.append(dataTypeDescriptions);
		result.append(')');
		return result.toString();
	}

} //AbstractInterfaceDataImpl
