package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zx9 {
    public static final String b;
    public final Uri a;

    static {
        String str = vqi.a;
        b = Integer.toString(0, 36);
    }

    public zx9(c7k c7kVar) {
        this.a = (Uri) c7kVar.b;
    }

    public static zx9 a(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(b);
        uri.getClass();
        c7k c7kVar = new c7k(18, false);
        c7kVar.b = uri;
        return new zx9(c7kVar);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(b, this.a);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx9) && this.a.equals(((zx9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
