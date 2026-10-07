package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class epk implements Executor {
    public static final epk a;
    public static final /* synthetic */ epk[] b;

    static {
        epk epkVar = new epk("INSTANCE", 0);
        a = epkVar;
        b = new epk[]{epkVar};
    }

    public static epk[] values() {
        return (epk[]) b.clone();
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
