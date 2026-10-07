package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class di4 {
    public long a;
    public String b;
    public String c;
    public String d;
    public long e;
    public List f;
    public long g;
    public long h;
    public ii4 i;
    public int j;
    public ji4 k;
    public int l;
    public int m;
    public String n;
    public String o;
    public String p;
    public long q;
    public long r;
    public long s;
    public gi4 t;
    public int[] u;
    public hi4 v;
    public String w;
    public List x;
    public long y;
    public ix2 z = ix2.d;

    public final ki4 a() {
        if (this.k == null) {
            this.k = ji4.b;
        }
        if (this.l == 0) {
            this.l = 1;
        }
        List list = this.f;
        if (list == null || list.isEmpty()) {
            this.f = Collections.singletonList(fi4.e);
        }
        if (this.u == null) {
            this.u = new int[0];
        }
        return new ki4(this);
    }
}
