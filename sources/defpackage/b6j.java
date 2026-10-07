package defpackage;

import com.vk.push.core.base.AidlException;
import one.me.mediaeditor.VideoViewerWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class b6j extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ VideoViewerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6j(lq4 lq4Var, VideoViewerWidget videoViewerWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = videoViewerWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        VideoViewerWidget videoViewerWidget = this.g;
        switch (i) {
            case 0:
                b6j b6jVar = new b6j(lq4Var, videoViewerWidget, 0);
                b6jVar.f = obj;
                return b6jVar;
            case 1:
                b6j b6jVar2 = new b6j(lq4Var, videoViewerWidget, 1);
                b6jVar2.f = obj;
                return b6jVar2;
            default:
                b6j b6jVar3 = new b6j(lq4Var, videoViewerWidget, 2);
                b6jVar3.f = obj;
                return b6jVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((b6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((b6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((b6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        rui ruiVar;
        uj6 uj6Var;
        e3j e3jVarW0;
        e3j e3jVarW1;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                xw9 xw9Var = (xw9) obj2;
                VideoViewerWidget videoViewerWidget = this.g;
                String str = videoViewerWidget.k;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        boolean z = xw9Var.b != null;
                        a4cVar.c(je9Var, str, s5h.y0("Media editor. Video page state changed, \n                        |hasContent:" + z + ", \n                        |item:" + xw9Var.a + ",\n                        |curAttachId:" + videoViewerWidget.u1() + "\n                        |\n            "), null);
                    }
                }
                hb9 hb9Var = xw9Var.a;
                if (hb9Var != null && hb9Var.b == videoViewerWidget.u1() && (ruiVar = xw9Var.b) != null) {
                    videoViewerWidget.e = ruiVar;
                    Object targetController = videoViewerWidget.getTargetController();
                    a6j a6jVar = targetController instanceof a6j ? (a6j) targetController : null;
                    if (a6jVar != null && (e3jVarW0 = a6jVar.w0()) != null) {
                        e3j.w(e3jVarW0, xw9Var.b, true, d3j.ATTACH_VIEWER, 0.0f, AidlException.SDK_IS_NOT_INITIALIZED);
                        if (((Boolean) ((e5d) videoViewerWidget.l.getValue()).x().i()).booleanValue()) {
                            videoViewerWidget.s1().setAlpha(0.0f);
                            e3jVarW0.q0(new um7(videoViewerWidget, e3jVarW0, 3));
                        }
                    }
                    if (!((Boolean) ((e5d) videoViewerWidget.l.getValue()).x().i()).booleanValue() && (uj6Var = videoViewerWidget.d) != null) {
                        uj6Var.g();
                    }
                    videoViewerWidget.s1().a(videoViewerWidget.i);
                }
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                cc6 cc6Var = (cc6) obj3;
                VideoViewerWidget videoViewerWidget2 = this.g;
                zv8[] zv8VarArr = VideoViewerWidget.o;
                if (cc6Var instanceof pb6) {
                    pb6 pb6Var = (pb6) cc6Var;
                    long j = pb6Var.a.b;
                    long jU1 = videoViewerWidget2.u1();
                    String str2 = videoViewerWidget2.k;
                    if (j == jU1) {
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.d;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, zo5.j(videoViewerWidget2.u1(), "handlePageDisappear: "), null);
                            }
                        }
                        videoViewerWidget2.e = null;
                        Object targetController2 = videoViewerWidget2.getTargetController();
                        a6j a6jVar2 = targetController2 instanceof a6j ? (a6j) targetController2 : null;
                        if (a6jVar2 != null && (e3jVarW1 = a6jVar2.w0()) != null) {
                            e3jVarW1.pause();
                            e3jVarW1.H(null);
                            e3jVarW1.stop();
                        }
                        videoViewerWidget2.s1().b();
                    } else {
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var3 = je9.f;
                            if (a4cVar3.b(je9Var3)) {
                                long jU2 = videoViewerWidget2.u1();
                                long j2 = pb6Var.a.b;
                                StringBuilder sbS = qt4.s(jU2, "handlePageDisappear: localId ", " != eventId ");
                                sbS.append(j2);
                                a4cVar3.c(je9Var3, str2, sbS.toString(), null);
                            }
                        }
                    }
                }
                return sbi.a;
            default:
                Object obj4 = this.f;
                ch3.d0(obj);
                ww9 ww9Var = (ww9) obj4;
                VideoViewerWidget videoViewerWidget3 = this.g;
                zv8[] zv8VarArr2 = VideoViewerWidget.o;
                Object targetController3 = videoViewerWidget3.getTargetController();
                a6j a6jVar3 = targetController3 instanceof a6j ? (a6j) targetController3 : null;
                e3j e3jVarW2 = a6jVar3 != null ? a6jVar3.w0() : null;
                if (e3jVarW2 == null) {
                    String str3 = videoViewerWidget3.k;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var4 = je9.f;
                        if (a4cVar4.b(je9Var4)) {
                            a4cVar4.c(je9Var4, str3, "handleControlEvents: " + ww9Var + ", videoPlayer is null", null);
                        }
                    }
                } else if (ww9Var instanceof uw9) {
                    if (!e3jVarW2.P()) {
                        e3jVarW2.pause();
                    }
                    e3jVarW2.seekTo((long) (((uw9) ww9Var).a * e3jVarW2.getDuration()));
                } else if (ww9Var instanceof tw9) {
                    if (!e3jVarW2.P()) {
                        e3jVarW2.pause();
                    }
                    e3jVarW2.seekTo((long) (((tw9) ww9Var).a * e3jVarW2.getDuration()));
                } else if (cqk.d(ww9Var, vw9.a)) {
                    e3jVarW2.play();
                } else if (cqk.d(ww9Var, vw9.c)) {
                    if (!e3jVarW2.P()) {
                        e3jVarW2.pause();
                    }
                } else {
                    if (!cqk.d(ww9Var, vw9.b)) {
                        ore.o();
                        return null;
                    }
                    e3jVarW2.play();
                }
                return sbi.a;
        }
    }
}
