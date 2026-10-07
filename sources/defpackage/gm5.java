package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gm5 implements Executor {
    public static final gm5 a;
    public static final /* synthetic */ gm5[] b;

    static {
        gm5 gm5Var = new gm5("INSTANCE", 0);
        a = gm5Var;
        b = new gm5[]{gm5Var};
    }

    public static gm5 valueOf(String str) {
        return (gm5) Enum.valueOf(gm5.class, str);
    }

    public static gm5[] values() {
        return (gm5[]) b.clone();
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
