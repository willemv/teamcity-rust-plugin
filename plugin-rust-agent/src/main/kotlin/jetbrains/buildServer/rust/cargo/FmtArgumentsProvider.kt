

package jetbrains.buildServer.rust.cargo

import jetbrains.buildServer.agent.BuildRunnerContext
import jetbrains.buildServer.rust.ArgumentsProvider
import jetbrains.buildServer.rust.CargoConstants
import java.util.*

/**
 * Provides arguments to cargo clean command.
 */
class FmtArgumentsProvider : ArgumentsProvider {

    override fun getArguments(runnerContext: BuildRunnerContext): List<String> {
        val parameters = runnerContext.runnerParameters
        val arguments = ArrayList<String>()
        arguments.add(CargoConstants.COMMAND_FMT)

        val checkValue = parameters[CargoConstants.PARAM_FMT_CHECK]
        if ("true".equals(checkValue, ignoreCase = true)) {
            arguments.add("--check")
        }

        val manifestValue = parameters[CargoConstants.PARAM_FMT_MANIFEST]
        if (!manifestValue.isNullOrBlank()) {
            arguments.add("--manifest-path")
            arguments.add(manifestValue.trim())
        }

        return arguments
    }
}