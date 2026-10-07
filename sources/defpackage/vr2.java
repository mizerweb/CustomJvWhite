package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class vr2 extends aq0 {
    public final /* synthetic */ int i;
    public Serializable j;
    public Object k;

    public vr2(int i) {
        this.i = i;
        switch (i) {
            case 1:
                this.j = new ReentrantLock();
                this.k = new ArrayList();
                break;
        }
    }

    @Override // defpackage.aq0
    public final cb0 a(cb0 cb0Var) throws AudioProcessor$UnhandledAudioFormatException {
        switch (this.i) {
            case 0:
                int i = cb0Var.c;
                int[] iArr = (int[]) this.j;
                if (iArr == null) {
                    return cb0.e;
                }
                int i2 = cb0Var.b;
                if (!vqi.O(i)) {
                    throw new AudioProcessor$UnhandledAudioFormatException(cb0Var);
                }
                boolean z = i2 != iArr.length;
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4 = iArr[i3];
                    if (i4 >= i2) {
                        throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", cb0Var);
                    }
                    z |= i4 != i3;
                    i3++;
                }
                return z ? new cb0(cb0Var.a, iArr.length, i) : cb0.e;
            default:
                return cb0Var;
        }
    }

    @Override // defpackage.aq0
    public void b() {
        switch (this.i) {
            case 0:
                this.k = (int[]) this.j;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0154  */
    /* JADX WARN: Code duplicated, block: B:76:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x0166  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    @Override // defpackage.fb0
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        boolean z3 = true;
        switch (this.i) {
            case 0:
                int[] iArr = (int[]) this.k;
                iArr.getClass();
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.b.d) * this.c.d);
                while (iPosition < iLimit) {
                    int length = iArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        int iV = (vqi.v(this.b.c) * iArr[i5]) + iPosition;
                        int i6 = this.b.c;
                        if (i6 == 2) {
                            byteBufferL.putShort(byteBuffer.getShort(iV));
                        } else if (i6 == 3) {
                            byteBufferL.put(byteBuffer.get(iV));
                        } else if (i6 == 4) {
                            byteBufferL.putFloat(byteBuffer.getFloat(iV));
                        } else if (i6 == 21) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i = iV;
                            } else {
                                i = iV + 2;
                            }
                            byte b = byteBuffer.get(i);
                            byte b2 = byteBuffer.get(iV + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iV += 2;
                            }
                            i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iV) << 8) & 65280)) >> 8;
                            if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                                z = z3;
                            } else {
                                z = false;
                            }
                            lvb.S(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                            if (byteBufferL.remaining() >= 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            lvb.R(z2);
                            if (byteBufferL.order() == byteOrder) {
                                i3 = (i2 & 16711680) >> 16;
                            } else {
                                i3 = i2 & 255;
                            }
                            byte b3 = (byte) i3;
                            byte b4 = (byte) ((i2 & 65280) >> 8);
                            if (byteBufferL.order() == byteOrder) {
                                i4 = i2 & 255;
                            } else {
                                i4 = (i2 & 16711680) >> 16;
                            }
                            byteBufferL.put(b3).put(b4).put((byte) i4);
                        } else {
                            if (i6 != 22) {
                                if (i6 == 268435456) {
                                    byteBufferL.putShort(byteBuffer.getShort(iV));
                                } else if (i6 == 1342177280) {
                                    byteOrderOrder = byteBuffer.order();
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                    if (byteOrderOrder == byteOrder) {
                                        i = iV;
                                    } else {
                                        i = iV + 2;
                                    }
                                    byte b5 = byteBuffer.get(i);
                                    byte b6 = byteBuffer.get(iV + 1);
                                    if (byteBuffer.order() == byteOrder) {
                                        iV += 2;
                                    }
                                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iV) << 8) & 65280)) >> 8;
                                    if ((i2 & (-16777216)) != 0) {
                                        z = z3;
                                    } else {
                                        z = z3;
                                    }
                                    lvb.S(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                                    if (byteBufferL.remaining() >= 3) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    lvb.R(z2);
                                    if (byteBufferL.order() == byteOrder) {
                                        i3 = (i2 & 16711680) >> 16;
                                    } else {
                                        i3 = i2 & 255;
                                    }
                                    byte b7 = (byte) i3;
                                    byte b8 = (byte) ((i2 & 65280) >> 8);
                                    if (byteBufferL.order() == byteOrder) {
                                        i4 = i2 & 255;
                                    } else {
                                        i4 = (i2 & 16711680) >> 16;
                                    }
                                    byteBufferL.put(b7).put(b8).put((byte) i4);
                                } else if (i6 != 1610612736) {
                                    qr7.g(this.b.c, "Unexpected encoding: ");
                                    return;
                                }
                            }
                            byteBufferL.putInt(byteBuffer.getInt(iV));
                        }
                        i5++;
                        z3 = true;
                    }
                    iPosition += this.b.d;
                    z3 = true;
                }
                byteBuffer.position(iLimit);
                byteBufferL.flip();
                return;
            default:
                int iLimit2 = byteBuffer.limit() - byteBuffer.position();
                if (iLimit2 == 0) {
                    return;
                }
                ByteBuffer byteBufferL2 = l(iLimit2);
                ReentrantLock reentrantLock = (ReentrantLock) this.j;
                reentrantLock.lock();
                try {
                    ArrayList arrayList = (ArrayList) this.k;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        qt4.A(it.next());
                        throw null;
                    }
                    reentrantLock.unlock();
                    if (arrayList2.isEmpty()) {
                        byteBufferL2.put(byteBuffer);
                        byteBufferL2.flip();
                        return;
                    }
                    HashMap map = apc.a;
                    apc.a(this.b.c);
                    if (arrayList2.size() == 1) {
                        qt4.A(arrayList2.get(0));
                        throw null;
                    }
                    arrayList2.size();
                    ByteBuffer.allocateDirect(iLimit2).order(ByteOrder.nativeOrder());
                    if (arrayList2.size() <= 0) {
                        return;
                    }
                    qt4.A(arrayList2.get(0));
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }

    @Override // defpackage.aq0
    public void k() {
        switch (this.i) {
            case 0:
                this.k = null;
                this.j = null;
                break;
        }
    }
}
