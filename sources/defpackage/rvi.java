package defpackage;

import one.video.exo.error.OneVideoExoPlaybackException;

/* JADX INFO: loaded from: classes3.dex */
public final class rvi implements u66 {
    public final /* synthetic */ tvi a;

    public rvi(tvi tviVar) {
        this.a = tviVar;
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void d(aec aecVar) {
        this.a.setFixedText("VIDEO FINISH");
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void e(aec aecVar) {
        this.a.s(aecVar);
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void f(ldc ldcVar, t4j t4jVar) {
        this.a.s(ldcVar);
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void k(aec aecVar) {
        this.a.s(aecVar);
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void l(aec aecVar) {
        this.a.s(aecVar);
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void q(OneVideoExoPlaybackException oneVideoExoPlaybackException, m4j m4jVar, aec aecVar) {
        this.a.setFixedText("ERROR: " + oneVideoExoPlaybackException);
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void w(aec aecVar) {
        this.a.s(aecVar);
    }
}
