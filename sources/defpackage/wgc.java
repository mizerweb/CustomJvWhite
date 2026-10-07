package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wgc implements k79 {
    public static final wgc e;
    public final int a;
    public final int b;
    public final List c;
    public final String d;

    static {
        ifh ifhVar = ns4.b;
        e = new wgc(0, 1, oc9.b0(), r66.a);
    }

    public wgc(int i, int i2, String str, List list) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        wgc wgcVar = (wgc) obj;
        List list = wgcVar.c;
        if (this.a != wgcVar.a || this.b != wgcVar.b) {
            return false;
        }
        List list2 = this.c;
        if (list2.size() != list.size()) {
            return false;
        }
        ArrayList<ylc> arrayListZ1 = ww3.Z1(list2, list);
        if (arrayListZ1.isEmpty()) {
            return true;
        }
        for (ylc ylcVar : arrayListZ1) {
            if (!cqk.d((jp1) ylcVar.a, (jp1) ylcVar.b)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        wgc wgcVar = (wgc) k79Var;
        return wgcVar.b == this.b && wgcVar.a == this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + c0a.f(this.b, this.a * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return k79Var.equals(this);
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        wgc wgcVar = (wgc) k79Var;
        return equals(wgcVar) ? r66.a : Collections.singletonList(new vgc(wgcVar));
    }

    public final String toString() {
        String str;
        String strC = ns4.c(this.d);
        StringBuilder sbY = zo5.y(this.a, "OpponentsPageState(pagePosition=", ", pageType=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "SCREEN_SHARING";
        } else {
            str = "DEFAULT";
        }
        sbY.append(str);
        sbY.append(", opponents=");
        sbY.append(this.c);
        sbY.append(", conversationId=");
        return zo5.w(sbY, strC, ")");
    }
}
