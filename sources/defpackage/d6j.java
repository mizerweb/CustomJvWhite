package defpackage;

import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class d6j extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ VideoViewerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6j(lq4 lq4Var, VideoViewerWidget videoViewerWidget, int i) {
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
                d6j d6jVar = new d6j(lq4Var, videoViewerWidget, 0);
                d6jVar.f = obj;
                return d6jVar;
            case 1:
                d6j d6jVar2 = new d6j(lq4Var, videoViewerWidget, 1);
                d6jVar2.f = obj;
                return d6jVar2;
            default:
                d6j d6jVar3 = new d6j(lq4Var, videoViewerWidget, 2);
                d6jVar3.f = obj;
                return d6jVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((d6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((d6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((d6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        e3j e3jVarW0;
        int i = this.e;
        sbi sbiVar = sbi.a;
        VideoViewerWidget videoViewerWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                VideoViewerWidget.u1(videoViewerWidget, (o53) obj2);
                break;
            case 1:
                ch3.d0(obj);
                bc6 bc6Var = (bc6) obj2;
                zv8[] zv8VarArr = VideoViewerWidget.q;
                if (bc6Var instanceof qb6) {
                    qy9 qy9Var = ((qb6) bc6Var).a;
                    if (qy9Var.l() == videoViewerWidget.w1() && cqk.d(qy9Var.B(), videoViewerWidget.v1())) {
                        gm0.n(videoViewerWidget.k, "Media viewer. Clear prev page");
                        rui ruiVar = videoViewerWidget.e;
                        boolean z = ruiVar != null && ruiVar.h();
                        videoViewerWidget.e = null;
                        a6j a6jVarX1 = videoViewerWidget.x1();
                        if (a6jVarX1 != null && (e3jVarW0 = a6jVarX1.w0()) != null) {
                            l63 l63VarY1 = videoViewerWidget.y1();
                            long jW1 = videoViewerWidget.w1();
                            String strV1 = videoViewerWidget.v1();
                            long jE = e3jVarW0.e();
                            long duration = e3jVarW0.getDuration();
                            l63VarY1.getClass();
                            yab.h0(l63VarY1.b, zhb.b, 3, new f63(l63VarY1, jW1, strV1, jE, duration, z, (lq4) null));
                            e3jVarW0.pause();
                            e3jVarW0.H(null);
                            e3jVarW0.stop();
                        }
                        videoViewerWidget.s1().b();
                    }
                }
                break;
            default:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr2 = VideoViewerWidget.q;
                    VideoViewerWidget.u1(videoViewerWidget, (o53) videoViewerWidget.y1().u1.a.getValue());
                    mjg mjgVar = videoViewerWidget.y1().C1;
                    Boolean bool = Boolean.FALSE;
                    mjgVar.getClass();
                    mjgVar.j(null, bool);
                }
                break;
        }
        return sbiVar;
    }
}
