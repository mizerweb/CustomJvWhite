package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o0a {
    public static final o0a a;
    public static final o0a b;
    public static final o0a c;
    public static final o0a d;
    public static final /* synthetic */ o0a[] e;

    static {
        o0a o0aVar = new o0a("UNMUTED", 0);
        a = o0aVar;
        o0a o0aVar2 = new o0a("UNMUTED_BUT_MUTED_ONCE", 1);
        b = o0aVar2;
        o0a o0aVar3 = new o0a("MUTED_PERMANENT", 2);
        c = o0aVar3;
        o0a o0aVar4 = new o0a("MUTED_PERMANENT_BUT_UNMUTED_ONCE", 3);
        d = o0aVar4;
        e = new o0a[]{o0aVar, o0aVar2, o0aVar3, o0aVar4};
    }

    public static o0a valueOf(String str) {
        return (o0a) Enum.valueOf(o0a.class, str);
    }

    public static o0a[] values() {
        return (o0a[]) e.clone();
    }
}
