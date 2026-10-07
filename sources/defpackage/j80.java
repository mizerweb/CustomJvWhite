package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class j80 extends mdh implements qf7 {
    public m80 e;
    public m80 f;
    public ArrayList g;
    public long h;
    public int i;
    public final /* synthetic */ m80 j;
    public final /* synthetic */ List k;
    public final /* synthetic */ ArrayList l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(m80 m80Var, List list, ArrayList arrayList, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = m80Var;
        this.k = list;
        this.l = arrayList;
        this.m = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new j80(this.j, this.k, this.l, this.m, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((j80) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bf A[Catch: all -> 0x00bc, CancellationException -> 0x0121, TryCatch #0 {CancellationException -> 0x0121, blocks: (B:6:0x001b, B:29:0x00ab, B:31:0x00b1, B:42:0x00d2, B:44:0x00d6, B:46:0x00db, B:49:0x00e2, B:51:0x00e8, B:36:0x00bf, B:37:0x00c3, B:39:0x00c9, B:13:0x0039, B:21:0x0065, B:22:0x007e, B:24:0x0084, B:25:0x0097, B:16:0x0040, B:18:0x0046), top: B:60:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[Catch: all -> 0x00bc, CancellationException -> 0x0121, TryCatch #0 {CancellationException -> 0x0121, blocks: (B:6:0x001b, B:29:0x00ab, B:31:0x00b1, B:42:0x00d2, B:44:0x00d6, B:46:0x00db, B:49:0x00e2, B:51:0x00e8, B:36:0x00bf, B:37:0x00c3, B:39:0x00c9, B:13:0x0039, B:21:0x0065, B:22:0x007e, B:24:0x0084, B:25:0x0097, B:16:0x0040, B:18:0x0046), top: B:60:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6 A[Catch: all -> 0x00bc, CancellationException -> 0x0121, TryCatch #0 {CancellationException -> 0x0121, blocks: (B:6:0x001b, B:29:0x00ab, B:31:0x00b1, B:42:0x00d2, B:44:0x00d6, B:46:0x00db, B:49:0x00e2, B:51:0x00e8, B:36:0x00bf, B:37:0x00c3, B:39:0x00c9, B:13:0x0039, B:21:0x0065, B:22:0x007e, B:24:0x0084, B:25:0x0097, B:16:0x0040, B:18:0x0046), top: B:60:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00db A[Catch: all -> 0x00bc, CancellationException -> 0x0121, TryCatch #0 {CancellationException -> 0x0121, blocks: (B:6:0x001b, B:29:0x00ab, B:31:0x00b1, B:42:0x00d2, B:44:0x00d6, B:46:0x00db, B:49:0x00e2, B:51:0x00e8, B:36:0x00bf, B:37:0x00c3, B:39:0x00c9, B:13:0x0039, B:21:0x0065, B:22:0x007e, B:24:0x0084, B:25:0x0097, B:16:0x0040, B:18:0x0046), top: B:60:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0104 A[LOOP:1: B:54:0x00fe->B:56:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[LOOP:0: B:37:0x00c3->B:69:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        m80 m80Var;
        long j;
        m80 m80Var2;
        long j2;
        ArrayList<ylc> arrayList;
        boolean z;
        Object objC;
        Iterable iterable;
        Iterator it;
        boolean z2;
        i64 i64Var;
        String str;
        a4c a4cVar;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        hu4 hu4Var = hu4.a;
        int i = this.i;
        try {
            if (i == 0) {
                ch3.d0(obj);
                m80Var = this.j;
                List list = this.k;
                ArrayList arrayList2 = this.l;
                j = this.m;
                try {
                    String str2 = m80Var.a;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "Start fetching audio messages (size=" + arrayList2.size() + ")", null);
                    }
                    List list2 = list;
                    gu4 gu4Var = (gu4) m80Var.h.getValue();
                    ArrayList arrayList3 = new ArrayList(yw3.W0(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(yab.h(gu4Var, null, 0, new i80(it2.next(), null, m80Var, j), 3));
                    }
                    this.e = m80Var;
                    this.f = m80Var;
                    this.g = arrayList2;
                    this.h = j;
                    z = true;
                    this.i = 1;
                    objC = ch3.c(arrayList3, this);
                    if (objC == hu4Var) {
                        return hu4Var;
                    }
                    m80Var2 = m80Var;
                    arrayList = arrayList2;
                    iterable = (Iterable) objC;
                    if (!(iterable instanceof Collection)) {
                        it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            if (((Uri) it.next()) != null) {
                                z2 = z;
                                break;
                            }
                        }
                    } else {
                        it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            if (((Uri) it.next()) != null) {
                                z2 = z;
                                break;
                            }
                        }
                    }
                    i64Var = m80Var.j;
                    if (i64Var != null) {
                        i64Var.Q(sbiVar);
                    }
                    if (z2) {
                        str = m80Var.a;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4cVar.c(je9Var, str, "Fetching audio messages was completed successful", null);
                            return sbiVar;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    m80Var2 = m80Var;
                    j2 = j;
                    arrayList = arrayList2;
                    gm0.V(m80Var2.a, "Failed fetching audio messages", new g80("Failed fetching audio messages", th));
                    for (ylc ylcVar : arrayList) {
                        m80Var2.i.remove(m80.d(j2, ((Number) ylcVar.a).longValue(), (String) ylcVar.b));
                    }
                    return sbiVar;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = this.h;
                arrayList = this.g;
                m80Var2 = this.f;
                m80 m80Var3 = this.e;
                try {
                    ch3.d0(obj);
                    m80Var = m80Var3;
                    j = j2;
                    z = true;
                    objC = obj;
                    try {
                        iterable = (Iterable) objC;
                        if (!(iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                            z2 = false;
                            break;
                        }
                        it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            if (((Uri) it.next()) != null) {
                                z2 = z;
                                break;
                            }
                        }
                        i64Var = m80Var.j;
                        if (i64Var != null) {
                            i64Var.Q(sbiVar);
                        }
                        if (z2) {
                            str = m80Var.a;
                            a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "Fetching audio messages was completed successful", null);
                                return sbiVar;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j2 = j;
                        gm0.V(m80Var2.a, "Failed fetching audio messages", new g80("Failed fetching audio messages", th));
                        while (r0.hasNext()) {
                            m80Var2.i.remove(m80.d(j2, ((Number) ylcVar.a).longValue(), (String) ylcVar.b));
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gm0.V(m80Var2.a, "Failed fetching audio messages", new g80("Failed fetching audio messages", th));
                    while (r0.hasNext()) {
                        m80Var2.i.remove(m80.d(j2, ((Number) ylcVar.a).longValue(), (String) ylcVar.b));
                    }
                    return sbiVar;
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
