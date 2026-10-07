package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class wvj {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final boolean a(hg4 hg4Var) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(hg4Var)) {
            return false;
        }
        arrayList.add(hg4Var);
        return true;
    }

    public final void b(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                wvj wvjVar = (wvj) arrayList.get(i);
                if (this.e == wvjVar.b) {
                    d(this.c, wvjVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c(b29 b29Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ig4 ig4Var = (ig4) ((hg4) arrayList.get(0)).S;
        b29Var.t();
        ig4Var.b(b29Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((hg4) arrayList.get(i2)).b(b29Var, false);
        }
        if (i == 0 && ig4Var.y0 > 0) {
            rkl.a(ig4Var, b29Var, arrayList, 0);
        }
        if (i == 1 && ig4Var.z0 > 0) {
            rkl.a(ig4Var, b29Var, arrayList, 1);
        }
        try {
            b29Var.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hg4 hg4Var = (hg4) arrayList.get(i3);
            nv8 nv8Var = new nv8(15);
            new WeakReference(hg4Var);
            b29.n(hg4Var.H);
            b29.n(hg4Var.I);
            b29.n(hg4Var.J);
            b29.n(hg4Var.K);
            b29.n(hg4Var.L);
            this.d.add(nv8Var);
        }
        if (i == 0) {
            iN = b29.n(ig4Var.H);
            iN2 = b29.n(ig4Var.J);
            b29Var.t();
        } else {
            iN = b29.n(ig4Var.I);
            iN2 = b29.n(ig4Var.K);
            b29Var.t();
        }
        return iN2 - iN;
    }

    public final void d(int i, wvj wvjVar) {
        int i2 = wvjVar.b;
        for (hg4 hg4Var : this.a) {
            wvjVar.a(hg4Var);
            if (i == 0) {
                hg4Var.m0 = i2;
            } else {
                hg4Var.n0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strT = zo5.t(sb, this.b, "] <");
        for (hg4 hg4Var : this.a) {
            StringBuilder sbZ = zo5.z(strT, " ");
            sbZ.append(hg4Var.g0);
            strT = sbZ.toString();
        }
        return strT.concat(" >");
    }
}
