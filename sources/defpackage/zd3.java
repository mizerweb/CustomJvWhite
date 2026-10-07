package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zd3 extends kih {
    public List c;
    public int d;
    public String e;
    public String f;

    public zd3(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "marker":
                this.e = ch3.W(fkaVar);
                break;
            case "result":
                this.c = hm4.b(fkaVar);
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
        return nbh.y(qv1.p("{result=", iO, ", total=", i, ", marker='"), this.e, "', queryId='", this.f, "'}");
    }
}
