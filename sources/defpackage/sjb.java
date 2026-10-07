package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sjb extends kih {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    public sjb(fka fkaVar) {
        super(fkaVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        int i = 0;
        byte b = -1;
        switch (str.hashCode()) {
            case -989040443:
                if (str.equals("phones")) {
                    b = 0;
                }
                break;
            case -930898016:
                if (str.equals("rindex")) {
                    b = 1;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    b = 2;
                }
                break;
        }
        ArrayList arrayList = null;
        switch (b) {
            case 0:
                if (fkaVar.y().a() == 7) {
                    arrayList = new ArrayList();
                    int iT0 = fkaVar.t0();
                    while (i < iT0) {
                        arrayList.add(ch3.W(fkaVar));
                        i++;
                    }
                } else {
                    fkaVar.x();
                }
                this.c = arrayList;
                break;
            case 1:
                if (fkaVar.y().a() == 7) {
                    arrayList = new ArrayList();
                    int iT1 = fkaVar.t0();
                    for (int i2 = 0; i2 < iT1; i2++) {
                        arrayList.add(Integer.valueOf(ch3.R(fkaVar, 0)));
                    }
                } else {
                    fkaVar.x();
                }
                this.d = arrayList;
                break;
            case 2:
                if (fkaVar.y().a() == 7) {
                    arrayList = new ArrayList();
                    int iT2 = fkaVar.t0();
                    while (i < iT2) {
                        arrayList.add(Long.valueOf(ch3.T(fkaVar, 0L)));
                        i++;
                    }
                } else {
                    fkaVar.x();
                }
                this.e = arrayList;
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
        return zo5.t(qv1.p("{phones=", iO, ", rindex=", iO2, ", ids="), tre.O(this.e), "}");
    }
}
