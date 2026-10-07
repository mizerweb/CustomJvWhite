package defpackage;

import android.hardware.camera2.CameraManager;
import java.lang.reflect.InvocationTargetException;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class sb2 implements AutoCloseable {
    public final zqh a;
    public final String b;
    public final CameraManager c;
    public final dq4 d;
    public final b40 e;
    public final mjg f;
    public final r8e g;
    public final pzf h;
    public final q8e i;
    public final q72 j;
    public final sgg k;

    public sb2(Provider provider, zqh zqhVar, String str, vo8 vo8Var) {
        this.a = zqhVar;
        this.b = str;
        this.c = (CameraManager) provider.get();
        dq4 dq4VarA = cqk.a(lvb.x0(new nah(vo8Var), lvb.x0(zqhVar.h, new du4("CXCP-CameraStatusMonitor"))));
        this.d = dq4VarA;
        this.e = gvk.a(false);
        mjg mjgVarA = p90.a(yh2.a);
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.h = pzfVarB;
        this.i = new q8e(pzfVarB);
        this.j = e9i.o(new qt1(this, null, 16));
        this.k = yab.i0(dq4VarA, null, 0, new m5(this, null, 17), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IllegalAccessException, InvocationTargetException {
        if (this.e.a()) {
            this.k.b(null);
            cqk.g(this.d);
        }
    }
}
