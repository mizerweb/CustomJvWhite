package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bsb {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int a;
    public int b;
    public Object c;

    public bsb(int i, eg4 eg4Var, int i2) {
        this.a = i;
        this.c = eg4Var;
        this.b = i2;
    }

    public static void b(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(l0m.a(i2));
    }

    public void a(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        int i3 = this.a;
        zf4 zf4VarG = eg4Var.g(i2);
        switch (i3) {
            case 1:
                zf4VarG.d.F = i;
                break;
            case 2:
                zf4VarG.d.G = i;
                break;
            case 3:
                zf4VarG.d.H = i;
                break;
            case 4:
                zf4VarG.d.I = i;
                break;
            case 5:
                zf4VarG.d.L = i;
                break;
            case 6:
                zf4VarG.d.K = i;
                break;
            case 7:
                zf4VarG.d.J = i;
                break;
            default:
                ore.p("unknown constraint");
                break;
        }
    }
}
