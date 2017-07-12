
/*
 * Nextworks S.r.l.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package it.nextworks.nido.engine.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InterDomainPathTearDownMessage extends EngineMessage {

	@JsonCreator
	public InterDomainPathTearDownMessage(@JsonProperty("interDomainPathId") String interDomainPathId) {
		this.type = QueueMessageType.TEARDOWN_PATH_REQUEST;
		this.interDomainPathId = interDomainPathId;
	}

}