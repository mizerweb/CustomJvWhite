package defpackage;

import com.my.tracker.applifecycle.MyTrackerAppLifecycle;
import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.userlifecycle.MyTrackerUserLifecycle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y9b implements Consumer {
    public final /* synthetic */ int a;

    @Override // com.my.tracker.core.utils.Consumer
    public final void accept(Object obj) {
        EngineMiniCore engineMiniCore = (EngineMiniCore) obj;
        switch (this.a) {
            case 0:
                MyTrackerAppLifecycle.a(engineMiniCore);
                break;
            default:
                MyTrackerUserLifecycle.a(engineMiniCore);
                break;
        }
    }
}
