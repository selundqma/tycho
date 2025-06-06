/*******************************************************************************
 * Copyright (c) 2022 Christoph Läubrich and others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Christoph Läubrich - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.transport;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public interface TransportProtocolHandler {

    long getLastModified(URI uri) throws IOException;

    File getFile(URI remoteFile) throws IOException;

}
