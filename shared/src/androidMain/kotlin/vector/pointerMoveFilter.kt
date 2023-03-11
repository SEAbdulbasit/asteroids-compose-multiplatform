package vector

import android.annotation.SuppressLint
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput

/**
 * Created by abdulbasit on 11/03/2023.
 */
@SuppressLint("ModifierFactoryUnreferencedReceiver")
actual fun Modifier.onMove(
    onOffsetChanged: (position: Offset) -> Unit
): Modifier {
    return pointerInput(Unit) {
        detectDragGestures(onDrag = { change, _ ->
            onOffsetChanged(change.position)
        })
    }
}