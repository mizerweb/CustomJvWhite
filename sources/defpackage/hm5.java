package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hm5 implements Executor {
    public static final hm5 a;
    public static final /* synthetic */ hm5[] b;

    static {
        hm5 hm5Var = new hm5("INSTANCE", 0);
        a = hm5Var;
        b = new hm5[]{hm5Var};
    }

    public static hm5 valueOf(String str) {
        return (hm5) Enum.valueOf(hm5.class, str);
    }

    public static hm5[] values() {
        return (hm5[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
