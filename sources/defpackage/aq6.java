package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class aq6 implements t50 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final Layout f;
    public final zp6 g;
    public final String h;
    public final int i;
    public final g58 j;
    public final fti k;
    public final boolean l;
    public final r8e m;

    public aq6(long j, long j2, String str, String str2, long j3, Layout layout, zp6 zp6Var, String str3, int i, g58 g58Var, fti ftiVar, boolean z, r8e r8eVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
        this.f = layout;
        this.g = zp6Var;
        this.h = str3;
        this.i = i;
        this.j = g58Var;
        this.k = ftiVar;
        this.l = z;
        this.m = r8eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq6)) {
            return false;
        }
        aq6 aq6Var = (aq6) obj;
        return this.b == aq6Var.b && this.a == aq6Var.a && cqk.d(this.c, aq6Var.c) && cqk.d(this.d, aq6Var.d) && this.e == aq6Var.e && this.f.equals(aq6Var.f) && cqk.d(this.g, aq6Var.g) && cqk.d(this.h, aq6Var.h) && this.i == aq6Var.i && cqk.d(this.j, aq6Var.j) && cqk.d(this.k, aq6Var.k) && this.l == aq6Var.l;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + qt4.g(zo5.d(zo5.d(qt4.g(Long.hashCode(this.b) * 31, 31, this.a), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31;
        String str = this.h;
        int iF = c0a.f(this.i, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        g58 g58Var = this.j;
        int iHashCode2 = (iF + (g58Var != null ? g58Var.hashCode() : 0)) * 31;
        fti ftiVar = this.k;
        return Boolean.hashCode(this.l) + ((iHashCode2 + (ftiVar != null ? ftiVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sbS = qt4.s(this.a, "FileAttachModel(fileId=", ", messageId=");
        qv1.s(this.b, ", attachLocalId=", this.c, sbS);
        p.j(sbS, ", fileName=", this.d, ", fileSize=");
        sbS.append(this.e);
        sbS.append(", fileNameLayout=");
        sbS.append(this.f);
        sbS.append(", extension=");
        sbS.append(this.g);
        sbS.append(", localPath=");
        sbS.append(this.h);
        sbS.append(", type=");
        int i = this.i;
        if (i == 1) {
            str = "PHOTO";
        } else if (i == 2) {
            str = "VIDEO";
        } else if (i != 3) {
            str = i != 4 ? "null" : "UNKNOWN";
        } else {
            str = "GIF";
        }
        sbS.append(str);
        sbS.append(", imageAttachConfig=");
        sbS.append(this.j);
        sbS.append(", videoAttachConfig=");
        sbS.append(this.k);
        sbS.append(", hasText=");
        sbS.append(this.l);
        sbS.append(", stateFlow=");
        sbS.append(this.m);
        sbS.append(")");
        return sbS.toString();
    }
}
