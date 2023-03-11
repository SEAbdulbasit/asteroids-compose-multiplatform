package vector

import Game
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.DpOffset

/**
 * Created by abdulbasit on 11/03/2023.
 */
actual fun Modifier.onMove(
    game: Game,
    onMove: (position: Offset) -> Boolean,
    onExit: () -> Boolean,
    onEnter: () -> Boolean
): Modifier {
    return pointerInput(Unit) {
        detectDragGestures(
            onDragStart = { },
            onDrag = { change, _ ->
                game.targetLocation = DpOffset(change.position.x.toDp(), change.position.x.toDp())
            },
            onDragEnd = { }
        )
    }
}