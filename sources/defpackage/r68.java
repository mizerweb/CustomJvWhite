package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r68 extends fs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public r68(xa9 xa9Var, lqh lqhVar) {
        this.a = 3;
        this.b = xa9Var;
        this.c = lqhVar;
    }

    @Override // defpackage.fs0
    public final void a() {
        boolean zRemove;
        es0 es0Var;
        ArrayList arrayListL;
        ArrayList arrayListJ;
        p76 p76Var;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                y8e y8eVar = (y8e) this.b;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    y8eVar.d();
                    return;
                } else {
                    ((t68) this.c).o.execute(new e6(17, y8eVar));
                    return;
                }
            case 1:
                synchronized (((o7b) this.c)) {
                    try {
                        zRemove = ((o7b) this.c).b.remove((Pair) this.b);
                        if (zRemove) {
                            boolean zIsEmpty = ((o7b) this.c).b.isEmpty();
                            o7b o7bVar = (o7b) this.c;
                            if (zIsEmpty) {
                                es0Var = o7bVar.f;
                                arrayListL = null;
                            } else {
                                ArrayList arrayListK = o7bVar.k();
                                arrayListL = ((o7b) this.c).l();
                                arrayListJ = ((o7b) this.c).j();
                                es0Var = null;
                                arrayList = arrayListK;
                            }
                        } else {
                            es0Var = null;
                            arrayListL = null;
                        }
                        arrayListJ = arrayListL;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                es0.c(arrayList);
                es0.d(arrayListL);
                es0.b(arrayListJ);
                if (es0Var != null) {
                    es0Var.e();
                }
                if (zRemove) {
                    ((lq0) ((Pair) this.b).first).c();
                    return;
                }
                return;
            case 2:
                zme zmeVar = (zme) this.c;
                jp8 jp8Var = zmeVar.g;
                synchronized (jp8Var) {
                    p76Var = jp8Var.e;
                    jp8Var.e = null;
                    jp8Var.f = 0;
                    break;
                }
                p76.g(p76Var);
                zmeVar.f = true;
                ((lq0) this.b).c();
                return;
            default:
                ((xa9) this.b).a();
                fbc fbcVar = (fbc) ((lqh) this.c).c;
                xa9 xa9Var = (xa9) this.b;
                synchronized (fbcVar) {
                    ((ArrayDeque) fbcVar.c).remove(xa9Var);
                }
                return;
        }
    }

    @Override // defpackage.fs0
    public void b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 1:
                es0.b(((o7b) obj).j());
                break;
            case 2:
                zme zmeVar = (zme) obj;
                if (zmeVar.e.f()) {
                    zmeVar.g.b();
                }
                break;
        }
    }

    @Override // defpackage.fs0
    public void c() {
        switch (this.a) {
            case 1:
                es0.c(((o7b) this.c).k());
                break;
        }
    }

    @Override // defpackage.fs0
    public void d() {
        switch (this.a) {
            case 1:
                es0.d(((o7b) this.c).l());
                break;
        }
    }

    public /* synthetic */ r68(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
