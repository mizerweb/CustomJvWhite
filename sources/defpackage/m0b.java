package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m0b extends e48 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public m0b(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0b.class != obj.getClass()) {
            return false;
        }
        m0b m0bVar = (m0b) obj;
        return this.b == m0bVar.b && this.c == m0bVar.c && this.d == m0bVar.d && Arrays.equals(this.e, m0bVar.e) && Arrays.equals(this.f, m0bVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
