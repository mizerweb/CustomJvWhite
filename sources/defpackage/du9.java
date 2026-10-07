package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes2.dex */
public final class du9 implements Animatable {
    public final /* synthetic */ ifg a;

    public du9(ifg ifgVar) {
        this.a = ifgVar;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.a.f;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ifg ifgVar = this.a;
        ifgVar.b = 0.0f;
        ifgVar.c = true;
        ifgVar.a(100.0f);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.a.b();
    }
}
