# SuperSlidingPaneLayout
[![Download](https://img.shields.io/badge/download-App-blue.svg)](https://raw.githubusercontent.com/jenly1314/SuperSlidingPaneLayout/master/app/app-release.apk)
[![Jitpack](https://jitpack.io/v/jenly1314/SuperSlidingPaneLayout.svg)](https://jitpack.io/#jenly1314/SuperSlidingPaneLayout)
[![API](https://img.shields.io/badge/API-11%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=11)
[![License](https://img.shields.io/badge/license-Apche%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Blog](https://img.shields.io/badge/blog-Jenly-9933CC.svg)](http://blog.csdn.net/jenly121)
[![QQGroup](https://img.shields.io/badge/QQGroup-20867961-blue.svg)](http://shang.qq.com/wpa/qunwpa?idkey=8fcc6a2f88552ea44b1411582c94fd124f7bb3ec227e2a400dbbfaad3dc2f5ad)

SuperSlidingPaneLayout是在SlidingPaneLayout的基础之上扩展修改，新增几种不同的侧滑效果，基本用法与SlidingPaneLayout一致。

![Image](https://github.com/jenly1314/SuperSlidingPaneLayout/blob/master/GIF.gif)


## 引入

### Maven：
```maven
<dependency>
  <groupId>com.king.view</groupId>
  <artifactId>superslidingpanelayout</artifactId>
  <version>1.1.0</version>
  <type>pom</type>
</dependency>
```
### Gradle:
```gradle
compile 'com.king.view:superslidingpanelayout:1.1.0'
```
### Lvy:
```lvy
<dependency org='com.king.view' name='superslidingpanelayout' rev='1.1.0'>
  <artifact name='$AID' ext='pom'></artifact>
</dependency>
```

###### 如果Gradle出现compile失败的情况，可以在Project的build.gradle里面添加如下：（也可以使用上面的GitPack来complie）
```gradle
allprojects {
    repositories {
        maven { url 'https://dl.bintray.com/jenly/maven' }
    }
}
```

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
如果您喜欢SuperSlidingPaneLayout，或感觉SuperSlidingPaneLayout帮助到了您，可以点右上角“Star”支持一下，您的支持就是我的动力，谢谢 :smiley:<p>
您也可以扫描下面的二维码，请作者喝杯咖啡 :coffee:
    <div>
        <img src="https://jenly1314.github.io/image/pay/wxpay.png" width="280" heght="350">
        <img src="https://jenly1314.github.io/image/pay/alipay.png" width="280" heght="350">
        <img src="https://jenly1314.github.io/image/pay/qqpay.png" width="280" heght="350">
        <img src="https://jenly1314.github.io/image/alipay_red_envelopes.jpg" width="233" heght="350">
    </div>

## 关于我
   Name: <a title="关于作者" href="https://about.me/jenly1314" target="_blank">Jenly</a>

   Email: <a title="欢迎邮件与我交流" href="mailto:jenly1314@gmail.com" target="_blank">jenly1314#gmail.com</a> / <a title="给我发邮件" href="mailto:jenly1314@vip.qq.com" target="_blank">jenly1314#vip.qq.com</a>

   CSDN: <a title="CSDN博客" href="http://blog.csdn.net/jenly121" target="_blank">jenly121</a>

   Github: <a title="Github开源项目" href="https://github.com/jenly1314" target="_blank">jenly1314</a>

   加入QQ群: <a title="点击加入QQ群" href="http://shang.qq.com/wpa/qunwpa?idkey=8fcc6a2f88552ea44b1411582c94fd124f7bb3ec227e2a400dbbfaad3dc2f5ad" target="_blank">20867961</a>
   <div>
       <img src="https://jenly1314.github.io/image/jenly666.png">
       <img src="https://jenly1314.github.io/image/qqgourp.png">
   </div>

