package defpackage;

import java.util.concurrent.ExecutorService;
import one.me.stories.edit.background.ThemeBackgroundPageWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class xph extends mz4 {
    public final br4 k;
    public final ha9 l;
    public final d20 m;

    public xph(br4 br4Var, ha9 ha9Var, ExecutorService executorService) {
        super(br4Var);
        this.k = br4Var;
        this.l = ha9Var;
        this.m = new d20(new t3a(this), new ki3(null, executorService, new k45(9)));
    }

    @Override // defpackage.mz4
    public final void G(hve hveVar, int i) {
        ThemeBackgroundPageWidget themeBackgroundPageWidget;
        if (hveVar.o()) {
            return;
        }
        aoh aohVar = (aoh) ww3.u1(i, this.m.f);
        if (aohVar == null) {
            String name = xph.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, c0a.k(i, "item for position=", " is null"), null);
                return;
            }
            return;
        }
        if (aohVar instanceof pph) {
            themeBackgroundPageWidget = new ThemeBackgroundPageWidget(new hm0(((pph) aohVar).a), this.l);
        } else {
            if (!(aohVar instanceof jp7)) {
                ore.o();
                return;
            }
            themeBackgroundPageWidget = new ThemeBackgroundPageWidget(((jp7) aohVar).a, this.l);
        }
        ThemeBackgroundPageWidget themeBackgroundPageWidget2 = themeBackgroundPageWidget;
        themeBackgroundPageWidget2.setTargetController(this.k);
        hveVar.T(new lve(themeBackgroundPageWidget2, null, null, null, false, -1));
    }

    @Override // defpackage.nee
    public final int l() {
        return this.m.f.size();
    }
}
