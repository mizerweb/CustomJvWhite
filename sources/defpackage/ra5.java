package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class ra5 implements nj6 {
    public static final int[] l = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final v2a m = new v2a(new c(19));
    public static final v2a n = new v2a(new c(20));
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ghe g;
    public int j;
    public int k;
    public lhb i = new lhb(16);
    public boolean h = true;

    @Override // defpackage.nj6
    public final void a(boolean z) {
        synchronized (this) {
            this.h = z;
        }
    }

    @Override // defpackage.nj6
    public final void b(lhb lhbVar) {
        synchronized (this) {
            this.i = lhbVar;
        }
    }

    @Override // defpackage.nj6
    public final void c() {
        synchronized (this) {
        }
    }

    @Override // defpackage.nj6
    public final synchronized jj6[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = l;
            arrayList = new ArrayList(21);
            int iC = uxl.c(map);
            if (iC != -1) {
                f(iC, arrayList);
            }
            int iD = uxl.d(uri);
            if (iD != -1 && iD != iC) {
                f(iD, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iC && i2 != iD) {
                    f(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (jj6[]) arrayList.toArray(new jj6[0]);
    }

    @Override // defpackage.nj6
    public final synchronized jj6[] e() {
        return d(Uri.EMPTY, new HashMap());
    }

    public final void f(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new f4());
                break;
            case 1:
                arrayList.add(new h4());
                break;
            case 2:
                arrayList.add(new le((this.b ? 1 : 0) | this.c));
                break;
            case 3:
                arrayList.add(new sf((this.b ? 1 : 0) | this.d));
                break;
            case 4:
                jj6 jj6VarH = m.H(0);
                if (jj6VarH == null) {
                    arrayList.add(new zw6());
                } else {
                    arrayList.add(jj6VarH);
                }
                break;
            case 5:
                arrayList.add(new m17());
                break;
            case 6:
                arrayList.add(new to9(this.i, this.e | (this.h ? 0 : 2)));
                break;
            case 7:
                arrayList.add(new i2b(this.b ? 1 : 0));
                break;
            case 8:
                arrayList.add(new sb7(this.i, this.h ? 0 : 32));
                arrayList.add(new q2b(this.i, this.f | (this.h ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new asb());
                break;
            case 10:
                arrayList.add(new wxd());
                break;
            case 11:
                if (this.g == null) {
                    a98 a98Var = c98.b;
                    this.g = ghe.e;
                }
                arrayList.add(new k5i(1, !this.h ? 1 : 0, this.i, new dth(0L), new we5(0, this.g)));
                break;
            case 12:
                arrayList.add(new rcj());
                break;
            case 14:
                arrayList.add(new ic5(this.j));
                break;
            case 15:
                jj6 jj6VarH2 = n.H(new Object[0]);
                if (jj6VarH2 != null) {
                    arrayList.add(jj6VarH2);
                }
                break;
            case 16:
                arrayList.add(new wk0(1 ^ (this.h ? 1 : 0), this.i));
                break;
            case 17:
                arrayList.add(new uz0(1));
                break;
            case 18:
                arrayList.add(new zk0(1));
                break;
            case 19:
                arrayList.add(new uz0(0));
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                arrayList.add(new vu7(this.k));
                break;
            case 21:
                arrayList.add(new zk0(0));
                break;
        }
    }
}
