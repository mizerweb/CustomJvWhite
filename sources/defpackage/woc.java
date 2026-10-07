package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class woc {
    public final String a;
    public final int b;

    public woc(String str, int i) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woc)) {
            return false;
        }
        woc wocVar = (woc) obj;
        return cqk.d(this.a, wocVar.a) && this.b == wocVar.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sbV = qt4.v("PcapLabelConfig(label=", this.a, ", source=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "AI_OPUS_BWE";
        } else {
            str = "NS";
        }
        sbV.append(str);
        sbV.append(")");
        return sbV.toString();
    }
}
