package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class xb0 {
    public static final xb0 c = new xb0(-1, "audio/*");
    public final int a;
    public final String b;

    public xb0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0Var = (xb0) obj;
        return this.a == xb0Var.a && this.b.equals(xb0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(0, -1, -1, 0, Integer.valueOf(this.a));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=0, sourceFormat=-1, source=-1, sampleRate=0, channelCount=");
        sb.append(this.a);
        sb.append(", mimeType=");
        return x05.i(sb, this.b, '}');
    }
}
