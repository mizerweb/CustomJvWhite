package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yxd extends kih {
    public List c;
    public int d;
    public Long e;
    public String f;

    public yxd(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) throws IOException {
        str.getClass();
        switch (str) {
            case "marker":
                this.e = Long.valueOf(fkaVar.I0());
                break;
            case "result":
                int iJ = ch3.J(fkaVar);
                this.c = new ArrayList(iJ);
                for (int i = 0; i < iJ; i++) {
                    List list = this.c;
                    int iU = ch3.U(fkaVar);
                    st2 st2VarB = null;
                    b50 b50VarF = null;
                    gm4 gm4VarA = null;
                    for (int i2 = 0; i2 < iU; i2++) {
                        String strS0 = fkaVar.S0();
                        strS0.getClass();
                        switch (strS0) {
                            case "chat":
                                st2VarB = st2.b(fkaVar);
                                break;
                            case "highlights":
                                b50VarF = b50.f(fkaVar);
                                break;
                            case "contact":
                                gm4VarA = gm4.a(fkaVar);
                                break;
                            default:
                                fkaVar.x();
                                break;
                        }
                    }
                    list.add(new zxd(st2VarB, b50VarF, gm4VarA));
                }
                break;
            case "ucpQId":
                this.f = ch3.W(fkaVar);
                break;
            case "total":
                this.d = fkaVar.D0();
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        int iO = tre.O(this.c);
        int i = this.d;
        Long l = this.e;
        String str = this.f;
        StringBuilder sbP = qv1.p("{result=", iO, ", total=", i, ", marker=");
        sbP.append(l);
        sbP.append(", queryId=");
        sbP.append(str);
        sbP.append("}");
        return sbP.toString();
    }
}
