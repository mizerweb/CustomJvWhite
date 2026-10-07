package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class wr2 extends aq0 {
    public final SparseArray i = new SparseArray();

    @Override // defpackage.aq0
    public final cb0 a(cb0 cb0Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (!twk.a(cb0Var)) {
            throw new AudioProcessor$UnhandledAudioFormatException(cb0Var);
        }
        xr2 xr2Var = (xr2) this.i.get(cb0Var.b);
        if (xr2Var != null) {
            return xr2Var.e ? cb0.e : new cb0(cb0Var.a, xr2Var.b, cb0Var.c);
        }
        throw new AudioProcessor$UnhandledAudioFormatException("No mixing matrix for input channel count", cb0Var);
    }

    @Override // defpackage.fb0
    public final void f(ByteBuffer byteBuffer) {
        xr2 xr2Var = (xr2) this.i.get(this.b.b);
        xr2Var.getClass();
        int iRemaining = byteBuffer.remaining() / this.b.d;
        ByteBuffer byteBufferL = l(this.c.d * iRemaining);
        twk.d(byteBuffer, this.b, byteBufferL, this.c, xr2Var, iRemaining, false);
        byteBufferL.flip();
    }
}
