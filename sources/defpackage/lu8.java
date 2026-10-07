package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import org.webrtc.IceCandidate;

/* JADX INFO: loaded from: classes2.dex */
public final class lu8 implements hu8, bmi, lj6, aie, an7, c4b, pt3, ll {
    public static lu8 a;

    public static final long b(Number... numberArr) {
        long jLongValue = 0;
        if (numberArr.length == 1) {
            Number number = numberArr[0];
            if (number != null) {
                return number.longValue();
            }
            return 0L;
        }
        ArrayList arrayList = new ArrayList();
        int length = numberArr.length;
        for (int i = 0; i < length; i++) {
            Number number2 = numberArr[i];
            Long lValueOf = number2 != null ? Long.valueOf(number2.longValue()) : null;
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    public static ycc c(Context context, boolean z) {
        boolean z2 = ycc.c;
        return z ? (ycc) kc9.i(context, new bzb(context, 15)) : new ycc(context, null, 0);
    }

    public static int d(t50 t50Var, Long l) {
        Object next;
        if (!(t50Var instanceof h8g)) {
            if (!(t50Var instanceof eag) && !(t50Var instanceof oxi)) {
                if (t50Var instanceof aq6) {
                    int iD = qt4.D(((aq6) t50Var).i);
                    if (iD != 0) {
                        if (iD != 1) {
                            if (iD != 2) {
                                return 4;
                            }
                        }
                    }
                } else {
                    if (!(t50Var instanceof yv3)) {
                        return 4;
                    }
                    if (l != null) {
                        Iterator it = ((yv3) t50Var).b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            yu3 yu3Var = (yu3) next;
                            if (((yu3Var instanceof g58) && ((g58) yu3Var).a == l.longValue()) || ((yu3Var instanceof fti) && ((fti) yu3Var).a == l.longValue())) {
                                break;
                            }
                        }
                        yu3 yu3Var2 = (yu3) next;
                        if (yu3Var2 == null) {
                            return 4;
                        }
                        if (yu3Var2 instanceof g58) {
                        }
                    } else {
                        boolean z = false;
                        boolean z2 = false;
                        for (yu3 yu3Var3 : ((yv3) t50Var).b) {
                            if (yu3Var3 instanceof g58) {
                                z = true;
                            } else {
                                if (!(yu3Var3 instanceof fti)) {
                                    ore.o();
                                    return 0;
                                }
                                z2 = true;
                            }
                            if (z && z2) {
                                return 3;
                            }
                        }
                        if (!z) {
                            if (!z2) {
                                return 4;
                            }
                        }
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    @Override // defpackage.lj6
    public void D() {
    }

    @Override // defpackage.lj6
    public kyh G(int i, int i2) {
        return new nm5();
    }

    @Override // defpackage.aie
    public IceCandidate a(IceCandidate iceCandidate) {
        iceCandidate.getClass();
        return iceCandidate;
    }

    @Override // defpackage.ph6
    public w8b g() {
        return w8b.e();
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        long jT = 0;
        try {
            jT = ch3.T(fkaVar, 0L);
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
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
        }
        return Long.valueOf(jT);
    }

    @Override // defpackage.pt3
    public long i() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        if (vu8Var.peek() == 0) {
            return null;
        }
        vu8Var.x();
        return null;
    }

    @Override // defpackage.bmi
    public cmi q() {
        return new lxa();
    }

    @Override // defpackage.lj6
    public void r(xbf xbfVar) {
    }
}
