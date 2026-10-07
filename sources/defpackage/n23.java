package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.work.WorkRequest;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class n23 extends a8j {
    public final Context c;
    public final wo6 d;
    public final xhh e;
    public final vze f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final pzf o;
    public final q8e p;
    public final mjg q;
    public final r8e r;
    public sgg s;
    public final AtomicReference t;
    public volatile String u;
    public final l23 v;

    public n23(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, Context context, wo6 wo6Var, xhh xhhVar, vze vzeVar) {
        this.c = context;
        this.d = wo6Var;
        this.e = xhhVar;
        this.f = vzeVar;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var5;
        this.l = ny8Var6;
        this.m = ny8Var7;
        this.n = ny8Var8;
        pzf pzfVarA = e9i.a(1, Integer.MAX_VALUE, 2);
        this.o = pzfVarA;
        this.p = new q8e(pzfVarA);
        mjg mjgVarA = p90.a(Float.valueOf(0.0f));
        this.q = mjgVarA;
        this.r = new r8e(mjgVarA);
        this.t = new AtomicReference(null);
        this.u = "";
        this.v = new l23(this);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (r9 == r12) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (defpackage.yab.K0(r10, r0, r8) == r12) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.n23 r22, java.lang.String r23, defpackage.d70 r24, defpackage.sfa r25, defpackage.nq4 r26) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n23.B(n23, java.lang.String, d70, sfa, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final Object C(n23 n23Var, e70 e70Var, final dq5 dq5Var, sfa sfaVar, nq4 nq4Var) throws IllegalAccessException, InvocationTargetException {
        m23 m23Var;
        Object obj;
        final j60 j60Var;
        long j;
        Object objH;
        final e70 e70Var2 = e70Var;
        final sfa sfaVar2 = sfaVar;
        pzf pzfVar = n23Var.o;
        if (nq4Var instanceof m23) {
            m23Var = (m23) nq4Var;
            int i = m23Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                m23Var.j = i - Integer.MIN_VALUE;
            } else {
                m23Var = new m23(n23Var, nq4Var);
            }
        } else {
            m23Var = new m23(n23Var, nq4Var);
        }
        m23 m23Var2 = m23Var;
        Object obj2 = m23Var2.h;
        int i2 = m23Var2.j;
        sbi sbiVar = sbi.a;
        Object obj3 = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj2);
            obj = obj3;
            if (sfaVar2.b == 0) {
                H(n23Var, false, 2);
                gm0.Y(n23.class.getName(), "try to load file from local message without server id");
                return sbiVar;
            }
            String str = e70Var2.u;
            if (str != null && str.length() != 0) {
                File file = new File(e70Var2.u);
                if (!file.exists()) {
                    pzfVar.a(new hq5(I(dq5Var, false)));
                    return sbiVar;
                }
                Uri uriFromFile = Uri.fromFile(file);
                if (!uriFromFile.toString().startsWith("content://")) {
                    uriFromFile = ((ju6) ((rs6) n23Var.j.getValue())).i(n23Var.c, u1m.b(uriFromFile));
                }
                pzfVar.a(new iq5(uriFromFile, dq5Var));
                return sbiVar;
            }
            j60Var = e70Var2.j;
            if (j60Var != null) {
                n23Var.t.updateAndGet(new UnaryOperator() { // from class: d23
                    @Override // java.util.function.Function
                    public final Object apply(Object obj4) {
                        return new e23(sfaVar2.a, j60Var.a, e70Var2.t, dq5Var, false);
                    }
                });
                j = sfaVar2.h;
                xn3 xn3Var = (xn3) n23Var.l.getValue();
                m23Var2.d = e70Var2;
                m23Var2.e = sfaVar2;
                m23Var2.f = j60Var;
                m23Var2.g = j;
                m23Var2.j = 1;
                objH = xn3Var.h(j);
                if (objH != obj) {
                }
                return obj;
            }
            return sbiVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj2);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = m23Var2.g;
        j60 j60Var2 = m23Var2.f;
        sfa sfaVar3 = m23Var2.e;
        e70 e70Var3 = m23Var2.d;
        ch3.d0(obj2);
        obj = obj3;
        j60Var = j60Var2;
        sfaVar2 = sfaVar3;
        objH = obj2;
        e70Var2 = e70Var3;
        j = j2;
        rt2 rt2Var = (rt2) objH;
        if (rt2Var != null) {
            if (!rt2Var.b.g()) {
                gm0.Y(n23.class.getName(), "try to load file from chat not synced with server");
                H(n23Var, false, 2);
                return sbiVar;
            }
            String str2 = e70Var2.t;
            long jA = rt2Var.A();
            long j3 = sfaVar2.b;
            m23Var2.d = null;
            m23Var2.e = null;
            m23Var2.f = null;
            m23Var2.g = j;
            m23Var2.j = 2;
            if (n23Var.E(str2, jA, j3, j60Var, m23Var2) == obj) {
                return obj;
            }
        }
        return sbiVar;
    }

    public static /* synthetic */ void H(n23 n23Var, boolean z, int i) throws IllegalAccessException, InvocationTargetException {
        if ((i & 1) != 0) {
            z = false;
        }
        n23Var.G(null, z);
    }

    public static int I(dq5 dq5Var, boolean z) {
        switch (f23.$EnumSwitchMapping$0[dq5Var.ordinal()]) {
            case 1:
                return R.string.media_share_dialog_share_video_fail;
            case 2:
                return R.string.media_share_dialog_share_photo_fail;
            case 3:
                return R.string.media_share_dialog_share_gif_fail;
            case 4:
            case 5:
            case 6:
                return z ? R.string.media_share_dialog_download_media_fail_not_enough_space : R.string.media_share_dialog_download_media_fail;
            case 7:
                return R.string.media_share_dialog_share_file_fail;
            default:
                ore.o();
                return 0;
        }
    }

    public final void D() throws IllegalAccessException, InvocationTargetException {
        xt4 xt4VarB = ((n0c) this.e).b();
        zhb zhbVar = zhb.b;
        xt4VarB.getClass();
        a8j.t(this, lvb.x0(xt4VarB, zhbVar), new m5(this, null, 24), 2);
        sgg sggVar = this.s;
        if (sggVar != null) {
            sggVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object E(String str, long j, long j2, j60 j60Var, nq4 nq4Var) throws IllegalAccessException, InvocationTargetException {
        i23 i23Var;
        String str2;
        long j3;
        long j4;
        Object poeVar;
        sq6 sq6Var;
        xt4 xt4VarD;
        t20 t20Var;
        j60 j60Var2 = j60Var;
        if (nq4Var instanceof i23) {
            i23Var = (i23) nq4Var;
            int i = i23Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                i23Var.j = i - Integer.MIN_VALUE;
            } else {
                i23Var = new i23(this, nq4Var);
            }
        } else {
            i23Var = new i23(this, nq4Var);
        }
        Object objJ0 = i23Var.h;
        int i2 = i23Var.j;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objJ0);
            try {
                qt1 qt1Var = new qt1(this, new wy2(j60Var2.a, j, j2), null, 29);
                str2 = str;
                try {
                    i23Var.d = str2;
                    i23Var.e = j60Var2;
                    j3 = j;
                    try {
                        i23Var.f = j3;
                        j4 = j2;
                        try {
                            i23Var.g = j4;
                            i23Var.j = 1;
                            objJ0 = lvb.J0(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, qt1Var, i23Var);
                            if (objJ0 != hu4Var) {
                                poeVar = (sq6) objJ0;
                                if (poeVar instanceof poe) {
                                    poeVar = null;
                                }
                                sq6Var = (sq6) poeVar;
                                if (sq6Var == null) {
                                    i23Var.d = null;
                                    i23Var.e = null;
                                    i23Var.f = j3;
                                    i23Var.g = j4;
                                    i23Var.j = 2;
                                    this.v.b(i23Var);
                                    if (sbiVar == hu4Var) {
                                        return sbiVar;
                                    }
                                } else {
                                    xt4VarD = ((n0c) this.e).d();
                                    t20Var = new t20(this, j60Var2, sq6Var, str2, (lq4) null, 6);
                                    i23Var.d = null;
                                    i23Var.e = null;
                                    i23Var.f = j3;
                                    i23Var.g = j4;
                                    i23Var.j = 3;
                                    if (yab.K0(xt4VarD, t20Var, i23Var) == hu4Var) {
                                        return sbiVar;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            poeVar = new poe(th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j4 = j2;
                        poeVar = new poe(th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j3 = j;
                    j4 = j2;
                    poeVar = new poe(th);
                    if (poeVar instanceof poe) {
                        poeVar = null;
                    }
                    sq6Var = (sq6) poeVar;
                    if (sq6Var == null) {
                        i23Var.d = null;
                        i23Var.e = null;
                        i23Var.f = j3;
                        i23Var.g = j4;
                        i23Var.j = 2;
                        this.v.b(i23Var);
                        if (sbiVar == hu4Var) {
                            return hu4Var;
                        }
                        return sbiVar;
                    }
                    xt4VarD = ((n0c) this.e).d();
                    t20Var = new t20(this, j60Var2, sq6Var, str2, (lq4) null, 6);
                    i23Var.d = null;
                    i23Var.e = null;
                    i23Var.f = j3;
                    i23Var.g = j4;
                    i23Var.j = 3;
                    if (yab.K0(xt4VarD, t20Var, i23Var) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
            } catch (Throwable th4) {
                th = th4;
                str2 = str;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ch3.d0(objJ0);
                    return sbiVar;
                }
                if (i2 == 3) {
                    ch3.d0(objJ0);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = i23Var.g;
            long j6 = i23Var.f;
            j60Var2 = i23Var.e;
            str2 = i23Var.d;
            try {
                ch3.d0(objJ0);
                j4 = j5;
                j3 = j6;
                poeVar = (sq6) objJ0;
            } catch (Throwable th5) {
                th = th5;
                j4 = j5;
                j3 = j6;
                poeVar = new poe(th);
            }
            if (poeVar instanceof poe) {
                poeVar = null;
            }
            sq6Var = (sq6) poeVar;
            if (sq6Var == null) {
                i23Var.d = null;
                i23Var.e = null;
                i23Var.f = j3;
                i23Var.g = j4;
                i23Var.j = 2;
                this.v.b(i23Var);
                if (sbiVar == hu4Var) {
                    return sbiVar;
                }
            } else {
                xt4VarD = ((n0c) this.e).d();
                t20Var = new t20(this, j60Var2, sq6Var, str2, (lq4) null, 6);
                i23Var.d = null;
                i23Var.e = null;
                i23Var.f = j3;
                i23Var.g = j4;
                i23Var.j = 3;
                if (yab.K0(xt4VarD, t20Var, i23Var) == hu4Var) {
                    return sbiVar;
                }
            }
        }
        return hu4Var;
    }

    public final os5 F() {
        return (os5) this.m.getValue();
    }

    public final void G(String str, boolean z) throws IllegalAccessException, InvocationTargetException {
        e23 e23Var = (e23) this.t.get();
        if (e23Var == null) {
            gm0.Y(n23.class.getName(), "Early return in onDownloadFailed cuz of downloadDataRef.get() is null");
            return;
        }
        qrc.o(F(), z ? ls5.NOT_ENOUGH_SPACE : ls5.INTERRUPTED_UNKNOWN, this.u, null, str, 20);
        D();
        this.o.a(new hq5(I(e23Var.d, z)));
    }
}
