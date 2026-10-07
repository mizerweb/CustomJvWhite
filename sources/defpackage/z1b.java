package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z1b {
    public static final z1b a;
    public static final z1b b;
    public static final /* synthetic */ z1b[] c;

    static {
        z1b z1bVar = new z1b("MOVIE", 0);
        a = z1bVar;
        z1b z1bVar2 = new z1b("STREAM", 1);
        b = z1bVar2;
        c = new z1b[]{z1bVar, z1bVar2};
    }

    public static z1b valueOf(String str) {
        return (z1b) Enum.valueOf(z1b.class, str);
    }

    public static z1b[] values() {
        return (z1b[]) c.clone();
    }
}
