
/*
 * Nextworks S.r.l.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package it.nextworks.nido.provisioning.elements;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.nextworks.nido.path.ConnectionType;

/**
 * Created by Marco Capitani on 22/06/17.
 *
 * @author Marco Capitani(m.capitani AT nextworks.it)
 */

public class Connection {

    public Connection(){
        // Jackson constructor
    };

    public Connection(EndPoint sourceEndPoint,
                      EndPoint destinationEndPoint,
                      Recovery recovery,
                      TrafficProfile trafficProfile,
                      ConnectionType connectionType) {
        this.destinationEndPoint = destinationEndPoint;
        this.recovery = recovery;
        this.trafficProfile = trafficProfile;
        this.connectionType = connectionType;
        this.sourceEndPoint = sourceEndPoint;
    }

    @JsonProperty("Destination_end_point")
    public EndPoint destinationEndPoint;

    @JsonProperty("Recovery")
    public Recovery recovery;

    @JsonProperty("Traffic_profile")
    public TrafficProfile trafficProfile;

    @JsonProperty("Connection_type")
    public ConnectionType connectionType;

    @JsonProperty("Source_end_point")
    public EndPoint sourceEndPoint;

}