package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c1g extends mhd {
    public short[] a;
    public int b;

    @Override // defpackage.mhd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.mhd
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.mhd
    public final int d() {
        return this.b;
    }
}
