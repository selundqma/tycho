/*******************************************************************************
 * Copyright (c) 2023 Christoph Läubrich and others.
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
package org.eclipse.tycho.bnd.mojos;

import java.io.File;
import java.util.Collection;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

import aQute.bnd.build.Project;

/**
 * Compile main project sources
 */
@Mojo(name = "compile", defaultPhase = LifecyclePhase.COMPILE, requiresDependencyResolution = ResolutionScope.COMPILE, threadSafe = true)
public class BndCompileMojo extends AbstractBndCompileMojo {

	@Override
	protected void execute(Project project) throws Exception {
		project.compile(false);
		doCopyResources(project);
	}

	@Override
	protected Collection<File> getSourcePath(Project project) throws Exception {
		return project.getSourcePath();
	}

	@Override
	protected File getOutput(Project project) throws Exception {
		return project.getOutput();
	}
}
