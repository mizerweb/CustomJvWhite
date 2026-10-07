package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bne {
    public final int a;
    public final int b;
    public final float c;

    public bne(int i, int i2, float f, int i3) {
        f = (i3 & 4) != 0 ? 2048.0f : f;
        this.a = i;
        this.b = i2;
        this.c = f;
        if (i <= 0) {
            ore.k("Check failed.");
            throw null;
        }
        if (i2 > 0) {
            return;
        }
        ore.k("Check failed.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bne)) {
            return false;
        }
        bne bneVar = (bne) obj;
        return this.a == bneVar.a && this.b == bneVar.b;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, 2));
    }
}
