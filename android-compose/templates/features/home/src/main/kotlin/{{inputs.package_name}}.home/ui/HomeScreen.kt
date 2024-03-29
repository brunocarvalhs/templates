package {{inputs.package_name}}.home.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import {{inputs.package_name}}.commons.theme.{{app_name}}Theme


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    {{app_name}}Theme {
        Greeting("Android")
    }
}