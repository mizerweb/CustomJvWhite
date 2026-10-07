package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.a;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gvf extends a8j {
    public static final /* synthetic */ zv8[] C = {new z8b(gvf.class, "updateHowSeeOnlineJob", "getUpdateHowSeeOnlineJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, gvf.class, "updateWhoCanCallJob", "getUpdateWhoCanCallJob()Lkotlinx/coroutines/Job;"), new z8b(gvf.class, "updateWhoCanAddToChatJob", "getUpdateWhoCanAddToChatJob()Lkotlinx/coroutines/Job;"), new z8b(gvf.class, "searchByPhoneJob", "getSearchByPhoneJob()Lkotlinx/coroutines/Job;"), new z8b(gvf.class, "updateContentLevelAccessJob", "getUpdateContentLevelAccessJob()Lkotlinx/coroutines/Job;"), new z8b(gvf.class, "disableSafeModeJob", "getDisableSafeModeJob()Lkotlinx/coroutines/Job;"), new z8b(gvf.class, "updatePhoneNumberPrivacyJob", "getUpdatePhoneNumberPrivacyJob()Lkotlinx/coroutines/Job;")};
    public final q8e A;
    public final ic6 B;
    public final xhh c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final mjg o;
    public final r8e p;
    public final p3c q;
    public final p3c r;
    public final p3c s;
    public final p3c t;
    public final p3c u;
    public final p3c v;
    public final p3c w;
    public final String x;
    public long y;
    public final pzf z;

    public gvf(xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, da4 da4Var, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11) {
        this.c = xhhVar;
        this.d = ny8Var;
        this.e = ny8Var5;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var6;
        this.j = ny8Var7;
        this.k = ny8Var8;
        this.l = ny8Var9;
        this.m = ny8Var10;
        this.n = ny8Var11;
        mjg mjgVarA = p90.a(r66.a);
        this.o = mjgVarA;
        this.p = new r8e(mjgVarA);
        this.q = qyj.S();
        this.r = qyj.S();
        this.s = qyj.S();
        this.t = qyj.S();
        this.u = qyj.S();
        this.v = qyj.S();
        this.w = qyj.S();
        this.x = gvf.class.getName();
        pzf pzfVarB = e9i.b(1, Integer.MAX_VALUE, 4);
        this.z = pzfVarB;
        this.A = new q8e(pzfVarB);
        lq4 lq4Var = null;
        this.B = new ic6(null);
        int i = 0;
        int i2 = 3;
        e9i.j0(new fz6(((utd) ny8Var11.getValue()).c(((s7f) F()).t()), new yuf(this, lq4Var, i), i2), this.b);
        e9i.j0(e9i.T(new fz6(new q8e(da4Var.a), new zuf(this, lq4Var, i), i2), ((n0c) xhhVar).a()), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object B(gvf gvfVar, c79 c79Var, nq4 nq4Var) {
        bvf bvfVar;
        List list;
        vjd vjdVar;
        List list2;
        Object obj;
        cje cjeVar;
        long j;
        boolean zContains;
        tnh tnhVar;
        csf csfVar;
        boolean z;
        boolean z2;
        long j2;
        int i;
        int i2;
        chf chfVar;
        xhh xhhVar = gvfVar.c;
        if (nq4Var instanceof bvf) {
            bvfVar = (bvf) nq4Var;
            int i3 = bvfVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bvfVar.h = i3 - Integer.MIN_VALUE;
            } else {
                bvfVar = new bvf(gvfVar, nq4Var);
            }
        } else {
            bvfVar = new bvf(gvfVar, nq4Var);
        }
        Object objK0 = bvfVar.f;
        int i4 = bvfVar.h;
        sbi sbiVar = sbi.a;
        int i5 = 2;
        int i6 = 1;
        lq4 lq4Var = null;
        hu4 hu4Var = hu4.a;
        if (i4 == 0) {
            ch3.d0(objK0);
            if (((CharSequence) ((e5d) gvfVar.h.getValue()).f2.a(e5d.S6[161]).i()).length() == 0) {
                gm0.Y(c79Var.getClass().getName(), "Early return in addSectionTwoFA cuz of pmsProperties.`creation-2fa-config`.value.isEmpty()");
                return sbiVar;
            }
            xt4 xt4VarB = ((n0c) xhhVar).b();
            yuf yufVar = new yuf(gvfVar, lq4Var, i6);
            bvfVar.d = c79Var;
            bvfVar.h = 1;
            objK0 = yab.K0(xt4VarB, yufVar, bvfVar);
            if (objK0 != hu4Var) {
                list = c79Var;
            }
            return hu4Var;
        }
        if (i4 == 1) {
            list = bvfVar.d;
            ch3.d0(objK0);
        } else {
            if (i4 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vjdVar = bvfVar.e;
            list2 = bvfVar.d;
            ch3.d0(objK0);
        }
        obj = ((roe) objK0).a;
        if (obj instanceof poe) {
            obj = null;
        }
        cjeVar = (cje) obj;
        if (cjeVar != null) {
            j = cjeVar.c;
        } else {
            j = 0;
        }
        zContains = vjdVar.c.contains(tsd.SECOND_FACTOR_PASSWORD_ENABLED);
        if (zContains) {
            tnhVar = new tnh(R.string.oneme_settings_privacy_screen_twofa_enabled);
        } else {
            tnhVar = new tnh(R.string.oneme_settings_privacy_screen_twofa_disabled);
        }
        tnh tnhVar2 = tnhVar;
        if (zContains) {
            csfVar = null;
        } else {
            csfVar = csf.a;
        }
        if (zContains || j <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (zContains || vjdVar.c.contains(tsd.SECOND_FACTOR_HAS_EMAIL)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            j2 = x7c.l;
        } else {
            j2 = x7c.k;
        }
        long j3 = j2;
        tnh tnhVar3 = new tnh(R.string.oneme_settings_privacy_screen_twofa_title);
        if (!z2 || z) {
            i = 1;
        } else {
            i = 4;
        }
        i2 = 6;
        bz8 bz8Var = new bz8(R.drawable.icon_key, 0, 6);
        if (z) {
            chfVar = new chf(i2);
        } else {
            chfVar = null;
        }
        list2.add(new raf(i, tnhVar3, 0, j3, null, tnhVar2, fsf.a, bz8Var, csfVar, chfVar, false, 1040));
        if (z) {
            int iA = tca.a(j, gvfVar.F());
            list2.add(new saf(new rnh(R.plurals.oneme_settings_privacy_twofa_delete_user_days_left_notif, iA, a.n1(Arrays.copyOf(new Object[]{new Integer(iA)}, 1))), new chf(7)));
            return sbiVar;
        }
        if (z2) {
            list2.add(new saf(new tnh(R.string.oneme_settings_privacy_screen_twofa_email_warning), null));
        }
        return sbiVar;
        vjd vjdVar2 = (vjd) objK0;
        xt4 xt4VarB2 = ((n0c) xhhVar).b();
        zuf zufVar = new zuf(gvfVar, lq4Var, i5);
        bvfVar.d = list;
        bvfVar.e = vjdVar2;
        bvfVar.h = 2;
        Object objK1 = yab.K0(xt4VarB2, zufVar, bvfVar);
        if (objK1 != hu4Var) {
            vjdVar = vjdVar2;
            objK0 = objK1;
            list2 = list;
            obj = ((roe) objK0).a;
            if (obj instanceof poe) {
                obj = null;
            }
            cjeVar = (cje) obj;
            if (cjeVar != null) {
                j = cjeVar.c;
            } else {
                j = 0;
            }
            zContains = vjdVar.c.contains(tsd.SECOND_FACTOR_PASSWORD_ENABLED);
            if (zContains) {
                tnhVar = new tnh(R.string.oneme_settings_privacy_screen_twofa_enabled);
            } else {
                tnhVar = new tnh(R.string.oneme_settings_privacy_screen_twofa_disabled);
            }
            tnh tnhVar4 = tnhVar;
            if (zContains) {
                csfVar = csf.a;
            } else {
                csfVar = null;
            }
            if (zContains) {
                z = false;
            } else {
                z = false;
            }
            if (zContains) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z) {
                j2 = x7c.l;
            } else {
                j2 = x7c.k;
            }
            long j4 = j2;
            tnh tnhVar5 = new tnh(R.string.oneme_settings_privacy_screen_twofa_title);
            if (z2) {
                i = 1;
            } else {
                i = 1;
            }
            i2 = 6;
            bz8 bz8Var2 = new bz8(R.drawable.icon_key, 0, 6);
            if (z) {
                chfVar = new chf(i2);
            } else {
                chfVar = null;
            }
            list2.add(new raf(i, tnhVar5, 0, j4, null, tnhVar4, fsf.a, bz8Var2, csfVar, chfVar, false, 1040));
            if (z) {
                int iA2 = tca.a(j, gvfVar.F());
                list2.add(new saf(new rnh(R.plurals.oneme_settings_privacy_twofa_delete_user_days_left_notif, iA2, a.n1(Arrays.copyOf(new Object[]{new Integer(iA2)}, 1))), new chf(7)));
                return sbiVar;
            }
            if (z2) {
                list2.add(new saf(new tnh(R.string.oneme_settings_privacy_screen_twofa_email_warning), null));
            }
            return sbiVar;
        }
        return hu4Var;
    }

    public static final void C(gvf gvfVar, Throwable th) {
        tnh tnhVar;
        ynh tnhVar2 = new tnh(R.string.common_error);
        if (th instanceof TamErrorException) {
            dih dihVarA = svl.a(((TamErrorException) th).a);
            if (dihVarA.equals(zhh.a)) {
                tnhVar = new tnh(R.string.common_error_base_retry);
            } else if (dihVarA.equals(aih.a)) {
                tnhVar = new tnh(R.string.common_network_error);
            } else if (dihVarA.equals(bih.a)) {
                tnhVar = new tnh(R.string.common_service_error);
            } else {
                if (!(dihVarA instanceof cih)) {
                    ore.o();
                    return;
                }
                tnhVar2 = new xnh(((cih) dihVarA).a);
            }
            tnhVar2 = tnhVar;
        }
        gvfVar.I(new upf(6, tnhVar2, (Integer) null));
    }

    public static final Object D(gvf gvfVar, mdh mdhVar) {
        Object objK0 = yab.K0(((n0c) gvfVar.c).a(), new je0(gvfVar, null, 9), mdhVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public static tnh G(String str) {
        int i;
        switch (str) {
            case "NOBODY":
            case "_NONE_":
                i = 2;
                break;
            case "CONTACTS":
                i = 4;
                break;
            default:
                i = 1;
                break;
        }
        int i2 = avf.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == 1) {
            return new tnh(R.string.oneme_settings_privacy_access_level_contacts);
        }
        if (i2 == 2 || i2 == 3) {
            return new tnh(R.string.oneme_settings_privacy_access_level_nobody);
        }
        if (i2 == 4) {
            return new tnh(R.string.oneme_settings_privacy_access_level_all);
        }
        ore.o();
        return null;
    }

    public final nni E() {
        return (nni) this.d.getValue();
    }

    public final et3 F() {
        return (et3) this.f.getValue();
    }

    public final boolean H() {
        return ((Number) ((f5d) ((wo6) this.g.getValue())).a.z2.a(e5d.S6[181]).i()).longValue() != 0;
    }

    public final void I(rbb rbbVar) {
        this.z.a(rbbVar);
    }

    public final void J(boolean z) {
        gm0.n(this.x, "updateContentLevelAccess");
        sgg sggVarT = a8j.t(this, null, new dvf(this, z, null), 3);
        this.u.B(this, C[4], sggVarT);
    }

    public final void K(boolean z) {
        gm0.n(this.x, "updateHowSeeOnlineState");
        sgg sggVarT = a8j.t(this, null, new g02(this, z, null, 6), 3);
        this.q.B(this, C[0], sggVarT);
    }

    public final void L(int i) {
        gm0.n(this.x, "updateWhoCanMyPhoneNumber");
        sgg sggVarT = a8j.t(this, null, new evf(this, i, null, 0), 3);
        this.w.B(this, C[6], sggVarT);
    }

    public final void M(int i) {
        gm0.n(this.x, "updateWhoCanSearchMeByPhone");
        sgg sggVarT = a8j.t(this, null, new evf(this, i, null, 1), 3);
        this.t.B(this, C[3], sggVarT);
    }
}
