package defpackage;

import com.my.tracker.core.EngineCore;
import com.my.tracker.core.utils.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u9b implements Consumer {
    @Override // com.my.tracker.core.utils.Consumer
    public final void accept(Object obj) {
        ((EngineCore) obj).flush();
    }
}
