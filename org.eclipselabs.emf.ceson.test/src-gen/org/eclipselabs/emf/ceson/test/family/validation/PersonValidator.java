/**
 *
 * $Id$
 */
package org.eclipselabs.emf.ceson.test.family.validation;

import java.util.Date;

/**
 * A sample validator interface for {@link org.eclipselabs.emf.ceson.test.family.Person}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PersonValidator {
	boolean validate();

	boolean validateFirstname(String value);
	boolean validateLastname(String value);
	boolean validateBirthdate(Date value);
}
