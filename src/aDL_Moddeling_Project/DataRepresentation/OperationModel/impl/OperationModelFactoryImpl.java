/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel.impl;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationModelFactoryImpl extends EFactoryImpl implements OperationModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationModelFactory init() {
		try {
			OperationModelFactory theOperationModelFactory = (OperationModelFactory)EPackage.Registry.INSTANCE.getEFactory(OperationModelPackage.eNS_URI);
			if (theOperationModelFactory != null) {
				return theOperationModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperationModelPackage.OPERATION_EXECUTION_EFFECT: return createoperationExecutionEffect();
			case OperationModelPackage.EXECUTION_EFFECT_ON_DATA: return createexecutionEffectOnData();
			case OperationModelPackage.OPERATION_PARAMETER_DEFINITION: return createOperationParameterDefinition();
			case OperationModelPackage.PRECONDITION: return createPrecondition();
			case OperationModelPackage.POSTCONDITION: return createPostcondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operationExecutionEffect createoperationExecutionEffect() {
		operationExecutionEffectImpl operationExecutionEffect = new operationExecutionEffectImpl();
		return operationExecutionEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public executionEffectOnData createexecutionEffectOnData() {
		executionEffectOnDataImpl executionEffectOnData = new executionEffectOnDataImpl();
		return executionEffectOnData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterDefinition createOperationParameterDefinition() {
		OperationParameterDefinitionImpl operationParameterDefinition = new OperationParameterDefinitionImpl();
		return operationParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postcondition createPostcondition() {
		PostconditionImpl postcondition = new PostconditionImpl();
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationModelPackage getOperationModelPackage() {
		return (OperationModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationModelPackage getPackage() {
		return OperationModelPackage.eINSTANCE;
	}

} //OperationModelFactoryImpl
