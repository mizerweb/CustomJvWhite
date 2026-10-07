package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ixk implements g1m, cub, ttb, ntb {
    public final /* synthetic */ int a;
    public final Executor b;
    public final kq4 c;
    public final kam d;

    public /* synthetic */ ixk(Executor executor, kq4 kq4Var, kam kamVar, int i) {
        this.a = i;
        this.b = executor;
        this.c = kq4Var;
        this.d = kamVar;
    }

    @Override // defpackage.cub
    public void a(Object obj) {
        this.d.o(obj);
    }

    @Override // defpackage.g1m
    public final void b(Task task) {
        int i = this.a;
        Executor executor = this.b;
        switch (i) {
            case 0:
                executor.execute(new ruh(this, task, false, 5));
                break;
            default:
                executor.execute(new txj(this, task, false, 3));
                break;
        }
    }

    @Override // defpackage.ntb
    public void c() {
        this.d.p();
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        this.d.n(exc);
    }
}
