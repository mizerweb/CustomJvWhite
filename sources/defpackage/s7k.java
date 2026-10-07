package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class s7k implements wve {
    public final /* synthetic */ o91 a;

    public s7k(o91 o91Var) {
        this.a = o91Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    @Override // defpackage.wve
    public final void a(vve vveVar) {
        boolean z;
        StringBuilder sb;
        o91 o91Var = this.a;
        ru1 ru1Var = o91Var.j0;
        if (vveVar instanceof qgg) {
            o91Var.D0 = ((qgg) vveVar).a;
            return;
        }
        if (vveVar instanceof m70) {
            ru1Var.t(((m70) vveVar).a);
            return;
        }
        if (vveVar instanceof leg) {
            ru1Var.r(((leg) vveVar).a);
            return;
        }
        if (vveVar instanceof h48) {
            ((ConcurrentHashMap) o91Var.w0.b).putAll(((h48) vveVar).a);
            return;
        }
        if (vveVar instanceof m3j) {
            zfh zfhVar = (zfh) o91Var.P0.a;
            zfhVar.getClass();
            ((k3j) zfhVar.a).j(new uik(5, ((m3j) vveVar).a));
            return;
        }
        if (!(vveVar instanceof kdb)) {
            if (vveVar instanceof fcj) {
                o91Var.n(oh1.F, ((fcj) vveVar).a);
                return;
            }
            return;
        }
        HashMap map = ((kdb) vveVar).a;
        co0 co0Var = o91Var.n.u;
        ru1Var.getClass();
        co0Var.getClass();
        ao0 ao0Var = co0Var.d;
        ArrayList arrayList = new ArrayList();
        for (yt1 yt1Var : map.keySet()) {
            du1 du1VarL = ru1Var.l(yt1Var);
            Float f = (Float) map.get(yt1Var);
            if (du1VarL != null && f != null) {
                float fFloatValue = f.floatValue();
                CidLogger cidLogger = ru1Var.d;
                n81 n81Var = co0Var.a;
                idb idbVar = idb.a;
                idb idbVar2 = idb.c;
                if (n81Var != null) {
                    idb idbVar3 = du1VarL.j;
                    double d = n81Var.a;
                    double d2 = n81Var.b;
                    float f2 = (float) (d2 + d);
                    float f3 = (float) (d - d2);
                    if (idbVar3 != idbVar || fFloatValue >= f3) {
                        if (idbVar3 != idbVar2 || fFloatValue < f2) {
                            z = false;
                        } else {
                            du1VarL.j = idbVar;
                        }
                        if (ao0Var.a) {
                            sb = new StringBuilder("last status: ");
                            sb.append(idbVar3.name());
                            sb.append("; current check: ");
                            sb.append(fFloatValue);
                            sb.append(" ");
                            if (idbVar3 == idbVar) {
                                sb.append("< ");
                                sb.append(f3);
                            } else if (idbVar3 == idbVar2) {
                                sb.append(">= ");
                                sb.append(f2);
                            } else {
                                sb.append("ERROR: INVALID STATE");
                            }
                            if (z) {
                                sb.append("; PASSES, now ");
                                sb.append(du1VarL.j.name());
                            }
                            ao0Var.b(cidLogger, "CallParticipant", sb.toString());
                        }
                        du1VarL.i = fFloatValue;
                    } else {
                        du1VarL.j = idbVar2;
                    }
                    z = true;
                    if (ao0Var.a) {
                        sb = new StringBuilder("last status: ");
                        sb.append(idbVar3.name());
                        sb.append("; current check: ");
                        sb.append(fFloatValue);
                        sb.append(" ");
                        if (idbVar3 == idbVar) {
                            sb.append("< ");
                            sb.append(f3);
                        } else if (idbVar3 == idbVar2) {
                            sb.append(">= ");
                            sb.append(f2);
                        } else {
                            sb.append("ERROR: INVALID STATE");
                        }
                        if (z) {
                            sb.append("; PASSES, now ");
                            sb.append(du1VarL.j.name());
                        }
                        ao0Var.b(cidLogger, "CallParticipant", sb.toString());
                    }
                    du1VarL.i = fFloatValue;
                } else {
                    if (fFloatValue > 0.6f) {
                        du1VarL.j = idbVar;
                    } else if (fFloatValue > 0.3f) {
                        du1VarL.j = idb.b;
                    } else {
                        du1VarL.j = idbVar2;
                    }
                    z = fFloatValue != du1VarL.i;
                    du1VarL.i = fFloatValue;
                }
                if (z) {
                    arrayList.add(du1VarL);
                }
                map = map;
                co0Var = co0Var;
            }
        }
        ru1Var.b.e.onCallParticipantNetworkStatusChanged(arrayList);
    }
}
