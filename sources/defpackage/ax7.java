package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ax7 extends uq3 {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.y99
    public final void load() {
        try {
            this.i.f(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
        } finally {
            gz8.a(this.i);
        }
    }

    @Override // defpackage.y99
    public final void z() {
        this.k = true;
    }
}
