package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class d5f {
    public final y3e b;
    public final vn7 c;
    public f25 d;
    public final Future e;
    public final qpc f;
    public p3k h;
    public volatile Set i;
    public final esh j;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile boolean g = false;

    public d5f(y3e y3eVar, vn7 vn7Var, Future future, qpc qpcVar, esh eshVar) {
        this.b = y3eVar;
        this.c = vn7Var;
        this.f = qpcVar;
        this.e = future;
        this.j = eshVar;
    }
}
