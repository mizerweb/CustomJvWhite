package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.servernotifs.CommentNotifException;

/* JADX INFO: loaded from: classes3.dex */
public final class ejb {
    public final String a = ejb.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public ejb(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x010f A[LOOP:0: B:46:0x0109->B:48:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object a(hkb hkbVar, nq4 nq4Var) {
        djb djbVar;
        st2 st2Var;
        q24 q24Var;
        ArrayList arrayList;
        Iterator it;
        Object objC;
        hkb hkbVar2 = hkbVar;
        hu4 hu4Var = hu4.a;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof djb) {
            djbVar = (djb) nq4Var;
            int i = djbVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                djbVar.i = i - Integer.MIN_VALUE;
            } else {
                djbVar = new djb(this, nq4Var);
            }
        } else {
            djbVar = new djb(this, nq4Var);
        }
        Object objQ = djbVar.g;
        int i2 = djbVar.i;
        if (i2 == 0) {
            ch3.d0(objQ);
            boolean zBooleanValue = ((Boolean) ((e5d) this.e.getValue()).s5.a(e5d.S6[332]).i()).booleanValue();
            String str = this.a;
            if (zBooleanValue) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onNotifMsgDelete: " + hkbVar2, null);
                }
                if (hkbVar2.d == 0) {
                    gm0.V(this.a, "postId == 0", new CommentNotifException("postId == 0", null, 2, null));
                    return sbiVar;
                }
                st2Var = hkbVar2.c;
                xn3 xn3Var = (xn3) this.b.getValue();
                List listSingletonList = Collections.singletonList(st2Var);
                djbVar.d = hkbVar2;
                djbVar.e = st2Var;
                djbVar.i = 1;
                if (xn3Var.w(listSingletonList, djbVar) != hu4Var) {
                }
                return hu4Var;
            }
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str, "disabled in pms", null);
                return sbiVar;
            }
            return sbiVar;
        }
        if (i2 == 1) {
            st2 st2Var2 = djbVar.e;
            hkb hkbVar3 = djbVar.d;
            ch3.d0(objQ);
            st2Var = st2Var2;
            hkbVar2 = hkbVar3;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(objQ);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q24Var = djbVar.f;
            ch3.d0(objQ);
        }
        List list = (List) objQ;
        arrayList = new ArrayList(yw3.W0(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            c0a.t(((ky3) it.next()).a, arrayList);
        }
        nid nidVar = (nid) this.d.getValue();
        djbVar.d = null;
        djbVar.e = null;
        djbVar.f = null;
        djbVar.i = 3;
        objC = nidVar.c(q24Var, arrayList, true, djbVar);
        if (objC != hu4Var) {
            objC = sbiVar;
        }
        if (objC != hu4Var) {
            return hu4Var;
        }
        return sbiVar;
        q24 q24Var2 = new q24(st2Var.a, hkbVar2.d);
        l34 l34Var = (l34) this.c.getValue();
        long[] jArr = hkbVar2.e;
        djbVar.d = null;
        djbVar.e = null;
        djbVar.f = q24Var2;
        djbVar.i = 2;
        objQ = l34Var.q(q24Var2, jArr, djbVar);
        if (objQ != hu4Var) {
            q24Var = q24Var2;
            List list2 = (List) objQ;
            arrayList = new ArrayList(yw3.W0(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                c0a.t(((ky3) it.next()).a, arrayList);
            }
            nid nidVar2 = (nid) this.d.getValue();
            djbVar.d = null;
            djbVar.e = null;
            djbVar.f = null;
            djbVar.i = 3;
            objC = nidVar2.c(q24Var, arrayList, true, djbVar);
            if (objC != hu4Var) {
                objC = sbiVar;
            }
            if (objC != hu4Var) {
                return sbiVar;
            }
        }
        return hu4Var;
    }
}
