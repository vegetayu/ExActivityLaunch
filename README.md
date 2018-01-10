
> 用 adb shell dumpsys activity | com.capsule.exal 命令查看Activity栈

## standard

每次创建新的实例
```
        Run #7: ActivityRecord{39c9cdc u0 com.capsule.exal/.Standard_A_Activity t13454}
        Run #6: ActivityRecord{7e32b98 u0 com.capsule.exal/.Standard_A_Activity t13454}
        Run #5: ActivityRecord{a131314 u0 com.capsule.exal/.Standard_A_Activity t13454}
        Run #4: ActivityRecord{8226f50 u0 com.capsule.exal/.Standard_A_Activity t13454}
        Run #3: ActivityRecord{45e1c4c u0 com.capsule.exal/.Standard_A_Activity t13454}
        Run #2: ActivityRecord{a6e18df u0 com.capsule.exal/.MainActivity t13454}
```

## singleTop:

1.若不在栈顶，则与standard模式行为相同。
2.若在栈顶，则不新建Activity，而调用`onNewIntent()`，并且，不会调用`onStart()`或`onRestart()`，只会调用`onResume()`。

## singleTask

1.同一个栈中只有一个实例
2.启动时会将标志设为 FLAG_ACTIVITY_NEW_TASK，此时会检查 affinity属性，若具有该属性的栈不存在，则新建栈，否则，将Activity加入已存在的栈。（这说明，不同应用的Activity可以在同一个栈中）


## singleInstance

在Android系统中，只会有一个实例，并独占一个栈。