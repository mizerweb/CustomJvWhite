package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zg6 implements ko0, v1i {
    public static final ghe i = c98.u(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ghe j = c98.u(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ghe k = c98.u(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ghe l = c98.u(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ghe m = c98.u(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ghe n = c98.u(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public final Context a;
    public final g98 b;
    public final boolean c;
    public final jqc d;
    public final zeg e;
    public int f;
    public long g;
    public String h;

    public zg6(Context context, HashMap map, jqc jqcVar, zeg zegVar) {
        this.a = context == null ? null : context.getApplicationContext();
        this.b = g98.a(map);
        this.d = jqcVar;
        this.e = zegVar;
        this.c = true;
        ndb ndbVarA = ndb.a(context);
        int iB = ndbVarA.b();
        this.f = iB;
        this.g = j(iB);
        ndbVarA.c(new c85(1, this), gm0.t());
    }

    public static boolean k(a35 a35Var, boolean z) {
        return z && !a35Var.c(8);
    }

    @Override // defpackage.ko0
    public final synchronized void a(r75 r75Var) {
        this.e.e.x(r75Var);
    }

    @Override // defpackage.ko0
    public final synchronized long b() {
        jqc jqcVar;
        jqcVar = this.d;
        return !jqcVar.e ? (long) jqcVar.b.b(jqcVar.c) : -9223372036854775807L;
    }

    @Override // defpackage.v1i
    public final synchronized void c(u25 u25Var, a35 a35Var, boolean z) {
        if (k(a35Var, z)) {
            jqc jqcVar = this.d;
            yo9 yo9Var = jqcVar.a;
            yo9Var.remove(a35Var);
            jqcVar.d.getClass();
            yo9Var.put(a35Var, Long.valueOf(vqi.X(SystemClock.elapsedRealtime())));
            this.e.getClass();
        }
    }

    @Override // defpackage.v1i
    public final synchronized void d(u25 u25Var, a35 a35Var, boolean z, int i2) {
        if (k(a35Var, z)) {
            zeg zegVar = this.e;
            long j2 = i2;
            zegVar.h += j2;
            zegVar.l += j2;
        }
    }

    @Override // defpackage.ko0
    public final v1i e() {
        return this;
    }

    @Override // defpackage.ko0
    public final synchronized long f() {
        long j2;
        j2 = this.e.i;
        if (j2 == Long.MIN_VALUE) {
            j2 = this.g;
        }
        return j2;
    }

    @Override // defpackage.ko0
    public final synchronized void g(Handler handler, r75 r75Var) {
        r75Var.getClass();
        pgg pggVar = this.e.e;
        pggVar.getClass();
        pggVar.x(r75Var);
        ((CopyOnWriteArrayList) pggVar.a).add(new jo0(handler, r75Var));
    }

    @Override // defpackage.v1i
    public final synchronized void h(u25 u25Var, a35 a35Var, boolean z) {
        if (k(a35Var, z)) {
            this.e.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v1i
    public final synchronized void i(u25 u25Var, a35 a35Var, boolean z) {
        if (k(a35Var, z)) {
            jqc jqcVar = this.d;
            Long l2 = (Long) jqcVar.a.remove(a35Var);
            if (l2 != null) {
                uag uagVar = jqcVar.b;
                jqcVar.d.getClass();
                uagVar.a(1, vqi.X(SystemClock.elapsedRealtime()) - l2.longValue());
                jqcVar.e = false;
            }
            zeg zegVar = this.e;
            if (zegVar.f == 0) {
                zegVar.d.getClass();
                zegVar.g = SystemClock.elapsedRealtime();
            }
            zegVar.f++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:1149:0x1216  */
    public final long j(int i2) {
        int[] iArr;
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i2);
        g98 g98Var = this.b;
        Long lValueOf = (Long) g98Var.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = (Long) g98Var.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            String str = this.h;
            if (str == null) {
                str = "";
            }
            switch (str) {
                case "AD":
                case "AI":
                case "BB":
                case "BQ":
                case "CW":
                case "DM":
                case "KN":
                case "KY":
                case "SX":
                case "VC":
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case "AE":
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case "AF":
                case "SZ":
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case "AG":
                case "CI":
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case "AL":
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case "AM":
                case "PA":
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case "AO":
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case "AQ":
                case "ER":
                case "NU":
                case "SC":
                case "SH":
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case "AR":
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case "AS":
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case "AT":
                case "EE":
                case "HU":
                case "IS":
                case "LV":
                case "MT":
                case "SE":
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case "AU":
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case "AW":
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case "AX":
                case "CX":
                case "LI":
                case "MS":
                case "PM":
                case "SM":
                case "VA":
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case "AZ":
                case "DJ":
                case "LY":
                case "SL":
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case "BA":
                case "JO":
                case "TR":
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case "BD":
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case "BE":
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case "BF":
                case "SD":
                case "SY":
                case "TD":
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case "BG":
                case "PT":
                case "SI":
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case "BH":
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case "BI":
                case "GQ":
                case "HT":
                case "NE":
                case "VE":
                case "YE":
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case "BJ":
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case "BL":
                case "MP":
                case "PY":
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case "BM":
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case "BN":
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case "BO":
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case "BR":
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case "BS":
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case "BT":
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case "BW":
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case "BY":
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case "BZ":
                case "CK":
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case "CA":
                case "UA":
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case "CD":
                case "ML":
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case "CF":
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case "CG":
                case "EG":
                case "MG":
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case "CH":
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case "CL":
                case "TH":
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case "CM":
                case "MR":
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case "CN":
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case "CO":
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case "CR":
                case "NI":
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case "CU":
                case "KI":
                case "NR":
                case "TL":
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case "CV":
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case "CY":
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case "CZ":
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case "DE":
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case "DK":
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case "DO":
                case "LR":
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case "DZ":
                case "TJ":
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case "EC":
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case "ES":
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case "ET":
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case "FI":
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case "FJ":
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case "FK":
                case "NF":
                case "SJ":
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case "FM":
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case "FO":
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case "FR":
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case "GA":
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case "GB":
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case "GD":
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case "GE":
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case "GF":
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case "GG":
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case "GH":
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case "GI":
                case "IM":
                case "JE":
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case "GL":
                case "MC":
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case "GM":
                case "SS":
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case "GN":
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case "GP":
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case "GR":
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case "GT":
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case "GU":
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case "GW":
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case "GY":
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case "HK":
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case "HR":
                case "KW":
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case "ID":
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case "IE":
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case "IL":
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case "IN":
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case "IO":
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case "IQ":
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case "IR":
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case "IT":
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case "JM":
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case "JP":
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case "KE":
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case "KG":
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case "KH":
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case "KM":
                case "VU":
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case "KR":
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case "KZ":
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case "LA":
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case "LB":
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case "LC":
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case "LK":
                case "MM":
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case "LS":
                case "PG":
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case "LT":
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case "LU":
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case "MA":
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case "MD":
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case "ME":
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case "MF":
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case "MH":
                case "TM":
                case "TV":
                case "WF":
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case "MK":
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case "MN":
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case "MO":
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case "MQ":
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case "MU":
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case "MV":
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case "MW":
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case "MX":
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case "MY":
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case "MZ":
                case "WS":
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case "NA":
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case "NC":
                case "YT":
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case "NG":
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case "NL":
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case "NO":
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case "NP":
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case "NZ":
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case "OM":
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case "PE":
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case "PF":
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case "PH":
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case "PK":
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case "PL":
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case "PR":
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case "PS":
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case "PW":
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case "QA":
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case "RE":
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case "RO":
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case "RS":
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case "RU":
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case "RW":
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case "SA":
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case "SB":
                case "ZW":
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case "SG":
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case "SK":
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case "SN":
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case "SO":
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case "SR":
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case "ST":
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case "SV":
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case "TC":
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case "TG":
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case "TN":
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case "TO":
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case "TT":
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case "TW":
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case "TZ":
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case "UG":
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case "US":
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case "UY":
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case "UZ":
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case "VG":
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case "VI":
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case "VN":
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case "XK":
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case "ZA":
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case "ZM":
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i2 == 2) {
                jLongValue = ((Long) i.get(iArr[0])).longValue();
            } else if (i2 == 3) {
                jLongValue = ((Long) j.get(iArr[1])).longValue();
            } else if (i2 == 4) {
                jLongValue = ((Long) k.get(iArr[2])).longValue();
            } else if (i2 == 5) {
                jLongValue = ((Long) l.get(iArr[3])).longValue();
            } else if (i2 == 7) {
                jLongValue = ((Long) i.get(iArr[0])).longValue();
            } else if (i2 != 9) {
                jLongValue = i2 != 10 ? 1000000L : ((Long) m.get(iArr[4])).longValue();
            } else {
                jLongValue = ((Long) n.get(iArr[5])).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }
}
