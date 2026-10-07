package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class up {
    public static final up a;
    public static final up b;
    public static final up c;
    public static final up d;
    public static final /* synthetic */ up[] e;

    static {
        up upVar = new up("NONE", 0);
        a = upVar;
        up upVar2 = new up("APPLICATION", 1);
        b = upVar2;
        up upVar3 = new up("OPT_SESSION", 2);
        c = upVar3;
        up upVar4 = new up("SESSION", 3);
        d = upVar4;
        e = new up[]{upVar, upVar2, upVar3, upVar4};
    }

    public static up valueOf(String str) {
        return (up) Enum.valueOf(up.class, str);
    }

    public static up[] values() {
        return (up[]) e.clone();
    }
}
