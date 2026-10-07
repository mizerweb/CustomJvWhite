package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x98 implements nwh {
    public static final x98 b;
    public final String a;

    static {
        x98[] x98VarArr = new x98[np0.n];
        for (int i = 0; i < 256; i++) {
            x98VarArr[i] = new x98((byte) i);
        }
        b = x98VarArr[0];
    }

    public x98(byte b2) {
        int i = b2 & 255;
        char[] cArr = uic.a;
        this.a = new String(new char[]{cArr[i], cArr[i | np0.n]});
    }

    public final String toString() {
        return this.a;
    }
}
