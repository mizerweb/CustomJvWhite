package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class xa6 {
    public static final wa6 Companion = new wa6();
    public final String a;

    public /* synthetic */ xa6(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            shl.b(i, 1, va6.a.d());
            throw null;
        }
    }

    public xa6(String str) {
        this.a = str;
    }
}
