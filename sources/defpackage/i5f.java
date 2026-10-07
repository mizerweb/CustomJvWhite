package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class i5f {
    public static final i5f a;
    public static final i5f b;
    public static final i5f c;
    public static final /* synthetic */ i5f[] d;

    static {
        i5f i5fVar = new i5f("TOP", 0);
        a = i5fVar;
        i5f i5fVar2 = new i5f("BOTTOM", 1);
        b = i5fVar2;
        i5f i5fVar3 = new i5f("CENTER", 2);
        c = i5fVar3;
        d = new i5f[]{i5fVar, i5fVar2, i5fVar3};
    }

    public static i5f valueOf(String str) {
        return (i5f) Enum.valueOf(i5f.class, str);
    }

    public static i5f[] values() {
        return (i5f[]) d.clone();
    }
}
