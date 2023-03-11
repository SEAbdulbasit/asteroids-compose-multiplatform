package vector

import Game
import android.annotation.SuppressLint
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp


/**
 * Created by abdulbasit on 11/03/2023.
 */
@SuppressLint("ModifierFactoryUnreferencedReceiver")
actual fun Modifier.onMove(
    game: Game,
    onMove: (position: Offset) -> Boolean,
    onExit: () -> Boolean,
    onEnter: () -> Boolean
): Modifier {
    return pointerInput(Unit) {
        detectDragGestures(onDrag = { change, _ ->
            game.targetLocation = DpOffset(change.position.x.dp, change.position.y.dp)
        })
    }
}