package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.a;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class voc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ voc(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    private final Object A(Object obj) {
        bpf bpfVar = (bpf) this.h;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            ra1 ra1Var = new ra1(19, new fz6(((s7f) ((et3) ((l7f) this.g).a.getValue())).u(), new wof(0, null, (ny8) this.i)));
            this.f = 1;
            obj = e9i.N(ra1Var, this);
            if (obj != hu4Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        gjg gjgVarC = bpfVar.g.c(((Number) obj).longValue());
        d90 d90Var = new d90(12, bpfVar);
        this.f = 2;
        Object objCollect = gjgVarC.collect(new iz(d90Var, 24), this);
        if (objCollect != hu4Var) {
            objCollect = sbiVar;
        }
        return objCollect == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (defpackage.yab.K0(r11, r0, r10) == r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object B(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.i
            bpf r0 = (defpackage.bpf) r0
            ny8 r1 = r0.h
            int r2 = r10.f
            r3 = 1
            r4 = 2
            r5 = 0
            hu4 r6 = defpackage.hu4.a
            if (r2 == 0) goto L29
            if (r2 == r3) goto L1d
            if (r2 != r4) goto L17
            defpackage.ch3.d0(r11)
            goto L82
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r10)
            return r5
        L1d:
            java.lang.Object r2 = r10.h
            ic6 r2 = (defpackage.ic6) r2
            java.lang.Object r3 = r10.g
            bpf r3 = (defpackage.bpf) r3
            defpackage.ch3.d0(r11)
            goto L50
        L29:
            defpackage.ch3.d0(r11)
            ic6 r2 = r0.A
            im7 r11 = r0.e
            a0e r7 = new a0e
            java.lang.Object r8 = r1.getValue()
            zed r8 = (defpackage.zed) r8
            xb9 r8 = r8.a
            long r8 = r8.t()
            r7.<init>(r8)
            r10.g = r0
            r10.h = r2
            r10.f = r3
            r8 = 0
            java.lang.Object r11 = r11.b(r7, r3, r8, r10)
            if (r11 != r6) goto L4f
            goto L81
        L4f:
            r3 = r0
        L50:
            szd r11 = (defpackage.szd) r11
            if (r11 == 0) goto L57
            android.net.Uri r11 = r11.a
            goto L58
        L57:
            r11 = r5
        L58:
            htf r7 = new htf
            r7.<init>(r11)
            zv8[] r11 = defpackage.bpf.Y
            r3.getClass()
            defpackage.a8j.x(r2, r7)
            xhh r11 = r0.D()
            n0c r11 = (defpackage.n0c) r11
            xt4 r11 = r11.a()
            th2 r0 = new th2
            r2 = 5
            r0.<init>(r4, r5, r2)
            r10.g = r5
            r10.h = r5
            r10.f = r4
            java.lang.Object r10 = defpackage.yab.K0(r11, r0, r10)
            if (r10 != r6) goto L82
        L81:
            return r6
        L82:
            zv8[] r10 = defpackage.bpf.Y
            java.lang.Object r10 = r1.getValue()
            zed r10 = (defpackage.zed) r10
            xb9 r10 = r10.a
            gvb r11 = r10.X
            zv8[] r0 = defpackage.s7f.j0
            r1 = 46
            r0 = r0[r1]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r11.B(r10, r0, r1)
            sbi r10 = defpackage.sbi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.voc.B(java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jz jzVar = (jz) this.h;
            iv2 iv2Var = new iv2(yx6Var, (dqd) this.i, 8);
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

    private final Object n(Object obj) throws Throwable {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            q0d q0dVar = (q0d) this.h;
            iv2 iv2Var = new iv2(yx6Var, (srd) this.i, 9);
            this.g = null;
            this.f = 1;
            Object objCollect = q0dVar.collect(iv2Var, this);
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
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v8, types: [r66] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private final Object o(Object obj) throws Throwable {
        Object poeVar;
        ArrayList arrayList;
        boolean z;
        ?? r6;
        jtd jtdVar = (jtd) this.i;
        int i = this.f;
        sbi sbiVar = sbi.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                la3 la3Var = (la3) this.h;
                List list = la3Var.c;
                List list2 = la3Var.d;
                if (list != null) {
                    List list3 = list;
                    arrayList = new ArrayList(yw3.W0(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((CharSequence) it.next()).toString());
                    }
                } else {
                    arrayList = null;
                }
                ?? arrayList2 = r66.a;
                ?? r9 = arrayList;
                if (arrayList == null) {
                    r9 = arrayList2;
                }
                List list4 = list2;
                ArrayList arrayList3 = new ArrayList(yw3.W0(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((jl) it2.next()).b);
                }
                if (r9.size() == list2.size()) {
                    z = false;
                    r6 = arrayList2;
                } else if (r9.size() > list2.size() / 2) {
                    arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        String str = (String) obj2;
                        Iterable iterable = (Iterable) r9;
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it3 = iterable.iterator();
                            do {
                                if (it3.hasNext()) {
                                }
                            } while (!cqk.d((String) it3.next(), str));
                        }
                        arrayList2.add(obj2);
                    }
                    z = false;
                    r6 = arrayList2;
                } else {
                    z = true;
                    r6 = r9;
                }
                fe3 fe3Var = (fe3) jtdVar.e.getValue();
                long j = jtdVar.c;
                boolean z2 = !r9.isEmpty() && la3Var.a;
                int i2 = la3Var.b;
                Iterable iterable2 = (Iterable) r6;
                ArrayList arrayList4 = new ArrayList(yw3.W0(iterable2, 10));
                Iterator it4 = iterable2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((String) it4.next()).toString());
                }
                this.g = null;
                this.f = 1;
                Object objK0 = yab.K0(((n0c) ((xhh) fe3Var.d.getValue())).b(), new ee3(fe3Var, j, z2, i2, z, arrayList4, null), this);
                hu4 hu4Var = hu4.a;
                if (objK0 != hu4Var) {
                    objK0 = sbiVar;
                }
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            poeVar = sbiVar;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (!(poeVar instanceof poe)) {
            a8j.x(jtdVar.l, ysd.a);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            r8e r8eVar = jtdVar.m;
            ny8 ny8Var = jtdVar.j;
            rt2 rt2Var = (rt2) r8eVar.a.getValue();
            if (rt2Var != null) {
                CharSequence charSequenceB = (rt2Var.d0() ? new tnh(R.string.channel) : new tnh(R.string.chat)).b((Context) ny8Var.getValue());
                if (charSequenceB != null) {
                    CharSequence charSequenceB2 = (cqk.d(thA.getMessage(), "chat.not.found") ? new vnh(R.string.chat_or_channel_not_found, a.n1(Arrays.copyOf(new Object[]{charSequenceB}, 1))) : cqk.d(thA.getMessage(), "chat.denied") ? new vnh(R.string.chat_or_channel_denied, a.n1(Arrays.copyOf(new Object[]{charSequenceB}, 1))) : new tnh(R.string.snack_network_error_title)).b((Context) ny8Var.getValue());
                    if (charSequenceB2 != null) {
                        a8j.x(jtdVar.l, new xsd(charSequenceB2));
                    }
                }
            }
        }
        return sbiVar;
    }

    private final Object p(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jz jzVar = (jz) this.h;
            iv2 iv2Var = new iv2(yx6Var, (jtd) this.i, 10);
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

    private final Object q(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            sfe sfeVar = new sfe();
            bye byeVar = (bye) this.h;
            f90 f90Var = new f90(sfeVar, yx6Var, this.i, 12);
            this.g = null;
            this.f = 1;
            Object objCollect = byeVar.collect(f90Var, this);
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

    private final Object r(Object obj) {
        String str = (String) this.i;
        dvd dvdVar = (dvd) this.h;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            xx6 xx6VarG = ((c59) dvdVar.t.getValue()).g(str);
            f90 f90Var = new f90(dvdVar, str, gu4Var, 13);
            this.g = null;
            this.f = 1;
            Object objCollect = xx6VarG.collect(f90Var, this);
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

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[Catch: all -> 0x001e, CancellationException -> 0x00bc, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00bc, all -> 0x001e, blocks: (B:6:0x001a, B:15:0x003a, B:17:0x005a, B:18:0x0068), top: B:38:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005a A[Catch: all -> 0x001e, CancellationException -> 0x00bc, TryCatch #2 {CancellationException -> 0x00bc, all -> 0x001e, blocks: (B:6:0x001a, B:15:0x003a, B:17:0x005a, B:18:0x0068), top: B:38:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:22:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object s(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.voc.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
        gu4 gu4Var = (gu4) this.g;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                o0e o0eVar = (o0e) this.h;
                Uri uri = (Uri) this.i;
                vo7 vo7Var = o0eVar.c;
                this.g = gu4Var;
                this.f = 1;
                if (vo7Var.e(uri, this) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String name = gu4Var.getClass().getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.r("analyzeLocalImage error ", th), th);
                }
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r0 == r7) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object u(java.lang.Object r23) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            java.lang.Object r1 = r0.h
            n2e r1 = (defpackage.n2e) r1
            int r2 = r0.f
            sbi r3 = defpackage.sbi.a
            r4 = 0
            r5 = 2
            r6 = 1
            hu4 r7 = defpackage.hu4.a
            if (r2 == 0) goto L2c
            if (r2 == r6) goto L26
            if (r2 != r5) goto L20
            java.lang.Object r0 = r0.g
            android.net.Uri r0 = (android.net.Uri) r0
            defpackage.ch3.d0(r23)
            r2 = r0
            r0 = r23
            goto L6a
        L20:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r4
        L26:
            defpackage.ch3.d0(r23)
            r2 = r23
            goto L52
        L2c:
            defpackage.ch3.d0(r23)
            wze r2 = r1.c
            java.lang.Object r8 = r0.i
            byte[] r8 = (byte[]) r8
            r0.f = r6
            r2.getClass()
            zhb r9 = defpackage.zhb.b
            java.lang.Object r10 = r2.c
            xt4 r10 = (defpackage.xt4) r10
            vt4 r9 = defpackage.lvb.x0(r9, r10)
            dtd r10 = new dtd
            r11 = 12
            r10.<init>(r2, r8, r4, r11)
            java.lang.Object r2 = defpackage.yab.K0(r9, r10, r0)
            if (r2 != r7) goto L52
            goto L69
        L52:
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 != 0) goto L57
            return r3
        L57:
            ny8 r8 = r1.l
            java.lang.Object r8 = r8.getValue()
            rb8 r8 = (defpackage.rb8) r8
            r0.g = r2
            r0.f = r5
            java.lang.Object r0 = r8.f(r2, r0)
            if (r0 != r7) goto L6a
        L69:
            return r7
        L6a:
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L74
            long r7 = r0.longValue()
        L72:
            r11 = r7
            goto L7a
        L74:
            int r0 = r2.hashCode()
            long r7 = (long) r0
            goto L72
        L7a:
            java.lang.String r13 = r2.toString()
            java.lang.String r14 = r2.toString()
            hb9 r9 = new hb9
            r10 = 1
            r15 = 0
            r16 = 0
            java.lang.String r18 = "image/jpeg"
            r19 = 0
            r21 = 0
            r9.<init>(r10, r11, r13, r14, r15, r16, r18, r19, r21)
            boolean r0 = r1.k
            if (r0 != 0) goto L97
            r0 = 0
            goto La0
        L97:
            ib9 r0 = r1.e
            ief r0 = r0.a
            int r0 = r0.w(r9)
            int r0 = r0 - r6
        La0:
            ic6 r2 = r1.p
            c2e r5 = new c2e
            r5.<init>(r9, r0)
            defpackage.a8j.x(r2, r5)
            mjg r0 = r1.m
            r0.getClass()
            x1e r1 = defpackage.x1e.a
            r0.j(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.voc.u(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj) {
        Throwable th;
        a8e a8eVar;
        Set set = (Set) this.g;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                a8e a8eVar2 = (a8e) this.i;
                try {
                    this.g = null;
                    this.h = a8eVar2;
                    this.f = 1;
                    Object objP = a8eVar2.P(set, this);
                    hu4 hu4Var = hu4.a;
                    if (objP == hu4Var) {
                        return hu4Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a8eVar = a8eVar2;
                    gm0.V(a8eVar.getClass().getName(), "getMessageReactionsUseCase fail", th);
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a8eVar = (a8e) this.h;
                try {
                    ch3.d0(obj);
                } catch (Throwable th3) {
                    th = th3;
                    gm0.V(a8eVar.getClass().getName(), "getMessageReactionsUseCase fail", th);
                }
            }
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }

    private final Object w(Object obj) {
        l9b l9bVar;
        t2f t2fVar;
        t2f t2fVar2 = (t2f) this.i;
        Long l = t2fVar2.c;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = t2fVar2.j;
            this.g = l9bVar2;
            this.h = t2fVar2;
            this.f = 1;
            Object objB = l9bVar2.b(this);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
            t2fVar = t2fVar2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t2fVar = (t2f) this.h;
            l9bVar = (l9b) this.g;
            ch3.d0(obj);
        }
        try {
            ArrayList arrayListB = t2f.B(t2fVar);
            l9bVar.g(null);
            p2f p2fVarD = t2f.D(arrayListB, 0, 0, Calendar.getInstance());
            if (l != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(l.longValue());
                int i2 = calendar.get(5);
                int i3 = calendar.get(2);
                int i4 = calendar.get(1);
                int i5 = calendar.get(11);
                int i6 = calendar.get(12);
                Iterator it = arrayListB.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    j45 j45Var = (j45) it.next();
                    if (j45Var.d == i4 && j45Var.c == i3 && j45Var.b == i2) {
                        break;
                    }
                    i7++;
                }
                p2fVarD = t2f.C(t2fVar2, arrayListB, i7 >= 0 ? (j45) arrayListB.get(i7) : (j45) arrayListB.get(0), i5, i6);
            }
            mjg mjgVar = t2fVar2.h;
            x35 x35Var = new x35((j45) p2fVarD.a.get(p2fVarD.d), (zrh) p2fVarD.b.get(p2fVarD.e), (zrh) p2fVarD.c.get(p2fVarD.f));
            mjgVar.getClass();
            mjgVar.j(null, x35Var);
            mjg mjgVar2 = t2fVar2.e;
            mjgVar2.getClass();
            mjgVar2.j(null, p2fVarD);
            return sbi.a;
        } catch (Throwable th) {
            l9bVar.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[RETURN] */
    private final Object x(Object obj) {
        String str = (String) this.h;
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            if (str == null || r5h.X0(str)) {
                j9f j9fVar = new j9f(0, sbiVar, null, r66.a);
                this.g = null;
                this.f = 1;
                if (yx6Var.emit(j9fVar, this) != hu4Var) {
                    return sbiVar;
                }
            } else {
                l8f l8fVar = (l8f) this.i;
                this.g = yx6Var;
                this.f = 2;
                obj = l8f.b(l8fVar, str, this);
                if (obj != hu4Var) {
                }
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
            return sbiVar;
        }
        if (i != 2) {
            if (i == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        List list = (List) obj;
        j9f j9fVar2 = new j9f(list.size(), sbiVar, null, list);
        this.g = null;
        this.f = 3;
        if (yx6Var.emit(j9fVar2, this) == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    private final Object y(Object obj) {
        CharSequence charSequence = (CharSequence) this.h;
        hff hffVar = (hff) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            Long l = (Long) hffVar.d.e.invoke();
            if (l != null) {
                hffVar.D(charSequence, l.longValue());
            } else {
                hb9 hb9Var = (hb9) this.i;
                this.f = 1;
                Object objC = hff.C(hffVar, charSequence, hb9Var, null, this);
                hu4 hu4Var = hu4.a;
                if (objC == hu4Var) {
                    return hu4Var;
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

    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    private final Object z(Object obj) {
        Object objH;
        dkf dkfVar = (dkf) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            njf njfVar = dkfVar.a;
            if (njfVar == null) {
                njfVar = null;
            }
            okh okhVarH = njfVar.h();
            ArrayList arrayList = (ArrayList) this.h;
            this.f = 1;
            if (okhVarH.e(arrayList, this) != hu4Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        njf njfVar2 = dkfVar.a;
        if (njfVar2 == null) {
            njfVar2 = null;
        }
        okh okhVarH2 = njfVar2.h();
        ArrayList arrayList2 = (ArrayList) this.i;
        ArrayList arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((dkf) it.next());
        }
        this.f = 2;
        okhVarH2.getClass();
        if (arrayList3.isEmpty()) {
            objH = sbiVar;
        } else {
            xkh xkhVarB = okhVarH2.c().b();
            objH = ch3.H(this, new wj1(xkhVarB, arrayList3, null, 8), xkhVarB.a);
            if (objH != hu4Var) {
                objH = sbiVar;
            }
            if (objH != hu4Var) {
                objH = sbiVar;
            }
            if (objH != hu4Var) {
                objH = sbiVar;
            }
        }
        return objH == hu4Var ? hu4Var : sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                voc vocVar = new voc((i19) this.h, (ur8) obj2, lq4Var, 0);
                vocVar.g = obj;
                return vocVar;
            case 1:
                voc vocVar2 = new voc((vrc) obj2, lq4Var, 1);
                vocVar2.g = obj;
                return vocVar2;
            case 2:
                return new voc((qvc) this.h, (lvc) obj2, lq4Var, 2);
            case 3:
                return new voc((dxc) this.g, (rt2) this.h, (long[]) obj2, lq4Var, 3);
            case 4:
                voc vocVar3 = new voc((dyc) this.h, (String) obj2, lq4Var, 4);
                vocVar3.g = obj;
                return vocVar3;
            case 5:
                voc vocVar4 = new voc((x70) this.h, (sfe) obj2, lq4Var, 5);
                vocVar4.g = obj;
                return vocVar4;
            case 6:
                voc vocVar5 = new voc((p6d) obj2, lq4Var, 6);
                vocVar5.g = obj;
                return vocVar5;
            case 7:
                return new voc((wfe) this.h, (zad) obj2, lq4Var, 7);
            case 8:
                return new voc((hcd) this.g, (String) this.h, (xre) obj2, lq4Var, 8);
            case 9:
                voc vocVar6 = new voc((r07) this.h, lq4Var, (end) obj2, 9);
                vocVar6.g = obj;
                return vocVar6;
            case 10:
                return new voc((apd) this.g, (String) this.h, (RectF) obj2, lq4Var, 10);
            case 11:
                voc vocVar7 = new voc((dqd) this.h, (rt2) obj2, lq4Var, 11);
                vocVar7.g = obj;
                return vocVar7;
            case 12:
                voc vocVar8 = new voc((jz) this.h, lq4Var, (dqd) obj2, 12);
                vocVar8.g = obj;
                return vocVar8;
            case 13:
                voc vocVar9 = new voc((q0d) this.h, lq4Var, (srd) obj2, 13);
                vocVar9.g = obj;
                return vocVar9;
            case 14:
                voc vocVar10 = new voc((la3) this.h, (jtd) obj2, lq4Var, 14);
                vocVar10.g = obj;
                return vocVar10;
            case 15:
                voc vocVar11 = new voc((jz) this.h, lq4Var, (jtd) obj2, 15);
                vocVar11.g = obj;
                return vocVar11;
            case 16:
                voc vocVar12 = new voc((bye) this.h, lq4Var, (jtd) obj2, 16);
                vocVar12.g = obj;
                return vocVar12;
            case 17:
                voc vocVar13 = new voc((dvd) this.h, (String) obj2, lq4Var, 17);
                vocVar13.g = obj;
                return vocVar13;
            case 18:
                return new voc((dvd) this.g, (String) this.h, (RectF) obj2, lq4Var, 18);
            case 19:
                voc vocVar14 = new voc((js8) obj2, lq4Var, 19);
                vocVar14.g = obj;
                return vocVar14;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                voc vocVar15 = new voc((o0e) this.h, (Uri) obj2, lq4Var, 20);
                vocVar15.g = obj;
                return vocVar15;
            case 21:
                return new voc((n2e) this.h, (byte[]) obj2, lq4Var, 21);
            case 22:
                voc vocVar16 = new voc((a8e) obj2, lq4Var, 22);
                vocVar16.g = obj;
                return vocVar16;
            case 23:
                return new voc((t2f) obj2, lq4Var, 23);
            case 24:
                voc vocVar17 = new voc((String) this.h, (l8f) obj2, lq4Var, 24);
                vocVar17.g = obj;
                return vocVar17;
            case 25:
                return new voc((hff) this.g, (CharSequence) this.h, (hb9) obj2, lq4Var, 25);
            case 26:
                return new voc((dkf) this.g, (ArrayList) this.h, (ArrayList) obj2, lq4Var, 26);
            case 27:
                return new voc((l7f) this.g, (bpf) this.h, (ny8) obj2, lq4Var, 27);
            case 28:
                return new voc((bpf) obj2, lq4Var, 28);
            default:
                return new voc((vxf) this.h, (ShareData) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((voc) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((voc) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((voc) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((voc) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((voc) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((voc) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((voc) create((Set) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((voc) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((voc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x028f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x029a  */
    /* JADX WARN: Code duplicated, block: B:406:0x0820 A[PHI: r0
  0x0820: PHI (r0v49 android.graphics.Bitmap) = (r0v44 android.graphics.Bitmap), (r0v48 android.graphics.Bitmap), (r0v51 android.graphics.Bitmap) binds: [B:421:0x0850, B:417:0x0841, B:405:0x081e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0594, code lost:
    
        if (r1 == r15) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0748, code lost:
    
        if (r1 == r5) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0966, code lost:
    
        if (defpackage.yab.K0(r0, r2, r24) == r6) goto L465;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v20 */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.voc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ voc(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ voc(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ voc(xx6 xx6Var, lq4 lq4Var, a8j a8jVar, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = xx6Var;
        this.i = a8jVar;
    }
}
