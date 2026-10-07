package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vi4 extends zz5 {
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public final AtomicBoolean E;
    public final ks9 F;
    public final ks9 G;
    public final long p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;

    public vi4(long j, dq4 dq4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15) {
        super(dq4Var, ny8Var3, ny8Var4);
        this.p = j;
        this.q = ny8Var;
        this.r = ny8Var2;
        this.s = ny8Var5;
        this.t = ny8Var6;
        this.u = ny8Var3;
        this.v = ny8Var7;
        this.w = ny8Var8;
        this.x = ny8Var9;
        this.y = ny8Var10;
        this.z = ny8Var11;
        this.A = ny8Var12;
        this.B = ny8Var13;
        this.C = ny8Var14;
        this.D = ny8Var15;
        this.E = new AtomicBoolean(false);
        this.F = new ks9(14, Collections.singletonList(new a09(64)));
        this.G = new ks9(14, ww3.H1(new n66(), xw3.P0(new a09(59), new rf(), new fhb())));
        e9i.j0(e9i.T(new fz6(new o24(new bye(new f00(new jz(((no4) ny8Var.getValue()).j(j), 13), (lq4) null, this, ny8Var5, 29)), 3, this), new ke3(this, (lq4) null, 11), 3), ((n0c) ((xhh) ny8Var3.getValue())).b()), dq4Var);
    }

    public static final Object o(vi4 vi4Var, mi4 mi4Var) {
        pzf pzfVar = vi4Var.e;
        boolean z = vi4Var.E.get();
        hu4 hu4Var = hu4.a;
        if (z) {
            vi4Var.c().getClass();
            Object objEmit = pzfVar.emit(new tod(new tnh(R.string.oneme_profile_edit_delete_profile_header), new tnh(R.string.oneme_profile_edit_delete_profile_description), xw3.P0(new kc4(R.id.profile_edit_delete_profile_button, new tnh(R.string.oneme_profile_edit_delete_profile_delete_action), 1, 56), new kc4(R.id.profile_edit_delete_profile_cancel_button, new tnh(R.string.oneme_profile_edit_delete_profile_cancel_action), 2, 56)), 8), mi4Var);
            if (objEmit == hu4Var) {
                return objEmit;
            }
        } else {
            vg4 vg4Var = (vg4) ((no4) vi4Var.q.getValue()).j(vi4Var.p).a.getValue();
            String strK = vg4Var != null ? vg4Var.k() : null;
            if (strK == null) {
                strK = "";
            }
            vi4Var.c().getClass();
            vnh vnhVar = new vnh(R.string.profile_delete_contact_bottom_sheet_title, a.n1(new Object[]{strK}));
            c79 c79VarW = yab.w();
            c79VarW.add(new kc4(R.id.profile_delete_contact_confirmation_sheet_confirm, new tnh(R.string.profile_delete_contact_bottom_sheet_confirm), 1, 56));
            c79VarW.add(new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.profile_delete_contact_bottom_sheet_cancel), 2, 56));
            Object objEmit2 = pzfVar.emit(new tod(vnhVar, (ynh) null, yab.j(c79VarW), 10), mi4Var);
            if (objEmit2 == hu4Var) {
                return objEmit2;
            }
        }
        return sbi.a;
    }

    /* JADX WARN: switch over string: strings are not added: [[6M]] */
    public static final pz5 p(vi4 vi4Var, vg4 vg4Var) {
        ynh tnhVar;
        String strA = vg4Var.A(((s7f) ((et3) vi4Var.s.getValue())).k());
        long jV = vg4Var.v();
        CharSequence charSequenceU = vg4Var.u();
        String strM = vg4Var.m();
        String strN = vg4Var.n();
        ki4 ki4Var = vg4Var.a.b;
        String str = ki4Var.n;
        String str2 = ki4Var.o;
        if (str2 == null || str2.length() == 0) {
            tnhVar = new tnh(R.string.profile_edit_shortlink_not_chosen);
        } else {
            String lastPathSegment = Uri.parse(ki4Var.o).getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            tnhVar = new xnh(lastPathSegment);
        }
        ynh ynhVar = tnhVar;
        String strValueOf = String.valueOf(vg4Var.w());
        String string = ((nni) vi4Var.t.getValue()).d.getString("app.privacy.inactive.ttl", "6M");
        kni kniVar = kni.TTL_6M;
        if (string != null) {
            switch (string) {
                case "1M":
                    kniVar = kni.TTL_1M;
                    break;
                case "3M":
                    kniVar = kni.TTL_3M;
                    break;
            }
        }
        return new pz5(strA, jV, strM, charSequenceU, null, strN, null, str, ynhVar, strValueOf, kniVar, false, null);
    }

    public static final void q(vi4 vi4Var, long j) {
        Object value;
        pz5 pz5VarC;
        Object value2;
        mjg mjgVar = vi4Var.l;
        do {
            value = mjgVar.getValue();
            pz5 pz5Var = (pz5) value;
            if (pz5Var != null) {
                pz5VarC = pz5.c(pz5Var, null, null, null, null, null, null, null, j != 0, Long.valueOf(j), 2047);
            } else {
                pz5VarC = null;
            }
        } while (!mjgVar.h(value, pz5VarC));
        mjg mjgVar2 = vi4Var.c;
        do {
            value2 = mjgVar2.getValue();
        } while (!mjgVar2.h(value2, vi4Var.f().b(vi4Var)));
    }

    @Override // defpackage.zz5
    public final void a(int i) {
        yab.i0(this.a, ((n0c) r()).a(), 0, new mi4(i, this, null), 2);
    }

    @Override // defpackage.zz5
    public final void b() {
    }

    @Override // defpackage.zz5
    public final boolean d() {
        return this.E.get();
    }

    @Override // defpackage.zz5
    public final long e() {
        return this.p;
    }

    @Override // defpackage.zz5
    public final void g(int i) {
        if (i == R.id.profile_change_inactive_ttl_delete_1_month) {
            s(kni.TTL_1M);
            return;
        }
        if (i == R.id.profile_change_inactive_ttl_delete_3_month) {
            s(kni.TTL_3M);
            return;
        }
        if (i == R.id.profile_change_inactive_ttl_delete_6_month) {
            s(kni.TTL_6M);
            return;
        }
        gu4 gu4Var = this.a;
        if (i == R.id.profile_edit_delete_profile_button) {
            yab.i0(gu4Var, ((n0c) r()).b(), 0, new qi4((Object) this, true, (lq4) null, 0), 2);
            return;
        }
        if (i == R.id.profile_delete_contact_confirmation_sheet_confirm) {
            xt4 xt4VarB = ((n0c) r()).b();
            zhb zhbVar = zhb.b;
            xt4VarB.getClass();
            yab.i0(gu4Var, lvb.x0(xt4VarB, zhbVar), 0, new mi4(this, null), 2);
            return;
        }
        if (i == R.id.profile_edit_logout_confirm_action) {
            k42.a((k42) this.w.getValue());
            yab.i0(gu4Var, ((n0c) r()).b(), 0, new oi4(2, this, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r6.e.emit(r7, r0) == r5) goto L22;
     */
    @Override // defpackage.zz5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r7, android.graphics.RectF r8, defpackage.nq4 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ni4
            if (r0 == 0) goto L13
            r0 = r9
            ni4 r0 = (defpackage.ni4) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ni4 r0 = new ni4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r9)
            goto L7f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r4
        L31:
            java.util.concurrent.atomic.AtomicLong r7 = r0.d
            defpackage.ch3.d0(r9)
            goto L54
        L37:
            defpackage.ch3.d0(r9)
            r60 r8 = defpackage.o3m.a(r8)
            ny8 r9 = r6.B
            java.lang.Object r9 = r9.getValue()
            pvb r9 = (defpackage.pvb) r9
            java.util.concurrent.atomic.AtomicLong r1 = r6.o
            r0.d = r1
            r0.g = r3
            java.lang.Object r9 = r9.z(r7, r8, r0)
            if (r9 != r5) goto L53
            goto L7e
        L53:
            r7 = r1
        L54:
            java.lang.Number r9 = (java.lang.Number) r9
            long r8 = r9.longValue()
            r7.set(r8)
            uod r7 = new uod
            tnh r8 = new tnh
            r9 = 2131823030(0x7f1109b6, float:1.9278848E38)
            r8.<init>(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r1 = 2131232171(0x7f0805ab, float:1.8080444E38)
            r9.<init>(r1)
            r7.<init>(r8, r9)
            r0.d = r4
            r0.g = r2
            pzf r6 = r6.e
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r5) goto L7f
        L7e:
            return r5
        L7f:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi4.h(java.lang.String, android.graphics.RectF, nq4):java.lang.Object");
    }

    @Override // defpackage.zz5
    public final sbi j() {
        vg4 vg4Var = (vg4) ((no4) this.q.getValue()).j(this.p).a.getValue();
        sbi sbiVar = sbi.a;
        if (vg4Var == null) {
            gm0.Y(vi4.class.getName(), "Early return in photoUploadError cuz of contactFlow is null");
            return sbiVar;
        }
        mjg mjgVar = this.b;
        ind indVar = (ind) mjgVar.getValue();
        mjgVar.setValue(indVar != null ? ind.a(indVar, vg4Var.A(((s7f) ((et3) this.s.getValue())).k()), false, 62) : null);
        return sbiVar;
    }

    @Override // defpackage.zz5
    public final void k() {
        yab.i0(this.a, ((n0c) r()).b(), 0, new oi4(3, this, null), 2);
    }

    @Override // defpackage.zz5
    public final void l() {
        yab.i0(this.a, ((n0c) r()).a(), 0, new oi4(4, this, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (r12 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        if (defpackage.yab.K0(r12, r3, r0) == r6) goto L50;
     */
    @Override // defpackage.zz5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.nq4 r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi4.m(nq4):java.lang.Object");
    }

    @Override // defpackage.zz5
    public final void n(int i, String str) {
        Object value;
        pz5 pz5VarC;
        Object value2;
        pz5 pz5VarC2;
        String str2;
        pz5 pz5VarC3;
        mjg mjgVar = this.l;
        if (i != 1) {
            String str3 = str;
            if (i == 2) {
                do {
                    value2 = mjgVar.getValue();
                    pz5 pz5Var = (pz5) value2;
                    if (pz5Var != null) {
                        String str4 = str3;
                        pz5VarC2 = pz5.c(pz5Var, null, null, str4, null, null, null, null, false, null, 8095);
                        str3 = str4;
                    } else {
                        pz5VarC2 = null;
                    }
                } while (!mjgVar.h(value2, pz5VarC2));
                return;
            }
            if (i == 4) {
                do {
                    value = mjgVar.getValue();
                    pz5 pz5Var2 = (pz5) value;
                    if (pz5Var2 != null) {
                        String str5 = str3;
                        pz5VarC = pz5.c(pz5Var2, null, null, null, null, str5, null, null, false, null, 8063);
                        str3 = str5;
                    } else {
                        pz5VarC = null;
                    }
                } while (!mjgVar.h(value, pz5VarC));
                return;
            }
            return;
        }
        while (true) {
            Object value3 = mjgVar.getValue();
            pz5 pz5Var3 = (pz5) value3;
            if (pz5Var3 != null) {
                str2 = str;
                pz5VarC3 = pz5.c(pz5Var3, str2, null, null, null, null, null, null, false, null, 8171);
            } else {
                str2 = str;
                pz5VarC3 = null;
            }
            if (mjgVar.h(value3, pz5VarC3)) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final xhh r() {
        return (xhh) this.u.getValue();
    }

    public final void s(kni kniVar) {
        kni kniVar2;
        pz5 pz5VarC;
        while (true) {
            mjg mjgVar = this.l;
            Object value = mjgVar.getValue();
            pz5 pz5Var = (pz5) value;
            if (pz5Var != null) {
                kniVar2 = kniVar;
                pz5VarC = pz5.c(pz5Var, null, null, null, null, null, null, kniVar2, false, null, 7167);
            } else {
                kniVar2 = kniVar;
                pz5VarC = null;
            }
            if (mjgVar.h(value, pz5VarC)) {
                return;
            } else {
                kniVar = kniVar2;
            }
        }
    }

    public final boolean t(ks9 ks9Var) {
        Object value;
        pz5 pz5Var;
        mjg mjgVar;
        Object value2;
        mjg mjgVar2 = this.l;
        pz5 pz5Var2 = (pz5) mjgVar2.getValue();
        String str = pz5Var2 != null ? pz5Var2.c : null;
        if (str == null) {
            str = "";
        }
        sx3 sx3VarF = ks9Var.F(1, str);
        pz5 pz5Var3 = (pz5) mjgVar2.getValue();
        String str2 = pz5Var3 != null ? pz5Var3.f : null;
        sx3 sx3VarF2 = ks9Var.F(2, str2 != null ? str2 : "");
        boolean z = sx3VarF == null && sx3VarF2 == null;
        do {
            value = mjgVar2.getValue();
            pz5Var = (pz5) value;
        } while (!mjgVar2.h(value, pz5Var != null ? pz5.c(pz5Var, null, sx3VarF, null, sx3VarF2, null, null, null, false, null, 8111) : null));
        do {
            mjgVar = this.c;
            value2 = mjgVar.getValue();
        } while (!mjgVar.h(value2, f().b(this)));
        return z;
    }
}
