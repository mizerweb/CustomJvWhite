package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class a3j extends kih {
    public Map c;
    public boolean d;
    public long e;
    public String f;

    public a3j(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_MAP;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        ?? arrayList;
        str.getClass();
        switch (str) {
            case "FAILOVER_HOSTS":
            case "failoverHosts":
                if (fkaVar.y().a() == 7) {
                    arrayList = new ArrayList();
                    int iT0 = fkaVar.t0();
                    for (int i = 0; i < iT0; i++) {
                        String strW = ch3.W(fkaVar);
                        if (strW != null) {
                            arrayList.add(strW);
                        }
                    }
                } else {
                    fkaVar.x();
                    arrayList = Collections.EMPTY_LIST;
                }
                if (!arrayList.isEmpty()) {
                    this.f = (String) arrayList.get(new Random().nextInt(arrayList.size()));
                    break;
                }
                break;
            case "startTime":
                this.e = ch3.T(fkaVar, 0L);
                break;
            case "live":
                this.d = ch3.L(fkaVar);
                break;
            default:
                String strW2 = ch3.W(fkaVar);
                if (!ch3.r(strW2)) {
                    if (this.c == null) {
                        this.c = new mw(0);
                    }
                    this.c.put(str, strW2);
                    break;
                }
                break;
        }
    }

    public final String h() {
        return this.f;
    }

    public final Map i() {
        return this.c;
    }

    @Override // defpackage.sq0
    public final String toString() {
        int iP0 = tre.p0(this.c);
        boolean z = this.d;
        long j = this.e;
        String str = this.f;
        StringBuilder sb = new StringBuilder("{urls=");
        sb.append(iP0);
        sb.append(", live=");
        sb.append(z);
        sb.append(", startTime=");
        qv1.s(j, ", failoverHost='", str, sb);
        sb.append("'}");
        return sb.toString();
    }
}
