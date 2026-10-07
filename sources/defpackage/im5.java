package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class im5 implements Executor {
    public static final im5 a;
    public static final /* synthetic */ im5[] b;

    static {
        im5 im5Var = new im5("INSTANCE", 0);
        a = im5Var;
        b = new im5[]{im5Var};
    }

    public static im5 valueOf(String str) {
        return (im5) Enum.valueOf(im5.class, str);
    }

    public static im5[] values() {
        return (im5[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
