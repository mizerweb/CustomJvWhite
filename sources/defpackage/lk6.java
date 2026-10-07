package defpackage;

import android.net.Uri;
import java.util.BitSet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class lk6 implements k79 {
    public final long a;
    public final Uri b;
    public final boolean c;
    public final boolean d;
    public final CharSequence e;
    public final ynh f;
    public final boolean g;
    public final CharSequence h;

    public lk6(long j, Uri uri, boolean z, boolean z2, CharSequence charSequence, ynh ynhVar, boolean z3, CharSequence charSequence2) {
        this.a = j;
        this.b = uri;
        this.c = z;
        this.d = z2;
        this.e = charSequence;
        this.f = ynhVar;
        this.g = z3;
        this.h = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk6)) {
            return false;
        }
        lk6 lk6Var = (lk6) obj;
        return this.a == lk6Var.a && cqk.d(this.b, lk6Var.b) && this.c == lk6Var.c && this.d == lk6Var.d && cqk.d(this.e, lk6Var.e) && cqk.d(this.f, lk6Var.f) && this.g == lk6Var.g && cqk.d(this.h, lk6Var.h);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Uri uri = this.b;
        int iF = mw7.f(nbh.n(nbh.n((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        ynh ynhVar = this.f;
        return this.h.hashCode() + nbh.n((iF + (ynhVar != null ? ynhVar.hashCode() : 0)) * 31, 31, this.g);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.g ? R.id.fake_chat_contact_item_view_type : R.id.fake_chat_phone_item_view_type;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        lk6 lk6Var = k79Var instanceof lk6 ? (lk6) k79Var : null;
        if (lk6Var == null) {
            return null;
        }
        kk6 kk6Var = new kk6(3);
        BitSet bitSet = (BitSet) kk6Var.b;
        bitSet.set(0, !cqk.d(this.b, lk6Var.b));
        bitSet.set(1, this.c != lk6Var.c);
        bitSet.set(2, !cqk.d(this.e, lk6Var.e));
        bitSet.set(3, !cqk.d(this.f, lk6Var.f));
        bitSet.set(4, this.g != lk6Var.g);
        bitSet.set(5, !cqk.d(this.h, lk6Var.h));
        bitSet.set(6, this.d != lk6Var.d);
        return kk6Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeChatModel(contactId=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        qv1.v(", isOnline=", ", isVerified=", sb, this.c, this.d);
        sb.append(", title=");
        sb.append((Object) this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", isRegistered=");
        sb.append(this.g);
        sb.append(", abbreviation=");
        sb.append((Object) this.h);
        sb.append(")");
        return sb.toString();
    }
}
