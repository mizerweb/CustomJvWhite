package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.transparent.TransparentWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class p7g extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7g(p0h p0hVar, azg azgVar, Long l, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 8;
        this.g = p0hVar;
        this.i = azgVar;
        this.h = l;
    }

    private final Object l(Object obj) {
        bfi bfiVar = (bfi) this.h;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                pvb pvbVar = (pvb) bfiVar.b.getValue();
                String str = bfiVar.a;
                ini iniVar = new ini();
                iniVar.D = (String) this.i;
                wy2 wy2Var = new wy2(new ia4(null, new lni(iniVar), 23), 20);
                ed6 ed6Var = (ed6) bfiVar.e.getValue();
                this.g = gu4Var;
                this.f = 1;
                obj = cqk.H(pvbVar, wy2Var, str, ed6Var, this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            lni lniVar = ((w94) obj).d;
            if (lniVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ((nni) bfiVar.c.getValue()).q(lniVar);
            return sbi.a;
        } catch (TamErrorException e) {
            gm0.V(gu4Var.getClass().getName(), "updateDoubleTapReactionValueUseCase failed", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        if (r1.emit(r13, r12) == r2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object n(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7g.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        AnimatorSet animatorSet;
        Drawable drawable = (Drawable) this.i;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, "alpha", 255, 0);
            objectAnimatorOfInt.setDuration(300L);
            ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, "alpha", 0, 255);
            objectAnimatorOfInt2.setDuration(300L);
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfInt, objectAnimatorOfInt2);
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            animatorSet = (AnimatorSet) this.h;
            try {
                ch3.d0(obj);
            } catch (Throwable th) {
                animatorSet.cancel();
                throw th;
            }
        }
        while (cqk.x(gu4Var)) {
            animatorSet.cancel();
            animatorSet.start();
            this.g = gu4Var;
            this.h = animatorSet;
            this.f = 1;
            Object objT = rx8.t(1600L, this);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
                return hu4Var;
            }
        }
        animatorSet.cancel();
        return sbi.a;
    }

    private final Object p(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            sfe sfeVar = new sfe();
            xx6 xx6Var = (xx6) this.h;
            f90 f90Var = new f90(sfeVar, yx6Var, this.i, 19);
            this.g = null;
            this.f = 1;
            Object objCollect = xx6Var.collect(f90Var, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [sbi] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [lq4, p7g] */
    /* JADX WARN: Type inference failed for: r8v1, types: [p7g] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final Object q(Object obj) {
        hu4 hu4Var = hu4.a;
        int i = this.f;
        boolean z = false;
        try {
            if (i == 0) {
                ch3.d0(obj);
                i0j i0jVar = (i0j) ((n0j) this.g).d.getValue();
                String str = ((gka) this.h).a.c;
                String path = ((File) this.i).getPath();
                this.f = 1;
                ?? r6 = sbi.a;
                f0j f0jVar = i0jVar.a;
                Object objI = ch3.I(this, f0jVar.a, false, true, new bad(f0jVar, 29, new g0j(str, path, null)));
                this = objI;
                if (objI != hu4Var) {
                    this = r6;
                }
                if (this == hu4Var) {
                    r6 = this;
                }
                if (r6 == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            z = true;
        } catch (Throwable th) {
            String str2 = ((n0j) this.g).f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qv1.k("storePreparation: failed, ", th.getMessage()), th);
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    private final Object r(Object obj) {
        Object poeVar;
        e0j e0jVar;
        je9 je9Var = je9.d;
        hu4 hu4Var = hu4.a;
        d70 d70Var = this.f;
        try {
            if (d70Var == 0) {
                ch3.d0(obj);
                d70 d70Var2 = ((e70) this.h).d;
                if (d70Var2 == null || d70Var2.b != 2) {
                    return Boolean.FALSE;
                }
                rui ruiVarA = ((tui) ((t1j) this.i).a.getValue()).a(((e70) this.h).t);
                t1j t1jVar = (t1j) this.i;
                if (ruiVarA != null) {
                    String str = t1jVar.d;
                    e70 e70Var = (e70) this.h;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, qv1.k("Content already in cache for ", e70Var.t), null);
                    }
                    return Boolean.TRUE;
                }
                e70 e70Var2 = (e70) this.h;
                i0j i0jVar = (i0j) t1jVar.b.getValue();
                String str2 = e70Var2.t;
                this.g = d70Var2;
                this.f = 1;
                poeVar = i0jVar.a(str2, this);
                d70Var = d70Var2;
                if (poeVar == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (d70Var != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d70 d70Var3 = (d70) this.g;
                ch3.d0(obj);
                poeVar = obj;
                d70Var = d70Var3;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        boolean z = poeVar instanceof poe;
        if (z) {
            Throwable thA = roe.a(poeVar);
            String str3 = ((t1j) this.i).d;
            e70 e70Var3 = (e70) this.h;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str3, qv1.k("Failed to get preparation for ", e70Var3.t), thA);
                }
            }
            e0jVar = null;
        } else {
            if (z) {
                poeVar = null;
            }
            e0jVar = (e0j) poeVar;
        }
        if (e0jVar == null || e0jVar.c != null || !ku6.p(e0jVar.a)) {
            String str4 = ((t1j) this.i).d;
            e70 e70Var4 = (e70) this.h;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str4, c0a.o("Preparation not ready for ", e70Var4.t, ", showing preview"), null);
            }
            return Boolean.FALSE;
        }
        String str5 = e0jVar.a;
        int i = d70Var.f;
        int i2 = d70Var.g;
        ((tui) ((t1j) this.i).a.getValue()).b(((e70) this.h).t, new w2b(Collections.singletonList(new v2b(i, str5, i2, 0)), null, 0L, d70Var.c, false, i, i2, 2, null));
        String str6 = ((t1j) this.i).d;
        e70 e70Var5 = (e70) this.h;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            a4cVar4.c(je9Var, str6, qv1.l("Provided content for ", e70Var5.t, " from prepared file: ", str5), null);
        }
        return Boolean.TRUE;
    }

    private final Object s(Object obj) {
        List list = (List) this.h;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            if (list.isEmpty()) {
                return null;
            }
            List list2 = list;
            f2j f2jVar = (f2j) this.i;
            ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(yab.h(gu4Var, null, 0, new jyf(it.next(), (lq4) null, gu4Var, f2jVar), 3));
            }
            this.g = null;
            this.f = 1;
            obj = ch3.c(arrayList, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        List list3 = (List) obj;
        Iterator it2 = list3.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((u84) it2.next()).d;
        }
        return new v84(list3, j, true);
    }

    private final Object t(Object obj) {
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i == 0) {
            ch3.d0(obj);
            VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.g;
            zv8[] zv8VarArr = VideoMessageWidget.B;
            f2j f2jVarY1 = videoMessageWidget.y1();
            int i2 = ((ufe) this.h).a;
            Size size = new Size(i2, i2);
            hgd surfaceProvider = ((cyi) this.i).getSurfaceProvider();
            this.f = 1;
            Object objQ = f2jVarY1.c.q(size, surfaceProvider, this);
            hu4 hu4Var = hu4.a;
            if (objQ != hu4Var) {
                objQ = sbiVar;
            }
            if (objQ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object u(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.g
            yx6 r0 = (defpackage.yx6) r0
            int r1 = r6.f
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            defpackage.ch3.d0(r7)
            goto L44
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.h
            yx6 r0 = (defpackage.yx6) r0
            defpackage.ch3.d0(r7)
            goto L37
        L23:
            defpackage.ch3.d0(r7)
            java.lang.Object r7 = r6.i
            o5j r7 = (defpackage.o5j) r7
            r6.g = r4
            r6.h = r0
            r6.f = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r5) goto L37
            goto L43
        L37:
            r6.g = r4
            r6.h = r4
            r6.f = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L44
        L43:
            return r5
        L44:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7g.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r1.emit(r8, r7) == r6) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object v(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.h
            c8j r0 = (defpackage.c8j) r0
            java.lang.Object r1 = r7.g
            gu4 r1 = (defpackage.gu4) r1
            int r2 = r7.f
            r3 = 2
            r4 = 1
            r5 = 0
            hu4 r6 = defpackage.hu4.a
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            defpackage.ch3.d0(r8)
            goto L63
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r5
        L1f:
            defpackage.ch3.d0(r8)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            goto L63
        L23:
            r8 = move-exception
            goto L50
        L25:
            defpackage.ch3.d0(r8)
            ny8 r8 = r0.b     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            java.lang.Object r8 = r8.getValue()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            wd4 r8 = (defpackage.wd4) r8     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            boolean r8 = r8.h()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            if (r8 == 0) goto L45
            java.lang.Object r8 = r7.i     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            qf7 r8 = (defpackage.qf7) r8     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            r7.g = r5     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            r7.f = r4     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            java.lang.Object r7 = r8.invoke(r1, r7)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            if (r7 != r6) goto L63
            goto L62
        L45:
            ru.ok.tamtam.errors.ConnectionException r8 = new ru.ok.tamtam.errors.ConnectionException     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            thh r1 = new thh     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            r1.<init>()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            r8.<init>(r1)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
            throw r8     // Catch: ru.ok.tamtam.errors.TamErrorException -> L23
        L50:
            pzf r1 = r0.c
            cf7 r0 = r0.a
            java.lang.Object r8 = r0.invoke(r8)
            r7.g = r5
            r7.f = r3
            java.lang.Object r7 = r1.emit(r8, r7)
            if (r7 != r6) goto L63
        L62:
            return r6
        L63:
            sbi r7 = defpackage.sbi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7g.v(java.lang.Object):java.lang.Object");
    }

    private final Object w(Object obj) {
        ifj ifjVar = (ifj) this.i;
        sfj sfjVar = (sfj) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            qs8 qs8Var = sfjVar.a;
            o8h o8hVar = new o8h(n8h.e, ((vfj) this.h).b);
            qs8Var.getClass();
            String strB = qs8Var.b(o8h.Companion.serializer(), o8hVar);
            p41 p41Var = sfjVar.h;
            fs8 fs8Var = new fs8(ifjVar.a, strB, false);
            this.f = 1;
            Object objA = p41Var.a(this, fs8Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        sfj.f(sfjVar, ifjVar.a);
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                p7g p7gVar = new p7g((q7g) this.h, (azg) obj2, lq4Var, 0);
                p7gVar.g = obj;
                return p7gVar;
            case 1:
                return new p7g((xhg) obj2, lq4Var, 1);
            case 2:
                p7g p7gVar2 = new p7g((vng) this.h, (sng) obj2, lq4Var, 2);
                p7gVar2.g = obj;
                return p7gVar2;
            case 3:
                p7g p7gVar3 = new p7g((String) this.h, (vng) obj2, lq4Var, 3);
                p7gVar3.g = obj;
                return p7gVar3;
            case 4:
                p7g p7gVar4 = new p7g((hog) obj2, lq4Var, 4);
                p7gVar4.g = obj;
                return p7gVar4;
            case 5:
                return new p7g((rog) this.g, (Long) this.h, (Long) obj2, lq4Var, 5);
            case 6:
                p7g p7gVar5 = new p7g((tpg) this.h, (omg) obj2, lq4Var, 6);
                p7gVar5.g = obj;
                return p7gVar5;
            case 7:
                return new p7g((dqg) obj2, lq4Var, 7);
            case 8:
                return new p7g((p0h) this.g, (azg) obj2, (Long) this.h, lq4Var);
            case 9:
                p7g p7gVar6 = new p7g((b3h) this.h, (zzg) obj2, lq4Var, 9);
                p7gVar6.g = obj;
                return p7gVar6;
            case 10:
                return new p7g((lx2) this.g, (x9h) this.h, (Context) obj2, lq4Var, 10);
            case 11:
                return new p7g((dfh) this.h, (k8b) obj2, lq4Var, 11);
            case 12:
                return new p7g((TransparentWidget) this.h, (Long) obj2, lq4Var, 12);
            case 13:
                p7g p7gVar7 = new p7g((b7i) this.h, (pk8) obj2, lq4Var, 13);
                p7gVar7.g = obj;
                return p7gVar7;
            case 14:
                return new p7g((edi) this.g, (rt2) this.h, (af7) obj2, lq4Var, 14);
            case 15:
                p7g p7gVar8 = new p7g((vei) this.h, (ArrayList) obj2, lq4Var, 15);
                p7gVar8.g = obj;
                return p7gVar8;
            case 16:
                p7g p7gVar9 = new p7g((bfi) this.h, (String) obj2, lq4Var, 16);
                p7gVar9.g = obj;
                return p7gVar9;
            case 17:
                p7g p7gVar10 = new p7g((AtomicReference) this.h, (zgi) obj2, lq4Var, 17);
                p7gVar10.g = obj;
                return p7gVar10;
            case 18:
                p7g p7gVar11 = new p7g((zui) this.h, (gka) obj2, lq4Var, 18);
                p7gVar11.g = obj;
                return p7gVar11;
            case 19:
                p7g p7gVar12 = new p7g((Drawable) obj2, lq4Var, 19);
                p7gVar12.g = obj;
                return p7gVar12;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                p7g p7gVar13 = new p7g((xx6) this.h, lq4Var, (xzi) obj2);
                p7gVar13.g = obj;
                return p7gVar13;
            case 21:
                return new p7g((n0j) this.g, (gka) this.h, (File) obj2, lq4Var, 21);
            case 22:
                return new p7g((xzi) this.g, (g1j) this.h, (File) obj2, lq4Var, 22);
            case 23:
                return new p7g((e70) this.h, (t1j) obj2, lq4Var, 23);
            case 24:
                p7g p7gVar14 = new p7g((List) this.h, (f2j) obj2, lq4Var, 24);
                p7gVar14.g = obj;
                return p7gVar14;
            case 25:
                return new p7g((VideoMessageWidget) this.g, (ufe) this.h, (cyi) obj2, lq4Var, 25);
            case 26:
                p7g p7gVar15 = new p7g((o5j) obj2, lq4Var, 26);
                p7gVar15.g = obj;
                return p7gVar15;
            case 27:
                p7g p7gVar16 = new p7g((c8j) this.h, (qf7) obj2, lq4Var, 27);
                p7gVar16.g = obj;
                return p7gVar16;
            case 28:
                return new p7g((sfj) this.g, (vfj) this.h, (ifj) obj2, lq4Var, 28);
            default:
                p7g p7gVar17 = new p7g((phj) this.h, (shj) obj2, lq4Var, 29);
                p7gVar17.g = obj;
                return p7gVar17;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((p7g) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((p7g) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((p7g) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((p7g) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((p7g) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((p7g) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((p7g) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((p7g) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((p7g) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0311  */
    /* JADX WARN: Code duplicated, block: B:229:0x054a  */
    /* JADX WARN: Code duplicated, block: B:231:0x054e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0570  */
    /* JADX WARN: Code duplicated, block: B:243:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:246:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:249:0x05d3  */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0338, code lost:
    
        if (defpackage.yab.K0(r3, r4, r5) == r2) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05d4, code lost:
    
        if (r0 == r6) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x07b4, code lost:
    
        if (r1 == r8) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0aa3, code lost:
    
        if (defpackage.yab.K0(r0, r3, r5) == r1) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0b16, code lost:
    
        if (r1.emit(r3, r5) == r2) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0b88, code lost:
    
        if (r0 == r2) goto L474;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v66, types: [int] */
    /* JADX WARN: Type inference failed for: r2v67, types: [dfh] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v76, types: [dfh] */
    /* JADX WARN: Type inference failed for: r2v89 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7g(xx6 xx6Var, lq4 lq4Var, xzi xziVar) {
        super(2, lq4Var);
        this.e = 20;
        this.h = xx6Var;
        this.i = xziVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7g(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7g(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7g(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
