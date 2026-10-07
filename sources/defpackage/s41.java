package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s41(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean zBooleanValue = true;
        switch (this.a) {
            case 0:
                w41 w41Var = (w41) this.b;
                l6g l6gVar = (l6g) this.c;
                p76 p76Var = (p76) this.d;
                pgg pggVar = w41Var.g;
                try {
                    w41Var.e(l6gVar, p76Var);
                    pggVar.w(l6gVar, p76Var);
                    p76Var.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        pggVar.w(l6gVar, p76Var);
                        p76Var.close();
                        throw th2;
                    }
                }
            case 1:
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                zh3 zh3Var = (zh3) this.c;
                wh3 wh3Var = (wh3) this.d;
                zv8[] zv8VarArr = ChatsListWidget.X;
                boolean z2 = chatsListWidget.getView() != null && chatsListWidget.s1().Y();
                String str = chatsListWidget.d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.q("Chats list, recycler is in computing state: ", ", before submit, rootViewExist:", z2, chatsListWidget.getView() != null), null);
                    }
                }
                zh3Var.H(wh3Var.a);
                if (chatsListWidget.getView() != null) {
                    chatsListWidget.s1().setRefreshingNext(wh3Var.b);
                    return;
                }
                return;
            case 2:
                ijd ijdVar = (ijd) this.b;
                u72 u72Var = (u72) this.c;
                h0k h0kVar = (h0k) this.d;
                ijdVar.getClass();
                try {
                    zBooleanValue = ((Boolean) u72Var.b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (ijdVar.k) {
                    try {
                        iyj iyjVarN = wk8.n(h0kVar.a);
                        String str2 = iyjVarN.a;
                        if (ijdVar.c(str2) == h0kVar) {
                            ijdVar.b(str2);
                        }
                        n1g.x().p(ijd.l, ijd.class.getSimpleName() + " " + str2 + " executed; reschedule = " + zBooleanValue);
                        Iterator it = ijdVar.j.iterator();
                        while (it.hasNext()) {
                            ((md6) it.next()).a(iyjVarN, zBooleanValue);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                fbc fbcVar = (fbc) this.b;
                kig kigVar = (kig) this.c;
                ijd ijdVar2 = (ijd) fbcVar.b;
                ijdVar2.getClass();
                iyj iyjVar = kigVar.a;
                String str3 = iyjVar.a;
                ArrayList arrayList = new ArrayList();
                mzj mzjVar = (mzj) ijdVar2.e.o(new v41(ijdVar2, arrayList, str3, 1));
                if (mzjVar == null) {
                    n1g.x().j0(ijd.l, "Didn't find WorkSpec for id " + iyjVar);
                    ijdVar2.d.d.execute(new i7b(ijdVar2, 23, iyjVar));
                    return;
                }
                synchronized (ijdVar2.k) {
                    try {
                        synchronized (ijdVar2.k) {
                            z = ijdVar2.c(str3) != null;
                            break;
                        }
                        if (z) {
                            Set set = (Set) ijdVar2.h.get(str3);
                            if (((kig) set.iterator().next()).a.b == iyjVar.b) {
                                set.add(kigVar);
                                n1g.x().p(ijd.l, "Work " + iyjVar + " is already enqueued for processing");
                            } else {
                                ijdVar2.d.d.execute(new i7b(ijdVar2, 23, iyjVar));
                            }
                            return;
                        }
                        if (mzjVar.t != iyjVar.b) {
                            ijdVar2.d.d.execute(new i7b(ijdVar2, 23, iyjVar));
                            return;
                        }
                        Context context = ijdVar2.b;
                        ja4 ja4Var = ijdVar2.c;
                        azj azjVar = ijdVar2.d;
                        WorkDatabase workDatabase = ijdVar2.e;
                        xe4 xe4Var = new xe4();
                        xe4Var.a = ja4Var;
                        xe4Var.b = azjVar;
                        xe4Var.c = ijdVar2;
                        xe4Var.d = workDatabase;
                        xe4Var.e = mzjVar;
                        xe4Var.f = arrayList;
                        xe4Var.g = context.getApplicationContext();
                        h0k h0kVar2 = new h0k(xe4Var);
                        xt4 xt4Var = h0kVar2.d.b;
                        wo8 wo8VarA = vd7.a();
                        xt4Var.getClass();
                        u72 u72VarJ = qyj.J(lvb.x0(xt4Var, wo8VarA), new f0k(h0kVar2, null, 1));
                        u72VarJ.b.b(new s41(ijdVar2, u72VarJ, h0kVar2, 2), ijdVar2.d.d);
                        ijdVar2.g.put(str3, h0kVar2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(kigVar);
                        ijdVar2.h.put(str3, hashSet);
                        n1g.x().p(ijd.l, ijd.class.getSimpleName() + ": processing " + iyjVar);
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
        }
    }
}
