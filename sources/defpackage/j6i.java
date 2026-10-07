package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j6i extends a8j {
    public static final /* synthetic */ zv8[] y = {new z8b(j6i.class, "goToRestoreJob", "getGoToRestoreJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, j6i.class, "deleteUserJob", "getDeleteUserJob()Lkotlinx/coroutines/Job;"), new z8b(j6i.class, "passwordChangeJob", "getPasswordChangeJob()Lkotlinx/coroutines/Job;")};
    public final mk8 c;
    public final String d;
    public final pk8 e;
    public final o44 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final mjg o;
    public final r8e p;
    public final AtomicReference q;
    public final ic6 r;
    public final ic6 s;
    public final ic6 t;
    public volatile sgg u;
    public final p3c v;
    public final p3c w;
    public final p3c x;
    public final String f = j6i.class.getName();
    public final ifh n = new ifh(new bpg(26, this));

    public j6i(mk8 mk8Var, String str, pk8 pk8Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = mk8Var;
        this.d = str;
        this.e = pk8Var;
        this.g = new o44(ny8Var3);
        this.h = ny8Var;
        this.i = ny8Var5;
        this.j = ny8Var2;
        this.k = ny8Var3;
        this.l = ny8Var4;
        this.m = ny8Var6;
        mjg mjgVarA = p90.a(null);
        this.o = mjgVarA;
        this.p = new r8e(mjgVarA);
        this.q = new AtomicReference(null);
        this.r = new ic6(null);
        this.s = new ic6(null);
        this.t = new ic6(null);
        this.v = qyj.S();
        this.w = qyj.S();
        this.x = qyj.S();
        yab.i0(this.b, null, 0, new e6i(this, null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        if (r10.E(r13, r12, r1) == r2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.j6i r10, java.lang.CharSequence r11, java.lang.String r12, defpackage.nq4 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6i.B(j6i, java.lang.CharSequence, java.lang.String, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object C(j6i j6iVar, nq4 nq4Var) {
        g6i g6iVar;
        String str;
        xnh xnhVar;
        int i;
        int i2;
        ifh ifhVar = j6iVar.n;
        if (nq4Var instanceof g6i) {
            g6iVar = (g6i) nq4Var;
            int i3 = g6iVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g6iVar.f = i3 - Integer.MIN_VALUE;
            } else {
                g6iVar = new g6i(j6iVar, nq4Var);
            }
        } else {
            g6iVar = new g6i(j6iVar, nq4Var);
        }
        Object objK0 = g6iVar.d;
        int i4 = g6iVar.f;
        if (i4 == 0) {
            ch3.d0(objK0);
            pk8 pk8Var = j6iVar.e;
            str = pk8Var != null ? pk8Var.b : null;
            if ((str == null || str.length() == 0) && j6iVar.c == mk8.b) {
                xt4 xt4VarB = ((n0c) ((xhh) j6iVar.j.getValue())).b();
                h6i h6iVar = new h6i(j6iVar, null);
                g6iVar.f = 1;
                objK0 = yab.K0(xt4VarB, h6iVar, g6iVar);
                hu4 hu4Var = hu4.a;
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
            }
            if (str != null) {
                xnhVar = new xnh(str);
            } else {
                xnhVar = null;
            }
            i = ((m6i) ifhVar.getValue()).b;
            if (i != Integer.MAX_VALUE || i <= 0) {
                i2 = 0;
            } else {
                i2 = ((m6i) ifhVar.getValue()).b;
            }
            int i5 = i2;
            mjg mjgVar = j6iVar.o;
            s8i s8iVar = new s8i(new tnh(R.string.oneme_settings_twofa_check_password_title), new tnh(R.string.oneme_settings_twofa_check_password_subtitle), new v8i(new tnh(R.string.oneme_settings_twofa_creation_password_first_hint), xnhVar, 0, i5, 20));
            mjgVar.getClass();
            mjgVar.j(null, s8iVar);
            return sbi.a;
        }
        if (i4 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objK0);
        Object obj = ((roe) objK0).a;
        if (obj instanceof poe) {
            obj = null;
        }
        dd0 dd0Var = (dd0) obj;
        str = dd0Var != null ? dd0Var.c.b : null;
        if (str != null) {
            xnhVar = new xnh(str);
        } else {
            xnhVar = null;
        }
        i = ((m6i) ifhVar.getValue()).b;
        if (i != Integer.MAX_VALUE) {
            i2 = 0;
        } else {
            i2 = 0;
        }
        int i6 = i2;
        mjg mjgVar2 = j6iVar.o;
        s8i s8iVar2 = new s8i(new tnh(R.string.oneme_settings_twofa_check_password_title), new tnh(R.string.oneme_settings_twofa_check_password_subtitle), new v8i(new tnh(R.string.oneme_settings_twofa_creation_password_first_hint), xnhVar, 0, i6, 20));
        mjgVar2.getClass();
        mjgVar2.j(null, s8iVar2);
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r11 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r11 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(defpackage.j6i r9, java.lang.CharSequence r10, defpackage.nq4 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6i.D(j6i, java.lang.CharSequence, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r4.a(r1, r10, r0) == r7) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(defpackage.qd0 r9, java.lang.String r10, defpackage.nq4 r11) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6i.E(qd0, java.lang.String, nq4):java.lang.Object");
    }

    public final pvb F() {
        return (pvb) this.k.getValue();
    }

    public final void G(Throwable th) throws Throwable {
        tnh tnhVar;
        gm0.V(this.f, "Check password step: fail check password", th);
        this.u = null;
        if (th instanceof CancellationException) {
            throw th;
        }
        if (!(th instanceof TamErrorException)) {
            ic6 ic6Var = this.r;
            Object obj = zhh.a;
            if (obj.equals(obj)) {
                tnhVar = new tnh(R.string.common_error_base_retry);
            } else if (obj.equals(aih.a)) {
                tnhVar = new tnh(R.string.common_network_error);
            } else {
                if (!obj.equals(bih.a)) {
                    ore.o();
                    return;
                }
                tnhVar = new tnh(R.string.common_service_error);
            }
            a8j.x(ic6Var, new k7i(0, 6, tnhVar));
            return;
        }
        s8i s8iVar = (s8i) this.o.getValue();
        TamErrorException tamErrorException = (TamErrorException) th;
        if (!vzl.d(tamErrorException.a)) {
            a8j.x(this.r, new k7i(0, 6, vzl.a(tamErrorException.a)));
            if (this.c == mk8.a && vzl.e(th)) {
                a8j.x(this.t, t7i.a);
                return;
            }
            return;
        }
        ynh ynhVarA = vzl.a(tamErrorException.a);
        mjg mjgVar = this.o;
        s8i s8iVar2 = new s8i(s8iVar.a, s8iVar.b, v8i.a(s8iVar.c, ynhVarA));
        mjgVar.getClass();
        mjgVar.j(null, s8iVar2);
        a8j.x(this.r, new l7i(false));
    }

    @Override // defpackage.a8j
    public final void y() {
        this.u = null;
    }
}
