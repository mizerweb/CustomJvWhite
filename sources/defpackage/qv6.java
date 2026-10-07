package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qv6 implements xwd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qv6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xwd
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new n48((ov6) obj);
            default:
                return (ScheduledExecutorService) ((af7) obj).invoke();
        }
    }
}
