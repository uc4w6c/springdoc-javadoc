package com.example.springdocjavadoc.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;

/**
 * The type Tracker data.
 */
public class TrackerData {

  /**
   * The Tracker id.
   */
  @Schema(name = "trackerId", type = "string", required = true, example = "the-tracker-id")
  @JsonProperty("trackerId")
  String trackerId;

  /**
   * The Timestamp.
   */
  @Schema(name = "timestamp", type = "string", format = "date-time", required = true, example = "2018-01-01T00:00:00Z")
  @JsonProperty("timestamp")
  Instant timestamp;

  /**
   * The Value.
   */
  @Schema(name = "value", type = "number", format = "double", description = "The data value", required = true, example = "19.0")
  @JsonProperty("value")
  Double value;

}
