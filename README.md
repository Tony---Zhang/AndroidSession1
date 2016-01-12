# Lesson 1
- 安卓环境搭建，Android Studio/SDK
- Support库介绍
Code部分/资源部分AppCompat
- Gradle浅谈，安卓的打包过程浅谈，Proguard介绍。
build.gradle ->  打包工程
- 目录结构
单元测试/UI测试/main部分/Manifest文件介绍（IntentFilter）
src目录结构/resource目录结构/R文件
- Hello World
Hello World是怎么构建的
- Layout(LinearLayout+RelativeLayout)
安卓的坐标系，LinearLayout线性布局（水平+垂直），RelativeLayout（相对布局）
- Bind view with layout resource id
Button怎么响应click事件
- Intent是什么机制
创建一个activity，activity栈机制，ActivityManager简介，activity相关的资源问题

# Homework
完成一个activity数据传递的任务。
A activity采用RelativeLayout，有一个EditText来输入数据，在EditText右下角有个按钮”GO”，点击GO按钮进入B activity， 采用LinearLayout，在布局中间有个TextView用于显示A的EditText的输入数据。



# Lesson 2
- Debug skill
Log VS System log; Debug & Attach Debug; Android developer menu; Hierarchyviewer
- ListView/RecycleView
ViewHolder原理
- Android异步处理
runOnUiThread(Runnable)
Handler
AsyncTask
Service(Intent Service)
RxJava

# Homework
完成数据加载并利用Recycler显示列表

大家利用AssetManager读取assets文件夹下的Json数据，绑定到Model的数据上，然后把数据传递给RecyclerView
在Recycler加一个header，显示用户自己的信息
Mock Up已经放到demo文件夹里面了
