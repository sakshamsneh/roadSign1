package com.fileindie.saksham.roadsign.util;

import android.graphics.RectF;

/**
 * Created by brijesh on 4/7/17.
 */

public class Recognition {

    private final String id;

    private final String title;
    private final Float confidence;
    private RectF location;

    public Recognition(
            final String id, final String title, final Float confidence, final RectF location) {
        this.id = id;
        this.title = title;
        this.confidence = confidence;
        this.location = location;
    }


    public Float getConfidence() {
        return confidence;
    }


    @Override
    public String toString() {
        String resultString = "";
        if (id != null) {
            resultString += "[" + id + ".";
        }

        if (title != null) {
            resultString += title + " ";
        }

        if (confidence != null) {
            resultString += String.format("(%.1f%%) ", confidence * 100.0f);
        }

        if (location != null) {
            resultString += location + "]";
        }

        return resultString.trim();
    }
}
