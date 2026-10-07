package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kub {
    public cvb c;
    public final mjg a = p90.a(null);
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final l9b d = new l9b();

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(cvb cvbVar, nq4 nq4Var) {
        jub jubVar;
        l9b l9bVar;
        boolean z;
        if (nq4Var instanceof jub) {
            jubVar = (jub) nq4Var;
            int i = jubVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jubVar.h = i - Integer.MIN_VALUE;
            } else {
                jubVar = new jub(this, nq4Var);
            }
        } else {
            jubVar = new jub(this, nq4Var);
        }
        Object obj = jubVar.f;
        int i2 = jubVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            jubVar.d = cvbVar;
            l9bVar = this.d;
            jubVar.e = l9bVar;
            jubVar.h = 1;
            Object objB = l9bVar.b(jubVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9b l9bVar2 = jubVar.e;
            cvb cvbVar2 = jubVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            cvbVar = cvbVar2;
        }
        try {
            cvb cvbVar3 = this.c;
            if (cvbVar3 == null || cvbVar3 == cvbVar) {
                boolean zH = this.a.h(null, cvbVar);
                if (zH) {
                    this.c = cvbVar;
                }
                z = zH;
            }
            return Boolean.valueOf(z);
        } finally {
            l9bVar.g(null);
        }
    }
}
