import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false,
) {
    object AllInboxes : DrawerMenuData(
        icon = Icons.Outlined.Face,
        title = "All inboxes",
    )

    object Primary : DrawerMenuData(
        icon = Icons.Outlined.Build,
        title = "Primary",
    )

    object Contacts : DrawerMenuData(
        icon = Icons.Outlined.Check,
        title = "Contacts",
    )

    object Settings : DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings",
    )

    object Help : DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Help",
    )

    object Divider : DrawerMenuData(
        isDivider = true,
    )

    object HeaderOne : DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS",
    )

    object HeaderTwo : DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS",
    )
}
