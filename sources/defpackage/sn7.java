package defpackage;

import android.net.Uri;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sn7 extends y8f {
    public final long c;
    public final String d;
    public final xcd e;
    public final xcd f;
    public final boolean g;
    public final Uri h;
    public final rfd i;
    public final pj4 j;
    public final List k;
    public final String l;
    public final long m;

    public sn7(long j, String str, xcd xcdVar, xcd xcdVar2, boolean z, Uri uri, rfd rfdVar, pj4 pj4Var, List list, String str2) {
        super(4, list);
        this.c = j;
        this.d = str;
        this.e = xcdVar;
        this.f = xcdVar2;
        this.g = z;
        this.h = uri;
        this.i = rfdVar;
        this.j = pj4Var;
        this.k = list;
        this.l = str2;
        this.m = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn7)) {
            return false;
        }
        sn7 sn7Var = (sn7) obj;
        return this.c == sn7Var.c && this.d.equals(sn7Var.d) && cqk.d(this.e, sn7Var.e) && cqk.d(this.f, sn7Var.f) && this.g == sn7Var.g && cqk.d(this.h, sn7Var.h) && cqk.d(this.i, sn7Var.i) && cqk.d(this.j, sn7Var.j) && cqk.d(this.k, sn7Var.k) && cqk.d(this.l, sn7Var.l);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.m;
    }

    public final int hashCode() {
        int iN = nbh.n((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31)) * 31)) * 31, 31, this.g);
        Uri uri = this.h;
        int iN2 = nbh.n(qv1.c((this.j.hashCode() + ((this.i.hashCode() + ((iN + (uri == null ? 0 : uri.hashCode())) * 31)) * 31)) * 31, 31, this.k), 31, false);
        String str = this.l;
        return iN2 + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.y8f
    public final boolean i(y8f y8fVar) {
        return equals((sn7) y8fVar);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.chats_search_global_contact_view_type;
    }

    @Override // defpackage.y8f
    public final boolean o(y8f y8fVar) {
        return this.m == y8fVar.getItemId();
    }

    @Override // defpackage.y8f
    public final String q() {
        return this.l;
    }

    @Override // defpackage.y8f
    public final String toString() {
        return "GlobalContactSearchModel(id=" + this.c + ", abbreviation=" + ((Object) this.d) + ", title=" + this.e + ", subtitle=" + this.f + ", isVerified=" + this.g + ", avatar=" + this.h + ", presence=" + this.i + ", contactInfo=" + this.j + ", contactHighlights=" + this.k + ", selected=false, queryId=" + this.l + ")";
    }
}
