package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.File;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes.dex */
public final class v78 {
    public final t78 a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final d68 g;
    public final bne h;
    public final iue i;
    public final whd j;
    public final u78 k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final qcd o;
    public final ls0 p;
    public final at5 q;

    public v78(w78 w78Var) {
        this.a = w78Var.g;
        Uri uri = w78Var.a;
        this.b = uri;
        int i = -1;
        if (uri != null) {
            if (rki.d(uri)) {
                i = 0;
            } else if (uri.getPath() != null && "file".equals(rki.b(uri))) {
                i = y7a.b(y7a.a(uri.getPath())) ? 2 : 3;
            } else if ("content".equals(rki.b(uri))) {
                i = 4;
            } else if ("asset".equals(rki.b(uri))) {
                i = 5;
            } else if ("res".equals(rki.b(uri))) {
                i = 6;
            } else if ("data".equals(uri.getScheme())) {
                i = 7;
            } else if ("android.resource".equals(rki.b(uri))) {
                i = 8;
            }
        }
        this.c = i;
        this.e = w78Var.h;
        this.f = w78Var.i;
        this.g = w78Var.f;
        this.h = w78Var.d;
        iue iueVar = w78Var.e;
        this.i = iueVar == null ? iue.c : iueVar;
        this.j = w78Var.j;
        this.k = w78Var.b;
        boolean z = (w78Var.c & 48) == 0 && (rki.d(w78Var.a) || w78.c(w78Var.a));
        this.m = z;
        int i2 = w78Var.c;
        this.l = !z ? i2 | 48 : i2;
        this.n = (i2 & 15) == 0;
        this.o = w78Var.k;
        this.p = w78Var.l;
        this.q = w78Var.m;
    }

    public static v78 a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return w78.d(uri).a();
    }

    public static v78 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return a(Uri.parse(str));
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.f;
    }

    public final synchronized File d() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final boolean e(int i) {
        return (this.l & i) == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v78)) {
            return false;
        }
        v78 v78Var = (v78) obj;
        if (this.e != v78Var.e || this.m != v78Var.m || this.n != v78Var.n || !qdl.b(this.b, v78Var.b) || !qdl.b(this.a, v78Var.a)) {
            return false;
        }
        if (!qdl.b(null, null) || !qdl.b(this.d, v78Var.d) || !qdl.b(null, null) || !qdl.b(this.g, v78Var.g) || !qdl.b(this.h, v78Var.h) || !qdl.b(this.j, v78Var.j) || !qdl.b(this.k, v78Var.k) || !qdl.b(Integer.valueOf(this.l), Integer.valueOf(v78Var.l)) || !qdl.b(null, null) || !qdl.b(null, null) || !qdl.b(this.q, v78Var.q) || !qdl.b(this.i, v78Var.i) || this.f != v78Var.f) {
            return false;
        }
        qcd qcdVar = this.o;
        v71 v71VarB = qcdVar != null ? qcdVar.b() : null;
        qcd qcdVar2 = v78Var.o;
        return qdl.b(v71VarB, qcdVar2 != null ? qcdVar2.b() : null);
    }

    public final int hashCode() {
        qcd qcdVar = this.o;
        return r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(r0m.b(0, this.a), this.b), Boolean.valueOf(this.e)), null), this.j), this.k), Integer.valueOf(this.l)), Boolean.valueOf(this.m)), Boolean.valueOf(this.n)), this.g), null), this.h), this.i), qcdVar != null ? qcdVar.b() : null), null), this.q), 0), Boolean.valueOf(this.f));
    }

    public final String toString() {
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.v(this.b, "uri");
        dc9VarC.v(this.a, "cacheChoice");
        dc9VarC.v(this.g, "decodeOptions");
        dc9VarC.v(this.o, "postprocessor");
        dc9VarC.v(this.j, LogFactory.PRIORITY_KEY);
        dc9VarC.v(this.h, "resizeOptions");
        dc9VarC.v(this.i, "rotationOptions");
        dc9VarC.v(null, "bytesRange");
        dc9VarC.v(null, "resizingAllowedOverride");
        dc9VarC.v(this.q, "downsampleOverride");
        dc9VarC.w("progressiveRenderingEnabled", false);
        dc9VarC.w("localThumbnailPreviewsEnabled", this.e);
        dc9VarC.w("loadThumbnailOnly", this.f);
        dc9VarC.v(this.k, "lowestPermittedRequestLevel");
        dc9VarC.u(this.l, "cachesDisabled");
        dc9VarC.w("isDiskCacheEnabled", this.m);
        dc9VarC.w("isMemoryCacheEnabled", this.n);
        dc9VarC.v(null, "decodePrefetches");
        dc9VarC.u(0, "delayMs");
        return dc9VarC.toString();
    }
}
