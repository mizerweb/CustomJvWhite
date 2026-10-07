package defpackage;

import android.graphics.Point;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qb9 implements ub9 {
    public final /* synthetic */ sb9 a;

    public /* synthetic */ qb9(sb9 sb9Var) {
        this.a = sb9Var;
    }

    @Override // defpackage.ub9
    public void a(int i, int i2) {
        b4f b4fVar = this.a.t;
        if (b4fVar != null) {
            Point pointA = uza.a(i, i2);
            b4fVar.a(pointA.x, pointA.y);
        }
    }
}
