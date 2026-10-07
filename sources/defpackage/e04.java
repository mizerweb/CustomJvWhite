package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class e04 implements k79 {
    public final long a;
    public final String b;
    public final Uri c;
    public final CharSequence d;
    public final ynh e;

    public e04(long j, String str, Uri uri, CharSequence charSequence, ynh ynhVar) {
        this.a = j;
        this.b = str;
        this.c = uri;
        this.d = charSequence;
        this.e = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e04)) {
            return false;
        }
        e04 e04Var = (e04) obj;
        return this.a == e04Var.a && this.b.equals(e04Var.b) && cqk.d(this.c, e04Var.c) && this.d.equals(e04Var.d) && this.e.equals(e04Var.e);
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
        return this.e.hashCode() + mw7.f((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.d);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    public final String toString() {
        return "CommentsBlackListListItem(id=" + this.a + ", name=" + ((Object) this.b) + ", avatar=" + this.c + ", abbreviation=" + ((Object) this.d) + ", subtitle=" + this.e + ")";
    }
}
