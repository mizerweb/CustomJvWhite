package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ynf implements wnf {
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final ComponentName g;
    public final IBinder h;
    public final Bundle i;
    public final MediaSession.Token j;

    static {
        String str = vqi.a;
        k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        n = Integer.toString(3, 36);
        o = Integer.toString(4, 36);
        p = Integer.toString(5, 36);
        q = Integer.toString(6, 36);
        r = Integer.toString(7, 36);
        s = Integer.toString(8, 36);
        t = Integer.toString(9, 36);
    }

    public ynf(int i, int i2, int i3, int i4, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = str2;
        this.g = componentName;
        this.h = iBinder;
        this.i = bundle;
        this.j = token;
    }

    @Override // defpackage.wnf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.wnf
    public final String b() {
        return this.f;
    }

    @Override // defpackage.wnf
    public final ComponentName c() {
        return this.g;
    }

    @Override // defpackage.wnf
    public final Object d() {
        return this.h;
    }

    @Override // defpackage.wnf
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ynf)) {
            return false;
        }
        ynf ynfVar = (ynf) obj;
        return this.a == ynfVar.a && this.b == ynfVar.b && this.c == ynfVar.c && this.d == ynfVar.d && TextUtils.equals(this.e, ynfVar.e) && TextUtils.equals(this.f, ynfVar.f) && Objects.equals(this.g, ynfVar.g) && Objects.equals(this.h, ynfVar.h) && Objects.equals(this.j, ynfVar.j);
    }

    @Override // defpackage.wnf
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putInt(k, this.a);
        bundle.putInt(l, this.b);
        bundle.putInt(m, this.c);
        bundle.putString(n, this.e);
        bundle.putString(o, this.f);
        vfl.d(bundle, q, this.h);
        bundle.putParcelable(p, this.g);
        bundle.putBundle(r, this.i);
        bundle.putInt(s, this.d);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(t, token);
        }
        return bundle;
    }

    @Override // defpackage.wnf
    public final boolean g() {
        return false;
    }

    @Override // defpackage.wnf
    public final Bundle getExtras() {
        return new Bundle(this.i);
    }

    @Override // defpackage.wnf
    public final String getPackageName() {
        return this.e;
    }

    @Override // defpackage.wnf
    public final int getType() {
        return this.b;
    }

    @Override // defpackage.wnf
    public final MediaSession.Token h() {
        return this.j;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, this.h, this.j);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.e + " type=" + this.b + " libraryVersion=" + this.c + " interfaceVersion=" + this.d + " service=" + this.f + " IMediaSession=" + this.h + " extras=" + this.i + "}";
    }
}
