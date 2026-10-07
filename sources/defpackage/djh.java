package defpackage;

import bolts.AggregateException;
import bolts.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class djh implements mq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ djh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.mq4
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                if (task.isFaulted()) {
                    synchronized (this.b) {
                        ((ArrayList) this.c).add(task.getError());
                        break;
                    }
                }
                if (task.isCancelled()) {
                    ((AtomicBoolean) this.d).set(true);
                }
                if (((AtomicInteger) this.e).decrementAndGet() == 0) {
                    if (((ArrayList) this.c).size() == 0) {
                        boolean z = ((AtomicBoolean) this.d).get();
                        rjh rjhVar = (rjh) this.f;
                        if (z) {
                            rjhVar.a();
                        } else {
                            rjhVar.c(null);
                        }
                    } else if (((ArrayList) this.c).size() == 1) {
                        ((rjh) this.f).b((Exception) ((ArrayList) this.c).get(0));
                    } else {
                        String str = String.format("There were %d exceptions.", Integer.valueOf(((ArrayList) this.c).size()));
                        ArrayList arrayList = (ArrayList) this.c;
                        AggregateException aggregateException = new AggregateException(str, arrayList.size() > 0 ? (Throwable) arrayList.get(0) : null);
                        aggregateException.a = Collections.unmodifiableList(arrayList);
                        ((rjh) this.f).b(aggregateException);
                    }
                }
                return null;
            default:
                Executor executor = (Executor) this.e;
                kk2 kk2Var = (kk2) this.b;
                if (kk2Var == null || !kk2Var.a.y()) {
                    return ((Boolean) ((Callable) this.c).call()).booleanValue() ? Task.forResult(null).onSuccessTask((mq4) this.d, executor).onSuccessTask((djh) ((xva) this.f).b, executor) : Task.forResult(null);
                }
                return Task.cancelled();
        }
    }
}
