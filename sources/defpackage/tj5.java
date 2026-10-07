package defpackage;

import java.util.List;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import one.me.devmenu.DevMenuGeneralPageScreen;
import one.me.devmenu.DevMenuInfoScreen;
import one.me.devmenu.DevMenuScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class tj5 extends kve {
    public final ha9 k;

    public tj5(DevMenuScreen devMenuScreen, ha9 ha9Var) {
        super(devMenuScreen);
        this.k = ha9Var;
    }

    @Override // defpackage.kve
    public final void G(hve hveVar, int i) {
        br4 devMenuGeneralPageScreen;
        if (hveVar.o()) {
            return;
        }
        List list = wj5.a;
        int i2 = ((vj5) list.get(i)).a;
        ha9 ha9Var = this.k;
        if (i2 == 0) {
            devMenuGeneralPageScreen = new DevMenuGeneralPageScreen(ha9Var);
        } else if (i2 == 1) {
            devMenuGeneralPageScreen = new DevMenuFeatureTogglesPageScreen(ha9Var);
        } else {
            if (i2 != 2) {
                ore.k(nbh.q(((vj5) list.get(i)).a, "Unknown tab id: "));
                return;
            }
            devMenuGeneralPageScreen = new DevMenuInfoScreen(ha9Var);
        }
        br4 br4Var = devMenuGeneralPageScreen;
        br4Var.setRetainViewMode(xq4.b);
        hveVar.T(new lve(br4Var, null, null, null, false, -1));
    }

    @Override // defpackage.nee
    public final int l() {
        return wj5.a.size();
    }
}
