package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class mmb {
    public final String a;
    public final boolean b;
    public final Uri c;
    public final String d;

    public mmb(String str, boolean z, Uri uri) {
        this.a = str;
        this.b = z;
        this.c = uri;
        this.d = "image/*";
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final Uri c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmb)) {
            return false;
        }
        mmb mmbVar = (mmb) obj;
        return cqk.d(this.a, mmbVar.a) && this.b == mmbVar.b && cqk.d(this.c, mmbVar.c) && cqk.d(this.d, mmbVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + nbh.n((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = zo5.A("NotificationImage(prefetchUrl=", this.a, ", canBeLoadedFromNetwork=", ", notificationImageUri=", this.b);
        sbA.append(this.c);
        sbA.append(", notificationImageMimeType=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ mmb(Uri uri) {
        this(null, false, uri);
    }
}
