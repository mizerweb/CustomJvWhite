package com.facebook.soloader;

import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
final class SysUtil$MarshmallowSysdeps {
    public static String[] getSupportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        if (is64Bit()) {
            treeSet.add("arm64-v8a");
            treeSet.add("x86_64");
        } else {
            treeSet.add("armeabi-v7a");
            treeSet.add("x86");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (treeSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean is64Bit() {
        return Process.is64Bit();
    }
}
