package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes.dex */
public final class qy4 extends mdh implements qf7 {
    public j9b e;
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ l9b i;
    public final /* synthetic */ sy4 j;
    public final /* synthetic */ ny8 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy4(l9b l9bVar, lq4 lq4Var, sy4 sy4Var, ny8 ny8Var) {
        super(2, lq4Var);
        this.i = l9bVar;
        this.j = sy4Var;
        this.k = ny8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new qy4(this.i, lq4Var, this.j, this.k);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((qy4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:28:0x007e, B:48:0x00e1, B:49:0x00e9, B:51:0x00ef, B:52:0x0118, B:54:0x011e, B:55:0x0131, B:60:0x014d, B:61:0x0156, B:62:0x016b, B:31:0x008b, B:33:0x0093, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:40:0x00b9, B:43:0x00d3, B:44:0x00d6, B:45:0x00d7, B:47:0x00de, B:24:0x005a), top: B:80:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:28:0x007e, B:48:0x00e1, B:49:0x00e9, B:51:0x00ef, B:52:0x0118, B:54:0x011e, B:55:0x0131, B:60:0x014d, B:61:0x0156, B:62:0x016b, B:31:0x008b, B:33:0x0093, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:40:0x00b9, B:43:0x00d3, B:44:0x00d6, B:45:0x00d7, B:47:0x00de, B:24:0x005a), top: B:80:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:28:0x007e, B:48:0x00e1, B:49:0x00e9, B:51:0x00ef, B:52:0x0118, B:54:0x011e, B:55:0x0131, B:60:0x014d, B:61:0x0156, B:62:0x016b, B:31:0x008b, B:33:0x0093, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:40:0x00b9, B:43:0x00d3, B:44:0x00d6, B:45:0x00d7, B:47:0x00de, B:24:0x005a), top: B:80:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:28:0x007e, B:48:0x00e1, B:49:0x00e9, B:51:0x00ef, B:52:0x0118, B:54:0x011e, B:55:0x0131, B:60:0x014d, B:61:0x0156, B:62:0x016b, B:31:0x008b, B:33:0x0093, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:40:0x00b9, B:43:0x00d3, B:44:0x00d6, B:45:0x00d7, B:47:0x00de, B:24:0x005a), top: B:80:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9 A[Catch: all -> 0x00cf, LOOP:2: B:36:0x00ab->B:40:0x00b9, LOOP_END, TryCatch #2 {all -> 0x00cf, blocks: (B:28:0x007e, B:48:0x00e1, B:49:0x00e9, B:51:0x00ef, B:52:0x0118, B:54:0x011e, B:55:0x0131, B:60:0x014d, B:61:0x0156, B:62:0x016b, B:31:0x008b, B:33:0x0093, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:40:0x00b9, B:43:0x00d3, B:44:0x00d6, B:45:0x00d7, B:47:0x00de, B:24:0x005a), top: B:80:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:28:0x007e, B:48:0x00e1, B:49:0x00e9, B:51:0x00ef, B:52:0x0118, B:54:0x011e, B:55:0x0131, B:60:0x014d, B:61:0x0156, B:62:0x016b, B:31:0x008b, B:33:0x0093, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:40:0x00b9, B:43:0x00d3, B:44:0x00d6, B:45:0x00d7, B:47:0x00de, B:24:0x005a), top: B:80:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011e A[Catch: all -> 0x00cf, LOOP:1: B:52:0x0118->B:54:0x011e, LOOP_END, TryCatch #2 {all -> 0x00cf, blocks: (B:28:0x007e, B:48:0x00e1, B:49:0x00e9, B:51:0x00ef, B:52:0x0118, B:54:0x011e, B:55:0x0131, B:60:0x014d, B:61:0x0156, B:62:0x016b, B:31:0x008b, B:33:0x0093, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:40:0x00b9, B:43:0x00d3, B:44:0x00d6, B:45:0x00d7, B:47:0x00de, B:24:0x005a), top: B:80:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:28:0x007e, B:48:0x00e1, B:49:0x00e9, B:51:0x00ef, B:52:0x0118, B:54:0x011e, B:55:0x0131, B:60:0x014d, B:61:0x0156, B:62:0x016b, B:31:0x008b, B:33:0x0093, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:40:0x00b9, B:43:0x00d3, B:44:0x00d6, B:45:0x00d7, B:47:0x00de, B:24:0x005a), top: B:80:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:68:0x0195  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:8:0x0015, B:66:0x0184, B:69:0x0196, B:71:0x019e), top: B:78:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x019e A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #1 {all -> 0x001a, blocks: (B:8:0x0015, B:66:0x0184, B:69:0x0196, B:71:0x019e), top: B:78:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d3 A[SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        j9b j9bVar;
        int i;
        j9b j9bVar2;
        Object objI;
        int i2;
        int i3;
        int i4;
        Map map;
        String str;
        a4c a4cVar;
        je9 je9Var;
        String string;
        StringBuilder sb;
        int i5;
        pzf pzfVar;
        u8b u8bVar;
        ArrayList arrayList;
        Iterator it;
        r17 r17VarC;
        boolean z;
        String str2;
        a4c a4cVar2;
        je9 je9Var2;
        hu4 hu4Var = hu4.a;
        int i6 = this.h;
        int i7 = 0;
        try {
            if (i6 == 0) {
                ch3.d0(obj);
                j9bVar = this.i;
                this.e = j9bVar;
                this.f = 0;
                this.h = 1;
                if (j9bVar.b(this) != hu4Var) {
                    i = 0;
                }
                return hu4Var;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j9bVar2 = this.e;
                    try {
                        ch3.d0(obj);
                        i64 i64Var = this.j.o;
                        sbi sbiVar = sbi.a;
                        i64Var.Q(sbiVar);
                        str2 = this.j.c;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9Var2 = je9.e;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, "Loaded all cached folders", null);
                            }
                        }
                        j9bVar2.g(null);
                        return sbiVar;
                    } catch (Throwable th) {
                        th = th;
                        j9bVar2.g(null);
                        throw th;
                    }
                }
                int i8 = this.l;
                int i9 = this.g;
                int i10 = this.f;
                j9b j9bVar3 = this.e;
                try {
                    ch3.d0(obj);
                    i3 = i10;
                    i4 = i8;
                    j9bVar = j9bVar3;
                    i2 = i9;
                    objI = obj;
                    map = (Map) objI;
                    str = this.j.c;
                    a4cVar = gm0.f;
                    if (a4cVar == null) {
                        je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            if (map.isEmpty()) {
                                string = "No folders in cache";
                            } else {
                                sb = new StringBuilder();
                                sb.append("Loaded folders from cache:");
                                for (Object obj2 : map.keySet()) {
                                    i5 = i7 + 1;
                                    if (i7 >= 0) {
                                        xw3.V0();
                                        throw null;
                                    }
                                    sb.append(i7);
                                    sb.append("->");
                                    sb.append((rqe) obj2);
                                    sb.append('\n');
                                    i7 = i5;
                                }
                                string = sb.toString();
                            }
                            a4cVar.c(je9Var, str, string, null);
                        }
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        rqe rqeVar = (rqe) entry.getKey();
                        List list = (List) entry.getValue();
                        o4c o4cVar = (o4c) this.k.getValue();
                        List list2 = list;
                        arrayList = new ArrayList(yw3.W0(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Long(((iu2) it.next()).a()));
                        }
                        r17VarC = f55.C(rqeVar, o4cVar, new pw(arrayList), 12);
                        if (this.j.l.h(r17VarC.a) >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            this.j.l.b(r17VarC.a);
                        }
                        sy4 sy4Var = this.j;
                        ConcurrentHashMap concurrentHashMap = sy4Var.k;
                        String str3 = rqeVar.a;
                        final by4 by4Var = new by4(r17VarC, sy4Var);
                        concurrentHashMap.compute(str3, new BiFunction() { // from class: py4
                            @Override // java.util.function.BiFunction
                            public final /* synthetic */ Object apply(Object obj3, Object obj4) {
                                return by4Var.invoke(obj3, obj4);
                            }
                        });
                    }
                    sy4 sy4Var2 = this.j;
                    pzfVar = sy4Var2.m;
                    u8bVar = sy4Var2.l;
                    this.e = j9bVar;
                    this.f = i3;
                    this.g = i2;
                    this.l = i4;
                    this.h = 3;
                    if (pzfVar.emit(u8bVar, this) != hu4Var) {
                        j9bVar2 = j9bVar;
                        i64 i64Var2 = this.j.o;
                        sbi sbiVar2 = sbi.a;
                        i64Var2.Q(sbiVar2);
                        str2 = this.j.c;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9Var2 = je9.e;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, "Loaded all cached folders", null);
                            }
                        }
                        j9bVar2.g(null);
                        return sbiVar2;
                    }
                    return hu4Var;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2 = j9bVar3;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            int i11 = this.f;
            j9b j9bVar4 = this.e;
            ch3.d0(obj);
            i = i11;
            j9bVar = j9bVar4;
            bre breVarK = this.j.k();
            this.e = j9bVar;
            this.f = i;
            this.g = 0;
            this.l = 0;
            this.h = 2;
            objI = ch3.I(this, breVarK.a, true, false, new ik4(29));
            if (objI != hu4Var) {
                i2 = 0;
                i3 = i;
                i4 = 0;
                map = (Map) objI;
                str = this.j.c;
                a4cVar = gm0.f;
                if (a4cVar == null) {
                    je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        if (map.isEmpty()) {
                            sb = new StringBuilder();
                            sb.append("Loaded folders from cache:");
                            while (r5.hasNext()) {
                                i5 = i7 + 1;
                                if (i7 >= 0) {
                                    xw3.V0();
                                    throw null;
                                }
                                sb.append(i7);
                                sb.append("->");
                                sb.append((rqe) obj2);
                                sb.append('\n');
                                i7 = i5;
                            }
                            string = sb.toString();
                        } else {
                            string = "No folders in cache";
                        }
                        a4cVar.c(je9Var, str, string, null);
                    }
                }
                while (r3.hasNext()) {
                    rqe rqeVar2 = (rqe) entry.getKey();
                    List list3 = (List) entry.getValue();
                    o4c o4cVar2 = (o4c) this.k.getValue();
                    List list4 = list3;
                    arrayList = new ArrayList(yw3.W0(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Long(((iu2) it.next()).a()));
                    }
                    r17VarC = f55.C(rqeVar2, o4cVar2, new pw(arrayList), 12);
                    if (this.j.l.h(r17VarC.a) >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        this.j.l.b(r17VarC.a);
                    }
                    sy4 sy4Var3 = this.j;
                    ConcurrentHashMap concurrentHashMap2 = sy4Var3.k;
                    String str4 = rqeVar2.a;
                    final by4 by4Var2 = new by4(r17VarC, sy4Var3);
                    concurrentHashMap2.compute(str4, new BiFunction() { // from class: py4
                        @Override // java.util.function.BiFunction
                        public final /* synthetic */ Object apply(Object obj3, Object obj4) {
                            return by4Var2.invoke(obj3, obj4);
                        }
                    });
                }
                sy4 sy4Var4 = this.j;
                pzfVar = sy4Var4.m;
                u8bVar = sy4Var4.l;
                this.e = j9bVar;
                this.f = i3;
                this.g = i2;
                this.l = i4;
                this.h = 3;
                if (pzfVar.emit(u8bVar, this) != hu4Var) {
                    j9bVar2 = j9bVar;
                    i64 i64Var3 = this.j.o;
                    sbi sbiVar3 = sbi.a;
                    i64Var3.Q(sbiVar3);
                    str2 = this.j.c;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "Loaded all cached folders", null);
                        }
                    }
                    j9bVar2.g(null);
                    return sbiVar3;
                }
            }
            return hu4Var;
        } catch (Throwable th3) {
            th = th3;
            j9bVar2 = j9bVar;
            j9bVar2.g(null);
            throw th;
        }
    }
}
