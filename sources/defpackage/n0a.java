package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n0a {
    public static final n0a a;
    public static final n0a b;
    public static final n0a c;
    public static final n0a d;
    public static final /* synthetic */ n0a[] e;

    static {
        n0a n0aVar = new n0a("AUDIO", 0);
        a = n0aVar;
        n0a n0aVar2 = new n0a("VIDEO", 1);
        b = n0aVar2;
        n0a n0aVar3 = new n0a("SCREEN_SHARING", 2);
        c = n0aVar3;
        n0a n0aVar4 = new n0a("MOVIE_SHARING", 3);
        d = n0aVar4;
        e = new n0a[]{n0aVar, n0aVar2, n0aVar3, n0aVar4};
    }

    public static n0a valueOf(String str) {
        return (n0a) Enum.valueOf(n0a.class, str);
    }

    public static n0a[] values() {
        return (n0a[]) e.clone();
    }
}
