package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wx7 extends xx7 {
    public static final wx7 l;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final b87 h;
    public final List i;
    public final Map j;
    public final List k;

    static {
        List list = Collections.EMPTY_LIST;
        l = new wx7("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public wx7(String str, List list, List list2, List list3, List list4, List list5, List list6, b87 b87Var, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((vx7) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
        this.g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.h = b87Var;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((ux7) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                k4h k4hVar = (k4h) list2.get(i3);
                if (k4hVar.b == i && k4hVar.c == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.ou6
    public final Object a(List list) {
        ArrayList arrayListC = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new wx7(this.a, this.b, arrayListC, list2, c(1, this.f, list), c(2, this.g, list), list2, this.h, this.i, this.c, this.j, this.k);
    }
}
