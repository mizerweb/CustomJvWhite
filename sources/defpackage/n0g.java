package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n0g {
    public static final n0g a;
    public static final n0g b;
    public static final /* synthetic */ n0g[] c;

    static {
        n0g n0gVar = new n0g("NONE", 0);
        a = n0gVar;
        n0g n0gVar2 = new n0g("SURFACE", 1);
        b = n0gVar2;
        c = new n0g[]{n0gVar, n0gVar2};
    }

    public static n0g valueOf(String str) {
        return (n0g) Enum.valueOf(n0g.class, str);
    }

    public static n0g[] values() {
        return (n0g[]) c.clone();
    }
}
