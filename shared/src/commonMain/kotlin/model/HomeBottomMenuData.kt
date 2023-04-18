import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.ui.graphics.vector.ImageVector

sealed class HomeBottomMenuData(
    val icon: ImageVector,
    val title: String,
){
    object Mail: HomeBottomMenuData(
        icon = Icons.Outlined.Email,
        title = "Mail",
    )
    object Meet: HomeBottomMenuData(
        icon = Icons.Outlined.Call,
        title = "Meet",
    )
    object Add: HomeBottomMenuData(
        icon = Icons.Outlined.Add,
        title = "Add",
    )
}
