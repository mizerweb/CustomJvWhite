package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface hw7 {
    public static final fw7 a = fw7.a;

    default boolean a() {
        return false;
    }

    default boolean b() {
        return true;
    }

    default Comparator c() {
        a.getClass();
        return fw7.b;
    }

    long d();

    default long e() {
        return -1L;
    }

    default boolean f() {
        return false;
    }

    default tq3 g(long j) {
        Object obj;
        List listL = l();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (((tq3) obj2).a() > j) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long jC = ((tq3) next).c();
                do {
                    Object next2 = it.next();
                    long jC2 = ((tq3) next2).c();
                    if (jC > jC2) {
                        next = next2;
                        jC = jC2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (tq3) obj;
    }

    default Comparator h() {
        a.getClass();
        return fw7.c;
    }

    default tq3 i(long j) {
        Object obj;
        List listL = l();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (((tq3) obj2).c() < j) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long jC = ((tq3) next).c();
                do {
                    Object next2 = it.next();
                    long jC2 = ((tq3) next2).c();
                    if (jC < jC2) {
                        next = next2;
                        jC = jC2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (tq3) obj;
    }

    default String j() {
        return null;
    }

    long k();

    List l();
}
