package com.github.marcinaman.hammerplugin.listeners

import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction

class BuildProjectAction: DumbAwareAction()  {

    override fun actionPerformed(e: AnActionEvent) {
        ActionManager.getInstance().getAction("CompileProject").actionPerformed(e)
    }

    override fun update(е: AnActionEvent) {
        ActionManager.getInstance().getAction("CompileProject").update(е)
    }

    override fun getActionUpdateThread(): ActionUpdateThread {
        return ActionUpdateThread.BGT
    }
}