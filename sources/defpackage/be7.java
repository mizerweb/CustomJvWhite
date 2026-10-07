package defpackage;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class be7 implements af9, mr4 {
    public final pw a = lvb.J("WrappingUtils");
    public int b = 6;

    @Override // defpackage.af9
    public final void a(String str, String str2) {
        if (ww3.j1(this.a, str)) {
            return;
        }
        String strConcat = "Fresco:".concat(str);
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.h;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, strConcat, str2, null);
        }
    }

    @Override // defpackage.mr4
    public final void b(String str, Throwable th) {
        String strConcat = "Fresco:".concat("ControllerListener");
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, strConcat, qv1.k("onFailure ", str), th);
        }
    }

    @Override // defpackage.mr4
    public final void c(String str) {
    }

    @Override // defpackage.af9
    public final void d(IOException iOException) {
        if (ww3.j1(this.a, "HeifExifUtil")) {
            return;
        }
        gm0.l("Fresco:".concat("HeifExifUtil"), "Failed reading Heif Exif orientation -> ignoring", iOException);
    }

    @Override // defpackage.af9
    public final void e(String str, String str2, Throwable th) {
        if (ww3.j1(this.a, str)) {
            return;
        }
        gm0.V("Fresco:".concat(str), str2, new xd7(str2, th));
    }

    @Override // defpackage.mr4
    public final void f(Object obj, String str) {
    }

    @Override // defpackage.af9
    public final void g(Exception exc, String str) {
        if (ww3.j1(this.a, str)) {
            return;
        }
        String strConcat = "Fresco:".concat(str);
        xd7 xd7Var = new xd7("unhandled exception", exc);
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        a4c.f(a4cVar, je9.h, strConcat, "unhandled exception", null, xd7Var, 8);
    }

    @Override // defpackage.af9
    public final boolean h(int i) {
        return this.b <= i;
    }

    @Override // defpackage.af9
    public final void i(int i) {
        this.b = i;
    }

    @Override // defpackage.mr4
    public final void j(String str, Throwable th) {
        String strConcat = "Fresco:".concat("ControllerListener");
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, strConcat, qv1.k("onIntermediateImageFailed ", str), th);
        }
    }

    @Override // defpackage.mr4
    public final void onIntermediateImageSet(String str, Object obj) {
    }

    @Override // defpackage.af9
    public final void v(String str, String str2) {
        if (ww3.j1(this.a, str)) {
            return;
        }
        Log.v("Fresco:".concat(str), str2);
    }

    @Override // defpackage.af9
    public final void w(String str, String str2) {
        if (ww3.j1(this.a, str)) {
            return;
        }
        gm0.Y("Fresco:".concat(str), str2);
    }

    @Override // defpackage.af9
    public final void w(String str, String str2, Throwable th) {
        if (ww3.j1(this.a, str)) {
            return;
        }
        gm0.V("Fresco:".concat(str), str2, th);
    }

    @Override // defpackage.af9
    public final void d(String str, String str2) {
        if (ww3.j1(this.a, str)) {
            return;
        }
        gm0.n("Fresco:".concat(str), str2);
    }

    @Override // defpackage.af9
    public final void e(String str, String str2) {
        if (ww3.j1(this.a, str)) {
            return;
        }
        gm0.Y("Fresco:".concat(str), str2);
    }

    @Override // defpackage.mr4
    public final void e(String str, Object obj, Animatable animatable) {
    }
}
