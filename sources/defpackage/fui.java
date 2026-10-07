package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fui extends kih {
    public List c;
    public long d;
    public long e;
    public boolean f;

    public fui(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "forwardMarker":
                this.d = ch3.T(fkaVar, 0L);
                break;
            case "hasMore":
                this.f = ch3.L(fkaVar);
                break;
            case "history":
                this.c = ch3.f0(fkaVar, new yr8(14));
                break;
            case "backwardMarker":
                this.e = ch3.T(fkaVar, 0L);
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
        long j2 = this.e;
        boolean z = this.f;
        StringBuilder sbX = zo5.x(iO, j, "{calls=", ", forwardMarker=");
        qt4.z(j2, ", backwardMarker=", ", hasMore=", sbX);
        return qt4.r(sbX, z, "}");
    }
}
