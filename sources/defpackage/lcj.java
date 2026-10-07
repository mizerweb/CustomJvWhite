package defpackage;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class lcj {
    public final yd6 a;
    public final PriorityQueue b = new PriorityQueue(new o6(14));
    public final IdentityHashMap c = new IdentityHashMap();
    public final ReentrantLock d;
    public final Condition e;
    public volatile Thread f;
    public final AtomicInteger g;
    public final ArrayList h;

    public lcj(yd6 yd6Var) {
        this.a = yd6Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.d = reentrantLock;
        this.e = reentrantLock.newCondition();
        this.g = new AtomicInteger(0);
        this.h = new ArrayList(8);
    }
}
