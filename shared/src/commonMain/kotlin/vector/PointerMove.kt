package vector

import Game
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset

/**
 * Created by abdulbasit on 11/03/2023.
 */
expect fun Modifier.onMove(
    game: Game,
    onMove: (position: Offset) -> Boolean = { false },
    onExit: () -> Boolean = { false },
    onEnter: () -> Boolean = { false },
): Modifier