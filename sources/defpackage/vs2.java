package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class vs2 extends mhd {
    public char[] a;
    public int b;

    @Override // defpackage.mhd
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.mhd
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.mhd
    public final int d() {
        return this.b;
    }
}
