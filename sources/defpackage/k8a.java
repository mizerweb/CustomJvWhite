package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class k8a implements k79 {
    public final long a;
    public final CharSequence b;
    public final ynh c;
    public final String d;
    public final boolean e;
    public final long f;
    public final CharSequence g;
    public final s5e h;
    public final boolean i;

    public k8a(long j, CharSequence charSequence, ynh ynhVar, String str, boolean z, long j2, CharSequence charSequence2, s5e s5eVar, boolean z2) {
        this.a = j;
        this.b = charSequence;
        this.c = ynhVar;
        this.d = str;
        this.e = z;
        this.f = j2;
        this.g = charSequence2;
        this.h = s5eVar;
        this.i = z2;
    }

    public static k8a i(k8a k8aVar, s5e s5eVar) {
        long j = k8aVar.a;
        CharSequence charSequence = k8aVar.b;
        ynh ynhVar = k8aVar.c;
        String str = k8aVar.d;
        boolean z = k8aVar.e;
        long j2 = k8aVar.f;
        CharSequence charSequence2 = k8aVar.g;
        k8aVar.getClass();
        boolean z2 = k8aVar.i;
        k8aVar.getClass();
        return new k8a(j, charSequence, ynhVar, str, z, j2, charSequence2, s5eVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8a)) {
            return false;
        }
        k8a k8aVar = (k8a) obj;
        return this.a == k8aVar.a && this.b.equals(k8aVar.b) && this.c.equals(k8aVar.c) && this.d.equals(k8aVar.d) && this.e == k8aVar.e && this.f == k8aVar.f && this.g.equals(k8aVar.g) && cqk.d(this.h, k8aVar.h) && this.i == k8aVar.i;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iF = mw7.f(qt4.g(nbh.n(zo5.d(bc1.h(mw7.f(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        s5e s5eVar = this.h;
        return Boolean.hashCode(this.i) + nbh.n((iF + (s5eVar == null ? 0 : s5eVar.hashCode())) * 31, 31, true);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.messages_list_context_member_view_type;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (!(k79Var instanceof k8a)) {
            return null;
        }
        s5e s5eVar = ((k8a) k79Var).h;
        if (cqk.d(this.h, s5eVar)) {
            return null;
        }
        return new j8a(s5eVar);
    }

    public final String toString() {
        return "MemberListItem(id=" + this.a + ", name=" + ((Object) this.b) + ", subtitle=" + this.c + ", avatar=" + this.d + ", isOnline=" + this.e + ", lastReadMark=" + this.f + ", abbreviation=" + ((Object) this.g) + ", reaction=" + ((Object) this.h) + ", isRead=true, isSelf=" + this.i + ")";
    }
}
