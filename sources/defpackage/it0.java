package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class it0 {
    public final Uri a;
    public up b = up.d;
    public final np c = new np();

    public it0(Uri uri) {
        this.a = uri;
    }

    public final jt0 a(hu8 hu8Var) {
        return new jt0(this.a, this.b, this.c, hu8Var);
    }

    public final void b(String str, String str2) {
        this.c.a(new j5h(str, str2));
    }

    public final void c(String str, boolean z) {
        this.c.a(new xz0(str, z));
    }
}
