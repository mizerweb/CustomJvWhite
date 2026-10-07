package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lx9 extends a8j {
    public static final /* synthetic */ zv8[] F1 = {new z8b(lx9.class, "attachDownloadJob", "getAttachDownloadJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, lx9.class, "mediaStateHidingJob", "getMediaStateHidingJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "videoFetchJob", "getVideoFetchJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "newPageJob", "getNewPageJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "updateTrimJob", "getUpdateTrimJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "selectQualityJob", "getSelectQualityJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "toggleMuteJob", "getToggleMuteJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "photoActionClickJob", "getPhotoActionClickJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "onMediaSelectedJob", "getOnMediaSelectedJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "qualityClickJob", "getQualityClickJob()Lkotlinx/coroutines/Job;"), new z8b(lx9.class, "reloadAroundJob", "getReloadAroundJob()Lkotlinx/coroutines/Job;")};
    public final ic6 A;
    public final ic6 A1;
    public final r8e B;
    public final pzf B1;
    public final mjg C;
    public final q8e C1;
    public final r8e D;
    public final ti7 D1;
    public final mjg E;
    public final si7 E1;
    public final r8e F;
    public final mjg G;
    public final r8e H;
    public final r8e I;
    public final mjg J;
    public final r8e K;
    public final mjg X;
    public final r8e Y;
    public final r8e Z;
    public final Long c;
    public final String d;
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
    public final ic6 n1;
    public final ny8 o;
    public final AtomicLong o1;
    public final p3c p;
    public final AtomicLong p1;
    public final jh7 q;
    public final p3c q1;
    public final AtomicBoolean r;
    public final p3c r1;
    public final ic6 s;
    public final p3c s1;
    public final mjg t;
    public final p3c t1;
    public final r8e u;
    public final p3c u1;
    public final mjg v;
    public final p3c v1;
    public final ic6 w;
    public final p3c w1;
    public final r8e x;
    public final p3c x1;
    public final gjg y;
    public final p3c y1;
    public final r8e z;
    public final p3c z1;

    public lx9(long j, Long l, Long l2, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, xn3 xn3Var) {
        this.c = l;
        String name = lx9.class.getName();
        this.d = name;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var;
        this.h = ny8Var4;
        this.i = ny8Var8;
        this.j = ny8Var5;
        this.k = ny8Var6;
        this.l = ny8Var7;
        this.m = ny8Var10;
        this.n = ny8Var9;
        this.o = ny8Var11;
        this.p = qyj.S();
        this.q = jh7.a;
        this.r = new AtomicBoolean(false);
        this.s = new ic6(null);
        mjg mjgVarA = p90.a(pw9.a);
        this.t = mjgVarA;
        r8e r8eVar = new r8e(mjgVarA);
        this.u = r8eVar;
        mjg mjgVarA2 = p90.a(Long.valueOf(j));
        this.v = mjgVarA2;
        ic6 ic6Var = new ic6(null);
        this.w = ic6Var;
        r07 r07Var = new r07(r8eVar, mjgVarA2, new yw9(3, null), 0);
        a8g a8gVar = j0g.a;
        r8e r8eVarG0 = e9i.G0(r07Var, this.b, a8gVar, null);
        this.x = r8eVarG0;
        this.y = l2 != null ? xn3Var.k(l2.longValue()) : p90.a(null);
        this.z = e9i.G0(new o24(e9i.m0(mjgVarA2, ic6Var), 13, this), this.b, a8gVar, 0);
        ic6 ic6Var2 = new ic6(null);
        this.A = ic6Var2;
        this.B = e9i.G0(new r07(r8eVarG0, ic6Var2, new vc3(this, ny8Var7, ny8Var6, (lq4) null), 0), this.b, a8gVar, null);
        mjg mjgVarA3 = p90.a(wr4.c);
        this.C = mjgVarA3;
        this.D = new r8e(mjgVarA3);
        mjg mjgVarA4 = p90.a(new xw9((hb9) null, 3));
        this.E = mjgVarA4;
        this.F = new r8e(mjgVarA4);
        mjg mjgVarA5 = p90.a(((ib9) ny8Var4.getValue()).a.j);
        this.G = mjgVarA5;
        this.H = new r8e(mjgVarA5);
        this.I = new r8e(p90.a(nic.c));
        mjg mjgVarA6 = p90.a(Float.valueOf(0.0f));
        this.J = mjgVarA6;
        this.K = new r8e(mjgVarA6);
        mjg mjgVarA7 = p90.a(Float.valueOf(1.0f));
        this.X = mjgVarA7;
        this.Y = new r8e(mjgVarA7);
        this.Z = e9i.G0(e9i.C(mjgVarA6, mjgVarA7, r8eVarG0, new jx9(ny8Var12, null)), this.b, a8gVar, null);
        this.n1 = new ic6(null);
        this.o1 = new AtomicLong();
        this.p1 = new AtomicLong();
        this.q1 = qyj.S();
        this.r1 = qyj.S();
        this.s1 = qyj.S();
        this.t1 = qyj.S();
        this.u1 = qyj.S();
        this.v1 = qyj.S();
        this.w1 = qyj.S();
        this.x1 = qyj.S();
        this.y1 = qyj.S();
        this.z1 = qyj.S();
        this.A1 = new ic6(null);
        pzf pzfVarA = e9i.a(1, 0, 2);
        this.B1 = pzfVarA;
        this.C1 = new q8e(pzfVarA);
        ti7 ti7Var = new ti7(this, 1);
        this.D1 = ti7Var;
        si7 si7Var = new si7(this, 1);
        this.E1 = si7Var;
        K().a.c.add(ti7Var);
        K().a.f.add(si7Var);
        sgg sggVar = ((rb8) ny8Var8.getValue()).o;
        if (sggVar == null || !sggVar.W()) {
            ((rb8) ny8Var8.getValue()).e();
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "init mediaEditor: loadMedia started", null);
            }
        }
        e9i.j0(e9i.T(new fz6(((rb8) ny8Var8.getValue()).h, new ax9(this, null, 0), 3), ((n0c) H()).a()), this.b);
        W();
        sbi sbiVar = sbi.a;
        a8j.x(ic6Var2, sbiVar);
        a8j.x(ic6Var, sbiVar);
    }

    public static final List B(lx9 lx9Var) {
        hb9 hb9VarG = lx9Var.G();
        List list = r66.a;
        if (hb9VarG == null || !hb9VarG.c()) {
            return list;
        }
        float fU = oc9.u(Math.abs(((Number) lx9Var.X.getValue()).floatValue() - ((Number) lx9Var.J.getValue()).floatValue()), 0.0f, 1.0f);
        List listA = ((h4c) ((c2a) lx9Var.l.getValue())).a(hb9VarG.a());
        if (listA != null) {
            list = listA;
        }
        List<d1e> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (d1e d1eVar : list2) {
            long jL = gm0.L(d1eVar.e * fU);
            y0e y0eVar = d1eVar.a;
            boolean z = d1eVar.f;
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) y0eVar.a);
            spannableStringBuilderAppend.append(' ').append((z ? "– " : "~ ").concat(woh.v(jL, true, null)), new ForegroundColorSpan(pq3.j.e((Context) lx9Var.g.getValue()).j().b.getText().d), 34);
            arrayList.add(new j1e(d1eVar, new xnh(spannableStringBuilderAppend)));
        }
        return arrayList;
    }

    public static final fvi C(lx9 lx9Var, long j) {
        Object next;
        ief iefVar = lx9Var.K().a;
        iefVar.getClass();
        Iterator it = new ArrayList(iefVar.a).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((kef) next).a.b != j);
        kef kefVar = (kef) next;
        if (kefVar != null) {
            return kefVar.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D(lx9 lx9Var, nq4 nq4Var) {
        hx9 hx9Var;
        Object value;
        long j;
        Object value2;
        if (nq4Var instanceof hx9) {
            hx9Var = (hx9) nq4Var;
            int i = hx9Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx9Var.g = i - Integer.MIN_VALUE;
            } else {
                hx9Var = new hx9(lx9Var, nq4Var);
            }
        } else {
            hx9Var = new hx9(lx9Var, nq4Var);
        }
        Object objK0 = hx9Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = hx9Var.g;
        try {
            if (i2 == 0) {
                ch3.d0(objK0);
                long jLongValue = ((Number) lx9Var.v.getValue()).longValue();
                rb8 rb8Var = (rb8) lx9Var.i.getValue();
                jh7 jh7Var = lx9Var.q;
                hx9Var.d = jLongValue;
                hx9Var.g = 1;
                objK0 = yab.K0(((n0c) rb8Var.d).b(), new db8(rb8Var, jh7Var, jLongValue, null), hx9Var);
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
                j = jLongValue;
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = hx9Var.d;
                ch3.d0(objK0);
            }
            List listQ = lx9Var.Q((List) objK0);
            Iterator it = listQ.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((kb9) it.next()).a == j) {
                    break;
                }
                i3++;
            }
            if (listQ.isEmpty() || i3 == -1) {
                lx9Var.P(j);
            } else {
                mjg mjgVar = lx9Var.t;
                do {
                    value2 = mjgVar.getValue();
                } while (!mjgVar.h(value2, new qw9(i3, listQ)));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            String str = lx9Var.d;
            mw9 mw9Var = new mw9(e2);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "loadInitial: loadAround failed", mw9Var);
                }
            }
            mjg mjgVar2 = lx9Var.t;
            do {
                value = mjgVar2.getValue();
            } while (!mjgVar2.h(value, ow9.a));
        }
        return sbi.a;
    }

    public static boolean O(Context context, Uri uri) {
        String path;
        Object poeVar;
        Object poeVar2;
        String scheme = uri.getScheme();
        boolean z = false;
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            z = true;
                        }
                        poeVar2 = Boolean.valueOf(z);
                    } catch (Throwable th) {
                        poeVar2 = new poe(th);
                    }
                    Object obj = Boolean.FALSE;
                    if (poeVar2 instanceof poe) {
                        poeVar2 = obj;
                    }
                    return ((Boolean) poeVar2).booleanValue();
                }
            } else if (scheme.equals("file") && (path = uri.getPath()) != null) {
                File file = new File(path);
                try {
                    if (file.exists() && file.canRead()) {
                        z = true;
                    }
                    poeVar = Boolean.valueOf(z);
                } catch (Throwable th2) {
                    poeVar = new poe(th2);
                }
                Object obj2 = Boolean.FALSE;
                if (poeVar instanceof poe) {
                    poeVar = obj2;
                }
                return ((Boolean) poeVar).booleanValue();
            }
        }
        return false;
    }

    public final void E() {
        zv8[] zv8VarArr = F1;
        zv8 zv8Var = zv8VarArr[1];
        p3c p3cVar = this.q1;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[1], null);
    }

    public final void F(long j) {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "fetchVideo: localId: "), null);
            }
        }
        this.r1.B(this, F1[2], yab.h0(this.b, ((n0c) H()).b(), 2, new zw9(this, j, null, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a A[RETURN] */
    public final hb9 G() {
        kb9 kb9Var = (kb9) this.x.a.getValue();
        hb9 hb9VarB = kb9Var != null ? h1h.b(kb9Var) : null;
        Uri uriD = hb9VarB != null ? hb9VarB.d() : null;
        if (uriD == null || O((Context) this.g.getValue(), uriD)) {
            return hb9VarB;
        }
        ief iefVar = K().a;
        long j = hb9VarB.b;
        for (kef kefVar : iefVar.a) {
            long j2 = kefVar.a.b;
            if (j2 == j && iefVar.k(j2)) {
                if (kefVar != null) {
                    return kefVar.a;
                }
                return null;
            }
        }
        kefVar = null;
        if (kefVar != null) {
            return kefVar.a;
        }
        return null;
    }

    public final xhh H() {
        return (xhh) this.e.getValue();
    }

    public final b68 I(long j) {
        hb9 hb9VarJ = J(j);
        Uri uriA = null;
        if (hb9VarJ == null || !hb9VarJ.b()) {
            return null;
        }
        rvc rvcVarE = K().a.e(hb9VarJ);
        if (rvcVarE != null) {
            uriA = rvc.a(hb9VarJ, rvcVarE);
            if (uriA == null) {
                uriA = hb9VarJ.d();
            }
        } else {
            String strA = hb9VarJ.a();
            if (strA != null) {
                uriA = Uri.parse(strA);
            }
        }
        return t2m.c(hb9VarJ, uriA);
    }

    public final hb9 J(long j) {
        Object next;
        rw9 rw9Var = (rw9) this.u.a.getValue();
        if (rw9Var instanceof qw9) {
            Iterator it = ((qw9) rw9Var).a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((kb9) next).a != j);
            kb9 kb9Var = (kb9) next;
            if (kb9Var != null) {
                return h1h.b(kb9Var);
            }
        }
        return null;
    }

    public final ib9 K() {
        return (ib9) this.h.getValue();
    }

    public final vo8 L() {
        return (vo8) this.w1.m(this, F1[7]);
    }

    public final void M() {
        mjg mjgVar;
        Object value;
        int i;
        gef gefVar = K().a.j;
        gef gefVar2 = gef.b;
        K().a.s(gefVar == gefVar2 ? gef.a : gefVar2);
        gef gefVar3 = K().a.j;
        do {
            mjgVar = this.G;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, gefVar3));
        if (K().a.j == gefVar2) {
            i = K().a.c() > 1 ? R.string.send_mode_files : R.string.send_mode_file;
        } else {
            i = R.string.send_mode_media;
        }
        a8j.x(this.n1, new yb6(new tnh(i)));
    }

    public final void N() {
        sgg sggVarT = a8j.t(this, null, new gx9(this, null, 1), 1);
        this.q1.B(this, F1[1], sggVarT);
    }

    public final void P(long j) throws IllegalAccessException, InvocationTargetException {
        Object value;
        Object value2;
        je9 je9Var = je9.d;
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "mediaNotFoundByIdFallback started", null);
        }
        if (!K().a.k(j)) {
            String str2 = this.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "mediaNotFoundByIdFallback: not found in selected controller, closing", null);
                }
            }
            a8j.x(this.n1, new fb6(Integer.valueOf(R.string.common_error)));
            mjg mjgVar = this.t;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, ow9.a));
            return;
        }
        U(j);
        String str3 = this.d;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str3, "mediaNotFoundByIdFallback: found in selected controller, will use it", null);
        }
        ArrayList arrayListA = srh.a(K().a);
        ArrayList arrayList = new ArrayList(yw3.W0(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(((jef) it.next()).a);
        }
        int iG = K().a.g(j);
        this.r.getAndSet(true);
        mjg mjgVar2 = this.t;
        do {
            value2 = mjgVar2.getValue();
        } while (!mjgVar2.h(value2, new qw9(iG, arrayList)));
    }

    public final List Q(List list) {
        ArrayList arrayListA = srh.a(K().a);
        if (arrayListA.isEmpty()) {
            return list;
        }
        m8b m8bVar = ui9.a;
        m8b m8bVar2 = new m8b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m8bVar2.a(((kb9) it.next()).a);
        }
        l8b l8bVar = ki9.a;
        l8b l8bVar2 = new l8b();
        Iterator it2 = arrayListA.iterator();
        while (it2.hasNext()) {
            kb9 kb9Var = ((jef) it2.next()).a;
            l8bVar2.i(kb9Var.a, kb9Var);
        }
        ArrayList arrayList = new ArrayList(arrayListA.size() + list.size());
        Iterator it3 = arrayListA.iterator();
        while (it3.hasNext()) {
            kb9 kb9Var2 = ((jef) it3.next()).a;
            if (!m8bVar2.d(kb9Var2.a)) {
                arrayList.add(kb9Var2);
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            kb9 kb9VarA = (kb9) it4.next();
            if (O((Context) this.g.getValue(), kb9VarA.b)) {
                arrayList.add(kb9VarA);
            } else {
                kb9 kb9Var3 = (kb9) l8bVar2.f(kb9VarA.a);
                if (kb9Var3 != null) {
                    kb9VarA = kb9.a(kb9VarA, kb9Var3.b, null, 0, 0, 2045);
                }
                arrayList.add(kb9VarA);
            }
        }
        return arrayList;
    }

    public final void R(long j) {
        hb9 hb9VarG = G();
        if (hb9VarG != null && hb9VarG.b == j) {
            a8j.x(this.n1, new ib6(5, false));
            return;
        }
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onPhotoLoadFail: " + j + ", currentItemId: " + (hb9VarG != null ? Long.valueOf(hb9VarG.b) : null), null);
        }
    }

    public final void S(long j) {
        hb9 hb9VarG = G();
        if (hb9VarG != null && hb9VarG.b == j) {
            a8j.x(this.n1, new ib6(4, false));
            return;
        }
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onPhotoLoadStart: " + j + ", currentItemId: " + (hb9VarG != null ? Long.valueOf(hb9VarG.b) : null), null);
        }
    }

    public final void T(long j) {
        hb9 hb9VarG = G();
        if (hb9VarG != null && hb9VarG.b == j) {
            a8j.x(this.n1, new ib6(1, false));
            return;
        }
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onPhotoLoadSuccess: " + j + ", currentItemId: " + (hb9VarG != null ? Long.valueOf(hb9VarG.b) : null), null);
        }
    }

    public final void U(long j) throws IllegalAccessException, InvocationTargetException {
        Object next;
        vo8 vo8Var = (vo8) this.p.m(this, F1[0]);
        if ((vo8Var == null || !vo8Var.isActive()) && this.c != null) {
            ief iefVar = K().a;
            iefVar.getClass();
            Iterator it = new ArrayList(iefVar.a).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((kef) next).a.b != j);
            kef kefVar = (kef) next;
            if (kefVar == null) {
                return;
            }
            hb9 hb9Var = kefVar.a;
            p50 p50Var = hb9Var instanceof p50 ? (p50) hb9Var : null;
            if (p50Var == null) {
                return;
            }
            e70 e70Var = p50Var.j;
            String str = e70Var.u;
            if (str == null || str.length() == 0) {
                this.p.B(this, F1[0], yab.h0(this.b, ((n0c) H()).b(), 2, new fx9(this, j, e70Var, hb9Var, null)));
                return;
            }
            String str2 = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, nbh.s(j, "prepareAttachIfNeeded: ", ", has localPath"), null);
                }
            }
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme != null) {
                int iHashCode = scheme.hashCode();
                if (iHashCode == 3143036) {
                    if (scheme.equals("file")) {
                        K().a.r(hb9Var, u1m.b(uri));
                    }
                } else if (iHashCode == 951530617 && scheme.equals("content")) {
                    K().a.q(hb9Var, uri);
                }
            }
        }
    }

    public final void V(int i, Bundle bundle) {
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "processAction: " + i + ", " + bundle, null);
            }
        }
        if (i < 0 || i > 7) {
            if (i == R.id.chat_screen__confirm_send_message_positive) {
                a8j.x(this.n1, kb6.a);
            }
        } else {
            this.u1.B(this, F1[5], yab.h0(this.b, ((n0c) H()).a(), 2, new gx9(this, i, null, 0)));
        }
    }

    public final void W() {
        if (!this.r.get()) {
            this.z1.B(this, F1[10], yab.h0(this.b, ((n0c) H()).a(), 2, new gx9(this, null, 3)));
            return;
        }
        String str = this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "requestReloadAround: will return cuz using selected controller medias", null);
        }
    }

    @Override // defpackage.a8j
    public final void y() {
        ief iefVar = K().a;
        iefVar.c.remove(this.D1);
        ief iefVar2 = K().a;
        iefVar2.f.remove(this.E1);
    }
}
