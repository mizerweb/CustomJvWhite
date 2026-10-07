package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class srd extends a8j {
    public static final /* synthetic */ zv8[] q;
    public final long c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final pzf i;
    public final p3c j;
    public final pzf k;
    public final q8e l;
    public final ic6 m;
    public final AtomicLong n;
    public final mjg o;
    public up8 p;

    static {
        z8b z8bVar = new z8b(srd.class, "updateOptionsJob", "getUpdateOptionsJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        q = new zv8[]{z8bVar};
    }

    public srd(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = j;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var6;
        this.h = ny8Var5;
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.i = pzfVarB;
        nr2 nr2VarM0 = e9i.m0(new q0d(((yp0) ny8Var4.getValue()).b, this, 7), new jz(pzfVarB, 13));
        this.j = qyj.S();
        pzf pzfVarA = e9i.a(1, 1, 2);
        this.k = pzfVarA;
        this.l = new q8e(pzfVarA);
        this.m = new ic6(null);
        this.n = new AtomicLong(-9223372036854775807L);
        this.o = p90.a(new mrd(false, false, false, false, false));
        wo8 wo8VarA = vd7.a();
        wo8VarA.j0();
        this.p = wo8VarA;
        e9i.j0(e9i.T(new bye(new voc(new q0d(new jz(((xn3) ny8Var.getValue()).k(j), 13), this, 6), (lq4) null, this, 13)), ((n0c) ((xhh) ny8Var2.getValue())).a()), this.b);
        e9i.j0(e9i.T(new fz6(nr2VarM0, new l0d(this, (lq4) null, 19), 3), ((n0c) ((xhh) ny8Var2.getValue())).a()), this.b);
    }

    public static final Object B(srd srdVar, mrd mrdVar, nq4 nq4Var) {
        c79 c79VarW = yab.w();
        c79VarW.add(new kaf(new tnh(R.string.profile_edit_member_permissions_section_title), null, 14));
        c79VarW.add(new f8(R.id.profile_edit_member_permissions_change_photo, new ctf(R.id.profile_edit_member_permissions_change_photo, 0, new tnh(R.string.profile_edit_member_permissions_change_photo), null, null, null, aql.a(R.drawable.icon_magic_wand), new ksf(mrdVar.a, true), null, false, null, 1848), 536871936));
        long j = R.id.profile_edit_member_permissions_add_user;
        tnh tnhVar = new tnh(R.string.profile_edit_member_permissions_add_user);
        bz8 bz8VarA = aql.a(R.drawable.icon_user_add);
        boolean z = mrdVar.b;
        c79VarW.add(new f8(R.id.profile_edit_member_permissions_add_user, new ctf(j, 0, tnhVar, null, null, null, bz8VarA, new ksf(z, true), null, false, null, 1848), 1073742848));
        c79VarW.add(new f8(R.id.profile_edit_member_permissions_pin_message, new ctf(R.id.profile_edit_member_permissions_pin_message, 0, new tnh(R.string.profile_edit_member_permissions_pin_message), null, null, null, aql.a(R.drawable.icon_pin), new ksf(mrdVar.c, true), null, false, null, 1848), 1073742848));
        c79VarW.add(new f8(R.id.profile_edit_member_permissions_call_to_chat, new ctf(R.id.profile_edit_member_permissions_call_to_chat, 0, new tnh(R.string.profile_edit_member_permissions_call_to_chat), null, null, null, aql.a(R.drawable.icon_call), new ksf(mrdVar.d, true), null, false, null, 1848), 1073742848));
        c79VarW.add(new f8(R.id.profile_edit_member_permissions_see_private_link, new ctf(R.id.profile_edit_member_permissions_see_private_link, 0, new tnh(R.string.profile_edit_member_permissions_see_private_link), null, null, null, aql.a(R.drawable.icon_link), new ksf(mrdVar.e, z), null, false, null, 1848), 1073742848));
        Object obj = c79VarW.get(xw3.O0(c79VarW));
        f8 f8Var = obj instanceof f8 ? (f8) obj : null;
        if (f8Var != null) {
            c79VarW.set(xw3.O0(c79VarW), new f8(f8Var.a, f8Var.b, -2147482624));
        }
        Object objEmit = srdVar.k.emit(yab.j(c79VarW), nq4Var);
        return objEmit == hu4.a ? objEmit : sbi.a;
    }

    public static final mrd C(srd srdVar, rt2 rt2Var) {
        zw2 zw2Var = rt2Var.b.I;
        return new mrd(!zw2Var.b, !zw2Var.d, zw2Var.e, !zw2Var.f, zw2Var.i);
    }

    public final void D(HashMap map) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) ((xhh) this.e.getValue())).b(), 2, new l0d(this, map, null, 20));
        this.j.B(this, q[0], sggVarH0);
    }
}
