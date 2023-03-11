package vector

import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset

/**
 * Created by abdulbasit on 11/03/2023.
 */
expect fun Modifier.onMove(onOffsetChanged: (position: Offset) -> Unit): Modifier