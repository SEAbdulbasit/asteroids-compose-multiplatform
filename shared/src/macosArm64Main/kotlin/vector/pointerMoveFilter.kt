package vector

import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

/**
 * Created by abdulbasit on 11/03/2023.
 */
actual fun androidx.compose.ui.Modifier.onMove(
    onOffsetChanged: (position: DpOffset) -> Unit
): androidx.compose.ui.Modifier {
    return pointerInput(Unit) {
        detectDragGestures(onDrag = { change, _ ->
            onOffsetChanged(DpOffset(change.position.x.dp, change.position.y.dp))
        })
    }
}