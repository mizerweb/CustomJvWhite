package defpackage;

import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ore implements d4f, rf7, bg7, EngineCore.EventPacker {
    public final /* synthetic */ int a;

    public /* synthetic */ ore(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void c(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void d(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void f(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void h(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void i() {
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void l(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void m() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void n(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void o() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void q(String str) {
        throw new RuntimeException(str);
    }

    @Override // defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        kg4 kg4Var;
        long j;
        long jG;
        switch (this.a) {
            case 7:
                return Long.valueOf(((clg) obj).a);
            case 8:
                return Long.valueOf(((emg) obj).a);
            case 9:
                return Long.valueOf(((emg) obj).a);
            default:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                    lzj lzjVar = (lzj) it.next();
                    List list3 = lzjVar.q;
                    kyj kyjVar = lzjVar.b;
                    d25 d25Var = !list3.isEmpty() ? (d25) list3.get(0) : d25.b;
                    UUID uuidFromString = UUID.fromString(lzjVar.a);
                    HashSet hashSet = new HashSet(lzjVar.p);
                    d25 d25Var2 = lzjVar.c;
                    int i = lzjVar.h;
                    int i2 = lzjVar.m;
                    kg4 kg4Var2 = lzjVar.g;
                    long j2 = lzjVar.d;
                    ArrayList arrayList2 = arrayList;
                    long j3 = lzjVar.e;
                    jyj jyjVar = j3 != 0 ? new jyj(j3, lzjVar.f) : null;
                    kyj kyjVar2 = kyj.a;
                    if (kyjVar == kyjVar2) {
                        String str = mzj.z;
                        j = j2;
                        kg4Var = kg4Var2;
                        jG = sb8.g(kyjVar == kyjVar2 && i > 0, i, lzjVar.i, lzjVar.j, lzjVar.k, lzjVar.l, j3 != 0, j, lzjVar.f, j3, lzjVar.n);
                    } else {
                        i2 = i2;
                        kg4Var = kg4Var2;
                        j = j2;
                        i = i;
                        jG = BuildConfig.MAX_TIME_TO_UPLOAD;
                    }
                    arrayList2.add(new lyj(uuidFromString, kyjVar, hashSet, d25Var2, d25Var, i, i2, kg4Var, j, jyjVar, jG, lzjVar.o));
                    arrayList = arrayList2;
                }
                return arrayList;
        }
    }

    @Override // defpackage.d4f
    public void b() {
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        return d.a(insertEventTools);
    }
}
