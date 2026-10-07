package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wxl {
    public static void a() {
        qyj.l("Not in application's main thread", c());
    }

    public static final void b(File file, cf7 cf7Var) {
        try {
            iu6.b(file);
        } catch (Exception e) {
            if (cf7Var != null) {
                cf7Var.invoke("Exception during file deleting: " + e.getMessage());
            }
        }
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            qyj.l("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
