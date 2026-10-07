package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class u9i extends mhd {
    public byte[] a;
    public int b;

    @Override // defpackage.mhd
    public final Object a() {
        return new t9i(Arrays.copyOf(this.a, this.b));
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
