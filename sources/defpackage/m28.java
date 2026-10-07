package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class m28 extends fs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m28(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.fs0
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (((Future) obj2).cancel(false)) {
                    ((qg7) obj).a();
                }
                break;
            default:
                ((AtomicBoolean) obj2).set(true);
                cqk.g((gu4) obj);
                break;
        }
    }
}
