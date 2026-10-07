package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lp1 {
    public final ok0 a;
    public final yp9 b;
    public final yp9 c;
    public final boolean d;
    public final ynh e;
    public final List f;
    public final ynh g;

    public lp1(ok0 ok0Var, yp9 yp9Var, yp9 yp9Var2, boolean z, ynh ynhVar, List list, ynh ynhVar2) {
        this.a = ok0Var;
        this.b = yp9Var;
        this.c = yp9Var2;
        this.d = z;
        this.e = ynhVar;
        this.f = list;
        this.g = ynhVar2;
    }

    public static lp1 a(lp1 lp1Var, ok0 ok0Var, yp9 yp9Var, yp9 yp9Var2, boolean z, ynh ynhVar, ArrayList arrayList, ynh ynhVar2, int i) {
        if ((i & 1) != 0) {
            ok0Var = lp1Var.a;
        }
        ok0 ok0Var2 = ok0Var;
        if ((i & 2) != 0) {
            yp9Var = lp1Var.b;
        }
        yp9 yp9Var3 = yp9Var;
        if ((i & 4) != 0) {
            yp9Var2 = lp1Var.c;
        }
        yp9 yp9Var4 = yp9Var2;
        if ((i & 8) != 0) {
            z = lp1Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            ynhVar = lp1Var.e;
        }
        ynh ynhVar3 = ynhVar;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = lp1Var.f;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            ynhVar2 = lp1Var.g;
        }
        lp1Var.getClass();
        return new lp1(ok0Var2, yp9Var3, yp9Var4, z2, ynhVar3, list2, ynhVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp1)) {
            return false;
        }
        lp1 lp1Var = (lp1) obj;
        return cqk.d(this.a, lp1Var.a) && this.b == lp1Var.b && this.c == lp1Var.c && this.d == lp1Var.d && this.e.equals(lp1Var.e) && cqk.d(this.f, lp1Var.f) && cqk.d(this.g, lp1Var.g);
    }

    public final int hashCode() {
        ok0 ok0Var = this.a;
        int iH = bc1.h(nbh.n((this.c.hashCode() + ((this.b.hashCode() + ((ok0Var == null ? 0 : ok0Var.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int iHashCode = (iH + (list == null ? 0 : list.hashCode())) * 31;
        ynh ynhVar = this.g;
        return iHashCode + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        return "UserPreviewState(avatar=" + this.a + ", microphoneState=" + this.b + ", videoState=" + this.c + ", isFrontCamera=" + this.d + ", title=" + this.e + ", avatarInfo=" + this.f + ", participantsTitle=" + this.g + ")";
    }
}
