package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f0d {
    public static final f0d a;
    public static final f0d b;
    public static final /* synthetic */ f0d[] c;

    static {
        f0d f0dVar = new f0d("COVER", 0);
        a = f0dVar;
        f0d f0dVar2 = new f0d("FIT", 1);
        b = f0dVar2;
        c = new f0d[]{f0dVar, f0dVar2};
    }

    public static f0d valueOf(String str) {
        return (f0d) Enum.valueOf(f0d.class, str);
    }

    public static f0d[] values() {
        return (f0d[]) c.clone();
    }
}
