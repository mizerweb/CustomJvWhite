package defpackage;

import java.util.Collections;
import java.util.List;
import one.me.sdk.servernotifs.CommentNotifException;

/* JADX INFO: loaded from: classes3.dex */
public final class gjb {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final String d = gjb.class.getName();

    public gjb(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(jkb jkbVar, nq4 nq4Var) {
        fjb fjbVar;
        jkb jkbVar2;
        st2 st2Var;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof fjb) {
            fjbVar = (fjb) nq4Var;
            int i = fjbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                fjbVar.h = i - Integer.MIN_VALUE;
            } else {
                fjbVar = new fjb(this, nq4Var);
            }
        } else {
            fjbVar = new fjb(this, nq4Var);
        }
        fjb fjbVar2 = fjbVar;
        Object obj = fjbVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = fjbVar2.h;
        if (i2 == 0) {
            ch3.d0(obj);
            boolean zBooleanValue = ((Boolean) ((e5d) this.c.getValue()).t5.a(e5d.S6[333]).i()).booleanValue();
            String str = this.d;
            if (zBooleanValue) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onNotifMsgDeleteRange: " + jkbVar, null);
                }
                if (jkbVar.d == 0) {
                    gm0.V(this.d, "postId == 0", new CommentNotifException("postId == 0", null, 2, null));
                    return sbiVar;
                }
                st2 st2Var2 = jkbVar.c;
                xn3 xn3Var = (xn3) this.a.getValue();
                List listSingletonList = Collections.singletonList(st2Var2);
                fjbVar2.d = jkbVar;
                fjbVar2.e = st2Var2;
                fjbVar2.h = 1;
                if (xn3Var.w(listSingletonList, fjbVar2) != hu4Var) {
                    jkbVar2 = jkbVar;
                    st2Var = st2Var2;
                }
            }
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str, "disabled in pms", null);
                return sbiVar;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        st2Var = fjbVar2.e;
        jkbVar2 = fjbVar2.d;
        ch3.d0(obj);
        q24 q24Var = new q24(st2Var.a, jkbVar2.d);
        nid nidVar = (nid) this.b.getValue();
        long j = jkbVar2.e;
        long j2 = jkbVar2.f;
        fjbVar2.d = null;
        fjbVar2.e = null;
        fjbVar2.h = 2;
        return nidVar.a(q24Var, j, j2, fjbVar2) == hu4Var ? hu4Var : sbiVar;
    }
}
