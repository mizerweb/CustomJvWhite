package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lnf {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final qwf g;

    public lnf(long j, String str, String str2, String str3, String str4, int i, qwf qwfVar) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = qwfVar;
    }

    public static lnf a(lnf lnfVar, int i, qwf qwfVar, int i2) {
        long j = lnfVar.a;
        String str = lnfVar.b;
        String str2 = lnfVar.c;
        String str3 = lnfVar.d;
        String str4 = lnfVar.e;
        if ((i2 & 64) != 0) {
            qwfVar = lnfVar.g;
        }
        lnfVar.getClass();
        return new lnf(j, str, str2, str3, str4, i, qwfVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnf)) {
            return false;
        }
        lnf lnfVar = (lnf) obj;
        return this.a == lnfVar.a && this.b.equals(lnfVar.b) && cqk.d(this.c, lnfVar.c) && cqk.d(this.d, lnfVar.d) && cqk.d(this.e, lnfVar.e) && this.f == lnfVar.f && cqk.d(this.g, lnfVar.g);
    }

    public final int hashCode() {
        int iD = zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iD2 = zo5.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iF = c0a.f(this.f, (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        qwf qwfVar = this.g;
        return iF + (qwfVar != null ? qwfVar.a.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sbT = qt4.t(this.a, "SessionState(versionCode=", ", versionName=", this.b);
        nbh.G(sbT, ", environment=", this.c, ", sessionUuid=", this.d);
        sbT.append(", processName=");
        sbT.append(this.e);
        sbT.append(", status=");
        int i = this.f;
        if (i == 1) {
            str = "RUNNING";
        } else if (i == 2) {
            str = "BLANK";
        } else if (i == 3) {
            str = "CRASH";
        } else if (i != 4) {
            str = i != 5 ? "null" : "NATIVE";
        } else {
            str = "ANR";
        }
        sbT.append(str);
        sbT.append(", maxSeverity=");
        sbT.append(this.g);
        sbT.append(")");
        return sbT.toString();
    }
}
