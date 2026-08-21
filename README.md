# Fan Animation App

🎥 **Watch the full tutorial:** [I Built This Fan App on My Phone — No PC! (ChatGPT + AIDE)](https://youtu.be/uAsW7LfXMHA)

A working Android app with a rotating fan animation, controlled by 5 buttons (On, Off, Slow, Medium, Fast). Built entirely on an Android phone — no PC, no laptop, no Android Studio.

---

## 🔧 How It Was Built

- **Code:** Generated using ChatGPT prompts, then reviewed, fixed, and compiled by me
- **Fan Image:** Hand-drawn by me in Sketchbook
- **Sound Effects:** Recorded and edited by me (yes, using a hair dryer!)
- **Compiler:**  AIDE — an Android IDE that runs on your phone
- **Language:** Java 7 (AIDE doesn't support AndroidX, Kotlin, or Java 8+ lambdas)

Everything — writing prompts, editing code, drawing, recording, and compiling — was done on a single Android phone.

---

## ⚠️ Caution: About AIDE

I use the AIDE app to compile Android projects and make my tutorials. AIDE has been removed from Google Play. If you download it from another source, only use a trusted site to avoid malware. You can also compile your project safely using GitHub instead.

---

## 📱 Download the App

Want to try it without building it yourself?

👉 [Download the APK](YOUR_GITHUB_RELEASES_LINK_HERE)

⚠️ This is a personal project APK, not published on Google Play. Android may show a warning before installing apps from outside the Play Store — this is normal. Only install if you trust the source (this repo).

---

## 📁 Project Structure

```
FanAnimation/
├── AndroidManifest.xml
├── src/
│   └── com/example/fananimation/
│       └── MainActivity.java
├── res/
│   ├── layout/
│   │   └── activity_main.xml
│   ├── drawable/
│   │   ├── fan.png
│   │   └── ic_launcher.png
│   └── raw/
│       ├── fan_slow.wav
│       ├── fan_medium.wav
│       └── fan_fast.wav
├── PROMPTS.md
└── README.md

```

---


> Note: Building against a much newer SDK (e.g. compileSdk 36) will compile fine in AIDE but may produce an APK that fails to install on-device. Stick to the settings above for AIDE compatibility.

---

## 🐛 Bugs I Ran Into (and Fixed)

While building this, I hit a few real errors — you can watch how I found and fixed each one in the video:
- A file naming mistake (named a file "Java" instead of "XML")
- A typo in an audio filename that caused an error 
- An "App not installed" error, caused by an incompatible `targetSdkVersion` for Android 16

---

## 🙌 Credits

- Fan artwork and sound effects created by me — feel free to reuse them in your own projects
- Code generated with help from ChatGPT, reviewed and fixed manually
- Built and compiled entirely using AIDE app

---

## 📺 More Tutorials

If this helped you, check out the [full video](https://youtu.be/uAsW7LfXMHA) and subscribe to **AppCraft Android** for more Android app tutorials — all built entirely on a phone, no PC needed.
