package vector

import Game
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

/**
 * Created by abdulbasit on 11/03/2023.
 */
actual fun androidx.compose.ui.Modifier.onMove(
    game: Game,
    onMove: (position: androidx.compose.ui.geometry.Offset) -> kotlin.Boolean,
    onExit: () -> kotlin.Boolean,
    onEnter: () -> kotlin.Boolean
): androidx.compose.ui.Modifier {
    return pointerInput(Unit) {
        detectDragGestures(
            onDrag = { change, _ ->
                game.targetLocation = DpOffset(change.position.x.dp, change.position.y.dp)
            }
        )
    }
}