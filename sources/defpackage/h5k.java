package defpackage;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h5k extends o8k {
    public final /* synthetic */ int a;
    public long b;

    public /* synthetic */ h5k(int i) {
        this.a = i;
    }

    @Override // defpackage.o8k
    public final int a() {
        int iB;
        switch (this.a) {
            case 0:
                iB = ti8.b(this.b);
                break;
            default:
                iB = ti8.b(this.b);
                break;
        }
        return iB + 1;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        switch (this.a) {
            case 0:
                Objects.toString(this);
                return;
            default:
                mak makVar = z7kVar.o;
                synchronized (makVar) {
                    try {
                        long j = this.b;
                        long j2 = makVar.e;
                        if (j > j2) {
                            boolean z = j2 == makVar.f;
                            makVar.e = j;
                            if (z) {
                                makVar.i.forEach(new ma4(6, makVar));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                byteBuffer.put((byte) 20);
                ti8.c(this.b, byteBuffer);
                break;
            default:
                byteBuffer.put((byte) 16);
                ti8.c(this.b, byteBuffer);
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return nbh.s(this.b, "DataBlockedFrame[", "]");
            default:
                return nbh.s(this.b, "MaxDataFrame[", "]");
        }
    }
}
