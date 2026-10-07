package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class suh extends aq0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void m(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.aq0
    public final cb0 a(cb0 cb0Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i2 = cb0Var.c;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 2) {
            return i2 != 4 ? new cb0(cb0Var.a, cb0Var.b, 4) : cb0.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(cb0Var);
    }

    @Override // defpackage.fb0
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 2) {
            byteBufferL = l(i2 * 2);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24), byteBufferL);
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            byteBufferL = l((i2 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            byteBufferL = l(i2);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                iPosition += 4;
            }
        } else if (i3 == 21) {
            byteBufferL = l((i2 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        } else {
            if (i3 != 22) {
                c.t();
                return;
            }
            byteBufferL = l(i2);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferL);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }
}
