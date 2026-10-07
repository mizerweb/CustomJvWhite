package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zl0 implements k79 {
    public final boolean a;
    public final int[] b;
    public final long c;

    public zl0(boolean z, int[] iArr) {
        this.a = z;
        this.b = iArr;
        this.c = Arrays.hashCode(iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl0)) {
            return false;
        }
        zl0 zl0Var = (zl0) obj;
        return this.a == zl0Var.a && Arrays.equals(this.b, zl0Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return 1;
    }

    public final String toString() {
        return "BackgroundColorStoryItem(isChosen=" + this.a + ", gradientColors=" + Arrays.toString(this.b) + ")";
    }
}
