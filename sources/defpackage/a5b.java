package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a5b {
    public static final a5b a;
    public static final a5b b;
    public static final /* synthetic */ a5b[] c;

    static {
        a5b a5bVar = new a5b("PRIMARY", 0);
        a = a5bVar;
        a5b a5bVar2 = new a5b("SECONDARY", 1);
        b = a5bVar2;
        c = new a5b[]{a5bVar, a5bVar2};
    }

    public static a5b valueOf(String str) {
        return (a5b) Enum.valueOf(a5b.class, str);
    }

    public static a5b[] values() {
        return (a5b[]) c.clone();
    }
}
