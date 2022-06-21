
package vishwa.findem.customview;

import java.util.List;

import vishwa.findem.tflite.SimilarityClassifier.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
