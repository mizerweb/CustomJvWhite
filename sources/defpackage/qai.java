package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qai implements Executor {
    public static final qai a;
    public static final Handler b;
    public static final /* synthetic */ qai[] c;

    static {
        qai qaiVar = new qai("INSTANCE", 0);
        a = qaiVar;
        c = new qai[]{qaiVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static qai valueOf(String str) {
        return (qai) Enum.valueOf(qai.class, str);
    }

    public static qai[] values() {
        return (qai[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
