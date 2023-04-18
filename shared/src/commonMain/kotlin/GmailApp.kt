import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    val scrollState = rememberScrollState()

    val openDialog = remember {
        mutableStateOf(false)
    }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            HomeAppBar(
                scaffoldState = scaffoldState,
                scope = coroutineScope,
                openDialog = openDialog,
            )
        },
        drawerContent = {
            DrawableMenu(
                scrollState = scrollState,
            )
        },
        bottomBar = {
            HomeBottomMenu()
        },
        floatingActionButton = {
            GmailFab(
                scrollState = scrollState,
            )
        },
    ) {
        // Can use 'it' as PaddingValues !!!
        // Bottom bar height !
        MailList(
            paddingValues = it,
            scrollState = scrollState,
        )
    }
}
