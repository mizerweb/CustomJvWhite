package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tcf implements ys5 {
    public final long a;
    public final long b;
    public final a35 c;
    public final qmc d;
    public final ArrayList e;
    public final j71 f;
    public final j6g g;
    public final w71 h;
    public final Executor i;
    public final long j;
    public final ArrayList k;
    public volatile boolean l;

    public tcf(ry9 ry9Var, qmc qmcVar, j71 j71Var, Executor executor, long j, long j2) {
        jy9 jy9Var = ry9Var.b;
        jy9Var.getClass();
        this.c = d(jy9Var.a);
        this.d = qmcVar;
        this.e = new ArrayList(jy9Var.e);
        this.f = j71Var;
        this.i = executor;
        this.a = j;
        this.b = j2;
        j6g j6gVar = j71Var.a;
        j6gVar.getClass();
        this.g = j6gVar;
        this.h = j71Var.d;
        this.k = new ArrayList();
        this.j = vqi.X(20000L);
    }

    public static a35 d(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        lvb.W(uri, "The uri must be set.");
        return new a35(uri, 0L, 1, null, map, 0L, -1L, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    public static void f(List list, w71 w71Var, long j) {
        HashMap map = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            rcf rcfVar = (rcf) list.get(i2);
            a35 a35Var = rcfVar.b;
            String strC = w71Var.c(a35Var);
            Integer num = (Integer) map.get(strC);
            rcf rcfVar2 = num == null ? null : (rcf) list.get(num.intValue());
            if (rcfVar2 != null) {
                long j2 = rcfVar2.a;
                a35 a35Var2 = rcfVar2.b;
                if (rcfVar.a <= j2 + j) {
                    Uri uri = a35Var2.a;
                    long j3 = a35Var2.g;
                    if (!uri.equals(a35Var.a)) {
                        map.put(strC, Integer.valueOf(i));
                        list.set(i, rcfVar);
                        i++;
                    } else if (j3 != -1 && a35Var2.f + j3 == a35Var.f && Objects.equals(a35Var2.h, a35Var.h) && a35Var2.i == a35Var.i && a35Var2.c == a35Var.c && a35Var2.e.equals(a35Var.e)) {
                        long j4 = a35Var.g;
                        a35 a35VarE = a35Var2.e(0L, j4 != -1 ? j3 + j4 : -1L);
                        num.getClass();
                        list.set(num.intValue(), new rcf(j2, a35VarE));
                    } else {
                        map.put(strC, Integer.valueOf(i));
                        list.set(i, rcfVar);
                        i++;
                    }
                } else {
                    map.put(strC, Integer.valueOf(i));
                    list.set(i, rcfVar);
                    i++;
                }
            } else {
                map.put(strC, Integer.valueOf(i));
                list.set(i, rcfVar);
                i++;
            }
        }
        vqi.f0(i, list.size(), list);
    }

    @Override // defpackage.ys5
    public final void a(xs5 xs5Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        k71 k71VarC;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            k71 k71VarC2 = this.f.c();
            ou6 ou6Var = (ou6) c(new ncf(this, k71VarC2, this.c), false);
            if (!this.e.isEmpty()) {
                ou6Var = (ou6) ou6Var.a(this.e);
            }
            ArrayList arrayListE = e(k71VarC2, ou6Var, false);
            Collections.sort(arrayListE);
            f(arrayListE, this.h, this.j);
            int size = arrayListE.size();
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = arrayListE.size() - 1; size2 >= 0; size2--) {
                a35 a35Var = ((rcf) arrayListE.get(size2)).b;
                String strC = this.h.c(a35Var);
                long j3 = a35Var.g;
                if (j3 == -1) {
                    long jA = bp4.a(this.g.h(strC));
                    if (jA != -1) {
                        j3 = jA - a35Var.f;
                    }
                }
                long j4 = j3;
                long jF = this.g.f(a35Var.f, j4, strC);
                j2 += jF;
                if (j4 != -1) {
                    if (j4 == jF) {
                        i++;
                        arrayListE.remove(size2);
                    }
                    if (j != -1) {
                        j += j4;
                    }
                } else {
                    j = -1;
                }
            }
            qcf qcfVar = xs5Var != null ? new qcf(xs5Var, j, size, j2, i) : null;
            arrayDeque.addAll(arrayListE);
            while (!this.l && !arrayDeque.isEmpty()) {
                if (arrayDeque2.isEmpty()) {
                    k71VarC = this.f.c();
                    bArr = new byte[131072];
                } else {
                    scf scfVar = (scf) arrayDeque2.removeFirst();
                    k71VarC = scfVar.i;
                    bArr = scfVar.k;
                }
                scf scfVar2 = new scf((rcf) arrayDeque.removeFirst(), k71VarC, qcfVar, bArr);
                b(scfVar2);
                this.i.execute(scfVar2);
                for (int size3 = this.k.size() - 1; size3 >= 0; size3--) {
                    scf scfVar3 = (scf) this.k.get(size3);
                    if (arrayDeque.isEmpty() || scfVar3.b.e()) {
                        try {
                            scfVar3.get();
                            g(size3);
                            arrayDeque2.addLast(scfVar3);
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                                if (!(cause instanceof IOException)) {
                                    throw cause;
                                }
                                throw ((IOException) cause);
                            }
                            arrayDeque.addFirst(scfVar3.h);
                            g(size3);
                            arrayDeque2.addLast(scfVar3);
                        }
                    }
                }
                scfVar2.a.b();
            }
            int i2 = 0;
            while (true) {
                int size4 = this.k.size();
                arrayList2 = this.k;
                if (i2 >= size4) {
                    break;
                }
                ((exe) arrayList2.get(i2)).cancel(true);
                i2++;
            }
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ((exe) this.k.get(size5)).c();
                g(size5);
            }
        } catch (Throwable th) {
            int i3 = 0;
            while (true) {
                int size6 = this.k.size();
                arrayList = this.k;
                if (i3 >= size6) {
                    break;
                }
                ((exe) arrayList.get(i3)).cancel(true);
                i3++;
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ((exe) this.k.get(size7)).c();
                g(size7);
            }
            throw th;
        }
    }

    public final void b(exe exeVar) {
        synchronized (this.k) {
            try {
                if (this.l) {
                    throw new InterruptedException();
                }
                this.k.add(exeVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object c(pah pahVar, boolean z) throws ExecutionException, InterruptedException, IOException {
        if (z) {
            exe exeVar = (exe) pahVar.get();
            exeVar.run();
            try {
                return exeVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                String str = vqi.a;
                throw e;
            }
        }
        while (!this.l) {
            exe exeVar2 = (exe) pahVar.get();
            b(exeVar2);
            this.i.execute(exeVar2);
            try {
                try {
                    Object obj = exeVar2.get();
                    exeVar2.c();
                    h(exeVar2);
                    return obj;
                } catch (Throwable th) {
                    exeVar2.c();
                    h(exeVar2);
                    throw th;
                }
            } catch (ExecutionException e2) {
                Throwable cause2 = e2.getCause();
                cause2.getClass();
                if (!(cause2 instanceof PriorityTaskManager$PriorityTooLowException)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    String str2 = vqi.a;
                    throw e2;
                }
                exeVar2.c();
                h(exeVar2);
            }
        }
        throw new InterruptedException();
    }

    @Override // defpackage.ys5
    public final void cancel() {
        synchronized (this.k) {
            try {
                this.l = true;
                for (int i = 0; i < this.k.size(); i++) {
                    ((exe) this.k.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ArrayList e(k71 k71Var, ou6 ou6Var, boolean z);

    public final void g(int i) {
        synchronized (this.k) {
            this.k.remove(i);
        }
    }

    public final void h(exe exeVar) {
        synchronized (this.k) {
            this.k.remove(exeVar);
        }
    }

    @Override // defpackage.ys5
    public final void remove() {
        j6g j6gVar = this.g;
        w71 w71Var = this.h;
        a35 a35Var = this.c;
        j71 j71Var = this.f;
        k71 k71VarD = j71Var.d(null, j71Var.g | 1, -4000);
        try {
            ArrayList arrayListE = e(k71VarD, (ou6) c(new ncf(this, k71VarD, a35Var), true), true);
            for (int i = 0; i < arrayListE.size(); i++) {
                j6gVar.n(w71Var.c(((rcf) arrayListE.get(i)).b));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        } finally {
            j6gVar.n(w71Var.c(a35Var));
        }
    }
}
