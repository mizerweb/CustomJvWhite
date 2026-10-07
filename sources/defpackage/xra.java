package defpackage;

import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.a;
import one.me.android.notifications.NotificationsImagesProvider;
import one.me.startconversation.StartConversationScreen;
import one.me.stories.core.workers.SaveStoryToGalleryWorker;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xra extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xra(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    private final Object A(Object obj) throws Throwable {
        Object poeVar;
        tnh tnhVar;
        Object objD;
        CharSequence charSequence = (CharSequence) this.g;
        b7i b7iVar = (b7i) this.i;
        String str = b7iVar.f;
        ic6 ic6Var = b7iVar.u;
        mjg mjgVar = b7iVar.o;
        int i = this.f;
        sbi sbiVar = sbi.a;
        try {
            if (i == 0) {
                ch3.d0(obj);
                if (charSequence != null) {
                    zv8[] zv8VarArr = b7i.G;
                    pnh pnhVar = (b7iVar.D().a <= 0 || charSequence.length() >= b7iVar.D().a) ? null : new pnh(R.plurals.oneme_settings_twofa_creation_password_error_symbols_count, b7iVar.D().a);
                    tnh tnhVar2 = !z5h.E0(charSequence, (CharSequence) this.j) ? new tnh(R.string.oneme_settings_twofa_error_passwords_equals) : null;
                    if (pnhVar == null && tnhVar2 == null) {
                        a8j.x(ic6Var, new l7i(true));
                        pvb pvbVar = (pvb) b7iVar.k.getValue();
                        String string = charSequence.toString();
                        vsb vsbVar = new vsb(kfc.y, 18);
                        vsbVar.h("trackId", str);
                        vsbVar.h("password", string);
                        this.h = null;
                        this.f = 1;
                        objD = pvbVar.D(vsbVar, this);
                        hu4 hu4Var = hu4.a;
                        if (objD == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        Object value = mjgVar.getValue();
                        u8i u8iVar = value instanceof u8i ? (u8i) value : null;
                        if (u8iVar != null) {
                            u8i u8iVarC = u8i.c(u8iVar, v8i.a(u8iVar.b, pnhVar), v8i.a(u8iVar.c, tnhVar2), 3);
                            mjgVar.getClass();
                            mjgVar.j(null, u8iVarC);
                        }
                    }
                }
                return sbiVar;
            }
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            objD = obj;
            poeVar = (kih) objD;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (!(poeVar instanceof poe)) {
            u8i u8iVar2 = (u8i) mjgVar.getValue();
            u8i u8iVarC2 = u8i.c(u8iVar2, v8i.a(u8iVar2.b, null), v8i.a(u8iVar2.c, null), 3);
            mjgVar.getClass();
            mjgVar.j(null, u8iVarC2);
            pk8 pk8Var = b7iVar.g;
            a8j.x(b7iVar.v, new p7i(str, pk8Var != null ? pk8.a(pk8Var, charSequence.toString(), null, null, 30) : new pk8(charSequence.toString(), null, null, null, null, 30)));
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(b7iVar.h, "Create password step: can't create password", thA);
            if (thA instanceof CancellationException) {
                throw thA;
            }
            if (thA instanceof TamErrorException) {
                u8i u8iVar3 = (u8i) mjgVar.getValue();
                yhh yhhVar = ((TamErrorException) thA).a;
                if (vzl.d(yhhVar)) {
                    mjgVar.j(null, u8i.c(u8iVar3, v8i.a(u8iVar3.b, vzl.a(yhhVar)), v8i.a(u8iVar3.c, null), 3));
                    a8j.x(ic6Var, new l7i(false));
                } else {
                    a8j.x(ic6Var, new k7i(0, 6, vzl.a(yhhVar)));
                }
            } else {
                Object obj2 = zhh.a;
                if (obj2.equals(obj2)) {
                    tnhVar = new tnh(R.string.common_error_base_retry);
                } else if (obj2.equals(aih.a)) {
                    tnhVar = new tnh(R.string.common_network_error);
                } else {
                    if (!obj2.equals(bih.a)) {
                        ore.o();
                        return null;
                    }
                    tnhVar = new tnh(R.string.common_service_error);
                }
                a8j.x(ic6Var, new k7i(0, 6, tnhVar));
            }
        }
        return sbiVar;
    }

    private final Object B(Object obj) {
        c79 c79VarW;
        k8i k8iVar;
        c79 c79Var;
        k8i k8iVar2 = (k8i) this.j;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            c79VarW = yab.w();
            this.g = k8iVar2;
            this.h = c79VarW;
            this.i = c79VarW;
            this.f = 1;
            Object objB = k8i.B(k8iVar2, c79VarW, this);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            k8iVar = k8iVar2;
            c79Var = c79VarW;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c79VarW = (c79) this.i;
            c79Var = (c79) this.h;
            k8iVar = (k8i) this.g;
            ch3.d0(obj);
        }
        zv8[] zv8VarArr = k8i.o;
        k8iVar.getClass();
        c79VarW.add(new c8i(4, new tnh(R.string.oneme_settings_twofa_disable_password_title), 1, R.id.oneme_settings_twofa_configuration_setting_disable_twofa, null, 32));
        k8iVar2.h.setValue(yab.j(c79Var));
        return sbi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b1, code lost:
    
        if (r0 == r7) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object l(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xra.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0083, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x00a5, please report this as an issue */
    private final Object n(Object obj) {
        lg lgVar;
        jh2 jh2Var;
        String str = (String) this.i;
        int i = this.f;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            ipe ipeVar = (ipe) this.h;
            gc2 gc2Var = (gc2) this.j;
            this.f = 1;
            obj = ipeVar.b(str, gc2Var, new skd(20), this);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
        } else {
            if (i != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lgVar = (lg) this.g;
            ch3.d0(obj);
        }
        jh2Var = (jh2) obj;
        if (jh2Var instanceof oh2) {
            Log.i("CXCP", ((Object) ef2.b(str)) + " opened successfully.");
            return new ll0(((oh2) jh2Var).a, lgVar);
        }
        Log.e("CXCP", "Failed to open " + ((Object) ef2.b(str)) + '!');
        return new ll0(null, null);
        lg lgVar2 = ((nfc) obj).a;
        if (lgVar2 == null) {
            Log.e("CXCP", "Failed to open " + ((Object) ef2.b(str)) + '!');
            return new ll0(null, null);
        }
        mjg mjgVar = lgVar2.u;
        c9 c9Var = new c9(2, null, 17);
        this.g = lgVar2;
        this.f = 2;
        Object objO = e9i.O(mjgVar, c9Var, this);
        if (objO != hu4Var) {
            obj = objO;
            lgVar = lgVar2;
            jh2Var = (jh2) obj;
            if (jh2Var instanceof oh2) {
                Log.i("CXCP", ((Object) ef2.b(str)) + " opened successfully.");
                return new ll0(((oh2) jh2Var).a, lgVar);
            }
            Log.e("CXCP", "Failed to open " + ((Object) ef2.b(str)) + '!');
            return new ll0(null, null);
        }
        return hu4Var;
    }

    private final Object o(Object obj) {
        l9b l9bVar;
        t2f t2fVar;
        t2f t2fVar2 = (t2f) this.i;
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
            x35 x35Var = (x35) this.j;
            t2fVar2.F(t2f.C(t2fVar2, arrayListB, x35Var.a, x35Var.b.a, x35Var.c.a));
            return sbi.a;
        } catch (Throwable th) {
            l9bVar.g(null);
            throw th;
        }
    }

    private final Object p(Object obj) {
        AtomicLong atomicLong;
        bpf bpfVar = (bpf) this.i;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            RectF rectF = (RectF) this.h;
            r60 r60Var = new r60(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
            AtomicLong atomicLong2 = bpfVar.G;
            pvb pvbVar = (pvb) bpfVar.m.getValue();
            String str = (String) this.j;
            this.g = atomicLong2;
            this.f = 1;
            Object objZ = pvbVar.z(str, r60Var, this);
            hu4 hu4Var = hu4.a;
            if (objZ == hu4Var) {
                return hu4Var;
            }
            obj = objZ;
            atomicLong = atomicLong2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            atomicLong = (AtomicLong) this.g;
            ch3.d0(obj);
        }
        atomicLong.set(((Number) obj).longValue());
        a8j.x(bpfVar.z, new ouf(new tnh(R.string.oneme_settings_change_avatar_success), new Integer(R.drawable.icon_check)));
        return sbi.a;
    }

    private final Object q(Object obj) {
        File file;
        xpf xpfVar = (xpf) this.i;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            zv8[] zv8VarArr = xpf.r;
            xpfVar.D().j();
            file = (File) xpfVar.m.remove((String) this.j);
            if (file == null) {
                gm0.Y(xpfVar.q, "Removing ringtone file not found");
                return sbiVar;
            }
            gqe gqeVar = new gqe(file, 1);
            this.h = null;
            this.g = file;
            this.f = 1;
            if (qyj.V(k66.a, gqeVar, this) != hu4Var) {
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
        file = (File) this.g;
        ch3.d0(obj);
        dqe dqeVar = xpfVar.c.b;
        aqe aqeVar = dqeVar instanceof aqe ? (aqe) dqeVar : null;
        if (cqk.d(aqeVar != null ? aqeVar.a : null, file.getAbsolutePath())) {
            xpfVar.G(bqe.a);
            return sbiVar;
        }
        this.h = null;
        this.g = null;
        this.f = 2;
        return xpf.B(xpfVar, this) == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010d A[RETURN] */
    private final Object r(Object obj) {
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        yx6 yx6Var = (yx6) this.h;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            upc upcVarF = ((q7g) this.g).a().f((azg) this.i);
            if (upcVarF == null || !upcVarF.b.keySet().containsAll(a.m1((long[]) this.j))) {
                String str = ((q7g) this.g).d;
                azg azgVar = (azg) this.i;
                long[] jArr = (long[]) this.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "getStoriesByStoryId: cache miss, loading from network for ownerId=" + azgVar.a() + ", storyIds=" + a.m1(jArr), null);
                }
                aj5 aj5Var = (aj5) ((q7g) this.g).a.getValue();
                azg azgVar2 = (azg) this.i;
                long[] jArr2 = (long[]) this.j;
                this.h = yx6Var;
                this.f = 2;
                obj = aj5Var.i(azgVar2, jArr2, this);
                if (obj != hu4Var) {
                }
            } else {
                String str2 = ((q7g) this.g).d;
                azg azgVar3 = (azg) this.i;
                long[] jArr3 = (long[]) this.j;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "getStoriesByStoryId: cache hit for ownerId=" + azgVar3.a() + ", storyIds=" + a.m1(jArr3), null);
                }
                this.h = null;
                this.f = 1;
                if (yx6Var.emit(upcVarF, this) != hu4Var) {
                    return sbiVar;
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
        upc upcVar = (upc) obj;
        if (upcVar != null) {
            ((q7g) this.g).a().m(upcVar, false);
        }
        this.h = null;
        this.f = 3;
        if (yx6Var.emit(upcVar, this) == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0 A[Catch: TamErrorException -> 0x0018, TryCatch #0 {TamErrorException -> 0x0018, blocks: (B:7:0x0013, B:22:0x0095, B:25:0x00a0, B:27:0x00a8), top: B:39:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[Catch: TamErrorException -> 0x0018, TRY_LEAVE, TryCatch #0 {TamErrorException -> 0x0018, blocks: (B:7:0x0013, B:22:0x0095, B:25:0x00a0, B:27:0x00a8), top: B:39:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00a8, please report this as an issue */
    private final Object s(Object obj) {
        rt2 rt2Var;
        rt2 rt2Var2;
        TamErrorException e;
        String str;
        a4c a4cVar;
        je9 je9Var;
        gbg gbgVar;
        String str2;
        a4c a4cVar2;
        je9 je9Var2;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                jz jzVar = new jz(((xn3) ((ny8) this.h).getValue()).k(((gbg) this.i).a), 13);
                this.f = 1;
                obj = e9i.N(jzVar, this);
                if (obj != hu4Var) {
                }
                return hu4Var;
            }
            if (i != 1) {
                if (i != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rt2Var2 = (rt2) this.g;
                try {
                    ch3.d0(obj);
                    gbgVar = (gbg) this.i;
                    str2 = gbgVar.o;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 == null) {
                        je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "Missed contacts were requested for " + gbgVar.a + "/" + rt2Var2.A(), null);
                        }
                    }
                } catch (TamErrorException e2) {
                    e = e2;
                    str = ((gbg) this.i).o;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, ewi.d(rt2Var2.A(), "Requesting contacts for chat(#", ") was failed due to ", e.getLocalizedMessage()), null);
                        }
                    }
                }
                return sbi.a;
            }
            ch3.d0(obj);
            Set setKeySet = rt2Var.b.e.keySet();
            Set setKeySet2 = rt2Var.b.T.keySet();
            m8b m8bVar = new m8b(setKeySet.size() + ((iw) setKeySet2).a.c);
            rx8.d(m8bVar, setKeySet);
            rx8.d(m8bVar, setKeySet2);
            a0b a0bVar = (a0b) ((ny8) this.j).getValue();
            ghb ghbVar = ew5.b;
            long jO = qe7.O(20, lw5.SECONDS);
            this.g = rt2Var;
            this.f = 2;
            if (a0bVar.t(m8bVar, jO, this) != hu4Var) {
                rt2Var2 = rt2Var;
                gbgVar = (gbg) this.i;
                str2 = gbgVar.o;
                a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "Missed contacts were requested for " + gbgVar.a + "/" + rt2Var2.A(), null);
                    }
                }
                return sbi.a;
            }
            return hu4Var;
        } catch (TamErrorException e3) {
            rt2Var2 = rt2Var;
            e = e3;
            str = ((gbg) this.i).o;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, ewi.d(rt2Var2.A(), "Requesting contacts for chat(#", ") was failed due to ", e.getLocalizedMessage()), null);
                }
            }
        }
        rt2Var = (rt2) obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00b1, please report this as an issue */
    private final Object t(Object obj) {
        xra xraVar;
        eng engVar;
        String name;
        a4c a4cVar;
        je9 je9Var;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) this.h;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            String str = (String) this.i;
            if (str == null || str.length() == 0) {
                hog hogVar = (hog) this.j;
                zv8[] zv8VarArr = hog.j;
                hogVar.d.setValue(hog.k);
                hogVar.g.set(new fog((String) null, 3));
                return sbiVar;
            }
            ((hog) this.j).g.updateAndGet(new ung((String) this.i, 1));
            ing ingVar = (ing) ((hog) this.j).b.getValue();
            String str2 = (String) this.i;
            this.h = gu4Var;
            this.f = 1;
            xraVar = this;
            obj = ing.d(ingVar, str2, 0L, xraVar, 6);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
            xraVar = this;
        } else {
            if (i != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            engVar = (eng) this.g;
            ch3.d0(obj);
            xraVar = this;
        }
        List list = (List) obj;
        ((hog) xraVar.j).g.updateAndGet(new cog(engVar, 2));
        name = gu4Var.getClass().getName();
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Stickers sets search. finish, size:" + engVar.a.size() + "|marker:" + engVar.b, null);
            }
        }
        mjg mjgVar = ((hog) xraVar.j).d;
        gog gogVar = new gog(2, list);
        mjgVar.getClass();
        mjgVar.j(null, gogVar);
        return sbiVar;
        eng engVar2 = (eng) obj;
        ceh cehVar = (ceh) ((hog) xraVar.j).a.getValue();
        List list2 = engVar2.a;
        xraVar.h = gu4Var;
        xraVar.g = engVar2;
        xraVar.f = 2;
        obj = cehVar.b(list2, xraVar);
        if (obj != hu4Var) {
            engVar = engVar2;
            List list3 = (List) obj;
            ((hog) xraVar.j).g.updateAndGet(new cog(engVar, 2));
            name = gu4Var.getClass().getName();
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Stickers sets search. finish, size:" + engVar.a.size() + "|marker:" + engVar.b, null);
                }
            }
            mjg mjgVar2 = ((hog) xraVar.j).d;
            gog gogVar2 = new gog(2, list3);
            mjgVar2.getClass();
            mjgVar2.j(null, gogVar2);
            return sbiVar;
        }
        return hu4Var;
    }

    private final Object u(Object obj) {
        jah jahVar;
        l9b l9bVar;
        sgg sggVar;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) this.h;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jah jahVar2 = (jah) this.j;
            l9b l9bVar2 = jahVar2.o;
            this.h = gu4Var;
            this.g = l9bVar2;
            this.i = jahVar2;
            this.f = 1;
            if (l9bVar2.b(this) == hu4Var) {
                return hu4Var;
            }
            jahVar = jahVar2;
            l9bVar = l9bVar2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jahVar = (jah) this.i;
            l9bVar = (l9b) this.g;
            ch3.d0(obj);
        }
        try {
            boolean zF = jah.f(jahVar.b);
            if (zF && ((sggVar = jahVar.p) == null || !sggVar.isActive())) {
                jahVar.p = yab.i0(gu4Var, null, 0, new ryf(jahVar, null, 16), 3);
                return sbiVar;
            }
            String str = jahVar.m;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Don't need load bot commands, needToSearchBotCommands:" + zF, null);
                }
            }
            return sbiVar;
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    private final Object v(Object obj) {
        ldh ldhVar;
        ldh ldhVar2 = this.f;
        try {
            if (ldhVar2 == 0) {
                ch3.d0(obj);
                ldh ldhVar3 = (ldh) this.i;
                List list = (List) this.j;
                dm6 dm6VarM = ldhVar3.m();
                this.g = ldhVar3;
                this.h = ldhVar3;
                this.f = 1;
                Object objB = dm6VarM.b(list, this);
                hu4 hu4Var = hu4.a;
                if (objB == hu4Var) {
                    return hu4Var;
                }
                ldhVar = ldhVar3;
                ldhVar2 = ldhVar3;
            } else {
                if (ldhVar2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ldh ldhVar4 = (ldh) this.h;
                ldh ldhVar5 = (ldh) this.g;
                ch3.d0(obj);
                ldhVar2 = ldhVar4;
                ldhVar = ldhVar5;
            }
            gm0.x(ldhVar.j, "onAssetsUpdate: stored fav sticker sets", null);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(ldhVar2.j, "onAssetsUpdate: failed to store fav sticker sets", th);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0134 A[Catch: all -> 0x001c, CancellationException -> 0x0020, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0020, blocks: (B:7:0x0017, B:54:0x011a, B:56:0x0134, B:57:0x0137), top: B:80:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x017a A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:66:0x0167, B:67:0x0174, B:69:0x017a, B:71:0x0188, B:72:0x018b, B:73:0x018f, B:76:0x0193), top: B:79:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0188 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:66:0x0167, B:67:0x0174, B:69:0x017a, B:71:0x0188, B:72:0x018b, B:73:0x018f, B:76:0x0193), top: B:79:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x018b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, wfe] */
    private final Object w(Object obj) {
        wfe wfeVar;
        wfe wfeVar2;
        wfe wfeVar3;
        Throwable th;
        wfe wfeVar4;
        wfe wfeVar5;
        ebb ebbVar;
        File fileC;
        File parentFile;
        hu4 hu4Var = hu4.a;
        ?? r1 = this.f;
        File file = null;
        try {
            try {
                if (r1 == 0) {
                    wfe wfeVarP = nbh.p(obj);
                    wfe wfeVar6 = new wfe();
                    try {
                        ndh ndhVar = (ndh) this.j;
                        ibb ibbVarB = ndhVar.b.b(ndhVar.f);
                        if (ibbVarB != null && ibbVarB.b.exists() && ibbVarB.b.canRead()) {
                            ndh.d((ndh) this.j, ibbVarB.b, ibbVarB.a);
                            hbb.a((Closeable) wfeVarP.a);
                            hbb.c((File) wfeVar6.a);
                            return ibbVarB;
                        }
                        if (!((ndh) this.j).g) {
                            hbb.a((Closeable) wfeVarP.a);
                            hbb.c((File) wfeVar6.a);
                            return null;
                        }
                        ndh ndhVar2 = (ndh) this.j;
                        pc5 pc5Var = ndhVar2.b;
                        String str = ndhVar2.f;
                        pc5Var.getClass();
                        File file2 = new File(pc5Var.a.a(), pc5Var.a(str).concat(".temp"));
                        File parentFile2 = file2.getParentFile();
                        if (parentFile2 != null) {
                            parentFile2.mkdirs();
                        }
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        wfeVar6.a = file2;
                        ndh ndhVar3 = (ndh) this.j;
                        qg7 qg7Var = ndhVar3.a;
                        String str2 = ndhVar3.f;
                        this.g = wfeVarP;
                        this.h = wfeVar6;
                        this.i = wfeVarP;
                        this.f = 1;
                        Object objS = qg7Var.s(str2, this);
                        if (objS != hu4Var) {
                            wfeVar = wfeVarP;
                            wfeVar2 = wfeVar6;
                            wfeVar3 = wfeVar;
                            obj = objS;
                        }
                        return hu4Var;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        hbb.c(file);
                        for (WeakReference weakReference : ((ndh) this.j).h) {
                            ebbVar = (ebb) weakReference.get();
                            if (ebbVar != null) {
                                ebbVar.onFailed(th);
                            }
                            weakReference.clear();
                        }
                        throw th;
                    }
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wfeVar5 = (wfe) this.h;
                    wfeVar4 = (wfe) this.g;
                    try {
                        try {
                            ch3.d0(obj);
                            String strL = ((tsb) wfeVar4.a).l();
                            ndh ndhVar4 = (ndh) this.j;
                            fileC = ndhVar4.b.c(ndhVar4.f, strL);
                            parentFile = fileC.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            try {
                                hbb.b((File) wfeVar5.a, fileC);
                                ndh.d((ndh) this.j, fileC, strL);
                                ibb ibbVar = new ibb(fileC, strL);
                                hbb.a((Closeable) wfeVar4.a);
                                hbb.c((File) wfeVar5.a);
                                return ibbVar;
                            } catch (Throwable th3) {
                                th = th3;
                                file = fileC;
                                hbb.c(file);
                                while (r10.hasNext()) {
                                    ebbVar = (ebb) weakReference.get();
                                    if (ebbVar != null) {
                                        ebbVar.onFailed(th);
                                    }
                                    weakReference.clear();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            hbb.c(file);
                            while (r10.hasNext()) {
                                ebbVar = (ebb) weakReference.get();
                                if (ebbVar != null) {
                                    ebbVar.onFailed(th);
                                }
                                weakReference.clear();
                            }
                            throw th;
                        }
                    } catch (CancellationException e2) {
                        throw e2;
                    }
                }
                wfeVar3 = (wfe) this.i;
                wfe wfeVar7 = (wfe) this.h;
                wfe wfeVar8 = (wfe) this.g;
                try {
                    ch3.d0(obj);
                    wfeVar2 = wfeVar7;
                    wfeVar = wfeVar8;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th5) {
                    th = th5;
                    hbb.c(file);
                    while (r10.hasNext()) {
                        ebbVar = (ebb) weakReference.get();
                        if (ebbVar != null) {
                            ebbVar.onFailed(th);
                        }
                        weakReference.clear();
                    }
                    throw th;
                }
                wfeVar3.a = obj;
                ndh ndhVar5 = (ndh) this.j;
                xt4 xt4Var = ndhVar5.d;
                jyf jyfVar = new jyf(wfeVar, ndhVar5, wfeVar2, null, 9);
                this.g = wfeVar;
                this.h = wfeVar2;
                this.i = null;
                this.f = 2;
                if (yab.K0(xt4Var, jyfVar, this) != hu4Var) {
                    wfeVar4 = wfeVar;
                    wfeVar5 = wfeVar2;
                    String strL2 = ((tsb) wfeVar4.a).l();
                    ndh ndhVar6 = (ndh) this.j;
                    fileC = ndhVar6.b.c(ndhVar6.f, strL2);
                    parentFile = fileC.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    hbb.b((File) wfeVar5.a, fileC);
                    ndh.d((ndh) this.j, fileC, strL2);
                    ibb ibbVar2 = new ibb(fileC, strL2);
                    hbb.a((Closeable) wfeVar4.a);
                    hbb.c((File) wfeVar5.a);
                    return ibbVar2;
                }
                return hu4Var;
            } catch (CancellationException e4) {
                throw e4;
            } catch (Throwable th6) {
                th = th6;
                hbb.c(file);
                while (r10.hasNext()) {
                    ebbVar = (ebb) weakReference.get();
                    if (ebbVar != null) {
                        ebbVar.onFailed(th);
                    }
                    weakReference.clear();
                }
                throw th;
            }
        } catch (Throwable th7) {
            hbb.a((Closeable) 2.a);
            hbb.c((File) r1.a);
            throw th7;
        }
    }

    private final Object x(Object obj) {
        h3b h3bVar;
        Throwable th;
        dfh dfhVar;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                dfh dfhVar2 = (dfh) this.i;
                h3bVar = (h3b) this.j;
                try {
                    pvb pvbVar = (pvb) dfhVar2.c.getValue();
                    this.g = dfhVar2;
                    this.h = h3bVar;
                    this.f = 1;
                    Object objD = pvbVar.D(h3bVar, this);
                    hu4 hu4Var = hu4.a;
                    return objD == hu4Var ? hu4Var : objD;
                } catch (Throwable th2) {
                    th = th2;
                    dfhVar = dfhVar2;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h3bVar = (h3b) this.h;
                dfhVar = (dfh) this.g;
                try {
                    ch3.d0(obj);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            gm0.V(dfhVar.g, h3bVar + " fail", th);
            return null;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c9 A[PHI: r6
  0x00c9: PHI (r6v3 java.lang.String) = (r6v6 java.lang.String), (r6v23 java.lang.String), (r6v24 java.lang.String) binds: [B:50:0x00c8, B:34:0x0082, B:32:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x018b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r0 == r14) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
    
        if (r0 == r14) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14, types: [wfe] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, wfe] */
    /* JADX WARN: Type inference failed for: r3v4, types: [wfe] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [wfe] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object y(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xra.y(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:55:0x00b4, B:71:0x00e4, B:60:0x00be, B:61:0x00c2, B:63:0x00cb, B:68:0x00da, B:69:0x00e1), top: B:93:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:55:0x00b4, B:71:0x00e4, B:60:0x00be, B:61:0x00c2, B:63:0x00cb, B:68:0x00da, B:69:0x00e1), top: B:93:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:55:0x00b4, B:71:0x00e4, B:60:0x00be, B:61:0x00c2, B:63:0x00cb, B:68:0x00da, B:69:0x00e1), top: B:93:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x00e2 A[SYNTHETIC] */
    private final Object z(Object obj) throws Throwable {
        tnh tnhVar;
        String str;
        tnh tnhVar2;
        String str2;
        Object objD;
        ListIterator listIterator;
        b79 b79Var;
        t5i t5iVar;
        Object poeVar;
        pk8 pk8Var = (pk8) this.j;
        String str3 = pk8Var.a;
        ok8 ok8Var = pk8Var.c;
        b7i b7iVar = (b7i) this.i;
        ic6 ic6Var = b7iVar.u;
        w6i w6iVar = b7iVar.c;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            w6i w6iVar2 = w6i.b;
            if (w6iVar == w6iVar2) {
                if ((ok8Var != null ? ok8Var.a : null) == null) {
                    tnhVar = new tnh(R.string.oneme_settings_twofa_configuration_change_password_success);
                } else if (w6iVar != w6iVar2) {
                    if (ok8Var != null) {
                        str = ok8Var.b;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        tnhVar = new tnh(R.string.oneme_settings_twofa_configuration_change_email_success);
                    } else if (w6iVar == w6iVar2) {
                        tnhVar = new tnh(R.string.oneme_settings_twofa_configuration_set_email_success);
                    } else {
                        tnhVar = null;
                    }
                } else if (w6iVar == w6iVar2) {
                    tnhVar = new tnh(R.string.oneme_settings_twofa_configuration_set_email_success);
                } else {
                    tnhVar = null;
                }
            } else if (w6iVar != w6iVar2) {
                if (ok8Var != null) {
                    str = ok8Var.b;
                } else {
                    str = null;
                }
                if (str != null) {
                    tnhVar = new tnh(R.string.oneme_settings_twofa_configuration_change_email_success);
                } else if (w6iVar == w6iVar2) {
                    tnhVar = new tnh(R.string.oneme_settings_twofa_configuration_set_email_success);
                } else {
                    tnhVar = null;
                }
            } else if (w6iVar == w6iVar2) {
                tnhVar = new tnh(R.string.oneme_settings_twofa_configuration_set_email_success);
            } else {
                tnhVar = null;
            }
            c79 c79VarW = yab.w();
            t5i t5iVar2 = t5i.SET_PASSWORD;
            t5i t5iVar3 = t5i.UPDATE_PASSWORD;
            if (w6iVar == w6iVar2) {
                if ((ok8Var != null ? ok8Var.a : null) == null && str3 != null) {
                    c79VarW.add(t5iVar3);
                } else if (w6iVar == w6i.a) {
                    c79VarW.add(t5iVar2);
                }
            } else if (w6iVar == w6i.a) {
                c79VarW.add(t5iVar2);
            }
            String str4 = pk8Var.b;
            if (str4 != null && str4.length() != 0) {
                c79VarW.add(t5i.HINT);
            }
            String str5 = ok8Var != null ? ok8Var.a : null;
            if (str5 != null && str5.length() != 0) {
                c79VarW.add(t5i.EMAIL);
            }
            c79 c79VarJ = yab.j(c79VarW);
            if (c79VarJ != null) {
                try {
                    if (!c79VarJ.isEmpty()) {
                        listIterator = c79VarJ.listIterator(0);
                        while (true) {
                            b79Var = (b79) listIterator;
                            if (b79Var.hasNext()) {
                                t5iVar = (t5i) b79Var.next();
                                if (t5iVar != t5iVar2 || t5iVar == t5iVar3) {
                                    if (str3 != null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    str2 = str3;
                                }
                            }
                        }
                    }
                    str2 = null;
                } catch (Throwable th) {
                    th = th;
                    tnhVar2 = tnhVar;
                    poeVar = new poe(th);
                }
            } else {
                listIterator = c79VarJ.listIterator(0);
                while (true) {
                    b79Var = (b79) listIterator;
                    if (b79Var.hasNext()) {
                        t5iVar = (t5i) b79Var.next();
                        if (t5iVar != t5iVar2) {
                        }
                        if (str3 != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        str2 = str3;
                    } else {
                        str2 = null;
                    }
                }
            }
            pvb pvbVar = (pvb) b7iVar.k.getValue();
            vsb vsbVar = new vsb(b7iVar.f, c79VarJ, str2, pk8Var.b, 16);
            this.h = null;
            this.g = tnhVar;
            this.f = 1;
            objD = pvbVar.D(vsbVar, this);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
            tnhVar2 = tnhVar;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tnhVar2 = (tnh) this.g;
            try {
                ch3.d0(obj);
                objD = obj;
            } catch (Throwable th2) {
                th = th2;
                poeVar = new poe(th);
            }
        }
        poeVar = (kih) objD;
        if (!(poeVar instanceof poe)) {
            b7iVar.E = null;
            if (tnhVar2 != null) {
                a8j.x(ic6Var, new k7i(R.drawable.icon_check_round_fill, (ynh) tnhVar2, false));
            }
            a8j.x(b7iVar.v, q7i.a);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            b7iVar.E = null;
            if (thA instanceof CancellationException) {
                throw thA;
            }
            gm0.V(b7iVar.h, "Can't finish create twoFA", thA);
            a8j.x(ic6Var, new k7i(0, 6, vzl.b(thA)));
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                xra xraVar = new xra((jsa) this.i, (List) this.j, lq4Var, 0);
                xraVar.h = obj;
                return xraVar;
            case 1:
                return new xra((a0b) this.i, (long[]) this.j, lq4Var, 1);
            case 2:
                return new xra((ewk) this.i, (w7b) this.j, lq4Var, 2);
            case 3:
                xra xraVar2 = new xra((ks9) this.i, (qf7) this.j, lq4Var, 3);
                xraVar2.h = obj;
                return xraVar2;
            case 4:
                xra xraVar3 = new xra((NotificationsImagesProvider) this.g, (Uri) this.i, (l6g) this.j, lq4Var, 4);
                xraVar3.h = obj;
                return xraVar3;
            case 5:
                return new xra((hn6) this.g, (yob) this.h, (xn6) this.i, lq4Var);
            case 6:
                return new xra(6, lq4Var, (Throwable) this.g, (m2c) this.h, (Thread.UncaughtExceptionHandler) this.i, (Thread) this.j);
            case 7:
                return new xra(7, lq4Var, (qrc) this.g, (u8b) this.h, (u8b) this.i, (u8b) this.j);
            case 8:
                xra xraVar4 = new xra((qrc) this.g, (pxa) this.i, (rqc) this.j, lq4Var, 8);
                xraVar4.h = obj;
                return xraVar4;
            case 9:
                xra xraVar5 = new xra((u3d) this.j, lq4Var, 9);
                xraVar5.h = obj;
                return xraVar5;
            case 10:
                xra xraVar6 = new xra((s9d) this.j, lq4Var, 10);
                xraVar6.h = obj;
                return xraVar6;
            case 11:
                return new xra(11, lq4Var, (fy) this.g, (wae) this.h, (ArrayList) this.i, (List) this.j);
            case 12:
                return new xra(12, lq4Var, this.h, this.i, this.j, false);
            case 13:
                return new xra(13, lq4Var, (SaveStoryToGalleryWorker) this.g, (String) this.h, (File) this.i, (String) this.j);
            case 14:
                return new xra((t2f) this.i, (x35) this.j, lq4Var, 14);
            case 15:
                return new xra(15, lq4Var, this.h, this.i, this.j, false);
            case 16:
                xra xraVar7 = new xra((xpf) this.i, (String) this.j, lq4Var, 16);
                xraVar7.h = obj;
                return xraVar7;
            case 17:
                xra xraVar8 = new xra((q7g) this.g, (azg) this.i, (long[]) this.j, lq4Var, 17);
                xraVar8.h = obj;
                return xraVar8;
            case 18:
                return new xra(18, lq4Var, this.h, this.i, this.j, false);
            case 19:
                xra xraVar9 = new xra((xx6) this.g, lq4Var, (StartConversationScreen) this.i, (nhg) this.j);
                xraVar9.h = obj;
                return xraVar9;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                xra xraVar10 = new xra((String) this.i, (hog) this.j, lq4Var, 20);
                xraVar10.h = obj;
                return xraVar10;
            case 21:
                xra xraVar11 = new xra((jah) this.j, lq4Var, 21);
                xraVar11.h = obj;
                return xraVar11;
            case 22:
                return new xra((ldh) this.i, (List) this.j, lq4Var, 22);
            case 23:
                return new xra((ndh) this.j, lq4Var, 23);
            case 24:
                return new xra((dfh) this.i, (h3b) this.j, lq4Var, 24);
            case 25:
                xra xraVar12 = new xra((j6i) this.j, lq4Var, 25);
                xraVar12.h = obj;
                return xraVar12;
            case 26:
                xra xraVar13 = new xra((b7i) this.i, (pk8) this.j, lq4Var, 26);
                xraVar13.h = obj;
                return xraVar13;
            case 27:
                xra xraVar14 = new xra((CharSequence) this.g, (b7i) this.i, (CharSequence) this.j, lq4Var, 27);
                xraVar14.h = obj;
                return xraVar14;
            case 28:
                return new xra((k8i) this.j, lq4Var, 28);
            default:
                return new xra(29, lq4Var, (uli) this.g, (jli) this.h, (Map) this.i, (s94) this.j);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((xra) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((xra) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((xra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:298:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:344:0x075d  */
    /* JADX WARN: Code duplicated, block: B:346:0x0767  */
    /* JADX WARN: Code duplicated, block: B:347:0x076f  */
    /* JADX WARN: Code duplicated, block: B:349:0x0779  */
    /* JADX WARN: Code duplicated, block: B:352:0x0789  */
    /* JADX WARN: Code duplicated, block: B:356:0x079d  */
    /* JADX WARN: Code duplicated, block: B:359:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:361:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:363:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:365:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:367:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:461:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:504:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:506:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:561:0x0796 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (((defpackage.xf5) r1).z0(r8) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05da, code lost:
    
        if (defpackage.rx8.u(r0, r8) == r4) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x07cc, code lost:
    
        if (r0 == r2) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x07dc, code lost:
    
        if (defpackage.yob.c(r1, r3, r0, true, r8) == r2) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0820, code lost:
    
        if (one.me.android.notifications.NotificationsImagesProvider.b(r1, r0, r8) == r3) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0836, code lost:
    
        if (r0 == r3) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0183, code lost:
    
        if (defpackage.wae.a(r0, r1, r8) == r2) goto L97;
     */
    /* JADX WARN: Type inference failed for: r0v99, types: [byte[], java.io.Serializable] */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xra.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xra(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xra(hn6 hn6Var, yob yobVar, xn6 xn6Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 5;
        this.g = hn6Var;
        this.h = yobVar;
        this.i = xn6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xra(xx6 xx6Var, lq4 lq4Var, StartConversationScreen startConversationScreen, nhg nhgVar) {
        super(2, lq4Var);
        this.e = 19;
        this.g = xx6Var;
        this.i = startConversationScreen;
        this.j = nhgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xra(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xra(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xra(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.i = obj2;
        this.j = obj3;
    }
}
