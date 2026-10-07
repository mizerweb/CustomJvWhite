package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface d8h {
    int F();

    default v7h h(int i, byte[] bArr, int i2) {
        z88 z88VarL = c98.l();
        k(bArr, 0, i2, c8h.c, new vuf(10, z88VarL));
        return new cz4(z88VarL.h());
    }

    void k(byte[] bArr, int i, int i2, c8h c8hVar, qg4 qg4Var);

    default void reset() {
    }
}
