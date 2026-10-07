package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ecl implements g1m, cub, ttb, ntb {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public ecl(Executor executor, ntb ntbVar) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.d = ntbVar;
    }

    @Override // defpackage.cub
    public void a(Object obj) {
        ((kam) this.d).o(obj);
    }

    @Override // defpackage.g1m
    public final void b(Task task) {
        switch (this.a) {
            case 0:
                if (((kam) task).d) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new rda(28, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new txj(this, task, false, 4));
                return;
            case 2:
                if (task.j()) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new ruh(this, task, false, 7));
                    return;
                }
                return;
            default:
                this.b.execute(new ruh(this, task, false, 8));
                return;
        }
    }

    @Override // defpackage.ntb
    public void c() {
        ((kam) this.d).p();
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        ((kam) this.d).n(exc);
    }

    public ecl(Executor executor, otb otbVar) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.d = otbVar;
    }

    public ecl(Executor executor, cub cubVar) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.d = cubVar;
    }

    public ecl(Executor executor, j8h j8hVar, kam kamVar) {
        this.a = 3;
        this.b = executor;
        this.c = j8hVar;
        this.d = kamVar;
    }
}
