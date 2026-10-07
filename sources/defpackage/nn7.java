package defpackage;

import android.net.Uri;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nn7 extends y8f {
    public final long c;
    public final CharSequence d;
    public final Uri e;
    public final xcd f;
    public final xcd g;
    public final List h;
    public final boolean i;
    public final CharSequence j;
    public final boolean k;
    public final String l;
    public final long m;

    public nn7(long j, String str, Uri uri, xcd xcdVar, xcd xcdVar2, List list, boolean z, CharSequence charSequence, boolean z2, String str2) {
        super(2, list);
        this.c = j;
        this.d = str;
        this.e = uri;
        this.f = xcdVar;
        this.g = xcdVar2;
        this.h = list;
        this.i = z;
        this.j = charSequence;
        this.k = z2;
        this.l = str2;
        this.m = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn7)) {
            return false;
        }
        nn7 nn7Var = (nn7) obj;
        return this.c == nn7Var.c && cqk.d(this.d, nn7Var.d) && cqk.d(this.e, nn7Var.e) && this.f.equals(nn7Var.f) && this.g.equals(nn7Var.g) && cqk.d(this.h, nn7Var.h) && this.i == nn7Var.i && cqk.d(this.j, nn7Var.j) && this.k == nn7Var.k && cqk.d(this.l, nn7Var.l);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.m;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        CharSequence charSequence = this.d;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Uri uri = this.e;
        int iN = nbh.n(mw7.f(nbh.n(qv1.c((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        return iN + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.y8f
    public final boolean i(y8f y8fVar) {
        return equals((nn7) y8fVar);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.chats_search_global_chat_view_type;
    }

    @Override // defpackage.y8f
    public final boolean o(y8f y8fVar) {
        return y8fVar.getItemId() == this.m;
    }

    @Override // defpackage.y8f
    public final String q() {
        return this.l;
    }

    @Override // defpackage.y8f
    public final String toString() {
        return "GlobalChatSearchModel(id=" + this.c + ", lastMessageTime=" + ((Object) this.d) + ", avatar=" + this.e + ", preProcessedTitle=" + this.f + ", preProcessedSubtitle=" + this.g + ", titleHighlights=" + this.h + ", isChannel=" + this.i + ", abbreviation=" + ((Object) this.j) + ", isVerified=" + this.k + ", queryId=" + this.l + ")";
    }
}
