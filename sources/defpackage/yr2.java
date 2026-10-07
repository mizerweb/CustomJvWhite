package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import ru.ok.tamtam.services.ChannelQueueUndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class yr2 {
    public final gu4 a;
    public final pe3 b;
    public final rgi c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public yr2(gu4 gu4Var, s35 s35Var, pe3 pe3Var, rgi rgiVar) {
        this.a = gu4Var;
        this.b = pe3Var;
        this.c = rgiVar;
    }

    public final boolean a(Long l, kih kihVar) {
        final int i = 0;
        if (!Boolean.TRUE.booleanValue()) {
            return false;
        }
        final as2 as2Var = (as2) this.d.computeIfAbsent(l, new am(4, new j22(5, this)));
        AtomicReference atomicReference = as2Var.h;
        xt4 xt4Var = (xt4) as2Var.d.invoke();
        final int i2 = 1;
        if (xt4Var == null) {
            atomicReference.updateAndGet(new UnaryOperator() { // from class: zr2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i3 = i;
                    as2 as2Var2 = as2Var;
                    hr2 hr2Var = (hr2) obj;
                    switch (i3) {
                        case 0:
                            if (hr2Var != null && !hr2Var.i(null)) {
                                gm0.Y(as2Var2.e, "subscribeIfNeed#1: channel already closed!");
                            }
                            break;
                        default:
                            if (hr2Var != null && !hr2Var.i(null)) {
                                gm0.Y(as2Var2.e, "subscribeIfNeed#2: already closed!");
                            }
                            break;
                    }
                    return null;
                }
            });
        } else if (!cqk.d(as2Var.g.getAndSet(xt4Var), xt4Var)) {
            atomicReference.updateAndGet(new UnaryOperator() { // from class: zr2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i3 = i2;
                    as2 as2Var2 = as2Var;
                    hr2 hr2Var = (hr2) obj;
                    switch (i3) {
                        case 0:
                            if (hr2Var != null && !hr2Var.i(null)) {
                                gm0.Y(as2Var2.e, "subscribeIfNeed#1: channel already closed!");
                            }
                            break;
                        default:
                            if (hr2Var != null && !hr2Var.i(null)) {
                                gm0.Y(as2Var2.e, "subscribeIfNeed#2: already closed!");
                            }
                            break;
                    }
                    return null;
                }
            });
            atomicReference.updateAndGet(new pa1(as2Var, i2, xt4Var));
        }
        hr2 hr2Var = (hr2) as2Var.h.get();
        if (hr2Var != null) {
            Object objB = all.b(hr2Var, kihVar);
            boolean z = objB instanceof cs2;
            if (!z) {
                String str = as2Var.e;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "send " + kihVar, null);
                    }
                }
            }
            if (z) {
                Throwable thA = ds2.a(objB);
                String str2 = as2Var.e;
                if (thA == null) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "fail to send " + kihVar, null);
                        }
                    }
                } else {
                    gm0.V(str2, "handle error", new ChannelQueueUndeliveredElementException(kihVar, thA));
                }
            }
        }
        return true;
    }
}
