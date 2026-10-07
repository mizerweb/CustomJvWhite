package defpackage;

import android.graphics.Bitmap;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class xo2 implements qcd {
    public static final /* synthetic */ zv8[] c;
    public final qcd[] a;
    public final ifh b = new ifh(new yk1(21, this));

    static {
        y8b y8bVar = new y8b("result", xo2.class);
        zfe.a.getClass();
        c = new zv8[]{y8bVar};
    }

    public xo2(qcd[] qcdVarArr) {
        this.a = qcdVarArr;
        if (qcdVarArr.length != 0) {
            return;
        }
        ore.k("postprocessors must be not empty!");
        throw null;
    }

    @Override // defpackage.qcd
    public final au3 a(Bitmap bitmap, k2d k2dVar) {
        Object[] objArr;
        qcd[] qcdVarArr = this.a;
        if (qcdVarArr.length == 1) {
            return ((qcd) a.a1(qcdVarArr)).a(bitmap, k2dVar);
        }
        int length = qcdVarArr.length;
        au3 au3VarA = null;
        int i = 0;
        Object objK = bitmap;
        while (true) {
            objArr = c;
            if (i >= length) {
                break;
            }
            au3VarA = qcdVarArr[i].a((Bitmap) objK, k2dVar);
            Object obj = objArr[0];
            i++;
            objK = au3VarA.K();
        }
        Object obj2 = objArr[0];
        if (au3VarA != null) {
            return au3VarA;
        }
        qr7.q(((l72) obj2).getName(), " should be initialized before get.", "Property ");
        return null;
    }

    @Override // defpackage.qcd
    public final v71 b() {
        return (l6g) this.b.getValue();
    }

    @Override // defpackage.qcd
    public final String getName() {
        return ((l6g) this.b.getValue()).a;
    }
}
