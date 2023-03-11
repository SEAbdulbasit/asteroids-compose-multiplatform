package vector

import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

/**
 * Created by abdulbasit on 11/03/2023.
 */
actual fun Modifier.onMove(
    onOffsetChanged: (position: DpOffset) -> Unit
): Modifier {
    return pointerInput(Unit) {
        detectDragGestures(onDrag = { change, _ ->
            onOffsetChanged(DpOffset(change.position.x.dp, change.position.y.dp))
        })
    }
}