package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ro1 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ro1(gpi gpiVar, zyg zygVar, boolean z) {
        this.a = 2;
        this.b = gpiVar;
        this.d = zygVar;
        this.c = z;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        sbi sbiVar = sbi.a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                be1 be1Var = (be1) obj3;
                String str = (String) obj2;
                Intent intent = (Intent) obj;
                intent.setAction("action-accept-call");
                CharSequence charSequence = be1Var.c;
                String string = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    string = "";
                }
                intent.putExtra("incoming_param_name", string);
                String str2 = be1Var.e;
                intent.putExtra("incoming_param_avatar", str2 != null ? p2m.b(str2) : null);
                Long l = be1Var.a;
                intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0L);
                intent.putExtra("incoming_param_is_video", z);
                intent.putExtra("arg_call_session_id", str);
                break;
            case 1:
                so1.b((Intent) obj, (be1) obj3, z, (String) obj2);
                break;
            default:
                gpi gpiVar = (gpi) obj3;
                zyg zygVar = (zyg) obj2;
                if (j0m.a((j8c) obj)) {
                    yab.i0(gpiVar.k, ((n0c) gpiVar.f).a(), 0, new roi(gpiVar, zygVar, this.c, null, 1), 2);
                }
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ ro1(so1 so1Var, be1 be1Var, boolean z, String str, int i) {
        this.a = i;
        this.b = be1Var;
        this.c = z;
        this.d = str;
    }
}
