package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.vk.push.core.feature.FeatureManagerImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.channels.AsynchronousChannelGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import one.me.chats.tab.ChatsTabWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class jd3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd3(List list, ij4 ij4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 17;
        this.h = list;
        this.i = ij4Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0105 A[PHI: r23
  0x0105: PHI (r23v3 int) = (r23v2 int), (r23v2 int), (r23v5 int) binds: [B:47:0x0122, B:56:0x0145, B:43:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0183, code lost:
    
        if (r1.emit(r2, r22) == r6) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object A(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd3.A(java.lang.Object):java.lang.Object");
    }

    private final Object B(Object obj) {
        ea6 ea6Var = (ea6) this.h;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                ea6Var.j = true;
                ifh ifhVar = a96.a;
                String strA = a96.a((String) this.i);
                if (!cqk.x(gu4Var)) {
                    ea6Var.j = false;
                    return sbiVar;
                }
                xb9 xb9Var = (xb9) ((et3) ea6Var.c.getValue());
                boolean zD = cqk.d(xb9Var.d.getString("app.pin_" + xb9Var.t(), null), strA);
                ic6 ic6Var = ea6Var.f;
                if (!zD) {
                    a8j.x(ic6Var, ga6.b);
                    ea6Var.j = false;
                    return sbiVar;
                }
                a8j.x(ic6Var, ga6.a);
                this.g = gu4Var;
                this.f = 1;
                Object objT = rx8.t(1000L, this);
                hu4 hu4Var = hu4.a;
                if (objT == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            if (cqk.x(gu4Var)) {
                a8j.x(ea6Var.g, sbiVar);
            }
            ea6Var.j = false;
            return sbiVar;
        } catch (Throwable th) {
            ea6Var.j = false;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:17:0x0046, B:20:0x0052, B:25:0x005d, B:27:0x0063, B:30:0x006c), top: B:35:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #0 {all -> 0x005b, blocks: (B:17:0x0046, B:20:0x0052, B:25:0x005d, B:27:0x0063, B:30:0x006c), top: B:35:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:17:0x0046, B:20:0x0052, B:25:0x005d, B:27:0x0063, B:30:0x006c), top: B:35:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:17:0x0046, B:20:0x0052, B:25:0x005d, B:27:0x0063, B:30:0x006c), top: B:35:0x0046 }] */
    private final Object l(Object obj) {
        nd4 nd4Var;
        l9b l9bVar;
        wme wmeVar;
        String str;
        int i;
        sbi sbiVar;
        int i2 = this.f;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            this.f = 1;
            if (rx8.t(10000L, this) != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nd4Var = (nd4) this.h;
            l9bVar = (l9b) this.g;
            ch3.d0(obj);
        }
        try {
            nd4Var.e = null;
            wmeVar = nd4Var.g;
            str = nd4Var.c;
            i = nd4Var.f;
            sbiVar = sbi.a;
            if (i > 0) {
                gm0.n(str, "Skip group release as it is still in use");
                return sbiVar;
            }
            if (!wmeVar.d()) {
                gm0.n(str, "Skip group release as it is already released");
                return sbiVar;
            }
            ((AsynchronousChannelGroup) wmeVar.getValue()).shutdown();
            wmeVar.a();
            gm0.n(str, "Channel group is released successfully");
            return sbiVar;
        } finally {
            l9bVar.g(null);
        }
        nd4Var = (nd4) this.i;
        l9b l9bVar2 = nd4Var.d;
        this.g = l9bVar2;
        this.h = nd4Var;
        this.f = 2;
        if (l9bVar2.b(this) != hu4Var) {
            l9bVar = l9bVar2;
            nd4Var.e = null;
            wmeVar = nd4Var.g;
            str = nd4Var.c;
            i = nd4Var.f;
            sbiVar = sbi.a;
            if (i > 0) {
                gm0.n(str, "Skip group release as it is still in use");
                return sbiVar;
            }
            if (!wmeVar.d()) {
                gm0.n(str, "Skip group release as it is already released");
                return sbiVar;
            }
            ((AsynchronousChannelGroup) wmeVar.getValue()).shutdown();
            wmeVar.a();
            gm0.n(str, "Channel group is released successfully");
            return sbiVar;
        }
        return hu4Var;
    }

    private final Object n(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jz jzVar = (jz) this.h;
            iv2 iv2Var = new iv2(yx6Var, (fh4) this.i, 3);
            this.g = null;
            this.f = 1;
            Object objCollect = jzVar.collect(iv2Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object o(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jz jzVar = (jz) this.h;
            iv2 iv2Var = new iv2(yx6Var, (xh4) this.i, 4);
            this.g = null;
            this.f = 1;
            Object objCollect = jzVar.collect(iv2Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object p(Object obj) {
        vi4 vi4Var = (vi4) this.i;
        gu4 gu4Var = (gu4) this.h;
        int i = this.f;
        sbi sbiVar = sbi.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                if (!vi4Var.E.get()) {
                    return sbiVar;
                }
                jm7 jm7Var = (jm7) vi4Var.D.getValue();
                this.h = gu4Var;
                this.g = vi4Var;
                this.f = 1;
                obj = jm7Var.a(this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vi4Var = (vi4) this.g;
                ch3.d0(obj);
            }
            vi4.q(vi4Var, ((cje) obj).c);
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            qv1.t(gu4Var, "Failed to get profile delete time", th);
            return sbiVar;
        }
    }

    private final Object q(Object obj) {
        Iterator it;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            it = ((List) this.h).iterator();
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.g;
            ch3.d0(obj);
        }
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            pzf pzfVar = ((ij4) this.i).c;
            bj4 bj4Var = new bj4(jLongValue);
            this.g = it;
            this.f = 1;
            Object objEmit = pzfVar.emit(bj4Var, this);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (defpackage.yab.K0(r10, r0, r9) == r5) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.i
            yk4 r0 = (defpackage.yk4) r0
            int r1 = r9.f
            r2 = 1
            r3 = 2
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L28
            if (r1 == r2) goto L1c
            if (r1 != r3) goto L16
            defpackage.ch3.d0(r10)
            goto L88
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r4
        L1c:
            java.lang.Object r1 = r9.h
            ic6 r1 = (defpackage.ic6) r1
            java.lang.Object r2 = r9.g
            yk4 r2 = (defpackage.yk4) r2
            defpackage.ch3.d0(r10)
            goto L57
        L28:
            defpackage.ch3.d0(r10)
            ic6 r1 = r0.A
            ny8 r10 = r0.m
            java.lang.Object r10 = r10.getValue()
            im7 r10 = (defpackage.im7) r10
            a0e r6 = new a0e
            ny8 r7 = r0.n
            java.lang.Object r7 = r7.getValue()
            et3 r7 = (defpackage.et3) r7
            s7f r7 = (defpackage.s7f) r7
            long r7 = r7.t()
            r6.<init>(r7)
            r9.g = r0
            r9.h = r1
            r9.f = r2
            r7 = 0
            java.lang.Object r10 = r10.b(r6, r2, r7, r9)
            if (r10 != r5) goto L56
            goto L87
        L56:
            r2 = r0
        L57:
            szd r10 = (defpackage.szd) r10
            if (r10 == 0) goto L5e
            android.net.Uri r10 = r10.a
            goto L5f
        L5e:
            r10 = r4
        L5f:
            g2g r6 = new g2g
            r6.<init>(r10)
            zv8[] r10 = defpackage.yk4.G
            r2.getClass()
            defpackage.a8j.x(r1, r6)
            xhh r10 = r0.E()
            n0c r10 = (defpackage.n0c) r10
            xt4 r10 = r10.a()
            th2 r0 = new th2
            r0.<init>(r3, r4, r3)
            r9.g = r4
            r9.h = r4
            r9.f = r3
            java.lang.Object r9 = defpackage.yab.K0(r10, r0, r9)
            if (r9 != r5) goto L88
        L87:
            return r5
        L88:
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd3.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = (ArrayList) this.g;
            ch3.d0(obj);
            return arrayList;
        }
        ch3.d0(obj);
        ArrayList arrayList2 = new ArrayList(((bi4) ((g85) this.h).a).h());
        mm4 mm4Var = (mm4) ((ny8) this.i).getValue();
        this.g = arrayList2;
        this.f = 1;
        Object objK0 = yab.K0((xt4) mm4Var.c.getValue(), new qh4(mm4Var, arrayList2, null, 3), this);
        Object obj2 = hu4.a;
        if (objK0 != obj2) {
            objK0 = sbi.a;
        }
        return objK0 == obj2 ? obj2 : arrayList2;
    }

    private final Object t(Object obj) throws FileNotFoundException {
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            if (((Uri) this.g) == null || ((File) this.h).exists()) {
                String str = ((xw4) this.i).a;
                Uri uri = (Uri) this.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.s("copyUriToFile: uri exists ", uri != null), null);
                    }
                }
            } else {
                InputStream inputStreamOpenInputStream = ((Context) ((xw4) this.i).d.getValue()).getContentResolver().openInputStream((Uri) this.g);
                if (inputStreamOpenInputStream != null) {
                    File file = (File) this.h;
                    ku6 ku6Var = ku6.b;
                    this.f = 1;
                    if (ku6Var.u(file, inputStreamOpenInputStream, this) == hu4Var) {
                        return hu4Var;
                    }
                }
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object u(Object obj) throws Throwable {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        xf5 xf5VarL = fg5.m((fg5) this.g).l((Map) this.h, (s94) this.i);
        this.f = 1;
        Object objP = ((i64) xf5VarL).p(this);
        hu4 hu4Var = hu4.a;
        return objP == hu4Var ? hu4Var : objP;
    }

    private final Object v(Object obj) throws Throwable {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        xf5 xf5VarH = fg5.m((fg5) this.g).h((jc2) this.h, (Map) this.i);
        this.f = 1;
        Object objP = ((i64) xf5VarH).p(this);
        hu4 hu4Var = hu4.a;
        return objP == hu4Var ? hu4Var : objP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.emit((defpackage.a3j) r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object w(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.g
            yx6 r0 = (defpackage.yx6) r0
            int r1 = r6.f
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.ch3.d0(r7)
            goto L4a
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r2
        L1b:
            defpackage.ch3.d0(r7)
            goto L3d
        L1f:
            defpackage.ch3.d0(r7)
            java.lang.Object r7 = r6.h
            ru.ok.tamtam.upload.workers.DownloadAttachesWorker r7 = (ru.ok.tamtam.upload.workers.DownloadAttachesWorker) r7
            ny8 r7 = r7.q
            java.lang.Object r7 = r7.getValue()
            pvb r7 = (defpackage.pvb) r7
            java.lang.Object r1 = r6.i
            lrg r1 = (defpackage.lrg) r1
            r6.g = r0
            r6.f = r4
            java.lang.Object r7 = r7.D(r1, r6)
            if (r7 != r5) goto L3d
            goto L49
        L3d:
            a3j r7 = (defpackage.a3j) r7
            r6.g = r2
            r6.f = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L4a
        L49:
            return r5
        L4a:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd3.w(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj) {
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            iz5 iz5Var = (iz5) this.i;
            Uri uri = ((wy5) this.g).a;
            Uri uri2 = (Uri) this.h;
            this.f = 1;
            Object objC = iz5.C(iz5Var, uri, uri2, this);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object y(Object obj) {
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            iz5 iz5Var = (iz5) this.i;
            Uri uri = ((yy5) this.g).a;
            Uri uri2 = (Uri) this.h;
            this.f = 1;
            Object objC = iz5.C(iz5Var, uri, uri2, this);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object z(Object obj) {
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            pzf pzfVar = ((iz5) this.g).z;
            zv9 zv9Var = new zv9(((Uri) this.h).toString(), (String) this.i);
            this.f = 1;
            Object objEmit = pzfVar.emit(zv9Var, this);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new jd3((xd3) this.g, (Long) this.h, (Long) obj2, lq4Var, 0);
            case 1:
                jd3 jd3Var = new jd3((jz) obj2, lq4Var, (xd3) this.g);
                jd3Var.h = obj;
                return jd3Var;
            case 2:
                return new jd3((fk3) this.h, (y8f) obj2, lq4Var, 2);
            case 3:
                jd3 jd3Var2 = new jd3((ArrayList) this.h, (fk3) obj2, lq4Var, 3);
                jd3Var2.g = obj;
                return jd3Var2;
            case 4:
                jd3 jd3Var3 = new jd3((rl3) this.h, (String) obj2, lq4Var, 4);
                jd3Var3.g = obj;
                return jd3Var3;
            case 5:
                return new jd3((rl3) obj2, lq4Var, 5);
            case 6:
                return new jd3((ChatsTabWidget) this.g, (owb) this.h, (View) obj2, lq4Var, 6);
            case 7:
                return new jd3((CollectDeviceIdErrorsUseCase) obj2, lq4Var, 7);
            case 8:
                return new jd3((my3) this.h, (i3b) obj2, lq4Var, 8);
            case 9:
                return new jd3((ty3) this.h, (p3b) obj2, lq4Var, 9);
            case 10:
                return new jd3((mz3) this.h, (yhh) obj2, lq4Var, 10);
            case 11:
                jd3 jd3Var4 = new jd3((tz3) obj2, lq4Var, 11);
                jd3Var4.h = obj;
                return jd3Var4;
            case 12:
                jd3 jd3Var5 = new jd3((String) this.h, (vb4) obj2, lq4Var, 12);
                jd3Var5.g = obj;
                return jd3Var5;
            case 13:
                return new jd3((nd4) obj2, lq4Var, 13);
            case 14:
                jd3 jd3Var6 = new jd3((jz) this.h, lq4Var, (fh4) obj2, 14);
                jd3Var6.g = obj;
                return jd3Var6;
            case 15:
                jd3 jd3Var7 = new jd3((jz) this.h, lq4Var, (xh4) obj2, 15);
                jd3Var7.g = obj;
                return jd3Var7;
            case 16:
                jd3 jd3Var8 = new jd3((vi4) obj2, lq4Var, 16);
                jd3Var8.h = obj;
                return jd3Var8;
            case 17:
                return new jd3((List) this.h, (ij4) obj2, lq4Var);
            case 18:
                return new jd3((yk4) obj2, lq4Var, 18);
            case 19:
                return new jd3((g85) this.h, (ny8) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new jd3((Uri) this.g, (File) this.h, (xw4) obj2, lq4Var, 20);
            case 21:
                return new jd3((fg5) this.g, lq4Var, (Map) this.h, (s94) obj2, 21);
            case 22:
                return new jd3((fg5) this.g, lq4Var, (jc2) this.h, (Map) obj2, 22);
            case 23:
                jd3 jd3Var9 = new jd3((DownloadAttachesWorker) this.h, (lrg) obj2, lq4Var, 23);
                jd3Var9.g = obj;
                return jd3Var9;
            case 24:
                return new jd3((wy5) this.g, (Uri) this.h, (iz5) obj2, lq4Var, 24);
            case 25:
                return new jd3((yy5) this.g, (Uri) this.h, (iz5) obj2, lq4Var, 25);
            case 26:
                return new jd3((iz5) this.g, (Uri) this.h, (String) obj2, lq4Var, 26);
            case 27:
                jd3 jd3Var10 = new jd3((d66) obj2, lq4Var, 27);
                jd3Var10.h = obj;
                return jd3Var10;
            case 28:
                jd3 jd3Var11 = new jd3((ea6) this.h, (String) obj2, lq4Var, 28);
                jd3Var11.g = obj;
                return jd3Var11;
            default:
                return new jd3((FeatureManagerImpl) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((jd3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((jd3) create((l49) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((jd3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((jd3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((jd3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((jd3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((jd3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((jd3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:105:0x020b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0227  */
    /* JADX WARN: Code duplicated, block: B:111:0x0234 A[PHI: r3
  0x0234: PHI (r3v154 ylc) = (r3v150 ylc), (r3v160 ylc) binds: [B:109:0x0231, B:92:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0270  */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:144:0x0312 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0315  */
    /* JADX WARN: Code duplicated, block: B:149:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x032d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0355  */
    /* JADX WARN: Code duplicated, block: B:158:0x0359  */
    /* JADX WARN: Code duplicated, block: B:161:0x035e A[PHI: r2
  0x035e: PHI (r2v106 ky3) = (r2v101 ky3), (r2v108 ky3) binds: [B:159:0x035a, B:127:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x036d  */
    /* JADX WARN: Code duplicated, block: B:167:0x037a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0393  */
    /* JADX WARN: Code duplicated, block: B:174:0x0397  */
    /* JADX WARN: Code duplicated, block: B:177:0x039c A[PHI: r2
  0x039c: PHI (r2v109 ky3) = (r2v106 ky3), (r2v113 ky3) binds: [B:175:0x0398, B:126:0x0297] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:179:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:194:0x0409  */
    /* JADX WARN: Code duplicated, block: B:197:0x040e  */
    /* JADX WARN: Code duplicated, block: B:201:0x041e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0423  */
    /* JADX WARN: Code duplicated, block: B:212:0x0441  */
    /* JADX WARN: Code duplicated, block: B:247:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:280:0x0587  */
    /* JADX WARN: Code duplicated, block: B:283:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:286:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:288:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:289:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:291:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:294:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:298:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:301:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:304:0x0608  */
    /* JADX WARN: Code duplicated, block: B:405:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x016d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0275, code lost:
    
        if (r1 == r2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03c3, code lost:
    
        if (defpackage.mz3.w(r1, r22) == r14) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d4, code lost:
    
        if (defpackage.mz3.x(r1, r2, r0, r22) == r14) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0435, code lost:
    
        if (r0 == r14) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x061f, code lost:
    
        if (r2.y(r3, r22) == r1) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0688, code lost:
    
        if (r2.collect(r3, r22) == r1) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x07aa, code lost:
    
        if (defpackage.yab.K0(r0, r2, r22) == r1) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x08be, code lost:
    
        if (defpackage.yab.K0(r1, r3, r22) == r7) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0179, code lost:
    
        if (r2 == r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a1, code lost:
    
        if (defpackage.cqk.k(new defpackage.zj3(r0, null), r22) == r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f0, code lost:
    
        if (r3 == r2) goto L119;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:107:0x0213, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:288:0x05b6, please report this as an issue */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 3178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(jz jzVar, lq4 lq4Var, Object obj, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = jzVar;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(fg5 fg5Var, lq4 lq4Var, Object obj, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = fg5Var;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd3(jz jzVar, lq4 lq4Var, xd3 xd3Var) {
        super(2, lq4Var);
        this.e = 1;
        this.i = jzVar;
        this.g = xd3Var;
    }
}
