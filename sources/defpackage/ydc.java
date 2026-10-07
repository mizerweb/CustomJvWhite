package defpackage;

import one.video.player.BaseVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class ydc implements u66 {
    public final /* synthetic */ bec a;

    public ydc(bec becVar) {
        this.a = becVar;
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void a(aec aecVar) {
        this.a.j.a(((ldc) aecVar).x());
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void b(aec aecVar) {
        bec becVar = this.a;
        String str = becVar.i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player: onFirstFrameDecoded, videoContent=" + becVar.k, null);
            }
        }
        this.a.j.d();
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void c(BaseVideoPlayer baseVideoPlayer, float f) {
        this.a.j.b();
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void i(wdc wdcVar, aec aecVar, p4d p4dVar, p4d p4dVar2) {
        if (wdcVar == wdc.b) {
            this.a.j.h();
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void p(aec aecVar) {
        this.a.j.l();
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void r(aec aecVar, float f) {
        this.a.j.n(f);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc  */
    @Override // defpackage.u66, defpackage.xdc
    public final void s(BaseVideoPlayer baseVideoPlayer, int i, int i2) {
        rui ruiVar;
        String strI;
        Boolean bool;
        dfd dfdVar;
        bec becVar = this.a;
        a84 a84Var = becVar.j;
        boolean zBooleanValue = true;
        switch (qt4.D(i2)) {
            case 0:
                a84Var.p();
                break;
            case 1:
                a84Var.f();
                break;
            case 2:
                a84Var.e();
                becVar.n.v(3, becVar.l, 1);
                break;
            case 3:
                a84Var.m();
                break;
            case 4:
                a84Var.i();
                break;
            case 5:
                baseVideoPlayer.verifyThread("one.video.player.BaseVideoPlayer.getError");
                OneVideoPlaybackException oneVideoPlaybackException = baseVideoPlayer.z;
                if (oneVideoPlaybackException != null && !cec.d(oneVideoPlaybackException)) {
                    ((t1c) becVar.a).a(new IllegalStateException("Playback failed", oneVideoPlaybackException));
                }
                ldc ldcVar = becVar.o;
                rui ruiVar2 = becVar.k;
                if (ruiVar2 == null || !ruiVar2.b()) {
                    Boolean bool2 = null;
                    if (!cec.e(oneVideoPlaybackException)) {
                        m4j m4jVarZ = ldcVar.z();
                        ym5 ym5Var = m4jVarZ instanceof ym5 ? (ym5) m4jVarZ : null;
                        if (ym5Var != null) {
                            ldc ldcVar2 = ldcVar != null ? ldcVar : null;
                            if (ldcVar2 != null && (dfdVar = ldcVar2.H) != null && dfdVar.d()) {
                                m4j m4jVarE = ym5Var.e();
                                ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.isPlayWhenReady");
                                if (ldcVar.V.z()) {
                                    ldcVar.q(m4jVarE, becVar.e());
                                } else {
                                    ldcVar.s(m4jVarE, becVar.e());
                                }
                            } else if (((Boolean) becVar.f.h2.a(e5d.S6[163]).i()).booleanValue()) {
                                m4j m4jVarZ2 = ldcVar.z();
                                ruiVar = becVar.k;
                                if (ruiVar != null) {
                                    strI = ruiVar.i();
                                } else {
                                    strI = null;
                                }
                                if (oneVideoPlaybackException != null && m4jVarZ2 != null && strI != null) {
                                    if (oneVideoPlaybackException.getC() == sdc.a || strI.length() <= 0 || cqk.d(m4jVarZ2.a().getHost(), strI)) {
                                        bool = Boolean.FALSE;
                                    } else {
                                        m4j m4jVarC = m4jVarZ2.c(strI);
                                        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.isPlayWhenReady");
                                        if (ldcVar.V.z()) {
                                            ldcVar.q(m4jVarC, becVar.e());
                                        } else {
                                            ldcVar.s(m4jVarC, becVar.e());
                                        }
                                        bool = Boolean.TRUE;
                                    }
                                    bool2 = bool;
                                }
                                if (bool2 != null) {
                                    zBooleanValue = bool2.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = false;
                            }
                        } else if (((Boolean) becVar.f.h2.a(e5d.S6[163]).i()).booleanValue()) {
                            zBooleanValue = false;
                        } else {
                            m4j m4jVarZ3 = ldcVar.z();
                            ruiVar = becVar.k;
                            if (ruiVar != null) {
                                strI = ruiVar.i();
                            } else {
                                strI = null;
                            }
                            if (oneVideoPlaybackException != null) {
                                if (oneVideoPlaybackException.getC() == sdc.a) {
                                    bool = Boolean.FALSE;
                                } else {
                                    bool = Boolean.FALSE;
                                }
                                bool2 = bool;
                            }
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                        }
                    } else if (((Boolean) becVar.f.h2.a(e5d.S6[163]).i()).booleanValue()) {
                        zBooleanValue = false;
                    } else {
                        m4j m4jVarZ4 = ldcVar.z();
                        ruiVar = becVar.k;
                        if (ruiVar != null) {
                            strI = ruiVar.i();
                        } else {
                            strI = null;
                        }
                        if (oneVideoPlaybackException != null) {
                            if (oneVideoPlaybackException.getC() == sdc.a) {
                                bool = Boolean.FALSE;
                            } else {
                                bool = Boolean.FALSE;
                            }
                            bool2 = bool;
                        }
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                    }
                } else {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    a84Var.o(oneVideoPlaybackException);
                }
                break;
            case 6:
                break;
            default:
                ore.o();
                break;
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void w(aec aecVar) {
        bec becVar = this.a;
        String str = becVar.i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Player: onFirstFrameRendered, videoContent=" + becVar.k, null);
            }
        }
        this.a.j.g();
    }
}
