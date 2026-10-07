package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gj {
    public final cj a;
    public au3 b;
    public ArrayList c;
    public String d;

    public gj(gj gjVar) {
        ArrayList arrayList;
        cj cjVar = gjVar.a;
        cjVar.getClass();
        this.a = cjVar;
        this.b = au3.A(gjVar.b);
        ArrayList arrayList2 = gjVar.c;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(au3.A((au3) it.next()));
            }
            arrayList = arrayList3;
        }
        this.c = arrayList;
        this.d = gjVar.d;
    }

    public cj a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public gj(cj cjVar) {
        this.a = cjVar;
    }
}
