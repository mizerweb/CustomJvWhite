package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oc implements k79 {
    public final long a;
    public final String b;
    public final ynh c;
    public final String d;
    public final CharSequence e;
    public final boolean f;
    public final long g;

    public oc(long j, String str, ynh ynhVar, String str2, CharSequence charSequence, boolean z) {
        this.a = j;
        this.b = str;
        this.c = ynhVar;
        this.d = str2;
        this.e = charSequence;
        this.f = z;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return this.a == ocVar.a && this.b.equals(ocVar.b) && this.c.equals(ocVar.c) && this.d.equals(ocVar.d) && this.e.equals(ocVar.e) && this.f == ocVar.f;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + mw7.f(zo5.d(bc1.h((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    public final String toString() {
        return "AdminFromContactsItem(id=" + this.a + ", name=" + ((Object) this.b) + ", subtitle=" + this.c + ", avatar=" + this.d + ", abbreviation=" + ((Object) this.e) + ", isVerified=" + this.f + ")";
    }
}
