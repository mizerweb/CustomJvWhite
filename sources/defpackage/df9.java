package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class df9 extends kih implements xe9 {
    public final ujd c;
    public final List d;
    public final ia4 e;

    public df9(ujd ujdVar, List list, ia4 ia4Var) {
        this.c = ujdVar;
        this.d = list;
        this.e = ia4Var;
    }

    @Override // defpackage.xe9
    public final String a(boolean z, boolean z2) {
        String strS;
        v56 v56Var;
        v56 v56Var2;
        ia4 ia4Var = this.e;
        if (ia4Var != null && (v56Var2 = ia4Var.b) != null) {
            Map map = (Map) v56Var2.b;
            if (map.containsKey("log-full")) {
                Object obj = map.get("log-full");
                z = Boolean.parseBoolean(obj != null ? obj.toString() : null);
            } else {
                z = false;
            }
        }
        if (ia4Var != null && (v56Var = ia4Var.b) != null) {
            Map map2 = (Map) v56Var.b;
            if (map2.containsKey("log-sensitive")) {
                Object obj2 = map2.get("log-sensitive");
                z2 = Boolean.parseBoolean(obj2 != null ? obj2.toString() : null);
            } else {
                z2 = false;
            }
        }
        StringBuilder sb = new StringBuilder("LOGIN2{profile=");
        sb.append(this.c);
        sb.append(",contactInfos=");
        List list = this.d;
        if (list == null || (strS = f55.s(list, z, z2)) == null) {
            strS = "null";
        }
        sb.append(strS);
        sb.append(",config=");
        sb.append(ia4Var);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df9)) {
            return false;
        }
        df9 df9Var = (df9) obj;
        return cqk.d(this.c, df9Var.c) && cqk.d(this.d, df9Var.d) && cqk.d(this.e, df9Var.e);
    }

    public final int hashCode() {
        ujd ujdVar = this.c;
        int iHashCode = (ujdVar == null ? 0 : ujdVar.hashCode()) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ia4 ia4Var = this.e;
        return iHashCode2 + (ia4Var != null ? ia4Var.hashCode() : 0);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return a(false, false);
    }
}
