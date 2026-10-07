package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import one.me.webapp.domain.storage.BiometryException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rej {
    public final long a;
    public final long b;
    public final gu4 c;
    public final Context d;
    public final r8e e;
    public final iv4 f;
    public final whj g;
    public final String h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final pzf l;
    public final q8e m;
    public final ifh n;
    public final ud7 o;
    public volatile es8 p;

    public rej(long j, long j2, dq4 dq4Var, Context context, r8e r8eVar, iv4 iv4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        StringBuilder sbS = qt4.s(j, "webapp_biom_s_key_", "_");
        sbS.append(j2);
        whj whjVar = new whj(sbS.toString(), true);
        this.a = j;
        this.b = j2;
        this.c = dq4Var;
        this.d = context;
        this.e = r8eVar;
        this.f = iv4Var;
        this.g = whjVar;
        this.h = rej.class.getName();
        this.i = ny8Var;
        this.j = ny8Var2;
        this.k = ny8Var3;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.l = pzfVarB;
        this.m = new q8e(pzfVarB);
        this.n = new ifh(new vbi(20, this));
        this.o = new ud7(dq4Var, new u8h(29, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(rej rejVar, ix0 ix0Var, nq4 nq4Var) {
        jej jejVar;
        if (nq4Var instanceof jej) {
            jejVar = (jej) nq4Var;
            int i = jejVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                jejVar.g = i - Integer.MIN_VALUE;
            } else {
                jejVar = new jej(rejVar, nq4Var);
            }
        } else {
            jejVar = new jej(rejVar, nq4Var);
        }
        Object objK0 = jejVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = jejVar.g;
        lq4 lq4Var = null;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(objK0);
            xt4 xt4VarB = ((n0c) rejVar.e()).b();
            iej iejVar = new iej(rejVar, lq4Var, i3);
            jejVar.d = ix0Var;
            jejVar.g = 1;
            objK0 = yab.K0(xt4VarB, iejVar, jejVar);
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix0Var = jejVar.d;
            ch3.d0(objK0);
        }
        sej sejVar = (sej) objK0;
        boolean zG = rejVar.g();
        boolean z = sejVar.e;
        boolean z2 = sejVar.f;
        String str = sejVar.d;
        ix0Var.a(new ox0(zG, z, z2, !(str == null || str.length() == 0)));
        rejVar.p = null;
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
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
    public static final Object b(rej rejVar, jx0 jx0Var, cx0 cx0Var, nq4 nq4Var) {
        lej lejVar;
        Cipher cipher;
        whj whjVar = rejVar.g;
        if (nq4Var instanceof lej) {
            lejVar = (lej) nq4Var;
            int i = lejVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lejVar.h = i - Integer.MIN_VALUE;
            } else {
                lejVar = new lej(rejVar, nq4Var);
            }
        } else {
            lejVar = new lej(rejVar, nq4Var);
        }
        Object objK0 = lejVar.f;
        int i2 = lejVar.h;
        sbi sbiVar = sbi.a;
        int i3 = 1;
        byte b = 0;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objK0);
            xt4 xt4VarB = ((n0c) rejVar.e()).b();
            gej gejVar = new gej(rejVar, b == true ? 1 : 0, i3);
            lejVar.d = jx0Var;
            lejVar.e = cx0Var;
            lejVar.h = 1;
            objK0 = yab.K0(xt4VarB, gejVar, lejVar);
            if (objK0 != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objK0);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cx0Var = lejVar.e;
        jx0Var = lejVar.d;
        ch3.d0(objK0);
        sej sejVar = (sej) objK0;
        String str = sejVar != null ? sejVar.d : null;
        if (sejVar == null || str == null || str.length() == 0) {
            jx0Var.b(new yej());
            return sbiVar;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (cx0Var != null) {
                cipher = cx0Var.b;
            } else {
                cipher = null;
            }
            if (!whjVar.a(true, str, cipher)) {
                gm0.Y(rejVar.h, "Fail check key when we try auth. Clear token and send token not found.");
                lejVar.d = null;
                lejVar.e = null;
                lejVar.h = 2;
                if (rejVar.d(jx0Var, lejVar) == obj) {
                    return obj;
                }
                return sbiVar;
            }
        } else {
            if ((cx0Var != null ? cx0Var.b : null) == null) {
                if (cx0Var != null) {
                    cipher = cx0Var.b;
                } else {
                    cipher = null;
                }
                if (!whjVar.a(true, str, cipher)) {
                    gm0.Y(rejVar.h, "Fail check key when we try auth. Clear token and send token not found.");
                    lejVar.d = null;
                    lejVar.e = null;
                    lejVar.h = 2;
                    if (rejVar.d(jx0Var, lejVar) == obj) {
                        return obj;
                    }
                    return sbiVar;
                }
            }
        }
        jx0Var.a(whjVar.d(str, cx0Var != null ? cx0Var.b : null));
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object c(rej rejVar, mx0 mx0Var, cx0 cx0Var, nq4 nq4Var) {
        qej qejVar;
        Serializable poeVar;
        Serializable serializable;
        Throwable thA;
        whj whjVar = rejVar.g;
        String str = rejVar.h;
        if (nq4Var instanceof qej) {
            qejVar = (qej) nq4Var;
            int i = qejVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qejVar.h = i - Integer.MIN_VALUE;
            } else {
                qejVar = new qej(rejVar, nq4Var);
            }
        } else {
            qejVar = new qej(rejVar, nq4Var);
        }
        Object obj = qejVar.f;
        int i2 = qejVar.h;
        sbi sbiVar = sbi.a;
        Cipher cipher = null;
        if (i2 == 0) {
            ch3.d0(obj);
            String str2 = mx0Var.d;
            if (str2 == null) {
                return sbiVar;
            }
            if ((cx0Var != null ? cx0Var.b : null) == null && !whjVar.a((6 & 1) == 0, null, null)) {
                gm0.Y(str, "Fail check key when we try update token after biometry.");
            }
            if (cx0Var != null) {
                try {
                    cipher = cx0Var.b;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
            }
            poeVar = whjVar.e(str2, cipher);
            if (!(poeVar instanceof poe)) {
                xdj xdjVarF = rejVar.f();
                long j = rejVar.a;
                long j2 = rejVar.b;
                qejVar.d = mx0Var;
                qejVar.e = poeVar;
                qejVar.h = 1;
                Object objI = ch3.I(qejVar, xdjVarF.a, false, true, new mka((String) poeVar, j, j2));
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
                serializable = poeVar;
            }
            thA = roe.a(poeVar);
            if (thA != null) {
                return sbiVar;
            }
            BiometryException biometryException = new BiometryException("Fail update token after success biometry", thA);
            gm0.V(str, biometryException.getMessage(), biometryException);
            mx0Var.b(new tej());
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        serializable = qejVar.e;
        mx0Var = qejVar.d;
        ch3.d0(obj);
        mx0Var.a(sbiVar);
        poeVar = serializable;
        thA = roe.a(poeVar);
        if (thA != null) {
            return sbiVar;
        }
        BiometryException biometryException2 = new BiometryException("Fail update token after success biometry", thA);
        gm0.V(str, biometryException2.getMessage(), biometryException2);
        mx0Var.b(new tej());
        return sbiVar;
    }

    public static String h(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str.length() > 128 ? r5h.u1(np0.m, str) : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(es8 es8Var, nq4 nq4Var) {
        fej fejVar;
        if (nq4Var instanceof fej) {
            fejVar = (fej) nq4Var;
            int i = fejVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fejVar.g = i - Integer.MIN_VALUE;
            } else {
                fejVar = new fej(this, nq4Var);
            }
        } else {
            fejVar = new fej(this, nq4Var);
        }
        Object obj = fejVar.e;
        int i2 = fejVar.g;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(obj);
            xt4 xt4VarB = ((n0c) e()).b();
            gej gejVar = new gej(this, lq4Var, 0);
            fejVar.d = es8Var;
            fejVar.g = 1;
            Object objK0 = yab.K0(xt4VarB, gejVar, fejVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            es8Var = fejVar.d;
            ch3.d0(obj);
        }
        es8Var.b(new yej());
        return sbi.a;
    }

    public final xhh e() {
        return (xhh) this.j.getValue();
    }

    public final xdj f() {
        return (xdj) this.i.getValue();
    }

    public final boolean g() {
        Object poeVar;
        try {
            int iY = new dc9(new ax0(this.d, 0)).y(15);
            String str = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Biometry status: " + iY + ", isDeviceSecure:" + ((KeyguardManager) this.n.getValue()).isDeviceSecure(), null);
                }
            }
            poeVar = Boolean.valueOf(iY == 0);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        boolean z = poeVar instanceof poe;
        if (z) {
            gm0.V(this.h, "Fail when try get biometry status from system", new dej(roe.a(poeVar)));
        }
        Boolean bool = Boolean.FALSE;
        if (z) {
            poeVar = bool;
        }
        return ((Boolean) poeVar).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (k(r1, r4) == r12) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (l(r1, r4) == r12) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0158, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.nx0 r20, java.lang.String r21, defpackage.lq4 r22) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rej.i(nx0, java.lang.String, lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j(lx0 lx0Var, nq4 nq4Var) {
        mej mejVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof mej) {
            mejVar = (mej) nq4Var;
            int i = mejVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mejVar.g = i - Integer.MIN_VALUE;
            } else {
                mejVar = new mej(this, nq4Var);
            }
        } else {
            mejVar = new mej(this, nq4Var);
        }
        Object objK0 = mejVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = mejVar.g;
        int i3 = 2;
        int i4 = 1;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            if (!g()) {
                lx0Var.b(new vej(true));
                return sbiVar;
            }
            xt4 xt4VarB = ((n0c) e()).b();
            gej gejVar = new gej(this, lq4Var, i3);
            mejVar.d = lx0Var;
            mejVar.g = 1;
            objK0 = yab.K0(xt4VarB, gejVar, mejVar);
            if (objK0 != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objK0);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lx0Var = mejVar.d;
        ch3.d0(objK0);
        sej sejVar = (sej) objK0;
        if (sejVar == null) {
            lx0Var.b(new vej(true));
            return sbiVar;
        }
        if (sejVar.e && sejVar.f) {
            lx0Var.b(new wej(ifj.OPEN_SETTINGS));
            return sbiVar;
        }
        es8 es8Var = this.p;
        if (es8Var != null) {
            es8Var.b(new za9());
        }
        this.p = lx0Var;
        tnh tnhVar = new tnh(R.string.web_app_root_biometry_open_settings_dialog_title);
        int i5 = 32;
        List listP0 = xw3.P0(new kc4(i4, new tnh(R.string.go_to_settings), 3, i5), new kc4(i3, new tnh(R.string.web_app_root_biometry_request_dialog_decline), i3, i5));
        pzf pzfVar = this.l;
        bej bejVar = new bej(tnhVar, listP0);
        mejVar.d = null;
        mejVar.g = 2;
        return pzfVar.emit(bejVar, mejVar) == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object k(ix0 ix0Var, nq4 nq4Var) {
        nej nejVar;
        ix0 ix0Var2;
        Object objK0;
        ynh xnhVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof nej) {
            nejVar = (nej) nq4Var;
            int i = nejVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                nejVar.g = i - Integer.MIN_VALUE;
            } else {
                nejVar = new nej(this, nq4Var);
            }
        } else {
            nejVar = new nej(this, nq4Var);
        }
        Object obj = nejVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = nejVar.g;
        int i3 = 2;
        if (i2 == 0) {
            ch3.d0(obj);
            ix0Var2 = ix0Var;
            nejVar.d = ix0Var2;
            nejVar.g = 1;
            objK0 = yab.K0(((n0c) e()).b(), new hej(this, null), nejVar);
            if (objK0 != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix0 ix0Var3 = nejVar.d;
        ch3.d0(obj);
        objK0 = obj;
        ix0Var2 = ix0Var3;
        ox0 ox0Var = (ox0) objK0;
        if (!ox0Var.a) {
            ix0Var2.b(new vej(false));
            return sbiVar;
        }
        if (ox0Var.b && !ox0Var.c) {
            ix0Var2.b(new wej(ifj.REQUEST_ACCESS));
            return sbiVar;
        }
        es8 es8Var = this.p;
        if (es8Var != null) {
            es8Var.b(new za9());
        }
        this.p = ix0Var2;
        tnh tnhVar = new tnh(R.string.web_app_root_biometry_request_dialog_title);
        String str = ix0Var2.d;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            xnhVar = new tnh(R.string.web_app_root_biometry_request_dialog_default_reason);
        } else {
            xnhVar = str.length() > 128 ? new xnh(r5h.u1(np0.m, str)) : new xnh(str);
        }
        List listP0 = xw3.P0(new kc4(1, new tnh(R.string.web_app_root_biometry_request_dialog_accept), 3, true, 3, 3), new kc4(i3, new tnh(R.string.web_app_root_biometry_request_dialog_decline), i3, 32));
        pzf pzfVar = this.l;
        aej aejVar = new aej(tnhVar, xnhVar, listP0);
        nejVar.d = null;
        nejVar.g = 2;
        return pzfVar.emit(aejVar, nejVar) == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        if (r3.emit(r5, r1) == r2) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.jx0 r11, defpackage.nq4 r12) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rej.l(jx0, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015c, code lost:
    
        if (defpackage.yab.K0(r11, r3, r1) == r2) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.mx0 r10, defpackage.nq4 r11) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rej.m(mx0, nq4):java.lang.Object");
    }

    public final boolean n(String str, String str2) {
        boolean zD = str != null ? cqk.d(str2, str) : false;
        if (!zD) {
            this.f.a(null, new eej(str == null || str.length() == 0, this.b));
        }
        return zD;
    }
}
