package defpackage;

import com.vk.push.core.base.AidlException;
import one.me.stories.edit.VideoViewerWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class c6j extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ VideoViewerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6j(lq4 lq4Var, VideoViewerWidget videoViewerWidget, int i) {
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
                c6j c6jVar = new c6j(lq4Var, videoViewerWidget, 0);
                c6jVar.f = obj;
                return c6jVar;
            case 1:
                c6j c6jVar2 = new c6j(lq4Var, videoViewerWidget, 1);
                c6jVar2.f = obj;
                return c6jVar2;
            default:
                c6j c6jVar3 = new c6j(lq4Var, videoViewerWidget, 2);
                c6jVar3.f = obj;
                return c6jVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((c6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((c6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((c6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        a6j a6jVarU1;
        e3j e3jVarW0;
        e3j e3jVarW1;
        e3j e3jVarW2;
        uj6 uj6Var;
        e3j e3jVarW3;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                b16 b16Var = (b16) obj2;
                VideoViewerWidget videoViewerWidget = this.g;
                zv8[] zv8VarArr = VideoViewerWidget.o;
                je9 je9Var = je9.d;
                if (b16Var instanceof r06) {
                    int i = ((r06) b16Var).a;
                    if (i == 5 && i != 0) {
                        g8c g8cVar = videoViewerWidget.n;
                        if (g8cVar != null) {
                            g8cVar.a();
                        }
                        tnh tnhVar = new tnh(R.string.oneme_chatmedia_viewer_load_video_fail);
                        h8c h8cVar = new h8c(videoViewerWidget);
                        h8cVar.m(tnhVar);
                        h8cVar.h(new w8c(R.drawable.icon_warning));
                        videoViewerWidget.n = h8cVar.p();
                    }
                    videoViewerWidget.v1().N1.getValue();
                } else if (cqk.d(b16Var, u06.a)) {
                    String str = videoViewerWidget.k;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "releaseForExport: stopping player to release decoder", null);
                    }
                    a6j a6jVarU2 = videoViewerWidget.u1();
                    if (a6jVarU2 != null && (e3jVarW2 = a6jVarU2.w0()) != null) {
                        p26 p26VarV1 = videoViewerWidget.v1();
                        long jE = e3jVarW2.e();
                        boolean z = !e3jVarW2.P();
                        p26VarV1.T1 = jE;
                        p26VarV1.U1 = z;
                        e3jVarW2.pause();
                        e3jVarW2.H(null);
                        e3jVarW2.stop();
                    }
                } else if (!(b16Var instanceof v06)) {
                    String str2 = videoViewerWidget.k;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "event: " + b16Var + " not implemented", null);
                    }
                } else if (!videoViewerWidget.v1().I1) {
                    String str3 = videoViewerWidget.k;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, "restoreAfterExport: preparing player", null);
                    }
                    rui ruiVar = videoViewerWidget.e;
                    if (ruiVar != null) {
                        a6j a6jVarU3 = videoViewerWidget.u1();
                        if (a6jVarU3 != null && (e3jVarW1 = a6jVarU3.w0()) != null) {
                            e3j.w(e3jVarW1, ruiVar, ((v06) b16Var).b, d3j.STORIES_EDITOR, 0.0f, AidlException.SDK_IS_NOT_INITIALIZED);
                        }
                        v06 v06Var = (v06) b16Var;
                        if (v06Var.a > 0 && (a6jVarU1 = videoViewerWidget.u1()) != null && (e3jVarW0 = a6jVarU1.w0()) != null) {
                            e3jVarW0.seekTo(v06Var.a);
                        }
                        videoViewerWidget.s1().a(videoViewerWidget.i);
                    }
                }
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                x16 x16Var = (x16) obj3;
                VideoViewerWidget videoViewerWidget2 = this.g;
                zv8[] zv8VarArr2 = VideoViewerWidget.o;
                a6j a6jVarU4 = videoViewerWidget2.u1();
                e3j e3jVarW4 = a6jVarU4 != null ? a6jVarU4.w0() : null;
                if (e3jVarW4 == null) {
                    String str4 = videoViewerWidget2.k;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar4.b(je9Var2)) {
                            a4cVar4.c(je9Var2, str4, "handleControlEvents: " + x16Var + ", videoPlayer is null", null);
                        }
                    }
                } else if (x16Var instanceof v16) {
                    if (!e3jVarW4.P()) {
                        e3jVarW4.pause();
                    }
                    e3jVarW4.seekTo((long) (((v16) x16Var).a * e3jVarW4.getDuration()));
                } else if (x16Var instanceof u16) {
                    if (!e3jVarW4.P()) {
                        e3jVarW4.pause();
                    }
                    e3jVarW4.seekTo((long) (((u16) x16Var).a * e3jVarW4.getDuration()));
                } else if (cqk.d(x16Var, w16.a)) {
                    e3jVarW4.play();
                } else if (cqk.d(x16Var, w16.c)) {
                    if (!e3jVarW4.P()) {
                        e3jVarW4.pause();
                    }
                } else {
                    if (!cqk.d(x16Var, w16.b)) {
                        ore.o();
                        return null;
                    }
                    e3jVarW4.play();
                }
                return sbi.a;
            default:
                Object obj4 = this.f;
                ch3.d0(obj);
                y16 y16Var = (y16) obj4;
                VideoViewerWidget videoViewerWidget3 = this.g;
                zv8[] zv8VarArr3 = VideoViewerWidget.o;
                je9 je9Var3 = je9.d;
                boolean z2 = videoViewerWidget3.v1().I1;
                String str5 = videoViewerWidget3.k;
                if (z2) {
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var3)) {
                        a4cVar5.c(je9Var3, str5, "Story editor. handlePageState early return: navigating away", null);
                    }
                } else {
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null && a4cVar6.b(je9Var3)) {
                        boolean z3 = y16Var.b != null;
                        a4cVar6.c(je9Var3, str5, s5h.y0("Story editor. Video page state changed, \n                        |hasContent:" + z3 + ", \n                        |item:" + y16Var.a + ",\n                        |\n            "), null);
                    }
                    if (y16Var.a == null) {
                        String str6 = videoViewerWidget3.k;
                        a4c a4cVar7 = gm0.f;
                        if (a4cVar7 != null && a4cVar7.b(je9Var3)) {
                            a4cVar7.c(je9Var3, str6, "Story editor handlePageState early return cuz media item was null", null);
                        }
                    } else {
                        rui ruiVar2 = y16Var.b;
                        if (ruiVar2 != null) {
                            videoViewerWidget3.e = ruiVar2;
                            a6j a6jVarU5 = videoViewerWidget3.u1();
                            if (a6jVarU5 != null && (e3jVarW3 = a6jVarU5.w0()) != null) {
                                String str7 = videoViewerWidget3.k;
                                a4c a4cVar8 = gm0.f;
                                if (a4cVar8 != null && a4cVar8.b(je9Var3)) {
                                    a6j a6jVarU6 = videoViewerWidget3.u1();
                                    a6j a6jVarU7 = videoViewerWidget3.u1();
                                    a4cVar8.c(je9Var3, str7, "host=" + a6jVarU6 + " player=" + (a6jVarU7 != null ? a6jVarU7.w0() : null), null);
                                }
                                e3j.w(e3jVarW3, y16Var.b, true, d3j.STORIES_EDITOR, 0.0f, AidlException.SDK_IS_NOT_INITIALIZED);
                                if (((Boolean) ((e5d) videoViewerWidget3.l.getValue()).x().i()).booleanValue()) {
                                    videoViewerWidget3.s1().setAlpha(0.0f);
                                    e3jVarW3.q0(new um7(videoViewerWidget3, e3jVarW3, 4));
                                }
                            }
                            if (!((Boolean) ((e5d) videoViewerWidget3.l.getValue()).x().i()).booleanValue() && (uj6Var = videoViewerWidget3.d) != null) {
                                uj6Var.g();
                            }
                            videoViewerWidget3.s1().a(videoViewerWidget3.i);
                        }
                    }
                }
                return sbi.a;
        }
    }
}
