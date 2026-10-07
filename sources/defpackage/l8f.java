package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l8f implements aaf {
    public static final String f = j8f.class.getName();
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ifh e;

    public l8f(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var2;
        this.b = ny8Var4;
        this.c = ny8Var;
        this.d = ny8Var3;
        this.e = new ifh(new i8f(this, ny8Var5, context, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(l8f l8fVar, String str, nq4 nq4Var) {
        k8f k8fVar;
        long j;
        if (nq4Var instanceof k8f) {
            k8fVar = (k8f) nq4Var;
            int i = k8fVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                k8fVar.g = i - Integer.MIN_VALUE;
            } else {
                k8fVar = new k8f(l8fVar, nq4Var);
            }
        } else {
            k8fVar = new k8f(l8fVar, nq4Var);
        }
        Object objA = k8fVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = k8fVar.g;
        if (i2 == 0) {
            ch3.d0(objA);
            String name = l8f.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "[search][chats] local search worker", null);
                }
            }
            long jNanoTime = System.nanoTime();
            z9f z9fVar = (z9f) l8fVar.e.getValue();
            k8fVar.d = jNanoTime;
            k8fVar.g = 1;
            objA = z9fVar.a(str, k8fVar);
            if (objA == hu4Var) {
                return hu4Var;
            }
            j = jNanoTime;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = k8fVar.d;
            ch3.d0(objA);
        }
        List<f9f> list = (List) objA;
        m8b m8bVar = new m8b();
        m8b m8bVar2 = new m8b();
        m8b m8bVar3 = new m8b();
        ArrayList arrayList = new ArrayList(list.size());
        for (f9f f9fVar : list) {
            rt2 rt2Var = f9fVar.d;
            if (rt2Var == null || m8bVar.d(rt2Var.a)) {
                vg4 vg4Var = f9fVar.e;
                if (vg4Var == null || m8bVar2.d(vg4Var.v())) {
                    gda gdaVar = f9fVar.f;
                    if (gdaVar == null || m8bVar3.d(gdaVar.a)) {
                        arrayList.add(f9fVar);
                    } else {
                        m8bVar3.a(f9fVar.f.a);
                        arrayList.add(f9fVar);
                    }
                } else {
                    m8bVar2.a(f9fVar.e.v());
                    arrayList.add(f9fVar);
                }
            } else {
                m8bVar.a(f9fVar.d.a);
                arrayList.add(f9fVar);
            }
        }
        String str2 = f;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.e;
            if (a4cVar2.b(je9Var2)) {
                ghb ghbVar = ew5.b;
                a4cVar2.c(je9Var2, str2, nbh.s(ew5.g(qe7.P(System.nanoTime() - j, lw5.NANOSECONDS)), "localSearchWorker, local search finish: ", " ms"), null);
            }
        }
        return ww3.M1(arrayList, new z70(5, new rea(2, l8fVar, l8f.class, "compareSearchResult", "compareSearchResult(Lru/ok/tamtam/search/SearchResult;Lru/ok/tamtam/search/SearchResult;)I", 0, 16)));
    }

    @Override // defpackage.aaf
    public final j3 a(int i, Object obj, String str) {
        lq4 lq4Var = null;
        return new j3(new bye(new voc(str, this, lq4Var, 24)), 14, new jy6(3, lq4Var, 2));
    }
}
