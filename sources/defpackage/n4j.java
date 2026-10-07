package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n4j {
    public static final n4j e = new n4j(m1e.c, 0, -1, "video/*");
    public final m1e a;
    public final int b;
    public final int c;
    public final String d;

    public n4j(m1e m1eVar, int i, int i2, String str) {
        this.a = m1eVar;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4j)) {
            return false;
        }
        n4j n4jVar = (n4j) obj;
        return cqk.d(this.a, n4jVar.a) && this.b == n4jVar.b && this.c == n4jVar.c && cqk.d(this.d, n4jVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, 0, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", encodeFrameRate=0, bitrate=");
        sb.append(this.b);
        sb.append(", aspectRatio=");
        sb.append(this.c);
        sb.append(", mimeType=");
        return x05.i(sb, this.d, '}');
    }
}
