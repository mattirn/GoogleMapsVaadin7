package com.vaadin.tapio.googlemaps.client.events;

import com.vaadin.tapio.googlemaps.client.GoogleMapMarker;
import com.vaadin.tapio.googlemaps.client.LatLon;

/**
 * Interface for listening marker drag events.
 * 
 * @author Tapio Aali <tapio@vaadin.com>
 */
public interface MarkerDragListener {
    /**
     * Handle a MarkerDragEvent.
     * 
     * @param draggedMarker
     *            The marker that was dragged with position updated.
     * @param oldPosition
     *            The old position of the marker.
     */
    public void markerDragged(GoogleMapMarker draggedMarker, LatLon oldPosition);
}
