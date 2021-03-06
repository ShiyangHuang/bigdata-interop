package com.google.cloud.hadoop.io.bigquery;

import org.apache.hadoop.classification.InterfaceStability;

// TODO(user): Redirect ExportFileFormat to this
/**
 * Experimental, API subject to change.<br>
 * An enum to describe file formats supported by the BigQuery api.
 */
@InterfaceStability.Unstable
public enum BigQueryFileFormat {
  /** Comma separated value exports */
  CSV(".csv", "CSV"),
  /** Newline delimited JSON */
  LINE_DELIMITED_JSON(".json", "NEWLINE_DELIMITED_JSON"),
  /** Avro container files */
  AVRO(".avro", "AVRO");

  private final String extension;
  private final String formatIdentifier;

  private BigQueryFileFormat(String extension, String formatIdentifier) {
    this.extension = extension;
    this.formatIdentifier = formatIdentifier;
  }

  /** Get the default extension to denote the file format. */
  public String getExtension() {
    return extension;
  }

  /** Get the identifier to specify in API requests. */
  public String getFormatIdentifier() {
    return formatIdentifier;
  }
}
