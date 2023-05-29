package org.pageseeder.xmldoclet.options;

import jdk.javadoc.doclet.Reporter;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Option to generate the XML documentation as multiple files (one per element).
 *
 * @author Christophe Lauret
 * @version 1.0
 */
public class MultipleOption extends XMLDocletOptionBase implements Serializable {

  private boolean enabled = false;

  public MultipleOption(Reporter reporter) {
    super(reporter);
  }

  @Override
  public int getArgumentCount() {
    return 0;
  }

  @Override
  public String getDescription() {
    return "Whether to save as multiple files.";
  }

  @Override
  public Kind getKind() {
    return Kind.STANDARD;
  }

  @Override
  public List<String> getNames() {
    return Collections.singletonList("-multiple");
  }

  @Override
  public String getParameters() {
    return "";
  }

  @Override
  public boolean process(String option, List<String> arguments) {
    this.enabled = true;
    return true;
  }

  public boolean enabled() {
    return this.enabled;
  }

}
