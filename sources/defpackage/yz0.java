package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class yz0 extends mhd {
    public boolean[] a;
    public int b;

    @Override // defpackage.mhd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.mhd
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.mhd
    public final int d() {
        return this.b;
    }
}
