package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fmg {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final ArrayList h;
    public final boolean i;
    public final int j;

    public fmg(id4 id4Var) {
        this.a = id4Var.b;
        this.b = (String) id4Var.h;
        this.c = (String) id4Var.i;
        this.d = id4Var.c;
        this.e = id4Var.d;
        this.f = id4Var.e;
        this.g = (String) id4Var.k;
        this.h = (ArrayList) id4Var.j;
        this.i = id4Var.f;
        this.j = id4Var.g;
    }

    public static fmg a(fka fkaVar) {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        id4 id4Var = new id4();
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "updateTime":
                    id4Var.e = ch3.T(fkaVar, 0L);
                    break;
                case "id":
                    id4Var.b = fkaVar.I0();
                    break;
                case "link":
                    id4Var.k = ch3.W(fkaVar);
                    break;
                case "name":
                    id4Var.h = ch3.W(fkaVar);
                    break;
                case "draft":
                    id4Var.f = ch3.L(fkaVar);
                    break;
                case "createTime":
                    id4Var.d = ch3.T(fkaVar, 0L);
                    break;
                case "authorId":
                    id4Var.c = ch3.T(fkaVar, 0L);
                    break;
                case "stickers":
                    int iJ = ch3.J(fkaVar);
                    ArrayList arrayList = new ArrayList(iJ);
                    for (int i2 = 0; i2 < iJ; i2++) {
                        arrayList.add(Long.valueOf(fkaVar.I0()));
                    }
                    id4Var.j = arrayList;
                    break;
                case "iconUrl":
                    id4Var.i = ch3.W(fkaVar);
                    break;
                case "installCount":
                    id4Var.g = ch3.R(fkaVar, 0);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new fmg(id4Var);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.h);
        StringBuilder sbT = qt4.t(this.a, "StickerSet{id=", ", name='", this.b);
        p.j(sbT, "', iconUrl='", this.c, "', authorId=");
        sbT.append(this.d);
        qt4.z(this.e, ", createTime=", ", updateTime=", sbT);
        qv1.s(this.f, ", link='", this.g, sbT);
        sbT.append("', stickers=");
        sbT.append(strValueOf);
        sbT.append(", draft=");
        sbT.append(this.i);
        return qv1.o(sbT, ", installCount=", this.j, "}");
    }
}
