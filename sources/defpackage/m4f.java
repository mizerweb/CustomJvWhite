package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m4f {
    public final long a;
    public final String b;
    public final fu1 c;
    public final long d;
    public final int e;

    public m4f(long j, String str, fu1 fu1Var, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = fu1Var;
        this.d = j2;
        this.e = i;
    }

    public final fu1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4f)) {
            return false;
        }
        m4f m4fVar = (m4f) obj;
        return this.a == m4fVar.a && cqk.d(this.b, m4fVar.b) && this.c.equals(m4fVar.c) && this.d == m4fVar.d && this.e == m4fVar.e;
    }

    public final int hashCode() {
        return qt4.D(this.e) + qt4.g((this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        String str;
        StringBuilder sbT = qt4.t(this.a, "ScreenRecordBroadcastData(id=", ", streamId=", this.b);
        sbT.append(", initiatorId=");
        sbT.append(this.c);
        sbT.append(", startTimeMs=");
        sbT.append(this.d);
        sbT.append(", recordType=");
        int i = this.e;
        if (i == 1) {
            str = "NOTHING";
        } else if (i != 2) {
            str = i != 3 ? "null" : "RECORD";
        } else {
            str = "STREAM";
        }
        sbT.append(str);
        sbT.append(")");
        return sbT.toString();
    }
}
