package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class t5j implements u5j {
    public final float[] a;

    public t5j(float[] fArr) {
        this.a = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5j) && this.a.equals(((t5j) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return c0a.o("WithCorners(corners=", Arrays.toString(this.a), ")");
    }
}
