package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eqd extends frd {
    public final List a;
    public final List b;
    public final boolean c;
    public final int d = 1;

    public eqd(List list, List list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqd)) {
            return false;
        }
        eqd eqdVar = (eqd) obj;
        return cqk.d(this.a, eqdVar.a) && cqk.d(this.b, eqdVar.b) && this.c == eqdVar.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 1L;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qv1.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonsStack(buttons=");
        sb.append(this.a);
        sb.append(", contextMenuButtons=");
        sb.append(this.b);
        sb.append(", isMoreButtonEnabled=");
        return qt4.r(sb, this.c, ")");
    }
}
