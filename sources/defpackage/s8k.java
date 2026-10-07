package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class s8k extends o8k {
    public int a;

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.a) + 1;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        ma4 ma4Var;
        String str;
        b6k b6kVar = z7kVar.G;
        byte[] bArrV = pbkVar.v();
        b6kVar.getClass();
        if (this.a > ((Integer) b6kVar.d.a.keySet().stream().max(new ps0(28)).get()).intValue()) {
            ma4Var = b6kVar.c;
            str = "invalid connection ID sequence number";
        } else {
            int i = this.a;
            if (!Arrays.equals(((z5k) b6kVar.d.a.get(Integer.valueOf(i))).b, bArrV)) {
                if (b6kVar.d.a(i) == null || b6kVar.d.b().size() >= b6kVar.h) {
                    return;
                }
                b6kVar.a();
                return;
            }
            ma4Var = b6kVar.c;
            str = "cannot retire current connection ID";
        }
        ma4Var.accept(10, str);
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 25);
        ti8.a(this.a, byteBuffer);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s8k) && ((s8k) obj).a == this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "RetireConnectionIdFrame[", "]");
    }
}
