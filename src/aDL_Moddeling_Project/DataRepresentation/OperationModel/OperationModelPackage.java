/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel;

import aDL_Moddeling_Project.basic.BasicPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelFactory
 * @model kind="package"
 * @generated
 */
public interface OperationModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OperationModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.DataRepresentation.OperationModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OperationModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationModelPackage eINSTANCE = aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRECONDITION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operationexecutioneffect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATIONEXECUTIONEFFECT = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__POSTCONDITION = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.operationExecutionEffectImpl <em>operation Execution Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.operationExecutionEffectImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getoperationExecutionEffect()
	 * @generated
	 */
	int OPERATION_EXECUTION_EFFECT = 1;

	/**
	 * The feature id for the '<em><b>Executioneffectondata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXECUTION_EFFECT__EXECUTIONEFFECTONDATA = 0;

	/**
	 * The number of structural features of the '<em>operation Execution Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXECUTION_EFFECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>operation Execution Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXECUTION_EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.executionEffectOnDataImpl <em>execution Effect On Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.executionEffectOnDataImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getexecutionEffectOnData()
	 * @generated
	 */
	int EXECUTION_EFFECT_ON_DATA = 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EFFECT_ON_DATA__EFFECT = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EFFECT_ON_DATA__DATA = 1;

	/**
	 * The number of structural features of the '<em>execution Effect On Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EFFECT_ON_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>execution Effect On Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_EFFECT_ON_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationParameterDefinitionImpl <em>Operation Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationParameterDefinitionImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getOperationParameterDefinition()
	 * @generated
	 */
	int OPERATION_PARAMETER_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Identifiing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_DEFINITION__IDENTIFIING_NAME = 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_DEFINITION__OPTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_DEFINITION__DATA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Operation Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.PreconditionImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.PostconditionImpl <em>Postcondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.PostconditionImpl
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getPostcondition()
	 * @generated
	 */
	int POSTCONDITION = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getPrecondition()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getOperationexecutioneffect <em>Operationexecutioneffect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operationexecutioneffect</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getOperationexecutioneffect()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operationexecutioneffect();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postcondition</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getPostcondition()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Postcondition();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.operationExecutionEffect <em>operation Execution Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operation Execution Effect</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.operationExecutionEffect
	 * @generated
	 */
	EClass getoperationExecutionEffect();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.operationExecutionEffect#getExecutioneffectondata <em>Executioneffectondata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executioneffectondata</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.operationExecutionEffect#getExecutioneffectondata()
	 * @see #getoperationExecutionEffect()
	 * @generated
	 */
	EReference getoperationExecutionEffect_Executioneffectondata();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData <em>execution Effect On Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>execution Effect On Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData
	 * @generated
	 */
	EClass getexecutionEffectOnData();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData#getEffect()
	 * @see #getexecutionEffectOnData()
	 * @generated
	 */
	EAttribute getexecutionEffectOnData_Effect();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData#getData()
	 * @see #getexecutionEffectOnData()
	 * @generated
	 */
	EReference getexecutionEffectOnData_Data();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition <em>Operation Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Parameter Definition</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition
	 * @generated
	 */
	EClass getOperationParameterDefinition();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#getIdentifiingName <em>Identifiing Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifiing Name</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#getIdentifiingName()
	 * @see #getOperationParameterDefinition()
	 * @generated
	 */
	EAttribute getOperationParameterDefinition_IdentifiingName();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#isOptional()
	 * @see #getOperationParameterDefinition()
	 * @generated
	 */
	EAttribute getOperationParameterDefinition_Optional();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationParameterDefinition#getDataType()
	 * @see #getOperationParameterDefinition()
	 * @generated
	 */
	EReference getOperationParameterDefinition_DataType();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Precondition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Precondition#getDescription()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_Description();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Postcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postcondition</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Postcondition
	 * @generated
	 */
	EClass getPostcondition();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Postcondition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Postcondition#getDescription()
	 * @see #getPostcondition()
	 * @generated
	 */
	EAttribute getPostcondition_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationModelFactory getOperationModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PRECONDITION = eINSTANCE.getOperation_Precondition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Operationexecutioneffect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATIONEXECUTIONEFFECT = eINSTANCE.getOperation_Operationexecutioneffect();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__POSTCONDITION = eINSTANCE.getOperation_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.operationExecutionEffectImpl <em>operation Execution Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.operationExecutionEffectImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getoperationExecutionEffect()
		 * @generated
		 */
		EClass OPERATION_EXECUTION_EFFECT = eINSTANCE.getoperationExecutionEffect();

		/**
		 * The meta object literal for the '<em><b>Executioneffectondata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_EXECUTION_EFFECT__EXECUTIONEFFECTONDATA = eINSTANCE.getoperationExecutionEffect_Executioneffectondata();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.executionEffectOnDataImpl <em>execution Effect On Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.executionEffectOnDataImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getexecutionEffectOnData()
		 * @generated
		 */
		EClass EXECUTION_EFFECT_ON_DATA = eINSTANCE.getexecutionEffectOnData();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_EFFECT_ON_DATA__EFFECT = eINSTANCE.getexecutionEffectOnData_Effect();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_EFFECT_ON_DATA__DATA = eINSTANCE.getexecutionEffectOnData_Data();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationParameterDefinitionImpl <em>Operation Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationParameterDefinitionImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getOperationParameterDefinition()
		 * @generated
		 */
		EClass OPERATION_PARAMETER_DEFINITION = eINSTANCE.getOperationParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Identifiing Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAMETER_DEFINITION__IDENTIFIING_NAME = eINSTANCE.getOperationParameterDefinition_IdentifiingName();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAMETER_DEFINITION__OPTIONAL = eINSTANCE.getOperationParameterDefinition_Optional();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PARAMETER_DEFINITION__DATA_TYPE = eINSTANCE.getOperationParameterDefinition_DataType();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.PreconditionImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__DESCRIPTION = eINSTANCE.getPrecondition_Description();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.PostconditionImpl <em>Postcondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.PostconditionImpl
		 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationModelPackageImpl#getPostcondition()
		 * @generated
		 */
		EClass POSTCONDITION = eINSTANCE.getPostcondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTCONDITION__DESCRIPTION = eINSTANCE.getPostcondition_Description();

	}

} //OperationModelPackage
