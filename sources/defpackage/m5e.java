package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m5e extends p5e {
    public final long a;
    public final String b;
    public final float c;
    public final oji d;

    public m5e(long j, String str, float f, oji ojiVar) {
        this.a = j;
        this.b = str;
        this.c = f;
        this.d = ojiVar;
    }

    @Override // defpackage.p5e
    public final oji a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5e)) {
            return false;
        }
        m5e m5eVar = (m5e) obj;
        return this.a == m5eVar.a && cqk.d(this.b, m5eVar.b) && Float.compare(this.c, m5eVar.c) == 0 && this.d == m5eVar.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iM = nbh.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        oji ojiVar = this.d;
        return iM + (ojiVar != null ? ojiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "Processing(messageId=", ", attachId=", this.b);
        sbT.append(", progress=");
        sbT.append(this.c);
        sbT.append(", uploadType=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
