package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b1d {
    public static final b1d a;
    public static final b1d b;
    public static final /* synthetic */ b1d[] c;

    static {
        b1d b1dVar = new b1d("TOP", 0);
        a = b1dVar;
        b1d b1dVar2 = new b1d("BOTTOM", 1);
        b = b1dVar2;
        c = new b1d[]{b1dVar, b1dVar2};
    }

    public static b1d valueOf(String str) {
        return (b1d) Enum.valueOf(b1d.class, str);
    }

    public static b1d[] values() {
        return (b1d[]) c.clone();
    }
}
