package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class o55 extends fs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o55(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    @Override // defpackage.fs0
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ((AtomicBoolean) obj).set(true);
                break;
            case 2:
                ((ta9) obj).a();
                break;
            case 3:
                ((xa9) obj).a();
                break;
            default:
                rcd rcdVar = (rcd) obj;
                if (rcdVar.n()) {
                    rcdVar.b.c();
                }
                break;
        }
    }

    @Override // defpackage.fs0
    public void b() {
        switch (this.a) {
            case 0:
                p55 p55Var = (p55) this.b;
                if (p55Var.c.f()) {
                    p55Var.g.b();
                }
                break;
        }
    }
}
