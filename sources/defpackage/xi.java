package defpackage;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* JADX INFO: loaded from: classes.dex */
public final class xi implements e68 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e68
    public final xt3 a(p76 p76Var, int i, i1e i1eVar, d68 d68Var) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) obj;
                if (animatedFactoryV2Impl.e == null) {
                    animatedFactoryV2Impl.e = new ej(new rj5(2, animatedFactoryV2Impl), animatedFactoryV2Impl.a, animatedFactoryV2Impl.k);
                }
                ej ejVar = animatedFactoryV2Impl.e;
                Bitmap.Config config = d68Var.b;
                ejVar.getClass();
                return ej.a(p76Var, d68Var);
            default:
                p76Var.Y();
                i68 i68Var = p76Var.b;
                ib5 ib5Var = (ib5) obj;
                Boolean bool = Boolean.FALSE;
                d68Var.getClass();
                if (i68Var == kb5.a) {
                    au3 au3VarB = ib5Var.c.b(p76Var, d68Var.a, i, null);
                    try {
                        au3VarB.getClass();
                        p76Var.Y();
                        int i3 = p76Var.c;
                        p76Var.Y();
                        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(au3VarB, i1eVar, i3, p76Var.d);
                        closeableStaticBitmapOf.putExtra(HasExtraData.KEY_IS_ROUNDED, bool);
                        au3VarB.close();
                        return closeableStaticBitmapOf;
                    } catch (Throwable th) {
                        au3.E(au3VarB);
                        throw th;
                    }
                }
                if (i68Var == kb5.c) {
                    p76Var.Y();
                    if (p76Var.e != -1) {
                        p76Var.Y();
                        if (p76Var.f != -1) {
                            d68Var.getClass();
                            e68 e68Var = ib5Var.a;
                            return e68Var != null ? e68Var.a(p76Var, i, i1eVar, d68Var) : ib5Var.b(p76Var, d68Var);
                        }
                    }
                    throw new DecodeException("image width or height is incorrect", p76Var);
                }
                if (i68Var == kb5.j) {
                    d68Var.getClass();
                    e68 e68Var2 = ib5Var.b;
                    return e68Var2 != null ? e68Var2.a(p76Var, i, i1eVar, d68Var) : ib5Var.b(p76Var, d68Var);
                }
                if (i68Var == kb5.m) {
                    return null;
                }
                if (i68Var != i68.c) {
                    return ib5Var.b(p76Var, d68Var);
                }
                throw new DecodeException("unknown image format", p76Var);
        }
    }
}
