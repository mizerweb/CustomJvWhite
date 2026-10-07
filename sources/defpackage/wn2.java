package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.View;
import bolts.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class wn2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wn2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x016f  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String str;
        y7m y7mVar;
        String str2;
        zul zulVar;
        long j;
        int i2 = 0;
        switch (this.a) {
            case 0:
                yn2 yn2Var = (yn2) ((due) this.e).a;
                cca ccaVar = (cca) this.c;
                xn2 xn2Var = (xn2) this.b;
                if (xn2Var != null) {
                    yn2Var.z = true;
                    xn2Var.b.d(false);
                    yn2Var.z = false;
                }
                if (ccaVar.isEnabled() && ccaVar.hasSubMenu()) {
                    ((yba) this.d).r(ccaVar, null, 4);
                    return;
                }
                return;
            case 1:
                String str3 = (String) this.c;
                IBinder binder = ((ss9) this.b).a.getBinder();
                i1m i1mVar = (i1m) this.e;
                ms9 ms9Var = (ms9) ((y3a) i1mVar.a).e.get(binder);
                if (ms9Var == null) {
                    tt2.f("removeSubscription for callback that isn't registered id=", str3, "MBServiceCompat");
                    return;
                }
                HashMap map = ms9Var.f;
                y3a y3aVar = (y3a) i1mVar.a;
                IBinder iBinder = (IBinder) this.d;
                try {
                    if (iBinder == null) {
                        i = map.remove(str3) == null ? 0 : 1;
                        y3aVar.f = null;
                    } else {
                        List list = (List) map.get(str3);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((amc) it.next()).a) {
                                    it.remove();
                                    i2 = 1;
                                }
                            }
                            if (list.isEmpty()) {
                                map.remove(str3);
                            }
                        }
                        y3aVar.f = null;
                        i = i2;
                    }
                    if (i == 0) {
                        lvb.G0("MBServiceCompat", "removeSubscription called for " + str3 + " which is not subscribed");
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    y3aVar.f = null;
                    throw th;
                }
            case 2:
                rjh rjhVar = (rjh) this.c;
                kk2 kk2Var = (kk2) this.b;
                if (kk2Var != null && kk2Var.a.y()) {
                    rjhVar.a();
                    return;
                }
                try {
                    Task task = (Task) ((mq4) this.d).a((Task) this.e);
                    if (task == null) {
                        rjhVar.c(null);
                    } else {
                        task.continueWith(new ajh(0, this));
                    }
                    return;
                } catch (CancellationException unused) {
                    rjhVar.a();
                    return;
                } catch (Exception e) {
                    rjhVar.b(e);
                    return;
                }
            case 3:
                owj.h((View) this.b, (swj) this.c, (wze) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 4:
                ysl yslVar = (ysl) this.b;
                phf phfVar = (phf) this.c;
                yhl yhlVar = (yhl) this.d;
                String str4 = (String) this.e;
                xtj xtjVar = (xtj) phfVar.b;
                xtjVar.c = yhlVar;
                fpl fplVar = (fpl) xtjVar.b;
                if (fplVar != null) {
                    str = fplVar.d;
                    int i3 = u1l.a;
                    if (str == null || str.isEmpty()) {
                        str = "NA";
                    }
                } else {
                    str = "NA";
                }
                o73 o73Var = new o73();
                o73Var.a = yslVar.a;
                o73Var.b = yslVar.b;
                synchronized (ysl.class) {
                    try {
                        y7mVar = ysl.j;
                        if (y7mVar == null) {
                            mc9 mc9Var = new mc9(new nc9(Resources.getSystem().getConfiguration().getLocales()));
                            Object[] objArrCopyOf = new Object[4];
                            int i4 = 0;
                            while (i2 < mc9Var.d()) {
                                String strB = p44.b(mc9Var.b(i2));
                                strB.getClass();
                                int i5 = i4 + 1;
                                int length = objArrCopyOf.length;
                                if (length < i5) {
                                    int i6 = length + (length >> 1) + 1;
                                    if (i6 < i5) {
                                        int iHighestOneBit = Integer.highestOneBit(i4);
                                        i6 = iHighestOneBit + iHighestOneBit;
                                    }
                                    if (i6 < 0) {
                                        i6 = Integer.MAX_VALUE;
                                    }
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                                }
                                objArrCopyOf[i4] = strB;
                                i2++;
                                i4 = i5;
                            }
                            rul rulVar = xyl.b;
                            y7mVar = i4 == 0 ? y7m.e : new y7m(objArrCopyOf, i4);
                            ysl.j = y7mVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                o73Var.e = y7mVar;
                o73Var.h = Boolean.TRUE;
                o73Var.d = str;
                o73Var.c = str4;
                o73Var.f = yslVar.f.j() ? (String) yslVar.f.h() : yslVar.d.i();
                o73Var.j = 10;
                o73Var.k = Integer.valueOf(yslVar.h);
                phfVar.c = o73Var;
                yslVar.c.a(phfVar);
                return;
            case 5:
                s5m s5mVar = (s5m) this.b;
                wze wzeVar = (wze) this.c;
                bul bulVar = (bul) this.d;
                String str5 = (String) this.e;
                s5mVar.getClass();
                yfj yfjVar = (yfj) wzeVar.b;
                yfjVar.b = bulVar;
                x2m x2mVar = (x2m) yfjVar.a;
                if (x2mVar == null || (str2 = x2mVar.d) == null || str2.isEmpty()) {
                    str2 = "NA";
                }
                wzeVar.c = s5mVar.d(str2, str5);
                s5mVar.c.a(wzeVar);
                return;
            default:
                s5m s5mVar2 = (s5m) this.b;
                wze wzeVar2 = (wze) this.c;
                c5m c5mVar = (c5m) this.d;
                fie fieVar = (fie) this.e;
                bul bulVar2 = bul.MODEL_DOWNLOAD;
                yfj yfjVar2 = (yfj) wzeVar2.b;
                yfjVar2.b = bulVar2;
                com.google.android.gms.tasks.Task task2 = s5mVar2.e;
                wzeVar2.c = s5mVar2.d("NA", task2.j() ? (String) task2.h() : j09.c.a(s5mVar2.g));
                a0g a0gVar = s5mVar2.d;
                bo7 bo7Var = h6m.a;
                u0b u0bVar = c5mVar.d;
                String strB2 = fieVar.b();
                vog vogVar = new vog();
                xde xdeVar = new xde(23);
                xdeVar.b = fieVar.d();
                xdeVar.c = bvl.CLOUD;
                if (strB2 == null) {
                    strB2 = "";
                }
                xdeVar.d = strB2;
                int iOrdinal = u0bVar.ordinal();
                if (iOrdinal == 2) {
                    zulVar = zul.BASE_TRANSLATE;
                } else if (iOrdinal != 4) {
                    zulVar = iOrdinal != 5 ? zul.TYPE_UNKNOWN : zul.BASE_DIGITAL_INK;
                } else {
                    zulVar = zul.CUSTOM;
                }
                xdeVar.e = zulVar;
                vogVar.a = new evl(xdeVar);
                kvl kvlVar = new kvl(vogVar);
                js8 js8Var = new js8();
                js8Var.c = c5mVar.a;
                js8Var.e = c5mVar.e;
                js8Var.f = Long.valueOf(c5mVar.f);
                js8Var.a = kvlVar;
                if (c5mVar.b) {
                    long j2 = a0gVar.j(fieVar);
                    if (j2 == 0) {
                        bo7Var.e("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
                        j = BuildConfig.MAX_TIME_TO_UPLOAD;
                    } else {
                        long jK = a0gVar.k(fieVar);
                        if (jK == 0) {
                            j = BuildConfig.MAX_TIME_TO_UPLOAD;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            a0gVar.p(fieVar, jElapsedRealtime);
                            jK = jElapsedRealtime;
                        } else {
                            j = BuildConfig.MAX_TIME_TO_UPLOAD;
                        }
                        js8Var.b = Long.valueOf((jK - j2) & j);
                    }
                } else {
                    j = BuildConfig.MAX_TIME_TO_UPLOAD;
                }
                if (c5mVar.c) {
                    long j3 = a0gVar.j(fieVar);
                    if (j3 == 0) {
                        bo7Var.e("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
                    } else {
                        js8Var.d = Long.valueOf((SystemClock.elapsedRealtime() - j3) & j);
                    }
                }
                yfjVar2.c = new wul(js8Var);
                s5mVar2.c.a(wzeVar2);
                return;
        }
    }

    public /* synthetic */ wn2(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
