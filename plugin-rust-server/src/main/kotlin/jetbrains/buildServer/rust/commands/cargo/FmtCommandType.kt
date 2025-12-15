

package jetbrains.buildServer.rust.commands.cargo

import jetbrains.buildServer.rust.CargoConstants
import jetbrains.buildServer.rust.commands.CommandType

/**
 * Provides parameters for cargo doc command.
 */
class FmtCommandType : CommandType {
    override val name: String
        get() = CargoConstants.COMMAND_FMT

    override val editPage: String
        get() = "editFmtParameters.jsp"

    override val viewPage: String
        get() = "viewFmtParameters.jsp"
}