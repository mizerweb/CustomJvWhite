package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yx2 implements k79 {
    public final ynh a;
    public final ynh b;
    public final String c;
    public final CharSequence d;
    public final long e;
    public final boolean f;
    public final List g;

    public yx2(ynh ynhVar, ynh ynhVar2, String str, CharSequence charSequence, long j, boolean z, List list) {
        this.a = ynhVar;
        this.b = ynhVar2;
        this.c = str;
        this.d = charSequence;
        this.e = j;
        this.f = z;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx2)) {
            return false;
        }
        yx2 yx2Var = (yx2) obj;
        return cqk.d(this.a, yx2Var.a) && cqk.d(this.b, yx2Var.b) && cqk.d(this.c, yx2Var.c) && cqk.d(this.d, yx2Var.d) && this.e == yx2Var.e && this.f == yx2Var.f && cqk.d(this.g, yx2Var.g);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return Long.MIN_VALUE;
    }

    public final int hashCode() {
        int iH = bc1.h(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.d;
        return this.g.hashCode() + nbh.n(qt4.g((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.messages_list_chat_description_view_type;
    }

    public final String toString() {
        return "ChatDescriptionViewListItem(title=" + this.a + ", subtitle=" + this.b + ", avatarUrl=" + this.c + ", avatarPlaceholder=" + ((Object) this.d) + ", avatarPlaceholderId=" + this.e + ", showCallOverlay=" + this.f + ", descriptionList=" + this.g + ")";
    }

    public /* synthetic */ yx2(ynh ynhVar, tnh tnhVar, String str, CharSequence charSequence, long j, int i) {
        this(ynhVar, tnhVar, str, charSequence, j, false, r66.a);
    }
}
