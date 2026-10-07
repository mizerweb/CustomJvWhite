package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class u7h implements r7h {
    public static final u7h a;
    public static final /* synthetic */ u7h[] b;

    static {
        u7h u7hVar = new u7h("CANCELLED", 0);
        a = u7hVar;
        b = new u7h[]{u7hVar};
    }

    public static boolean a(long j) {
        if (j > 0) {
            return true;
        }
        tre.s0(new IllegalArgumentException(zo5.j(j, "n > 0 required but it was ")));
        return false;
    }

    public static u7h valueOf(String str) {
        return (u7h) Enum.valueOf(u7h.class, str);
    }

    public static u7h[] values() {
        return (u7h[]) b.clone();
    }

    @Override // defpackage.r7h
    public final void cancel() {
    }

    @Override // defpackage.r7h
    public final void f(long j) {
    }
}
