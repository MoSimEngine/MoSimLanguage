/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.Postcondition;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.Precondition;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.operationExecutionEffect;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl#getOperationexecutioneffect <em>Operationexecutioneffect</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends EntityImpl implements Operation {
	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Precondition> precondition;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationParameterDefinition> parameters;

	/**
	 * The cached value of the '{@link #getOperationexecutioneffect() <em>Operationexecutioneffect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationexecutioneffect()
	 * @generated
	 * @ordered
	 */
	protected operationExecutionEffect operationexecutioneffect;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Postcondition> postcondition;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeSpecification returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationModelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precondition> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<Precondition>(Precondition.class, this, OperationModelPackage.OPERATION__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationParameterDefinition> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<OperationParameterDefinition>(OperationParameterDefinition.class, this, OperationModelPackage.OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operationExecutionEffect getOperationexecutioneffect() {
		return operationexecutioneffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationexecutioneffect(operationExecutionEffect newOperationexecutioneffect, NotificationChain msgs) {
		operationExecutionEffect oldOperationexecutioneffect = operationexecutioneffect;
		operationexecutioneffect = newOperationexecutioneffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT, oldOperationexecutioneffect, newOperationexecutioneffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationexecutioneffect(operationExecutionEffect newOperationexecutioneffect) {
		if (newOperationexecutioneffect != operationexecutioneffect) {
			NotificationChain msgs = null;
			if (operationexecutioneffect != null)
				msgs = ((InternalEObject)operationexecutioneffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT, null, msgs);
			if (newOperationexecutioneffect != null)
				msgs = ((InternalEObject)newOperationexecutioneffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT, null, msgs);
			msgs = basicSetOperationexecutioneffect(newOperationexecutioneffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT, newOperationexecutioneffect, newOperationexecutioneffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Postcondition> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectContainmentEList<Postcondition>(Postcondition.class, this, OperationModelPackage.OPERATION__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeSpecification getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (DataTypeSpecification)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationModelPackage.OPERATION__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeSpecification basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(DataTypeSpecification newReturnType) {
		DataTypeSpecification oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationModelPackage.OPERATION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationModelPackage.OPERATION__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
			case OperationModelPackage.OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT:
				return basicSetOperationexecutioneffect(null, msgs);
			case OperationModelPackage.OPERATION__POSTCONDITION:
				return ((InternalEList<?>)getPostcondition()).basicRemove(otherEnd, msgs);
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
			case OperationModelPackage.OPERATION__PRECONDITION:
				return getPrecondition();
			case OperationModelPackage.OPERATION__PARAMETERS:
				return getParameters();
			case OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT:
				return getOperationexecutioneffect();
			case OperationModelPackage.OPERATION__POSTCONDITION:
				return getPostcondition();
			case OperationModelPackage.OPERATION__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
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
			case OperationModelPackage.OPERATION__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Precondition>)newValue);
				return;
			case OperationModelPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends OperationParameterDefinition>)newValue);
				return;
			case OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT:
				setOperationexecutioneffect((operationExecutionEffect)newValue);
				return;
			case OperationModelPackage.OPERATION__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Postcondition>)newValue);
				return;
			case OperationModelPackage.OPERATION__RETURN_TYPE:
				setReturnType((DataTypeSpecification)newValue);
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
			case OperationModelPackage.OPERATION__PRECONDITION:
				getPrecondition().clear();
				return;
			case OperationModelPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT:
				setOperationexecutioneffect((operationExecutionEffect)null);
				return;
			case OperationModelPackage.OPERATION__POSTCONDITION:
				getPostcondition().clear();
				return;
			case OperationModelPackage.OPERATION__RETURN_TYPE:
				setReturnType((DataTypeSpecification)null);
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
			case OperationModelPackage.OPERATION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case OperationModelPackage.OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT:
				return operationexecutioneffect != null;
			case OperationModelPackage.OPERATION__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case OperationModelPackage.OPERATION__RETURN_TYPE:
				return returnType != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
