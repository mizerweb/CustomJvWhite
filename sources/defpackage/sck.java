package defpackage;

import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sck implements EngineCore.EventPacker {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ sck(d dVar, String str, String str2, long j, long j2, int i) {
        this.a = i;
        this.b = dVar;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public final byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        switch (this.a) {
            case 0:
                return this.b.a(this.c, this.d, this.e, this.f, insertEventTools);
            default:
                return this.b.b(this.c, this.d, this.e, this.f, insertEventTools);
        }
    }
}
