package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fe6 implements xwd {
    public final /* synthetic */ int a;

    public /* synthetic */ fe6(int i) {
        this.a = i;
    }

    @Override // defpackage.xwd
    public final Object get() {
        switch (this.a) {
            case 0:
                return ExecutorsRegistrar.lambda$static$0();
            case 1:
                return ExecutorsRegistrar.lambda$static$1();
            case 2:
                return ExecutorsRegistrar.lambda$static$2();
            case 3:
                return ExecutorsRegistrar.lambda$static$3();
            default:
                return null;
        }
    }
}
