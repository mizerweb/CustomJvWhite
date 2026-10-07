package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class fkh {
    public final pkh a;
    public final String b;
    public boolean c;
    public kjh d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public fkh(pkh pkhVar, String str) {
        this.a = pkhVar;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = uqi.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        kjh kjhVar = this.d;
        if (kjhVar != null && kjhVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((kjh) arrayList.get(size)).b) {
                kjh kjhVar2 = (kjh) arrayList.get(size);
                if (pkh.i.isLoggable(Level.FINE)) {
                    cwl.a(kjhVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(kjh kjhVar, long j) {
        synchronized (this.a) {
            if (!this.c) {
                if (d(kjhVar, j, false)) {
                    this.a.d(this);
                }
            } else if (kjhVar.b) {
                if (pkh.i.isLoggable(Level.FINE)) {
                    cwl.a(kjhVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (pkh.i.isLoggable(Level.FINE)) {
                    cwl.a(kjhVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[LOOP:0: B:23:0x005f->B:28:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[EDGE_INSN: B:40:0x0077->B:30:0x0077 BREAK  A[LOOP:0: B:23:0x005f->B:28:0x0073], SYNTHETIC] */
    public final boolean d(kjh kjhVar, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        fkh fkhVar = kjhVar.c;
        if (fkhVar != this) {
            if (fkhVar != null) {
                ore.k("task is in multiple queues");
                return false;
            }
            kjhVar.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(kjhVar);
        if (iIndexOf == -1) {
            kjhVar.d = j2;
            if (pkh.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(cwl.c(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(cwl.c(j2 - jNanoTime));
                }
                cwl.a(kjhVar, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((kjh) it.next()).d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, kjhVar);
            if (size == 0) {
                return true;
            }
        } else if (kjhVar.d > j2) {
            arrayList.remove(iIndexOf);
            kjhVar.d = j2;
            if (pkh.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(cwl.c(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(cwl.c(j2 - jNanoTime));
                }
                cwl.a(kjhVar, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((kjh) it.next()).d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, kjhVar);
            if (size == 0) {
                return true;
            }
        } else if (pkh.i.isLoggable(Level.FINE)) {
            cwl.a(kjhVar, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = uqi.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
