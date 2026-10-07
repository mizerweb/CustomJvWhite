package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class sr8 extends a8j {
    public final long c;
    public final baa d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final mjg j;
    public final CopyOnWriteArraySet k;
    public sgg l;
    public sgg m;
    public final mjg n;
    public final r8e o;
    public final q8e p;
    public final xx6 q;
    public final ic6 r;

    public sr8(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = j;
        baa baaVarA = ((caa) ny8Var.getValue()).a(j, p63.JOIN_REQUEST, Integer.MAX_VALUE);
        this.d = baaVarA;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var6;
        this.j = p90.a(Boolean.FALSE);
        this.k = new CopyOnWriteArraySet();
        mjg mjgVarA = p90.a(new kr8(0, new tnh(R.string.join_requests_screen_title)));
        this.n = mjgVarA;
        this.o = new r8e(mjgVarA);
        q8e q8eVarE0 = e9i.E0(e9i.T(new jz(((xn3) ny8Var2.getValue()).k(j), 13), ((n0c) ((xhh) ny8Var3.getValue())).b()), this.b, j0g.a, 1);
        this.p = q8eVarE0;
        lq4 lq4Var = null;
        int i = 17;
        this.q = e9i.I(e9i.T(new r07(e9i.T(e9i.M0(new o24(baaVarA.b(), 10, this), new rgi(lq4Var, this, 4)), ((n0c) ((xhh) ny8Var3.getValue())).a()), baaVarA.c(), new d3(this, lq4Var, i), 0), ((n0c) ((xhh) ny8Var3.getValue())).a()));
        this.r = new ic6(null);
        int i2 = 3;
        e9i.j0(e9i.T(new fz6(baaVarA.c(), new el6(this, lq4Var, i), i2), ((n0c) ((xhh) ny8Var3.getValue())).b()), this.b);
        e9i.j0(new fz6(e9i.I(new ua1(q8eVarE0, i2)), new mr8(this, lq4Var, 1), i2), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object B(int i, Integer num, int i2, boolean z, nq4 nq4Var) {
        pr8 pr8Var;
        Integer num2;
        int i3;
        int i4;
        Object obj;
        boolean z2;
        if (nq4Var instanceof pr8) {
            pr8Var = (pr8) nq4Var;
            int i5 = pr8Var.j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pr8Var.j = i5 - Integer.MIN_VALUE;
            } else {
                pr8Var = new pr8(this, nq4Var);
            }
        } else {
            pr8Var = new pr8(this, nq4Var);
        }
        Object obj2 = pr8Var.h;
        int i6 = pr8Var.j;
        if (i6 == 0) {
            ch3.d0(obj2);
            num2 = num;
            pr8Var.f = num2;
            i3 = i;
            pr8Var.d = i3;
            i4 = i2;
            pr8Var.e = i4;
            pr8Var.g = z;
            pr8Var.j = 1;
            Object objP = e9i.P(this.p, pr8Var);
            hu4 hu4Var = hu4.a;
            if (objP == hu4Var) {
                return hu4Var;
            }
            obj = objP;
            z2 = z;
        } else {
            if (i6 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = pr8Var.g;
            int i7 = pr8Var.e;
            int i8 = pr8Var.d;
            Integer num3 = pr8Var.f;
            ch3.d0(obj2);
            obj = obj2;
            num2 = num3;
            i4 = i7;
            i3 = i8;
        }
        rt2 rt2Var = (rt2) obj;
        String strF = rt2Var != null ? rt2Var.F() : null;
        if (strF == null) {
            strF = "";
        }
        return new yq8(new tnh(i3), num2 != null ? new vnh(num2.intValue(), a.n1(Arrays.copyOf(new Object[]{strF}, 1))) : null, Collections.singletonList(new kc4(z2 ? R.id.profile_join_request_screen_reject_dialog_button : R.id.profile_join_request_screen_confirm_dialog_button, new tnh(i4), 3, true, 3, z2 ? 1 : 4)));
    }

    @Override // defpackage.a8j
    public final void y() {
        this.d.cancel();
    }
}
