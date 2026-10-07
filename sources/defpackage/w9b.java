package defpackage;

import com.my.tracker.MyTracker;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.utils.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w9b implements Consumer {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Map c;

    public /* synthetic */ w9b(String str, long j, Map map) {
        this.a = str;
        this.b = j;
        this.c = map;
    }

    @Override // com.my.tracker.core.utils.Consumer
    public final void accept(Object obj) {
        MyTracker.a(this.a, this.b, this.c, (EngineCore) obj);
    }
}
