package defpackage;

import java.util.List;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lj5 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ DevMenuFeatureTogglesPageScreen c;

    public /* synthetic */ lj5(List list, DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen) {
        this.b = list;
        this.c = devMenuFeatureTogglesPageScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                devMenuFeatureTogglesPageScreen.p1().post(new lj5(list, devMenuFeatureTogglesPageScreen));
                break;
            default:
                if (list.size() == 1) {
                    devMenuFeatureTogglesPageScreen.p1().X();
                }
                devMenuFeatureTogglesPageScreen.p1().w0(0);
                break;
        }
    }

    public /* synthetic */ lj5(DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen, List list) {
        this.c = devMenuFeatureTogglesPageScreen;
        this.b = list;
    }
}
