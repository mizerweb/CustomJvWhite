package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class n0j {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final String f = n0j.class.getName();

    public n0j(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var5;
        this.e = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(n0j n0jVar, String str, nq4 nq4Var) {
        m0j m0jVar;
        if (nq4Var instanceof m0j) {
            m0jVar = (m0j) nq4Var;
            int i = m0jVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0jVar.f = i - Integer.MIN_VALUE;
            } else {
                m0jVar = new m0j(n0jVar, nq4Var);
            }
        } else {
            m0jVar = new m0j(n0jVar, nq4Var);
        }
        Object obj = m0jVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = m0jVar.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            i0j i0jVar = (i0j) n0jVar.d.getValue();
            m0jVar.f = 1;
            Object objA = i0jVar.a(str, m0jVar);
            return objA == hu4Var ? hu4Var : objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str2 = n0jVar.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qv1.k("getStoredPreparation: failed, ", th.getMessage()), th);
                }
            }
            return null;
        }
    }

    public static final m6a b(n0j n0jVar, ArrayList arrayList, File file, float f, float f2, boolean z) {
        w5a w5aVar = new w5a((Context) n0jVar.a.getValue());
        w5aVar.c = file.getPath();
        w5aVar.d = new qx9(z);
        w5aVar.k = true;
        w5aVar.e = f;
        w5aVar.f = f2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w5aVar.a(Uri.fromFile((File) it.next()));
        }
        return w5aVar.b().z();
    }
}
