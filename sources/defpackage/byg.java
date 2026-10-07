package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class byg extends mdh implements qf7 {
    public vsg e;
    public int f;
    public final /* synthetic */ dyg g;
    public final /* synthetic */ Bitmap h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ List k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ i6a n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byg(dyg dygVar, Bitmap bitmap, int i, int i2, List list, int i3, int i4, i6a i6aVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = dygVar;
        this.h = bitmap;
        this.i = i;
        this.j = i2;
        this.k = list;
        this.l = i3;
        this.m = i4;
        this.n = i6aVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new byg(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((byg) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        vsg vsgVar;
        Object objG;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            vsgVar = (vsg) this.g.a.V4.a(e5d.S6[309]).i();
            int i2 = vsgVar.a;
            int i3 = vsgVar.b;
            dyg dygVar = this.g;
            Bitmap bitmap = this.h;
            int i4 = this.i;
            int i5 = this.j;
            List list = this.k;
            int i6 = this.l;
            int i7 = this.m;
            i6a i6aVar = this.n;
            this.e = vsgVar;
            this.f = 1;
            objG = dyg.g(dygVar, bitmap, i4, i5, list, i6, i7, i2, i3, i6aVar, this);
            if (objG != hu4Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vsg vsgVar2 = this.e;
        ch3.d0(obj);
        vsgVar = vsgVar2;
        objG = obj;
        au3 au3Var = (au3) objG;
        if (au3Var != null) {
            return au3Var;
        }
        String str = this.g.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qt4.l("StoryImageRenderer: video overlay fallback to ", vsgVar.c, vsgVar.d, "x"), null);
            }
        }
        int i8 = vsgVar.c;
        int i9 = vsgVar.d;
        dyg dygVar2 = this.g;
        Bitmap bitmap2 = this.h;
        int i10 = this.i;
        int i11 = this.j;
        List list2 = this.k;
        int i12 = this.l;
        int i13 = this.m;
        i6a i6aVar2 = this.n;
        this.e = null;
        this.f = 2;
        Object objG2 = dyg.g(dygVar2, bitmap2, i10, i11, list2, i12, i13, i8, i9, i6aVar2, this);
        return objG2 == hu4Var ? hu4Var : objG2;
    }
}
