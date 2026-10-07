package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vsl implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0g b;

    public /* synthetic */ vsl(a0g a0gVar, int i) {
        this.a = i;
        this.b = a0gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.i();
    }
}
