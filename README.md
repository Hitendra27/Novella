# 📚 Novella App

**Novella** is a modern Android application built with **Jetpack Compose** and the **MVVM architecture**, designed to display a list of novellas and their detailed content. The app showcases modern Android development best practices, clean architecture, and reactive state management.

---

## ✨ Features

- 📚 **Novella Home Screen** – Displays a list of novellas
- 📖 **Novella Detail Screen** – Shows title, description, and full content of a selected novella
- 🧠 **MVVM Architecture** – Clean separation of concerns
- 🔄 **Reactive State Management** – Built using `ViewModel` and `StateFlow`
- 🚀 **Jetpack Compose Navigation** – Type-safe, scalable navigation
- 🎨 **Material 3 UI** – Responsive and accessible UI with Material You

---

## Screenshots of the Novella app

---

## 🧰 Tech Stack

| Layer             | Tech                                     |
|------------------|------------------------------------------|
| UI               | [Jetpack Compose](https://developer.android.com/jetpack/compose) |
| Architecture     | MVVM                                     |
| State Management | `ViewModel`, `StateFlow`                 |
| Navigation       | [Navigation-Compose](https://developer.android.com/jetpack/compose/navigation) |
| Design System    | Material 3                               |
| Language         | Kotlin                                   |
| Min SDK          | 24                                       |

---

## 🧪 Testing
The project includes both unit tests and UI tests using Jetpack Compose testing APIs.

## 🧱 Included Tests
✅ NovellaViewModelTest – Verifies state changes and business logic

✅ NovellaHomeScreenTest – Tests list display and item clicks

✅ NovellaDetailScreenTest – Validates UI rendering of selected novella

## 🧪 Testing Libraries Used
- junit

- androidx.compose.ui.test.junit4

- androidx.arch.core:core-testing

- kotlinx.coroutines-test

## 🔐 Permissions
If using remote data:
```
<uses-permission android:name="android.permission.INTERNET" />
```


## 📝 License
This project is licensed under the MIT License.
See the LICENSE file for details.

## 🤝 Contributions
Contributions are welcome!
Please open an issue or submit a pull request if you'd like to improve this project.

📬 Contact
Have questions or feedback?



