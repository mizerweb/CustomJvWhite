package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k98 extends q1 implements gri {
    public static final k98 b = new k98(new gri[0]);
    public final gri[] a;

    public k98(gri[] griVarArr) {
        this.a = griVarArr;
    }

    public static void B(StringBuilder sb, gri griVar) {
        if (nbh.f(((q1) griVar).a())) {
            sb.append(griVar.toJson());
        } else {
            sb.append(griVar.toString());
        }
    }

    @Override // defpackage.q1
    /* JADX INFO: renamed from: A */
    public final k98 d() {
        return this;
    }

    @Override // defpackage.gri
    public final int a() {
        return 8;
    }

    @Override // defpackage.q1, defpackage.gri
    public final k98 d() {
        return this;
    }

    @Override // defpackage.gri
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        gri griVar = (gri) obj;
        int iA = ((q1) griVar).a();
        qt4.c(iA);
        if (iA != 8) {
            return false;
        }
        k98 k98VarD = griVar.d();
        j98 j98Var = new j98(this.a);
        k98VarD.getClass();
        return j98Var.equals(new j98(k98VarD.a));
    }

    public final int hashCode() {
        int i = 0;
        int iHashCode = 0;
        while (true) {
            gri[] griVarArr = this.a;
            if (i >= griVarArr.length) {
                return iHashCode;
            }
            iHashCode += griVarArr[i + 1].hashCode() ^ griVarArr[i].hashCode();
            i += 2;
        }
    }

    @Override // defpackage.gri
    public final String toJson() {
        gri[] griVarArr = this.a;
        if (griVarArr.length == 0) {
            return "{}";
        }
        StringBuilder sbC = nbh.C("{");
        gri griVar = griVarArr[0];
        if (nbh.f(((q1) griVar).a())) {
            sbC.append(griVar.toJson());
        } else {
            p1.B(sbC, griVar.toString());
        }
        sbC.append(":");
        sbC.append(griVarArr[1].toJson());
        for (int i = 2; i < griVarArr.length; i += 2) {
            sbC.append(",");
            gri griVar2 = griVarArr[i];
            if (nbh.f(((q1) griVar2).a())) {
                sbC.append(griVar2.toJson());
            } else {
                p1.B(sbC, griVar2.toString());
            }
            sbC.append(":");
            sbC.append(griVarArr[i + 1].toJson());
        }
        sbC.append("}");
        return sbC.toString();
    }

    public final String toString() {
        gri[] griVarArr = this.a;
        if (griVarArr.length == 0) {
            return "{}";
        }
        StringBuilder sbC = nbh.C("{");
        B(sbC, griVarArr[0]);
        sbC.append(":");
        B(sbC, griVarArr[1]);
        for (int i = 2; i < griVarArr.length; i += 2) {
            sbC.append(",");
            B(sbC, griVarArr[i]);
            sbC.append(":");
            B(sbC, griVarArr[i + 1]);
        }
        sbC.append("}");
        return sbC.toString();
    }
}
