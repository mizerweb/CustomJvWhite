package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class bhb extends rb5 {
    public final String t = bhb.class.getName();

    @Override // defpackage.rb5
    public final boolean i(lfe lfeVar) {
        if (lfeVar != null) {
            b(lfeVar);
            return false;
        }
        String str = this.t;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return false;
        }
        je9 je9Var = je9.d;
        if (!a4cVar.b(je9Var)) {
            return false;
        }
        a4cVar.c(je9Var, str, "animateAdd: unexpected nullability of holder", null);
        return false;
    }

    @Override // defpackage.rb5
    public final boolean j(lfe lfeVar, lfe lfeVar2, int i, int i2, int i3, int i4) {
        if ((lfeVar instanceof gm3) || (lfeVar2 instanceof gm3)) {
            b(lfeVar);
            b(lfeVar2);
            return false;
        }
        d(lfeVar);
        d(lfeVar2);
        float f = i3 - i;
        float f2 = i4 - i2;
        if (f == 0.0f && f2 == 0.0f) {
            b(lfeVar2);
            b(lfeVar);
            return false;
        }
        View view = lfeVar2.a;
        view.setTranslationX(-f);
        view.setTranslationY(-f2);
        view.animate().translationX(0.0f).translationY(0.0f).setDuration(this.f).setListener(new al(this, 2, lfeVar2)).start();
        b(lfeVar);
        return true;
    }

    @Override // defpackage.rb5
    public final boolean k(lfe lfeVar, int i, int i2, int i3, int i4) {
        if (lfeVar instanceof gm3) {
            return false;
        }
        return super.k(lfeVar, i, i2, i3, i4);
    }

    @Override // defpackage.rb5
    public final boolean l(lfe lfeVar) {
        if (lfeVar != null) {
            o(lfeVar);
            return false;
        }
        String str = this.t;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return false;
        }
        je9 je9Var = je9.d;
        if (!a4cVar.b(je9Var)) {
            return false;
        }
        a4cVar.c(je9Var, str, "animateRemove: unexpected nullability of holder", null);
        return false;
    }
}
