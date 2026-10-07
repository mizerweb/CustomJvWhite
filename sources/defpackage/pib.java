package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pib extends kih {
    public long c;
    public ArrayList d;
    public int e;
    public fy f;
    public int g;
    public long h;
    public ArrayList i;
    public List j;

    public pib(fka fkaVar) {
        super(fkaVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        ?? arrayList;
        fy fyVar;
        str.getClass();
        int i = 1;
        int i2 = 0;
        byte b = -1;
        switch (str.hashCode()) {
            case -2005455306:
                if (str.equals("recentsList")) {
                    b = 0;
                }
                break;
            case -310976023:
                if (str.equals("recentEmojiList")) {
                    b = 1;
                }
                break;
            case -295915613:
                if (str.equals("updateType")) {
                    b = 2;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    b = 3;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    b = 4;
                }
                break;
            case 3545755:
                if (str.equals("sync")) {
                    b = 5;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    b = 6;
                }
                break;
            case 109327645:
                if (str.equals("setId")) {
                    b = 7;
                }
                break;
            case 747804969:
                if (str.equals("position")) {
                    b = 8;
                }
                break;
        }
        ArrayList arrayList2 = null;
        switch (b) {
            case 0:
                if (fkaVar.y().a() == 7) {
                    arrayList2 = new ArrayList();
                    int iT0 = fkaVar.t0();
                    while (i2 < iT0) {
                        arrayList2.add(fae.a(fkaVar));
                        i2++;
                    }
                } else {
                    fkaVar.x();
                }
                this.i = arrayList2;
                break;
            case 1:
                if (fkaVar.y().a() == 7) {
                    arrayList = new ArrayList();
                    int iT1 = fkaVar.t0();
                    while (i2 < iT1) {
                        dae daeVarA = dae.a(fkaVar);
                        if (daeVarA != null) {
                            arrayList.add(daeVarA);
                        }
                        i2++;
                    }
                } else {
                    fkaVar.x();
                    arrayList = Collections.EMPTY_LIST;
                }
                this.j = arrayList;
                break;
            case 2:
                String strW = ch3.W(fkaVar);
                fy[] fyVarArr = fy.d;
                int length = fyVarArr.length;
                while (i2 < length) {
                    fyVar = fyVarArr[i2];
                    if (fyVar.a.equalsIgnoreCase(strW)) {
                        this.f = fyVar;
                    } else {
                        i2++;
                    }
                    break;
                }
                fyVar = fy.UNKNOWN;
                this.f = fyVar;
                break;
            case 3:
                this.c = ch3.T(fkaVar, 0L);
                break;
            case 4:
                if (fkaVar.y().a() == 7) {
                    arrayList2 = new ArrayList();
                    int iT2 = fkaVar.t0();
                    while (i2 < iT2) {
                        arrayList2.add(Long.valueOf(ch3.T(fkaVar, 0L)));
                        i2++;
                    }
                } else {
                    fkaVar.x();
                }
                this.d = arrayList2;
                break;
            case 5:
                this.h = ch3.T(fkaVar, 0L);
                break;
            case 6:
                String strW2 = ch3.W(fkaVar);
                int[] iArrH = qt4.H(10);
                int length2 = iArrH.length;
                while (i2 < length2) {
                    int i3 = iArrH[i2];
                    if (qt4.f(i3).equals(strW2)) {
                        i = i3;
                        this.e = i;
                    } else {
                        i2++;
                    }
                    break;
                }
                this.e = i;
                break;
            case 7:
                ch3.T(fkaVar, 0L);
                break;
            case 8:
                this.g = ch3.R(fkaVar, 0);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        long j = this.c;
        int iO = tre.O(this.d);
        String strE = qt4.E(this.e);
        String strValueOf = String.valueOf(this.f);
        int i = this.g;
        int iO2 = tre.O(this.j);
        int iO3 = tre.O(this.i);
        StringBuilder sbQ = c0a.q(iO, j, "Response{id=", ", ids=");
        nbh.G(sbQ, ", assetType=", strE, ", updateType=", strValueOf);
        zo5.C(i, iO2, ", position=", ", recentEmojiList=", sbQ);
        return qv1.o(sbQ, ", recentsList=", iO3, "}");
    }
}
