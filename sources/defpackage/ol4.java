package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ol4 extends kih {
    public List c;
    public List d;
    public int e;

    public ol4(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
        if (this.d == null) {
            this.d = Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        int i = 0;
        byte b = -1;
        switch (str.hashCode()) {
            case 104120:
                if (str.equals("ids")) {
                    b = 0;
                }
                break;
            case 3598564:
                if (str.equals("urls")) {
                    b = 1;
                }
                break;
            case 110549828:
                if (str.equals("total")) {
                    b = 2;
                }
                break;
        }
        List arrayList = 0;
        List arrayList2 = 0;
        switch (b) {
            case 0:
                if (fkaVar.y().a() == 7) {
                    arrayList = new ArrayList();
                    int iT0 = fkaVar.t0();
                    while (i < iT0) {
                        arrayList.add(Long.valueOf(ch3.T(fkaVar, 0L)));
                        i++;
                    }
                } else {
                    fkaVar.x();
                }
                if (arrayList == 0) {
                    arrayList = Collections.EMPTY_LIST;
                }
                this.d = arrayList;
                break;
            case 1:
                if (fkaVar.y().a() == 7) {
                    arrayList2 = new ArrayList();
                    int iT1 = fkaVar.t0();
                    while (i < iT1) {
                        arrayList2.add(ch3.W(fkaVar));
                        i++;
                    }
                } else {
                    fkaVar.x();
                }
                if (arrayList2 == 0) {
                    arrayList2 = Collections.EMPTY_LIST;
                }
                this.c = arrayList2;
                break;
            case 2:
                this.e = fkaVar.D0();
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        int iO = tre.O(this.c);
        int iO2 = tre.O(this.d);
        return zo5.t(qv1.p("{urls=", iO, ", ids=", iO2, ", total="), this.e, "}");
    }
}
