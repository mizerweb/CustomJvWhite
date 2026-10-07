package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* JADX INFO: loaded from: classes.dex */
public final class ay0 implements v71 {
    public final String a;
    public final bne b;
    public final iue c;
    public final d68 d;
    public final v71 e;
    public final String f;
    public Object g;
    public final int h;

    public ay0(String str, bne bneVar, iue iueVar, d68 d68Var, v71 v71Var, String str2) {
        this.a = str;
        this.b = bneVar;
        this.c = iueVar;
        this.d = d68Var;
        this.e = v71Var;
        this.f = str2;
        this.h = ((((d68Var.hashCode() + ((iueVar.hashCode() + (((str.hashCode() * 31) + (bneVar != null ? bneVar.hashCode() : 0)) * 31)) * 31)) * 31) + (v71Var != null ? v71Var.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.v71
    public final String a() {
        return this.a;
    }

    @Override // defpackage.v71
    public final boolean b(Uri uri) {
        return r5h.L0(this.a, uri.toString(), false);
    }

    @Override // defpackage.v71
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ay0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ay0 ay0Var = (ay0) obj;
        return cqk.d(this.a, ay0Var.a) && cqk.d(this.b, ay0Var.b) && cqk.d(this.c, ay0Var.c) && cqk.d(this.d, ay0Var.d) && cqk.d(this.e, ay0Var.e) && cqk.d(this.f, ay0Var.f);
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}
