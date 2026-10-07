package defpackage;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class fak {
    public final Clock a;
    public final w4k b;
    public final ConcurrentLinkedDeque c = new ConcurrentLinkedDeque();
    public final ConcurrentLinkedDeque d = new ConcurrentLinkedDeque();
    public final Object e = new Object();
    public Instant f;
    public volatile boolean g;

    public fak(Clock clock, w4k w4kVar) {
        this.a = clock;
        this.b = w4kVar;
    }

    public final List a() {
        List list = (List) this.d.pollFirst();
        if (list != null) {
            return list;
        }
        Object[] objArr = {new n8k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    public final Optional b(int i) {
        if (i <= 0) {
            return Optional.empty();
        }
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                eak eakVar = (eak) it.next();
                if (eakVar.a() <= i) {
                    it.remove();
                    return Optional.of(eakVar);
                }
            }
            return Optional.empty();
        } catch (ConcurrentModificationException e) {
            if (this.g) {
                return Optional.empty();
            }
            throw e;
        }
    }

    public final void c(o8k o8kVar, Consumer consumer) {
        boolean z = o8kVar instanceof m8k;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.c;
        if (!z || concurrentLinkedDeque.stream().filter(new e05(25)).filter(new e05(26)).count() < 256) {
            concurrentLinkedDeque.addLast(new gck(o8kVar, consumer));
        }
    }

    public final void d(boolean z) {
        this.g = true;
        this.c.clear();
        this.d.clear();
        if (z) {
            synchronized (this.e) {
                this.f = null;
            }
        }
    }

    public final String toString() {
        return "SendRequestQueue[" + this.b + "]";
    }
}
