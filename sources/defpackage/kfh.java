package defpackage;

import android.os.Build;
import android.util.Log;
import com.facebook.soloader.SoLoader;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kfh {
    public static void a(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        qr7.k(zo5.m(file, "Could not delete file "));
    }

    public static void b(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                a(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a((File) arrayList.get(size));
        }
    }

    public static void c(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    qr7.k(zo5.m(file2, "cannot list directory "));
                    return;
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    Log.e("SysUtil", "Syncing failed for " + file2 + ": " + e.getMessage());
                }
            }
        }
    }

    public static pr6 d(File file, File file2) throws Throwable {
        boolean z;
        try {
            return new pr6(file2);
        } catch (FileNotFoundException e) {
            z = true;
            try {
                if (!file.setWritable(true)) {
                    throw e;
                }
                pr6 pr6Var = new pr6(file2);
                if (!file.setWritable(false)) {
                    Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                return pr6Var;
            } catch (Throwable th) {
                th = th;
                if (z && !file.setWritable(false)) {
                    Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
            qr7.q(classLoader.getClass().getName(), " should be of type BaseDexClassLoader", "ClassLoader ");
            return null;
        }
        try {
            return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
        } catch (Exception e) {
            Log.e("SysUtil", "Cannot call getLdLibraryPath", e);
            return null;
        }
    }

    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("SysUtil", "Cannot get nativeLoad method", e);
            return null;
        }
    }
}
