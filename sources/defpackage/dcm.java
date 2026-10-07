package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class dcm implements s2l {
    final /* synthetic */ p3m a;
    final /* synthetic */ float b;
    final /* synthetic */ hcm c;
    final /* synthetic */ float d;
    final /* synthetic */ ecm e;

    public dcm(ecm ecmVar, p3m p3mVar, float f, hcm hcmVar, float f2) {
        this.a = p3mVar;
        this.b = f;
        this.c = hcmVar;
        this.d = f2;
        this.e = ecmVar;
    }

    @Override // defpackage.s2l
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Float f = (Float) obj;
        if (f.floatValue() >= 1.0f) {
            ecm.g(this.e, f.floatValue());
            this.e.q(this.a, this.b, f.floatValue(), this.c);
        }
        this.e.b.set(false);
    }

    @Override // defpackage.s2l
    public final void b(Throwable th) {
        bo7 bo7Var = ecm.s;
        String str = "Unable to set zoom to " + this.d;
        if (Log.isLoggable(bo7Var.a, 5)) {
            Log.w("AutoZoom", bo7Var.f(str), th);
        }
        this.e.b.set(false);
    }
}
