package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class jd0 extends kih {
    public final String c;
    public final ug9 d;
    public final ujd e;

    public jd0(String str, ug9 ug9Var, ujd ujdVar) {
        this.c = str;
        this.d = ug9Var;
        this.e = ujdVar;
    }

    public static final jd0 d(fka fkaVar) {
        int iU;
        String strW;
        String strX;
        ug9 ug9Var;
        if (!fkaVar.l()) {
            return null;
        }
        int i = 1;
        try {
            iU = ch3.U(fkaVar);
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
            iU = 0;
        }
        if (iU == 0) {
            return null;
        }
        ug9 ug9Var2 = ug9.LOGIN;
        ujd ujdVarP = null;
        String strX2 = null;
        ug9 ug9Var3 = ug9Var2;
        for (int i2 = 0; i2 < iU; i2++) {
            try {
                strW = ch3.W(fkaVar);
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
                    if (iD2 == i) {
                        throw th3;
                    }
                    ore.o();
                    return null;
                }
                strW = null;
            }
            if (strW != null) {
                int iHashCode = strW.hashCode();
                if (iHashCode == -309425751) {
                    i = 1;
                    if (strW.equals("profile")) {
                        ujdVarP = f55.p(fkaVar);
                    } else {
                        fkaVar.x();
                    }
                } else if (iHashCode != 110541305) {
                    if (iHashCode == 141498579 && strW.equals("tokenType")) {
                        try {
                            strX = ch3.X(fkaVar, null);
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
                            strX = null;
                        }
                        strX.getClass();
                        switch (strX) {
                            case "PHONE_BINDING":
                                ug9Var = ug9.PHONE_BINDING;
                                ug9Var3 = ug9Var;
                                i = 1;
                                break;
                            case "PHONE_CONFIRM":
                                ug9Var = ug9.PHONE_CONFIRM;
                                ug9Var3 = ug9Var;
                                i = 1;
                                break;
                            case "RECOVERY":
                                ug9Var = ug9.RECOVERY;
                                ug9Var3 = ug9Var;
                                i = 1;
                                break;
                            case "LOGIN":
                                ug9Var3 = ug9Var2;
                                i = 1;
                                break;
                            default:
                                ore.p(c0a.o("No such value ", strX, " for LoginTokenType"));
                                return null;
                        }
                    }
                    i = 1;
                    fkaVar.x();
                } else {
                    if (strW.equals(ApiProtocol.KEY_TOKEN)) {
                        try {
                            strX2 = ch3.X(fkaVar, null);
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
                            strX2 = null;
                        }
                        i = 1;
                    }
                    i = 1;
                    fkaVar.x();
                }
            }
        }
        if (strX2 == null || ujdVarP == null) {
            return null;
        }
        return new jd0(strX2, ug9Var3, ujdVarP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd0)) {
            return false;
        }
        jd0 jd0Var = (jd0) obj;
        return this.c.equals(jd0Var.c) && this.d == jd0Var.d && this.e.equals(jd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // defpackage.sq0
    public final String toString() {
        String strK;
        StringBuilder sb = new StringBuilder("{p=");
        sb.append(this.e);
        sb.append(",t=");
        boolean zC = gm0.c();
        Object obj = this.c;
        if (zC) {
            strK = obj.toString();
        } else if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                strK = "[]";
            } else {
                strK = c0a.k(collection.size(), "[**", "**]");
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(objArr.length, "[**", "**]");
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(iArr.length, "[**", "**]");
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(fArr.length, "[**", "**]");
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(jArr.length, "[**", "**]");
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            if (dArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(dArr.length, "[**", "**]");
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            if (sArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(sArr.length, "[**", "**]");
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(bArr.length, "[**", "**]");
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (cArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(cArr.length, "[**", "**]");
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr.length == 0) {
                strK = "[]";
            } else {
                strK = c0a.k(zArr.length, "[**", "**]");
            }
        } else {
            strK = "***";
        }
        sb.append(strK);
        sb.append(",tp=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
