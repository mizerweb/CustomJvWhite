package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class r6c extends lr3 implements eph {
    public static final /* synthetic */ zv8[] q = {new z8b(r6c.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Appearance;"), zo5.e(zfe.a, r6c.class, "size", "getSize()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Size;")};
    public kbc n;
    public final q6c o;
    public final q6c p;

    public r6c(Context context) {
        super(context);
        this.o = new q6c(this, 0);
        this.p = new q6c(this, 1);
        setIndeterminate(true);
        setTrackCornerRadius(gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
    }

    public static int e(k6c k6cVar, kbc kbcVar) {
        if (cqk.d(k6cVar, d6c.a)) {
            return kbcVar.getIcon().g;
        }
        if (cqk.d(k6cVar, e6c.a)) {
            kbcVar.getIcon();
            return -1;
        }
        if (cqk.d(k6cVar, f6c.a)) {
            return kbcVar.getIcon().j;
        }
        if (cqk.d(k6cVar, g6c.a)) {
            return kbcVar.getIcon().b;
        }
        if (cqk.d(k6cVar, h6c.a)) {
            return kbcVar.getIcon().f;
        }
        if (!cqk.d(k6cVar, j6c.a) && !cqk.d(k6cVar, i6c.a)) {
            ore.o();
            return 0;
        }
        return kbcVar.getIcon().h;
    }

    public final kbc getCurrentTheme() {
        kbc kbcVar = this.n;
        return kbcVar == null ? pq3.j.h(this) : kbcVar;
    }

    public final k6c getAppearance() {
        zv8 zv8Var = q[0];
        return (k6c) this.o.b;
    }

    public final kbc getCustomTheme() {
        return this.n;
    }

    public final p6c getSize() {
        zv8 zv8Var = q[1];
        return (p6c) this.p.b;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.n;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        setIndicatorColor(e(getAppearance(), kbcVar));
    }

    public final void setAppearance(k6c k6cVar) {
        this.o.B(this, q[0], k6cVar);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.n = kbcVar;
        onThemeChanged(getCurrentTheme());
    }

    public final void setSize(p6c p6cVar) {
        this.p.B(this, q[1], p6cVar);
    }
}
