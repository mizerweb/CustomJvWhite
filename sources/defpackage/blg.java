package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class blg {
    public long a;
    public int b;
    public int c;
    public String d;
    public long e;
    public String f;
    public String g;
    public String h;
    public List i;
    public int j;
    public long k;
    public String l;
    public boolean m;
    public int n;
    public String o;

    public clg a() {
        if (this.i == null) {
            this.i = Collections.EMPTY_LIST;
        }
        if (this.j == 0) {
            this.j = 1;
        }
        if (this.n == 0) {
            this.n = 1;
        }
        return new clg(this);
    }
}
