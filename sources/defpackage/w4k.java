package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w4k {
    public static final w4k a;
    public static final w4k b;
    public static final w4k c;
    public static final w4k d;
    public static final /* synthetic */ w4k[] e;

    static {
        w4k w4kVar = new w4k("Initial", 0);
        a = w4kVar;
        w4k w4kVar2 = new w4k("ZeroRTT", 1);
        b = w4kVar2;
        w4k w4kVar3 = new w4k("Handshake", 2);
        c = w4kVar3;
        w4k w4kVar4 = new w4k("App", 3);
        d = w4kVar4;
        e = new w4k[]{w4kVar, w4kVar2, w4kVar3, w4kVar4};
    }

    public static w4k valueOf(String str) {
        return (w4k) Enum.valueOf(w4k.class, str);
    }

    public static w4k[] values() {
        return (w4k[]) e.clone();
    }

    public final y4k a() {
        int i = v4k.a[ordinal()];
        y4k y4kVar = y4k.c;
        if (i == 1) {
            return y4kVar;
        }
        if (i == 2) {
            return y4k.a;
        }
        if (i == 3) {
            return y4k.b;
        }
        if (i != 4) {
            return null;
        }
        return y4kVar;
    }
}
