package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class l9i {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final ljf b;
    public volatile int c = 0;

    public l9i(ljf ljfVar, int i) {
        this.b = ljfVar;
        this.a = i;
    }

    public final int a(int i) {
        swa swaVarB = b();
        int iA = swaVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = swaVarB.b;
        int i2 = iA + swaVarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final swa b() {
        ThreadLocal threadLocal = d;
        swa swaVar = (swa) threadLocal.get();
        if (swaVar == null) {
            swaVar = new swa();
            threadLocal.set(swaVar);
        }
        twa twaVar = (twa) this.b.b;
        int iA = twaVar.a(6);
        if (iA != 0) {
            int i = iA + twaVar.a;
            int i2 = (this.a * 4) + twaVar.b.getInt(i) + i + 4;
            int i3 = twaVar.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = twaVar.b;
            swaVar.b = byteBuffer;
            if (byteBuffer != null) {
                swaVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                swaVar.c = i4;
                swaVar.d = swaVar.b.getShort(i4);
                return swaVar;
            }
            swaVar.a = 0;
            swaVar.c = 0;
            swaVar.d = 0;
        }
        return swaVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        swa swaVarB = b();
        int iA = swaVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? swaVarB.b.getInt(iA + swaVarB.a) : 0));
        sb.append(", codepoints:");
        swa swaVarB2 = b();
        int iA2 = swaVarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + swaVarB2.a;
            i = swaVarB2.b.getInt(swaVarB2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
