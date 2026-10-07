package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class s4b extends kih {
    public final long c;
    public final Long d;
    public final gda e;
    public final st2 f;
    public final int g;
    public final long h;

    public s4b(long j, Long l, gda gdaVar, st2 st2Var, int i, long j2) {
        this.c = j;
        this.d = l;
        this.e = gdaVar;
        this.f = st2Var;
        this.g = i;
        this.h = j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:90:0x015f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final s4b n(fka fkaVar) {
        int iP0;
        String strX;
        if (fkaVar.l() && (iP0 = fkaVar.P0()) != 0) {
            Long lM = null;
            gda gdaVarQ0 = null;
            st2 st2VarB = null;
            long jT = 0;
            long jT2 = -1;
            int iR = -1;
            for (int i = 0; i < iP0; i++) {
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
                        if (iD == 1) {
                            throw th;
                        }
                        ore.o();
                        return null;
                    }
                    strX = null;
                }
                if (strX != null) {
                    switch (strX.hashCode()) {
                        case -1361631597:
                            if (!strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
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
                                        if (iD2 == 1) {
                                            throw th3;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    jT = 0;
                                }
                            }
                            break;
                        case -982451749:
                            if (strX.equals("postId")) {
                                lM = ch3.M(fkaVar);
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case -840272977:
                            if (!strX.equals("unread")) {
                                fkaVar.x();
                            } else {
                                try {
                                    iR = ch3.R(fkaVar, iR);
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
                                        if (iD3 == 1) {
                                            throw th5;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                }
                            }
                            break;
                        case 3052376:
                            if (strX.equals("chat")) {
                                st2VarB = st2.b(fkaVar);
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case 3344077:
                            if (!strX.equals("mark")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT2 = ch3.T(fkaVar, jT2);
                                } catch (Throwable th7) {
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
                                        if (iD4 == 1) {
                                            throw th7;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                }
                            }
                            break;
                        case 954925063:
                            if (strX.equals("message")) {
                                gdaVarQ0 = yab.q0(fkaVar);
                            } else {
                                fkaVar.x();
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                }
            }
            return new s4b(jT, lM, gdaVarQ0, st2VarB, iR, jT2);
        }
        return new s4b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4b)) {
            return false;
        }
        s4b s4bVar = (s4b) obj;
        return this.c == s4bVar.c && cqk.d(this.d, s4bVar.d) && cqk.d(this.e, s4bVar.e) && cqk.d(this.f, s4bVar.f) && this.g == s4bVar.g && this.h == s4bVar.h;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        gda gdaVar = this.e;
        int iHashCode3 = (iHashCode2 + (gdaVar == null ? 0 : gdaVar.hashCode())) * 31;
        st2 st2Var = this.f;
        return Long.hashCode(this.h) + zo5.c(this.g, (iHashCode3 + (st2Var != null ? st2Var.hashCode() : 0)) * 31, 31);
    }

    public final long i() {
        return this.h;
    }

    public final gda k() {
        return this.e;
    }

    public final int m() {
        return this.g;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chatId=" + this.c + ", message=" + this.e + ", unread=" + this.g + ", mark=" + this.h + ", chat=" + this.f + ")";
    }

    public /* synthetic */ s4b() {
        this(0L, null, null, null, -1, -1L);
    }
}
