package defpackage;

import java.util.concurrent.ExecutorService;
import one.me.mediaeditor.GifViewerWidget;
import one.me.mediaeditor.MediaEditScreen;
import one.me.mediaeditor.PhotoViewerWidget;
import one.me.mediaeditor.VideoViewerWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class s0a extends sr0 {
    public final t3f m;

    public s0a(MediaEditScreen mediaEditScreen, t3f t3fVar, ExecutorService executorService) {
        super(mediaEditScreen, executorService, new k45(5));
        this.m = t3fVar;
    }

    @Override // defpackage.sr0
    public final Widget L(Object obj) {
        kb9 kb9Var = (kb9) obj;
        int iOrdinal = kb9Var.l.ordinal();
        if (iOrdinal == 0) {
            String name = s0a.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, nbh.s(kb9Var.a, "item: ", " is not supported"), null);
                }
            }
            return null;
        }
        if (iOrdinal == 1) {
            return new PhotoViewerWidget(kb9Var.a, this.m);
        }
        if (iOrdinal == 2) {
            return new GifViewerWidget(kb9Var.a, this.m);
        }
        if (iOrdinal == 3) {
            return new VideoViewerWidget(kb9Var.a, this.m);
        }
        ore.o();
        return null;
    }

    @Override // defpackage.sr0
    public final long M(Object obj) {
        return ((kb9) obj).a;
    }

    @Override // defpackage.sr0
    public final void N(hve hveVar) {
        String name = s0a.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            br4 br4VarC = rx8.C(hveVar);
            a4cVar.c(je9Var, name, "Media editor. Configure router | root exist | target exist:" + (br4VarC != null ? br4VarC.getTargetController() : null), null);
        }
    }

    @Override // defpackage.sr0
    public final void O(Object obj) {
        kb9 kb9Var = (kb9) obj;
        String name = s0a.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "configureRouter: " + kb9Var + " is not photo or video", null);
        }
    }
}
