package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dyc extends a8j {
    public static final /* synthetic */ zv8[] D;
    public final mjg A;
    public final r8e B;
    public final ifh C;
    public final String c;
    public final b00 d;
    public final hk4 e;
    public final et3 f;
    public final fyc g;
    public final py2 h;
    public final boolean i;
    public final xhh j;
    public final ny8 k;
    public final eg8 l;
    public final ifh m;
    public final ny8 n;
    public final ny8 o;
    public final p3c p = qyj.S();
    public final r8e q;
    public final mjg r;
    public final String s;
    public final mjg t;
    public final r8e u;
    public final mjg v;
    public final r8e w;
    public final mjg x;
    public final mjg y;
    public volatile m8b z;

    static {
        z8b z8bVar = new z8b(dyc.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        D = new zv8[]{z8bVar};
    }

    public dyc(String str, b00 b00Var, hk4 hk4Var, et3 et3Var, fyc fycVar, py2 py2Var, boolean z, xhh xhhVar, boolean z2, boolean z3, ny8 ny8Var, eg8 eg8Var, ifh ifhVar, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = str;
        this.d = b00Var;
        this.e = hk4Var;
        this.f = et3Var;
        this.g = fycVar;
        this.h = py2Var;
        this.i = z;
        this.j = xhhVar;
        this.k = ny8Var;
        this.l = eg8Var;
        this.m = ifhVar;
        this.n = ny8Var2;
        this.o = ny8Var3;
        r66 r66Var = r66.a;
        mjg mjgVarA = p90.a(r66Var);
        this.q = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(Boolean.valueOf(z2));
        this.r = mjgVarA2;
        this.s = dyc.class.getName();
        mjg mjgVarA3 = p90.a(Boolean.TRUE);
        this.t = mjgVarA3;
        this.u = new r8e(mjgVarA3);
        mjg mjgVarA4 = p90.a(null);
        this.v = mjgVarA4;
        this.w = new r8e(mjgVarA4);
        this.x = p90.a(0L);
        mjg mjgVarA5 = p90.a(r66Var);
        this.y = mjgVarA5;
        m8b m8bVar = ui9.a;
        this.z = new m8b();
        mjg mjgVarA6 = p90.a(Boolean.valueOf(z3));
        this.A = mjgVarA6;
        this.B = new r8e(mjgVarA6);
        this.C = new ifh(new gvc(4));
        e9i.j0(e9i.T(new fz6(new o24(e9i.B(b00Var.N, mjgVarA5, mjgVarA2, mjgVarA6, new a26(this, (lq4) null)), 26, this), new rea(2, mjgVarA, f9b.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), 3), ((n0c) xhhVar).a()), this.b);
        String strV = ((xb9) et3Var).V();
        strV = strV == null ? "" : strV;
        StringBuilder sb = new StringBuilder();
        int length = strV.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strV.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        e9i.j0(e9i.T(new fz6(new np1(new r07(this.e.b(), new fz6(new o24(new o24(this.x, 25, this), 27, this), new dk3(2, null, 7)), new zu(3, (lq4) null, 10), 0), new mu1(8, new xa8(17)), this, y5h.C0(sb.toString()), 1), new rea(2, this.y, f9b.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), 3), ((n0c) this.j).a()), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    public static final qxc B(dyc dycVar, w73 w73Var) {
        ynh ynhVar;
        ynh xnhVar;
        int iOrdinal;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        py2 py2Var = dycVar.h;
        if (((Boolean) ((e5d) dycVar.o.getValue()).G6.a(e5d.S6[399]).i()).booleanValue() && py2Var == py2.b) {
            long j = w73Var.u;
            if ((j & 64) == 0 || (j & 256) != 0 || (j & PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) != 0) {
                return null;
            }
        }
        Long l = w73Var.r;
        long j2 = w73Var.u;
        CharSequence charSequence = w73Var.d;
        if (l == null || !(charSequence == null || charSequence.length() == 0)) {
            if (charSequence != null) {
                xnhVar = new xnh(charSequence);
            } else {
                ynhVar = null;
            }
            iOrdinal = py2Var.ordinal();
            if (iOrdinal == 0) {
                z = true;
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2 && iOrdinal != 3) {
                    ore.o();
                    return null;
                }
                if ((j2 & 64) == 0 && (128 & j2) == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else if ((64 & j2) == 0 && (256 & j2) == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((512 & j2) != 0) {
                if (w73Var.r != null) {
                    i = 2;
                } else {
                    i = 1;
                    z2 = true;
                }
                long j3 = w73Var.a;
                Long lValueOf = Long.valueOf(w73Var.s);
                xnh xnhVar2 = new xnh(w73Var.c);
                Uri uri = w73Var.b;
                boolean z4 = w73Var.z();
                if ((4 & j2) != 0) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                return new qxc(j3, lValueOf, xnhVar2, ynhVar, uri, z4, z3, new xyc(2, i, w73Var.a), w73Var.t, (Integer) null, z, 1536);
            }
            i = 5;
            z2 = true;
            long j4 = w73Var.a;
            Long lValueOf2 = Long.valueOf(w73Var.s);
            xnh xnhVar3 = new xnh(w73Var.c);
            Uri uri2 = w73Var.b;
            boolean z5 = w73Var.z();
            if ((4 & j2) != 0) {
                z3 = z2;
            } else {
                z3 = false;
            }
            return new qxc(j4, lValueOf2, xnhVar3, ynhVar, uri2, z5, z3, new xyc(2, i, w73Var.a), w73Var.t, (Integer) null, z, 1536);
        }
        xnhVar = new tnh(R.string.contact_empty_last_seen);
        ynhVar = xnhVar;
        iOrdinal = py2Var.ordinal();
        if (iOrdinal == 0) {
            z = true;
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
            }
            if ((j2 & 64) == 0) {
            }
            z = false;
        } else {
            if ((64 & j2) == 0) {
            }
            z = false;
        }
        if ((512 & j2) != 0) {
            if (w73Var.r != null) {
                i = 2;
            } else {
                i = 1;
                z2 = true;
            }
            long j5 = w73Var.a;
            Long lValueOf3 = Long.valueOf(w73Var.s);
            xnh xnhVar4 = new xnh(w73Var.c);
            Uri uri3 = w73Var.b;
            boolean z6 = w73Var.z();
            if ((4 & j2) != 0) {
                z3 = z2;
            } else {
                z3 = false;
            }
            return new qxc(j5, lValueOf3, xnhVar4, ynhVar, uri3, z6, z3, new xyc(2, i, w73Var.a), w73Var.t, (Integer) null, z, 1536);
        }
        i = 5;
        z2 = true;
        long j6 = w73Var.a;
        Long lValueOf4 = Long.valueOf(w73Var.s);
        xnh xnhVar5 = new xnh(w73Var.c);
        Uri uri4 = w73Var.b;
        boolean z7 = w73Var.z();
        if ((4 & j2) != 0) {
            z3 = z2;
        } else {
            z3 = false;
        }
        return new qxc(j6, lValueOf4, xnhVar5, ynhVar, uri4, z7, z3, new xyc(2, i, w73Var.a), w73Var.t, (Integer) null, z, 1536);
    }
}
