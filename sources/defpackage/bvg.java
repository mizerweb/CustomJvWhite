package defpackage;

import java.util.concurrent.ExecutorService;
import one.me.stories.viewer.viewer.StoriesViewerScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class bvg extends mz4 {
    public final StoriesViewerScreen k;
    public final t3f l;
    public final d20 m;

    public bvg(StoriesViewerScreen storiesViewerScreen, t3f t3fVar, ExecutorService executorService) {
        super(storiesViewerScreen);
        this.k = storiesViewerScreen;
        this.l = t3fVar;
        this.m = new d20(new t3a(this), new ki3(null, executorService, new k45(8)));
    }

    @Override // defpackage.mz4
    public final void G(hve hveVar, int i) {
        je9 je9Var = je9.f;
        if (hveVar.o()) {
            String name = bvg.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "router has root controller", null);
                return;
            }
            return;
        }
        pkc pkcVar = (pkc) ww3.u1(i, this.m.f);
        if (pkcVar != null) {
            t3f t3fVar = this.l;
            UserStoriesScreen userStoriesScreen = new UserStoriesScreen(t3fVar, t3fVar.b(), pkcVar);
            userStoriesScreen.setTargetWidget(this.k);
            hveVar.T(new lve(userStoriesScreen, null, null, null, false, -1));
            return;
        }
        String name2 = bvg.class.getName();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, name2, c0a.k(i, "item for position=", " is null"), null);
        }
    }

    @Override // defpackage.nee
    public final int l() {
        return this.m.f.size();
    }

    @Override // defpackage.mz4, defpackage.nee
    public final long m(int i) {
        pkc pkcVar = (pkc) ww3.u1(i, this.m.f);
        if (pkcVar != null) {
            return pkcVar.a;
        }
        return -1L;
    }
}
