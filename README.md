# Minutes Life

A small Android app, written in Kotlin, that tells you how old you are in minutes. Pick your birthday from a calendar and it shows the minutes that have passed since that date.

<p>
<img src="https://github.com/pranaylachuluri/Minutes-Life-App/assets/103355762/cf785557-5350-4dce-b820-da7caf7c86d5" width="200" alt="Home screen">
<img src="https://github.com/pranaylachuluri/Minutes-Life-App/assets/103355762/715734a8-72ef-4cd3-b91c-f2cb28ff4796" width="200" alt="Date picker">
<img src="https://github.com/pranaylachuluri/Minutes-Life-App/assets/103355762/bb3c311e-5ce9-4984-9527-cbc50995c95a" width="200" alt="Selecting a birthday">
<img src="https://github.com/pranaylachuluri/Minutes-Life-App/assets/103355762/d0c19556-c163-448f-958e-5c6a0751710b" width="200" alt="Age in minutes">
</p>

## How it works

1. Tap **SELECT DATE** to open a `DatePickerDialog`. Future dates are blocked.
2. The app parses the chosen date with `SimpleDateFormat` and converts it to minutes since the epoch.
3. It does the same for today and shows the difference.

All the logic is in `MainActivity.kt`, and the layout is in `activity_main.xml`.

## Built with

- Kotlin
- Android SDK (AppCompat, ConstraintLayout)
- Android Studio
