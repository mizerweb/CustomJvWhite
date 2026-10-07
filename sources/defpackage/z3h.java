package defpackage;

import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsBottomSheet;
import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsPageWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class z3h extends mz4 {
    public final ha9 k;
    public final h47 l;
    public final h47 m;
    public final v3h n;
    public final v3h o;
    public final v3h p;
    public final v3h q;
    public int r;

    public z3h(StoryViewsBottomSheet storyViewsBottomSheet, ha9 ha9Var, h47 h47Var, h47 h47Var2, v3h v3hVar, v3h v3hVar2, v3h v3hVar3, v3h v3hVar4) {
        super(storyViewsBottomSheet);
        this.k = ha9Var;
        this.l = h47Var;
        this.m = h47Var2;
        this.n = v3hVar;
        this.o = v3hVar2;
        this.p = v3hVar3;
        this.q = v3hVar4;
    }

    @Override // defpackage.mz4
    public final void G(hve hveVar, int i) {
        StoryViewsPageWidget storyViewsPageWidget;
        if (hveVar.o()) {
            return;
        }
        ha9 ha9Var = this.k;
        if (i == 0) {
            storyViewsPageWidget = new StoryViewsPageWidget(ha9Var, this.l, this.n, this.p);
        } else {
            storyViewsPageWidget = new StoryViewsPageWidget(ha9Var, this.m, this.o, this.q);
        }
        hveVar.T(new lve(storyViewsPageWidget, null, null, null, false, -1));
    }

    @Override // defpackage.nee
    public final int l() {
        return this.r;
    }
}
