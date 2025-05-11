# SuperSlidingPaneLayout

[![JitPack](https://img.shields.io/jitpack/v/github/jenly1314/SuperSlidingPaneLayout?logo=jitpack)](https://jitpack.io/#jenly1314/SuperSlidingPaneLayout)
[![Download](https://img.shields.io/badge/download-APK-brightgreen?logo=github)](https://raw.githubusercontent.com/jenly1314/SuperSlidingPaneLayout/master/app/app-release.apk)
[![API](https://img.shields.io/badge/API-11%2B-brightgreen?logo=android)](https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels)
[![License](https://img.shields.io/github/license/jenly1314/SuperSlidingPaneLayout?logo=open-source-initiative)](https://opensource.org/licenses/apache-2-0)

SuperSlidingPaneLayout是在SlidingPaneLayout的基础之上扩展修改，新增几种不同的侧滑效果，基本用法与SlidingPaneLayout一致。

## 效果展示

![Image](https://github.com/jenly1314/SuperSlidingPaneLayout/blob/master/GIF.gif)

> 你也可以直接下载 [演示App](https://raw.githubusercontent.com/jenly1314/SuperSlidingPaneLayout/master/app/app-release.apk) 体验效果

## 引入

### Gradle:

1. 在Project的 **build.gradle** 或 **setting.gradle** 中添加远程仓库

    ```gradle
    repositories {
        //...
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
    ```

2. 在Module的 **build.gradle** 中添加依赖项

    ```gradle
     implementation 'com.github.jenly1314:SuperSlidingPaneLayout:1.1.0'
    ```

## 使用

使用布局示例：
```Xml
<?xml version="1.0" encoding="utf-8"?>
<com.king.view.superslidingpanelayout.SuperSlidingPaneLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/superSlidingPaneLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/menu_bg1"
    app:mode="default_"
    app:compat_sliding="false">
    <include layout="@layout/menu_layout"/>
    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <include layout="@layout/top_title_bar"/>
        <TextView
            android:id="@+id/tvMode"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="@android:color/white"
            android:gravity="center"
            android:text="Default"
            android:textSize="24sp"/>
    </LinearLayout>

</com.king.view.superslidingpanelayout.SuperSlidingPaneLayout>

```


代码设置侧滑模式效果：
```Java
        superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.DEFAULT);
        
        superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.TRANSLATION);
        
        superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.SCALE_MENU);
        
        superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.SCALE_PANEL);
        
        superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.SCALE_BOTH);
```

更多使用详情，请查看[app](app)中的源码使用示例或直接查看[API帮助文档](https://jitpack.io/com/github/jenly1314/SuperSlidingPaneLayout/latest/javadoc/)

相关博文：[传送门](http://blog.csdn.net/jenly121/article/details/52757409)

## 相关推荐
- [SuperSwipeRefreshLayout](https://github.com/jenly1314/SuperSwipeRefreshLayout) 是在SwipeRefreshLayout的基础之上扩展修改，让其支持上拉刷新，基本用法与SwipeRefreshLayout一致。

---

![footer](https://jenly1314.github.io/page/footer.svg)
