package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class ek implements v71 {
    public final boolean a;
    public final String b;

    public ek(int i, boolean z) {
        this.a = z;
        this.b = zo5.h(i, "anim://");
    }

    @Override // defpackage.v71
    public final String a() {
        return this.b;
    }

    @Override // defpackage.v71
    public final boolean b(Uri uri) {
        return z5h.K0(uri.toString(), this.b, false);
    }

    @Override // defpackage.v71
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!this.a) {
            return this == obj;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !ek.class.equals(obj.getClass())) {
            return false;
        }
        return cqk.d(this.b, ((ek) obj).b);
    }

    public final int hashCode() {
        return !this.a ? super.hashCode() : this.b.hashCode();
    }
}
