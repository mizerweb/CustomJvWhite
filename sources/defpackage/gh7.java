package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class gh7 {
    public static final List b = xw3.P0(eh7.c, fh7.c);
    public final String a;

    public gh7(String str) {
        this.a = str;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public String e() {
        return null;
    }

    public abstract String f();

    public String g() {
        return null;
    }

    public abstract String h();

    public String i() {
        return null;
    }

    public abstract Uri j();

    public abstract String k();

    public final String[] l() {
        return (String[]) a.Y0(new String[]{f(), b(), a(), c(), d(), h(), i(), e(), g()}).toArray(new String[0]);
    }

    public final String m() {
        return zo5.o(d(), " DESC");
    }

    public final String toString() {
        return "QueryParams(name='" + ((Object) '*') + "')";
    }
}
