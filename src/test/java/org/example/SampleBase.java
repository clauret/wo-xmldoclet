package org.example;

/**
 * This is a sample base class.
 *
 * <p>Here is an inline taglet example {@glossary base_class}.</p>
 *
 * @error-id 1234 An error ID
 */
public abstract class SampleBase implements SampleInterface {

  protected final String something;

  SampleBase(String something) {
    this.something = something;
  }

  @Override
  public final String writeSomething() {
    return this.something;
  }

}
