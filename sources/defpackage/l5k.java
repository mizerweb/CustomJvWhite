package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes3.dex */
public final class l5k extends o8k {
    public long a;
    public boolean b;

    public l5k(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.a) + 1;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        int iLongValue;
        Semaphore semaphore;
        zak zakVar = z7kVar.E;
        zakVar.getClass();
        boolean z = this.b;
        long j = this.a;
        if (z) {
            if (j <= zakVar.j.longValue()) {
                return;
            }
            iLongValue = (int) (this.a - zakVar.j.longValue());
            zakVar.j = Long.valueOf(this.a);
            semaphore = zakVar.l;
        } else {
            if (j <= zakVar.k.longValue()) {
                return;
            }
            iLongValue = (int) (this.a - zakVar.k.longValue());
            zakVar.k = Long.valueOf(this.a);
            semaphore = zakVar.m;
        }
        semaphore.release(iLongValue);
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.b ? 18 : 19));
        ti8.c(this.a, byteBuffer);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.a, "MaxStreamsFrame[", this.b ? "B" : "U", ",");
        sbB.append("]");
        return sbB.toString();
    }
}
