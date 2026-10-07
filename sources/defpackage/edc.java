package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class edc implements ko0 {
    public final zg6 a;
    public final CopyOnWriteArrayList b;
    public final ddc c;

    public edc(Context context) {
        yeg yegVar = new yeg();
        boolean z = nec.a;
        yegVar.a = new wag(oc9.t(0.5d, 0.0d));
        yegVar.c = 128000L;
        yegVar.b = 3;
        zeg zegVar = new zeg(yegVar);
        jqc jqcVar = new jqc(10);
        Context applicationContext = context.getApplicationContext();
        new yo9(1, (byte) 0);
        new ArrayList();
        new yag();
        new pgg(5);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
        this.a = new zg6(applicationContext, map, jqcVar, zegVar);
        this.b = new CopyOnWriteArrayList();
        this.c = new ddc(this);
    }

    @Override // defpackage.ko0
    public final void a(r75 r75Var) {
        this.a.a(r75Var);
    }

    @Override // defpackage.ko0
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.ko0
    public final v1i e() {
        return this.c;
    }

    @Override // defpackage.ko0
    public final long f() {
        return this.a.f();
    }

    @Override // defpackage.ko0
    public final void g(Handler handler, r75 r75Var) {
        this.a.g(handler, r75Var);
    }
}
