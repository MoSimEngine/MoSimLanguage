/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage;
import aDL_Moddeling_Project.DataRepresentation.DataSpecification.SemanticType;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.SemanticTypeImpl#getSemanticDescription <em>Semantic Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticTypeImpl extends EntityImpl implements SemanticType {
	/**
	 * The default value of the '{@link #getSemanticDescription() <em>Semantic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticDescription() <em>Semantic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticDescription()
	 * @generated
	 * @ordered
	 */
	protected String semanticDescription = SEMANTIC_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataSpecificationPackage.Literals.SEMANTIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticDescription() {
		return semanticDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticDescription(String newSemanticDescription) {
		String oldSemanticDescription = semanticDescription;
		semanticDescription = newSemanticDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataSpecificationPackage.SEMANTIC_TYPE__SEMANTIC_DESCRIPTION, oldSemanticDescription, semanticDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataSpecificationPackage.SEMANTIC_TYPE__SEMANTIC_DESCRIPTION:
				return getSemanticDescription();
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
			case DataSpecificationPackage.SEMANTIC_TYPE__SEMANTIC_DESCRIPTION:
				setSemanticDescription((String)newValue);
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
			case DataSpecificationPackage.SEMANTIC_TYPE__SEMANTIC_DESCRIPTION:
				setSemanticDescription(SEMANTIC_DESCRIPTION_EDEFAULT);
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
			case DataSpecificationPackage.SEMANTIC_TYPE__SEMANTIC_DESCRIPTION:
				return SEMANTIC_DESCRIPTION_EDEFAULT == null ? semanticDescription != null : !SEMANTIC_DESCRIPTION_EDEFAULT.equals(semanticDescription);
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
		result.append(" (SemanticDescription: ");
		result.append(semanticDescription);
		result.append(')');
		return result.toString();
	}

} //SemanticTypeImpl
