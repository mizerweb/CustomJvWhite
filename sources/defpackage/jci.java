package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jci extends a8j {
    public final String c;
    public final long d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final sgg m;
    public final mjg n = p90.a(r66.a);
    public final mjg o;
    public final r8e p;
    public final ic6 q;

    public jci(String str, long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.c = str;
        this.d = j;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var5;
        this.i = ny8Var6;
        this.j = ny8Var7;
        this.k = ny8Var8;
        this.l = ny8Var9;
        mjg mjgVarA = p90.a(new ici(new tnh(R.string.unknown_call_botton_sheet_status_title), null, xw3.P0(((Number) ((f5d) ((wo6) ny8Var4.getValue())).a.A2.a(e5d.S6[182]).i()).longValue() == 1 ? new wbi(R.id.unknown_call_bottom_sheet_add_contact_button, new tnh(R.string.unknown_call_botton_sheet_add_contact_button)) : new wbi(R.id.unknown_call_bottom_sheet_ok_button, new tnh(R.string.unknown_call_botton_sheet_ok_button)), new wbi(R.id.unknown_call_bottom_sheet_block_button, new tnh(R.string.unknown_call_botton_sheet_block_button))), 1));
        this.o = mjgVarA;
        this.p = new r8e(mjgVarA);
        this.q = new ic6(null);
        sa2.i(B(), str);
        this.m = yab.i0(this.b, null, 0, new hci(this, (lq4) null, 0), 3);
    }

    public final sa2 B() {
        return (sa2) this.i.getValue();
    }
}
