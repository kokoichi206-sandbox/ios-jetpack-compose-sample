//
///**
// * A wrapper around specific type of strings.
// */
//sealed class UiText {
//    data class DynamicString(val value: String) : UiText()
//    class StringResource(
//        @StringRes val id: Int,
//        val args: Array<Any> = emptyArray(),
//    ) : UiText()
//
//    @Composable
//    fun asString(): String {
//        return when (this) {
//            is DynamicString -> value
//            is StringResource -> stringResource(id, args)
//        }
//    }
//}
