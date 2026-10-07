package defpackage;

import android.net.Uri;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fm4 extends y8f {
    public final long c;
    public final CharSequence d;
    public final CharSequence e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final Uri i;
    public final CharSequence j;
    public final long k;

    public fm4(long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, List list, Uri uri, CharSequence charSequence3) {
        super(3, list);
        this.c = j;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = uri;
        this.j = charSequence3;
        this.k = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm4)) {
            return false;
        }
        fm4 fm4Var = (fm4) obj;
        return this.c == fm4Var.c && cqk.d(this.d, fm4Var.d) && cqk.d(this.e, fm4Var.e) && this.f == fm4Var.f && this.g == fm4Var.g && cqk.d(this.h, fm4Var.h) && cqk.d(this.i, fm4Var.i) && this.j.equals(fm4Var.j);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        CharSequence charSequence = this.d;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.e;
        int iC = qv1.c(nbh.n(nbh.n((iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        Uri uri = this.i;
        return mw7.f(nbh.n((iC + (uri == null ? 0 : uri.hashCode())) * 31, 31, false), 31, this.j);
    }

    @Override // defpackage.y8f
    public final boolean i(y8f y8fVar) {
        return equals((fm4) y8fVar);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.chats_search_contact_view_type;
    }

    @Override // defpackage.y8f
    public final boolean o(y8f y8fVar) {
        return this.k == y8fVar.getItemId();
    }

    @Override // defpackage.y8f
    public final String q() {
        return null;
    }

    @Override // defpackage.y8f
    public final String toString() {
        return "ContactSearchModel(id=" + this.c + ", title=" + ((Object) this.d) + ", subtitle=" + ((Object) this.e) + ", isOnline=" + this.f + ", isVerified=" + this.g + ", contactHighlights=" + this.h + ", avatar=" + this.i + ", selected=false, abbreviation=" + ((Object) this.j) + ", queryId=null)";
    }
}
