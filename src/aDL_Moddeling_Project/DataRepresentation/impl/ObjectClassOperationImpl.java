/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification;

import aDL_Moddeling_Project.DataRepresentation.ObjectClass;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.Postcondition;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.Precondition;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.operationExecutionEffect;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionEnhanceableEntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Class Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl#getOperationexecutioneffect <em>Operationexecutioneffect</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassOperationImpl#getObjectclass <em>Objectclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectClassOperationImpl extends AdditionEnhanceableEntityImpl implements ObjectClassOperation {
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
	protected ObjectClassOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.OBJECT_CLASS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precondition> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<Precondition>(Precondition.class, this, DataRepresentationPackage.OBJECT_CLASS_OPERATION__PRECONDITION);
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
			parameters = new EObjectContainmentEList<OperationParameterDefinition>(OperationParameterDefinition.class, this, DataRepresentationPackage.OBJECT_CLASS_OPERATION__PARAMETERS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT, oldOperationexecutioneffect, newOperationexecutioneffect);
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
				msgs = ((InternalEObject)operationexecutioneffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT, null, msgs);
			if (newOperationexecutioneffect != null)
				msgs = ((InternalEObject)newOperationexecutioneffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT, null, msgs);
			msgs = basicSetOperationexecutioneffect(newOperationexecutioneffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT, newOperationexecutioneffect, newOperationexecutioneffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Postcondition> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectContainmentEList<Postcondition>(Postcondition.class, this, DataRepresentationPackage.OBJECT_CLASS_OPERATION__POSTCONDITION);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataRepresentationPackage.OBJECT_CLASS_OPERATION__RETURN_TYPE, oldReturnType, returnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_CLASS_OPERATION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass getObjectclass() {
		if (eContainerFeatureID() != DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS) return null;
		return (ObjectClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectclass(ObjectClass newObjectclass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newObjectclass, DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectclass(ObjectClass newObjectclass) {
		if (newObjectclass != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS && newObjectclass != null)) {
			if (EcoreUtil.isAncestor(this, newObjectclass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newObjectclass != null)
				msgs = ((InternalEObject)newObjectclass).eInverseAdd(this, DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION, ObjectClass.class, msgs);
			msgs = basicSetObjectclass(newObjectclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS, newObjectclass, newObjectclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetObjectclass((ObjectClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT:
				return basicSetOperationexecutioneffect(null, msgs);
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__POSTCONDITION:
				return ((InternalEList<?>)getPostcondition()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS:
				return basicSetObjectclass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS:
				return eInternalContainer().eInverseRemove(this, DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION, ObjectClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PRECONDITION:
				return getPrecondition();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PARAMETERS:
				return getParameters();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT:
				return getOperationexecutioneffect();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__POSTCONDITION:
				return getPostcondition();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS:
				return getObjectclass();
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
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Precondition>)newValue);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends OperationParameterDefinition>)newValue);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT:
				setOperationexecutioneffect((operationExecutionEffect)newValue);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Postcondition>)newValue);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__RETURN_TYPE:
				setReturnType((DataTypeSpecification)newValue);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS:
				setObjectclass((ObjectClass)newValue);
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
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PRECONDITION:
				getPrecondition().clear();
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT:
				setOperationexecutioneffect((operationExecutionEffect)null);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__POSTCONDITION:
				getPostcondition().clear();
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__RETURN_TYPE:
				setReturnType((DataTypeSpecification)null);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS:
				setObjectclass((ObjectClass)null);
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
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT:
				return operationexecutioneffect != null;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__RETURN_TYPE:
				return returnType != null;
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS:
				return getObjectclass() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (derivedFeatureID) {
				case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PRECONDITION: return OperationModelPackage.OPERATION__PRECONDITION;
				case DataRepresentationPackage.OBJECT_CLASS_OPERATION__PARAMETERS: return OperationModelPackage.OPERATION__PARAMETERS;
				case DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT: return OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT;
				case DataRepresentationPackage.OBJECT_CLASS_OPERATION__POSTCONDITION: return OperationModelPackage.OPERATION__POSTCONDITION;
				case DataRepresentationPackage.OBJECT_CLASS_OPERATION__RETURN_TYPE: return OperationModelPackage.OPERATION__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (baseFeatureID) {
				case OperationModelPackage.OPERATION__PRECONDITION: return DataRepresentationPackage.OBJECT_CLASS_OPERATION__PRECONDITION;
				case OperationModelPackage.OPERATION__PARAMETERS: return DataRepresentationPackage.OBJECT_CLASS_OPERATION__PARAMETERS;
				case OperationModelPackage.OPERATION__OPERATIONEXECUTIONEFFECT: return DataRepresentationPackage.OBJECT_CLASS_OPERATION__OPERATIONEXECUTIONEFFECT;
				case OperationModelPackage.OPERATION__POSTCONDITION: return DataRepresentationPackage.OBJECT_CLASS_OPERATION__POSTCONDITION;
				case OperationModelPackage.OPERATION__RETURN_TYPE: return DataRepresentationPackage.OBJECT_CLASS_OPERATION__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ObjectClassOperationImpl
