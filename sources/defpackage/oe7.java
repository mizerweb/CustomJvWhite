package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oe7 implements h68 {
    public static final oe7 a = new oe7();
    public static final byte[] b;
    public static final byte[] c;
    public static final int d;

    static {
        int length = "<svg".getBytes(pt2.b).length;
        b = qe7.j("<svg");
        c = qe7.j("<?xm");
        d = length;
    }

    @Override // defpackage.h68
    public final i68 a(int i, byte[] bArr) {
        return (qe7.x(bArr, b, 0) || qe7.x(bArr, c, 0)) ? wk8.b : i68.c;
    }

    @Override // defpackage.h68
    public final int b() {
        return d;
    }
}
