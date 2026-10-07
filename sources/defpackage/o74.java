package defpackage;

import com.google.firebase.components.ComponentRegistrar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o74 implements xwd {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentRegistrar b;

    public /* synthetic */ o74(ComponentRegistrar componentRegistrar, int i) {
        this.a = i;
        this.b = componentRegistrar;
    }

    @Override // defpackage.xwd
    public final Object get() {
        int i = this.a;
        return this.b;
    }
}
