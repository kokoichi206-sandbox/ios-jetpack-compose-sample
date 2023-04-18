Compose Multiplatform for iOS は [KotlinConf23 で発表](https://www.youtube.com/watch?v=c4f4SCEYA5Q&t=3314s)されました。

## links

- [Alpha Release of Jetpack Compose Multiplatform for iOS: A Gamechanger for Mobile Development](https://medium.com/@dheerubhadoria/alpha-release-of-jetpack-compose-multiplatform-for-ios-a-gamechanger-for-mobile-development-388f90118ec6)
- [compose-multiplatform-template](https://github.com/JetBrains/compose-multiplatform-template)

## Xcode requires to perform the First Launch tasks

``` sh
❯ kdoctor
Environment diagnose (to see all details, use -v option):                                                                                       ─╯
[✓] Operation System
[✓] Java
[✓] Android Studio
[✖] Xcode
  ✖ Xcode requires to perform the First Launch tasks
    Launch Xcode and complete setup
```

``` sh
sudo xcode-select -s /Applications/Xcode.app/Contents/Developer
```

https://github.com/Kotlin/kdoctor/issues/34

## System ruby is currently used

```shell
export PATH=/opt/homebrew/opt/ruby@3/bin:/opt/homebrew/lib/ruby/gems/3.2.0/bin:$PATH
```

https://stackoverflow.com/questions/64901180/how-to-run-cocoapods-on-apple-silicon-m1/66556339#66556339

## CoreSimulator.framework was changed while the process was running.

```shell
CoreSimulator.framework was changed while the process was running.
This is not a supported configuration and can occur if Xcode.app was updated while the process was running.
Service version (885.2) does not match expected service version (857.13).
```

https://youtrack.jetbrains.com/issue/KT-52228


## 実装

https://github.com/JetBrains/compose-multiplatform-template
