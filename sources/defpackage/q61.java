package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q61 extends mhd {
    public byte[] a;
    public int b;

    @Override // defpackage.mhd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.mhd
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.mhd
    public final int d() {
        return this.b;
    }
}
