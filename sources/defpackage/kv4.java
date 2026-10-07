package defpackage;

import ru.ok.tracer.lite.TracerLite;

/* JADX INFO: loaded from: classes3.dex */
public final class kv4 {
    public final TracerLite a;
    public final nxh b;
    public final c7k c;

    public kv4(TracerLite tracerLite, oxh oxhVar) {
        this.a = tracerLite;
        this.b = tracerLite.getHttpClientHolder();
        rj5 rj5Var = new rj5(10, false);
        rj5Var.b = oxhVar;
        this.c = new c7k(rj5Var);
    }
}
