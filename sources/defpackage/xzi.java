package defpackage;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xzi {
    public final ny8 a;
    public final ny8 b;
    public final dq4 c;
    public final l9b d = new l9b();
    public final zv e = new zv();
    public final String f = xzi.class.getName();
    public final pzf g;
    public final q8e h;

    public xzi(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = cqk.a(((n0c) ((xhh) ny8Var.getValue())).b());
        pzf pzfVarB = e9i.b(1, 0, 6);
        this.g = pzfVarB;
        this.h = new q8e(pzfVarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        pzi pziVar;
        l9b l9bVar;
        boolean z;
        if (nq4Var instanceof pzi) {
            pziVar = (pzi) nq4Var;
            int i = pziVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                pziVar.g = i - Integer.MIN_VALUE;
            } else {
                pziVar = new pzi(this, nq4Var);
            }
        } else {
            pziVar = new pzi(this, nq4Var);
        }
        Object obj = pziVar.e;
        int i2 = pziVar.g;
        sbi sbiVar = sbi.a;
        boolean z2 = true;
        hu4 hu4Var = hu4.a;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                l9bVar = this.d;
                pziVar.d = l9bVar;
                pziVar.g = 1;
                if (l9bVar.b(pziVar) != hu4Var) {
                }
                return hu4Var;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = pziVar.d;
            ch3.d0(obj);
            zv<mzi> zvVar = this.e;
            if (zvVar == null || !zvVar.isEmpty()) {
                for (mzi mziVar : zvVar) {
                    if (mziVar == null) {
                        z = true;
                    } else {
                        Throwable th = mziVar.d;
                        if (th != null) {
                            throw th;
                        }
                        z = mziVar.c;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            l9bVar.g(null);
            if (!z2) {
                zhi zhiVar = new zhi(this.h, 3, this);
                pziVar.d = null;
                pziVar.g = 2;
                if (e9i.N(zhiVar, pziVar) == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        } catch (Throwable th2) {
            l9bVar.g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c A[Catch: all -> 0x0078, LOOP:0: B:24:0x0066->B:26:0x006c, LOOP_END, TryCatch #0 {all -> 0x0078, blocks: (B:23:0x0051, B:24:0x0066, B:26:0x006c, B:29:0x007a), top: B:34:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(nq4 nq4Var) {
        qzi qziVar;
        l9b l9bVar;
        ArrayList arrayList;
        Iterator it;
        if (nq4Var instanceof qzi) {
            qziVar = (qzi) nq4Var;
            int i = qziVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qziVar.g = i - Integer.MIN_VALUE;
            } else {
                qziVar = new qzi(this, nq4Var);
            }
        } else {
            qziVar = new qzi(this, nq4Var);
        }
        Object obj = qziVar.e;
        int i2 = qziVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            qziVar.g = 1;
            if (a(qziVar) != hu4Var) {
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
            l9bVar = qziVar.d;
            ch3.d0(obj);
        }
        try {
            c79 c79VarW = yab.w();
            zv zvVar = this.e;
            arrayList = new ArrayList(yw3.W0(zvVar, 10));
            it = zvVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((mzi) it.next()).a);
            }
            c79VarW.addAll(arrayList);
            return yab.j(c79VarW);
        } finally {
            l9bVar.g(null);
        }
        l9b l9bVar2 = this.d;
        qziVar.d = l9bVar2;
        qziVar.g = 2;
        if (l9bVar2.b(qziVar) != hu4Var) {
            l9bVar = l9bVar2;
            c79 c79VarW2 = yab.w();
            zv zvVar2 = this.e;
            arrayList = new ArrayList(yw3.W0(zvVar2, 10));
            it = zvVar2.iterator();
            while (it.hasNext()) {
                arrayList.add(((mzi) it.next()).a);
            }
            c79VarW2.addAll(arrayList);
            return yab.j(c79VarW2);
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(long j, nq4 nq4Var) throws Throwable {
        rzi rziVar;
        l9b l9bVar;
        long j2;
        Object obj;
        je9 je9Var = je9.f;
        if (nq4Var instanceof rzi) {
            rziVar = (rzi) nq4Var;
            int i = rziVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                rziVar.h = i - Integer.MIN_VALUE;
            } else {
                rziVar = new rzi(this, nq4Var);
            }
        } else {
            rziVar = new rzi(this, nq4Var);
        }
        rzi rziVar2 = rziVar;
        Object obj2 = rziVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = rziVar2.h;
        try {
            if (i2 == 0) {
                ch3.d0(obj2);
                l9b l9bVar2 = this.d;
                rziVar2.e = l9bVar2;
                rziVar2.d = j;
                rziVar2.h = 1;
                if (l9bVar2.b(rziVar2) != hu4Var) {
                    l9bVar = l9bVar2;
                    j2 = j;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                return obj2;
            }
            long j3 = rziVar2.d;
            l9b l9bVar3 = rziVar2.e;
            ch3.d0(obj2);
            l9bVar = l9bVar3;
            j2 = j3;
            u8b u8bVar = new u8b();
            zv zvVar = this.e;
            ArrayList<mzi> arrayList = new ArrayList();
            for (Object obj3 : zvVar) {
                try {
                    if (((mzi) obj3).c) {
                        arrayList.add(obj3);
                    }
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    l9bVar.g(obj);
                    throw th;
                }
            }
            for (mzi mziVar : arrayList) {
                u8bVar.b(new ylc(mziVar.a, new Long(mziVar.b)));
            }
            l9bVar.g(null);
            if (u8bVar.i()) {
                String str = this.f;
                a4c a4cVar = gm0.f;
                if (a4cVar == null || !a4cVar.b(je9Var)) {
                    return null;
                }
                a4cVar.c(je9Var, str, "No segments available for preview extraction", null);
                return null;
            }
            vfe vfeVar = new vfe();
            Object[] objArr = u8bVar.a;
            int i3 = u8bVar.b;
            long j4 = 0;
            Uri uri = null;
            for (int i4 = 0; i4 < i3; i4++) {
                ylc ylcVar = (ylc) objArr[i4];
                Uri uri2 = (Uri) ylcVar.a;
                long jLongValue = ((Number) ylcVar.b).longValue() + j4;
                if (j4 > j2 || j2 > jLongValue) {
                    j4 = jLongValue;
                } else {
                    vfeVar.a = j2 - j4;
                    uri = uri2;
                }
            }
            if (uri != null) {
                xt4 xt4VarB = ((n0c) ((xhh) this.a.getValue())).b();
                szi sziVar = new szi(this, uri, vfeVar, j2, (lq4) null);
                rziVar2.e = null;
                rziVar2.d = j2;
                rziVar2.h = 2;
                Object objK0 = yab.K0(xt4VarB, sziVar, rziVar2);
                return objK0 == hu4Var ? hu4Var : objK0;
            }
            String str2 = this.f;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null || !a4cVar2.b(je9Var)) {
                return null;
            }
            a4cVar2.c(je9Var, str2, "No segment found for positionMs = " + j2 + "; segments = " + u8bVar, null);
            return null;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(nq4 nq4Var) {
        tzi tziVar;
        l9b l9bVar;
        if (nq4Var instanceof tzi) {
            tziVar = (tzi) nq4Var;
            int i = tziVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tziVar.g = i - Integer.MIN_VALUE;
            } else {
                tziVar = new tzi(this, nq4Var);
            }
        } else {
            tziVar = new tzi(this, nq4Var);
        }
        Object obj = tziVar.e;
        int i2 = tziVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.d;
            tziVar.d = l9bVar2;
            tziVar.g = 1;
            Object objB = l9bVar2.b(tziVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = tziVar.d;
            ch3.d0(obj);
        }
        try {
            long j = 0;
            for (mzi mziVar : this.e) {
                if (mziVar.c) {
                    j += mziVar.b;
                }
            }
            return new Long(j);
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(boolean z, nq4 nq4Var) {
        uzi uziVar;
        l9b l9bVar;
        if (nq4Var instanceof uzi) {
            uziVar = (uzi) nq4Var;
            int i = uziVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                uziVar.h = i - Integer.MIN_VALUE;
            } else {
                uziVar = new uzi(this, nq4Var);
            }
        } else {
            uziVar = new uzi(this, nq4Var);
        }
        Object obj = uziVar.f;
        int i2 = uziVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.d;
            uziVar.e = l9bVar2;
            uziVar.d = z;
            uziVar.h = 1;
            Object objB = l9bVar2.b(uziVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = uziVar.d;
            l9bVar = uziVar.e;
            ch3.d0(obj);
        }
        try {
            c79 c79VarW = yab.w();
            zv<mzi> zvVar = this.e;
            ArrayList arrayList = new ArrayList();
            for (mzi mziVar : zvVar) {
                Uri uri = (!z || mziVar.c) ? mziVar.a : null;
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            c79VarW.addAll(arrayList);
            return yab.j(c79VarW);
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Uri uri, long j, Throwable th, nq4 nq4Var) {
        vzi vziVar;
        l9b l9bVar;
        Object next;
        if (nq4Var instanceof vzi) {
            vziVar = (vzi) nq4Var;
            int i = vziVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                vziVar.j = i - Integer.MIN_VALUE;
            } else {
                vziVar = new vzi(this, nq4Var);
            }
        } else {
            vziVar = new vzi(this, nq4Var);
        }
        Object obj = vziVar.h;
        int i2 = vziVar.j;
        if (i2 == 0) {
            ch3.d0(obj);
            vziVar.d = uri;
            vziVar.e = th;
            l9bVar = this.d;
            vziVar.f = l9bVar;
            vziVar.g = j;
            vziVar.j = 1;
            Object objB = l9bVar.b(vziVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = vziVar.g;
            l9b l9bVar2 = vziVar.f;
            th = (Throwable) vziVar.e;
            Uri uri2 = vziVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            uri = uri2;
        }
        try {
            Iterator it = this.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cqk.d(((mzi) next).a, uri));
            mzi mziVar = (mzi) next;
            if (mziVar != null) {
                mziVar.b = j;
            }
            if (mziVar != null) {
                mziVar.c = true;
            }
            if (mziVar != null) {
                mziVar.d = th;
            }
            l9bVar.g(null);
            pzf pzfVar = this.g;
            sbi sbiVar = sbi.a;
            pzfVar.a(sbiVar);
            return sbiVar;
        } catch (Throwable th2) {
            l9bVar.g(null);
            throw th2;
        }
    }

    public final void g() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "releaseAll called", null);
            }
        }
        tre.m0(new bye(new p7g(this.g.c(), (lq4) null, this)), this.c);
    }
}
