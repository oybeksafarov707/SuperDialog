# SuperDialog


[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![](https://jitpack.io/v/oybeksafarov77/superDialog.svg)](https://jitpack.io/#oybeksafarov77/superDialog)


* build.gradle 
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```


* gradle: 
```gradle
dependencies {
      implementation 'com.github.oybeksafarov77:superDialog:1.0.0'
}
```

# Usage

# ***Permission Dialog***

```
  SuperDialog(this).showPermissionDialog(object :SuperDialog.OnClick{
            override fun click(m: String) {

            }
        })
```


<a href="https://github.com/oybeksafarov77/SuperDialog/blob/master/images/image2.png" target="_blank"><img src="https://github.com/oybeksafarov77/SuperDialog/blob/master/images/image2.png" height="400">  </a> 



# ***Switch dialog***

```
  SuperDialog(this).showSwitchDialog(object :SuperDialog.OnClick{
            override fun click(m: String) {

            }
        })
```


<a href="https://github.com/oybeksafarov77/SuperDialog/blob/master/images/image1.png" target="_blank"><img src="https://github.com/oybeksafarov77/SuperDialog/blob/master/images/image1.png" height="400">  </a> 



# ***Date dialog***

```
  SuperDialog(this).showDateDialog(object :SuperDialog.OnClick{
            override fun click(m: String) {

            }
        })
```


<a href="https://github.com/oybeksafarov77/SuperDialog/blob/master/images/image3.png" target="_blank"><img src="https://github.com/oybeksafarov77/SuperDialog/blob/master/images/image3.png" height="400">  </a> 



# ***Google WiFi dialog***

```
  SuperDialog(this).showWiFiDialog(object :SuperDialog.OnClick{
            override fun click(m: String) {

            }
        })
```


<a href="https://github.com/oybeksafarov77/SuperDialog/blob/master/images/image4.png" target="_blank"><img src="https://github.com/oybeksafarov77/SuperDialog/blob/master/images/image4.png" height="400">  </a> 

 
