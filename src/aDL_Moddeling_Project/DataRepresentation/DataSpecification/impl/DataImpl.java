/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionEnhanceableEntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataImpl#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataImpl#isConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataImpl extends AdditionEnhanceableEntityImpl implements Data {
	/**
	 * The cached value of the '{@link #getSemanticType() <em>Semantic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticType()
	 * @generated
	 * @ordered
	 */
	protected SemanticType semanticType;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSpecificationPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticType getSemanticType() {
		return semanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemanticType(SemanticType newSemanticType, NotificationChain msgs) {
		SemanticType oldSemanticType = semanticType;
		semanticType = newSemanticType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataSpecificationPackage.DATA__SEMANTIC_TYPE, oldSemanticType, newSemanticType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticType(SemanticType newSemanticType) {
		if (newSemanticType != semanticType) {
			NotificationChain msgs = null;
			if (semanticType != null)
				msgs = ((InternalEObject)semanticType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataSpecificationPackage.DATA__SEMANTIC_TYPE, null, msgs);
			if (newSemanticType != null)
				msgs = ((InternalEObject)newSemanticType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataSpecificationPackage.DATA__SEMANTIC_TYPE, null, msgs);
			msgs = basicSetSemanticType(newSemanticType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpecificationPackage.DATA__SEMANTIC_TYPE, newSemanticType, newSemanticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpecificationPackage.DATA__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataSpecificationPackage.DATA__SEMANTIC_TYPE:
				return basicSetSemanticType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataSpecificationPackage.DATA__SEMANTIC_TYPE:
				return getSemanticType();
			case DataSpecificationPackage.DATA__CONSTANT:
				return isConstant();
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
			case DataSpecificationPackage.DATA__SEMANTIC_TYPE:
				setSemanticType((SemanticType)newValue);
				return;
			case DataSpecificationPackage.DATA__CONSTANT:
				setConstant((Boolean)newValue);
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
			case DataSpecificationPackage.DATA__SEMANTIC_TYPE:
				setSemanticType((SemanticType)null);
				return;
			case DataSpecificationPackage.DATA__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
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
			case DataSpecificationPackage.DATA__SEMANTIC_TYPE:
				return semanticType != null;
			case DataSpecificationPackage.DATA__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
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
		result.append(" (constant: ");
		result.append(constant);
		result.append(')');
		return result.toString();
	}

} //DataImpl
