package defpackage;

import java.util.concurrent.ExecutorService;
import one.me.chatmedia.viewer.BaseMediaViewerScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sr0 extends mz4 {
    public final BaseMediaViewerScreen k;
    public final d20 l;

    public sr0(BaseMediaViewerScreen baseMediaViewerScreen, ExecutorService executorService, e9i e9iVar) {
        super(baseMediaViewerScreen);
        this.k = baseMediaViewerScreen;
        this.l = new d20(new t3a(this), new ki3(null, executorService, e9iVar));
    }

    @Override // defpackage.mz4
    public final void G(hve hveVar, int i) {
        if (hveVar.o()) {
            N(hveVar);
            return;
        }
        Object objU1 = ww3.u1(i, this.l.f);
        if (objU1 != null) {
            Widget widgetL = L(objU1);
            if (widgetL == null) {
                O(objU1);
                return;
            }
            widgetL.setTargetWidget(this.k);
            widgetL.setRetainViewMode(xq4.b);
            hveVar.T(new lve(widgetL, null, null, null, false, -1));
            return;
        }
        String name = getClass().getName();
        br4 br4VarC = rx8.C(hveVar);
        String name2 = br4VarC != null ? br4VarC.getClass().getName() : null;
        int iL = l();
        StringBuilder sbR = c0a.r(i, "controller=", name2, ", position=", ", itemCount=");
        sbR.append(iL);
        ehb ehbVar = new ehb(sbR.toString());
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, qt4.l("could not find media item by position ", i, l(), ", itemCount="), ehbVar);
        }
    }

    public abstract Widget L(Object obj);

    public abstract long M(Object obj);

    public abstract void N(hve hveVar);

    public void O(Object obj) {
    }

    @Override // defpackage.nee
    public final int l() {
        return this.l.f.size();
    }

    @Override // defpackage.mz4, defpackage.nee
    public final long m(int i) {
        Object objU1 = ww3.u1(i, this.l.f);
        if (objU1 != null) {
            return M(objU1);
        }
        return 0L;
    }
}
