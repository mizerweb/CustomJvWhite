package defpackage;

import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.af7
    public final Object invoke() throws IllegalAccessException {
        String[] strArr;
        rt2 rt2Var;
        final boolean z;
        int i = 0;
        switch (this.a) {
            case 0:
                AccountInitializer accountInitializer = (AccountInitializer) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                sbi sbiVar = sbi.a;
                a6 a6Var = new a6(accountInitializer, 17);
                boolean zB = accountInitializer.d().a().b();
                if (zB && !atomicBoolean.get()) {
                    long jNanoTime = System.nanoTime();
                    ((bi4) c0a.j(accountInitializer, 219)).a();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            ghb ghbVar = ew5.b;
                            a4cVar.c(je9Var, "InitialDataStorage", "bannersInitialDataStorage.load by ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime, lw5.NANOSECONDS))), null);
                        }
                    }
                }
                if (((Boolean) atomicReference.get()).booleanValue() || !zB) {
                    gm0.n(accountInitializer.d, "LegacyChats: async load");
                    ((n0c) ((xhh) accountInitializer.d().getAccessor().d(23).getValue())).b().D0(zhb.b, new e6(1, a6Var));
                } else {
                    gm0.n(accountInitializer.d, "LegacyChats: sync load");
                    a6Var.invoke();
                }
                return sbiVar;
            case 1:
                yk4 yk4Var = (yk4) this.b;
                return new xed("contactlist-presence", yk4Var.b, ((n0c) ((xhh) ((ny8) this.c).getValue())).a().R0(1, "presences"), new vk4((ny8) this.d, yk4Var, (lq4) null));
            case 2:
                return Integer.valueOf(((no4) this.b).a.n((List) this.c, (ji4) this.d));
            case 3:
                wmi wmiVar = (wmi) this.b;
                rc5 rc5Var = (rc5) this.c;
                return new yr2(wmiVar, new s35(5), new pe3(28, rc5Var), new rgi(rc5Var, (ny8) this.d, (lq4) null, 3));
            case 4:
                un6 un6Var = (un6) this.b;
                Long l = (Long) this.c;
                wfe wfeVar = (wfe) this.d;
                ((qw2) un6Var.i.getValue()).i0(l.longValue(), ((xn6) wfeVar.a).h(), ((xn6) wfeVar.a).n(), ((xn6) wfeVar.a).m());
                return sbi.a;
            case 5:
                gp7 gp7Var = (gp7) this.b;
                ny8 ny8Var = (ny8) this.c;
                ny8 ny8Var2 = (ny8) this.d;
                boolean zE = gp7Var.e();
                String str = gp7Var.b;
                if (!zE) {
                    gm0.n(str, "Can't init firebaseApp because !areServicesAvailable()");
                    return null;
                }
                gm0.n(str, "Start creating FirebaseApp");
                long jNanoTime2 = System.nanoTime();
                b5d b5dVar = ((g5d) ((gjf) ny8Var.getValue())).a.o0;
                zv8[] zv8VarArr = e5d.S6;
                if (((Boolean) b5dVar.a(zv8VarArr[64]).i()).booleanValue()) {
                    Set set = (Set) ((g5d) ((gjf) ny8Var.getValue())).a.p0.a(zv8VarArr[65]).i();
                    if (set == null || (strArr = (String[]) set.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    e2k.d(ny8Var2, strArr);
                }
                ov6 ov6VarE = ov6.e(gp7Var.a);
                ghb ghbVar2 = ew5.b;
                gm0.n(str, "End creating FirebaseApp. Takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime2, lw5.NANOSECONDS))));
                return ov6VarE;
            case 6:
                return Integer.valueOf(((ose) ((jg9) this.b).d().c()).E((gda) this.c, ((rt2) this.d).a, 0L, false, null, false));
            case 7:
                return new iza((ny8) this.b, (ny8) this.c, (ha9) this.d);
            case 8:
                nzc nzcVar = (nzc) this.b;
                t51 t51Var = (t51) this.c;
                xhh xhhVar = (xhh) this.d;
                gjg gjgVar = nzcVar.c.c;
                return new u0d((gjgVar == null || (rt2Var = (rt2) gjgVar.getValue()) == null) ? 0L : rt2Var.a, t51Var, xhhVar, nzcVar.b);
            case 9:
                utd utdVar = (utd) this.b;
                ujd ujdVar = (ujd) this.c;
                String str2 = (String) this.d;
                svb svbVar = (svb) utdVar.f.getValue();
                String strA = ujdVar.a.a();
                wd0 wd0Var = svbVar.a().d;
                if (strA != null) {
                    wd0Var.e("auth.account.name", strA);
                }
                wd0Var.e("auth.token", str2);
                return sbi.a;
            case 10:
                return cqk.D(cqk.D((ite) this.b, ((dme) this.c).n), (vt4) ((ifh) this.d).getValue());
            case 11:
                rnf rnfVar = (rnf) this.b;
                nnf nnfVar = (nnf) this.c;
                sfe sfeVar = (sfe) this.d;
                ArrayList arrayList = rnfVar.l;
                while (true) {
                    if (i < arrayList.size()) {
                        int i2 = i + 1;
                        if (!cqk.d(((ylc) arrayList.get(i)).a, nnfVar)) {
                            i = i2;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i != -1 && !((Boolean) ((ylc) arrayList.get(i)).b).booleanValue()) {
                    sfeVar.a = true;
                }
                return sbi.a;
            default:
                oyj oyjVar = (oyj) this.b;
                String str3 = (String) this.c;
                WorkRequest workRequest = (WorkRequest) this.d;
                qzj qzjVarX = oyjVar.c.x();
                List listE = qzjVarX.e(str3);
                if (listE.size() > 1) {
                    c.i("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                kzj kzjVar = (kzj) ww3.t1(listE);
                if (kzjVar == null) {
                    z96.a(new cyj(oyjVar, str3, ve6.b, Collections.singletonList(workRequest), 0));
                } else {
                    String str4 = kzjVar.a;
                    mzj mzjVarD = qzjVarX.d(str4);
                    if (mzjVarD == null) {
                        ore.k(nbh.w("WorkSpec with ", str4, ", that matches a name \"", str3, "\", wasn't found"));
                        return null;
                    }
                    if (!mzjVarD.c()) {
                        c.i("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                        return null;
                    }
                    if (kzjVar.b == kyj.f) {
                        ch3.G(qzjVarX.a, false, true, new rh5(str4, 13));
                        z96.a(new cyj(oyjVar, str3, ve6.b, Collections.singletonList(workRequest), 0));
                    } else {
                        final mzj mzjVarB = mzj.b(workRequest.getWorkSpec(), kzjVar.a, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        ijd ijdVar = oyjVar.f;
                        final WorkDatabase workDatabase = oyjVar.c;
                        ja4 ja4Var = oyjVar.b;
                        final List list = oyjVar.e;
                        final Set<String> tags = workRequest.getTags();
                        final String str5 = mzjVarB.a;
                        final mzj mzjVarD2 = workDatabase.x().d(str5);
                        if (mzjVarD2 == null) {
                            ore.p(c0a.o("Worker with ", str5, " doesn't exist"));
                            return null;
                        }
                        if (!mzjVarD2.b.a()) {
                            if (mzjVarD2.c() ^ mzjVarB.c()) {
                                StringBuilder sb = new StringBuilder("Can't update ");
                                sb.append(mzjVarD2.c() ? "Periodic" : "OneTime");
                                sb.append(" Worker to ");
                                throw new UnsupportedOperationException(zo5.w(sb, mzjVarB.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                            }
                            synchronized (ijdVar.k) {
                                z = ijdVar.c(str5) != null;
                                break;
                            }
                            if (!z) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((a3f) it.next()).b(str5);
                                }
                            }
                            workDatabase.n(new x1c(new Runnable(mzjVarD2, mzjVarB, list, str5, tags, z) { // from class: xzj
                                public final /* synthetic */ mzj b;
                                public final /* synthetic */ mzj c;
                                public final /* synthetic */ String d;
                                public final /* synthetic */ Set e;
                                public final /* synthetic */ boolean f;

                                {
                                    this.d = str5;
                                    this.e = tags;
                                    this.f = z;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    WorkDatabase workDatabase2 = this.a;
                                    qzj qzjVarX2 = workDatabase2.x();
                                    szj szjVarY = workDatabase2.y();
                                    mzj mzjVar = this.b;
                                    kyj kyjVar = mzjVar.b;
                                    int i3 = mzjVar.k;
                                    long j = mzjVar.n;
                                    int i4 = mzjVar.t + 1;
                                    int i5 = mzjVar.s;
                                    long j2 = mzjVar.u;
                                    int i6 = mzjVar.v;
                                    mzj mzjVar2 = this.c;
                                    mzj mzjVarB2 = mzj.b(mzjVar2, null, kyjVar, null, i3, j, i5, i4, j2, i6, 29613053);
                                    if (mzjVar2.v == 1) {
                                        mzjVarB2.u = mzjVar2.u;
                                        mzjVarB2.v++;
                                    }
                                    ch3.G(qzjVarX2.a, false, true, new ozj(qzjVarX2, e9i.N0(mzjVarB2), 1));
                                    rre rreVar = szjVarY.a;
                                    String str6 = this.d;
                                    ch3.G(rreVar, false, true, new rh5(str6, 16));
                                    szjVarY.a(str6, this.e);
                                    if (this.f) {
                                        return;
                                    }
                                    qzjVarX2.f(-1L, str6);
                                    ch3.G(workDatabase2.w().a, false, true, new rh5(str6, 4));
                                }
                            }, 1));
                            if (!z) {
                                j3f.b(ja4Var, workDatabase, list);
                            }
                        }
                    }
                }
                return sbi.a;
        }
    }
}
