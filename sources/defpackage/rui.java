package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public interface rui {
    long a();

    default boolean b() {
        return vqi.R(d()) || cqk.d(d().getScheme(), "content");
    }

    long c();

    Uri d();

    boolean e();

    default rui f(long j) {
        return this;
    }

    default c70 g() {
        return null;
    }

    String getContentType();

    long getDuration();

    int getHeight();

    int getType();

    int getWidth();

    boolean h();

    String i();

    long j();

    long k();
}
