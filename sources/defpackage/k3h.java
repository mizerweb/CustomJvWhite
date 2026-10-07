package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class k3h implements k79 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final Drawable d;

    public k3h(long j, CharSequence charSequence, String str, kfg kfgVar) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.d = kfgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3h)) {
            return false;
        }
        k3h k3hVar = (k3h) obj;
        return this.a == k3hVar.a && this.b.equals(k3hVar.b) && cqk.d(this.c, k3hVar.c) && cqk.d(this.d, k3hVar.d);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iF = mw7.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.d;
        return iHashCode + (drawable != null ? drawable.hashCode() : 0);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    public final String toString() {
        return "StoryViewItem(id=" + this.a + ", name=" + ((Object) this.b) + ", avatarUrl=" + this.c + ", reactionEmoji=" + this.d + ")";
    }
}
