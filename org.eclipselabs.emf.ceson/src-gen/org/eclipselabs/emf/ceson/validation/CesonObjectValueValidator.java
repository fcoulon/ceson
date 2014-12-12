/**
 *
 * $Id$
 */
package org.eclipselabs.emf.ceson.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipselabs.emf.ceson.CFeature;

/**
 * A sample validator interface for {@link org.eclipselabs.emf.ceson.CObjectValue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CesonObjectValueValidator {
	boolean validate();

	boolean validateClassName(String value);

	boolean validateEClass(String value);
	boolean validateFeatures(EList<CFeature> value);
}
