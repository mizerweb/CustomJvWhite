package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r5j {
    public static final r5j a;
    public static final r5j b;
    public static final /* synthetic */ r5j[] c;

    static {
        r5j r5jVar = new r5j("ASPECT_RATIO", 0);
        a = r5jVar;
        r5j r5jVar2 = new r5j("FILL", 1);
        b = r5jVar2;
        c = new r5j[]{r5jVar, r5jVar2};
    }

    public static r5j valueOf(String str) {
        return (r5j) Enum.valueOf(r5j.class, str);
    }

    public static r5j[] values() {
        return (r5j[]) c.clone();
    }
}
