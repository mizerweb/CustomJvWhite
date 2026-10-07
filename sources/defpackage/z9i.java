package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class z9i extends mhd {
    public int[] a;
    public int b;

    @Override // defpackage.mhd
    public final Object a() {
        return new y9i(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.mhd
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.mhd
    public final int d() {
        return this.b;
    }
}
