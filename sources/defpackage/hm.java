package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class hm implements bwe {
    public final nl a;
    public final d0c b;
    public f25 c;

    public hm(nl nlVar, d0c d0cVar) {
        d0cVar.getClass();
        this.a = nlVar;
        this.b = d0cVar;
    }

    @Override // defpackage.bwe
    public final void a(f25 f25Var, byte[] bArr, int i) {
        Object rlVar;
        if (i == 0) {
            throw null;
        }
        SystemClock.elapsedRealtime();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte b = byteBufferWrap.get();
        byteBufferWrap.getShort();
        byteBufferWrap.getInt();
        int i2 = b == 1 ? byteBufferWrap.getShort() & 65535 : byteBufferWrap.getInt();
        byte b2 = byteBufferWrap.get();
        ByteBuffer byteBufferSlice = byteBufferWrap.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        int i3 = 0;
        if (b == 1) {
            int iRemaining = byteBufferSlice.remaining() / 4;
            float[] fArr = new float[iRemaining];
            while (i3 < iRemaining) {
                fArr[i3] = byteBufferSlice.getFloat();
                i3++;
            }
            rlVar = new rl(fArr);
        } else if (b2 == 0) {
            int iRemaining2 = byteBufferSlice.remaining();
            float[] fArr2 = new float[iRemaining2];
            while (i3 < iRemaining2) {
                fArr2[i3] = (byteBufferSlice.get() & 255) * 0.003921569f;
                i3++;
            }
            rlVar = new rl(fArr2);
        } else if (b2 != 1) {
            rlVar = b2 != 2 ? new vl() : new tl(Color.rgb(byteBufferSlice.get() & 255, byteBufferSlice.get() & 255, byteBufferSlice.get() & 255));
        } else {
            rlVar = ul.a;
        }
        mf mfVar = new mf(i2, rlVar, 1);
        ((AtomicInteger) this.b.f).incrementAndGet();
        ((AtomicInteger) this.b.e).addAndGet(bArr.length);
        nl nlVar = this.a;
        if (nlVar.i) {
            km kmVar = nlVar.h;
            kmVar.getClass();
            if (kmVar.p) {
                return;
            }
            kmVar.g.post(new qe(kmVar, 3, mfVar));
        }
    }
}
