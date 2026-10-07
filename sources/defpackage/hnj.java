package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class hnj implements ynj {
    public final int a;
    public final String[] b;

    public hnj(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hnj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hnj hnjVar = (hnj) obj;
        return this.a == hnjVar.a && Arrays.equals(this.b, hnjVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "OpenGallery(mode=" + this.a + ", mimeTypes=" + Arrays.toString(this.b) + ")";
    }
}
