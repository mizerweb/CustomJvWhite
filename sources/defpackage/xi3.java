package defpackage;

import java.util.Iterator;
import one.me.chats.search.ChatsListSearchScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xi3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xi3(yki ykiVar, boolean z, boolean z2) {
        this.d = ykiVar;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.d;
                boolean z2 = this.c;
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                if (z) {
                    chatsListSearchScreen.u1();
                }
                chatsListSearchScreen.v1(z2);
                break;
            default:
                yki ykiVar = (yki) this.d;
                boolean z3 = this.b;
                boolean z4 = this.c;
                ((sb9) ykiVar.a).n.log("OKRTCLmsAdapter", zo5.q("capture state changed, isCapturing=", ", isFailedStart=", z3, z4));
                kd2 kd2Var = ((sb9) ykiVar.a).r;
                if (kd2Var != null) {
                    if (z3) {
                        Iterator it = kd2Var.f.iterator();
                        while (it.hasNext()) {
                            ((sb9) it.next()).getClass();
                        }
                    } else if (!z4) {
                        kd2Var.b();
                    }
                }
                ufk ufkVar = ((sb9) ykiVar.a).x;
                if (ufkVar != null) {
                    ufkVar.a.n(oh1.g, Boolean.valueOf(z3));
                }
                sb9 sb9Var = (sb9) ykiVar.a;
                Iterator it2 = sb9Var.c.iterator();
                while (it2.hasNext()) {
                    ((tb9) it2.next()).b(sb9Var);
                }
                break;
        }
    }

    public /* synthetic */ xi3(boolean z, ChatsListSearchScreen chatsListSearchScreen, boolean z2) {
        this.b = z;
        this.d = chatsListSearchScreen;
        this.c = z2;
    }
}
