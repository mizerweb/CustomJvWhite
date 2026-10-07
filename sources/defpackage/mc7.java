package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mc7 implements lc7 {
    public final yt4 a;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public fb9 k;
    public zhe l;
    public jc7 b = jc7.d;
    public final String c = mc7.class.getName();
    public final ifh g = new ifh(new mp5(14, this));
    public final int h = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
    public final int i = gm0.K(146.0f * yl5.d().getDisplayMetrics().density);
    public final int[] j = new int[2];

    public mc7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, yt4 yt4Var) {
        this.a = yt4Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var;
    }

    @Override // defpackage.lc7
    public final boolean a() {
        zhe zheVar;
        fb9 fb9Var;
        rui ruiVar = this.b.a;
        if (ruiVar == null) {
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "You should call init before prepare!", null, null, 8);
                return false;
            }
        } else if (!ruiVar.b() ? !((zheVar = this.l) == null || !zheVar.a()) : !((fb9Var = this.k) == null || !fb9Var.a())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lc7
    public final Object b(long j, lq4 lq4Var) {
        rui ruiVar = this.b.a;
        if (ruiVar == null) {
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "You should call setVideoContent before extractFrame!", null, null, 8);
                return null;
            }
        } else if (ruiVar.b()) {
            fb9 fb9Var = this.k;
            if (fb9Var != null) {
                return fb9Var.b(j, lq4Var);
            }
        } else {
            zhe zheVar = this.l;
            if (zheVar != null) {
                return zheVar.b(j, lq4Var);
            }
        }
        return null;
    }

    @Override // defpackage.lc7
    public final void c(jc7 jc7Var) {
        rui ruiVar = jc7Var.a;
        if (jc7Var.equals(this.b) || ruiVar == null) {
            gm0.Y(mc7.class.getName(), "Early return in init cuz of extractorData == this.data || extractorData.videoContent == null");
            return;
        }
        int i = jc7Var.b;
        int i2 = jc7Var.c;
        if (i == 0 || i2 == 0) {
            int width = ruiVar.getWidth();
            int height = ruiVar.getHeight();
            int[] iArr = this.j;
            int i3 = this.h;
            if (width <= 0 || height <= 0) {
                iArr[0] = i3;
                iArr[1] = i3;
            } else if (width < height) {
                k4m.e(i3, i3, width, height, iArr);
            } else {
                int i4 = this.i;
                k4m.e(i4, i4, width, height, iArr);
            }
            this.b = new jc7(ruiVar, iArr[0], iArr[1]);
        } else {
            this.b = jc7Var;
        }
        if (ruiVar.b()) {
            if (this.k == null) {
                this.k = new fb9((xhh) this.e.getValue(), (dsc) this.d.getValue(), this.a);
            }
            fb9 fb9Var = this.k;
            if (fb9Var != null) {
                fb9Var.a = this.b;
                return;
            }
            return;
        }
        if (this.l == null) {
            this.l = new zhe((b78) this.g.getValue());
        }
        zhe zheVar = this.l;
        if (zheVar != null) {
            zheVar.c = this.b;
        }
    }

    @Override // defpackage.lc7
    public final jc7 getData() {
        return this.b;
    }

    @Override // defpackage.lc7
    public final void prepare() {
        rui ruiVar = this.b.a;
        if (ruiVar == null) {
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "You should call init before prepare!", null, null, 8);
                return;
            }
            return;
        }
        if (!a()) {
            gm0.Y(this.c, "Can't extract video frame");
            return;
        }
        if (ruiVar.b()) {
            fb9 fb9Var = this.k;
            if (fb9Var != null) {
                fb9Var.prepare();
                return;
            }
            return;
        }
        zhe zheVar = this.l;
        if (zheVar != null) {
            zheVar.prepare();
        }
    }
}
