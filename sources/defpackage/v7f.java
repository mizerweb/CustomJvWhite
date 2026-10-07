package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v7f {
    public static final v7f a;
    public static final /* synthetic */ v7f[] b;

    static {
        v7f v7fVar = new v7f("FIND_BY_PHONE", 0);
        a = v7fVar;
        b = new v7f[]{v7fVar};
    }

    public static v7f valueOf(String str) {
        return (v7f) Enum.valueOf(v7f.class, str);
    }

    public static v7f[] values() {
        return (v7f[]) b.clone();
    }
}
