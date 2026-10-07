package defpackage;

import java.nio.ByteBuffer;
import java.util.Objects;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public final class k5k extends o8k {
    public final /* synthetic */ int a;
    public int b;
    public long c;

    public k5k(int i, long j) {
        this.a = 0;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.o8k
    public final int a() {
        int iB;
        int iB2;
        switch (this.a) {
            case 0:
                iB = ti8.b(this.b) + 1;
                iB2 = ti8.b(this.c);
                break;
            case 1:
                iB = ti8.b(this.b) + 1;
                iB2 = ti8.b(this.c);
                break;
            default:
                iB = ti8.b(this.b) + 1;
                iB2 = ti8.b(this.c);
                break;
        }
        return iB2 + iB;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        switch (this.a) {
            case 0:
                try {
                    z7kVar.o.a(this);
                } catch (bJ e) {
                    z7kVar.e(ewi.c(e.a), null, 1);
                    return;
                }
                break;
            case 1:
                pak pakVar = (pak) z7kVar.E.a.get(Integer.valueOf(this.b));
                if (pakVar != null) {
                    pakVar.f.b(this.c);
                }
                break;
            default:
                Objects.toString(this);
                break;
        }
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                byteBuffer.put((byte) 17);
                ti8.a(this.b, byteBuffer);
                ti8.c(this.c, byteBuffer);
                break;
            case 1:
                byteBuffer.put((byte) 5);
                ti8.a(this.b, byteBuffer);
                ti8.c(this.c, byteBuffer);
                break;
            default:
                byteBuffer.put((byte) 21);
                ti8.a(this.b, byteBuffer);
                ti8.c(this.c, byteBuffer);
                break;
        }
    }

    public void i(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.b = o8k.e(byteBuffer);
        this.c = ti8.h(byteBuffer);
    }

    public void k(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.b = o8k.e(byteBuffer);
        this.c = ti8.h(byteBuffer);
    }

    public void m(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.b = o8k.e(byteBuffer);
        this.c = ti8.h(byteBuffer);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sbX = zo5.x(this.b, this.c, "MaxStreamDataFrame[", ":");
                sbX.append("]");
                return sbX.toString();
            case 1:
                StringBuilder sbX2 = zo5.x(this.b, this.c, "StopSendingFrame[", ":");
                sbX2.append("]");
                return sbX2.toString();
            default:
                StringBuilder sbX3 = zo5.x(this.b, this.c, "StreamDataBlockedFrame[", "|");
                sbX3.append("]");
                return sbX3.toString();
        }
    }

    public /* synthetic */ k5k(int i) {
        this.a = i;
    }
}
