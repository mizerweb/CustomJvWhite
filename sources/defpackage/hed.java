package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.my.tracker.applifecycle.o.a;
import com.my.tracker.applifecycle.o.b;
import com.my.tracker.core.o.a0;
import com.my.tracker.core.o.g;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hed(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        List listT1;
        long jW;
        kcj kcjVar;
        int i = this.a;
        long j = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                gm0.n("en8", "execute()");
                ((rb8) ((en8) obj).a.getValue()).e();
                gm0.n("en8", "repository prefetch ok");
                return;
            case 1:
                jed jedVar = (jed) obj;
                RecyclerView recyclerViewC = jedVar.c();
                if (recyclerViewC != null) {
                    jedVar.b(recyclerViewC, 0, 0);
                    return;
                }
                return;
            case 2:
                qid qidVar = (qid) obj;
                i19 i19Var = qidVar.f;
                if (qidVar.b == 0) {
                    z = true;
                    qidVar.c = true;
                    i19Var.d(m09.ON_PAUSE);
                } else {
                    z = true;
                }
                if (qidVar.a == 0 && qidVar.c) {
                    i19Var.d(m09.ON_STOP);
                    qidVar.d = z;
                    return;
                }
                return;
            case 3:
                ((yfe) obj).p();
                return;
            case 4:
                xte xteVar = (xte) obj;
                hed hedVar = xteVar.l;
                Handler handler = xteVar.k;
                if (handler != null) {
                    handler.removeCallbacks(hedVar);
                }
                iu9 iu9Var = xteVar.g;
                long jE = iu9Var != null ? iu9Var.e() : 0L;
                iu9 iu9Var2 = xteVar.g;
                long jL = iu9Var2 != null ? iu9Var2.L() : 0L;
                mjg mjgVar = xteVar.m;
                Long lValueOf = Long.valueOf(jE);
                mjgVar.getClass();
                mjgVar.j(null, lValueOf);
                mjg mjgVar2 = xteVar.o;
                Long lValueOf2 = Long.valueOf(jL);
                mjgVar2.getClass();
                mjgVar2.j(null, lValueOf2);
                mjg mjgVar3 = xteVar.z;
                Float fValueOf = Float.valueOf(oc9.u((float) (jE / xteVar.w), 0.0f, 1.0f));
                mjgVar3.getClass();
                mjgVar3.j(null, fValueOf);
                Handler handler2 = xteVar.k;
                if (handler2 != null) {
                    handler2.postDelayed(hedVar, 17L);
                    return;
                }
                return;
            case 5:
                qid.i.f.a(((gue) obj).j);
                return;
            case 6:
                ((hve) obj).B();
                return;
            case 7:
                fbc fbcVar = (fbc) obj;
                try {
                    Map mapX0 = wm9.X0((Map) ((AtomicReference) ((ifh) fbcVar.c).getValue()).get());
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream((File) ((af7) fbcVar.b).invoke())));
                    try {
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeInt(mapX0.size());
                        for (Map.Entry entry : mapX0.entrySet()) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            Object value = entry.getValue();
                            if (value instanceof Boolean) {
                                dataOutputStream.writeInt(2);
                                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                            } else if (value instanceof Integer) {
                                dataOutputStream.writeInt(3);
                                dataOutputStream.writeInt(((Number) value).intValue());
                            } else if (value instanceof Long) {
                                dataOutputStream.writeInt(4);
                                dataOutputStream.writeLong(((Number) value).longValue());
                            } else if (value instanceof Float) {
                                dataOutputStream.writeInt(5);
                                dataOutputStream.writeFloat(((Number) value).floatValue());
                            } else {
                                if (!(value instanceof Double)) {
                                    if (!(value instanceof String)) {
                                        throw new IllegalArgumentException("Write unknown type of value " + value);
                                    }
                                    dataOutputStream.writeInt(1);
                                    dataOutputStream.writeUTF((String) value);
                                    return;
                                }
                                dataOutputStream.writeInt(6);
                                dataOutputStream.writeDouble(((Number) value).doubleValue());
                            }
                        }
                        dataOutputStream.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(dataOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            case 8:
                khh khhVar = (khh) obj;
                khhVar.a(2);
                try {
                    Context context = khhVar.a;
                    String strP = ch3.p();
                    File file = new File(context.getCacheDir(), strP.equals(context.getPackageName()) ? "tracer" : "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false))));
                    sb8.U(file);
                    File fileQ0 = lu6.q0(file, "tags");
                    synchronized (khhVar.e) {
                        listT1 = ww3.T1(khhVar.e);
                    }
                    n1g.a(fileQ0, listT1);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 9:
                lcj lcjVar = (lcj) obj;
                lcjVar.f = Thread.currentThread();
                yd6 yd6Var = lcjVar.a;
                PriorityQueue priorityQueue = lcjVar.b;
                ReentrantLock reentrantLock = lcjVar.d;
                Condition condition = lcjVar.e;
                while (true) {
                    reentrantLock.lock();
                    try {
                        kcj kcjVar2 = (kcj) priorityQueue.peek();
                        if (kcjVar2 == null || kcjVar2.c) {
                            condition.await();
                        } else {
                            long jH = kcjVar2.b - ew5.h(yd6Var.b());
                            if (jH > j) {
                                condition.awaitNanos(jH);
                            }
                        }
                        reentrantLock.unlock();
                        ArrayList arrayList = lcjVar.h;
                        long jB = yd6Var.b();
                        long jH2 = ew5.h(jB);
                        reentrantLock.lock();
                        while (true) {
                            try {
                                kcj kcjVar3 = (kcj) priorityQueue.peek();
                                if (kcjVar3 != null && !kcjVar3.c && kcjVar3.b <= jH2 && (kcjVar = (kcj) priorityQueue.poll()) != null) {
                                    arrayList.add(kcjVar);
                                }
                            } catch (Throwable th3) {
                                reentrantLock.unlock();
                                throw th3;
                            }
                        }
                        reentrantLock.unlock();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            kcj kcjVar4 = (kcj) arrayList.get(i2);
                            ce6 ce6Var = kcjVar4.a;
                            try {
                                jW = ce6Var.W(jB);
                            } catch (Exception e) {
                                Log.w("WatchdogScheduler", "Exception during watchdog tick", e);
                                jW = jH2 + 1000000;
                            }
                            reentrantLock.lock();
                            if (jW == Long.MIN_VALUE) {
                                try {
                                    kcjVar4.c = true;
                                    priorityQueue.add(kcjVar4);
                                } catch (Throwable th4) {
                                    reentrantLock.unlock();
                                    throw th4;
                                }
                            } else if (jW == -9223372036854775807L) {
                                lcjVar.c.remove(ce6Var);
                                lcjVar.g.decrementAndGet();
                            } else {
                                kcjVar4.b = jW;
                                kcjVar4.c = false;
                                priorityQueue.add(kcjVar4);
                            }
                            reentrantLock.unlock();
                            i2++;
                            size = size;
                            yd6Var = yd6Var;
                        }
                        yd6 yd6Var2 = yd6Var;
                        reentrantLock.lock();
                        try {
                            arrayList.clear();
                            reentrantLock.unlock();
                            reentrantLock.lock();
                            try {
                                condition.signal();
                                reentrantLock.unlock();
                                yd6Var = yd6Var2;
                                j = 0;
                            } catch (Throwable th5) {
                                reentrantLock.unlock();
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            reentrantLock.unlock();
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        reentrantLock.unlock();
                        throw th7;
                    }
                }
                break;
            case 10:
                ((a) obj).c();
                return;
            case 11:
                ((a0) obj).a();
                return;
            case 12:
                ((b) obj).a();
                return;
            case 13:
                ((com.my.tracker.core.b) obj).a();
                return;
            case 14:
                ((igk) obj).b.invoke();
                return;
            default:
                g.b((Queue) obj);
                return;
        }
    }
}
