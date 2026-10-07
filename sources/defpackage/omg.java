package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class omg implements k79 {
    public final long a;
    public final ynh b;
    public final String c;
    public final Integer d;
    public final List e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final int l;
    public final long m;

    public omg(long j, ynh ynhVar, String str, Integer num, List list, int i, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.a = j;
        this.b = ynhVar;
        this.c = str;
        this.d = num;
        this.e = list;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str2;
        this.k = z4;
        this.l = i == 5 ? R.id.oneme_stickers_view_type_stickers_set_showcase : R.id.oneme_stickers_view_type_stickers_set;
        this.m = j >= 0 ? -j : j;
    }

    public static omg i(omg omgVar, ArrayList arrayList, boolean z, boolean z2, int i) {
        long j = omgVar.a;
        ynh ynhVar = omgVar.b;
        String str = omgVar.c;
        Integer num = omgVar.d;
        List list = (i & 16) != 0 ? omgVar.e : arrayList;
        int i2 = omgVar.f;
        boolean z3 = (i & 64) != 0 ? omgVar.g : z;
        boolean z4 = (i & np0.m) != 0 ? omgVar.h : z2;
        boolean z5 = omgVar.i;
        String str2 = omgVar.j;
        boolean z6 = omgVar.k;
        omgVar.getClass();
        return new omg(j, ynhVar, str, num, list, i2, z3, z4, z5, str2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omg)) {
            return false;
        }
        omg omgVar = (omg) obj;
        return this.a == omgVar.a && cqk.d(this.b, omgVar.b) && cqk.d(this.c, omgVar.c) && cqk.d(this.d, omgVar.d) && cqk.d(this.e, omgVar.e) && this.f == omgVar.f && this.g == omgVar.g && this.h == omgVar.h && this.i == omgVar.i && cqk.d(this.j, omgVar.j) && this.k == omgVar.k;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.m;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.m == k79Var.getItemId();
    }

    public final int hashCode() {
        int iH = bc1.h(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iN = nbh.n(nbh.n(nbh.n(c0a.f(this.f, qv1.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.j;
        return Boolean.hashCode(this.k) + ((iN + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.l;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (!(k79Var instanceof omg)) {
            return null;
        }
        omg omgVar = (omg) k79Var;
        boolean z = omgVar.g;
        if (this.g != z) {
            return new lmg(z);
        }
        int i = omgVar.f;
        if (this.f != i) {
            return new mmg(i);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSetModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconRes=");
        sb.append(this.d);
        sb.append(", stickers=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(pye.m(this.f));
        qv1.v(", selected=", ", favorite=", sb, this.g, this.h);
        sb.append(", showAddButton=");
        sb.append(this.i);
        sb.append(", link=");
        sb.append(this.j);
        return nbh.z(sb, ", isAuthor=", this.k, ")");
    }

    public /* synthetic */ omg(long j, ynh ynhVar, String str, Integer num, List list, int i, boolean z, boolean z2, boolean z3, String str2, boolean z4, int i2) {
        this(j, ynhVar, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num, list, i, (i2 & 64) != 0 ? false : z, (i2 & np0.m) != 0 ? false : z2, (i2 & np0.n) != 0 ? false : z3, str2, (i2 & 1024) != 0 ? false : z4);
    }
}
