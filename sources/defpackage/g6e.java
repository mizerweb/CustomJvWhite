package defpackage;

import android.graphics.drawable.Drawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class g6e implements k79 {
    public final long a;
    public final s5e b;
    public final Drawable c;
    public final boolean d;
    public final long e;

    public g6e(long j, s5e s5eVar, Drawable drawable, boolean z) {
        this.a = j;
        this.b = s5eVar;
        this.c = drawable;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6e)) {
            return false;
        }
        g6e g6eVar = (g6e) obj;
        return this.a == g6eVar.a && cqk.d(this.b, g6eVar.b) && cqk.d(this.c, g6eVar.c) && this.d == g6eVar.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Drawable drawable = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.one_chat_reactions_selection_animoji_view_type;
    }

    public final String toString() {
        return "ReactionModel(animojiId=" + this.a + ", reaction=" + ((Object) this.b) + ", reactionDrawable=" + this.c + ", selected=" + this.d + ")";
    }
}
