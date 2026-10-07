package defpackage;

import one.me.sdk.arch.ViewModelUncaughtException;

/* JADX INFO: loaded from: classes.dex */
public final class z7j extends n0 implements yt4 {
    public final /* synthetic */ a8j b;

    /* JADX WARN: Illegal instructions before constructor call */
    public z7j(a8j a8jVar) {
        nhb nhbVar = nhb.f;
        this.b = a8jVar;
        super(nhbVar);
    }

    @Override // defpackage.yt4
    public final void r0(vt4 vt4Var, Throwable th) {
        a8j a8jVar = this.b;
        String str = a8jVar.a;
        String str2 = "unhandled exception in tag=" + str + ",vm=" + a8jVar + ",context=" + vt4Var;
        gm0.r(str, str2, new ViewModelUncaughtException(str2, th));
    }
}
