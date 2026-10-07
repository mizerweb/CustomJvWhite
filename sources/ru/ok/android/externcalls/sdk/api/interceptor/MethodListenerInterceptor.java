package ru.ok.android.externcalls.sdk.api.interceptor;

import defpackage.a9m;
import defpackage.cqk;
import defpackage.hsb;
import defpackage.isb;
import defpackage.ksb;
import defpackage.lsb;
import java.io.InterruptedIOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u001cB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ok/android/externcalls/sdk/api/interceptor/MethodListenerInterceptor;", "", "T", "Lisb;", "", "methodName", "Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "Lru/ok/android/externcalls/sdk/api/interceptor/MethodListenerInterceptor$Listener;", "listener", "Lsbi;", "addListener", "(Lru/ok/android/externcalls/sdk/api/interceptor/MethodListenerInterceptor$Listener;)V", "removeListener", "Lhsb;", "okApiChain", "Llsb;", "intercept", "(Lhsb;)Llsb;", "Ljava/lang/String;", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Listener", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MethodListenerInterceptor<T> implements isb {
    private final Class<T> clazz;
    private final CopyOnWriteArrayList<Listener<T>> listeners = new CopyOnWriteArrayList<>();
    private final String methodName;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/api/interceptor/MethodListenerInterceptor$Listener;", "T", "", "response", "Lsbi;", "onMethod", "(Ljava/lang/Object;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Listener<T> {
        void onMethod(T response);
    }

    public MethodListenerInterceptor(String str, Class<T> cls) {
        this.methodName = str;
        this.clazz = cls;
    }

    public final void addListener(Listener<T> listener) {
        this.listeners.addIfAbsent(listener);
    }

    public final Class<T> getClazz() {
        return this.clazz;
    }

    @Override // defpackage.isb
    public lsb intercept(hsb okApiChain) throws InterruptedIOException {
        a9m a9mVar = (a9m) okApiChain;
        ksb ksbVar = (ksb) a9mVar.d;
        String method = InterceptorUtilsKt.getMethod(ksbVar.a);
        lsb lsbVarI = a9mVar.i(ksbVar);
        Object obj = lsbVarI.a;
        if (cqk.d(method, this.methodName) && this.clazz.isInstance(obj)) {
            T tCast = this.clazz.cast(obj);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (tCast != null) {
                    listener.onMethod(tCast);
                }
            }
        }
        return lsbVarI;
    }

    public final void removeListener(Listener<T> listener) {
        this.listeners.remove(listener);
    }
}
