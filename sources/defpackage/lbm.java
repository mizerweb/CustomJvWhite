package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class lbm implements tam {
    private xwd a;
    private final xwd b;
    private final vam c;

    public lbm(Context context, vam vamVar) {
        this.c = vamVar;
        g71 g71Var = g71.e;
        g4i.b(context);
        final e4i e4iVarC = g4i.a().c(g71Var);
        if (g71.d.contains(new z86("json"))) {
            this.a = new oy8(new xwd() { // from class: ibm
                @Override // defpackage.xwd
                public final Object get() {
                    return ((e4i) e4iVarC).a("FIREBASE_ML_SDK", new z86("json"), new f2i() { // from class: kbm
                        @Override // defpackage.f2i
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.b = new oy8(new xwd() { // from class: jbm
            @Override // defpackage.xwd
            public final Object get() {
                return ((e4i) e4iVarC).a("FIREBASE_ML_SDK", new z86("proto"), new f2i() { // from class: hbm
                    @Override // defpackage.f2i
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static fc6 b(vam vamVar, sam samVar) {
        int iA = vamVar.a();
        return samVar.zza() != 0 ? new jh0(samVar.a(iA, false), vhd.a, null) : new jh0(samVar.a(iA, false), vhd.b, null);
    }

    @Override // defpackage.tam
    public final void a(sam samVar) {
        if (this.c.a() != 0) {
            ((f4i) this.b.get()).a(b(this.c, samVar));
            return;
        }
        xwd xwdVar = this.a;
        if (xwdVar != null) {
            ((f4i) xwdVar.get()).a(b(this.c, samVar));
        }
    }
}
