package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gx7 extends tcf {
    public static void i(sx7 sx7Var, px7 px7Var, HashSet hashSet, ArrayList arrayList) {
        String str = sx7Var.a;
        long j = sx7Var.h + px7Var.e;
        String str2 = px7Var.g;
        if (str2 != null) {
            Uri uriE = w1m.e(str, str2);
            if (hashSet.add(uriE)) {
                arrayList.add(new rcf(j, tcf.d(uriE)));
            }
        }
        arrayList.add(new rcf(j, new a35(px7Var.i, px7Var.j, w1m.e(str, px7Var.a))));
    }

    @Override // defpackage.tcf
    public final ArrayList e(k71 k71Var, ou6 ou6Var, boolean z) throws IOException {
        xx7 xx7Var = (xx7) ou6Var;
        ArrayList<a35> arrayList = new ArrayList();
        if (xx7Var instanceof wx7) {
            List list = ((wx7) xx7Var).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(tcf.d((Uri) list.get(i)));
            }
        } else {
            arrayList.add(tcf.d(Uri.parse(xx7Var.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (a35 a35Var : arrayList) {
            arrayList2.add(new rcf(0L, a35Var));
            try {
                try {
                    sx7 sx7Var = (sx7) ((ou6) c(new ncf(this, k71Var, a35Var), z));
                    c98 c98Var = sx7Var.r;
                    long j = z == 0 ? this.a : 0L;
                    long j2 = z ? -9223372036854775807L : this.b;
                    px7 px7Var = null;
                    for (int i2 = 0; i2 < c98Var.size(); i2++) {
                        px7 px7Var2 = (px7) c98Var.get(i2);
                        long j3 = sx7Var.h + px7Var2.e;
                        if (j3 + px7Var2.c > j) {
                            if (j2 != -9223372036854775807L && j3 >= j + j2) {
                                break;
                            }
                            px7 px7Var3 = px7Var2.b;
                            if (px7Var3 != null && px7Var3 != px7Var) {
                                i(sx7Var, px7Var3, hashSet, arrayList2);
                                px7Var = px7Var3;
                            }
                            i(sx7Var, px7Var2, hashSet, arrayList2);
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    if (!z) {
                        throw e;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        return arrayList2;
    }
}
