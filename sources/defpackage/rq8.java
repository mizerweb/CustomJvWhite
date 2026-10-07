package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class rq8 implements k79 {
    public final long a;
    public final String b;
    public final Uri c;
    public final CharSequence d;

    public rq8(long j, String str, Uri uri, CharSequence charSequence) {
        this.a = j;
        this.b = str;
        this.c = uri;
        this.d = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq8)) {
            return false;
        }
        rq8 rq8Var = (rq8) obj;
        return this.a == rq8Var.a && this.b.equals(rq8Var.b) && cqk.d(this.c, rq8Var.c) && this.d.equals(rq8Var.d);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.a == k79Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Uri uri = this.c;
        return this.d.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    public final String toString() {
        return "JoinRequestListItem(id=" + this.a + ", name=" + ((Object) this.b) + ", avatar=" + this.c + ", abbreviation=" + ((Object) this.d) + ")";
    }
}
