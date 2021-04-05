package com.github.janhenke.jetbrainsriotosplugin.listeners;

import com.github.janhenke.jetbrainsriotosplugin.services.MyProjectService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManagerListener;

import org.jetbrains.annotations.NotNull;

public class MyProjectManagerListener implements ProjectManagerListener
{
	@Override
	public void projectOpened(@NotNull final Project project)
	{
		project.getService(MyProjectService.class);
	}
}
