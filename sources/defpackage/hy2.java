package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.webkit.URLUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hy2 extends zz5 {
    public static final /* synthetic */ zv8[] Q = {new z8b(hy2.class, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, hy2.class, "deleteChatJob", "getDeleteChatJob()Lkotlinx/coroutines/Job;"), new z8b(hy2.class, "updateCommentsToggleJob", "getUpdateCommentsToggleJob()Lkotlinx/coroutines/Job;"), new z8b(hy2.class, "showCommentsConfirmationJob", "getShowCommentsConfirmationJob()Lkotlinx/coroutines/Job;"), new z8b(hy2.class, "updateConfirmBeforeSendToggleJob", "getUpdateConfirmBeforeSendToggleJob()Lkotlinx/coroutines/Job;"), new z8b(hy2.class, "updateDisableForwardJob", "getUpdateDisableForwardJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public final ny8 E;
    public final ny8 F;
    public final p3c G;
    public final p3c H;
    public final p3c I;
    public final p3c J;
    public final p3c K;
    public final p3c L;
    public final ks9 M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final long p;
    public final AtomicBoolean q;
    public volatile boolean r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;

    public hy2(long j, dq4 dq4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15) {
        super(dq4Var, ny8Var, ny8Var2);
        this.p = j;
        boolean z = false;
        this.q = new AtomicBoolean(false);
        this.s = ny8Var3;
        this.t = ny8Var4;
        this.u = ny8Var7;
        this.v = ny8Var8;
        this.w = ny8Var;
        this.x = ny8Var9;
        this.y = ny8Var10;
        this.z = ny8Var11;
        this.A = ny8Var12;
        this.B = ny8Var13;
        this.C = ny8Var5;
        this.D = ny8Var6;
        this.E = ny8Var14;
        this.F = ny8Var15;
        this.G = qyj.S();
        this.H = qyj.S();
        this.I = qyj.S();
        this.J = qyj.S();
        this.K = qyj.S();
        this.L = qyj.S();
        this.M = new ks9(14, xw3.P0(new a09(60), new n66()));
        rt2 rt2VarR = r();
        this.N = rt2VarR != null && rt2VarR.d0();
        rt2 rt2VarR2 = r();
        this.O = rt2VarR2 != null && rt2VarR2.B0();
        rt2 rt2VarR3 = r();
        if (rt2VarR3 != null && rt2VarR3.z0()) {
            z = true;
        }
        this.P = z;
        rt2 rt2VarR4 = r();
        if (rt2VarR4 != null) {
            rt2VarR4.I();
        }
        e9i.j0(e9i.T(new fz6(new ie(new bye(new dn0(new jz(((xn3) ny8Var4.getValue()).k(j), 13), (lq4) null, this, 18)), this, 14), new in1(this, (lq4) null, 13), 3), ((n0c) ((xhh) ny8Var.getValue())).a()), dq4Var);
    }

    public static final Object o(hy2 hy2Var, boolean z, zx2 zx2Var) {
        Object objEmit = hy2Var.e.emit(new sod(new tnh(z ? R.string.channel_deleted : R.string.chat_deleted), 0, new ot4(28, hy2Var)), zx2Var);
        return objEmit == hu4.a ? objEmit : sbi.a;
    }

    public static final Object p(hy2 hy2Var, gy2 gy2Var) {
        hy2Var.c.setValue(hy2Var.f().b(hy2Var));
        Object objEmit = hy2Var.e.emit(new uod(new tnh(R.string.common_error_base_retry), new Integer(R.drawable.icon_warning)), gy2Var);
        return objEmit == hu4.a ? objEmit : sbi.a;
    }

    public static final kz5 q(hy2 hy2Var, rt2 rt2Var) {
        List list;
        ax2 ax2Var = rt2Var.b.p;
        List listK = ((xm) hy2Var.v.getValue()).k();
        String strValueOf = "";
        if (ax2Var != null) {
            if (ax2Var.b) {
                List list2 = ax2Var.f;
                if (list2 != null) {
                    if (ax2Var.e && list2.isEmpty()) {
                        strValueOf = ((Context) hy2Var.u.getValue()).getString(R.string.oneme_profile_edit_admin_action_reactions_off);
                    } else {
                        boolean z = ax2Var.e;
                        if (z) {
                            List list3 = ax2Var.f;
                            strValueOf = String.valueOf(list3 != null ? list3.size() : 0);
                        } else if (z || !((list = ax2Var.f) == null || list.isEmpty())) {
                            int size = listK.size();
                            List list4 = ax2Var.f;
                            strValueOf = String.valueOf(size - (list4 != null ? list4.size() : 0));
                        } else {
                            strValueOf = ((Context) hy2Var.u.getValue()).getString(R.string.oneme_profile_edit_admin_action_reactions_all);
                        }
                    }
                }
            } else {
                strValueOf = ((Context) hy2Var.u.getValue()).getString(R.string.oneme_profile_edit_admin_action_reactions_off);
            }
        }
        String str = strValueOf;
        String strS = rt2Var.s(us0.c, rs0.a);
        long jA = rt2Var.A();
        rt2Var.L0();
        return new kz5(strS, jA, rt2Var.m, rt2Var.F(), null, rt2Var.v(), rt2Var.b.w0, str);
    }

    @Override // defpackage.zz5
    public final void a(int i) {
        yab.i0(this.a, ((n0c) s()).a(), 0, new zx2(this, i, (lq4) null), 2);
    }

    @Override // defpackage.zz5
    public final void b() {
        zv8[] zv8VarArr = Q;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.G;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
        zv8 zv8Var2 = zv8VarArr[2];
        p3c p3cVar2 = this.I;
        vo8 vo8Var2 = (vo8) p3cVar2.m(this, zv8Var2);
        if (vo8Var2 != null) {
            vo8Var2.b(null);
        }
        p3cVar2.B(this, zv8VarArr[2], null);
        zv8 zv8Var3 = zv8VarArr[3];
        p3c p3cVar3 = this.J;
        vo8 vo8Var3 = (vo8) p3cVar3.m(this, zv8Var3);
        if (vo8Var3 != null) {
            vo8Var3.b(null);
        }
        p3cVar3.B(this, zv8VarArr[3], null);
        zv8 zv8Var4 = zv8VarArr[4];
        p3c p3cVar4 = this.K;
        vo8 vo8Var4 = (vo8) p3cVar4.m(this, zv8Var4);
        if (vo8Var4 != null) {
            vo8Var4.b(null);
        }
        p3cVar4.B(this, zv8VarArr[4], null);
    }

    @Override // defpackage.zz5
    public final boolean d() {
        return this.r;
    }

    @Override // defpackage.zz5
    public final long e() {
        return this.p;
    }

    @Override // defpackage.zz5
    public final void g(int i) {
        yab.i0(this.a, ((n0c) s()).a(), 0, new zx2(i, this, (lq4) null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.zz5
    public final Object h(String str, RectF rectF, nq4 nq4Var) {
        cy2 cy2Var;
        AtomicLong atomicLong;
        if (nq4Var instanceof cy2) {
            cy2Var = (cy2) nq4Var;
            int i = cy2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cy2Var.g = i - Integer.MIN_VALUE;
            } else {
                cy2Var = new cy2(this, nq4Var);
            }
        } else {
            cy2Var = new cy2(this, nq4Var);
        }
        cy2 cy2Var2 = cy2Var;
        Object objA = cy2Var2.e;
        int i2 = cy2Var2.g;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(objA);
            rt2 rt2VarR = r();
            if (rt2VarR == null) {
                gm0.Y(hy2.class.getName(), "Early return in onCropAreaSelected cuz of chat is null");
                return sbiVar;
            }
            r60 r60VarA = o3m.a(rectF);
            ip2 ip2Var = (ip2) this.A.getValue();
            long j = rt2VarR.a;
            atomicLong = this.o;
            cy2Var2.d = atomicLong;
            cy2Var2.g = 1;
            objA = ip2Var.a(j, str, r60VarA, cy2Var2);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            atomicLong = cy2Var2.d;
            ch3.d0(objA);
        }
        atomicLong.set(((Number) objA).longValue());
        return sbiVar;
    }

    @Override // defpackage.zz5
    public final boolean i(long j, boolean z) {
        long j2 = b6c.n;
        zv8[] zv8VarArr = Q;
        gu4 gu4Var = this.a;
        if (j == j2) {
            sgg sggVarH0 = yab.h0(gu4Var, ((n0c) s()).a(), 2, new ay2(this, z, null, 1));
            this.J.B(this, zv8VarArr[3], sggVarH0);
            return false;
        }
        if (j == b6c.o) {
            sgg sggVarH1 = yab.h0(gu4Var, ((n0c) s()).b(), 2, new gy2(this, z, null));
            this.K.B(this, zv8VarArr[4], sggVarH1);
            return true;
        }
        if (j != b6c.c) {
            return true;
        }
        t();
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.zz5
    public final sbi j() {
        rt2 rt2VarR = r();
        sbi sbiVar = sbi.a;
        if (rt2VarR == null) {
            gm0.Y(hy2.class.getName(), "Early return in photoUploadError cuz of chat is null");
            return sbiVar;
        }
        mjg mjgVar = this.b;
        ind indVar = (ind) mjgVar.getValue();
        ind indVarA = null;
        String strD = null;
        if (indVar != null) {
            String str = rt2VarR.b.h;
            if (URLUtil.isContentUrl(str) || URLUtil.isFileUrl(str)) {
                strD = str;
            } else if (!ch3.r(str)) {
                strD = vs0.d(str, us0.c, rs0.a);
            }
            indVarA = ind.a(indVar, strD, false, 62);
        }
        mjgVar.setValue(indVarA);
        return sbiVar;
    }

    @Override // defpackage.zz5
    public final void k() {
        yab.i0(this.a, ((n0c) s()).b(), 0, new qt1(this, null, 24), 2);
    }

    @Override // defpackage.zz5
    public final void l() {
        yab.i0(this.a, ((n0c) s()).a(), 0, new by2(2, this, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zz5
    public final Object m(nq4 nq4Var) {
        fy2 fy2Var;
        rt2 rt2VarR;
        if (nq4Var instanceof fy2) {
            fy2Var = (fy2) nq4Var;
            int i = fy2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fy2Var.f = i - Integer.MIN_VALUE;
            } else {
                fy2Var = new fy2(this, nq4Var);
            }
        } else {
            fy2Var = new fy2(this, nq4Var);
        }
        Object obj = fy2Var.d;
        int i2 = fy2Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            mjg mjgVar = this.l;
            kz5 kz5Var = (kz5) mjgVar.getValue();
            if (kz5Var != null && (rt2VarR = r()) != null) {
                kz5 kz5Var2 = (kz5) mjgVar.getValue();
                String str = kz5Var2 != null ? kz5Var2.d : null;
                if (str == null) {
                    str = "";
                }
                sx3 sx3VarF = this.M.F(3, str);
                boolean z = sx3VarF == null;
                kz5 kz5Var3 = (kz5) mjgVar.getValue();
                mjgVar.setValue(kz5Var3 != null ? kz5.c(kz5Var3, null, sx3VarF, null, null, 239) : null);
                this.c.setValue(f().b(this));
                if (!z) {
                    return Boolean.FALSE;
                }
                if (rt2VarR.A() == 0) {
                    gm0.Y(hy2.class.getName(), "Try update chat description or title with charServerId == 0");
                    ((iv4) this.E.getValue()).a("ONEME-18920", new IllegalArgumentException("Try update chat description or title with charServerId == 0. ChatEditProfile"));
                    return Boolean.FALSE;
                }
                xt4 xt4VarB = ((n0c) s()).b();
                dn0 dn0Var = new dn0(kz5Var, this, rt2VarR, null, 19);
                fy2Var.f = 1;
                Object objK0 = yab.K0(xt4VarB, dn0Var, fy2Var);
                hu4 hu4Var = hu4.a;
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        return Boolean.TRUE;
    }

    @Override // defpackage.zz5
    public final void n(int i, String str) {
        kz5 kz5Var;
        mjg mjgVar = this.l;
        if (i == 131072) {
            kz5 kz5Var2 = (kz5) mjgVar.getValue();
            if (kz5Var2 == null) {
                return;
            }
            mjgVar.j(null, kz5.c(kz5Var2, str, null, null, null, 231));
            return;
        }
        if (i != 4 || (kz5Var = (kz5) mjgVar.getValue()) == null) {
            return;
        }
        mjgVar.j(null, kz5.c(kz5Var, null, null, str, null, 223));
    }

    public final rt2 r() {
        return (rt2) ((xn3) this.t.getValue()).k(this.p).a.getValue();
    }

    public final xhh s() {
        return (xhh) this.w.getValue();
    }

    public final void t() {
        sgg sggVarI0 = yab.i0(this.a, null, 2, new ay2(this, null), 1);
        this.L.B(this, Q[5], sggVarI0);
    }
}
