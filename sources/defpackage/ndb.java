package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ndb {
    public static ndb f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public ndb(Context context) {
        Executor executorT = gm0.t();
        this.a = executorT;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorT.execute(new o90(this, context, 17));
    }

    public static synchronized ndb a(Context context) {
        try {
            if (f == null) {
                f = new ndb(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(c85 c85Var, Executor executor) {
        boolean z;
        CopyOnWriteArrayList<mdb> copyOnWriteArrayList = this.b;
        for (mdb mdbVar : copyOnWriteArrayList) {
            if (mdbVar.a.get() == null) {
                copyOnWriteArrayList.remove(mdbVar);
            }
        }
        mdb mdbVar2 = new mdb(this, c85Var, executor);
        synchronized (this.c) {
            this.b.add(mdbVar2);
            z = this.e;
        }
        if (z) {
            mdbVar2.b.execute(new e6(24, mdbVar2));
        }
    }

    public final void d(int i) {
        CopyOnWriteArrayList<mdb> copyOnWriteArrayList = this.b;
        for (mdb mdbVar : copyOnWriteArrayList) {
            if (mdbVar.a.get() == null) {
                copyOnWriteArrayList.remove(mdbVar);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (mdb mdbVar2 : this.b) {
                    mdbVar2.b.execute(new e6(24, mdbVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
