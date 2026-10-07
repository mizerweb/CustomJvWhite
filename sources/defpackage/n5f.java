package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class n5f {
    public static final /* synthetic */ zv8[] k;
    public final g19 a;
    public final w5f b;
    public final RecyclerView c;
    public final MessagesLayoutManager d;
    public final hva e;
    public final fz7 f;
    public final fz7 g;
    public final String h = n5f.class.getName();
    public final l9b i = new l9b();
    public final p3c j = qyj.S();

    static {
        z8b z8bVar = new z8b(n5f.class, "handleStateJob", "getHandleStateJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public n5f(jsa jsaVar, oqa oqaVar, g19 g19Var, w5f w5fVar, k96 k96Var, MessagesLayoutManager messagesLayoutManager, hva hvaVar, fz7 fz7Var, fz7 fz7Var2) {
        this.a = g19Var;
        this.b = w5fVar;
        this.c = k96Var;
        this.d = messagesLayoutManager;
        this.e = hvaVar;
        this.f = fz7Var;
        this.g = fz7Var2;
        e9i.j0(new fz6(n1g.v(new r07(jsaVar.g0().t, oqaVar.d, k5f.h, 0), g19Var.f(), n09.e), new gce(this, (lq4) null, 8), 3), tre.d0(g19Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object a(n5f n5fVar, j6f j6fVar, boolean z, nq4 nq4Var) {
        l5f l5fVar;
        l9b l9bVar;
        w5f w5fVar;
        r5f r5fVar = r5f.c;
        r5f r5fVar2 = r5f.b;
        r5f r5fVar3 = r5f.a;
        if (nq4Var instanceof l5f) {
            l5fVar = (l5f) nq4Var;
            int i = l5fVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                l5fVar.i = i - Integer.MIN_VALUE;
            } else {
                l5fVar = new l5f(n5fVar, nq4Var);
            }
        } else {
            l5fVar = new l5f(n5fVar, nq4Var);
        }
        Object obj = l5fVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = l5fVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            l9bVar = n5fVar.i;
            l5fVar.d = j6fVar;
            l5fVar.e = l9bVar;
            l5fVar.f = z;
            l5fVar.i = 1;
            if (l9bVar.b(l5fVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = l5fVar.f;
            l9b l9bVar2 = l5fVar.e;
            j6f j6fVar2 = l5fVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            j6fVar = j6fVar2;
        }
        try {
            String str = n5fVar.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Got new scrollState=" + j6fVar + ", search:" + z, null);
                }
            }
            n5fVar.f.invoke(n5fVar.c);
            w5f w5fVar2 = n5fVar.b;
            if (w5fVar2 != null) {
                w5fVar2.d(r5fVar3).setCounter$message_list(j6fVar.a);
            }
            if (!j6fVar.b || z) {
                w5f w5fVar3 = n5fVar.b;
                if (w5fVar3 != null) {
                    w5fVar3.b(r5fVar3);
                }
            } else {
                w5f w5fVar4 = n5fVar.b;
                if (w5fVar4 != null) {
                    w5fVar4.c(r5fVar3);
                }
            }
            if (!j6fVar.c || z) {
                w5f w5fVar5 = n5fVar.b;
                if (w5fVar5 != null) {
                    w5fVar5.b(r5fVar2);
                }
            } else {
                w5f w5fVar6 = n5fVar.b;
                if (w5fVar6 != null) {
                    w5fVar6.c(r5fVar2);
                }
            }
            if (j6fVar.d == null) {
                w5f w5fVar7 = n5fVar.b;
                if (w5fVar7 != null) {
                    w5fVar7.b(r5fVar);
                }
            } else {
                n5fVar.g.invoke(n5fVar.c);
                if (!n5fVar.e.b(j6fVar.d.b) && !z && (w5fVar = n5fVar.b) != null) {
                    w5fVar.c(r5fVar);
                }
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }
}
