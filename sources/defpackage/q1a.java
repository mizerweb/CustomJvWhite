package defpackage;

import android.os.Build;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class q1a extends a8j {
    public final ph7 c;
    public final jdf d;
    public final gi7 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final mjg m;
    public final r8e n;
    public final mjg o;
    public final r8e p;
    public final usc q;
    public final usc r;
    public sgg s;
    public final ic6 t;
    public final pzf u;
    public final r8e v;
    public final hz1 w;
    public final r07 x;

    public q1a(ph7 ph7Var, jdf jdfVar, gi7 gi7Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.c = ph7Var;
        this.d = jdfVar;
        this.e = gi7Var;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = ny8Var6;
        this.l = ny8Var7;
        mjg mjgVarA = p90.a(null);
        this.m = mjgVarA;
        this.n = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(null);
        this.o = mjgVarA2;
        this.p = new r8e(mjgVarA2);
        boolean z = ph7Var.j;
        if (z) {
            yab.i0(this.b, null, 0, new af8(this, null, 13), 3);
        }
        if (z) {
            yab.i0(this.b, ((n0c) ((xhh) ny8Var.getValue())).a(), 0, new qz9(this, (lq4) null, 1), 2);
        }
        String[] strArr = wsc.o;
        usc uscVar = new usc(strArr);
        this.q = uscVar;
        usc uscVar2 = new usc(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.r = uscVar2;
        this.t = new ic6(null);
        this.u = e9i.a(1, 1, 2);
        r8e r8eVarG0 = e9i.G0(new jz(new o24(new r07(new r07(uscVar, uscVar2, new vr9(3, null, 2), 0), jdfVar.h, new rx1(3, null, 2), 0), 14, this), 13), this.b, j0g.a, new fp4(new tnh(ph7Var.p ? R.string.media_picker_story_toolbar_title : ph7Var.n ? R.string.media_picker_default_toolbar_title_only_photo : R.string.media_picker_default_toolbar_title)));
        this.v = r8eVarG0;
        this.w = new hz1(r8eVarG0, 7);
        this.x = new r07(uscVar, uscVar2, new vr9(3, null, 3), 0);
    }
}
