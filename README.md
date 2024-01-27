# SuperSlidingPaneLayout
[![Download](https://img.shields.io/badge/download-App-blue.svg)](https://raw.githubusercontent.com/jenly1314/SuperSlidingPaneLayout/master/app/app-release.apk)
[![Jitpack](https://jitpack.io/v/jenly1314/SuperSlidingPaneLayout.svg)](https://jitpack.io/#jenly1314/SuperSlidingPaneLayout)
[![API](https://img.shields.io/badge/API-11%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=11)
[![License](https://img.shields.io/badge/license-Apche%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Blog](https://img.shields.io/badge/blog-Jenly-9933CC.svg)](http://blog.csdn.net/jenly121)

SuperSlidingPaneLayout是在SlidingPaneLayout的基础之上扩展修改，新增几种不同的侧滑效果，基本用法与SlidingPaneLayout一致。

## GIF展示

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

2. 在Module的 **build.gradle** 里面添加引入依赖项

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

更多使用详情请查看demo示例。

相关博文:http://blog.csdn.net/jenly121/article/details/52757409

## 赞赏
如果您喜欢SuperSlidingPaneLayout，或感觉SuperSlidingPaneLayout帮助到了您，可以点右上角“Star”支持一下，您的支持就是我的动力，谢谢 :smiley:
<p>您也可以扫描下面的二维码，请作者喝杯咖啡 :coffee:

<div>
   <img src="https://jenly1314.github.io/image/page/rewardcode.png">
</div>

## 关于我

| 我的博客                                                                                | GitHub                                                                                  | Gitee                                                                                  | CSDN                                                                                 | 博客园                                                                            |
|:------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------|
| <a title="我的博客" href="https://jenly1314.github.io" target="_blank">Jenly's Blog</a> | <a title="GitHub开源项目" href="https://github.com/jenly1314" target="_blank">jenly1314</a> | <a title="Gitee开源项目" href="https://gitee.com/jenly1314" target="_blank">jenly1314</a>  | <a title="CSDN博客" href="http://blog.csdn.net/jenly121" target="_blank">jenly121</a>  | <a title="博客园" href="https://www.cnblogs.com/jenly" target="_blank">jenly</a>  |

## 联系我

| 微信公众号        | Gmail邮箱                                                                          | QQ邮箱                                                                              | QQ群                                                                                                                       | QQ群                                                                                                                       |
|:-------------|:---------------------------------------------------------------------------------|:----------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------|
| [Jenly666](http://weixin.qq.com/r/wzpWTuPEQL4-ract92-R) | <a title="给我发邮件" href="mailto:jenly1314@gmail.com" target="_blank">jenly1314</a> | <a title="给我发邮件" href="mailto:jenly1314@vip.qq.com" target="_blank">jenly1314</a> | <a title="点击加入QQ群" href="https://qm.qq.com/cgi-bin/qm/qr?k=6_RukjAhwjAdDHEk2G7nph-o8fBFFzZz" target="_blank">20867961</a> | <a title="点击加入QQ群" href="https://qm.qq.com/cgi-bin/qm/qr?k=Z9pobM8bzAW7tM_8xC31W8IcbIl0A-zT" target="_blank">64020761</a> |

<div>
   <img src="https://jenly1314.github.io/image/page/footer.png">
</div>
