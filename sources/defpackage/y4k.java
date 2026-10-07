package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y4k extends Enum {
    public static final y4k a;
    public static final y4k b;
    public static final y4k c;
    public static final /* synthetic */ y4k[] d;

    static {
        y4k y4kVar = new y4k("Initial", 0);
        a = y4kVar;
        y4k y4kVar2 = new y4k("Handshake", 1);
        b = y4kVar2;
        y4k y4kVar3 = new y4k("App", 2);
        c = y4kVar3;
        d = new y4k[]{y4kVar, y4kVar2, y4kVar3};
    }

    public static y4k valueOf(String str) {
        return (y4k) Enum.valueOf(y4k.class, str);
    }

    public static y4k[] values() {
        return (y4k[]) d.clone();
    }

    public final w4k a() {
        int i = x4k.a[ordinal()];
        if (i == 1) {
            return w4k.a;
        }
        if (i == 2) {
            return w4k.c;
        }
        if (i != 3) {
            return null;
        }
        return w4k.d;
    }
}
