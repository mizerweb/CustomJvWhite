package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import one.me.chats.tab.ChatsTabWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo3 extends fg7 implements cf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int iU;
        q54 q54VarA;
        List listA;
        r66 r66Var;
        String strX;
        Byte bO;
        int i = this.a;
        sbi sbiVar = sbi.a;
        j54 j54Var = null;
        switch (i) {
            case 0:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.receiver;
                zv8[] zv8VarArr = ChatsTabWidget.B1;
                chatsTabWidget.G1((String) obj);
                return sbiVar;
            case 1:
                fka fkaVar = (fka) obj;
                ((i54) this.receiver).getClass();
                int i2 = 0;
                try {
                    iU = ch3.U(fkaVar);
                    while (true) {
                        r66Var = r66.a;
                        if (i2 < iU) {
                            try {
                                strX = ch3.X(fkaVar, null);
                            } catch (Throwable th) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                Iterator it = fjf.a.iterator();
                                while (it.hasNext()) {
                                    AccountInitializer accountInitializer = ((n6) it.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th);
                                        accountInitializer.d().i().g().a(null, th);
                                    } catch (Throwable th2) {
                                        gm0.V("Payload", "failed to collect exception", th2);
                                    }
                                }
                                int iD = qt4.D(pye.a);
                                if (iD != 0) {
                                    if (iD != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th;
                                }
                                strX = null;
                            }
                            if (strX != null) {
                                try {
                                    if (strX.equals("typeId")) {
                                        try {
                                            bO = ch3.O(fkaVar);
                                        } catch (Throwable th3) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                            Iterator it2 = fjf.a.iterator();
                                            while (it2.hasNext()) {
                                                AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th3);
                                                    accountInitializer2.d().i().g().a(null, th3);
                                                } catch (Throwable th4) {
                                                    gm0.V("Payload", "failed to collect exception", th4);
                                                }
                                            }
                                            int iD2 = qt4.D(pye.a);
                                            if (iD2 != 0) {
                                                if (iD2 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th3;
                                            }
                                            bO = null;
                                        }
                                        q54VarA = ynl.a(bO);
                                        break;
                                    } else if (strX.equals("reasons")) {
                                        listA = fjf.a(fkaVar, r66Var, new n61(14));
                                    } else {
                                        try {
                                            fkaVar.x();
                                        } catch (Throwable th5) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                            Iterator it3 = fjf.a.iterator();
                                            while (it3.hasNext()) {
                                                AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th5);
                                                    accountInitializer3.d().i().g().a(null, th5);
                                                } catch (Throwable th6) {
                                                    gm0.V("Payload", "failed to collect exception", th6);
                                                }
                                            }
                                            int iD3 = qt4.D(pye.a);
                                            if (iD3 != 0) {
                                                if (iD3 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th5;
                                            }
                                        }
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                        Iterator it4 = fjf.a.iterator();
                                        while (it4.hasNext()) {
                                            AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th7);
                                                accountInitializer4.d().i().g().a(null, th7);
                                            } catch (Throwable th8) {
                                                gm0.V("Payload", "failed to collect exception", th8);
                                            }
                                        }
                                        int iD4 = qt4.D(pye.a);
                                        if (iD4 != 0) {
                                            if (iD4 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th7;
                                        }
                                        i2++;
                                    } catch (Throwable th9) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                        Iterator it5 = fjf.a.iterator();
                                        while (it5.hasNext()) {
                                            AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th9);
                                                accountInitializer5.d().i().g().a(null, th9);
                                            } catch (Throwable th10) {
                                                gm0.V("Payload", "failed to collect exception", th10);
                                            }
                                        }
                                        int iD5 = qt4.D(pye.a);
                                        if (iD5 != 0) {
                                            if (iD5 == 1) {
                                                throw th9;
                                            }
                                            ore.o();
                                        }
                                    }
                                }
                            }
                            i2++;
                            break;
                        }
                    }
                } catch (Throwable th11) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                    Iterator it6 = fjf.a.iterator();
                    while (it6.hasNext()) {
                        AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th11);
                            accountInitializer6.d().i().g().a(null, th11);
                        } catch (Throwable th12) {
                            gm0.V("Payload", "failed to collect exception", th12);
                        }
                    }
                    int iD6 = qt4.D(pye.a);
                    if (iD6 == 0) {
                        iU = 0;
                    } else {
                        if (iD6 == 1) {
                            throw th11;
                        }
                        ore.o();
                    }
                    return j54Var;
                }
                q54VarA = null;
                listA = null;
                if (q54VarA != null) {
                    if (listA == null) {
                        listA = r66Var;
                    }
                    j54Var = new j54(q54VarA, listA);
                }
                return j54Var;
            case 2:
                return ((b95) this.receiver).o((ha9) obj);
            case 3:
                ((dx5) this.receiver).getClass();
                return Boolean.valueOf(!((Activity) obj).getClass().getName().endsWith("CSPDialogActivity"));
            case 4:
                Set set = (Set) obj;
                jl8 jl8Var = (jl8) this.receiver;
                ReentrantLock reentrantLock = jl8Var.e;
                reentrantLock.lock();
                try {
                    List listT1 = ww3.T1(jl8Var.d.values());
                    reentrantLock.unlock();
                    Iterator it7 = listT1.iterator();
                    while (it7.hasNext()) {
                        ((vrb) it7.next()).b(set);
                    }
                    return sbiVar;
                } catch (Throwable th13) {
                    reentrantLock.unlock();
                    throw th13;
                }
            case 5:
                kfb kfbVar = (kfb) this.receiver;
                Object objK0 = yab.K0(((n0c) kfbVar.e).b(), new wd9(kfbVar, null, 10), (lq4) obj);
                return objK0 == hu4.a ? objK0 : sbiVar;
            case 6:
                m4j m4jVar = (m4j) obj;
                ldc ldcVar = (ldc) this.receiver;
                Context context = ldcVar.E;
                gve gveVar = ldcVar.Z;
                pgg pggVar = ldcVar.Y;
                exd exdVar = new exd(ku6.m.r(context).c);
                exdVar.b(ldcVar.L);
                exdVar.a();
                udc udcVar = ldcVar.X;
                fz4 fz4Var = udcVar == null ? new fz4(new qq0(null, ldcVar.I, exdVar), pggVar, gveVar) : new fz4(new qq0(udcVar, np4.s(context), exdVar), pggVar, gveVar);
                boolean z = nec.a;
                z18 z18Var = new z18(context, m4jVar, fz4Var);
                z18Var.t(ldcVar.H);
                z18Var.q(gveVar);
                z18Var.s(ldcVar.F);
                z18Var.p(new n15());
                z18Var.r(ldcVar.p);
                return z18Var.b();
            default:
                return ((ate) this.receiver).i((ujh) obj);
        }
    }
}
