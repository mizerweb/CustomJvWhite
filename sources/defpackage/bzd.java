package defpackage;

import android.os.PowerManager;
import java.util.Collection;
import java.util.Map;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class bzd {
    public final ha9 a;
    public final ifh b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public bzd(ifh ifhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ha9 ha9Var) {
        this.a = ha9Var;
        this.b = ifhVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
    }

    public final azd a() {
        return (azd) this.c.getValue();
    }

    public final Object b(String str, String str2, String str3, String str4, hzd hzdVar) {
        azd azdVarA = a();
        azdVarA.f(false, !((od4) azdVarA.a.getValue()).b());
        ((pvb) this.d.getValue()).v(str);
        Object objA = ((k65) this.b.getValue()).a(str2, str3, str4, hzdVar);
        return objA == hu4.a ? objA : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(long j, String str, Long l, long j2, long j3, String str2, String str3, String str4, boolean z, boolean z2, String str5, long j4, long j5, long j6, Long l2, Long l3, Long l4, boolean z3) {
        String strK;
        je9 je9Var = je9.d;
        String name = bzd.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            if (l3 == 0) {
                strK = null;
            } else if (gm0.c()) {
                strK = l3.toString();
            } else if (l3 instanceof Collection) {
                Collection collection = (Collection) l3;
                if (collection.isEmpty()) {
                    strK = "[]";
                } else {
                    strK = c0a.k(collection.size(), "[**", "**]");
                }
            } else if (l3 instanceof Map) {
                Map map = (Map) l3;
                strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
            } else if (l3 instanceof Object[]) {
                Object[] objArr = (Object[]) l3;
                if (objArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(objArr.length, "[**", "**]");
                }
            } else if (l3 instanceof int[]) {
                int[] iArr = (int[]) l3;
                if (iArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(iArr.length, "[**", "**]");
                }
            } else if (l3 instanceof float[]) {
                float[] fArr = (float[]) l3;
                if (fArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(fArr.length, "[**", "**]");
                }
            } else if (l3 instanceof long[]) {
                long[] jArr = (long[]) l3;
                if (jArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(jArr.length, "[**", "**]");
                }
            } else if (l3 instanceof double[]) {
                double[] dArr = (double[]) l3;
                if (dArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(dArr.length, "[**", "**]");
                }
            } else if (l3 instanceof short[]) {
                short[] sArr = (short[]) l3;
                if (sArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(sArr.length, "[**", "**]");
                }
            } else if (l3 instanceof byte[]) {
                byte[] bArr = (byte[]) l3;
                if (bArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(bArr.length, "[**", "**]");
                }
            } else if (l3 instanceof char[]) {
                char[] cArr = (char[]) l3;
                if (cArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(cArr.length, "[**", "**]");
                }
            } else if (l3 instanceof boolean[]) {
                boolean[] zArr = (boolean[]) l3;
                if (zArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(zArr.length, "[**", "**]");
                }
            } else {
                strK = "***";
            }
            a4cVar.c(je9Var, name, qv1.k("received phone: ", strK), null);
        }
        azd azdVarA = a();
        azdVarA.f(true, true);
        pzd pzdVar = (pzd) azdVarA.l.getValue();
        if (((od4) pzdVar.e.getValue()).b()) {
            gm0.n("pzd", "onPush: skip wakelock, backgroundDataDisabledAndOnMobileNetwork");
        } else {
            boolean zBooleanValue = ((Boolean) ((g5d) pzdVar.a).a.Q.a(e5d.S6[35]).i()).booleanValue();
            boolean z4 = ((gue) ((r77) pzdVar.g.getValue())).d > 0;
            boolean z5 = (!zBooleanValue || ((od4) pzdVar.e.getValue()).d() || ((gue) pzdVar.f.getValue()).e() || z4) ? false : true;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                StringBuilder sbB = zo5.B("needWakelockForLogin=", z5, ", wakelockOnPushEnabled=", zBooleanValue, ", online=");
                sbB.append(((od4) pzdVar.e.getValue()).d());
                sbB.append(", appVisible=");
                sbB.append(((gue) pzdVar.f.getValue()).e());
                sbB.append(", hasForegroundServicesAlive=");
                sbB.append(z4);
                a4cVar2.c(je9Var, "pzd", sbB.toString(), null);
            }
            boolean zIsDeviceIdleMode = ((PowerManager) pzdVar.h.getValue()).isDeviceIdleMode();
            if (z5 || zIsDeviceIdleMode) {
                long j7 = pzdVar.d.get();
                long jG = ew5.g(pzdVar.c.m());
                if (jG - j7 < 10000) {
                    gm0.n("pzd", "onPush: already acquired wakelock");
                } else {
                    gm0.m("pzd", "onPush: wakelock, wakelockForLogin=%b, isInDoze=%b", Boolean.valueOf(z5), Boolean.valueOf(zIsDeviceIdleMode));
                    pzdVar.d.set(jG);
                    String str6 = z5 ? "ru.ok.tamtam:push" : "ru.ok.tamtam:doze-wakelock";
                    gm0.m("pzd", "wakeLock: period=%d, tag=%s", 10000, str6);
                    ((PowerManager) pzdVar.h.getValue()).newWakeLock(1, str6).acquire(10000L);
                }
            } else {
                gm0.n("pzd", "onPush: skip wakelock");
            }
        }
        b95 b95Var = (b95) this.e.getValue();
        ha9 ha9Var = this.a;
        ifh ifhVar = ns4.b;
        yab.i0(b95Var.a, ((n0c) ((xhh) b95Var.c.getValue())).c().S0(), 0, new hki(b95Var, ha9Var, new pv1(j, str, l, j2, j3, oc9.H(str3), str2, z, str4, j5, Long.valueOf(j6), Long.valueOf(j4), z2, l2, l3, str5, l4, z3), (lq4) null, 3), 2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    /* JADX WARN: Code duplicated, block: B:16:0x007e A[Catch: NumberFormatException -> 0x0087, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0087, blocks: (B:14:0x0078, B:16:0x007e), top: B:39:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0 A[Catch: NumberFormatException -> 0x00a9, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x00a9, blocks: (B:24:0x009a, B:26:0x00a0), top: B:41:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0058, please report this as an issue */
    public final void d(Map map) {
        String str;
        float fFloatValue;
        Float fValueOf;
        float fFloatValue2;
        String str2;
        Float fValueOf2;
        azd azdVarA = a();
        if (((Boolean) ((zed) azdVarA.c.getValue()).b.a().a.j5.a(e5d.S6[323]).i()).booleanValue()) {
            String str3 = (String) map.get(DatabaseHelper.COMPRESSED_COLUMN_NAME);
            if (str3 != null) {
                Long lC0 = y5h.C0(str3);
                long jT = ((zed) azdVarA.c.getValue()).a.t();
                if (lC0 == null || lC0.longValue() != jT) {
                    String strH = ((hgh) azdVarA.n.getValue()).h(false);
                    yj5 yj5Var = (yj5) azdVarA.f.getValue();
                    str = (String) map.get(DatabaseHelper.COMPRESSED_COLUMN_NAME);
                    fFloatValue = Float.NaN;
                    if (str != null) {
                        try {
                            if (x5h.z0(str)) {
                                fValueOf = Float.valueOf(Float.parseFloat(str));
                            } else {
                                fValueOf = null;
                            }
                        } catch (NumberFormatException unused) {
                        }
                        if (fValueOf != null) {
                            fFloatValue2 = fValueOf.floatValue();
                        } else {
                            fFloatValue2 = Float.NaN;
                        }
                    } else {
                        fFloatValue2 = Float.NaN;
                    }
                    str2 = (String) map.get("suid");
                    if (str2 != null) {
                        try {
                            if (x5h.z0(str2)) {
                                fValueOf2 = Float.valueOf(Float.parseFloat(str2));
                            } else {
                                fValueOf2 = null;
                            }
                        } catch (NumberFormatException unused2) {
                        }
                        if (fValueOf2 != null) {
                            fFloatValue = fValueOf2.floatValue();
                        }
                    }
                    yj5.a(yj5Var, xj5.BAD_PUSHES, fFloatValue2, fFloatValue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (String) map.get("trid"), (String) map.get(DatabaseHelper.COMPRESSED_COLUMN_NAME), strH != null ? r5h.v1(16, strH) : null, null, null, null, null, -917512);
                }
            } else {
                String strH2 = ((hgh) azdVarA.n.getValue()).h(false);
                yj5 yj5Var2 = (yj5) azdVarA.f.getValue();
                str = (String) map.get(DatabaseHelper.COMPRESSED_COLUMN_NAME);
                fFloatValue = Float.NaN;
                if (str != null) {
                    if (x5h.z0(str)) {
                        fValueOf = Float.valueOf(Float.parseFloat(str));
                    } else {
                        fValueOf = null;
                    }
                    if (fValueOf != null) {
                        fFloatValue2 = fValueOf.floatValue();
                    } else {
                        fFloatValue2 = Float.NaN;
                    }
                } else {
                    fFloatValue2 = Float.NaN;
                }
                str2 = (String) map.get("suid");
                if (str2 != null) {
                    if (x5h.z0(str2)) {
                        fValueOf2 = Float.valueOf(Float.parseFloat(str2));
                    } else {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue = fValueOf2.floatValue();
                    }
                }
                yj5.a(yj5Var2, xj5.BAD_PUSHES, fFloatValue2, fFloatValue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (String) map.get("trid"), (String) map.get(DatabaseHelper.COMPRESSED_COLUMN_NAME), strH2 != null ? r5h.v1(16, strH2) : null, null, null, null, null, -917512);
            }
        }
        azdVarA.f(false, !((od4) azdVarA.a.getValue()).b());
    }
}
