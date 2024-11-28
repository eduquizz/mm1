/**
 */
package mm1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm1.Question#getEnnonce <em>Ennonce</em>}</li>
 *   <li>{@link mm1.Question#getDifficulte <em>Difficulte</em>}</li>
 *   <li>{@link mm1.Question#isReponsesMultiples <em>Reponses Multiples</em>}</li>
 *   <li>{@link mm1.Question#getReponse <em>Reponse</em>}</li>
 *   <li>{@link mm1.Question#getEtiquette <em>Etiquette</em>}</li>
 * </ul>
 *
 * @see mm1.Mm1Package#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Ennonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ennonce</em>' attribute.
	 * @see #setEnnonce(String)
	 * @see mm1.Mm1Package#getQuestion_Ennonce()
	 * @model
	 * @generated
	 */
	String getEnnonce();

	/**
	 * Sets the value of the '{@link mm1.Question#getEnnonce <em>Ennonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ennonce</em>' attribute.
	 * @see #getEnnonce()
	 * @generated
	 */
	void setEnnonce(String value);

	/**
	 * Returns the value of the '<em><b>Difficulte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulte</em>' attribute.
	 * @see #setDifficulte(int)
	 * @see mm1.Mm1Package#getQuestion_Difficulte()
	 * @model
	 * @generated
	 */
	int getDifficulte();

	/**
	 * Sets the value of the '{@link mm1.Question#getDifficulte <em>Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulte</em>' attribute.
	 * @see #getDifficulte()
	 * @generated
	 */
	void setDifficulte(int value);

	/**
	 * Returns the value of the '<em><b>Reponses Multiples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponses Multiples</em>' attribute.
	 * @see #setReponsesMultiples(boolean)
	 * @see mm1.Mm1Package#getQuestion_ReponsesMultiples()
	 * @model
	 * @generated
	 */
	boolean isReponsesMultiples();

	/**
	 * Sets the value of the '{@link mm1.Question#isReponsesMultiples <em>Reponses Multiples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reponses Multiples</em>' attribute.
	 * @see #isReponsesMultiples()
	 * @generated
	 */
	void setReponsesMultiples(boolean value);

	/**
	 * Returns the value of the '<em><b>Etiquette</b></em>' containment reference list.
	 * The list contents are of type {@link mm1.Etiquette}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiquette</em>' containment reference list.
	 * @see mm1.Mm1Package#getQuestion_Etiquette()
	 * @model containment="true"
	 * @generated
	 */
	EList<Etiquette> getEtiquette();

	/**
	 * Returns the value of the '<em><b>Reponse</b></em>' containment reference list.
	 * The list contents are of type {@link mm1.Reponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponse</em>' containment reference list.
	 * @see mm1.Mm1Package#getQuestion_Reponse()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Reponse> getReponse();

} // Question
