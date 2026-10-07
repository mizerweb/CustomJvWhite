package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class eai extends mhd {
    public long[] a;
    public int b;

    @Override // defpackage.mhd
    public final Object a() {
        return new dai(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.mhd
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.mhd
    public final int d() {
        return this.b;
    }
}
