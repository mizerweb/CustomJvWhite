package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class j26 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ Bitmap f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ p26 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j26(Bitmap bitmap, int i, int i2, p26 p26Var, long j, int i3, int i4, float f, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = bitmap;
        this.g = i;
        this.h = i2;
        this.i = p26Var;
        this.j = j;
        this.k = i3;
        this.l = i4;
        this.m = f;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new j26(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((j26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        int i = this.e;
        sbi sbiVar = sbi.a;
        p26 p26Var = this.i;
        if (i == 0) {
            ch3.d0(obj);
            int i2 = this.h;
            int i3 = this.g;
            bitmap = this.f;
            if (bitmap != null && bitmap.getWidth() == i3 && bitmap.getHeight() == i2) {
                bitmap.eraseColor(0);
            } else {
                if (bitmap != null) {
                    rel.b(bitmap);
                }
                zv8[] zv8VarArr = p26.W1;
                xt4 xt4VarA = ((n0c) p26Var.H()).a();
                w93 w93Var = new w93(i3, i2, p26Var, (lq4) null);
                this.e = 1;
                obj = yab.K0(xt4VarA, w93Var, this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
            }
            if (this.j == p26Var.p1) {
                p26Var.n1.set(bitmap);
                a8j.x(p26Var.F1, new p06(bitmap, this.l, this.m));
                return sbiVar;
            }
            return sbiVar;
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        bitmap = (Bitmap) obj;
        if (bitmap != null) {
            if (this.j == p26Var.p1) {
                p26Var.n1.set(bitmap);
                a8j.x(p26Var.F1, new p06(bitmap, this.l, this.m));
                return sbiVar;
            }
        }
        return sbiVar;
    }
}
