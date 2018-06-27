/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;
import aDL_Moddeling_Project.DataRepresentation.InstancedObjects;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions;
import aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Oriented View Simulation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewSimulationDataImpl#getInstancedobjects <em>Instancedobjects</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectOrientedViewSimulationDataImpl#getObjectclassdefinitions <em>Objectclassdefinitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectOrientedViewSimulationDataImpl extends SimulationDataImpl implements ObjectOrientedViewSimulationData {
	/**
	 * The cached value of the '{@link #getInstancedobjects() <em>Instancedobjects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancedobjects()
	 * @generated
	 * @ordered
	 */
	protected InstancedObjects instancedobjects;

	/**
	 * The cached value of the '{@link #getObjectclassdefinitions() <em>Objectclassdefinitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectclassdefinitions()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassDefinitions objectclassdefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectOrientedViewSimulationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.OBJECT_ORIENTED_VIEW_SIMULATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancedObjects getInstancedobjects() {
		return instancedobjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstancedobjects(InstancedObjects newInstancedobjects, NotificationChain msgs) {
		InstancedObjects oldInstancedobjects = instancedobjects;
		instancedobjects = newInstancedobjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS, oldInstancedobjects, newInstancedobjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstancedobjects(InstancedObjects newInstancedobjects) {
		if (newInstancedobjects != instancedobjects) {
			NotificationChain msgs = null;
			if (instancedobjects != null)
				msgs = ((InternalEObject)instancedobjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS, null, msgs);
			if (newInstancedobjects != null)
				msgs = ((InternalEObject)newInstancedobjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS, null, msgs);
			msgs = basicSetInstancedobjects(newInstancedobjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS, newInstancedobjects, newInstancedobjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassDefinitions getObjectclassdefinitions() {
		return objectclassdefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectclassdefinitions(ObjectClassDefinitions newObjectclassdefinitions, NotificationChain msgs) {
		ObjectClassDefinitions oldObjectclassdefinitions = objectclassdefinitions;
		objectclassdefinitions = newObjectclassdefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS, oldObjectclassdefinitions, newObjectclassdefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectclassdefinitions(ObjectClassDefinitions newObjectclassdefinitions) {
		if (newObjectclassdefinitions != objectclassdefinitions) {
			NotificationChain msgs = null;
			if (objectclassdefinitions != null)
				msgs = ((InternalEObject)objectclassdefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS, null, msgs);
			if (newObjectclassdefinitions != null)
				msgs = ((InternalEObject)newObjectclassdefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS, null, msgs);
			msgs = basicSetObjectclassdefinitions(newObjectclassdefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS, newObjectclassdefinitions, newObjectclassdefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS:
				return basicSetInstancedobjects(null, msgs);
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS:
				return basicSetObjectclassdefinitions(null, msgs);
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
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS:
				return getInstancedobjects();
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS:
				return getObjectclassdefinitions();
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
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS:
				setInstancedobjects((InstancedObjects)newValue);
				return;
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS:
				setObjectclassdefinitions((ObjectClassDefinitions)newValue);
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
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS:
				setInstancedobjects((InstancedObjects)null);
				return;
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS:
				setObjectclassdefinitions((ObjectClassDefinitions)null);
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
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__INSTANCEDOBJECTS:
				return instancedobjects != null;
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA__OBJECTCLASSDEFINITIONS:
				return objectclassdefinitions != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectOrientedViewSimulationDataImpl
