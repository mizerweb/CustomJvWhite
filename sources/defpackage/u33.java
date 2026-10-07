package defpackage;

import java.util.concurrent.ExecutorService;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.contentLevelStub.ContentLevelViewerWidget;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes4.dex */
public final class u33 extends sr0 {
    public final t3f m;

    public u33(ChatMediaViewerScreen chatMediaViewerScreen, t3f t3fVar, ExecutorService executorService) {
        super(chatMediaViewerScreen, executorService, new k45(3));
        this.m = t3fVar;
    }

    @Override // defpackage.sr0
    public final Widget L(Object obj) {
        qy9 qy9Var = (qy9) obj;
        if (qy9Var instanceof ey9) {
            return new ContentLevelViewerWidget();
        }
        boolean z = qy9Var instanceof ky9;
        t3f t3fVar = this.m;
        if (z) {
            ky9 ky9Var = (ky9) qy9Var;
            String str = ky9Var.f;
            long j = ky9Var.a;
            return ky9Var.e ? new GifViewerWidget(j, str, t3fVar) : new PhotoViewerWidget(j, str, t3fVar);
        }
        if (qy9Var instanceof py9) {
            py9 py9Var = (py9) qy9Var;
            return new VideoViewerWidget(py9Var.a, py9Var.e, t3fVar);
        }
        ore.o();
        return null;
    }

    @Override // defpackage.sr0
    public final long M(Object obj) {
        return ((qy9) obj).getItemId();
    }

    @Override // defpackage.sr0
    public final void N(hve hveVar) {
        String name = u33.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            br4 br4VarC = rx8.C(hveVar);
            a4cVar.c(je9Var, name, "Media viewer. Configure router | root exist | target exist:" + (br4VarC != null ? br4VarC.getTargetController() : null), null);
        }
    }
}
