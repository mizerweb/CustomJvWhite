package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l66 implements o1e {
    public static final l66 a;
    public static final /* synthetic */ l66[] b;

    static {
        l66 l66Var = new l66("INSTANCE", 0);
        a = l66Var;
        b = new l66[]{l66Var, new l66("NEVER", 1)};
    }

    public static void a(Throwable th, s8g s8gVar) {
        s8gVar.c(a);
        s8gVar.onError(th);
    }

    public static l66 valueOf(String str) {
        return (l66) Enum.valueOf(l66.class, str);
    }

    public static l66[] values() {
        return (l66[]) b.clone();
    }

    @Override // defpackage.b7g
    public final void clear() {
    }

    @Override // defpackage.ko5
    public final void dispose() {
    }

    @Override // defpackage.b7g
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.p1e
    public final int k() {
        return 2;
    }

    @Override // defpackage.b7g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.b7g
    public final Object poll() {
        return null;
    }
}
