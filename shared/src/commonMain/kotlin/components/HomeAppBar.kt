import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(
    scaffoldState: ScaffoldState,
    scope: CoroutineScope,
    openDialog: MutableState<Boolean>,
) {
    Box(
        modifier = Modifier
            .padding(10.dp),
    ) {
        Card(
            modifier = Modifier
                .requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 6.dp,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
            ) {
                IconButton(onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }) {
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = "Menu"
                    )
                }
                Text(
                    modifier = Modifier
                        .weight(2.0f),
                    text = "Search in emails"
                )
                Icon(
                    Icons.Default.Add,
                    modifier = Modifier
                        .size(30.dp),
                    contentDescription = "",
                )
//                Image(
//                    modifier = Modifier
//                        .size(30.dp)
//                        .clip(CircleShape)
//                        .background(color = Color.Gray)
//                        .clickable {
//                            // Open the dialog
//                            openDialog.value = true
//                        },
////                    painter = painterResource(id = R.drawable.logo),
//                    contentDescription = "Profile",
//                )
                if (openDialog.value) {
//                    AccountsDialog(
//                        openDialog = openDialog
//                    )
                }
            }
        }
    }
}
