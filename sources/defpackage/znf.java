package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class znf implements wnf {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final int b;
    public final ComponentName c;
    public final String d;
    public final Bundle e;

    static {
        String str = vqi.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        k = Integer.toString(5, 36);
    }

    public znf(int i2, ComponentName componentName) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        lvb.R((Build.MANUFACTURER.equals("samsung") && Build.VERSION.SDK_INT == 36) || !TextUtils.isEmpty(packageName));
        this.a = i2;
        this.b = 101;
        this.c = componentName;
        this.d = packageName;
        this.e = bundle;
    }

    @Override // defpackage.wnf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.wnf
    public final String b() {
        ComponentName componentName = this.c;
        return componentName == null ? "" : componentName.getClassName();
    }

    @Override // defpackage.wnf
    public final ComponentName c() {
        return this.c;
    }

    @Override // defpackage.wnf
    public final Object d() {
        return null;
    }

    @Override // defpackage.wnf
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof znf)) {
            return false;
        }
        znf znfVar = (znf) obj;
        int i2 = znfVar.b;
        int i3 = this.b;
        if (i3 != i2) {
            return false;
        }
        if (i3 == 100) {
            return true;
        }
        if (i3 != 101) {
            return false;
        }
        return Objects.equals(this.c, znfVar.c);
    }

    @Override // defpackage.wnf
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, null);
        bundle.putInt(g, this.a);
        bundle.putInt(h, this.b);
        bundle.putParcelable(i, this.c);
        bundle.putString(j, this.d);
        bundle.putBundle(k, this.e);
        return bundle;
    }

    @Override // defpackage.wnf
    public final boolean g() {
        return true;
    }

    @Override // defpackage.wnf
    public final Bundle getExtras() {
        return new Bundle(this.e);
    }

    @Override // defpackage.wnf
    public final String getPackageName() {
        return this.d;
    }

    @Override // defpackage.wnf
    public final int getType() {
        return this.b != 101 ? 0 : 2;
    }

    @Override // defpackage.wnf
    public final MediaSession.Token h() {
        return null;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c, null);
    }

    public final String toString() {
        return zo5.t(new StringBuilder("SessionToken {legacy, uid="), this.a, "}");
    }
}
