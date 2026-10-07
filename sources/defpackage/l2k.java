package defpackage;

import com.my.tracker.core.EngineCore;
import com.my.tracker.core.a;
import com.my.tracker.core.utils.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l2k implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l2k(a aVar, Object obj, long j, long j2, int i) {
        this.a = i;
        this.b = aVar;
        this.e = obj;
        this.c = j;
        this.d = j2;
    }

    @Override // com.my.tracker.core.utils.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                this.b.a((Boolean) obj2, this.c, this.d, (EngineCore) obj);
                break;
            default:
                this.b.a((String) obj2, this.c, this.d, (EngineCore) obj);
                break;
        }
    }
}
