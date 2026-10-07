package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class x31 {
    public static final int[] c = {8000, 8000, 2000, 2000};
    public static final int[] d = {y5g.CLOSE_SOCKET_CODE_TIMEOUT, y5g.CLOSE_SOCKET_CODE_TIMEOUT, 200, 200};
    public final AtomicReferenceArray a = new AtomicReferenceArray(4);
    public final AtomicReferenceArray b = new AtomicReferenceArray(4);

    public final char[] a(int i, int i2) {
        int i3 = d[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[] cArr = (char[]) this.b.getAndSet(i, null);
        return (cArr == null || cArr.length < i2) ? new char[i2] : cArr;
    }

    public final void b(int i, char[] cArr) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        char[] cArr2 = (char[]) atomicReferenceArray.get(i);
        if (cArr2 == null || cArr.length > cArr2.length) {
            atomicReferenceArray.set(i, cArr);
        }
    }
}
