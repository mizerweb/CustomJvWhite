package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j4b extends kih {
    public List c;
    public long d;
    public int e;
    public String f;

    public j4b(fka fkaVar) {
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
                this.d = ch3.T(fkaVar, 0L);
                break;
            case "result":
                this.c = hm4.b(fkaVar);
                break;
            case "ucpQId":
                this.f = ch3.W(fkaVar);
                break;
            case "total":
                this.e = ch3.R(fkaVar, 0);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        int iO = tre.O(this.c);
        long j = this.d;
        int i = this.e;
        String str = this.f;
        StringBuilder sbX = zo5.x(iO, j, "{result=", ", marker=");
        sbX.append(", total=");
        sbX.append(i);
        sbX.append(", queryId=");
        sbX.append(str);
        sbX.append("}");
        return sbX.toString();
    }
}
