package com.example.springdocjavadoc;

import com.example.springdocjavadoc.data.TrackerData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Hello controller.
 */
@RestController
public class TrackerController {
    /**
     * List tracker data.
     *
     * @param toto the toto
     * @return the tracker data
     */
    @PostMapping(value = "/values/data")
    TrackerData list(TrackerData toto) {
      return toto;
    }
}
