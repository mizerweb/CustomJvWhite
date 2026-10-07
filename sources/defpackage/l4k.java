package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.messaging.RemoteMessage;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l4k {
    public static final p41 d = yab.b(-2, 1, null, 4);
    public final ewe a;
    public final g7k b;
    public final Logger c;

    public l4k(ewe eweVar, g7k g7kVar, Logger logger) {
        this.a = eweVar;
        this.b = g7kVar;
        this.c = logger.createLogger("ClientServiceDataDispatcher");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        q2k q2kVar;
        l4k l4kVar;
        String str;
        if (nq4Var instanceof q2k) {
            q2kVar = (q2k) nq4Var;
            int i = q2kVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                q2kVar.h = i - Integer.MIN_VALUE;
            } else {
                q2kVar = new q2k(this, nq4Var);
            }
        } else {
            q2kVar = new q2k(this, nq4Var);
        }
        Object objA = q2kVar.f;
        int i2 = q2kVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objA);
            Logger.DefaultImpls.info$default(this.c, "Checking for undelivered push tokens", null, 2, null);
            q2kVar.d = this;
            q2kVar.h = 1;
            objA = this.b.a(q2kVar);
            if (objA != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            this = q2kVar.d;
            ch3.d0(objA);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(objA);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = q2kVar.e;
            l4kVar = q2kVar.d;
            ch3.d0(objA);
        }
        String str2 = (String) objA;
        if (str != null && !r5h.X0(str) && !str.equals(str2)) {
            Logger.DefaultImpls.info$default(l4kVar.c, "Found undelivered token, sending it to service", null, 2, null);
            q2kVar.d = null;
            q2kVar.e = null;
            q2kVar.h = 3;
            if (l4kVar.c(str, q2kVar) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
        String str3 = (String) objA;
        g7k g7kVar = this.b;
        q2kVar.d = this;
        q2kVar.e = str3;
        q2kVar.h = 2;
        Object objD = g7kVar.d(q2kVar);
        if (objD != hu4Var) {
            l4kVar = this;
            str = str3;
            objA = objD;
            String str4 = (String) objA;
            if (str != null) {
                Logger.DefaultImpls.info$default(l4kVar.c, "Found undelivered token, sending it to service", null, 2, null);
                q2kVar.d = null;
                q2kVar.e = null;
                q2kVar.h = 3;
                if (l4kVar.c(str, q2kVar) == hu4Var) {
                }
            }
            return sbiVar;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(RemoteMessage remoteMessage, nq4 nq4Var) {
        t2k t2kVar;
        if (nq4Var instanceof t2k) {
            t2kVar = (t2k) nq4Var;
            int i = t2kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2kVar.g = i - Integer.MIN_VALUE;
            } else {
                t2kVar = new t2k(this, nq4Var);
            }
        } else {
            t2kVar = new t2k(this, nq4Var);
        }
        Object obj = t2kVar.e;
        int i2 = t2kVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            fhk fhkVar = new fhk(remoteMessage);
            Logger.DefaultImpls.info$default(this.c, "Trying to send new push message event to channel", null, 2, null);
            t2kVar.d = this;
            t2kVar.g = 1;
            Object objA = d.a(t2kVar, fhkVar);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = t2kVar.d;
            ch3.d0(obj);
        }
        Logger.DefaultImpls.info$default(this.c, "Event with new push message has been sent to channel", null, 2, null);
        this.a.d();
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, nq4 nq4Var) {
        w2k w2kVar;
        if (nq4Var instanceof w2k) {
            w2kVar = (w2k) nq4Var;
            int i = w2kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2kVar.g = i - Integer.MIN_VALUE;
            } else {
                w2kVar = new w2k(this, nq4Var);
            }
        } else {
            w2kVar = new w2k(this, nq4Var);
        }
        Object obj = w2kVar.e;
        int i2 = w2kVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            hhk hhkVar = new hhk(str);
            Logger.DefaultImpls.info$default(this.c, "Trying to send new push token event to channel", null, 2, null);
            w2kVar.d = this;
            w2kVar.g = 1;
            Object objA = d.a(w2kVar, hhkVar);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = w2kVar.d;
            ch3.d0(obj);
        }
        Logger.DefaultImpls.info$default(this.c, "Event with new push token has been sent to channel", null, 2, null);
        this.a.d();
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(List list, nq4 nq4Var) {
        c3k c3kVar;
        if (nq4Var instanceof c3k) {
            c3kVar = (c3k) nq4Var;
            int i = c3kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3kVar.g = i - Integer.MIN_VALUE;
            } else {
                c3kVar = new c3k(this, nq4Var);
            }
        } else {
            c3kVar = new c3k(this, nq4Var);
        }
        Object obj = c3kVar.e;
        int i2 = c3kVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            jhk jhkVar = new jhk(list);
            Logger.DefaultImpls.info$default(this.c, "Trying to send error message event to channel", null, 2, null);
            c3kVar.d = this;
            c3kVar.g = 1;
            Object objA = d.a(c3kVar, jhkVar);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c3kVar.d;
            ch3.d0(obj);
        }
        Logger.DefaultImpls.info$default(this.c, "Event with error message has been sent to channel", null, 2, null);
        this.a.d();
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(nq4 nq4Var) {
        z2k z2kVar;
        if (nq4Var instanceof z2k) {
            z2kVar = (z2k) nq4Var;
            int i = z2kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                z2kVar.g = i - Integer.MIN_VALUE;
            } else {
                z2kVar = new z2k(this, nq4Var);
            }
        } else {
            z2kVar = new z2k(this, nq4Var);
        }
        Object obj = z2kVar.e;
        int i2 = z2kVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            Logger.DefaultImpls.info$default(this.c, "Trying to send on delete messages event to channel", null, 2, null);
            z2kVar.d = this;
            z2kVar.g = 1;
            Object objA = d.a(z2kVar, ihk.a);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = z2kVar.d;
            ch3.d0(obj);
        }
        Logger.DefaultImpls.info$default(this.c, "Event with on delete messages has been sent to channel", null, 2, null);
        this.a.d();
        return sbi.a;
    }
}
