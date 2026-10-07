package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lmc {
    public static final lmc h;
    public final q1d a;
    public final int b;
    public final rdg c;
    public final Long d;
    public final Long e;
    public final mw f;
    public final int g;

    static {
        q1d q1dVar = null;
        h = new lmc(q1dVar, 0, null, null, null, null, 127);
    }

    public /* synthetic */ lmc(q1d q1dVar, int i, rdg rdgVar, Long l, Long l2, mw mwVar, int i2) {
        this((i2 & 1) != 0 ? null : q1dVar, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : rdgVar, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : l2, (i2 & 32) != 0 ? null : mwVar, 0, null);
    }

    public static lmc a(lmc lmcVar, int i, int i2) {
        q1d q1dVar = lmcVar.a;
        int i3 = (i2 & 2) != 0 ? lmcVar.b : 3;
        rdg rdgVar = lmcVar.c;
        Long l = lmcVar.d;
        Long l2 = lmcVar.e;
        mw mwVar = lmcVar.f;
        if ((i2 & 64) != 0) {
            i = lmcVar.g;
        }
        lmcVar.getClass();
        return new lmc(q1dVar, i3, rdgVar, l, l2, mwVar, i, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0041  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (obj instanceof lmc) {
                lmc lmcVar = (lmc) obj;
                if (this.a == lmcVar.a && this.b == lmcVar.b && this.c == lmcVar.c && cqk.d(this.d, lmcVar.d) && cqk.d(this.e, lmcVar.e)) {
                    mw mwVar = lmcVar.f;
                    mw mwVar2 = this.f;
                    if (mwVar2 == null) {
                        if (mwVar == null) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    } else if (mwVar == null) {
                        zA = false;
                    } else {
                        zA = gnl.a(mwVar2, mwVar);
                    }
                    if (zA && this.g == lmcVar.g) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        q1d q1dVar = this.a;
        int iHashCode = (q1dVar == null ? 0 : q1dVar.hashCode()) * 31;
        int i = this.b;
        int iD = (iHashCode + (i == 0 ? 0 : qt4.D(i))) * 31;
        rdg rdgVar = this.c;
        int iHashCode2 = (iD + (rdgVar == null ? 0 : rdgVar.hashCode())) * 31;
        Long l = this.d;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        mw mwVar = this.f;
        int iC = (iHashCode4 + (mwVar == null ? 0 : gnl.c(mwVar))) * 31;
        int i2 = this.g;
        return iC + (i2 != 0 ? qt4.D(i2) : 0);
    }

    public final String toString() {
        String str = "null";
        mw mwVar = this.f;
        String strF = mwVar == null ? "null" : gnl.f(mwVar);
        StringBuilder sb = new StringBuilder("Params(pipType=");
        sb.append(this.a);
        sb.append(", navReason=");
        sb.append(r5a.j(this.b));
        sb.append(", sourceType=");
        sb.append(this.c);
        sb.append(", sourceId=");
        sb.append(this.d);
        sb.append(", experimentGroup=");
        sb.append(this.e);
        sb.append(", reasonMeta=");
        sb.append(strF);
        sb.append(", tabConfig=");
        int i = this.g;
        if (i == 1) {
            str = "WITH_DIGITAL_ID";
        } else if (i == 2) {
            str = "WITH_CONTACT_LIST";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public lmc(q1d q1dVar, int i, rdg rdgVar, Long l, Long l2, mw mwVar, int i2, qt4 qt4Var) {
        this.a = q1dVar;
        this.b = i;
        this.c = rdgVar;
        this.d = l;
        this.e = l2;
        this.f = mwVar;
        this.g = i2;
    }
}
