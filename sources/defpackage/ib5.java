package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ib5 implements e68 {
    public final e68 a;
    public final e68 b;
    public final l2d c;
    public final xi d = new xi(1, this);
    public final Map e;

    public ib5(xi xiVar, vi viVar, l2d l2dVar, HashMap map) {
        this.a = xiVar;
        this.b = viVar;
        this.c = l2dVar;
        this.e = map;
    }

    @Override // defpackage.e68
    public final xt3 a(p76 p76Var, int i, i1e i1eVar, d68 d68Var) throws Throwable {
        InputStream inputStreamA;
        e68 e68Var;
        d68Var.getClass();
        p76Var.Y();
        i68 i68VarZ = p76Var.b;
        if ((i68VarZ == null || i68VarZ == i68.c) && (inputStreamA = p76Var.A()) != null) {
            ny8 ny8Var = k68.d;
            try {
                i68VarZ = vd7.z(inputStreamA);
                p76Var.b = i68VarZ;
            } catch (IOException e) {
                ayl.b(e);
                throw null;
            }
        }
        Map map = this.e;
        return (map == null || (e68Var = (e68) map.get(i68VarZ)) == null) ? this.d.a(p76Var, i, i1eVar, d68Var) : e68Var.a(p76Var, i, i1eVar, d68Var);
    }

    public final CloseableStaticBitmap b(p76 p76Var, d68 d68Var) {
        au3 au3VarA = this.c.a(p76Var, d68Var.a);
        try {
            au3VarA.getClass();
            s98 s98Var = s98.d;
            p76Var.Y();
            int i = p76Var.c;
            p76Var.Y();
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(au3VarA, s98Var, i, p76Var.d);
            closeableStaticBitmapOf.putExtra(HasExtraData.KEY_IS_ROUNDED, Boolean.FALSE);
            au3VarA.close();
            return closeableStaticBitmapOf;
        } catch (Throwable th) {
            au3.E(au3VarA);
            throw th;
        }
    }
}
